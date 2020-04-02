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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}reportElement"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textElement" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textFieldExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}patternExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}anchorNameExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkReferenceExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkWhenExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkAnchorExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkPageExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkTooltipExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}hyperlinkParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isStretchWithOverflow"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="textAdjust"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="CutText"/&gt;
 *             &lt;enumeration value="StretchHeight"/&gt;
 *             &lt;enumeration value="ScaleFont"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="evaluationTime" type="{http://jasperreports.sourceforge.net/jasperreports}complexEvaluationTime" default="Now" /&gt;
 *       &lt;attribute name="evaluationGroup" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isBlankWhenNull"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hyperlinkType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="hyperlinkTarget" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bookmarkLevel" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "reportElement",
        "box",
        "textElement",
        "textFieldExpression",
        "patternExpression",
        "anchorNameExpression",
        "hyperlinkReferenceExpression",
        "hyperlinkWhenExpression",
        "hyperlinkAnchorExpression",
        "hyperlinkPageExpression",
        "hyperlinkTooltipExpression",
        "hyperlinkParameter"
})
@XmlRootElement(name = "textField", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class TextField {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports", required = true)
    protected ReportElement reportElement;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Box box;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TextElement textElement;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected TextFieldExpression textFieldExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected Object patternExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected AnchorNameExpression anchorNameExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HyperlinkReferenceExpression hyperlinkReferenceExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HyperlinkWhenExpression hyperlinkWhenExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HyperlinkAnchorExpression hyperlinkAnchorExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HyperlinkPageExpression hyperlinkPageExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected HyperlinkTooltipExpression hyperlinkTooltipExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected List<HyperlinkParameter> hyperlinkParameter;
    @XmlAttribute(name = "isStretchWithOverflow")
    protected String isStretchWithOverflow;
    @XmlAttribute(name = "textAdjust")
    protected String textAdjust;
    @XmlAttribute(name = "evaluationTime")
    protected ComplexEvaluationTime evaluationTime;
    @XmlAttribute(name = "evaluationGroup")
    protected String evaluationGroup;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "isBlankWhenNull")
    protected String isBlankWhenNull;
    @XmlAttribute(name = "hyperlinkType")
    protected String hyperlinkType;
    @XmlAttribute(name = "hyperlinkTarget")
    protected String hyperlinkTarget;
    @XmlAttribute(name = "bookmarkLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookmarkLevel;

    /**
     * Recupera il valore della proprietà reportElement.
     *
     * @return possible object is
     * {@link ReportElement }
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Imposta il valore della proprietà reportElement.
     *
     * @param value allowed object is
     *              {@link ReportElement }
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
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
     * Recupera il valore della proprietà textElement.
     *
     * @return possible object is
     * {@link TextElement }
     */
    public TextElement getTextElement() {
        return textElement;
    }

    /**
     * Imposta il valore della proprietà textElement.
     *
     * @param value allowed object is
     *              {@link TextElement }
     */
    public void setTextElement(TextElement value) {
        this.textElement = value;
    }

    /**
     * Recupera il valore della proprietà textFieldExpression.
     *
     * @return possible object is
     * {@link TextFieldExpression }
     */
    public TextFieldExpression getTextFieldExpression() {
        return textFieldExpression;
    }

    /**
     * Imposta il valore della proprietà textFieldExpression.
     *
     * @param value allowed object is
     *              {@link TextFieldExpression }
     */
    public void setTextFieldExpression(TextFieldExpression value) {
        this.textFieldExpression = value;
    }

    /**
     * Recupera il valore della proprietà patternExpression.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getPatternExpression() {
        return patternExpression;
    }

    /**
     * Imposta il valore della proprietà patternExpression.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setPatternExpression(Object value) {
        this.patternExpression = value;
    }

    /**
     * Recupera il valore della proprietà anchorNameExpression.
     *
     * @return possible object is
     * {@link AnchorNameExpression }
     */
    public AnchorNameExpression getAnchorNameExpression() {
        return anchorNameExpression;
    }

    /**
     * Imposta il valore della proprietà anchorNameExpression.
     *
     * @param value allowed object is
     *              {@link AnchorNameExpression }
     */
    public void setAnchorNameExpression(AnchorNameExpression value) {
        this.anchorNameExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkReferenceExpression.
     *
     * @return possible object is
     * {@link HyperlinkReferenceExpression }
     */
    public HyperlinkReferenceExpression getHyperlinkReferenceExpression() {
        return hyperlinkReferenceExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkReferenceExpression.
     *
     * @param value allowed object is
     *              {@link HyperlinkReferenceExpression }
     */
    public void setHyperlinkReferenceExpression(HyperlinkReferenceExpression value) {
        this.hyperlinkReferenceExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkWhenExpression.
     *
     * @return possible object is
     * {@link HyperlinkWhenExpression }
     */
    public HyperlinkWhenExpression getHyperlinkWhenExpression() {
        return hyperlinkWhenExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkWhenExpression.
     *
     * @param value allowed object is
     *              {@link HyperlinkWhenExpression }
     */
    public void setHyperlinkWhenExpression(HyperlinkWhenExpression value) {
        this.hyperlinkWhenExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkAnchorExpression.
     *
     * @return possible object is
     * {@link HyperlinkAnchorExpression }
     */
    public HyperlinkAnchorExpression getHyperlinkAnchorExpression() {
        return hyperlinkAnchorExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkAnchorExpression.
     *
     * @param value allowed object is
     *              {@link HyperlinkAnchorExpression }
     */
    public void setHyperlinkAnchorExpression(HyperlinkAnchorExpression value) {
        this.hyperlinkAnchorExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkPageExpression.
     *
     * @return possible object is
     * {@link HyperlinkPageExpression }
     */
    public HyperlinkPageExpression getHyperlinkPageExpression() {
        return hyperlinkPageExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkPageExpression.
     *
     * @param value allowed object is
     *              {@link HyperlinkPageExpression }
     */
    public void setHyperlinkPageExpression(HyperlinkPageExpression value) {
        this.hyperlinkPageExpression = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkTooltipExpression.
     *
     * @return possible object is
     * {@link HyperlinkTooltipExpression }
     */
    public HyperlinkTooltipExpression getHyperlinkTooltipExpression() {
        return hyperlinkTooltipExpression;
    }

    /**
     * Imposta il valore della proprietà hyperlinkTooltipExpression.
     *
     * @param value allowed object is
     *              {@link HyperlinkTooltipExpression }
     */
    public void setHyperlinkTooltipExpression(HyperlinkTooltipExpression value) {
        this.hyperlinkTooltipExpression = value;
    }

    /**
     * Gets the value of the hyperlinkParameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hyperlinkParameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHyperlinkParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HyperlinkParameter }
     */
    public List<HyperlinkParameter> getHyperlinkParameter() {
        if (hyperlinkParameter == null) {
            hyperlinkParameter = new ArrayList<HyperlinkParameter>();
        }
        return this.hyperlinkParameter;
    }

    /**
     * Recupera il valore della proprietà isStretchWithOverflow.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsStretchWithOverflow() {
        return isStretchWithOverflow;
    }

    /**
     * Imposta il valore della proprietà isStretchWithOverflow.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsStretchWithOverflow(String value) {
        this.isStretchWithOverflow = value;
    }

    /**
     * Recupera il valore della proprietà textAdjust.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTextAdjust() {
        return textAdjust;
    }

    /**
     * Imposta il valore della proprietà textAdjust.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTextAdjust(String value) {
        this.textAdjust = value;
    }

    /**
     * Recupera il valore della proprietà evaluationTime.
     *
     * @return possible object is
     * {@link ComplexEvaluationTime }
     */
    public ComplexEvaluationTime getEvaluationTime() {
        if (evaluationTime == null) {
            return ComplexEvaluationTime.NOW;
        } else {
            return evaluationTime;
        }
    }

    /**
     * Imposta il valore della proprietà evaluationTime.
     *
     * @param value allowed object is
     *              {@link ComplexEvaluationTime }
     */
    public void setEvaluationTime(ComplexEvaluationTime value) {
        this.evaluationTime = value;
    }

    /**
     * Recupera il valore della proprietà evaluationGroup.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEvaluationGroup() {
        return evaluationGroup;
    }

    /**
     * Imposta il valore della proprietà evaluationGroup.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEvaluationGroup(String value) {
        this.evaluationGroup = value;
    }

    /**
     * Recupera il valore della proprietà pattern.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Imposta il valore della proprietà pattern.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Recupera il valore della proprietà isBlankWhenNull.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsBlankWhenNull() {
        return isBlankWhenNull;
    }

    /**
     * Imposta il valore della proprietà isBlankWhenNull.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsBlankWhenNull(String value) {
        this.isBlankWhenNull = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkType.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHyperlinkType() {
        return hyperlinkType;
    }

    /**
     * Imposta il valore della proprietà hyperlinkType.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHyperlinkType(String value) {
        this.hyperlinkType = value;
    }

    /**
     * Recupera il valore della proprietà hyperlinkTarget.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHyperlinkTarget() {
        return hyperlinkTarget;
    }

    /**
     * Imposta il valore della proprietà hyperlinkTarget.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHyperlinkTarget(String value) {
        this.hyperlinkTarget = value;
    }

    /**
     * Recupera il valore della proprietà bookmarkLevel.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookmarkLevel() {
        if (bookmarkLevel == null) {
            return "0";
        } else {
            return bookmarkLevel;
        }
    }

    /**
     * Imposta il valore della proprietà bookmarkLevel.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookmarkLevel(String value) {
        this.bookmarkLevel = value;
    }

}
