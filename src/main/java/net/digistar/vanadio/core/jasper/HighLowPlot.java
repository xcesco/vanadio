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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isShowCloseTicks"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isShowOpenTicks"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plot",
        "timeAxisLabelExpression",
        "timeAxisFormat",
        "valueAxisLabelExpression",
        "valueAxisFormat",
        "domainAxisMinValueExpression",
        "domainAxisMaxValueExpression",
        "rangeAxisMinValueExpression",
        "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "highLowPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class HighLowPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TimeAxisLabelExpression timeAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TimeAxisFormat timeAxisFormat;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueAxisLabelExpression valueAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueAxisFormat valueAxisFormat;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DomainAxisMinValueExpression domainAxisMinValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DomainAxisMaxValueExpression domainAxisMaxValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected RangeAxisMinValueExpression rangeAxisMinValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected RangeAxisMaxValueExpression rangeAxisMaxValueExpression;
    @XmlAttribute(name = "isShowCloseTicks")
    protected String isShowCloseTicks;
    @XmlAttribute(name = "isShowOpenTicks")
    protected String isShowOpenTicks;

    /**
     * Recupera il valore della proprietà plot.
     *
     * @return possible object is
     * {@link Plot }
     */
    public Plot getPlot() {
        return plot;
    }

    /**
     * Imposta il valore della proprietà plot.
     *
     * @param value allowed object is
     *              {@link Plot }
     */
    public void setPlot(Plot value) {
        this.plot = value;
    }

    /**
     * Recupera il valore della proprietà timeAxisLabelExpression.
     *
     * @return possible object is
     * {@link TimeAxisLabelExpression }
     */
    public TimeAxisLabelExpression getTimeAxisLabelExpression() {
        return timeAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà timeAxisLabelExpression.
     *
     * @param value allowed object is
     *              {@link TimeAxisLabelExpression }
     */
    public void setTimeAxisLabelExpression(TimeAxisLabelExpression value) {
        this.timeAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà timeAxisFormat.
     *
     * @return possible object is
     * {@link TimeAxisFormat }
     */
    public TimeAxisFormat getTimeAxisFormat() {
        return timeAxisFormat;
    }

    /**
     * Imposta il valore della proprietà timeAxisFormat.
     *
     * @param value allowed object is
     *              {@link TimeAxisFormat }
     */
    public void setTimeAxisFormat(TimeAxisFormat value) {
        this.timeAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà valueAxisLabelExpression.
     *
     * @return possible object is
     * {@link ValueAxisLabelExpression }
     */
    public ValueAxisLabelExpression getValueAxisLabelExpression() {
        return valueAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà valueAxisLabelExpression.
     *
     * @param value allowed object is
     *              {@link ValueAxisLabelExpression }
     */
    public void setValueAxisLabelExpression(ValueAxisLabelExpression value) {
        this.valueAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueAxisFormat.
     *
     * @return possible object is
     * {@link ValueAxisFormat }
     */
    public ValueAxisFormat getValueAxisFormat() {
        return valueAxisFormat;
    }

    /**
     * Imposta il valore della proprietà valueAxisFormat.
     *
     * @param value allowed object is
     *              {@link ValueAxisFormat }
     */
    public void setValueAxisFormat(ValueAxisFormat value) {
        this.valueAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà domainAxisMinValueExpression.
     *
     * @return possible object is
     * {@link DomainAxisMinValueExpression }
     */
    public DomainAxisMinValueExpression getDomainAxisMinValueExpression() {
        return domainAxisMinValueExpression;
    }

    /**
     * Imposta il valore della proprietà domainAxisMinValueExpression.
     *
     * @param value allowed object is
     *              {@link DomainAxisMinValueExpression }
     */
    public void setDomainAxisMinValueExpression(DomainAxisMinValueExpression value) {
        this.domainAxisMinValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà domainAxisMaxValueExpression.
     *
     * @return possible object is
     * {@link DomainAxisMaxValueExpression }
     */
    public DomainAxisMaxValueExpression getDomainAxisMaxValueExpression() {
        return domainAxisMaxValueExpression;
    }

    /**
     * Imposta il valore della proprietà domainAxisMaxValueExpression.
     *
     * @param value allowed object is
     *              {@link DomainAxisMaxValueExpression }
     */
    public void setDomainAxisMaxValueExpression(DomainAxisMaxValueExpression value) {
        this.domainAxisMaxValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà rangeAxisMinValueExpression.
     *
     * @return possible object is
     * {@link RangeAxisMinValueExpression }
     */
    public RangeAxisMinValueExpression getRangeAxisMinValueExpression() {
        return rangeAxisMinValueExpression;
    }

    /**
     * Imposta il valore della proprietà rangeAxisMinValueExpression.
     *
     * @param value allowed object is
     *              {@link RangeAxisMinValueExpression }
     */
    public void setRangeAxisMinValueExpression(RangeAxisMinValueExpression value) {
        this.rangeAxisMinValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà rangeAxisMaxValueExpression.
     *
     * @return possible object is
     * {@link RangeAxisMaxValueExpression }
     */
    public RangeAxisMaxValueExpression getRangeAxisMaxValueExpression() {
        return rangeAxisMaxValueExpression;
    }

    /**
     * Imposta il valore della proprietà rangeAxisMaxValueExpression.
     *
     * @param value allowed object is
     *              {@link RangeAxisMaxValueExpression }
     */
    public void setRangeAxisMaxValueExpression(RangeAxisMaxValueExpression value) {
        this.rangeAxisMaxValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà isShowCloseTicks.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowCloseTicks() {
        return isShowCloseTicks;
    }

    /**
     * Imposta il valore della proprietà isShowCloseTicks.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowCloseTicks(String value) {
        this.isShowCloseTicks = value;
    }

    /**
     * Recupera il valore della proprietà isShowOpenTicks.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowOpenTicks() {
        return isShowOpenTicks;
    }

    /**
     * Imposta il valore della proprietà isShowOpenTicks.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowOpenTicks(String value) {
        this.isShowOpenTicks = value;
    }

}
