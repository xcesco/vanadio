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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)

// @XmlRootElement(name = "bar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  Bar3DChart {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Chart chart;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public CategoryDataset categoryDataset;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Bar3DPlot bar3DPlot;

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
     * Gets the value of the categoryDataset property.
     *
     * @return possible object is
     * {@link CategoryDataset }
     */
    public CategoryDataset getCategoryDataset() {
        return categoryDataset;
    }

    /**
     * Sets the value of the categoryDataset property.
     *
     * @param value allowed object is
     *              {@link CategoryDataset }
     */
    public void setCategoryDataset(CategoryDataset value) {
        this.categoryDataset = value;
    }

    /**
     * Gets the value of the bar3DPlot property.
     *
     * @return possible object is
     * {@link Bar3DPlot }
     */
    public Bar3DPlot getBar3DPlot() {
        return bar3DPlot;
    }

    /**
     * Sets the value of the bar3DPlot property.
     *
     * @param value allowed object is
     *              {@link Bar3DPlot }
     */
    public void setBar3DPlot(Bar3DPlot value) {
        this.bar3DPlot = value;
    }

}
