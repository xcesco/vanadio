//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 11:06:40 PM CEST 
//


package net.digistar.vanadio.model;

import com.abubusoft.kripton.annotation.BindType;

import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}parameterDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}defaultValueExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" /&gt;
 *       &lt;attribute name="nestedType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isForPrompting" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="evaluationTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Early"/&gt;
 *             &lt;enumeration value="Late"/&gt;
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
        "property",
        "parameterDescription",
        "defaultValueExpression"
})
@XmlRootElement(name = "parameter", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@BindType
public class Parameter {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<Property> property;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ParameterDescription parameterDescription;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DefaultValueExpression defaultValueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "nestedType")
    protected String nestedType;
    @XmlAttribute(name = "isForPrompting")
    protected String isForPrompting;
    @XmlAttribute(name = "evaluationTime")
    protected String evaluationTime;

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the parameterDescription property.
     *
     * @return possible object is
     * {@link ParameterDescription }
     */
    public ParameterDescription getParameterDescription() {
        return parameterDescription;
    }

    /**
     * Sets the value of the parameterDescription property.
     *
     * @param value allowed object is
     *              {@link ParameterDescription }
     */
    public void setParameterDescription(ParameterDescription value) {
        this.parameterDescription = value;
    }

    /**
     * Gets the value of the defaultValueExpression property.
     *
     * @return possible object is
     * {@link DefaultValueExpression }
     */
    public DefaultValueExpression getDefaultValueExpression() {
        return defaultValueExpression;
    }

    /**
     * Sets the value of the defaultValueExpression property.
     *
     * @param value allowed object is
     *              {@link DefaultValueExpression }
     */
    public void setDefaultValueExpression(DefaultValueExpression value) {
        this.defaultValueExpression = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the nestedType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNestedType() {
        return nestedType;
    }

    /**
     * Sets the value of the nestedType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNestedType(String value) {
        this.nestedType = value;
    }

    /**
     * Gets the value of the isForPrompting property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsForPrompting() {
        if (isForPrompting == null) {
            return "true";
        } else {
            return isForPrompting;
        }
    }

    /**
     * Sets the value of the isForPrompting property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsForPrompting(String value) {
        this.isForPrompting = value;
    }

    /**
     * Gets the value of the evaluationTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * Sets the value of the evaluationTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvaluationTime(String value) {
        this.evaluationTime = value;
    }

}