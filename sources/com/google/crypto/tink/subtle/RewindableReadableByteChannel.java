package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes6.dex */
public final class RewindableReadableByteChannel implements ReadableByteChannel {
    public final ReadableByteChannel d;
    public ByteBuffer e = null;
    public boolean f = true;
    public boolean g = false;

    public RewindableReadableByteChannel(ReadableByteChannel readableByteChannel) {
        this.d = readableByteChannel;
    }

    public final synchronized void a() {
        this.f = false;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = false;
        this.g = true;
        this.d.close();
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.d.isOpen();
    }

    public final synchronized void o() {
        if (!this.f) {
            throw new IOException("Cannot rewind anymore.");
        }
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) {
        if (this.g) {
            return this.d.read(byteBuffer);
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return 0;
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 == null) {
            if (!this.f) {
                this.g = true;
                return this.d.read(byteBuffer);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
            this.e = byteBufferAllocate;
            int i = this.d.read(byteBufferAllocate);
            if (i > 0) {
                this.e.flip();
                byteBuffer.put(this.e);
            }
            return i;
        }
        if (byteBuffer2.remaining() >= iRemaining) {
            byte[] bArr = new byte[iRemaining];
            this.e.get(bArr);
            byteBuffer.put(bArr);
            if (!this.f && this.e.remaining() == 0) {
                this.g = true;
            }
            return iRemaining;
        }
        int iRemaining2 = this.e.remaining();
        int i2 = iRemaining - iRemaining2;
        byteBuffer.put(this.e);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        int i3 = this.d.read(byteBufferAllocate2);
        if (i3 > 0) {
            byteBufferAllocate2.flip();
            byteBuffer.put(byteBufferAllocate2);
        }
        if (this.f) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(this.e.limit() + i2);
            this.e.flip();
            byteBufferAllocate3.put(this.e);
            if (i3 > 0) {
                byteBufferAllocate2.flip();
                byteBufferAllocate3.put(byteBufferAllocate2);
            }
            byteBufferAllocate3.flip();
            byteBufferAllocate3.position(byteBufferAllocate3.limit());
            this.e = byteBufferAllocate3;
        } else {
            this.e = null;
            this.g = true;
        }
        return iRemaining2 + i3;
    }
}
