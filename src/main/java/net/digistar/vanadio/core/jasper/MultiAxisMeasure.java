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
 *         &lt;element name="labelExpression"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valueExpression" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="calculation" type="{http://jasperreports.sourceforge.net/jasperreports}aggregationCalculationType" default="Nothing" /&gt;
 *       &lt;attribute name="incrementerFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "labelExpression",
        "valueExpression"
})
@XmlRootElement(name = "multiAxisMeasure", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class MultiAxisMeasure {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected MultiAxisMeasure.LabelExpression labelExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected MultiAxisMeasure.ValueExpression valueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "calculation")
    protected AggregationCalculationType calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;

    /**
     * Recupera il valore della proprietà labelExpression.
     *
     * @return possible object is
     * {@link MultiAxisMeasure.LabelExpression }
     */
    public MultiAxisMeasure.LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Imposta il valore della proprietà labelExpression.
     *
     * @param value allowed object is
     *              {@link MultiAxisMeasure.LabelExpression }
     */
    public void setLabelExpression(MultiAxisMeasure.LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Recupera il valore della proprietà valueExpression.
     *
     * @return possible object is
     * {@link MultiAxisMeasure.ValueExpression }
     */
    public MultiAxisMeasure.ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Imposta il valore della proprietà valueExpression.
     *
     * @param value allowed object is
     *              {@link MultiAxisMeasure.ValueExpression }
     */
    public void setValueExpression(MultiAxisMeasure.ValueExpression value) {
        this.valueExpression = value;
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
     * <p>Classe Java per anonymous complex type.
     *
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "content"
    })
    public static class LabelExpression {

        @XmlValue
        protected String content;

        /**
         * Recupera il valore della proprietà content.
         *
         * @return possible object is
         * {@link String }
         */
        public String getContent() {
            return content;
        }

        /**
         * Imposta il valore della proprietà content.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContent(String value) {
            this.content = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     *
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "content"
    })
    public static class ValueExpression {

        @XmlValue
        protected String content;

        /**
         * Recupera il valore della proprietà content.
         *
         * @return possible object is
         * {@link String }
         */
        public String getContent() {
            return content;
        }

        /**
         * Imposta il valore della proprietà content.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setContent(String value) {
            this.content = value;
        }

    }

}
