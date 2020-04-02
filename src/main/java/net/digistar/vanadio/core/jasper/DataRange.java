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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lowExpression"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highExpression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "lowExpression",
        "highExpression"
})
@XmlRootElement(name = "dataRange", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class DataRange {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected LowExpression lowExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected HighExpression highExpression;

    /**
     * Recupera il valore della proprietà lowExpression.
     *
     * @return possible object is
     * {@link LowExpression }
     */
    public LowExpression getLowExpression() {
        return lowExpression;
    }

    /**
     * Imposta il valore della proprietà lowExpression.
     *
     * @param value allowed object is
     *              {@link LowExpression }
     */
    public void setLowExpression(LowExpression value) {
        this.lowExpression = value;
    }

    /**
     * Recupera il valore della proprietà highExpression.
     *
     * @return possible object is
     * {@link HighExpression }
     */
    public HighExpression getHighExpression() {
        return highExpression;
    }

    /**
     * Imposta il valore della proprietà highExpression.
     *
     * @param value allowed object is
     *              {@link HighExpression }
     */
    public void setHighExpression(HighExpression value) {
        this.highExpression = value;
    }

}
