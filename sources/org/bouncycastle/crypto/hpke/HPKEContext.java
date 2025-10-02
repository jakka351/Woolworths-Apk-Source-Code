package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes8.dex */
public class HPKEContext {
    protected final AEAD aead;
    protected final byte[] exporterSecret;
    protected final HKDF hkdf;
    protected final byte[] suiteId;

    public HPKEContext(AEAD aead, HKDF hkdf, byte[] bArr, byte[] bArr2) {
        this.aead = aead;
        this.hkdf = hkdf;
        this.exporterSecret = bArr;
        this.suiteId = bArr2;
    }

    public byte[] export(byte[] bArr, int i) {
        return this.hkdf.LabeledExpand(this.exporterSecret, this.suiteId, "sec", bArr, i);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return this.aead.open(bArr, bArr2);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return this.aead.seal(bArr, bArr2);
    }
}
