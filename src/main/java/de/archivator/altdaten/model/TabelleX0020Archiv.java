//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.09 at 02:45:01 PM CET 
//


package de.archivator.altdaten.model;

import java.math.BigInteger;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schubfach_x0020_Nummer" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Objekt_x0020_Nummer" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schule" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Abteilung" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Betreff" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dokumentenart_x0020_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dokumentenart_x0020_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Dokumentenart_x0020_3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Inhalt" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="536870910"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_x0020_6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Datum_x0020_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Datum_x0020_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Datum_x0020_3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Schlagwort_x0020_6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "schubfachX0020Nummer",
    "objektX0020Nummer",
    "schule",
    "abteilung",
    "betreff",
    "dokumentenartX00201",
    "dokumentenartX00202",
    "dokumentenartX00203",
    "inhalt",
    "nameX00201",
    "nameX00202",
    "nameX00203",
    "nameX00204",
    "nameX00205",
    "nameX00206",
    "datumX00201",
    "datumX00202",
    "datumX00203",
    "schlagwortX00201",
    "schlagwortX00202",
    "schlagwortX00203",
    "schlagwortX00204",
    "schlagwortX00205",
    "schlagwortX00206"
})
@XmlRootElement(name = "Tabelle_x0020_Archiv")
public class TabelleX0020Archiv {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "Schubfach_x0020_Nummer")
    protected Short schubfachX0020Nummer;
    @XmlElement(name = "Objekt_x0020_Nummer")
    protected String objektX0020Nummer;
    @XmlElement(name = "Schule")
    protected BigInteger schule;
    @XmlElement(name = "Abteilung")
    protected String abteilung;
    @XmlElement(name = "Betreff")
    protected String betreff;
    @XmlElement(name = "Dokumentenart_x0020_1")
    protected String dokumentenartX00201;
    @XmlElement(name = "Dokumentenart_x0020_2")
    protected String dokumentenartX00202;
    @XmlElement(name = "Dokumentenart_x0020_3")
    protected String dokumentenartX00203;
    @XmlElement(name = "Inhalt")
    protected String inhalt;
    @XmlElement(name = "Name_x0020_1")
    protected String nameX00201;
    @XmlElement(name = "Name_x0020_2")
    protected String nameX00202;
    @XmlElement(name = "Name_x0020_3")
    protected String nameX00203;
    @XmlElement(name = "Name_x0020_4")
    protected String nameX00204;
    @XmlElement(name = "Name_x0020_5")
    protected String nameX00205;
    @XmlElement(name = "Name_x0020_6")
    protected String nameX00206;
    @XmlElement(name = "Datum_x0020_1")
    protected String datumX00201;
    @XmlElement(name = "Datum_x0020_2")
    protected String datumX00202;
    @XmlElement(name = "Datum_x0020_3")
    protected String datumX00203;
    @XmlElement(name = "Schlagwort_x0020_1")
    protected String schlagwortX00201;
    @XmlElement(name = "Schlagwort_x0020_2")
    protected String schlagwortX00202;
    @XmlElement(name = "Schlagwort_x0020_3")
    protected String schlagwortX00203;
    @XmlElement(name = "Schlagwort_x0020_4")
    protected String schlagwortX00204;
    @XmlElement(name = "Schlagwort_x0020_5")
    protected String schlagwortX00205;
    @XmlElement(name = "Schlagwort_x0020_6")
    protected String schlagwortX00206;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the schubfachX0020Nummer property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSchubfachX0020Nummer() {
        return schubfachX0020Nummer;
    }

    /**
     * Sets the value of the schubfachX0020Nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSchubfachX0020Nummer(Short value) {
        this.schubfachX0020Nummer = value;
    }

    /**
     * Gets the value of the objektX0020Nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektX0020Nummer() {
        return objektX0020Nummer;
    }

    /**
     * Sets the value of the objektX0020Nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektX0020Nummer(String value) {
        this.objektX0020Nummer = value;
    }

    /**
     * Gets the value of the schule property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSchule() {
        return schule;
    }

    /**
     * Sets the value of the schule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSchule(BigInteger value) {
        this.schule = value;
    }

    /**
     * Gets the value of the abteilung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the value of the abteilung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbteilung(String value) {
        this.abteilung = value;
    }

    /**
     * Gets the value of the betreff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetreff() {
        return betreff;
    }

    /**
     * Sets the value of the betreff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetreff(String value) {
        this.betreff = value;
    }

    /**
     * Gets the value of the dokumentenartX00201 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumentenartX00201() {
        return dokumentenartX00201;
    }

    /**
     * Sets the value of the dokumentenartX00201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumentenartX00201(String value) {
        this.dokumentenartX00201 = value;
    }

    /**
     * Gets the value of the dokumentenartX00202 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumentenartX00202() {
        return dokumentenartX00202;
    }

    /**
     * Sets the value of the dokumentenartX00202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumentenartX00202(String value) {
        this.dokumentenartX00202 = value;
    }

    /**
     * Gets the value of the dokumentenartX00203 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumentenartX00203() {
        return dokumentenartX00203;
    }

    /**
     * Sets the value of the dokumentenartX00203 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumentenartX00203(String value) {
        this.dokumentenartX00203 = value;
    }

    /**
     * Gets the value of the inhalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhalt() {
        return inhalt;
    }

    /**
     * Sets the value of the inhalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhalt(String value) {
        this.inhalt = value;
    }

    /**
     * Gets the value of the nameX00201 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00201() {
        return nameX00201;
    }

    /**
     * Sets the value of the nameX00201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00201(String value) {
        this.nameX00201 = value;
    }

    /**
     * Gets the value of the nameX00202 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00202() {
        return nameX00202;
    }

    /**
     * Sets the value of the nameX00202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00202(String value) {
        this.nameX00202 = value;
    }

    /**
     * Gets the value of the nameX00203 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00203() {
        return nameX00203;
    }

    /**
     * Sets the value of the nameX00203 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00203(String value) {
        this.nameX00203 = value;
    }

    /**
     * Gets the value of the nameX00204 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00204() {
        return nameX00204;
    }

    /**
     * Sets the value of the nameX00204 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00204(String value) {
        this.nameX00204 = value;
    }

    /**
     * Gets the value of the nameX00205 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00205() {
        return nameX00205;
    }

    /**
     * Sets the value of the nameX00205 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00205(String value) {
        this.nameX00205 = value;
    }

    /**
     * Gets the value of the nameX00206 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameX00206() {
        return nameX00206;
    }

    /**
     * Sets the value of the nameX00206 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameX00206(String value) {
        this.nameX00206 = value;
    }

    /**
     * Gets the value of the datumX00201 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumX00201() {
        return datumX00201;
    }

    /**
     * Sets the value of the datumX00201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumX00201(String value) {
        this.datumX00201 = value;
    }

    /**
     * Gets the value of the datumX00202 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumX00202() {
        return datumX00202;
    }

    /**
     * Sets the value of the datumX00202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumX00202(String value) {
        this.datumX00202 = value;
    }

    /**
     * Gets the value of the datumX00203 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumX00203() {
        return datumX00203;
    }

    /**
     * Sets the value of the datumX00203 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumX00203(String value) {
        this.datumX00203 = value;
    }

    /**
     * Gets the value of the schlagwortX00201 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00201() {
        return schlagwortX00201;
    }

    /**
     * Sets the value of the schlagwortX00201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00201(String value) {
        this.schlagwortX00201 = value;
    }

    /**
     * Gets the value of the schlagwortX00202 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00202() {
        return schlagwortX00202;
    }

    /**
     * Sets the value of the schlagwortX00202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00202(String value) {
        this.schlagwortX00202 = value;
    }

    /**
     * Gets the value of the schlagwortX00203 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00203() {
        return schlagwortX00203;
    }

    /**
     * Sets the value of the schlagwortX00203 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00203(String value) {
        this.schlagwortX00203 = value;
    }

    /**
     * Gets the value of the schlagwortX00204 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00204() {
        return schlagwortX00204;
    }

    /**
     * Sets the value of the schlagwortX00204 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00204(String value) {
        this.schlagwortX00204 = value;
    }

    /**
     * Gets the value of the schlagwortX00205 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00205() {
        return schlagwortX00205;
    }

    /**
     * Sets the value of the schlagwortX00205 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00205(String value) {
        this.schlagwortX00205 = value;
    }

    /**
     * Gets the value of the schlagwortX00206 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchlagwortX00206() {
        return schlagwortX00206;
    }

    /**
     * Sets the value of the schlagwortX00206 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchlagwortX00206(String value) {
        this.schlagwortX00206 = value;
    }

}