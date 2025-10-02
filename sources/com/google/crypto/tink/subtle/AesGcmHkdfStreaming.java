package com.google.crypto.tink.subtle;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class AesGcmHkdfStreaming extends NonceBasedStreamingAead {

    /* renamed from: a, reason: collision with root package name */
    public final int f15136a;
    public final int b;
    public final int c;
    public final String d;
    public final byte[] e;

    public class AesGcmHkdfStreamDecrypter implements StreamSegmentDecrypter {

        /* renamed from: a, reason: collision with root package name */
        public SecretKeySpec f15137a;
        public Cipher b;
        public byte[] c;

        public AesGcmHkdfStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void a(byte[] bArr, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() != AesGcmHkdfStreaming.this.f()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesGcmHkdfStreaming.this.f()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.c = new byte[7];
            byte[] bArr2 = new byte[AesGcmHkdfStreaming.this.f15136a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.c);
            AesGcmHkdfStreaming aesGcmHkdfStreaming = AesGcmHkdfStreaming.this;
            this.f15137a = new SecretKeySpec(Hkdf.a(aesGcmHkdfStreaming.e, bArr2, aesGcmHkdfStreaming.d, bArr, aesGcmHkdfStreaming.f15136a), "AES");
            this.b = (Cipher) EngineFactory.e.a("AES/GCM/NoPadding");
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void b(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
            byte[] bArr = this.c;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            byteBufferAllocate.put(bArr);
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            this.b.init(2, this.f15137a, new GCMParameterSpec(128, byteBufferAllocate.array()));
            this.b.doFinal(byteBuffer, byteBuffer2);
        }
    }

    public class AesGcmHkdfStreamEncrypter implements StreamSegmentEncrypter {
    }

    public AesGcmHkdfStreaming(int i, int i2, String str, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        Validators.a(i);
        if (i2 <= f() + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.e = Arrays.copyOf(bArr, bArr.length);
        this.d = str;
        this.f15136a = i;
        this.b = i2;
        this.c = i2 - 16;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final ReadableByteChannel a(ReadableByteChannel readableByteChannel, byte[] bArr) {
        return new StreamingAeadDecryptingChannel(this, readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final SeekableByteChannel b(byte[] bArr) {
        new StreamingAeadSeekableDecryptingChannel(this, bArr);
        throw null;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public final InputStream c(InputStream inputStream, byte[] bArr) {
        return new StreamingAeadDecryptingStream(this, inputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int d() {
        return f();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int e() {
        return this.b;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int f() {
        return this.f15136a + 8;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int g() {
        return this.c;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final StreamSegmentDecrypter h() {
        return new AesGcmHkdfStreamDecrypter();
    }
}
