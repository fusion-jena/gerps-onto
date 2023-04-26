//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.06 at 10:07:40 AM UTC 
//


package uni.jena.fim.xprocess.v2.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Daten, die eine Aktivitätengruppe über einen Nachrichtenfluss empfängt.
 * 
 * <p>Java class for Daten.Empfangen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Daten.Empfangen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formularverweis" type="{http://www.regierung-mv.de/xprozess/2}Daten"/&gt;
 *         &lt;element name="uebermittlungsart" type="{http://www.regierung-mv.de/xprozess/2}Code.Uebermittlungsart"/&gt;
 *         &lt;element name="sender" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Daten.Empfangen", propOrder = {
    "formularverweis",
    "uebermittlungsart",
    "sender"
})
public class DatenEmpfangen {

    @XmlElement(required = true)
    protected Daten formularverweis;
    @XmlElement(required = true)
    protected CodeUebermittlungsart uebermittlungsart;
    @XmlElement(required = true)
    protected String sender;

    /**
     * Gets the value of the formularverweis property.
     * 
     * @return
     *     possible object is
     *     {@link Daten }
     *     
     */
    public Daten getFormularverweis() {
        return formularverweis;
    }

    /**
     * Sets the value of the formularverweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Daten }
     *     
     */
    public void setFormularverweis(Daten value) {
        this.formularverweis = value;
    }

    /**
     * Gets the value of the uebermittlungsart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeUebermittlungsart }
     *     
     */
    public CodeUebermittlungsart getUebermittlungsart() {
        return uebermittlungsart;
    }

    /**
     * Sets the value of the uebermittlungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeUebermittlungsart }
     *     
     */
    public void setUebermittlungsart(CodeUebermittlungsart value) {
        this.uebermittlungsart = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

}