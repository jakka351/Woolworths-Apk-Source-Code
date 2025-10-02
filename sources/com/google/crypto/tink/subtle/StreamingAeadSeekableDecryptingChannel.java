package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
class StreamingAeadSeekableDecryptingChannel implements SeekableByteChannel {
    public final ByteBuffer d;
    public final ByteBuffer e;
    public final ByteBuffer f;
    public final StreamSegmentDecrypter g;
    public long h;
    public final boolean i;
    public boolean j;
    public int k;
    public final int l;

    public StreamingAeadSeekableDecryptingChannel(NonceBasedStreamingAead nonceBasedStreamingAead, byte[] bArr) {
        this.g = nonceBasedStreamingAead.h();
        this.f = ByteBuffer.allocate(nonceBasedStreamingAead.f());
        this.d = ByteBuffer.allocate(nonceBasedStreamingAead.e());
        int iG = nonceBasedStreamingAead.g();
        this.l = iG;
        this.e = ByteBuffer.allocate(iG + 16);
        this.h = 0L;
        this.i = false;
        this.k = -1;
        this.j = false;
        throw null;
    }

    public final boolean a(int i) throws IOException {
        if (i < 0 || i >= 0) {
            throw new IOException("Invalid position");
        }
        boolean z = i == 0 - 1;
        if (i != this.k) {
            throw null;
        }
        if (this.j) {
            return true;
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.remaining() > 0) {
            throw null;
        }
        if (byteBuffer.remaining() > 0) {
            return false;
        }
        byteBuffer.flip();
        ByteBuffer byteBuffer2 = this.e;
        byteBuffer2.clear();
        try {
            this.g.b(byteBuffer, i, z, byteBuffer2);
            byteBuffer2.flip();
            this.j = true;
            return true;
        } catch (GeneralSecurityException e) {
            this.k = -1;
            throw new IOException("Failed to decrypt", e);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return false;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final synchronized long position() {
        return this.h;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) {
        throw new ClosedChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() {
        return 0L;
    }

    public final synchronized String toString() {
        throw null;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final synchronized SeekableByteChannel position(long j) {
        this.h = j;
        return this;
    }
}
