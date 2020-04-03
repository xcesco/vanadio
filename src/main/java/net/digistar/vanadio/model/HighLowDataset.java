//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;

import javax.xml.bind.annotation.*;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataset" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dateExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}openExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}closeExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}volumeExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}itemHyperlink" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dataset",
        "seriesExpression",
        "dateExpression",
        "highExpression",
        "lowExpression",
        "openExpression",
        "closeExpression",
        "volumeExpression",
        "itemHyperlink"
})
@XmlRootElement(name = "highLowDataset", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class HighLowDataset {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Dataset dataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SeriesExpression seriesExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DateExpression dateExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HighExpression highExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LowExpression lowExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected OpenExpression openExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CloseExpression closeExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected VolumeExpression volumeExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ItemHyperlink itemHyperlink;

    /**
     * Gets the value of the dataset property.
     *
     * @return possible object is
     * {@link Dataset }
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     *
     * @param value allowed object is
     *              {@link Dataset }
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the seriesExpression property.
     *
     * @return possible object is
     * {@link SeriesExpression }
     */
    public SeriesExpression getSeriesExpression() {
        return seriesExpression;
    }

    /**
     * Sets the value of the seriesExpression property.
     *
     * @param value allowed object is
     *              {@link SeriesExpression }
     */
    public void setSeriesExpression(SeriesExpression value) {
        this.seriesExpression = value;
    }

    /**
     * Gets the value of the dateExpression property.
     *
     * @return possible object is
     * {@link DateExpression }
     */
    public DateExpression getDateExpression() {
        return dateExpression;
    }

    /**
     * Sets the value of the dateExpression property.
     *
     * @param value allowed object is
     *              {@link DateExpression }
     */
    public void setDateExpression(DateExpression value) {
        this.dateExpression = value;
    }

    /**
     * Gets the value of the highExpression property.
     *
     * @return possible object is
     * {@link HighExpression }
     */
    public HighExpression getHighExpression() {
        return highExpression;
    }

    /**
     * Sets the value of the highExpression property.
     *
     * @param value allowed object is
     *              {@link HighExpression }
     */
    public void setHighExpression(HighExpression value) {
        this.highExpression = value;
    }

    /**
     * Gets the value of the lowExpression property.
     *
     * @return possible object is
     * {@link LowExpression }
     */
    public LowExpression getLowExpression() {
        return lowExpression;
    }

    /**
     * Sets the value of the lowExpression property.
     *
     * @param value allowed object is
     *              {@link LowExpression }
     */
    public void setLowExpression(LowExpression value) {
        this.lowExpression = value;
    }

    /**
     * Gets the value of the openExpression property.
     *
     * @return possible object is
     * {@link OpenExpression }
     */
    public OpenExpression getOpenExpression() {
        return openExpression;
    }

    /**
     * Sets the value of the openExpression property.
     *
     * @param value allowed object is
     *              {@link OpenExpression }
     */
    public void setOpenExpression(OpenExpression value) {
        this.openExpression = value;
    }

    /**
     * Gets the value of the closeExpression property.
     *
     * @return possible object is
     * {@link CloseExpression }
     */
    public CloseExpression getCloseExpression() {
        return closeExpression;
    }

    /**
     * Sets the value of the closeExpression property.
     *
     * @param value allowed object is
     *              {@link CloseExpression }
     */
    public void setCloseExpression(CloseExpression value) {
        this.closeExpression = value;
    }

    /**
     * Gets the value of the volumeExpression property.
     *
     * @return possible object is
     * {@link VolumeExpression }
     */
    public VolumeExpression getVolumeExpression() {
        return volumeExpression;
    }

    /**
     * Sets the value of the volumeExpression property.
     *
     * @param value allowed object is
     *              {@link VolumeExpression }
     */
    public void setVolumeExpression(VolumeExpression value) {
        this.volumeExpression = value;
    }

    /**
     * Gets the value of the itemHyperlink property.
     *
     * @return possible object is
     * {@link ItemHyperlink }
     */
    public ItemHyperlink getItemHyperlink() {
        return itemHyperlink;
    }

    /**
     * Sets the value of the itemHyperlink property.
     *
     * @param value allowed object is
     *              {@link ItemHyperlink }
     */
    public void setItemHyperlink(ItemHyperlink value) {
        this.itemHyperlink = value;
    }

}