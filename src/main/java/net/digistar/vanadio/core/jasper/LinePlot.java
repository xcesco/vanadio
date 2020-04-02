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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}categoryAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}domainAxisMaxValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMinValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rangeAxisMaxValueExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isShowLines"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isShowShapes"&gt;
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
        "categoryAxisLabelExpression",
        "categoryAxisFormat",
        "valueAxisLabelExpression",
        "valueAxisFormat",
        "domainAxisMinValueExpression",
        "domainAxisMaxValueExpression",
        "rangeAxisMinValueExpression",
        "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "linePlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class LinePlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CategoryAxisLabelExpression categoryAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CategoryAxisFormat categoryAxisFormat;
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
    @XmlAttribute(name = "isShowLines")
    protected String isShowLines;
    @XmlAttribute(name = "isShowShapes")
    protected String isShowShapes;

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
     * Recupera il valore della proprietà categoryAxisLabelExpression.
     *
     * @return possible object is
     * {@link CategoryAxisLabelExpression }
     */
    public CategoryAxisLabelExpression getCategoryAxisLabelExpression() {
        return categoryAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà categoryAxisLabelExpression.
     *
     * @param value allowed object is
     *              {@link CategoryAxisLabelExpression }
     */
    public void setCategoryAxisLabelExpression(CategoryAxisLabelExpression value) {
        this.categoryAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà categoryAxisFormat.
     *
     * @return possible object is
     * {@link CategoryAxisFormat }
     */
    public CategoryAxisFormat getCategoryAxisFormat() {
        return categoryAxisFormat;
    }

    /**
     * Imposta il valore della proprietà categoryAxisFormat.
     *
     * @param value allowed object is
     *              {@link CategoryAxisFormat }
     */
    public void setCategoryAxisFormat(CategoryAxisFormat value) {
        this.categoryAxisFormat = value;
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
     * Recupera il valore della proprietà isShowLines.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowLines() {
        return isShowLines;
    }

    /**
     * Imposta il valore della proprietà isShowLines.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowLines(String value) {
        this.isShowLines = value;
    }

    /**
     * Recupera il valore della proprietà isShowShapes.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowShapes() {
        return isShowShapes;
    }

    /**
     * Imposta il valore della proprietà isShowShapes.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowShapes(String value) {
        this.isShowShapes = value;
    }

}
