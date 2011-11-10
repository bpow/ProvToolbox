//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.10 at 10:15:17 AM GMT 
//


package org.openprovenance.prov.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for WasControlledBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WasControlledBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effect" type="{http://openprovenance.org/prov-xml#}ProcessExecutionRef"/>
 *         &lt;element name="role" type="{http://openprovenance.org/prov-xml#}Role"/>
 *         &lt;element name="cause" type="{http://openprovenance.org/prov-xml#}AgentRef"/>
 *         &lt;element name="account" type="{http://openprovenance.org/prov-xml#}AccountRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://openprovenance.org/prov-xml#}OTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://openprovenance.org/prov-xml#}OTime" minOccurs="0"/>
 *         &lt;element ref="{http://openprovenance.org/prov-xml#}annotation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WasControlledBy", namespace = "http://openprovenance.org/prov-xml#", propOrder = {
    "effect",
    "role",
    "cause",
    "account",
    "startTime",
    "endTime",
    "annotation"
})
public class WasControlledBy implements Relation, Equals, HashCode, ToString
{

    @XmlElement(namespace = "http://openprovenance.org/prov-xml#", required = true)
    protected ProcessExecutionRef effect;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#", required = true)
    protected Role role;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#", required = true)
    protected AgentRef cause;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#")
    protected List<AccountRef> account;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#")
    protected OTime startTime;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#")
    protected OTime endTime;
    @XmlElement(namespace = "http://openprovenance.org/prov-xml#", required = true)
    protected EmbeddedAnnotation annotation;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessExecutionRef }
     *     
     */
    public ProcessExecutionRef getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessExecutionRef }
     *     
     */
    public void setEffect(ProcessExecutionRef value) {
        this.effect = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Role }
     *     
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role }
     *     
     */
    public void setRole(Role value) {
        this.role = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link AgentRef }
     *     
     */
    public AgentRef getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentRef }
     *     
     */
    public void setCause(AgentRef value) {
        this.cause = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRef }
     * 
     * 
     */
    public List<AccountRef> getAccount() {
        if (account == null) {
            account = new ArrayList<AccountRef>();
        }
        return this.account;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link OTime }
     *     
     */
    public OTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTime }
     *     
     */
    public void setStartTime(OTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link OTime }
     *     
     */
    public OTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTime }
     *     
     */
    public void setEndTime(OTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedAnnotation }
     *     
     */
    public EmbeddedAnnotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedAnnotation }
     *     
     */
    public void setAnnotation(EmbeddedAnnotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof WasControlledBy)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final WasControlledBy that = ((WasControlledBy) object);
        equalsBuilder.append(this.getEffect(), that.getEffect());
        equalsBuilder.append(this.getRole(), that.getRole());
        equalsBuilder.append(this.getCause(), that.getCause());
        equalsBuilder.append(this.getAccount(), that.getAccount());
        equalsBuilder.append(this.getStartTime(), that.getStartTime());
        equalsBuilder.append(this.getEndTime(), that.getEndTime());
        equalsBuilder.append(this.getAnnotation(), that.getAnnotation());
        equalsBuilder.append(this.getId(), that.getId());
    }

    public boolean equals(Object object) {
        if (!(object instanceof WasControlledBy)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getEffect());
        hashCodeBuilder.append(this.getRole());
        hashCodeBuilder.append(this.getCause());
        hashCodeBuilder.append(this.getAccount());
        hashCodeBuilder.append(this.getStartTime());
        hashCodeBuilder.append(this.getEndTime());
        hashCodeBuilder.append(this.getAnnotation());
        hashCodeBuilder.append(this.getId());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            ProcessExecutionRef theEffect;
            theEffect = this.getEffect();
            toStringBuilder.append("effect", theEffect);
        }
        {
            Role theRole;
            theRole = this.getRole();
            toStringBuilder.append("role", theRole);
        }
        {
            AgentRef theCause;
            theCause = this.getCause();
            toStringBuilder.append("cause", theCause);
        }
        {
            List<AccountRef> theAccount;
            theAccount = this.getAccount();
            toStringBuilder.append("account", theAccount);
        }
        {
            OTime theStartTime;
            theStartTime = this.getStartTime();
            toStringBuilder.append("startTime", theStartTime);
        }
        {
            OTime theEndTime;
            theEndTime = this.getEndTime();
            toStringBuilder.append("endTime", theEndTime);
        }
        {
            EmbeddedAnnotation theAnnotation;
            theAnnotation = this.getAnnotation();
            toStringBuilder.append("annotation", theAnnotation);
        }
        {
            String theId;
            theId = this.getId();
            toStringBuilder.append("id", theId);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}
