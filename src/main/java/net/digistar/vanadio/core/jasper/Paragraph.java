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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}tabStop" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lineSpacing"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Single"/&gt;
 *             &lt;enumeration value="1_1_2"/&gt;
 *             &lt;enumeration value="Double"/&gt;
 *             &lt;enumeration value="AtLeast"/&gt;
 *             &lt;enumeration value="Fixed"/&gt;
 *             &lt;enumeration value="Proportional"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lineSpacingSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="firstLineIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="leftIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="rightIndent" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="spacingBefore" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="spacingAfter" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="tabStopWidth" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tabStop"
})
@XmlRootElement(name = "paragraph", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Paragraph {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<TabStop> tabStop;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "lineSpacingSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lineSpacingSize;
    @XmlAttribute(name = "firstLineIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String firstLineIndent;
    @XmlAttribute(name = "leftIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftIndent;
    @XmlAttribute(name = "rightIndent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightIndent;
    @XmlAttribute(name = "spacingBefore")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String spacingBefore;
    @XmlAttribute(name = "spacingAfter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String spacingAfter;
    @XmlAttribute(name = "tabStopWidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String tabStopWidth;

    /**
     * Gets the value of the tabStop property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabStop property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabStop().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabStop }
     */
    public List<TabStop> getTabStop() {
        if (tabStop == null) {
            tabStop = new ArrayList<TabStop>();
        }
        return this.tabStop;
    }

    /**
     * Recupera il valore della proprietà lineSpacing.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Imposta il valore della proprietà lineSpacing.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineSpacing(String value) {
        this.lineSpacing = value;
    }

    /**
     * Recupera il valore della proprietà lineSpacingSize.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineSpacingSize() {
        return lineSpacingSize;
    }

    /**
     * Imposta il valore della proprietà lineSpacingSize.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineSpacingSize(String value) {
        this.lineSpacingSize = value;
    }

    /**
     * Recupera il valore della proprietà firstLineIndent.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFirstLineIndent() {
        return firstLineIndent;
    }

    /**
     * Imposta il valore della proprietà firstLineIndent.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstLineIndent(String value) {
        this.firstLineIndent = value;
    }

    /**
     * Recupera il valore della proprietà leftIndent.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftIndent() {
        return leftIndent;
    }

    /**
     * Imposta il valore della proprietà leftIndent.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftIndent(String value) {
        this.leftIndent = value;
    }

    /**
     * Recupera il valore della proprietà rightIndent.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightIndent() {
        return rightIndent;
    }

    /**
     * Imposta il valore della proprietà rightIndent.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightIndent(String value) {
        this.rightIndent = value;
    }

    /**
     * Recupera il valore della proprietà spacingBefore.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpacingBefore() {
        return spacingBefore;
    }

    /**
     * Imposta il valore della proprietà spacingBefore.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpacingBefore(String value) {
        this.spacingBefore = value;
    }

    /**
     * Recupera il valore della proprietà spacingAfter.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSpacingAfter() {
        return spacingAfter;
    }

    /**
     * Imposta il valore della proprietà spacingAfter.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpacingAfter(String value) {
        this.spacingAfter = value;
    }

    /**
     * Recupera il valore della proprietà tabStopWidth.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTabStopWidth() {
        return tabStopWidth;
    }

    /**
     * Imposta il valore della proprietà tabStopWidth.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTabStopWidth(String value) {
        this.tabStopWidth = value;
    }

}
