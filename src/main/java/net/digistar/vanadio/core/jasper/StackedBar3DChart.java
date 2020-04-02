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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DPlot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "chart",
        "categoryDataset",
        "bar3DPlot"
})
@XmlRootElement(name = "stackedBar3DChart", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class StackedBar3DChart {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Chart chart;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected CategoryDataset categoryDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Bar3DPlot bar3DPlot;

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
     * Recupera il valore della proprietà categoryDataset.
     *
     * @return possible object is
     * {@link CategoryDataset }
     */
    public CategoryDataset getCategoryDataset() {
        return categoryDataset;
    }

    /**
     * Imposta il valore della proprietà categoryDataset.
     *
     * @param value allowed object is
     *              {@link CategoryDataset }
     */
    public void setCategoryDataset(CategoryDataset value) {
        this.categoryDataset = value;
    }

    /**
     * Recupera il valore della proprietà bar3DPlot.
     *
     * @return possible object is
     * {@link Bar3DPlot }
     */
    public Bar3DPlot getBar3DPlot() {
        return bar3DPlot;
    }

    /**
     * Imposta il valore della proprietà bar3DPlot.
     *
     * @param value allowed object is
     *              {@link Bar3DPlot }
     */
    public void setBar3DPlot(Bar3DPlot value) {
        this.bar3DPlot = value;
    }

}
