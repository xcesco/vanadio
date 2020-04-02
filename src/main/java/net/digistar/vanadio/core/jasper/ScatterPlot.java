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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xAxisFormat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisLabelExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yAxisFormat" minOccurs="0"/&gt;
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
        "xAxisLabelExpression",
        "xAxisFormat",
        "yAxisLabelExpression",
        "yAxisFormat",
        "domainAxisMinValueExpression",
        "domainAxisMaxValueExpression",
        "rangeAxisMinValueExpression",
        "rangeAxisMaxValueExpression"
})
@XmlRootElement(name = "scatterPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ScatterPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XAxisLabelExpression xAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XAxisFormat xAxisFormat;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected YAxisLabelExpression yAxisLabelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected YAxisFormat yAxisFormat;
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
     * Recupera il valore della proprietà xAxisLabelExpression.
     *
     * @return possible object is
     * {@link XAxisLabelExpression }
     */
    public XAxisLabelExpression getXAxisLabelExpression() {
        return xAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà xAxisLabelExpression.
     *
     * @param value allowed object is
     *              {@link XAxisLabelExpression }
     */
    public void setXAxisLabelExpression(XAxisLabelExpression value) {
        this.xAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà xAxisFormat.
     *
     * @return possible object is
     * {@link XAxisFormat }
     */
    public XAxisFormat getXAxisFormat() {
        return xAxisFormat;
    }

    /**
     * Imposta il valore della proprietà xAxisFormat.
     *
     * @param value allowed object is
     *              {@link XAxisFormat }
     */
    public void setXAxisFormat(XAxisFormat value) {
        this.xAxisFormat = value;
    }

    /**
     * Recupera il valore della proprietà yAxisLabelExpression.
     *
     * @return possible object is
     * {@link YAxisLabelExpression }
     */
    public YAxisLabelExpression getYAxisLabelExpression() {
        return yAxisLabelExpression;
    }

    /**
     * Imposta il valore della proprietà yAxisLabelExpression.
     *
     * @param value allowed object is
     *              {@link YAxisLabelExpression }
     */
    public void setYAxisLabelExpression(YAxisLabelExpression value) {
        this.yAxisLabelExpression = value;
    }

    /**
     * Recupera il valore della proprietà yAxisFormat.
     *
     * @return possible object is
     * {@link YAxisFormat }
     */
    public YAxisFormat getYAxisFormat() {
        return yAxisFormat;
    }

    /**
     * Imposta il valore della proprietà yAxisFormat.
     *
     * @param value allowed object is
     *              {@link YAxisFormat }
     */
    public void setYAxisFormat(YAxisFormat value) {
        this.yAxisFormat = value;
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
