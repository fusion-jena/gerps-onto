//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.06 at 11:34:55 AM UTC 
//


package uni.jena.fim.xdatenfelder.v2.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstrakte Basisklasse, um die verschiedene Arten von Suchergebnissen darstellen zu können (entsprich dem XSD Choice).
 * 
 * <p>Java class for Suchergebnis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suchergebnis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="dokumentsteckbrief" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Dokumentsteckbrief"/&gt;
 *         &lt;element name="stammdatenschema" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Stammdatenschema"/&gt;
 *         &lt;element name="datenfeldgruppe" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Datenfeldgruppe"/&gt;
 *         &lt;element name="datenfeld" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Datenfeld"/&gt;
 *         &lt;element name="codeliste" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Codeliste"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suchergebnis", propOrder = {
    "dokumentsteckbrief",
    "stammdatenschema",
    "datenfeldgruppe",
    "datenfeld",
    "codeliste"
})
public class Suchergebnis {

    protected Dokumentsteckbrief dokumentsteckbrief;
    protected Stammdatenschema stammdatenschema;
    protected Datenfeldgruppe datenfeldgruppe;
    protected Datenfeld datenfeld;
    protected Codeliste codeliste;

    /**
     * Gets the value of the dokumentsteckbrief property.
     * 
     * @return
     *     possible object is
     *     {@link Dokumentsteckbrief }
     *     
     */
    public Dokumentsteckbrief getDokumentsteckbrief() {
        return dokumentsteckbrief;
    }

    /**
     * Sets the value of the dokumentsteckbrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dokumentsteckbrief }
     *     
     */
    public void setDokumentsteckbrief(Dokumentsteckbrief value) {
        this.dokumentsteckbrief = value;
    }

    /**
     * Gets the value of the stammdatenschema property.
     * 
     * @return
     *     possible object is
     *     {@link Stammdatenschema }
     *     
     */
    public Stammdatenschema getStammdatenschema() {
        return stammdatenschema;
    }

    /**
     * Sets the value of the stammdatenschema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stammdatenschema }
     *     
     */
    public void setStammdatenschema(Stammdatenschema value) {
        this.stammdatenschema = value;
    }

    /**
     * Gets the value of the datenfeldgruppe property.
     * 
     * @return
     *     possible object is
     *     {@link Datenfeldgruppe }
     *     
     */
    public Datenfeldgruppe getDatenfeldgruppe() {
        return datenfeldgruppe;
    }

    /**
     * Sets the value of the datenfeldgruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datenfeldgruppe }
     *     
     */
    public void setDatenfeldgruppe(Datenfeldgruppe value) {
        this.datenfeldgruppe = value;
    }

    /**
     * Gets the value of the datenfeld property.
     * 
     * @return
     *     possible object is
     *     {@link Datenfeld }
     *     
     */
    public Datenfeld getDatenfeld() {
        return datenfeld;
    }

    /**
     * Sets the value of the datenfeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datenfeld }
     *     
     */
    public void setDatenfeld(Datenfeld value) {
        this.datenfeld = value;
    }

    /**
     * Gets the value of the codeliste property.
     * 
     * @return
     *     possible object is
     *     {@link Codeliste }
     *     
     */
    public Codeliste getCodeliste() {
        return codeliste;
    }

    /**
     * Sets the value of the codeliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Codeliste }
     *     
     */
    public void setCodeliste(Codeliste value) {
        this.codeliste = value;
    }

}