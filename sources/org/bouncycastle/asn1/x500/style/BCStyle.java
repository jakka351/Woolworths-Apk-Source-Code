package org.bouncycastle.asn1.x500.style;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: classes8.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierU = c.u("2.5.4.6");
        C = aSN1ObjectIdentifierU;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU2 = c.u("2.5.4.10");
        O = aSN1ObjectIdentifierU2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU3 = c.u("2.5.4.11");
        OU = aSN1ObjectIdentifierU3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU4 = c.u("2.5.4.12");
        T = aSN1ObjectIdentifierU4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU5 = c.u("2.5.4.3");
        CN = aSN1ObjectIdentifierU5;
        SN = c.u("2.5.4.5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierU6 = c.u("2.5.4.9");
        STREET = aSN1ObjectIdentifierU6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU7 = c.u("2.5.4.5");
        SERIALNUMBER = aSN1ObjectIdentifierU7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU8 = c.u("2.5.4.7");
        L = aSN1ObjectIdentifierU8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU9 = c.u("2.5.4.8");
        ST = aSN1ObjectIdentifierU9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU10 = c.u("2.5.4.4");
        SURNAME = aSN1ObjectIdentifierU10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU11 = c.u("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifierU11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU12 = c.u("2.5.4.43");
        INITIALS = aSN1ObjectIdentifierU12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU13 = c.u("2.5.4.44");
        GENERATION = aSN1ObjectIdentifierU13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU14 = c.u("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierU14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU15 = c.u("2.5.4.13");
        DESCRIPTION = aSN1ObjectIdentifierU15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU16 = c.u("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifierU16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU17 = c.u("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifierU17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU18 = c.u("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifierU18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU19 = c.u("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifierU19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU20 = c.u("2.5.4.72");
        ROLE = aSN1ObjectIdentifierU20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU21 = c.u("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifierU21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU22 = c.u("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifierU22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU23 = c.u("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifierU23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU24 = c.u("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierU24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU25 = c.u("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierU25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU26 = c.u("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifierU26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU27 = c.u("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifierU27;
        DMD_NAME = c.u("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierU, "C");
        hashtable.put(aSN1ObjectIdentifierU2, "O");
        hashtable.put(aSN1ObjectIdentifierU4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        hashtable.put(aSN1ObjectIdentifierU3, "OU");
        hashtable.put(aSN1ObjectIdentifierU5, "CN");
        hashtable.put(aSN1ObjectIdentifierU8, "L");
        hashtable.put(aSN1ObjectIdentifierU9, "ST");
        hashtable.put(aSN1ObjectIdentifierU7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(aSN1ObjectIdentifierU6, "STREET");
        hashtable.put(aSN1ObjectIdentifierU10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierU11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierU12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierU13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifierU15, "DESCRIPTION");
        hashtable.put(aSN1ObjectIdentifierU20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierU14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierU18, "DN");
        hashtable.put(aSN1ObjectIdentifierU19, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierU27, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierU26, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierU24, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierU25, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierU23, "Gender");
        hashtable.put(aSN1ObjectIdentifierU22, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierU21, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierU17, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierU16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", aSN1ObjectIdentifierU);
        hashtable2.put("o", aSN1ObjectIdentifierU2);
        hashtable2.put("t", aSN1ObjectIdentifierU4);
        hashtable2.put("ou", aSN1ObjectIdentifierU3);
        hashtable2.put("cn", aSN1ObjectIdentifierU5);
        hashtable2.put("l", aSN1ObjectIdentifierU8);
        hashtable2.put("st", aSN1ObjectIdentifierU9);
        hashtable2.put("sn", aSN1ObjectIdentifierU10);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierU7);
        hashtable2.put("street", aSN1ObjectIdentifierU6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", aSN1ObjectIdentifierU10);
        hashtable2.put("givenname", aSN1ObjectIdentifierU11);
        hashtable2.put("initials", aSN1ObjectIdentifierU12);
        hashtable2.put("generation", aSN1ObjectIdentifierU13);
        hashtable2.put(lqlqqlq.mmm006Dm006Dm, aSN1ObjectIdentifierU15);
        hashtable2.put("role", aSN1ObjectIdentifierU20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierU14);
        hashtable2.put("dn", aSN1ObjectIdentifierU18);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierU19);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierU27);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierU26);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierU24);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierU25);
        hashtable2.put("gender", aSN1ObjectIdentifierU23);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierU22);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierU21);
        hashtable2.put("postalcode", aSN1ObjectIdentifierU17);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierU16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SERIALNUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) throws CloneNotSupportedException {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
