package org.bouncycastle.pqc.crypto.lms;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.medallia.digital.mobilesdk.q2;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes8.dex */
class DigestUtil {
    private static Map<String, ASN1ObjectIdentifier> nameToOid = new HashMap();
    private static Map<ASN1ObjectIdentifier, String> oidToName = new HashMap();

    public static class WrapperDigest implements Digest {
        private final Digest dig;
        private final int length;

        public WrapperDigest(Digest digest, int i) {
            this.dig = digest;
            this.length = i;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            byte[] bArr2 = new byte[this.dig.getDigestSize()];
            this.dig.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, this.length);
            return this.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return this.dig.getAlgorithmName() + q2.c + (this.length * 8);
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.dig.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
            this.dig.update(b);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            this.dig.update(bArr, i, i2);
        }
    }

    static {
        Map<String, ASN1ObjectIdentifier> map = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put("SHA-256", aSN1ObjectIdentifier);
        Map<String, ASN1ObjectIdentifier> map2 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map2.put("SHA-512", aSN1ObjectIdentifier2);
        Map<String, ASN1ObjectIdentifier> map3 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map3.put("SHAKE128", aSN1ObjectIdentifier3);
        Map<String, ASN1ObjectIdentifier> map4 = nameToOid;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map4.put("SHAKE256", aSN1ObjectIdentifier4);
        oidToName.put(aSN1ObjectIdentifier, "SHA-256");
        oidToName.put(aSN1ObjectIdentifier2, "SHA-512");
        oidToName.put(aSN1ObjectIdentifier3, "SHAKE128");
        oidToName.put(aSN1ObjectIdentifier4, "SHAKE256");
    }

    private static Digest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256) && !aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
            throw new IllegalArgumentException(c.n("unrecognized digest OID: ", aSN1ObjectIdentifier));
        }
        return new SHAKEDigest(256);
    }

    public static Digest getDigest(LMOtsParameters lMOtsParameters) {
        return createDigest(lMOtsParameters.getDigestOID(), lMOtsParameters.getN());
    }

    public static Digest getDigest(LMSigParameters lMSigParameters) {
        return createDigest(lMSigParameters.getDigestOID(), lMSigParameters.getM());
    }

    private static Digest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        Digest digestCreateDigest = createDigest(aSN1ObjectIdentifier);
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len) || i == 24) ? new WrapperDigest(digestCreateDigest, i) : digestCreateDigest;
    }
}
