//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.2 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.04.02 alle 10:15:55 PM CEST 
//


package net.digistar.vanadio.core.jasper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per basicEvaluationTime.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="basicEvaluationTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Now"/&gt;
 *     &lt;enumeration value="Report"/&gt;
 *     &lt;enumeration value="Page"/&gt;
 *     &lt;enumeration value="Column"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Band"/&gt;
 *     &lt;enumeration value="Master"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "basicEvaluationTime", namespace = "http://jasperreports.sourceforge.net/jasperreports")
@XmlEnum
public enum BasicEvaluationTime {

    @XmlEnumValue("Now")
    NOW("Now"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("Page")
    PAGE("Page"),
    @XmlEnumValue("Column")
    COLUMN("Column"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Band")
    BAND("Band"),
    @XmlEnumValue("Master")
    MASTER("Master");
    private final String value;

    BasicEvaluationTime(String v) {
        value = v;
    }

    public static BasicEvaluationTime fromValue(String v) {
        for (BasicEvaluationTime c : BasicEvaluationTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
