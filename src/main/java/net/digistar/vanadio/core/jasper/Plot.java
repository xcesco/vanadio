//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.abubusoft.kripton.annotation.BindType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="orientation"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Horizontal"/&gt;
 *             &lt;enumeration value="Vertical"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="backgroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="foregroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="labelRotation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesColor"
})
@XmlRootElement(name = "plot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType public class Plot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<SeriesColor> seriesColor;

    public void setSeriesColor(List<SeriesColor> seriesColor) {
        this.seriesColor = seriesColor;
    }

    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "backgroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String backgroundAlpha;
    @XmlAttribute(name = "foregroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String foregroundAlpha;
    @XmlAttribute(name = "labelRotation")
    protected String labelRotation;

    /**
     * Gets the value of the seriesColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesColor }
     * 
     * 
     */
    public List<SeriesColor> getSeriesColor() {
        if (seriesColor == null) {
            seriesColor = new ArrayList<SeriesColor>();
        }
        return this.seriesColor;
    }

    /**
     * Gets the value of the backcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Sets the value of the backcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the backgroundAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Sets the value of the backgroundAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundAlpha(String value) {
        this.backgroundAlpha = value;
    }

    /**
     * Gets the value of the foregroundAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForegroundAlpha() {
        return foregroundAlpha;
    }

    /**
     * Sets the value of the foregroundAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForegroundAlpha(String value) {
        this.foregroundAlpha = value;
    }

    /**
     * Gets the value of the labelRotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelRotation() {
        return labelRotation;
    }

    /**
     * Sets the value of the labelRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelRotation(String value) {
        this.labelRotation = value;
    }

}
