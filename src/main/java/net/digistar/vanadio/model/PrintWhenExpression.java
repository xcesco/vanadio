//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;
import com.abubusoft.kripton.annotation.*;
import com.abubusoft.kripton.xml.XmlType;

// import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
//// @XmlAccessorType(XmlAccessType.FIELD)
//
//// @XmlRootElement(name = "printWhenExpression", namespace = "http://jasperreports.sourceforge.net/jasperreports")

/**
 *  CHECKED
 */
@BindType
public class PrintWhenExpression {

    //@XmlValue
    @BindXml(xmlType = XmlType.VALUE)
    public String content;

}
