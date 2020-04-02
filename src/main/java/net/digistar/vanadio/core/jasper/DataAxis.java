//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}axisLevel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="axis" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Rows"/&gt;
 *             &lt;enumeration value="Columns"/&gt;
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
        "axisLevel"
})
@XmlRootElement(name = "dataAxis", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class DataAxis {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<AxisLevel> axisLevel;
    @XmlAttribute(name = "axis", required = true)
    protected String axis;

    /**
     * Gets the value of the axisLevel property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisLevel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisLevel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxisLevel }
     */
    public List<AxisLevel> getAxisLevel() {
        if (axisLevel == null) {
            axisLevel = new ArrayList<AxisLevel>();
        }
        return this.axisLevel;
    }

    /**
     * Recupera il valore della proprietà axis.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Imposta il valore della proprietà axis.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAxis(String value) {
        this.axis = value;
    }

}
