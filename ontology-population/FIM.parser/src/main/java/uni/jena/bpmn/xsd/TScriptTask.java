//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.21 at 02:07:50 PM UTC 
//


package uni.jena.bpmn.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tScriptTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tScriptTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}script" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scriptFormat" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tScriptTask", propOrder = {
    "script"
})
public class TScriptTask
    extends TTask
{

    protected TScript script;
    @XmlAttribute(name = "scriptFormat")
    protected String scriptFormat;

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link TScript }
     *     
     */
    public TScript getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScript }
     *     
     */
    public void setScript(TScript value) {
        this.script = value;
    }

    /**
     * Gets the value of the scriptFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptFormat() {
        return scriptFormat;
    }

    /**
     * Sets the value of the scriptFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptFormat(String value) {
        this.scriptFormat = value;
    }

}
