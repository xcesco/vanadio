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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}paragraph" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="textAlignment"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Justified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="verticalAlignment"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Middle"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *             &lt;enumeration value="Justified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rotation"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="UpsideDown"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lineSpacing"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Single"/&gt;
 *             &lt;enumeration value="1_1_2"/&gt;
 *             &lt;enumeration value="Double"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isStyledText"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="markup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "font",
        "paragraph"
})
@XmlRootElement(name = "textElement", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class TextElement {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Font font;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Paragraph paragraph;
    @XmlAttribute(name = "textAlignment")
    protected String textAlignment;
    @XmlAttribute(name = "verticalAlignment")
    protected String verticalAlignment;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "isStyledText")
    protected String isStyledText;
    @XmlAttribute(name = "markup")
    protected String markup;

    /**
     * Recupera il valore della proprietà font.
     *
     * @return possible object is
     * {@link Font }
     */
    public Font getFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     *
     * @param value allowed object is
     *              {@link Font }
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà paragraph.
     *
     * @return possible object is
     * {@link Paragraph }
     */
    public Paragraph getParagraph() {
        return paragraph;
    }

    /**
     * Imposta il valore della proprietà paragraph.
     *
     * @param value allowed object is
     *              {@link Paragraph }
     */
    public void setParagraph(Paragraph value) {
        this.paragraph = value;
    }

    /**
     * Recupera il valore della proprietà textAlignment.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTextAlignment() {
        return textAlignment;
    }

    /**
     * Imposta il valore della proprietà textAlignment.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTextAlignment(String value) {
        this.textAlignment = value;
    }

    /**
     * Recupera il valore della proprietà verticalAlignment.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Imposta il valore della proprietà verticalAlignment.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVerticalAlignment(String value) {
        this.verticalAlignment = value;
    }

    /**
     * Recupera il valore della proprietà rotation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRotation() {
        return rotation;
    }

    /**
     * Imposta il valore della proprietà rotation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRotation(String value) {
        this.rotation = value;
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
     * Recupera il valore della proprietà isStyledText.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsStyledText() {
        return isStyledText;
    }

    /**
     * Imposta il valore della proprietà isStyledText.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsStyledText(String value) {
        this.isStyledText = value;
    }

    /**
     * Recupera il valore della proprietà markup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMarkup() {
        return markup;
    }

    /**
     * Imposta il valore della proprietà markup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMarkup(String value) {
        this.markup = value;
    }

}
