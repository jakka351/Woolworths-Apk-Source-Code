package com.google.crypto.tink.streamingaead;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes6.dex */
final class SeekableByteChannelDecrypter implements SeekableByteChannel {
    public boolean d;
    public SeekableByteChannel e;
    public long f;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        throw null;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final synchronized SeekableByteChannel position(long j) {
        try {
            SeekableByteChannel seekableByteChannel = this.e;
            if (seekableByteChannel != null) {
                seekableByteChannel.position(j);
            } else {
                if (j < 0) {
                    throw new IllegalArgumentException("Position must be non-negative");
                }
                this.f = j;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        SeekableByteChannel seekableByteChannel = this.e;
        if (seekableByteChannel != null) {
            return seekableByteChannel.read(byteBuffer);
        }
        if (this.d) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        this.d = true;
        throw null;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final synchronized long size() {
        SeekableByteChannel seekableByteChannel;
        seekableByteChannel = this.e;
        if (seekableByteChannel == null) {
            throw new IOException("Cannot determine size before first read()-call.");
        }
        return seekableByteChannel.size();
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
    public final synchronized long position() {
        SeekableByteChannel seekableByteChannel = this.e;
        if (seekableByteChannel != null) {
            return seekableByteChannel.position();
        }
        return this.f;
    }
}
