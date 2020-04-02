//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}plot"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}tickLabelFont" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueDisplay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}meterInterval" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="shape"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="chord"/&gt;
 *             &lt;enumeration value="circle"/&gt;
 *             &lt;enumeration value="pie"/&gt;
 *             &lt;enumeration value="dial"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="angle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="units" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tickInterval" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="meterColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="needleColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tickColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tickCount" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plot",
        "tickLabelFont",
        "valueDisplay",
        "dataRange",
        "meterInterval"
})
@XmlRootElement(name = "meterPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class MeterPlot {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected Plot plot;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TickLabelFont tickLabelFont;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ValueDisplay valueDisplay;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected DataRange dataRange;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<MeterInterval> meterInterval;
    @XmlAttribute(name = "shape")
    protected String shape;
    @XmlAttribute(name = "angle")
    protected String angle;
    @XmlAttribute(name = "units")
    protected String units;
    @XmlAttribute(name = "tickInterval")
    protected String tickInterval;
    @XmlAttribute(name = "meterColor")
    protected String meterColor;
    @XmlAttribute(name = "needleColor")
    protected String needleColor;
    @XmlAttribute(name = "tickColor")
    protected String tickColor;
    @XmlAttribute(name = "tickCount")
    protected String tickCount;

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
     * Recupera il valore della proprietà tickLabelFont.
     *
     * @return possible object is
     * {@link TickLabelFont }
     */
    public TickLabelFont getTickLabelFont() {
        return tickLabelFont;
    }

    /**
     * Imposta il valore della proprietà tickLabelFont.
     *
     * @param value allowed object is
     *              {@link TickLabelFont }
     */
    public void setTickLabelFont(TickLabelFont value) {
        this.tickLabelFont = value;
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
     * Gets the value of the meterInterval property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterInterval property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterInterval().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterInterval }
     */
    public List<MeterInterval> getMeterInterval() {
        if (meterInterval == null) {
            meterInterval = new ArrayList<MeterInterval>();
        }
        return this.meterInterval;
    }

    /**
     * Recupera il valore della proprietà shape.
     *
     * @return possible object is
     * {@link String }
     */
    public String getShape() {
        return shape;
    }

    /**
     * Imposta il valore della proprietà shape.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Recupera il valore della proprietà angle.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAngle() {
        return angle;
    }

    /**
     * Imposta il valore della proprietà angle.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAngle(String value) {
        this.angle = value;
    }

    /**
     * Recupera il valore della proprietà units.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnits() {
        return units;
    }

    /**
     * Imposta il valore della proprietà units.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Recupera il valore della proprietà tickInterval.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTickInterval() {
        return tickInterval;
    }

    /**
     * Imposta il valore della proprietà tickInterval.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTickInterval(String value) {
        this.tickInterval = value;
    }

    /**
     * Recupera il valore della proprietà meterColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMeterColor() {
        return meterColor;
    }

    /**
     * Imposta il valore della proprietà meterColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMeterColor(String value) {
        this.meterColor = value;
    }

    /**
     * Recupera il valore della proprietà needleColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNeedleColor() {
        return needleColor;
    }

    /**
     * Imposta il valore della proprietà needleColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNeedleColor(String value) {
        this.needleColor = value;
    }

    /**
     * Recupera il valore della proprietà tickColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTickColor() {
        return tickColor;
    }

    /**
     * Imposta il valore della proprietà tickColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTickColor(String value) {
        this.tickColor = value;
    }

    /**
     * Recupera il valore della proprietà tickCount.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTickCount() {
        return tickCount;
    }

    /**
     * Imposta il valore della proprietà tickCount.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTickCount(String value) {
        this.tickCount = value;
    }

}
