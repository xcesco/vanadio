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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemLabel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isShowLabels"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isCircular"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="labelFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="legendLabelFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plot",
        "itemLabel"
})
@XmlRootElement(name = "piePlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class PiePlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ItemLabel itemLabel;
    @XmlAttribute(name = "isShowLabels")
    protected String isShowLabels;
    @XmlAttribute(name = "isCircular")
    protected String isCircular;
    @XmlAttribute(name = "labelFormat")
    protected String labelFormat;
    @XmlAttribute(name = "legendLabelFormat")
    protected String legendLabelFormat;

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
     * Recupera il valore della proprietà itemLabel.
     *
     * @return possible object is
     * {@link ItemLabel }
     */
    public ItemLabel getItemLabel() {
        return itemLabel;
    }

    /**
     * Imposta il valore della proprietà itemLabel.
     *
     * @param value allowed object is
     *              {@link ItemLabel }
     */
    public void setItemLabel(ItemLabel value) {
        this.itemLabel = value;
    }

    /**
     * Recupera il valore della proprietà isShowLabels.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowLabels() {
        return isShowLabels;
    }

    /**
     * Imposta il valore della proprietà isShowLabels.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowLabels(String value) {
        this.isShowLabels = value;
    }

    /**
     * Recupera il valore della proprietà isCircular.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsCircular() {
        return isCircular;
    }

    /**
     * Imposta il valore della proprietà isCircular.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsCircular(String value) {
        this.isCircular = value;
    }

    /**
     * Recupera il valore della proprietà labelFormat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabelFormat() {
        return labelFormat;
    }

    /**
     * Imposta il valore della proprietà labelFormat.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabelFormat(String value) {
        this.labelFormat = value;
    }

    /**
     * Recupera il valore della proprietà legendLabelFormat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLegendLabelFormat() {
        return legendLabelFormat;
    }

    /**
     * Imposta il valore della proprietà legendLabelFormat.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLegendLabelFormat(String value) {
        this.legendLabelFormat = value;
    }

}
