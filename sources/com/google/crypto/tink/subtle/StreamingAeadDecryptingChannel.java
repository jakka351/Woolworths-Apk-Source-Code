package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
class StreamingAeadDecryptingChannel implements ReadableByteChannel {
    public final ReadableByteChannel d;
    public final ByteBuffer e;
    public final ByteBuffer f;
    public final ByteBuffer g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final byte[] l;
    public int m;
    public final StreamSegmentDecrypter n;
    public final int o;
    public final int p;

    public StreamingAeadDecryptingChannel(NonceBasedStreamingAead nonceBasedStreamingAead, ReadableByteChannel readableByteChannel, byte[] bArr) {
        this.n = nonceBasedStreamingAead.h();
        this.d = readableByteChannel;
        this.g = ByteBuffer.allocate(nonceBasedStreamingAead.f());
        this.l = Arrays.copyOf(bArr, bArr.length);
        int iE = nonceBasedStreamingAead.e();
        this.o = iE;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iE + 1);
        this.e = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.p = iE - nonceBasedStreamingAead.d();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(nonceBasedStreamingAead.g() + 16);
        this.f = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = 0;
        this.k = true;
    }

    public final boolean a() throws IOException {
        byte b;
        int i;
        boolean z = this.i;
        ByteBuffer byteBuffer = this.e;
        if (!z) {
            do {
                i = this.d.read(byteBuffer);
                if (i <= 0) {
                    break;
                }
            } while (byteBuffer.remaining() > 0);
            if (i == -1) {
                this.i = true;
            }
        }
        if (byteBuffer.remaining() > 0 && !this.i) {
            return false;
        }
        if (this.i) {
            b = 0;
        } else {
            b = byteBuffer.get(byteBuffer.position() - 1);
            byteBuffer.position(byteBuffer.position() - 1);
        }
        byteBuffer.flip();
        ByteBuffer byteBuffer2 = this.f;
        byteBuffer2.clear();
        try {
            this.n.b(byteBuffer, this.m, this.i, byteBuffer2);
            this.m++;
            byteBuffer2.flip();
            byteBuffer.clear();
            if (!this.i) {
                byteBuffer.clear();
                byteBuffer.limit(this.o + 1);
                byteBuffer.put(b);
            }
            return true;
        } catch (GeneralSecurityException e) {
            this.k = false;
            byteBuffer2.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.m + " endOfCiphertext:" + this.i, e);
        }
    }

    public final boolean b() throws IOException {
        ByteBuffer byteBuffer;
        int i;
        if (this.i) {
            throw new IOException("Ciphertext is too short");
        }
        do {
            ReadableByteChannel readableByteChannel = this.d;
            byteBuffer = this.g;
            i = readableByteChannel.read(byteBuffer);
            if (i <= 0) {
                break;
            }
        } while (byteBuffer.remaining() > 0);
        if (i == -1) {
            this.i = true;
        }
        if (byteBuffer.remaining() > 0) {
            return false;
        }
        byteBuffer.flip();
        try {
            this.n.a(this.l, byteBuffer);
            this.h = true;
            return true;
        } catch (GeneralSecurityException e) {
            this.k = false;
            this.f.limit(0);
            throw new IOException(e);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    @Override // java.nio.channels.Channel
    public final synchronized boolean isOpen() {
        return this.d.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final synchronized int read(ByteBuffer byteBuffer) {
        try {
            if (!this.k) {
                throw new IOException("This StreamingAeadDecryptingChannel is in an undefined state");
            }
            if (!this.h) {
                if (!b()) {
                    return 0;
                }
                this.e.clear();
                this.e.limit(this.p + 1);
            }
            if (this.j) {
                return -1;
            }
            int iPosition = byteBuffer.position();
            while (true) {
                if (byteBuffer.remaining() <= 0) {
                    break;
                }
                if (this.f.remaining() == 0) {
                    if (!this.i) {
                        if (!a()) {
                            break;
                        }
                    } else {
                        this.j = true;
                        break;
                    }
                }
                if (this.f.remaining() <= byteBuffer.remaining()) {
                    this.f.remaining();
                    byteBuffer.put(this.f);
                } else {
                    int iRemaining = byteBuffer.remaining();
                    ByteBuffer byteBufferDuplicate = this.f.duplicate();
                    byteBufferDuplicate.limit(byteBufferDuplicate.position() + iRemaining);
                    byteBuffer.put(byteBufferDuplicate);
                    ByteBuffer byteBuffer2 = this.f;
                    byteBuffer2.position(byteBuffer2.position() + iRemaining);
                }
            }
            int iPosition2 = byteBuffer.position() - iPosition;
            if (iPosition2 == 0 && this.j) {
                return -1;
            }
            return iPosition2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingChannel\nsegmentNr:" + this.m + "\nciphertextSegmentSize:" + this.o + "\nheaderRead:" + this.h + "\nendOfCiphertext:" + this.i + "\nendOfPlaintext:" + this.j + "\ndefinedState:" + this.k + "\nHeader position:" + this.g.position() + " limit:" + this.g.position() + "\nciphertextSgement position:" + this.e.position() + " limit:" + this.e.limit() + "\nplaintextSegment position:" + this.f.position() + " limit:" + this.f.limit();
    }
}
