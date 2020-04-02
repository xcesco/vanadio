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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="stretchType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="NoStretch"/&gt;
 *             &lt;enumeration value="RelativeToTallestObject"/&gt;
 *             &lt;enumeration value="RelativeToBandHeight"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="pen"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="None"/&gt;
 *             &lt;enumeration value="Thin"/&gt;
 *             &lt;enumeration value="1Point"/&gt;
 *             &lt;enumeration value="2Point"/&gt;
 *             &lt;enumeration value="4Point"/&gt;
 *             &lt;enumeration value="Dotted"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fill"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Solid"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "pen"
})
@XmlRootElement(name = "graphicElement", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class GraphicElement {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Pen pen;
    @XmlAttribute(name = "stretchType")
    protected String stretchType;
    @XmlAttribute(name = "pen")
    protected String graphicPen;
    @XmlAttribute(name = "fill")
    protected String fill;

    /**
     * Recupera il valore della proprietà pen.
     *
     * @return possible object is
     * {@link Pen }
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Imposta il valore della proprietà pen.
     *
     * @param value allowed object is
     *              {@link Pen }
     */
    public void setPen(Pen value) {
        this.pen = value;
    }

    /**
     * Recupera il valore della proprietà stretchType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStretchType() {
        return stretchType;
    }

    /**
     * Imposta il valore della proprietà stretchType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStretchType(String value) {
        this.stretchType = value;
    }

    /**
     * Recupera il valore della proprietà graphicPen.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGraphicPen() {
        return graphicPen;
    }

    /**
     * Imposta il valore della proprietà graphicPen.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGraphicPen(String value) {
        this.graphicPen = value;
    }

    /**
     * Recupera il valore della proprietà fill.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFill() {
        return fill;
    }

    /**
     * Imposta il valore della proprietà fill.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFill(String value) {
        this.fill = value;
    }

}
