package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes8.dex */
class HarakaS512Digest extends HarakaSBase implements Digest {
    public HarakaS512Digest(HarakaSXof harakaSXof) {
        this.haraka512_rc = harakaSXof.haraka512_rc;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        haraka512Perm(bArr2);
        HarakaSBase.xor(bArr2, 8, this.buffer, 8, bArr, i, 8);
        HarakaSBase.xor(bArr2, 24, this.buffer, 24, bArr, i + 8, 16);
        HarakaSBase.xor(bArr2, 48, this.buffer, 48, bArr, i + 24, 8);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "HarakaS-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.pqc.crypto.sphincsplus.HarakaSBase, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.off;
        if (i > 63) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i + 1;
        bArr[i] = b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.off;
        if (i3 > 64 - i2) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        System.arraycopy(bArr, i, this.buffer, i3, i2);
        this.off += i2;
    }
}
