package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;

/* loaded from: classes6.dex */
public final class Ed25519Verify implements PublicKeyVerify {
    public Ed25519Verify(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, new byte[length], 0, length);
    }
}
