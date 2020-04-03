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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyzDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubblePlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "chart",
        "xyzDataset",
        "bubblePlot"
})
@XmlRootElement(name = "bubbleChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class BubbleChart {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Chart chart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected XyzDataset xyzDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected BubblePlot bubblePlot;

    /**
     * Gets the value of the chart property.
     *
     * @return possible object is
     * {@link Chart }
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     *
     * @param value allowed object is
     *              {@link Chart }
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Gets the value of the xyzDataset property.
     *
     * @return possible object is
     * {@link XyzDataset }
     */
    public XyzDataset getXyzDataset() {
        return xyzDataset;
    }

    /**
     * Sets the value of the xyzDataset property.
     *
     * @param value allowed object is
     *              {@link XyzDataset }
     */
    public void setXyzDataset(XyzDataset value) {
        this.xyzDataset = value;
    }

    /**
     * Gets the value of the bubblePlot property.
     *
     * @return possible object is
     * {@link BubblePlot }
     */
    public BubblePlot getBubblePlot() {
        return bubblePlot;
    }

    /**
     * Sets the value of the bubblePlot property.
     *
     * @param value allowed object is
     *              {@link BubblePlot }
     */
    public void setBubblePlot(BubblePlot value) {
        this.bubblePlot = value;
    }

}