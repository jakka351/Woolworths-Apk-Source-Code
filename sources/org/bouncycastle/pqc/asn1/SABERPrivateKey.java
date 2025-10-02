package org.bouncycastle.pqc.asn1;

import kotlin.reflect.jvm.internal.impl.types.checker.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes8.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;
    private byte[] s;
    private int version;
    private byte[] z;

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.z));
        aSN1EncodableVector.add(new DEROctetString(this.s));
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iB = a.b(aSN1Sequence, 0);
        this.version = iB;
        if (iB != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = a.C(aSN1Sequence, 1);
        this.s = a.C(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = a.C(aSN1Sequence, 4);
    }
}
