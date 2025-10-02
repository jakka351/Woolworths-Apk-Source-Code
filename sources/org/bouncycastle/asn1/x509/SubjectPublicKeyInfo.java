package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import kotlin.reflect.jvm.internal.impl.types.checker.a;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes8.dex */
public class SubjectPublicKeyInfo extends ASN1Object {
    private AlgorithmIdentifier algId;
    private ASN1BitString keyData;

    public SubjectPublicKeyInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(a.j(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.algId = AlgorithmIdentifier.getInstance(objects.nextElement());
        this.keyData = ASN1BitString.getInstance(objects.nextElement());
    }

    public static SubjectPublicKeyInfo getInstance(Object obj) {
        if (obj instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) obj;
        }
        if (obj != null) {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getAlgorithm() {
        return this.algId;
    }

    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }

    public ASN1Primitive getPublicKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.keyData.getOctets());
    }

    public ASN1BitString getPublicKeyData() {
        return this.keyData;
    }

    public ASN1Primitive parsePublicKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.keyData.getOctets());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.algId);
        aSN1EncodableVector.add(this.keyData);
        return new DERSequence(aSN1EncodableVector);
    }

    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        this.keyData = new DERBitString(aSN1Encodable);
        this.algId = algorithmIdentifier;
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.keyData = new DERBitString(bArr);
        this.algId = algorithmIdentifier;
    }
}
