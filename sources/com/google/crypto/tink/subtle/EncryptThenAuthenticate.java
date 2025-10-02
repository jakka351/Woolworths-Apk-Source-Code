package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Mac;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class EncryptThenAuthenticate implements Aead {

    /* renamed from: a, reason: collision with root package name */
    public final IndCpaCipher f15155a;
    public final Mac b;
    public final int c;

    public EncryptThenAuthenticate(IndCpaCipher indCpaCipher, Mac mac, int i) {
        this.f15155a = indCpaCipher;
        this.b = mac;
        this.c = i;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f15155a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return Bytes.a(bArrA, this.b.b(Bytes.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(bArrCopyOfRange2, Bytes.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f15155a.b(bArrCopyOfRange);
    }
}
