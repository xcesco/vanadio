//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per anonymous complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}chart"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "chart",
        "xyDataset",
        "areaPlot"
})
@XmlRootElement(name = "xyAreaChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class XyAreaChart {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Chart chart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected XyDataset xyDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected AreaPlot areaPlot;

    /**
     * Recupera il valore della proprietà chart.
     *
     * @return possible object is
     * {@link Chart }
     */
    public Chart getChart() {
        return chart;
    }

    /**
     * Imposta il valore della proprietà chart.
     *
     * @param value allowed object is
     *              {@link Chart }
     */
    public void setChart(Chart value) {
        this.chart = value;
    }

    /**
     * Recupera il valore della proprietà xyDataset.
     *
     * @return possible object is
     * {@link XyDataset }
     */
    public XyDataset getXyDataset() {
        return xyDataset;
    }

    /**
     * Imposta il valore della proprietà xyDataset.
     *
     * @param value allowed object is
     *              {@link XyDataset }
     */
    public void setXyDataset(XyDataset value) {
        this.xyDataset = value;
    }

    /**
     * Recupera il valore della proprietà areaPlot.
     *
     * @return possible object is
     * {@link AreaPlot }
     */
    public AreaPlot getAreaPlot() {
        return areaPlot;
    }

    /**
     * Imposta il valore della proprietà areaPlot.
     *
     * @param value allowed object is
     *              {@link AreaPlot }
     */
    public void setAreaPlot(AreaPlot value) {
        this.areaPlot = value;
    }

}
