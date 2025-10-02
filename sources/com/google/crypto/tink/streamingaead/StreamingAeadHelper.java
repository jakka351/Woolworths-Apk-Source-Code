package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class StreamingAeadHelper implements StreamingAead {

    /* renamed from: a, reason: collision with root package name */
    public final PrimitiveSet f15129a;

    public StreamingAeadHelper(PrimitiveSet primitiveSet) throws GeneralSecurityException {
        if (primitiveSet.b == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        this.f15129a = primitiveSet;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final ReadableByteChannel a(ReadableByteChannel readableByteChannel, byte[] bArr) {
        ReadableByteChannelDecrypter readableByteChannelDecrypter = new ReadableByteChannelDecrypter();
        readableByteChannelDecrypter.d = false;
        readableByteChannelDecrypter.e = null;
        readableByteChannelDecrypter.g = this.f15129a;
        readableByteChannelDecrypter.f = new RewindableReadableByteChannel(readableByteChannel);
        readableByteChannelDecrypter.h = (byte[]) bArr.clone();
        return readableByteChannelDecrypter;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final SeekableByteChannel b(byte[] bArr) {
        throw null;
    }

    @Override // com.google.crypto.tink.StreamingAead
    public final InputStream c(InputStream inputStream, byte[] bArr) {
        InputStreamDecrypter inputStreamDecrypter = new InputStreamDecrypter();
        inputStreamDecrypter.d = false;
        inputStreamDecrypter.e = null;
        inputStreamDecrypter.g = this.f15129a;
        if (inputStream.markSupported()) {
            inputStreamDecrypter.f = inputStream;
        } else {
            inputStreamDecrypter.f = new BufferedInputStream(inputStream);
        }
        inputStreamDecrypter.f.mark(Integer.MAX_VALUE);
        inputStreamDecrypter.h = (byte[]) bArr.clone();
        return inputStreamDecrypter;
    }
}
