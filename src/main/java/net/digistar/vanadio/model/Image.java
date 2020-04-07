//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

// import javax.xml.bind.annotation.*;
import com.abubusoft.kripton.annotation.BindAdapter;
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;
import net.digistar.vanadio.support.CollapsedStringAdapter;
import net.digistar.vanadio.support.ComplexEvaluationTimeAdapter;
// import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}graphicElement" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}imageExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}anchorNameExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
 *       &lt;attribute name="hAlign"&gt;
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
 *       &lt;attribute name="isUsingCache"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isLazy" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="onErrorType" default="Error"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Error"/&gt;
 *             &lt;enumeration value="Blank"/&gt;
 *             &lt;enumeration value="Icon"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" /&gt;
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports")

/**
 * CHECKED
 */
@BindType
public class Image {

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    public ReportElement reportElement;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public Box box;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public GraphicElement graphicElement;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public ImageExpression imageExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public AnchorNameExpression anchorNameExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public HyperlinkReferenceExpression hyperlinkReferenceExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public HyperlinkWhenExpression hyperlinkWhenExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public HyperlinkAnchorExpression hyperlinkAnchorExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public HyperlinkPageExpression hyperlinkPageExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public HyperlinkTooltipExpression hyperlinkTooltipExpression;

    // @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    public List<HyperlinkParameter> hyperlinkParameter=new ArrayList<>();

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String scaleImage;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String rotation;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String hAlign;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String vAlign;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isUsingCache;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String isLazy="false";

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String onErrorType="Error";

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    @BindAdapter(adapter = ComplexEvaluationTimeAdapter.class)
    public ComplexEvaluationTime evaluationTime= ComplexEvaluationTime.NOW;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String evaluationGroup;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String hyperlinkType;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    public String hyperlinkTarget;

    @BindXml(xmlType = XmlType.ATTRIBUTE) //
    @BindAdapter(adapter=CollapsedStringAdapter.class)
    // // @XmlSchemaType(name = "NMTOKEN")
    public String bookmarkLevel="0";

}
