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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:xoev-de:fim:standard:xdatenfelder_2}Nachricht"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stammdatenschema" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Stammdatenschema"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stammdatenschema"
})
@XmlRootElement(name = "xdatenfelder.stammdatenschema.0102")
public class XdatenfelderStammdatenschema0102
    extends Nachricht
{

    @XmlElement(required = true)
    protected Stammdatenschema stammdatenschema;

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

}