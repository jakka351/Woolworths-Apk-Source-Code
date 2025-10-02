package org.bouncycastle.asn1;

/* loaded from: classes8.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z) {
        super(str, z);
    }

    public DERPrintableString(byte[] bArr, boolean z) {
        super(bArr, z);
    }
}
