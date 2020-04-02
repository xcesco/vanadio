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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElementType"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElementParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" /&gt;
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportElement",
        "genericElementType",
        "genericElementParameter"
})
@XmlRootElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class GenericElement {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected ReportElement reportElement;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected GenericElementType genericElementType;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<GenericElementParameter> genericElementParameter;
    @XmlAttribute(name = "evaluationTime")
    protected ComplexEvaluationTime evaluationTime;
    @XmlAttribute(name = "evaluationGroup")
    protected String evaluationGroup;

    /**
     * Recupera il valore della proprietà reportElement.
     *
     * @return possible object is
     * {@link ReportElement }
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Imposta il valore della proprietà reportElement.
     *
     * @param value allowed object is
     *              {@link ReportElement }
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

    /**
     * Recupera il valore della proprietà genericElementType.
     *
     * @return possible object is
     * {@link GenericElementType }
     */
    public GenericElementType getGenericElementType() {
        return genericElementType;
    }

    /**
     * Imposta il valore della proprietà genericElementType.
     *
     * @param value allowed object is
     *              {@link GenericElementType }
     */
    public void setGenericElementType(GenericElementType value) {
        this.genericElementType = value;
    }

    /**
     * Gets the value of the genericElementParameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericElementParameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericElementParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericElementParameter }
     */
    public List<GenericElementParameter> getGenericElementParameter() {
        if (genericElementParameter == null) {
            genericElementParameter = new ArrayList<GenericElementParameter>();
        }
        return this.genericElementParameter;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     *
     * @return possible object is
     * {@link ComplexEvaluationTime }
     */
    public ComplexEvaluationTime getEvaluationTime() {
        if (evaluationTime == null) {
            return ComplexEvaluationTime.NOW;
        } else {
            return evaluationTime;
        }
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     *
     * @param value allowed object is
     *              {@link ComplexEvaluationTime }
     */
    public void setEvaluationTime(ComplexEvaluationTime value) {
        this.evaluationTime = value;
    }

    /**
     * Recupera il valore della proprietà evaluationGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvaluationGroup() {
        return evaluationGroup;
    }

    /**
     * Imposta il valore della proprietà evaluationGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvaluationGroup(String value) {
        this.evaluationGroup = value;
    }

}
