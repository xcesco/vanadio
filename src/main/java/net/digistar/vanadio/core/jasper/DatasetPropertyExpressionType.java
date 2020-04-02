//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per datasetPropertyExpressionType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="datasetPropertyExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://jasperreports.sourceforge.net/jasperreports}propertyExpressionType"&gt;
 *       &lt;attribute name="evaluationTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Early"/&gt;
 *             &lt;enumeration value="Late"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datasetPropertyExpressionType", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class DatasetPropertyExpressionType
        extends PropertyExpressionType {

    @XmlAttribute(name = "evaluationTime")
    protected String evaluationTime;

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
