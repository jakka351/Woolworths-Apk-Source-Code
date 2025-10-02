package com.google.crypto.tink.subtle;

import com.google.crypto.tink.StreamingAead;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes6.dex */
abstract class NonceBasedStreamingAead implements StreamingAead {
    @Override // com.google.crypto.tink.StreamingAead
    public ReadableByteChannel a(ReadableByteChannel readableByteChannel, byte[] bArr) {
        return new StreamingAeadDecryptingChannel(this, readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.StreamingAead
    public SeekableByteChannel b(byte[] bArr) {
        new StreamingAeadSeekableDecryptingChannel(this, bArr);
        throw null;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public InputStream c(InputStream inputStream, byte[] bArr) {
        return new StreamingAeadDecryptingStream(this, inputStream, bArr);
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract StreamSegmentDecrypter h();
}
