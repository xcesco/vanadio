//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}seriesColor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="orientation"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Horizontal"/&gt;
 *             &lt;enumeration value="Vertical"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="backgroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="foregroundAlpha" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="labelRotation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "seriesColor"
})
@XmlRootElement(name = "plot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Plot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<SeriesColor> seriesColor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "orientation")
    protected String orientation;
    @XmlAttribute(name = "backgroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String backgroundAlpha;
    @XmlAttribute(name = "foregroundAlpha")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String foregroundAlpha;
    @XmlAttribute(name = "labelRotation")
    protected String labelRotation;

    /**
     * Gets the value of the seriesColor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesColor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesColor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesColor }
     */
    public List<SeriesColor> getSeriesColor() {
        if (seriesColor == null) {
            seriesColor = new ArrayList<SeriesColor>();
        }
        return this.seriesColor;
    }

    /**
     * Recupera il valore della proprietà backcolor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Imposta il valore della proprietà backcolor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Recupera il valore della proprietà orientation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Imposta il valore della proprietà orientation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Recupera il valore della proprietà backgroundAlpha.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Imposta il valore della proprietà backgroundAlpha.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBackgroundAlpha(String value) {
        this.backgroundAlpha = value;
    }

    /**
     * Recupera il valore della proprietà foregroundAlpha.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForegroundAlpha() {
        return foregroundAlpha;
    }

    /**
     * Imposta il valore della proprietà foregroundAlpha.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForegroundAlpha(String value) {
        this.foregroundAlpha = value;
    }

    /**
     * Recupera il valore della proprietà labelRotation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabelRotation() {
        return labelRotation;
    }

    /**
     * Imposta il valore della proprietà labelRotation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabelRotation(String value) {
        this.labelRotation = value;
    }

}
