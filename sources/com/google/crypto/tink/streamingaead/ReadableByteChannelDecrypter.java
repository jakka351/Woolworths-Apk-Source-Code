package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.CryptoFormat;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.subtle.RewindableReadableByteChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class ReadableByteChannelDecrypter implements ReadableByteChannel {
    public boolean d;
    public ReadableByteChannel e;
    public RewindableReadableByteChannel f;
    public PrimitiveSet g;
    public byte[] h;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f.close();
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.f.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        ReadableByteChannel readableByteChannel = this.e;
        if (readableByteChannel != null) {
            return readableByteChannel.read(byteBuffer);
        }
        if (this.d) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        this.d = true;
        Iterator it = this.g.a(CryptoFormat.f14969a).iterator();
        while (it.hasNext()) {
            try {
                try {
                    ReadableByteChannel readableByteChannelA = ((StreamingAead) ((PrimitiveSet.Entry) it.next()).f14982a).a(this.f, this.h);
                    int i = readableByteChannelA.read(byteBuffer);
                    if (i > 0) {
                        this.e = readableByteChannelA;
                        this.f.a();
                    } else if (i == 0) {
                        this.f.o();
                        this.d = false;
                    }
                    return i;
                } catch (GeneralSecurityException unused) {
                    this.f.o();
                }
            } catch (IOException unused2) {
                this.f.o();
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
