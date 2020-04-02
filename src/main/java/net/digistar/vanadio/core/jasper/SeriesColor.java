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
 *       &lt;attribute name="seriesOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="color" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "seriesColor", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class SeriesColor {

    @XmlAttribute(name = "seriesOrder", required = true)
    protected String seriesOrder;
    @XmlAttribute(name = "color", required = true)
    protected String color;

    /**
     * Recupera il valore della proprietà seriesOrder.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSeriesOrder() {
        return seriesOrder;
    }

    /**
     * Imposta il valore della proprietà seriesOrder.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSeriesOrder(String value) {
        this.seriesOrder = value;
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

}
