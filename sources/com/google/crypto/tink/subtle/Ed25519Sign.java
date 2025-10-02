package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;

/* loaded from: classes6.dex */
public final class Ed25519Sign implements PublicKeySign {

    public static final class KeyPair {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f15153a;
        public final byte[] b;

        public KeyPair(byte[] bArr, byte[] bArr2) {
            this.f15153a = bArr;
            this.b = bArr2;
        }

        public static KeyPair a() {
            byte[] bArrA = Random.a(32);
            return new KeyPair(Ed25519.e(Ed25519.d(bArrA)), bArrA);
        }
    }

    public Ed25519Sign(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        Ed25519.e(Ed25519.d(bArr));
    }
}
