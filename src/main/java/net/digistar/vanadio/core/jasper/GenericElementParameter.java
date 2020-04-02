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
 *         &lt;element name="valueExpression" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.Object" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="skipWhenNull" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "valueExpression"
})
@XmlRootElement(name = "genericElementParameter", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class GenericElementParameter {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected GenericElementParameter.ValueExpression valueExpression;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "skipWhenNull")
    protected Boolean skipWhenNull;

    /**
     * Recupera il valore della proprietà valueExpression.
     *
     * @return possible object is
     * {@link GenericElementParameter.ValueExpression }
     */
    public GenericElementParameter.ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Imposta il valore della proprietà valueExpression.
     *
     * @param value allowed object is
     *              {@link GenericElementParameter.ValueExpression }
     */
    public void setValueExpression(GenericElementParameter.ValueExpression value) {
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
     * Recupera il valore della proprietà skipWhenNull.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isSkipWhenNull() {
        if (skipWhenNull == null) {
            return false;
        } else {
            return skipWhenNull;
        }
    }

    /**
     * Imposta il valore della proprietà skipWhenNull.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSkipWhenNull(Boolean value) {
        this.skipWhenNull = value;
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
     *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.Object" /&gt;
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
        @XmlAttribute(name = "class")
        protected String clazz;

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

        /**
         * Recupera il valore della proprietà clazz.
         *
         * @return possible object is
         * {@link String }
         */
        public String getClazz() {
            if (clazz == null) {
                return "java.lang.Object";
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

    }

}
