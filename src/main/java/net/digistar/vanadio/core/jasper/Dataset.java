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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}incrementWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}datasetRun" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="resetType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *             &lt;enumeration value="Page"/&gt;
 *             &lt;enumeration value="Column"/&gt;
 *             &lt;enumeration value="Group"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="resetGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="incrementType" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *             &lt;enumeration value="Page"/&gt;
 *             &lt;enumeration value="Column"/&gt;
 *             &lt;enumeration value="Group"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="incrementGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "incrementWhenExpression",
        "datasetRun"
})
@XmlRootElement(name = "dataset", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Dataset {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected IncrementWhenExpression incrementWhenExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected DatasetRun datasetRun;
    @XmlAttribute(name = "resetType")
    protected String resetType;
    @XmlAttribute(name = "resetGroup")
    protected String resetGroup;
    @XmlAttribute(name = "incrementType")
    protected String incrementType;
    @XmlAttribute(name = "incrementGroup")
    protected String incrementGroup;

    /**
     * Recupera il valore della proprietà incrementWhenExpression.
     *
     * @return possible object is
     * {@link IncrementWhenExpression }
     */
    public IncrementWhenExpression getIncrementWhenExpression() {
        return incrementWhenExpression;
    }

    /**
     * Imposta il valore della proprietà incrementWhenExpression.
     *
     * @param value allowed object is
     *              {@link IncrementWhenExpression }
     */
    public void setIncrementWhenExpression(IncrementWhenExpression value) {
        this.incrementWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà datasetRun.
     *
     * @return possible object is
     * {@link DatasetRun }
     */
    public DatasetRun getDatasetRun() {
        return datasetRun;
    }

    /**
     * Imposta il valore della proprietà datasetRun.
     *
     * @param value allowed object is
     *              {@link DatasetRun }
     */
    public void setDatasetRun(DatasetRun value) {
        this.datasetRun = value;
    }

    /**
     * Recupera il valore della proprietà resetType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResetType() {
        return resetType;
    }

    /**
     * Imposta il valore della proprietà resetType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResetType(String value) {
        this.resetType = value;
    }

    /**
     * Recupera il valore della proprietà resetGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResetGroup() {
        return resetGroup;
    }

    /**
     * Imposta il valore della proprietà resetGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResetGroup(String value) {
        this.resetGroup = value;
    }

    /**
     * Recupera il valore della proprietà incrementType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIncrementType() {
        if (incrementType == null) {
            return "None";
        } else {
            return incrementType;
        }
    }

    /**
     * Imposta il valore della proprietà incrementType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIncrementType(String value) {
        this.incrementType = value;
    }

    /**
     * Recupera il valore della proprietà incrementGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIncrementGroup() {
        return incrementGroup;
    }

    /**
     * Imposta il valore della proprietà incrementGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIncrementGroup(String value) {
        this.incrementGroup = value;
    }

}
