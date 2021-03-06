//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.08.04 at 02:05:46 PM CEST
//


package playground.gregor.grips.jaxb.inspire.network;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractMemberType;
import playground.gregor.grips.jaxb.inspire.commontransportelements.TransportLinkSetType;


/**
 * <p>Java class for LinkSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:x-inspire:specification:gmlas:Network:3.2}NetworkElementType">
 *       &lt;sequence>
 *         &lt;element name="link" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkSetType", propOrder = {
		"link"
})
@XmlSeeAlso({
	TransportLinkSetType.class
})
public abstract class LinkSetType
extends NetworkElementType
{

	@XmlElement(required = true)
	protected List<LinkSetType.Link> link;

	/**
	 * Gets the value of the link property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the link property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getLink().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LinkSetType.Link }
	 * 
	 * 
	 */
	public List<LinkSetType.Link> getLink() {
		if (this.link == null) {
			this.link = new ArrayList<LinkSetType.Link>();
		}
		return this.link;
	}

	public boolean isSetLink() {
		return ((this.link!= null)&&(!this.link.isEmpty()));
	}

	public void unsetLink() {
		this.link = null;
	}


	/**
	 * <p>Java class for anonymous complex type.
	 * 
	 * <p>The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMemberType">
	 *       &lt;sequence>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
	 *     &lt;/extension>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	public static class Link
	extends AbstractMemberType
	{

		@XmlAttribute
		protected List<String> nilReason;
		@XmlAttribute(namespace = "http://www.opengis.net/gml/3.2")
		@XmlSchemaType(name = "anyURI")
		protected String remoteSchema;
		/**
		 * 
		 * 
		 */
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		public final static String TYPE = "simple";
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		@XmlSchemaType(name = "anyURI")
		protected String href;
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		@XmlSchemaType(name = "anyURI")
		protected String role;
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		@XmlSchemaType(name = "anyURI")
		protected String arcrole;
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		protected String title;
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		protected String show;
		@XmlAttribute(namespace = "http://www.w3.org/1999/xlink")
		protected String actuate;

		/**
		 * Gets the value of the nilReason property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the nilReason property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getNilReason().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 * 
		 * 
		 */
		public List<String> getNilReason() {
			if (this.nilReason == null) {
				this.nilReason = new ArrayList<String>();
			}
			return this.nilReason;
		}

		public boolean isSetNilReason() {
			return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
		}

		public void unsetNilReason() {
			this.nilReason = null;
		}

		/**
		 * Gets the value of the remoteSchema property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getRemoteSchema() {
			return this.remoteSchema;
		}

		/**
		 * Sets the value of the remoteSchema property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setRemoteSchema(String value) {
			this.remoteSchema = value;
		}

		public boolean isSetRemoteSchema() {
			return (this.remoteSchema!= null);
		}

		/**
		 * Gets the value of the href property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getHref() {
			return this.href;
		}

		/**
		 * Sets the value of the href property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setHref(String value) {
			this.href = value;
		}

		public boolean isSetHref() {
			return (this.href!= null);
		}

		/**
		 * Gets the value of the role property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getRole() {
			return this.role;
		}

		/**
		 * Sets the value of the role property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setRole(String value) {
			this.role = value;
		}

		public boolean isSetRole() {
			return (this.role!= null);
		}

		/**
		 * Gets the value of the arcrole property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getArcrole() {
			return this.arcrole;
		}

		/**
		 * Sets the value of the arcrole property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setArcrole(String value) {
			this.arcrole = value;
		}

		public boolean isSetArcrole() {
			return (this.arcrole!= null);
		}

		/**
		 * Gets the value of the title property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getTitle() {
			return this.title;
		}

		/**
		 * Sets the value of the title property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setTitle(String value) {
			this.title = value;
		}

		public boolean isSetTitle() {
			return (this.title!= null);
		}

		/**
		 * Gets the value of the show property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getShow() {
			return this.show;
		}

		/**
		 * Sets the value of the show property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setShow(String value) {
			this.show = value;
		}

		public boolean isSetShow() {
			return (this.show!= null);
		}

		/**
		 * Gets the value of the actuate property.
		 * 
		 * @return
		 *     possible object is
		 *     {@link String }
		 * 
		 */
		public String getActuate() {
			return this.actuate;
		}

		/**
		 * Sets the value of the actuate property.
		 * 
		 * @param value
		 *     allowed object is
		 *     {@link String }
		 * 
		 */
		public void setActuate(String value) {
			this.actuate = value;
		}

		public boolean isSetActuate() {
			return (this.actuate!= null);
		}

		@Override
		public Object createNewInstance() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
