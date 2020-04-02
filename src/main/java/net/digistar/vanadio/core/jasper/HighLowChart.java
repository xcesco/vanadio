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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "chart",
        "highLowDataset",
        "highLowPlot"
})
@XmlRootElement(name = "highLowChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class HighLowChart {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Chart chart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected HighLowDataset highLowDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected HighLowPlot highLowPlot;

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
     * Recupera il valore della proprietà highLowDataset.
     *
     * @return possible object is
     * {@link HighLowDataset }
     */
    public HighLowDataset getHighLowDataset() {
        return highLowDataset;
    }

    /**
     * Imposta il valore della proprietà highLowDataset.
     *
     * @param value allowed object is
     *              {@link HighLowDataset }
     */
    public void setHighLowDataset(HighLowDataset value) {
        this.highLowDataset = value;
    }

    /**
     * Recupera il valore della proprietà highLowPlot.
     *
     * @return possible object is
     * {@link HighLowPlot }
     */
    public HighLowPlot getHighLowPlot() {
        return highLowPlot;
    }

    /**
     * Imposta il valore della proprietà highLowPlot.
     *
     * @param value allowed object is
     *              {@link HighLowPlot }
     */
    public void setHighLowPlot(HighLowPlot value) {
        this.highLowPlot = value;
    }

}
