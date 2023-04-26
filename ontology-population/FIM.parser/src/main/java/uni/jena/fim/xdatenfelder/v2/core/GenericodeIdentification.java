//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.06 at 11:34:55 AM UTC 
//


package uni.jena.fim.xdatenfelder.v2.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifikation einer Genericode-Codeliste.
 * 
 * <p>Java class for GenericodeIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericodeIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="canonicalIdentification" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="canonicalVersionUri" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericodeIdentification", propOrder = {
    "canonicalIdentification",
    "version",
    "canonicalVersionUri"
})
public class GenericodeIdentification {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String canonicalIdentification;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String canonicalVersionUri;

    /**
     * Gets the value of the canonicalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalIdentification() {
        return canonicalIdentification;
    }

    /**
     * Sets the value of the canonicalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalIdentification(String value) {
        this.canonicalIdentification = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the canonicalVersionUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalVersionUri() {
        return canonicalVersionUri;
    }

    /**
     * Sets the value of the canonicalVersionUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalVersionUri(String value) {
        this.canonicalVersionUri = value;
    }

}
