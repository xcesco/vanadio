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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}yValueExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}zValueExpression" minOccurs="0"/&gt;
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
        "xValueExpression",
        "yValueExpression",
        "zValueExpression",
        "itemHyperlink"
})
@XmlRootElement(name = "xyzSeries", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class XyzSeries {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SeriesExpression seriesExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected XValueExpression xValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected YValueExpression yValueExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ZValueExpression zValueExpression;
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
     * Recupera il valore della proprietà xValueExpression.
     *
     * @return possible object is
     * {@link XValueExpression }
     */
    public XValueExpression getXValueExpression() {
        return xValueExpression;
    }

    /**
     * Imposta il valore della proprietà xValueExpression.
     *
     * @param value allowed object is
     *              {@link XValueExpression }
     */
    public void setXValueExpression(XValueExpression value) {
        this.xValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà yValueExpression.
     *
     * @return possible object is
     * {@link YValueExpression }
     */
    public YValueExpression getYValueExpression() {
        return yValueExpression;
    }

    /**
     * Imposta il valore della proprietà yValueExpression.
     *
     * @param value allowed object is
     *              {@link YValueExpression }
     */
    public void setYValueExpression(YValueExpression value) {
        this.yValueExpression = value;
    }

    /**
     * Recupera il valore della proprietà zValueExpression.
     *
     * @return possible object is
     * {@link ZValueExpression }
     */
    public ZValueExpression getZValueExpression() {
        return zValueExpression;
    }

    /**
     * Imposta il valore della proprietà zValueExpression.
     *
     * @param value allowed object is
     *              {@link ZValueExpression }
     */
    public void setZValueExpression(ZValueExpression value) {
        this.zValueExpression = value;
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
