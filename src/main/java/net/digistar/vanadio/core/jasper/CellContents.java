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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/&gt;
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Opaque"/&gt;
 *             &lt;enumeration value="Transparent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "property",
        "box",
        "lineOrRectangleOrEllipse"
})
@XmlRootElement(name = "cellContents", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class CellContents {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<Property> property;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Box box;
    @XmlElements({
            @XmlElement(name = "line", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Line.class),
            @XmlElement(name = "rectangle", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Rectangle.class),
            @XmlElement(name = "ellipse", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Ellipse.class),
            @XmlElement(name = "image", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Image.class),
            @XmlElement(name = "staticText", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = StaticText.class),
            @XmlElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = TextField.class),
            @XmlElement(name = "subreport", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Subreport.class),
            @XmlElement(name = "elementGroup", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ElementGroup.class),
            @XmlElement(name = "frame", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = Frame.class),
            @XmlElement(name = "componentElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = ComponentElement.class),
            @XmlElement(name = "genericElement", namespace = "http://jasperreports.sourceforge.net/jasperreports", type = GenericElement.class)
    })
    protected List<Object> lineOrRectangleOrEllipse;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "style")
    protected String style;

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Recupera il valore della proprietà box.
     *
     * @return possible object is
     * {@link Box }
     */
    public Box getBox() {
        return box;
    }

    /**
     * Imposta il valore della proprietà box.
     *
     * @param value allowed object is
     *              {@link Box }
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Gets the value of the lineOrRectangleOrEllipse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOrRectangleOrEllipse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOrRectangleOrEllipse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link Subreport }
     * {@link ElementGroup }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     */
    public List<Object> getLineOrRectangleOrEllipse() {
        if (lineOrRectangleOrEllipse == null) {
            lineOrRectangleOrEllipse = new ArrayList<Object>();
        }
        return this.lineOrRectangleOrEllipse;
    }

    /**
     * Recupera il valore della proprietà backcolor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Imposta il valore della proprietà backcolor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Recupera il valore della proprietà mode.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà style.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStyle() {
        return style;
    }

    /**
     * Imposta il valore della proprietà style.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
