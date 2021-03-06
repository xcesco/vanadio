//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;

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
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "meterPlot", namespace = "http://jasperreports.sourceforge.net/jasperreports")
import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.BindXml;
import com.abubusoft.kripton.xml.XmlType;

@BindType
public class  MeterPlot {

  public Plot plot;
  public TickLabelFont tickLabelFont;
  public ValueDisplay valueDisplay;
  public DataRange dataRange;
  public List<MeterInterval> meterInterval = new ArrayList<>();

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String shape;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String angle;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String units;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String tickInterval;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String meterColor;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String needleColor;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String tickColor;

  @BindXml(xmlType = XmlType.ATTRIBUTE) //
  public String tickCount;
}
