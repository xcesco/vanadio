//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="lineWidth" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="lineStyle"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Solid"/&gt;
 *             &lt;enumeration value="Dashed"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *             &lt;enumeration value="Double"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="lineColor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "rightPen", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class RightPen {

    @XmlAttribute(name = "lineWidth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lineWidth;
    @XmlAttribute(name = "lineStyle")
    protected String lineStyle;
    @XmlAttribute(name = "lineColor")
    protected String lineColor;

    /**
     * Recupera il valore della proprietà lineWidth.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineWidth() {
        return lineWidth;
    }

    /**
     * Imposta il valore della proprietà lineWidth.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineWidth(String value) {
        this.lineWidth = value;
    }

    /**
     * Recupera il valore della proprietà lineStyle.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineStyle() {
        return lineStyle;
    }

    /**
     * Imposta il valore della proprietà lineStyle.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineStyle(String value) {
        this.lineStyle = value;
    }

    /**
     * Recupera il valore della proprietà lineColor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLineColor() {
        return lineColor;
    }

    /**
     * Imposta il valore della proprietà lineColor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLineColor(String value) {
        this.lineColor = value;
    }

}
