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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}cellContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="rowTotalGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="columnTotalGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cellContents"
})
@XmlRootElement(name = "crosstabCell", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class CrosstabCell {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected CellContents cellContents;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "rowTotalGroup")
    protected String rowTotalGroup;
    @XmlAttribute(name = "columnTotalGroup")
    protected String columnTotalGroup;

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
     * Recupera il valore della proprietà width.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWidth() {
        return width;
    }

    /**
     * Imposta il valore della proprietà width.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidth(String value) {
        this.width = value;
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
     * Recupera il valore della proprietà rowTotalGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRowTotalGroup() {
        return rowTotalGroup;
    }

    /**
     * Imposta il valore della proprietà rowTotalGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRowTotalGroup(String value) {
        this.rowTotalGroup = value;
    }

    /**
     * Recupera il valore della proprietà columnTotalGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColumnTotalGroup() {
        return columnTotalGroup;
    }

    /**
     * Imposta il valore della proprietà columnTotalGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColumnTotalGroup(String value) {
        this.columnTotalGroup = value;
    }

}
