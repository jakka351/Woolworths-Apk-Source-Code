package com.google.crypto.tink.subtle;

import YU.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqql;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class AesCtrHmacStreaming extends NonceBasedStreamingAead {

    /* renamed from: a, reason: collision with root package name */
    public final int f15132a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final byte[] g;

    public class AesCtrHmacStreamDecrypter implements StreamSegmentDecrypter {

        /* renamed from: a, reason: collision with root package name */
        public SecretKeySpec f15133a;
        public SecretKeySpec b;
        public Cipher c;
        public Mac d;
        public byte[] e;

        public AesCtrHmacStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void a(byte[] bArr, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() != AesCtrHmacStreaming.this.f()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesCtrHmacStreaming.this.f()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.e = new byte[7];
            byte[] bArr2 = new byte[AesCtrHmacStreaming.this.f15132a];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.e);
            AesCtrHmacStreaming aesCtrHmacStreaming = AesCtrHmacStreaming.this;
            int i = aesCtrHmacStreaming.f15132a + 32;
            byte[] bArrA = Hkdf.a(aesCtrHmacStreaming.g, bArr2, aesCtrHmacStreaming.f, bArr, i);
            AesCtrHmacStreaming aesCtrHmacStreaming2 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming2.getClass();
            this.f15133a = new SecretKeySpec(bArrA, 0, aesCtrHmacStreaming2.f15132a, "AES");
            AesCtrHmacStreaming aesCtrHmacStreaming3 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming3.getClass();
            this.b = new SecretKeySpec(bArrA, aesCtrHmacStreaming3.f15132a, 32, aesCtrHmacStreaming3.b);
            this.c = (Cipher) EngineFactory.e.a(lqlqqql.c0063cccc0063);
            AesCtrHmacStreaming aesCtrHmacStreaming4 = AesCtrHmacStreaming.this;
            aesCtrHmacStreaming4.getClass();
            this.d = (Mac) EngineFactory.f.a(aesCtrHmacStreaming4.b);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public final synchronized void b(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
            int iPosition = byteBuffer.position();
            byte[] bArr = this.e;
            long j = i;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            byteBufferAllocate.put(bArr);
            if (0 > j || j >= llqqqql.a00610061aaaa) {
                throw new GeneralSecurityException("Index out of range");
            }
            byteBufferAllocate.putInt((int) j);
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            byteBufferAllocate.putInt(0);
            byte[] bArrArray = byteBufferAllocate.array();
            int iRemaining = byteBuffer.remaining();
            int i2 = AesCtrHmacStreaming.this.c;
            if (iRemaining < i2) {
                throw new GeneralSecurityException("Ciphertext too short");
            }
            int i3 = (iRemaining - i2) + iPosition;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(i3);
            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
            byteBufferDuplicate2.position(i3);
            this.d.init(this.b);
            this.d.update(bArrArray);
            this.d.update(byteBufferDuplicate);
            byte[] bArrCopyOf = Arrays.copyOf(this.d.doFinal(), AesCtrHmacStreaming.this.c);
            byte[] bArr2 = new byte[AesCtrHmacStreaming.this.c];
            byteBufferDuplicate2.get(bArr2);
            if (!Bytes.b(bArr2, bArrCopyOf)) {
                throw new GeneralSecurityException("Tag mismatch");
            }
            byteBuffer.limit(i3);
            this.c.init(1, this.f15133a, new IvParameterSpec(bArrArray));
            this.c.doFinal(byteBuffer, byteBuffer2);
        }
    }

    public class AesCtrHmacStreamEncrypter implements StreamSegmentEncrypter {
    }

    public AesCtrHmacStreaming(byte[] bArr, String str, int i, String str2, int i2, int i3) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length < 16 || length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        Validators.a(i);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException(a.d(i2, "tag size too small "));
        }
        if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if (((i3 - i2) - i) - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.g = Arrays.copyOf(bArr, bArr.length);
        this.f = str;
        this.f15132a = i;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i3 - i2;
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
        return this.d;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int f() {
        return this.f15132a + 8;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final int g() {
        return this.e;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public final StreamSegmentDecrypter h() {
        return new AesCtrHmacStreamDecrypter();
    }
}
