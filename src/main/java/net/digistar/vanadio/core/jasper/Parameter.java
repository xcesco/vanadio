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
     * Recupera il valore della proprietà parameterDescription.
     *
     * @return possible object is
     * {@link ParameterDescription }
     */
    public ParameterDescription getParameterDescription() {
        return parameterDescription;
    }

    /**
     * Imposta il valore della proprietà parameterDescription.
     *
     * @param value allowed object is
     *              {@link ParameterDescription }
     */
    public void setParameterDescription(ParameterDescription value) {
        this.parameterDescription = value;
    }

    /**
     * Recupera il valore della proprietà defaultValueExpression.
     *
     * @return possible object is
     * {@link DefaultValueExpression }
     */
    public DefaultValueExpression getDefaultValueExpression() {
        return defaultValueExpression;
    }

    /**
     * Imposta il valore della proprietà defaultValueExpression.
     *
     * @param value allowed object is
     *              {@link DefaultValueExpression }
     */
    public void setDefaultValueExpression(DefaultValueExpression value) {
        this.defaultValueExpression = value;
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
     * Recupera il valore della proprietà clazz.
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
     * Imposta il valore della proprietà clazz.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Recupera il valore della proprietà nestedType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNestedType() {
        return nestedType;
    }

    /**
     * Imposta il valore della proprietà nestedType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNestedType(String value) {
        this.nestedType = value;
    }

    /**
     * Recupera il valore della proprietà isForPrompting.
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
     * Imposta il valore della proprietà isForPrompting.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsForPrompting(String value) {
        this.isForPrompting = value;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvaluationTime(String value) {
        this.evaluationTime = value;
    }

}
