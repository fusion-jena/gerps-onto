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
 * <p>Java class for Code.Suchfeld complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code.Suchfeld"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{urn:xoev-de:fim:standard:xdatenfelder_2}Suchfeld" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:xoev-de:fim:codeliste:xdatenfelder.feld" /&gt;
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.Suchfeld")
public class CodeSuchfeld
    extends Code
{


}
