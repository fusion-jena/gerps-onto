//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.27 at 12:04:25 PM UTC 
//


package uni.jena.fim.codelist.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="document" id="R1"&gt;A code list must have at least one key, unless it is a metadata-only definition without a 'SimpleCodeList' element.&lt;/rule:text&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CodeListDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}DocumentHeader"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}ColumnSetChoice"/&gt;
 *         &lt;group ref="{http://docs.oasis-open.org/codelist/ns/genericode/1.0/}OuterCodeListChoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDocument", propOrder = {
    "annotation",
    "identification",
    "columnSet",
    "columnSetRef",
    "simpleCodeList"
})
public class CodeListDocument {

    @XmlElement(name = "Annotation")
    protected Annotation annotation;
    @XmlElement(name = "Identification", required = true)
    protected Identification identification;
    @XmlElement(name = "ColumnSet")
    protected ColumnSet columnSet;
    @XmlElement(name = "ColumnSetRef")
    protected ColumnSetRef columnSetRef;
    @XmlElement(name = "SimpleCodeList")
    protected SimpleCodeList simpleCodeList;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

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
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the columnSet property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSet }
     *     
     */
    public ColumnSet getColumnSet() {
        return columnSet;
    }

    /**
     * Sets the value of the columnSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSet }
     *     
     */
    public void setColumnSet(ColumnSet value) {
        this.columnSet = value;
    }

    /**
     * Gets the value of the columnSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnSetRef }
     *     
     */
    public ColumnSetRef getColumnSetRef() {
        return columnSetRef;
    }

    /**
     * Sets the value of the columnSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnSetRef }
     *     
     */
    public void setColumnSetRef(ColumnSetRef value) {
        this.columnSetRef = value;
    }

    /**
     * Gets the value of the simpleCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCodeList }
     *     
     */
    public SimpleCodeList getSimpleCodeList() {
        return simpleCodeList;
    }

    /**
     * Sets the value of the simpleCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCodeList }
     *     
     */
    public void setSimpleCodeList(SimpleCodeList value) {
        this.simpleCodeList = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;rule:text xmlns:rule="http://docs.oasis-open.org/codelist/ns/rule/1.0/" xmlns:gc="http://docs.oasis-open.org/codelist/ns/genericode/1.0/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" category="application" id="R2"&gt;xml:base does not apply to canonical URIs.&lt;/rule:text&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
