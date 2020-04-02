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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}paragraph" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}conditionalStyle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isDefault"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Opaque"/&gt;
 *             &lt;enumeration value="Transparent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="forecolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pen"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fill"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Solid"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="scaleImage"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Clip"/&gt;
 *             &lt;enumeration value="FillFrame"/&gt;
 *             &lt;enumeration value="RetainShape"/&gt;
 *             &lt;enumeration value="RealHeight"/&gt;
 *             &lt;enumeration value="RealSize"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Justified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hTextAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Justified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hImageAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="vAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Middle"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="vTextAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Middle"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *             &lt;enumeration value="Justified"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="vImageAlign"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Top"/&gt;
 *             &lt;enumeration value="Middle"/&gt;
 *             &lt;enumeration value="Bottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="border"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="borderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="padding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="topBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="topBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="topPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="leftBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="leftBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="leftPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="bottomBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="bottomBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bottomPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="rightBorder"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="rightBorderColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rightPadding" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
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
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="isBold"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isItalic"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isUnderline"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isStrikeThrough"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pdfFontName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pdfEncoding" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isPdfEmbedded"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isBlankWhenNull"&gt;
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
        "pen",
        "box",
        "paragraph",
        "conditionalStyle"
})
@XmlRootElement(name = "style", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Style {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Pen pen;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Box box;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Paragraph paragraph;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<ConditionalStyle> conditionalStyle;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "isDefault")
    protected String isDefault;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "forecolor")
    protected String forecolor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "pen")
    protected String stylePen;
    @XmlAttribute(name = "fill")
    protected String fill;
    @XmlAttribute(name = "radius")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String radius;
    @XmlAttribute(name = "scaleImage")
    protected String scaleImage;
    @XmlAttribute(name = "hAlign")
    protected String hAlign;
    @XmlAttribute(name = "hTextAlign")
    protected String hTextAlign;
    @XmlAttribute(name = "hImageAlign")
    protected String hImageAlign;
    @XmlAttribute(name = "vAlign")
    protected String vAlign;
    @XmlAttribute(name = "vTextAlign")
    protected String vTextAlign;
    @XmlAttribute(name = "vImageAlign")
    protected String vImageAlign;
    @XmlAttribute(name = "border")
    protected String border;
    @XmlAttribute(name = "borderColor")
    protected String borderColor;
    @XmlAttribute(name = "padding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String padding;
    @XmlAttribute(name = "topBorder")
    protected String topBorder;
    @XmlAttribute(name = "topBorderColor")
    protected String topBorderColor;
    @XmlAttribute(name = "topPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String topPadding;
    @XmlAttribute(name = "leftBorder")
    protected String leftBorder;
    @XmlAttribute(name = "leftBorderColor")
    protected String leftBorderColor;
    @XmlAttribute(name = "leftPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String leftPadding;
    @XmlAttribute(name = "bottomBorder")
    protected String bottomBorder;
    @XmlAttribute(name = "bottomBorderColor")
    protected String bottomBorderColor;
    @XmlAttribute(name = "bottomPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bottomPadding;
    @XmlAttribute(name = "rightBorder")
    protected String rightBorder;
    @XmlAttribute(name = "rightBorderColor")
    protected String rightBorderColor;
    @XmlAttribute(name = "rightPadding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String rightPadding;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "lineSpacing")
    protected String lineSpacing;
    @XmlAttribute(name = "isStyledText")
    protected String isStyledText;
    @XmlAttribute(name = "markup")
    protected String markup;
    @XmlAttribute(name = "fontName")
    protected String fontName;
    @XmlAttribute(name = "fontSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String fontSize;
    @XmlAttribute(name = "isBold")
    protected String isBold;
    @XmlAttribute(name = "isItalic")
    protected String isItalic;
    @XmlAttribute(name = "isUnderline")
    protected String isUnderline;
    @XmlAttribute(name = "isStrikeThrough")
    protected String isStrikeThrough;
    @XmlAttribute(name = "pdfFontName")
    protected String pdfFontName;
    @XmlAttribute(name = "pdfEncoding")
    protected String pdfEncoding;
    @XmlAttribute(name = "isPdfEmbedded")
    protected String isPdfEmbedded;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "isBlankWhenNull")
    protected String isBlankWhenNull;

    /**
     * Recupera il valore della proprietà pen.
     *
     * @return possible object is
     * {@link Pen }
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Imposta il valore della proprietà pen.
     *
     * @param value allowed object is
     *              {@link Pen }
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Recupera il valore della proprietà box.
     *
     * @return possible object is
     * {@link Box }
     */
    public Box getBox() {
        return box;
    }

    /**
     * Imposta il valore della proprietà box.
     *
     * @param value allowed object is
     *              {@link Box }
     */
    public void setBox(Box value) {
        this.box = value;
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
     * Gets the value of the conditionalStyle property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalStyle property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionalStyle().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionalStyle }
     */
    public List<ConditionalStyle> getConditionalStyle() {
        if (conditionalStyle == null) {
            conditionalStyle = new ArrayList<ConditionalStyle>();
        }
        return this.conditionalStyle;
    }

    /**
     * Recupera il valore della proprietà name.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà isDefault.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Imposta il valore della proprietà isDefault.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Recupera il valore della proprietà style.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStyle() {
        return style;
    }

    /**
     * Imposta il valore della proprietà style.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Recupera il valore della proprietà mode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà forecolor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForecolor() {
        return forecolor;
    }

    /**
     * Imposta il valore della proprietà forecolor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForecolor(String value) {
        this.forecolor = value;
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
     * Recupera il valore della proprietà stylePen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStylePen() {
        return stylePen;
    }

    /**
     * Imposta il valore della proprietà stylePen.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStylePen(String value) {
        this.stylePen = value;
    }

    /**
     * Recupera il valore della proprietà fill.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFill() {
        return fill;
    }

    /**
     * Imposta il valore della proprietà fill.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Recupera il valore della proprietà radius.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Imposta il valore della proprietà radius.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRadius(String value) {
        this.radius = value;
    }

    /**
     * Recupera il valore della proprietà scaleImage.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScaleImage() {
        return scaleImage;
    }

    /**
     * Imposta il valore della proprietà scaleImage.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScaleImage(String value) {
        this.scaleImage = value;
    }

    /**
     * Recupera il valore della proprietà hAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHAlign() {
        return hAlign;
    }

    /**
     * Imposta il valore della proprietà hAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHAlign(String value) {
        this.hAlign = value;
    }

    /**
     * Recupera il valore della proprietà hTextAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHTextAlign() {
        return hTextAlign;
    }

    /**
     * Imposta il valore della proprietà hTextAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHTextAlign(String value) {
        this.hTextAlign = value;
    }

    /**
     * Recupera il valore della proprietà hImageAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHImageAlign() {
        return hImageAlign;
    }

    /**
     * Imposta il valore della proprietà hImageAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHImageAlign(String value) {
        this.hImageAlign = value;
    }

    /**
     * Recupera il valore della proprietà vAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVAlign() {
        return vAlign;
    }

    /**
     * Imposta il valore della proprietà vAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVAlign(String value) {
        this.vAlign = value;
    }

    /**
     * Recupera il valore della proprietà vTextAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVTextAlign() {
        return vTextAlign;
    }

    /**
     * Imposta il valore della proprietà vTextAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVTextAlign(String value) {
        this.vTextAlign = value;
    }

    /**
     * Recupera il valore della proprietà vImageAlign.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVImageAlign() {
        return vImageAlign;
    }

    /**
     * Imposta il valore della proprietà vImageAlign.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVImageAlign(String value) {
        this.vImageAlign = value;
    }

    /**
     * Recupera il valore della proprietà border.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorder() {
        return border;
    }

    /**
     * Imposta il valore della proprietà border.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Recupera il valore della proprietà borderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Imposta il valore della proprietà borderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Recupera il valore della proprietà padding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Imposta il valore della proprietà padding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Recupera il valore della proprietà topBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorder() {
        return topBorder;
    }

    /**
     * Imposta il valore della proprietà topBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorder(String value) {
        this.topBorder = value;
    }

    /**
     * Recupera il valore della proprietà topBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopBorderColor() {
        return topBorderColor;
    }

    /**
     * Imposta il valore della proprietà topBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopBorderColor(String value) {
        this.topBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà topPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopPadding() {
        return topPadding;
    }

    /**
     * Imposta il valore della proprietà topPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopPadding(String value) {
        this.topPadding = value;
    }

    /**
     * Recupera il valore della proprietà leftBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorder() {
        return leftBorder;
    }

    /**
     * Imposta il valore della proprietà leftBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorder(String value) {
        this.leftBorder = value;
    }

    /**
     * Recupera il valore della proprietà leftBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftBorderColor() {
        return leftBorderColor;
    }

    /**
     * Imposta il valore della proprietà leftBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftBorderColor(String value) {
        this.leftBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà leftPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLeftPadding() {
        return leftPadding;
    }

    /**
     * Imposta il valore della proprietà leftPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLeftPadding(String value) {
        this.leftPadding = value;
    }

    /**
     * Recupera il valore della proprietà bottomBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorder() {
        return bottomBorder;
    }

    /**
     * Imposta il valore della proprietà bottomBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorder(String value) {
        this.bottomBorder = value;
    }

    /**
     * Recupera il valore della proprietà bottomBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomBorderColor() {
        return bottomBorderColor;
    }

    /**
     * Imposta il valore della proprietà bottomBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomBorderColor(String value) {
        this.bottomBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà bottomPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBottomPadding() {
        return bottomPadding;
    }

    /**
     * Imposta il valore della proprietà bottomPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBottomPadding(String value) {
        this.bottomPadding = value;
    }

    /**
     * Recupera il valore della proprietà rightBorder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorder() {
        return rightBorder;
    }

    /**
     * Imposta il valore della proprietà rightBorder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorder(String value) {
        this.rightBorder = value;
    }

    /**
     * Recupera il valore della proprietà rightBorderColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightBorderColor() {
        return rightBorderColor;
    }

    /**
     * Imposta il valore della proprietà rightBorderColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightBorderColor(String value) {
        this.rightBorderColor = value;
    }

    /**
     * Recupera il valore della proprietà rightPadding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRightPadding() {
        return rightPadding;
    }

    /**
     * Imposta il valore della proprietà rightPadding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRightPadding(String value) {
        this.rightPadding = value;
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

    /**
     * Recupera il valore della proprietà fontName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Imposta il valore della proprietà fontName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Recupera il valore della proprietà fontSize.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Imposta il valore della proprietà fontSize.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Recupera il valore della proprietà isBold.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsBold() {
        return isBold;
    }

    /**
     * Imposta il valore della proprietà isBold.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsBold(String value) {
        this.isBold = value;
    }

    /**
     * Recupera il valore della proprietà isItalic.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsItalic() {
        return isItalic;
    }

    /**
     * Imposta il valore della proprietà isItalic.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsItalic(String value) {
        this.isItalic = value;
    }

    /**
     * Recupera il valore della proprietà isUnderline.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsUnderline() {
        return isUnderline;
    }

    /**
     * Imposta il valore della proprietà isUnderline.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsUnderline(String value) {
        this.isUnderline = value;
    }

    /**
     * Recupera il valore della proprietà isStrikeThrough.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsStrikeThrough() {
        return isStrikeThrough;
    }

    /**
     * Imposta il valore della proprietà isStrikeThrough.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsStrikeThrough(String value) {
        this.isStrikeThrough = value;
    }

    /**
     * Recupera il valore della proprietà pdfFontName.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPdfFontName() {
        return pdfFontName;
    }

    /**
     * Imposta il valore della proprietà pdfFontName.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPdfFontName(String value) {
        this.pdfFontName = value;
    }

    /**
     * Recupera il valore della proprietà pdfEncoding.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPdfEncoding() {
        return pdfEncoding;
    }

    /**
     * Imposta il valore della proprietà pdfEncoding.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPdfEncoding(String value) {
        this.pdfEncoding = value;
    }

    /**
     * Recupera il valore della proprietà isPdfEmbedded.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsPdfEmbedded() {
        return isPdfEmbedded;
    }

    /**
     * Imposta il valore della proprietà isPdfEmbedded.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsPdfEmbedded(String value) {
        this.isPdfEmbedded = value;
    }

    /**
     * Recupera il valore della proprietà pattern.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Imposta il valore della proprietà pattern.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Recupera il valore della proprietà isBlankWhenNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsBlankWhenNull() {
        return isBlankWhenNull;
    }

    /**
     * Imposta il valore della proprietà isBlankWhenNull.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsBlankWhenNull(String value) {
        this.isBlankWhenNull = value;
    }

}
