package com.google.crypto.tink.subtle;

/* loaded from: classes6.dex */
class ChaCha20 extends ChaCha20Base {
    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public final int[] d(int i, int[] iArr) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = ChaCha20Base.c;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f15142a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public final int g() {
        return 12;
    }
}
