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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisDataset"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}dataAxis" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisMeasure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "multiAxisDataset",
        "dataAxis",
        "multiAxisMeasure"
})
@XmlRootElement(name = "multiAxisData", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class MultiAxisData {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected MultiAxisDataset multiAxisDataset;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected List<DataAxis> dataAxis;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected List<MultiAxisMeasure> multiAxisMeasure;

    /**
     * Recupera il valore della proprietà multiAxisDataset.
     *
     * @return possible object is
     * {@link MultiAxisDataset }
     */
    public MultiAxisDataset getMultiAxisDataset() {
        return multiAxisDataset;
    }

    /**
     * Imposta il valore della proprietà multiAxisDataset.
     *
     * @param value allowed object is
     *              {@link MultiAxisDataset }
     */
    public void setMultiAxisDataset(MultiAxisDataset value) {
        this.multiAxisDataset = value;
    }

    /**
     * Gets the value of the dataAxis property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataAxis property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataAxis().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataAxis }
     */
    public List<DataAxis> getDataAxis() {
        if (dataAxis == null) {
            dataAxis = new ArrayList<DataAxis>();
        }
        return this.dataAxis;
    }

    /**
     * Gets the value of the multiAxisMeasure property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiAxisMeasure property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiAxisMeasure().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiAxisMeasure }
     */
    public List<MultiAxisMeasure> getMultiAxisMeasure() {
        if (multiAxisMeasure == null) {
            multiAxisMeasure = new ArrayList<MultiAxisMeasure>();
        }
        return this.multiAxisMeasure;
    }

}
