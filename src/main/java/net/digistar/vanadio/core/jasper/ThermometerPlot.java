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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDisplay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}mediumRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="valueLocation" default="bulb"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="left"/&gt;
 *             &lt;enumeration value="right"/&gt;
 *             &lt;enumeration value="bulb"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isShowValueLines" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mercuryColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plot",
        "valueDisplay",
        "dataRange",
        "lowRange",
        "mediumRange",
        "highRange"
})
@XmlRootElement(name = "thermometerPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ThermometerPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueDisplay valueDisplay;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected DataRange dataRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected LowRange lowRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected MediumRange mediumRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HighRange highRange;
    @XmlAttribute(name = "valueLocation")
    protected String valueLocation;
    @XmlAttribute(name = "isShowValueLines")
    protected String isShowValueLines;
    @XmlAttribute(name = "mercuryColor")
    protected String mercuryColor;

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
     * Recupera il valore della proprietà valueDisplay.
     *
     * @return possible object is
     * {@link ValueDisplay }
     */
    public ValueDisplay getValueDisplay() {
        return valueDisplay;
    }

    /**
     * Imposta il valore della proprietà valueDisplay.
     *
     * @param value allowed object is
     *              {@link ValueDisplay }
     */
    public void setValueDisplay(ValueDisplay value) {
        this.valueDisplay = value;
    }

    /**
     * Recupera il valore della proprietà dataRange.
     *
     * @return possible object is
     * {@link DataRange }
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * Imposta il valore della proprietà dataRange.
     *
     * @param value allowed object is
     *              {@link DataRange }
     */
    public void setDataRange(DataRange value) {
        this.dataRange = value;
    }

    /**
     * Recupera il valore della proprietà lowRange.
     *
     * @return possible object is
     * {@link LowRange }
     */
    public LowRange getLowRange() {
        return lowRange;
    }

    /**
     * Imposta il valore della proprietà lowRange.
     *
     * @param value allowed object is
     *              {@link LowRange }
     */
    public void setLowRange(LowRange value) {
        this.lowRange = value;
    }

    /**
     * Recupera il valore della proprietà mediumRange.
     *
     * @return possible object is
     * {@link MediumRange }
     */
    public MediumRange getMediumRange() {
        return mediumRange;
    }

    /**
     * Imposta il valore della proprietà mediumRange.
     *
     * @param value allowed object is
     *              {@link MediumRange }
     */
    public void setMediumRange(MediumRange value) {
        this.mediumRange = value;
    }

    /**
     * Recupera il valore della proprietà highRange.
     *
     * @return possible object is
     * {@link HighRange }
     */
    public HighRange getHighRange() {
        return highRange;
    }

    /**
     * Imposta il valore della proprietà highRange.
     *
     * @param value allowed object is
     *              {@link HighRange }
     */
    public void setHighRange(HighRange value) {
        this.highRange = value;
    }

    /**
     * Recupera il valore della proprietà valueLocation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValueLocation() {
        if (valueLocation == null) {
            return "bulb";
        } else {
            return valueLocation;
        }
    }

    /**
     * Imposta il valore della proprietà valueLocation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValueLocation(String value) {
        this.valueLocation = value;
    }

    /**
     * Recupera il valore della proprietà isShowValueLines.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsShowValueLines() {
        if (isShowValueLines == null) {
            return "false";
        } else {
            return isShowValueLines;
        }
    }

    /**
     * Imposta il valore della proprietà isShowValueLines.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsShowValueLines(String value) {
        this.isShowValueLines = value;
    }

    /**
     * Recupera il valore della proprietà mercuryColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMercuryColor() {
        return mercuryColor;
    }

    /**
     * Imposta il valore della proprietà mercuryColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMercuryColor(String value) {
        this.mercuryColor = value;
    }

}
