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
import javax.xml.bind.annotation.XmlType;


/**
 * Der Prozesssteckbrief enthält beschreibende Informationen zu einem Prozess, ohne die Abläufe im Detail zu betrachten.
 * 
 * <p>Java class for Prozesssteckbrief complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prozesssteckbrief"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="definition" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="beschreibung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="ausloeser" type="{http://www.regierung-mv.de/xprozess/2}AusloeserErgebnis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ergebnis" type="{http://www.regierung-mv.de/xprozess/2}AusloeserErgebnis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prozessteilnehmer" type="{http://www.regierung-mv.de/xprozess/2}Prozessteilnehmer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="handlungsgrundlage" type="{http://www.regierung-mv.de/xprozess/2}Handlungsgrundlage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detaillierungsstufe" type="{http://www.regierung-mv.de/xprozess/2}Code.Detaillierungsstufe" minOccurs="0"/&gt;
 *         &lt;element name="verwaltungspolitischeKodierung" type="{http://www.regierung-mv.de/xprozess/2}VerwaltungspolitischeKodierung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="zielvorgaben" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="merkmal" type="{http://www.regierung-mv.de/xprozess/2}Merkmal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prozesssteckbrief", propOrder = {
    "definition",
    "beschreibung",
    "ausloeser",
    "ergebnis",
    "prozessteilnehmer",
    "handlungsgrundlage",
    "detaillierungsstufe",
    "verwaltungspolitischeKodierung",
    "zielvorgaben",
    "merkmal"
})
public class Prozesssteckbrief {

    protected String definition;
    protected String beschreibung;
    protected List<AusloeserErgebnis> ausloeser;
    protected List<AusloeserErgebnis> ergebnis;
    protected List<Prozessteilnehmer> prozessteilnehmer;
    protected List<Handlungsgrundlage> handlungsgrundlage;
    protected CodeDetaillierungsstufe detaillierungsstufe;
    protected List<VerwaltungspolitischeKodierung> verwaltungspolitischeKodierung;
    protected String zielvorgaben;
    protected List<Merkmal> merkmal;

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
     * Gets the value of the ausloeser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ausloeser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAusloeser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AusloeserErgebnis }
     * 
     * 
     */
    public List<AusloeserErgebnis> getAusloeser() {
        if (ausloeser == null) {
            ausloeser = new ArrayList<AusloeserErgebnis>();
        }
        return this.ausloeser;
    }

    /**
     * Gets the value of the ergebnis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ergebnis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErgebnis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AusloeserErgebnis }
     * 
     * 
     */
    public List<AusloeserErgebnis> getErgebnis() {
        if (ergebnis == null) {
            ergebnis = new ArrayList<AusloeserErgebnis>();
        }
        return this.ergebnis;
    }

    /**
     * Gets the value of the prozessteilnehmer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prozessteilnehmer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProzessteilnehmer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prozessteilnehmer }
     * 
     * 
     */
    public List<Prozessteilnehmer> getProzessteilnehmer() {
        if (prozessteilnehmer == null) {
            prozessteilnehmer = new ArrayList<Prozessteilnehmer>();
        }
        return this.prozessteilnehmer;
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
     * Gets the value of the detaillierungsstufe property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetaillierungsstufe }
     *     
     */
    public CodeDetaillierungsstufe getDetaillierungsstufe() {
        return detaillierungsstufe;
    }

    /**
     * Sets the value of the detaillierungsstufe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetaillierungsstufe }
     *     
     */
    public void setDetaillierungsstufe(CodeDetaillierungsstufe value) {
        this.detaillierungsstufe = value;
    }

    /**
     * Gets the value of the verwaltungspolitischeKodierung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verwaltungspolitischeKodierung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwaltungspolitischeKodierung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerwaltungspolitischeKodierung }
     * 
     * 
     */
    public List<VerwaltungspolitischeKodierung> getVerwaltungspolitischeKodierung() {
        if (verwaltungspolitischeKodierung == null) {
            verwaltungspolitischeKodierung = new ArrayList<VerwaltungspolitischeKodierung>();
        }
        return this.verwaltungspolitischeKodierung;
    }

    /**
     * Gets the value of the zielvorgaben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZielvorgaben() {
        return zielvorgaben;
    }

    /**
     * Sets the value of the zielvorgaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZielvorgaben(String value) {
        this.zielvorgaben = value;
    }

    /**
     * Gets the value of the merkmal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merkmal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerkmal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Merkmal }
     * 
     * 
     */
    public List<Merkmal> getMerkmal() {
        if (merkmal == null) {
            merkmal = new ArrayList<Merkmal>();
        }
        return this.merkmal;
    }

}
