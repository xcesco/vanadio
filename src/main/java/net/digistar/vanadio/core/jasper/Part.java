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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}printWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}partNameExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}partComponent"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="evaluationTime"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Now"/&gt;
 *             &lt;enumeration value="Report"/&gt;
 *             &lt;enumeration value="Group"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "property",
        "printWhenExpression",
        "partNameExpression",
        "partComponent"
})
@XmlRootElement(name = "part", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Part {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<Property> property;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected PrintWhenExpression printWhenExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected PartNameExpression partNameExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected PartComponentType partComponent;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "evaluationTime")
    protected String evaluationTime;
    @XmlAttribute(name = "evaluationGroup")
    protected String evaluationGroup;

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
     * Recupera il valore della proprietà printWhenExpression.
     *
     * @return possible object is
     * {@link PrintWhenExpression }
     */
    public PrintWhenExpression getPrintWhenExpression() {
        return printWhenExpression;
    }

    /**
     * Imposta il valore della proprietà printWhenExpression.
     *
     * @param value allowed object is
     *              {@link PrintWhenExpression }
     */
    public void setPrintWhenExpression(PrintWhenExpression value) {
        this.printWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà partNameExpression.
     *
     * @return possible object is
     * {@link PartNameExpression }
     */
    public PartNameExpression getPartNameExpression() {
        return partNameExpression;
    }

    /**
     * Imposta il valore della proprietà partNameExpression.
     *
     * @param value allowed object is
     *              {@link PartNameExpression }
     */
    public void setPartNameExpression(PartNameExpression value) {
        this.partNameExpression = value;
    }

    /**
     * Recupera il valore della proprietà partComponent.
     *
     * @return possible object is
     * {@link PartComponentType }
     */
    public PartComponentType getPartComponent() {
        return partComponent;
    }

    /**
     * Imposta il valore della proprietà partComponent.
     *
     * @param value allowed object is
     *              {@link PartComponentType }
     */
    public void setPartComponent(PartComponentType value) {
        this.partComponent = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUuid(String value) {
        this.uuid = value;
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
