package org.bouncycastle.asn1.util;

import YU.a;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes8.dex */
public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    public static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder sbT;
        int length;
        String strLineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Null) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(strLineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
            stringBuffer.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String strG = a.g(str, TAB);
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(strG, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : aSN1Primitive instanceof DERSet ? "DER Set" : "Set");
            stringBuffer.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String strG2 = a.g(str, TAB);
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(strG2, z, aSN1Set.getObjectAt(i).toASN1Primitive(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged " : aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(strLineSeparator);
            _dumpAsString(str + TAB, z, aSN1TaggedObject.getBaseObject().toASN1Primitive(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                sbT = a.t(str, "BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                sbT = a.t(str, "DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            sbT.append(length);
            sbT.append("] ");
            stringBuffer.append(sbT.toString());
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, aSN1OctetString.getOctets()));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            StringBuilder sbT2 = a.t(str, "ObjectIdentifier(");
            sbT2.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
            sbT2.append(")");
            sbT2.append(strLineSeparator);
            stringBuffer.append(sbT2.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            StringBuilder sbT3 = a.t(str, "RelativeOID(");
            sbT3.append(((ASN1RelativeOID) aSN1Primitive).getId());
            sbT3.append(")");
            sbT3.append(strLineSeparator);
            stringBuffer.append(sbT3.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            StringBuilder sbT4 = a.t(str, "Boolean(");
            sbT4.append(((ASN1Boolean) aSN1Primitive).isTrue());
            sbT4.append(")");
            sbT4.append(strLineSeparator);
            stringBuffer.append(sbT4.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            StringBuilder sbT5 = a.t(str, "Integer(");
            sbT5.append(((ASN1Integer) aSN1Primitive).getValue());
            sbT5.append(")");
            sbT5.append(strLineSeparator);
            stringBuffer.append(sbT5.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] bytes = aSN1BitString.getBytes();
            stringBuffer.append(androidx.compose.ui.input.pointer.a.i(bytes.length, aSN1BitString.getPadBits(), ", ", "] ", a.t(str, aSN1BitString instanceof DERBitString ? "DER Bit String[" : aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[")));
            if (z) {
                stringBuffer.append(dumpBinaryDataAsString(str, bytes));
                return;
            } else {
                stringBuffer.append(strLineSeparator);
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            StringBuilder sbT6 = a.t(str, "IA5String(");
            sbT6.append(((ASN1IA5String) aSN1Primitive).getString());
            sbT6.append(") ");
            sbT6.append(strLineSeparator);
            stringBuffer.append(sbT6.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            StringBuilder sbT7 = a.t(str, "UTF8String(");
            sbT7.append(((ASN1UTF8String) aSN1Primitive).getString());
            sbT7.append(") ");
            sbT7.append(strLineSeparator);
            stringBuffer.append(sbT7.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            StringBuilder sbT8 = a.t(str, "NumericString(");
            sbT8.append(((ASN1NumericString) aSN1Primitive).getString());
            sbT8.append(") ");
            sbT8.append(strLineSeparator);
            stringBuffer.append(sbT8.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            StringBuilder sbT9 = a.t(str, "PrintableString(");
            sbT9.append(((ASN1PrintableString) aSN1Primitive).getString());
            sbT9.append(") ");
            sbT9.append(strLineSeparator);
            stringBuffer.append(sbT9.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            StringBuilder sbT10 = a.t(str, "VisibleString(");
            sbT10.append(((ASN1VisibleString) aSN1Primitive).getString());
            sbT10.append(") ");
            sbT10.append(strLineSeparator);
            stringBuffer.append(sbT10.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            StringBuilder sbT11 = a.t(str, "BMPString(");
            sbT11.append(((ASN1BMPString) aSN1Primitive).getString());
            sbT11.append(") ");
            sbT11.append(strLineSeparator);
            stringBuffer.append(sbT11.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            StringBuilder sbT12 = a.t(str, "T61String(");
            sbT12.append(((ASN1T61String) aSN1Primitive).getString());
            sbT12.append(") ");
            sbT12.append(strLineSeparator);
            stringBuffer.append(sbT12.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            StringBuilder sbT13 = a.t(str, "GraphicString(");
            sbT13.append(((ASN1GraphicString) aSN1Primitive).getString());
            sbT13.append(") ");
            sbT13.append(strLineSeparator);
            stringBuffer.append(sbT13.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            StringBuilder sbT14 = a.t(str, "VideotexString(");
            sbT14.append(((ASN1VideotexString) aSN1Primitive).getString());
            sbT14.append(") ");
            sbT14.append(strLineSeparator);
            stringBuffer.append(sbT14.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            StringBuilder sbT15 = a.t(str, "UTCTime(");
            sbT15.append(((ASN1UTCTime) aSN1Primitive).getTime());
            sbT15.append(") ");
            sbT15.append(strLineSeparator);
            stringBuffer.append(sbT15.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            StringBuilder sbT16 = a.t(str, "GeneralizedTime(");
            sbT16.append(((ASN1GeneralizedTime) aSN1Primitive).getTime());
            sbT16.append(") ");
            sbT16.append(strLineSeparator);
            stringBuffer.append(sbT16.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            StringBuilder sbT17 = a.t(str, "DER Enumerated(");
            sbT17.append(((ASN1Enumerated) aSN1Primitive).getValue());
            sbT17.append(")");
            sbT17.append(strLineSeparator);
            stringBuffer.append(sbT17.toString());
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            StringBuilder sbT18 = a.t(str, "ObjectDescriptor(");
            sbT18.append(((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString());
            sbT18.append(") ");
            sbT18.append(strLineSeparator);
            stringBuffer.append(sbT18.toString());
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            StringBuilder sbS = a.s(str);
            sbS.append(aSN1Primitive.toString());
            sbS.append(strLineSeparator);
            stringBuffer.append(sbS.toString());
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        stringBuffer.append(str + "External " + strLineSeparator);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TAB);
        String string = sb.toString();
        if (aSN1External.getDirectReference() != null) {
            StringBuilder sbT19 = a.t(string, "Direct Reference: ");
            sbT19.append(aSN1External.getDirectReference().getId());
            sbT19.append(strLineSeparator);
            stringBuffer.append(sbT19.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder sbT20 = a.t(string, "Indirect Reference: ");
            sbT20.append(aSN1External.getIndirectReference().toString());
            sbT20.append(strLineSeparator);
            stringBuffer.append(sbT20.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(string, z, aSN1External.getDataValueDescriptor(), stringBuffer);
        }
        StringBuilder sbT21 = a.t(string, "Encoding: ");
        sbT21.append(aSN1External.getEncoding());
        sbT21.append(strLineSeparator);
        stringBuffer.append(sbT21.toString());
        _dumpAsString(string, z, aSN1External.getExternalContent(), stringBuffer);
    }

    private static String calculateAscString(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                stringBuffer.append((char) b);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String strCalculateAscString;
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + TAB;
        stringBuffer.append(strLineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length - i;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, 32)));
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                strCalculateAscString = calculateAscString(bArr, i, bArr.length - i);
            }
            stringBuffer.append(strCalculateAscString);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj, boolean z) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuffer stringBuffer = new StringBuffer();
        _dumpAsString("", z, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
