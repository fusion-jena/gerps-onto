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
 *         &lt;element name="datenfeldgruppe" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Datenfeldgruppe"/&gt;
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
    "datenfeldgruppe"
})
@XmlRootElement(name = "xdatenfelder.datenfeldgruppe.0103")
public class XdatenfelderDatenfeldgruppe0103
    extends Nachricht
{

    @XmlElement(required = true)
    protected Datenfeldgruppe datenfeldgruppe;

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

}