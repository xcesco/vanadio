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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timePeriodExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "seriesExpression",
        "timePeriodExpression",
        "valueExpression",
        "labelExpression",
        "itemHyperlink"
})
@XmlRootElement(name = "timeSeries", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class TimeSeries {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SeriesExpression seriesExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TimePeriodExpression timePeriodExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueExpression valueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LabelExpression labelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ItemHyperlink itemHyperlink;

    /**
     * Recupera il valore della proprietà seriesExpression.
     *
     * @return possible object is
     * {@link SeriesExpression }
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Imposta il valore della proprietà seriesExpression.
     *
     * @param value allowed object is
     *              {@link SeriesExpression }
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Recupera il valore della proprietà timePeriodExpression.
     *
     * @return possible object is
     * {@link TimePeriodExpression }
     */
    public TimePeriodExpression getTimePeriodExpression() {
        return timePeriodExpression;
    }

    /**
     * Imposta il valore della proprietà timePeriodExpression.
     *
     * @param value allowed object is
     *              {@link TimePeriodExpression }
     */
    public void setTimePeriodExpression(TimePeriodExpression value) {
        this.timePeriodExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueExpression.
     *
     * @return possible object is
     * {@link ValueExpression }
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Imposta il valore della proprietà valueExpression.
     *
     * @param value allowed object is
     *              {@link ValueExpression }
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Recupera il valore della proprietà labelExpression.
     *
     * @return possible object is
     * {@link LabelExpression }
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     *
     * @param value allowed object is
     *              {@link LabelExpression }
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà itemHyperlink.
     *
     * @return possible object is
     * {@link ItemHyperlink }
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Imposta il valore della proprietà itemHyperlink.
     *
     * @param value allowed object is
     *              {@link ItemHyperlink }
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

}
