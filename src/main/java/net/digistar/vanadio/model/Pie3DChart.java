//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pie3DPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)

// @XmlRootElement(name = "pie3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  Pie3DChart {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Chart chart;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public PieDataset pieDataset;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Pie3DPlot pie3DPlot;

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
     * Gets the value of the pieDataset property.
     *
     * @return possible object is
     * {@link PieDataset }
     */
    public PieDataset getPieDataset() {
        return pieDataset;
    }

    /**
     * Sets the value of the pieDataset property.
     *
     * @param value allowed object is
     *              {@link PieDataset }
     */
    public void setPieDataset(PieDataset value) {
        this.pieDataset = value;
    }

    /**
     * Gets the value of the pie3DPlot property.
     *
     * @return possible object is
     * {@link Pie3DPlot }
     */
    public Pie3DPlot getPie3DPlot() {
        return pie3DPlot;
    }

    /**
     * Sets the value of the pie3DPlot property.
     *
     * @param value allowed object is
     *              {@link Pie3DPlot }
     */
    public void setPie3DPlot(Pie3DPlot value) {
        this.pie3DPlot = value;
    }

}
