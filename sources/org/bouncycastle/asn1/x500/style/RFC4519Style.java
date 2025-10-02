package org.bouncycastle.asn1.x500.style;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: classes8.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierU = c.u("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierU;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU2 = c.u("2.5.4.6");
        c = aSN1ObjectIdentifierU2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU3 = c.u("2.5.4.3");
        cn = aSN1ObjectIdentifierU3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU4 = c.u("0.9.2342.19200300.100.1.25");
        dc = aSN1ObjectIdentifierU4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU5 = c.u("2.5.4.13");
        description = aSN1ObjectIdentifierU5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU6 = c.u("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierU6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU7 = c.u("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierU7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU8 = c.u("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierU8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU9 = c.u("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierU9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU10 = c.u("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierU10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU11 = c.u("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierU11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU12 = c.u("2.5.4.42");
        givenName = aSN1ObjectIdentifierU12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU13 = c.u("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierU13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU14 = c.u("2.5.4.43");
        initials = aSN1ObjectIdentifierU14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU15 = c.u("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierU15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU16 = c.u("2.5.4.7");
        l = aSN1ObjectIdentifierU16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU17 = c.u("2.5.4.31");
        member = aSN1ObjectIdentifierU17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU18 = c.u("2.5.4.41");
        name = aSN1ObjectIdentifierU18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU19 = c.u("2.5.4.10");
        o = aSN1ObjectIdentifierU19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU20 = c.u("2.5.4.11");
        ou = aSN1ObjectIdentifierU20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU21 = c.u("2.5.4.32");
        owner = aSN1ObjectIdentifierU21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU22 = c.u("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierU22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU23 = c.u("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierU23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU24 = c.u("2.5.4.17");
        postalCode = aSN1ObjectIdentifierU24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU25 = c.u("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierU25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU26 = c.u("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierU26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU27 = c.u("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierU27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU28 = c.u("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierU28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU29 = c.u("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierU29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU30 = c.u("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierU30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU31 = c.u("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierU31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU32 = c.u("2.5.4.4");
        sn = aSN1ObjectIdentifierU32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU33 = c.u("2.5.4.8");
        st = aSN1ObjectIdentifierU33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU34 = c.u("2.5.4.9");
        street = aSN1ObjectIdentifierU34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU35 = c.u("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierU35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU36 = c.u("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierU36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU37 = c.u("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierU37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU38 = c.u("2.5.4.12");
        title = aSN1ObjectIdentifierU38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU39 = c.u("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierU39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU40 = c.u("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierU40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU41 = c.u("2.5.4.35");
        userPassword = aSN1ObjectIdentifierU41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU42 = c.u("2.5.4.24");
        x121Address = aSN1ObjectIdentifierU42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierU43 = c.u("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierU43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierU, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierU2, "c");
        hashtable.put(aSN1ObjectIdentifierU3, "cn");
        hashtable.put(aSN1ObjectIdentifierU4, "dc");
        hashtable.put(aSN1ObjectIdentifierU5, lqlqqlq.mmm006Dm006Dm);
        hashtable.put(aSN1ObjectIdentifierU6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierU7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierU8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierU9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierU10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierU11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierU12, "givenName");
        hashtable.put(aSN1ObjectIdentifierU13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierU14, "initials");
        hashtable.put(aSN1ObjectIdentifierU15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierU16, "l");
        hashtable.put(aSN1ObjectIdentifierU17, "member");
        hashtable.put(aSN1ObjectIdentifierU18, AppMeasurementSdk.ConditionalUserProperty.NAME);
        hashtable.put(aSN1ObjectIdentifierU19, "o");
        hashtable.put(aSN1ObjectIdentifierU20, "ou");
        hashtable.put(aSN1ObjectIdentifierU21, "owner");
        hashtable.put(aSN1ObjectIdentifierU22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierU23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierU24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierU25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierU26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierU27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierU28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierU29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierU30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierU31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierU32, "sn");
        hashtable.put(aSN1ObjectIdentifierU33, "st");
        hashtable.put(aSN1ObjectIdentifierU34, "street");
        hashtable.put(aSN1ObjectIdentifierU35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierU36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierU37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierU38, "title");
        hashtable.put(aSN1ObjectIdentifierU39, "uid");
        hashtable.put(aSN1ObjectIdentifierU40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierU41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierU42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierU43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierU);
        hashtable2.put("c", aSN1ObjectIdentifierU2);
        hashtable2.put("cn", aSN1ObjectIdentifierU3);
        hashtable2.put("dc", aSN1ObjectIdentifierU4);
        hashtable2.put(lqlqqlq.mmm006Dm006Dm, aSN1ObjectIdentifierU5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierU6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierU7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierU8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierU9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierU10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierU11);
        hashtable2.put("givenname", aSN1ObjectIdentifierU12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierU13);
        hashtable2.put("initials", aSN1ObjectIdentifierU14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierU15);
        hashtable2.put("l", aSN1ObjectIdentifierU16);
        hashtable2.put("member", aSN1ObjectIdentifierU17);
        hashtable2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aSN1ObjectIdentifierU18);
        hashtable2.put("o", aSN1ObjectIdentifierU19);
        hashtable2.put("ou", aSN1ObjectIdentifierU20);
        hashtable2.put("owner", aSN1ObjectIdentifierU21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierU22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierU23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierU24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierU25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierU26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierU27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierU28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierU29);
        hashtable2.put("seealso", aSN1ObjectIdentifierU30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierU31);
        hashtable2.put("sn", aSN1ObjectIdentifierU32);
        hashtable2.put("st", aSN1ObjectIdentifierU33);
        hashtable2.put("street", aSN1ObjectIdentifierU34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierU35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierU36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierU37);
        hashtable2.put("title", aSN1ObjectIdentifierU38);
        hashtable2.put("uid", aSN1ObjectIdentifierU39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierU40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierU41);
        hashtable2.put("x121address", aSN1ObjectIdentifierU42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierU43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rdnArrRDNsFromString.length];
        for (int i = 0; i != rdnArrRDNsFromString.length; i++) {
            rdnArr[(r0 - i) - 1] = rdnArrRDNsFromString[i];
        }
        return rdnArr;
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
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
