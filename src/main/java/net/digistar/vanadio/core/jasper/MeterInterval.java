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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataRange"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="alpha" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dataRange"
})
@XmlRootElement(name = "meterInterval", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class MeterInterval {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected DataRange dataRange;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "alpha")
    protected String alpha;

    /**
     * Recupera il valore della proprietà dataRange.
     *
     * @return possible object is
     * {@link DataRange }
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * Imposta il valore della proprietà dataRange.
     *
     * @param value allowed object is
     *              {@link DataRange }
     */
    public void setDataRange(DataRange value) {
        this.dataRange = value;
    }

    /**
     * Recupera il valore della proprietà label.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Imposta il valore della proprietà label.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Recupera il valore della proprietà color.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColor() {
        return color;
    }

    /**
     * Imposta il valore della proprietà color.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Recupera il valore della proprietà alpha.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlpha() {
        return alpha;
    }

    /**
     * Imposta il valore della proprietà alpha.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlpha(String value) {
        this.alpha = value;
    }

}
