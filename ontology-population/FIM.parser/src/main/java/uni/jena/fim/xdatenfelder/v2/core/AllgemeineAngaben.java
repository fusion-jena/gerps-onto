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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Allgemeine Angaben, die in allen Bausteinen enthalten sind.
 * 
 * <p>Java class for AllgemeineAngaben complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllgemeineAngaben"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifikation" type="{urn:xoev-de:fim:standard:xdatenfelder_2}ElementIdentifikation"/&gt;
 *         &lt;element name="name" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="bezeichnungEingabe" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="bezeichnungAusgabe" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="beschreibung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="definition" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="bezug" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="status" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Code.Status"/&gt;
 *         &lt;element name="gueltigAb" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fachlicherErsteller" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="versionshinweis" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="freigabedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="veroeffentlichungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllgemeineAngaben", propOrder = {
    "identifikation",
    "name",
    "bezeichnungEingabe",
    "bezeichnungAusgabe",
    "beschreibung",
    "definition",
    "bezug",
    "status",
    "gueltigAb",
    "gueltigBis",
    "fachlicherErsteller",
    "versionshinweis",
    "freigabedatum",
    "veroeffentlichungsdatum"
})
@XmlSeeAlso({
    Dokumentsteckbrief.class,
    Stammdatenschema.class,
    Codeliste.class,
    Regel.class,
    Schemaelementangaben.class
})
public abstract class AllgemeineAngaben {

    @XmlElement(required = true)
    protected ElementIdentifikation identifikation;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String bezeichnungEingabe;
    protected String bezeichnungAusgabe;
    @XmlElement(required = true)
    protected String beschreibung;
    @XmlElement(required = true)
    protected String definition;
    @XmlElement(required = true)
    protected String bezug;
    @XmlElement(required = true)
    protected CodeStatus status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigAb;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gueltigBis;
    protected String fachlicherErsteller;
    protected String versionshinweis;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar freigabedatum;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar veroeffentlichungsdatum;

    /**
     * Gets the value of the identifikation property.
     * 
     * @return
     *     possible object is
     *     {@link ElementIdentifikation }
     *     
     */
    public ElementIdentifikation getIdentifikation() {
        return identifikation;
    }

    /**
     * Sets the value of the identifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementIdentifikation }
     *     
     */
    public void setIdentifikation(ElementIdentifikation value) {
        this.identifikation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bezeichnungEingabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungEingabe() {
        return bezeichnungEingabe;
    }

    /**
     * Sets the value of the bezeichnungEingabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungEingabe(String value) {
        this.bezeichnungEingabe = value;
    }

    /**
     * Gets the value of the bezeichnungAusgabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungAusgabe() {
        return bezeichnungAusgabe;
    }

    /**
     * Sets the value of the bezeichnungAusgabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungAusgabe(String value) {
        this.bezeichnungAusgabe = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the bezug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezug() {
        return bezug;
    }

    /**
     * Sets the value of the bezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezug(String value) {
        this.bezug = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeStatus }
     *     
     */
    public CodeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeStatus }
     *     
     */
    public void setStatus(CodeStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the gueltigAb property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigAb() {
        return gueltigAb;
    }

    /**
     * Sets the value of the gueltigAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigAb(XMLGregorianCalendar value) {
        this.gueltigAb = value;
    }

    /**
     * Gets the value of the gueltigBis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the value of the gueltigBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigBis(XMLGregorianCalendar value) {
        this.gueltigBis = value;
    }

    /**
     * Gets the value of the fachlicherErsteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFachlicherErsteller() {
        return fachlicherErsteller;
    }

    /**
     * Sets the value of the fachlicherErsteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFachlicherErsteller(String value) {
        this.fachlicherErsteller = value;
    }

    /**
     * Gets the value of the versionshinweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionshinweis() {
        return versionshinweis;
    }

    /**
     * Sets the value of the versionshinweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionshinweis(String value) {
        this.versionshinweis = value;
    }

    /**
     * Gets the value of the freigabedatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFreigabedatum() {
        return freigabedatum;
    }

    /**
     * Sets the value of the freigabedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFreigabedatum(XMLGregorianCalendar value) {
        this.freigabedatum = value;
    }

    /**
     * Gets the value of the veroeffentlichungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVeroeffentlichungsdatum() {
        return veroeffentlichungsdatum;
    }

    /**
     * Sets the value of the veroeffentlichungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVeroeffentlichungsdatum(XMLGregorianCalendar value) {
        this.veroeffentlichungsdatum = value;
    }

}