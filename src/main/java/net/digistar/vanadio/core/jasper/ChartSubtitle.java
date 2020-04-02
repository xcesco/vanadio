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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}font" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subtitleExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "font",
        "subtitleExpression"
})
@XmlRootElement(name = "chartSubtitle", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ChartSubtitle {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Font font;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected SubtitleExpression subtitleExpression;
    @XmlAttribute(name = "color")
    protected String color;

    /**
     * Recupera il valore della proprietà font.
     *
     * @return possible object is
     * {@link Font }
     */
    public Font getFont() {
        return font;
    }

    /**
     * Imposta il valore della proprietà font.
     *
     * @param value allowed object is
     *              {@link Font }
     */
    public void setFont(Font value) {
        this.font = value;
    }

    /**
     * Recupera il valore della proprietà subtitleExpression.
     *
     * @return possible object is
     * {@link SubtitleExpression }
     */
    public SubtitleExpression getSubtitleExpression() {
        return subtitleExpression;
    }

    /**
     * Imposta il valore della proprietà subtitleExpression.
     *
     * @param value allowed object is
     *              {@link SubtitleExpression }
     */
    public void setSubtitleExpression(SubtitleExpression value) {
        this.subtitleExpression = value;
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
