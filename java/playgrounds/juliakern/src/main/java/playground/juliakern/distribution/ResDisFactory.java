/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2014 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package playground.juliakern.distribution;

import org.matsim.contrib.emissions.EmissionModule;
import org.matsim.core.config.groups.PlanCalcScoreConfigGroup;
import org.matsim.core.router.costcalculators.TravelDisutilityFactory;
import org.matsim.core.router.costcalculators.TravelTimeAndDistanceBasedTravelDisutilityFactory;
import org.matsim.core.router.util.TravelDisutility;
import org.matsim.core.router.util.TravelTime;

import playground.benjamin.internalization.EmissionCostModule;
import playground.juliakern.distribution.withScoring.EmissionControlerListener;
import playground.juliakern.distribution.withScoring.ResDisCalculator;



public class ResDisFactory implements TravelDisutilityFactory {
	
	private TravelDisutilityFactory tdf;
	private EmissionControlerListener ecl;
	private EmissionModule emissionModule;
	private EmissionCostModule emissionCostModule;

	
	public ResDisFactory(EmissionControlerListener ecl, EmissionModule emissionModule, EmissionCostModule emissionCostModule){
		this.tdf  = new TravelTimeAndDistanceBasedTravelDisutilityFactory();
		this.ecl = ecl;
		this.emissionModule = emissionModule;
		this.emissionCostModule = emissionCostModule;
	
	}
	
	@Override
	public TravelDisutility createTravelDisutility( TravelTime timeCalculator,	 PlanCalcScoreConfigGroup cnScoringGroup) {
		double marginalutilityOfMoney = cnScoringGroup.getMarginalUtilityOfMoney();
		final ResDisCalculator resdiscal = new ResDisCalculator(tdf.createTravelDisutility(timeCalculator, cnScoringGroup), ecl, marginalutilityOfMoney, this.emissionModule, this.emissionCostModule);
		
		return resdiscal;

	}

}
