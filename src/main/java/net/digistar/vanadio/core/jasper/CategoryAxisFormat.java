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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}axisFormat"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="labelRotation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "axisFormat"
})
@XmlRootElement(name = "categoryAxisFormat", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class CategoryAxisFormat {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected AxisFormat axisFormat;
    @XmlAttribute(name = "labelRotation")
    protected String labelRotation;

    /**
     * Recupera il valore della proprietà axisFormat.
     *
     * @return possible object is
     * {@link AxisFormat }
     */
    public AxisFormat getAxisFormat() {
        return axisFormat;
    }

    /**
     * Imposta il valore della proprietà axisFormat.
     *
     * @param value allowed object is
     *              {@link AxisFormat }
     */
    public void setAxisFormat(AxisFormat value) {
        this.axisFormat = value;
    }

    /**
     * Recupera il valore della proprietà labelRotation.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabelRotation() {
        return labelRotation;
    }

    /**
     * Imposta il valore della proprietà labelRotation.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabelRotation(String value) {
        this.labelRotation = value;
    }

}
