package org.bouncycastle.pqc.asn1;

import kotlin.reflect.jvm.internal.impl.types.checker.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes8.dex */
public class FalconPublicKey extends ASN1Object {
    private byte[] h;

    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        this.h = a.C(aSN1Sequence, 0);
    }

    public static FalconPublicKey getInstance(Object obj) {
        if (obj instanceof FalconPublicKey) {
            return (FalconPublicKey) obj;
        }
        if (obj != null) {
            return new FalconPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getH() {
        return this.h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.h));
        return new DERSequence(aSN1EncodableVector);
    }

    public FalconPublicKey(byte[] bArr) {
        this.h = bArr;
    }
}
