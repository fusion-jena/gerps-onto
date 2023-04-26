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
 * Eine Sammlung von Prozessen.
 * 
 * <p>Java class for Prozessbibliothek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prozessbibliothek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/&gt;
 *         &lt;element name="version" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/&gt;
 *         &lt;element name="herausgeber" type="{http://www.regierung-mv.de/xprozess/2}Herausgeber" minOccurs="0"/&gt;
 *         &lt;element name="verwaltungspolitischeKodierung" type="{http://www.regierung-mv.de/xprozess/2}VerwaltungspolitischeKodierung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prozess" type="{http://www.regierung-mv.de/xprozess/2}Prozess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prozessbibliothek", propOrder = {
    "name",
    "version",
    "herausgeber",
    "verwaltungspolitischeKodierung",
    "prozess"
})
public class Prozessbibliothek {

    @XmlElement(required = true)
    protected String name;
    protected String version;
    protected Herausgeber herausgeber;
    protected List<VerwaltungspolitischeKodierung> verwaltungspolitischeKodierung;
    protected List<Prozess> prozess;

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
     * Gets the value of the herausgeber property.
     * 
     * @return
     *     possible object is
     *     {@link Herausgeber }
     *     
     */
    public Herausgeber getHerausgeber() {
        return herausgeber;
    }

    /**
     * Sets the value of the herausgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Herausgeber }
     *     
     */
    public void setHerausgeber(Herausgeber value) {
        this.herausgeber = value;
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
     * Gets the value of the prozess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prozess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProzess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prozess }
     * 
     * 
     */
    public List<Prozess> getProzess() {
        if (prozess == null) {
            prozess = new ArrayList<Prozess>();
        }
        return this.prozess;
    }

}