package com.google.crypto.tink.subtle;

/* loaded from: classes6.dex */
public final class XChaCha20Poly1305 extends ChaCha20Poly1305Base {
    public XChaCha20Poly1305(byte[] bArr) {
        super(bArr);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Poly1305Base
    public final ChaCha20Base d(int i, byte[] bArr) {
        return new XChaCha20(bArr, i);
    }
}
