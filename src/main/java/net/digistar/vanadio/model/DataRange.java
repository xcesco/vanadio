//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowExpression"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highExpression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "lowExpression",
        "highExpression"
})
@XmlRootElement(name = "dataRange", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class DataRange {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected LowExpression lowExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected HighExpression highExpression;

    /**
     * Gets the value of the lowExpression property.
     *
     * @return possible object is
     * {@link LowExpression }
     */
    public LowExpression getLowExpression() {
        return lowExpression;
    }

    /**
     * Sets the value of the lowExpression property.
     *
     * @param value allowed object is
     *              {@link LowExpression }
     */
    public void setLowExpression(LowExpression value) {
        this.lowExpression = value;
    }

    /**
     * Gets the value of the highExpression property.
     *
     * @return possible object is
     * {@link HighExpression }
     */
    public HighExpression getHighExpression() {
        return highExpression;
    }

    /**
     * Sets the value of the highExpression property.
     *
     * @param value allowed object is
     *              {@link HighExpression }
     */
    public void setHighExpression(HighExpression value) {
        this.highExpression = value;
    }

}