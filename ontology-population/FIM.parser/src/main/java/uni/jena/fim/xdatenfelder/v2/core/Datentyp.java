//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.06 at 11:34:55 AM UTC 
//


package uni.jena.fim.xdatenfelder.v2.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Datentyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Datentyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="bool"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="num"/&gt;
 *     &lt;enumeration value="num_currency"/&gt;
 *     &lt;enumeration value="num_int"/&gt;
 *     &lt;enumeration value="obj"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Datentyp")
@XmlEnum
public enum Datentyp {

    @XmlEnumValue("bool")
    BOOL("bool"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("num")
    NUM("num"),
    @XmlEnumValue("num_currency")
    NUM_CURRENCY("num_currency"),
    @XmlEnumValue("num_int")
    NUM_INT("num_int"),
    @XmlEnumValue("obj")
    OBJ("obj"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    Datentyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Datentyp fromValue(String v) {
        for (Datentyp c: Datentyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}