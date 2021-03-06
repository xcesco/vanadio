//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;


import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subtitleExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)
//
// @XmlRootElement(name = "chartSubtitle", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  ChartSubtitle {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public Font font;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public SubtitleExpression subtitleExpression;
    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "color")
    public String color;

    /**
     * Gets the value of the font property.
     *
     * @return possible object is
     * {@link Font }
     */
    public Font getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     *
     * @param value allowed object is
     *              {@link Font }
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Gets the value of the subtitleExpression property.
     *
     * @return possible object is
     * {@link SubtitleExpression }
     */
    public SubtitleExpression getSubtitleExpression() {
        return subtitleExpression;
    }

    /**
     * Sets the value of the subtitleExpression property.
     *
     * @param value allowed object is
     *              {@link SubtitleExpression }
     */
    public void setSubtitleExpression(SubtitleExpression value) {
        this.subtitleExpression = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColor(String value) {
        this.color = value;
    }

}
