//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per variableReturnValue complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="variableReturnValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://jasperreports.sourceforge.net/jasperreports}commonReturnValue"&gt;
 *       &lt;attribute name="fromVariable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variableReturnValue", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class VariableReturnValue
        extends CommonReturnValue {

    @XmlAttribute(name = "fromVariable")
    protected String fromVariable;

    /**
     * Recupera il valore della proprietà fromVariable.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromVariable() {
        return fromVariable;
    }

    /**
     * Imposta il valore della proprietà fromVariable.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromVariable(String value) {
        this.fromVariable = value;
    }

}
