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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for BPMNEdge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNEdge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}LabeledEdge"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="sourceElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="targetElement" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="messageVisibleKind" type="{http://www.omg.org/spec/BPMN/20100524/DI}MessageVisibleKind" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNEdge", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", propOrder = {
    "bpmnLabel"
})
public class BPMNEdge
    extends LabeledEdge
{

    @XmlElement(name = "BPMNLabel")
    protected BPMNLabel bpmnLabel;
    @XmlAttribute(name = "bpmnElement")
    protected QName bpmnElement;
    @XmlAttribute(name = "sourceElement")
    protected QName sourceElement;
    @XmlAttribute(name = "targetElement")
    protected QName targetElement;
    @XmlAttribute(name = "messageVisibleKind")
    protected MessageVisibleKind messageVisibleKind;

    /**
     * Gets the value of the bpmnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link BPMNLabel }
     *     
     */
    public BPMNLabel getBPMNLabel() {
        return bpmnLabel;
    }

    /**
     * Sets the value of the bpmnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNLabel }
     *     
     */
    public void setBPMNLabel(BPMNLabel value) {
        this.bpmnLabel = value;
    }

    /**
     * Gets the value of the bpmnElement property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBpmnElement() {
        return bpmnElement;
    }

    /**
     * Sets the value of the bpmnElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBpmnElement(QName value) {
        this.bpmnElement = value;
    }

    /**
     * Gets the value of the sourceElement property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSourceElement() {
        return sourceElement;
    }

    /**
     * Sets the value of the sourceElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSourceElement(QName value) {
        this.sourceElement = value;
    }

    /**
     * Gets the value of the targetElement property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTargetElement() {
        return targetElement;
    }

    /**
     * Sets the value of the targetElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTargetElement(QName value) {
        this.targetElement = value;
    }

    /**
     * Gets the value of the messageVisibleKind property.
     * 
     * @return
     *     possible object is
     *     {@link MessageVisibleKind }
     *     
     */
    public MessageVisibleKind getMessageVisibleKind() {
        return messageVisibleKind;
    }

    /**
     * Sets the value of the messageVisibleKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageVisibleKind }
     *     
     */
    public void setMessageVisibleKind(MessageVisibleKind value) {
        this.messageVisibleKind = value;
    }

}
