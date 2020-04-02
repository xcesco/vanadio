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
 *       &lt;attribute name="subreportVariable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="toVariable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="calculation" default="Nothing"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Nothing"/&gt;
 *             &lt;enumeration value="Count"/&gt;
 *             &lt;enumeration value="DistinctCount"/&gt;
 *             &lt;enumeration value="Sum"/&gt;
 *             &lt;enumeration value="Average"/&gt;
 *             &lt;enumeration value="Lowest"/&gt;
 *             &lt;enumeration value="Highest"/&gt;
 *             &lt;enumeration value="StandardDeviation"/&gt;
 *             &lt;enumeration value="Variance"/&gt;
 *             &lt;enumeration value="First"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="incrementerFactoryClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "returnValue", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ReturnValue {

    @XmlAttribute(name = "subreportVariable")
    protected String subreportVariable;
    @XmlAttribute(name = "toVariable")
    protected String toVariable;
    @XmlAttribute(name = "calculation")
    protected String calculation;
    @XmlAttribute(name = "incrementerFactoryClass")
    protected String incrementerFactoryClass;

    /**
     * Recupera il valore della proprietà subreportVariable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubreportVariable() {
        return subreportVariable;
    }

    /**
     * Imposta il valore della proprietà subreportVariable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubreportVariable(String value) {
        this.subreportVariable = value;
    }

    /**
     * Recupera il valore della proprietà toVariable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getToVariable() {
        return toVariable;
    }

    /**
     * Imposta il valore della proprietà toVariable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setToVariable(String value) {
        this.toVariable = value;
    }

    /**
     * Recupera il valore della proprietà calculation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCalculation() {
        if (calculation == null) {
            return "Nothing";
        } else {
            return calculation;
        }
    }

    /**
     * Imposta il valore della proprietà calculation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCalculation(String value) {
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

}
