//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.27 at 12:04:25 PM UTC 
//


package uni.jena.fim.codelist.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Definition of a column.
 *   Each column of a code list defines a piece of metadata that can be specified for each item in the code list.
 * 
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Annotation" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Annotation" minOccurs="0"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}NameSet"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}IdentificationVersionUriSet" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}Data"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}IdDefinition"/&gt;
 *       &lt;attGroup ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}RequiredUseDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "annotation",
    "shortName",
    "longName",
    "canonicalUri",
    "canonicalVersionUri",
    "data"
})
public class Column {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "ShortName", required = true)
    protected ShortName shortName;
    @XmlElement(name = "LongName")
    protected List<LongName> longName;
    @XmlElement(name = "CanonicalUri")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalUri;
    @XmlElement(name = "CanonicalVersionUri")
    @XmlSchemaType(name = "anyURI")
    protected String canonicalVersionUri;
    @XmlElement(name = "Data", required = true)
    protected Data data;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Use", required = true)
    protected UseType use;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link ShortName }
     *     
     */
    public ShortName getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortName }
     *     
     */
    public void setShortName(ShortName value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongName }
     * 
     * 
     */
    public List<LongName> getLongName() {
        if (longName == null) {
            longName = new ArrayList<LongName>();
        }
        return this.longName;
    }

    /**
     * Gets the value of the canonicalUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalUri() {
        return canonicalUri;
    }

    /**
     * Sets the value of the canonicalUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalUri(String value) {
        this.canonicalUri = value;
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

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link UseType }
     *     
     */
    public UseType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseType }
     *     
     */
    public void setUse(UseType value) {
        this.use = value;
    }

}
