package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
abstract class ChaCha20Base implements IndCpaCipher {
    public static final int[] c = k(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15142a;
    public final int b;

    public ChaCha20Base(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15142a = k(bArr);
        this.b = i;
    }

    public static void i(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    public static void j(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            i(0, 4, 8, 12, iArr);
            i(1, 5, 9, 13, iArr);
            i(2, 6, 10, 14, iArr);
            i(3, 7, 11, 15, iArr);
            i(0, 5, 10, 15, iArr);
            i(1, 6, 11, 12, iArr);
            i(2, 7, 8, 13, iArr);
            i(3, 4, 9, 14, iArr);
        }
    }

    public static int[] k(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(g() + bArr.length);
        f(bArr, byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public final byte[] b(byte[] bArr) {
        return e(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer c(int i, byte[] bArr) {
        int[] iArrD = d(i, k(bArr));
        int[] iArr = (int[]) iArrD.clone();
        j(iArr);
        for (int i2 = 0; i2 < iArrD.length; i2++) {
            iArrD[i2] = iArrD[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] d(int i, int[] iArr);

    public final byte[] e(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < g()) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr = new byte[g()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        h(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public final void f(byte[] bArr, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() - g() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrA = Random.a(g());
        byteBuffer.put(bArrA);
        h(bArrA, byteBuffer, ByteBuffer.wrap(bArr));
    }

    public abstract int g();

    public final void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferC = c(this.b + i3, bArr);
            if (i3 == i) {
                Bytes.c(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                Bytes.c(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }
}
