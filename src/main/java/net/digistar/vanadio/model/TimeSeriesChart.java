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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)

// @XmlRootElement(name = "timeSeriesChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  TimeSeriesChart {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public Chart chart;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public TimeSeriesDataset timeSeriesDataset;
    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public TimeSeriesPlot timeSeriesPlot;

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
     * Gets the value of the timeSeriesDataset property.
     *
     * @return possible object is
     * {@link TimeSeriesDataset }
     */
    public TimeSeriesDataset getTimeSeriesDataset() {
        return timeSeriesDataset;
    }

    /**
     * Sets the value of the timeSeriesDataset property.
     *
     * @param value allowed object is
     *              {@link TimeSeriesDataset }
     */
    public void setTimeSeriesDataset(TimeSeriesDataset value) {
        this.timeSeriesDataset = value;
    }

    /**
     * Gets the value of the timeSeriesPlot property.
     *
     * @return possible object is
     * {@link TimeSeriesPlot }
     */
    public TimeSeriesPlot getTimeSeriesPlot() {
        return timeSeriesPlot;
    }

    /**
     * Sets the value of the timeSeriesPlot property.
     *
     * @param value allowed object is
     *              {@link TimeSeriesPlot }
     */
    public void setTimeSeriesPlot(TimeSeriesPlot value) {
        this.timeSeriesPlot = value;
    }

}
