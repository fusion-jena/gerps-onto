//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.06 at 10:07:40 AM UTC 
//


package uni.jena.fim.xprocess.v2.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * In der FIM-Methodik bündelt eine Aktivitätengruppe thematisch zusammengehörige Prozess-Elemente (z.B. feingliedrige Aufgaben). Aktivitätengruppen, die über ein- oder ausgehende Nachrichten kommunizieren, enthalten für jede Nachricht einen Verweis auf den Formularsteckbrief.
 * 
 * <p>Java class for Aktivitaetengruppe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aktivitaetengruppe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenzaktivitaetengruppeTyp" type="{http://www.regierung-mv.de/xprozess/2}Code.Referenzaktivitaetengruppe"/&gt;
 *         &lt;element name="referenzaktivitaetengruppeVersion" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="id" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="subProzessID" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="name" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="beschreibung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="handlungsgrundlage" type="{http://www.regierung-mv.de/xprozess/2}Handlungsgrundlage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eingehendeDaten" type="{http://www.regierung-mv.de/xprozess/2}Daten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ausgehendeDaten" type="{http://www.regierung-mv.de/xprozess/2}Daten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fachverfahren" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spezifischeAttribute" type="{http://www.regierung-mv.de/xprozess/2}SpezifischeAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aktivitaetengruppe", propOrder = {
    "referenzaktivitaetengruppeTyp",
    "referenzaktivitaetengruppeVersion",
    "id",
    "subProzessID",
    "name",
    "beschreibung",
    "handlungsgrundlage",
    "eingehendeDaten",
    "ausgehendeDaten",
    "fachverfahren",
    "spezifischeAttribute"
})
public class Aktivitaetengruppe {

    @XmlElement(required = true)
    protected CodeReferenzaktivitaetengruppe referenzaktivitaetengruppeTyp;
    @XmlElement(required = true)
    protected String referenzaktivitaetengruppeVersion;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String subProzessID;
    @XmlElement(required = true)
    protected String name;
    protected String beschreibung;
    protected List<Handlungsgrundlage> handlungsgrundlage;
    protected List<Daten> eingehendeDaten;
    protected List<Daten> ausgehendeDaten;
    protected List<String> fachverfahren;
    @XmlElement(required = true)
    protected SpezifischeAttribute spezifischeAttribute;

    /**
     * Gets the value of the referenzaktivitaetengruppeTyp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeReferenzaktivitaetengruppe }
     *     
     */
    public CodeReferenzaktivitaetengruppe getReferenzaktivitaetengruppeTyp() {
        return referenzaktivitaetengruppeTyp;
    }

    /**
     * Sets the value of the referenzaktivitaetengruppeTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeReferenzaktivitaetengruppe }
     *     
     */
    public void setReferenzaktivitaetengruppeTyp(CodeReferenzaktivitaetengruppe value) {
        this.referenzaktivitaetengruppeTyp = value;
    }

    /**
     * Gets the value of the referenzaktivitaetengruppeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzaktivitaetengruppeVersion() {
        return referenzaktivitaetengruppeVersion;
    }

    /**
     * Sets the value of the referenzaktivitaetengruppeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzaktivitaetengruppeVersion(String value) {
        this.referenzaktivitaetengruppeVersion = value;
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
     * Gets the value of the subProzessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProzessID() {
        return subProzessID;
    }

    /**
     * Sets the value of the subProzessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProzessID(String value) {
        this.subProzessID = value;
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
     * Gets the value of the handlungsgrundlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlungsgrundlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlungsgrundlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Handlungsgrundlage }
     * 
     * 
     */
    public List<Handlungsgrundlage> getHandlungsgrundlage() {
        if (handlungsgrundlage == null) {
            handlungsgrundlage = new ArrayList<Handlungsgrundlage>();
        }
        return this.handlungsgrundlage;
    }

    /**
     * Gets the value of the eingehendeDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eingehendeDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEingehendeDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Daten }
     * 
     * 
     */
    public List<Daten> getEingehendeDaten() {
        if (eingehendeDaten == null) {
            eingehendeDaten = new ArrayList<Daten>();
        }
        return this.eingehendeDaten;
    }

    /**
     * Gets the value of the ausgehendeDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausgehendeDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusgehendeDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Daten }
     * 
     * 
     */
    public List<Daten> getAusgehendeDaten() {
        if (ausgehendeDaten == null) {
            ausgehendeDaten = new ArrayList<Daten>();
        }
        return this.ausgehendeDaten;
    }

    /**
     * Gets the value of the fachverfahren property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fachverfahren property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFachverfahren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFachverfahren() {
        if (fachverfahren == null) {
            fachverfahren = new ArrayList<String>();
        }
        return this.fachverfahren;
    }

    /**
     * Gets the value of the spezifischeAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link SpezifischeAttribute }
     *     
     */
    public SpezifischeAttribute getSpezifischeAttribute() {
        return spezifischeAttribute;
    }

    /**
     * Sets the value of the spezifischeAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpezifischeAttribute }
     *     
     */
    public void setSpezifischeAttribute(SpezifischeAttribute value) {
        this.spezifischeAttribute = value;
    }

}