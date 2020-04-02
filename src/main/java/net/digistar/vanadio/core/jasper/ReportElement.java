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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}propertyExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}printWhenExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="positionType" default="FixRelativeToTop"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Float"/&gt;
 *             &lt;enumeration value="FixRelativeToTop"/&gt;
 *             &lt;enumeration value="FixRelativeToBottom"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="stretchType" default="NoStretch"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="NoStretch"/&gt;
 *             &lt;enumeration value="RelativeToTallestObject"/&gt;
 *             &lt;enumeration value="RelativeToBandHeight"/&gt;
 *             &lt;enumeration value="ElementGroupBottom"/&gt;
 *             &lt;enumeration value="ElementGroupHeight"/&gt;
 *             &lt;enumeration value="ContainerBottom"/&gt;
 *             &lt;enumeration value="ContainerHeight"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isPrintRepeatedValues" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mode"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Opaque"/&gt;
 *             &lt;enumeration value="Transparent"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="isRemoveLineWhenBlank" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isPrintInFirstWholeBand" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isPrintWhenDetailOverflows" default="false"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="printWhenGroupChanges" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="forecolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "property",
        "propertyExpression",
        "printWhenExpression"
})
@XmlRootElement(name = "reportElement", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class ReportElement {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<Property> property;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<PropertyExpressionType> propertyExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected PrintWhenExpression printWhenExpression;
    @XmlAttribute(name = "uuid")
    protected String uuid;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "positionType")
    protected String positionType;
    @XmlAttribute(name = "stretchType")
    protected String stretchType;
    @XmlAttribute(name = "isPrintRepeatedValues")
    protected String isPrintRepeatedValues;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String y;
    @XmlAttribute(name = "width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String width;
    @XmlAttribute(name = "height", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String height;
    @XmlAttribute(name = "isRemoveLineWhenBlank")
    protected String isRemoveLineWhenBlank;
    @XmlAttribute(name = "isPrintInFirstWholeBand")
    protected String isPrintInFirstWholeBand;
    @XmlAttribute(name = "isPrintWhenDetailOverflows")
    protected String isPrintWhenDetailOverflows;
    @XmlAttribute(name = "printWhenGroupChanges")
    protected String printWhenGroupChanges;
    @XmlAttribute(name = "forecolor")
    protected String forecolor;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;

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
     * Gets the value of the propertyExpression property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyExpression property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyExpression().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyExpressionType }
     */
    public List<PropertyExpressionType> getPropertyExpression() {
        if (propertyExpression == null) {
            propertyExpression = new ArrayList<PropertyExpressionType>();
        }
        return this.propertyExpression;
    }

    /**
     * Recupera il valore della proprietà printWhenExpression.
     *
     * @return possible object is
     * {@link PrintWhenExpression }
     */
    public PrintWhenExpression getPrintWhenExpression() {
        return printWhenExpression;
    }

    /**
     * Imposta il valore della proprietà printWhenExpression.
     *
     * @param value allowed object is
     *              {@link PrintWhenExpression }
     */
    public void setPrintWhenExpression(PrintWhenExpression value) {
        this.printWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà key.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * Imposta il valore della proprietà key.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKey(String value) {
        this.key = value;
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

    /**
     * Recupera il valore della proprietà positionType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPositionType() {
        if (positionType == null) {
            return "FixRelativeToTop";
        } else {
            return positionType;
        }
    }

    /**
     * Imposta il valore della proprietà positionType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Recupera il valore della proprietà stretchType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStretchType() {
        if (stretchType == null) {
            return "NoStretch";
        } else {
            return stretchType;
        }
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
     * Recupera il valore della proprietà isPrintRepeatedValues.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsPrintRepeatedValues() {
        if (isPrintRepeatedValues == null) {
            return "true";
        } else {
            return isPrintRepeatedValues;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintRepeatedValues.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsPrintRepeatedValues(String value) {
        this.isPrintRepeatedValues = value;
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
     * Recupera il valore della proprietà x.
     *
     * @return possible object is
     * {@link String }
     */
    public String getX() {
        return x;
    }

    /**
     * Imposta il valore della proprietà x.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Recupera il valore della proprietà y.
     *
     * @return possible object is
     * {@link String }
     */
    public String getY() {
        return y;
    }

    /**
     * Imposta il valore della proprietà y.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setY(String value) {
        this.y = value;
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
     * Recupera il valore della proprietà isRemoveLineWhenBlank.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsRemoveLineWhenBlank() {
        if (isRemoveLineWhenBlank == null) {
            return "false";
        } else {
            return isRemoveLineWhenBlank;
        }
    }

    /**
     * Imposta il valore della proprietà isRemoveLineWhenBlank.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsRemoveLineWhenBlank(String value) {
        this.isRemoveLineWhenBlank = value;
    }

    /**
     * Recupera il valore della proprietà isPrintInFirstWholeBand.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsPrintInFirstWholeBand() {
        if (isPrintInFirstWholeBand == null) {
            return "false";
        } else {
            return isPrintInFirstWholeBand;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintInFirstWholeBand.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsPrintInFirstWholeBand(String value) {
        this.isPrintInFirstWholeBand = value;
    }

    /**
     * Recupera il valore della proprietà isPrintWhenDetailOverflows.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsPrintWhenDetailOverflows() {
        if (isPrintWhenDetailOverflows == null) {
            return "false";
        } else {
            return isPrintWhenDetailOverflows;
        }
    }

    /**
     * Imposta il valore della proprietà isPrintWhenDetailOverflows.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsPrintWhenDetailOverflows(String value) {
        this.isPrintWhenDetailOverflows = value;
    }

    /**
     * Recupera il valore della proprietà printWhenGroupChanges.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrintWhenGroupChanges() {
        return printWhenGroupChanges;
    }

    /**
     * Imposta il valore della proprietà printWhenGroupChanges.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrintWhenGroupChanges(String value) {
        this.printWhenGroupChanges = value;
    }

    /**
     * Recupera il valore della proprietà forecolor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getForecolor() {
        return forecolor;
    }

    /**
     * Imposta il valore della proprietà forecolor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setForecolor(String value) {
        this.forecolor = value;
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

}
