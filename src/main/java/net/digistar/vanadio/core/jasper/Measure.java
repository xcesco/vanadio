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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}measureExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="calculation" type="{http://jasperreports.sourceforge.net/jasperreports}aggregationCalculationType" default="Nothing" /&gt;
 *       &lt;attribute name="incrementerFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="percentageOf" default="None"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="GrandTotal"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="percentageCalculatorClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "measureExpression"
})
@XmlRootElement(name = "measure", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Measure {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected MeasureExpression measureExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "calculation")
    protected AggregationCalculationType calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;
    @XmlAttribute(name = "percentageOf")
    protected String percentageOf;
    @XmlAttribute(name = "percentageCalculatorClass")
    protected String percentageCalculatorClass;

    /**
     * Recupera il valore della proprietà measureExpression.
     *
     * @return possible object is
     * {@link MeasureExpression }
     */
    public MeasureExpression getMeasureExpression() {
        return measureExpression;
    }

    /**
     * Imposta il valore della proprietà measureExpression.
     *
     * @param value allowed object is
     *              {@link MeasureExpression }
     */
    public void setMeasureExpression(MeasureExpression value) {
        this.measureExpression = value;
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
        return clazz;
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
     * Recupera il valore della proprietà calculation.
     *
     * @return possible object is
     * {@link AggregationCalculationType }
     */
    public AggregationCalculationType getCalculation() {
        if (calculation == null) {
            return AggregationCalculationType.NOTHING;
        } else {
            return calculation;
        }
    }

    /**
     * Imposta il valore della proprietà calculation.
     *
     * @param value allowed object is
     *              {@link AggregationCalculationType }
     */
    public void setCalculation(AggregationCalculationType value) {
        this.calculation = value;
    }

    /**
     * Recupera il valore della proprietà incrementerFactoryClass.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIncrementerFactoryClass() {
        return incrementerFactoryClass;
    }

    /**
     * Imposta il valore della proprietà incrementerFactoryClass.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIncrementerFactoryClass(String value) {
        this.incrementerFactoryClass = value;
    }

    /**
     * Recupera il valore della proprietà percentageOf.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPercentageOf() {
        if (percentageOf == null) {
            return "None";
        } else {
            return percentageOf;
        }
    }

    /**
     * Imposta il valore della proprietà percentageOf.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPercentageOf(String value) {
        this.percentageOf = value;
    }

    /**
     * Recupera il valore della proprietà percentageCalculatorClass.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPercentageCalculatorClass() {
        return percentageCalculatorClass;
    }

    /**
     * Imposta il valore della proprietà percentageCalculatorClass.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPercentageCalculatorClass(String value) {
        this.percentageCalculatorClass = value;
    }

}
