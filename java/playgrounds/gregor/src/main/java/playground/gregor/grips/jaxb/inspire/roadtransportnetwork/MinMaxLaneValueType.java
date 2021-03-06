//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.04 at 02:05:46 PM CEST 
//


package playground.gregor.grips.jaxb.inspire.roadtransportnetwork;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinMaxLaneValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinMaxLaneValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="maximum"/>
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="average"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinMaxLaneValueType")
@XmlEnum
public enum MinMaxLaneValueType {


    /**
     * -- Definition --
     * 						The number of lanes is the maximum value for a given part of the road network.
     * 						
     * 						-- Description --
     * 						SOURCE Adapted from [Euroroads].
     * 					
     * 
     */
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),

    /**
     * -- Definition --
     * 						The number of lanes is the minimum value for a given part of the road network.
     * 						
     * 						-- Description --
     * 						SOURCE [Euroroads].
     * 					
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * -- Definition --
     * 						The number of lanes is the average value for a given part of the road network.
     * 						
     * 						-- Description --
     * 						SOURCE [Euroroads].
     * 					
     * 
     */
    @XmlEnumValue("average")
    AVERAGE("average");
    private final String value;

    MinMaxLaneValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MinMaxLaneValueType fromValue(String v) {
        for (MinMaxLaneValueType c: MinMaxLaneValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
