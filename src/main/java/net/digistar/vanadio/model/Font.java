//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;
import com.abubusoft.kripton.annotation.BindAdapter;
import net.digistar.vanadio.support.CollapsedStringAdapter;
// import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="reportFont" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fontName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
// @XmlAccessorType(XmlAccessType.FIELD)
//
// @XmlRootElement(name = "font", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

/**
 * CHECKED
 */
@BindType
public class  Font {

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "reportFont")
    public String reportFont;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "fontName")
    public String fontName;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "size")
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String size;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isBold")
    public String isBold;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isItalic")
    public String isItalic;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isUnderline")
    public String isUnderline;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isStrikeThrough")
    public String isStrikeThrough;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "pdfFontName")
    public String pdfFontName;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "pdfEncoding")
    public String pdfEncoding;

    @BindXml(xmlType = XmlType.ATTRIBUTE) // name = "isPdfEmbedded")
    public String isPdfEmbedded;
}
