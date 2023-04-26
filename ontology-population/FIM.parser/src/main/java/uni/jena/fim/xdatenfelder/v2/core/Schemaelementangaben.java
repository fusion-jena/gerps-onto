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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstrakte Basisklasse für Elemente eines Stammdatenschemas (Gruppen und Felder).
 * 
 * <p>Java class for Schemaelementangaben complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schemaelementangaben"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:xoev-de:fim:standard:xdatenfelder_2}AllgemeineAngaben"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schemaelementart" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Code.Schemaelementart"/&gt;
 *         &lt;element name="hilfetextEingabe" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="hilfetextAusgabe" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schemaelementangaben", propOrder = {
    "schemaelementart",
    "hilfetextEingabe",
    "hilfetextAusgabe"
})
@XmlSeeAlso({
    Datenfeldgruppe.class,
    Datenfeld.class
})
public abstract class Schemaelementangaben
    extends AllgemeineAngaben
{

    @XmlElement(required = true)
    protected CodeSchemaelementart schemaelementart;
    @XmlElement(required = true)
    protected String hilfetextEingabe;
    @XmlElement(required = true)
    protected String hilfetextAusgabe;

    /**
     * Gets the value of the schemaelementart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSchemaelementart }
     *     
     */
    public CodeSchemaelementart getSchemaelementart() {
        return schemaelementart;
    }

    /**
     * Sets the value of the schemaelementart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSchemaelementart }
     *     
     */
    public void setSchemaelementart(CodeSchemaelementart value) {
        this.schemaelementart = value;
    }

    /**
     * Gets the value of the hilfetextEingabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHilfetextEingabe() {
        return hilfetextEingabe;
    }

    /**
     * Sets the value of the hilfetextEingabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHilfetextEingabe(String value) {
        this.hilfetextEingabe = value;
    }

    /**
     * Gets the value of the hilfetextAusgabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHilfetextAusgabe() {
        return hilfetextAusgabe;
    }

    /**
     * Sets the value of the hilfetextAusgabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHilfetextAusgabe(String value) {
        this.hilfetextAusgabe = value;
    }

}