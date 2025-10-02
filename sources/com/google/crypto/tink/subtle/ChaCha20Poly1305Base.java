package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes6.dex */
abstract class ChaCha20Poly1305Base implements Aead {

    /* renamed from: a, reason: collision with root package name */
    public final ChaCha20Base f15143a;
    public final ChaCha20Base b;

    public ChaCha20Poly1305Base(byte[] bArr) {
        this.f15143a = d(1, bArr);
        this.b = d(0, bArr);
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        ChaCha20Base chaCha20Base = this.f15143a;
        if (length > 2147483631 - chaCha20Base.g()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + chaCha20Base.g() + 16);
        if (byteBufferAllocate.remaining() < bArr.length + chaCha20Base.g() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        chaCha20Base.f(bArr, byteBufferAllocate);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[chaCha20Base.g()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.b.c(0, bArr3).get(bArr4);
        byte[] bArrA = Poly1305.a(bArr4, c(bArr2, byteBufferAllocate));
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrA);
        return byteBufferAllocate.array();
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        ChaCha20Base chaCha20Base = this.f15143a;
        if (iRemaining < chaCha20Base.g() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBufferWrap.position();
        byte[] bArr3 = new byte[16];
        byteBufferWrap.position(byteBufferWrap.limit() - 16);
        byteBufferWrap.get(bArr3);
        byteBufferWrap.position(iPosition);
        byteBufferWrap.limit(byteBufferWrap.limit() - 16);
        byte[] bArr4 = new byte[chaCha20Base.g()];
        byteBufferWrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.b.c(0, bArr4).get(bArr5);
            if (!Bytes.b(Poly1305.a(bArr5, c(bArr2, byteBufferWrap)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBufferWrap.position(iPosition);
            return chaCha20Base.e(byteBufferWrap);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public abstract ChaCha20Base d(int i, byte[] bArr);
}
