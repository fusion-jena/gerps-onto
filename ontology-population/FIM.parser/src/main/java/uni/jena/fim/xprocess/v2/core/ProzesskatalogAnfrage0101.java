//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.06 at 10:07:40 AM UTC 
//


package uni.jena.fim.xprocess.v2.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.regierung-mv.de/xprozess/2}Basisnachricht"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suchprofil" type="{http://www.regierung-mv.de/xprozess/2}Suchprofil.Prozessklasse" minOccurs="0"/&gt;
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
    "suchprofil"
})
@XmlRootElement(name = "prozesskatalog.anfrage.0101")
public class ProzesskatalogAnfrage0101
    extends Basisnachricht
{

    protected SuchprofilProzessklasse suchprofil;

    /**
     * Gets the value of the suchprofil property.
     * 
     * @return
     *     possible object is
     *     {@link SuchprofilProzessklasse }
     *     
     */
    public SuchprofilProzessklasse getSuchprofil() {
        return suchprofil;
    }

    /**
     * Sets the value of the suchprofil property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuchprofilProzessklasse }
     *     
     */
    public void setSuchprofil(SuchprofilProzessklasse value) {
        this.suchprofil = value;
    }

}
