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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}orderByExpression" minOccurs="0"/&gt;
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}comparatorExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" /&gt;
 *       &lt;attribute name="order" default="Ascending"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Ascending"/&gt;
 *             &lt;enumeration value="Descending"/&gt;
 *             &lt;enumeration value="None"/&gt;
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
        "bucketExpression",
        "orderByExpression",
        "comparatorExpression"
})
@XmlRootElement(name = "bucket", namespace = "http://jasperreports.sourceforge.net/jasperreports")
public class Bucket {

    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected BucketExpression bucketExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected OrderByExpression orderByExpression;
    @XmlElement(namespace = "http://jasperreports.sourceforge.net/jasperreports")
    protected ComparatorExpression comparatorExpression;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "order")
    protected String order;

    /**
     * Recupera il valore della proprietà bucketExpression.
     *
     * @return possible object is
     * {@link BucketExpression }
     */
    public BucketExpression getBucketExpression() {
        return bucketExpression;
    }

    /**
     * Imposta il valore della proprietà bucketExpression.
     *
     * @param value allowed object is
     *              {@link BucketExpression }
     */
    public void setBucketExpression(BucketExpression value) {
        this.bucketExpression = value;
    }

    /**
     * Recupera il valore della proprietà orderByExpression.
     *
     * @return possible object is
     * {@link OrderByExpression }
     */
    public OrderByExpression getOrderByExpression() {
        return orderByExpression;
    }

    /**
     * Imposta il valore della proprietà orderByExpression.
     *
     * @param value allowed object is
     *              {@link OrderByExpression }
     */
    public void setOrderByExpression(OrderByExpression value) {
        this.orderByExpression = value;
    }

    /**
     * Recupera il valore della proprietà comparatorExpression.
     *
     * @return possible object is
     * {@link ComparatorExpression }
     */
    public ComparatorExpression getComparatorExpression() {
        return comparatorExpression;
    }

    /**
     * Imposta il valore della proprietà comparatorExpression.
     *
     * @param value allowed object is
     *              {@link ComparatorExpression }
     */
    public void setComparatorExpression(ComparatorExpression value) {
        this.comparatorExpression = value;
    }

    /**
     * Recupera il valore della proprietà clazz.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Imposta il valore della proprietà clazz.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Recupera il valore della proprietà order.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrder() {
        if (order == null) {
            return "Ascending";
        } else {
            return order;
        }
    }

    /**
     * Imposta il valore della proprietà order.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrder(String value) {
        this.order = value;
    }

}
