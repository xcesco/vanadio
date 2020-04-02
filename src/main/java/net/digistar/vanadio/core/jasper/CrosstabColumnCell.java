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
 * <p>Classe Java per CrosstabColumnCell complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="CrosstabColumnCell"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}cellContents"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="contentsPosition" default="Left"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Left"/&gt;
 *             &lt;enumeration value="Center"/&gt;
 *             &lt;enumeration value="Right"/&gt;
 *             &lt;enumeration value="Stretch"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrosstabColumnCell", namespace = "http://jasperreports.sourceforge.net/jasperreports", propOrder = {
        "cellContents"
})
public class CrosstabColumnCell {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected CellContents cellContents;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "contentsPosition")
    protected String contentsPosition;

    /**
     * Recupera il valore della proprietà cellContents.
     *
     * @return possible object is
     * {@link CellContents }
     */
    public CellContents getCellContents() {
        return cellContents;
    }

    /**
     * Imposta il valore della proprietà cellContents.
     *
     * @param value allowed object is
     *              {@link CellContents }
     */
    public void setCellContents(CellContents value) {
        this.cellContents = value;
    }

    /**
     * Recupera il valore della proprietà height.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà contentsPosition.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContentsPosition() {
        if (contentsPosition == null) {
            return "Left";
        } else {
            return contentsPosition;
        }
    }

    /**
     * Imposta il valore della proprietà contentsPosition.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContentsPosition(String value) {
        this.contentsPosition = value;
    }

}
