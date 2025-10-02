package com.google.crypto.tink.subtle;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
class StreamingAeadDecryptingStream extends FilterInputStream {
    public final ByteBuffer d;
    public final ByteBuffer e;
    public final int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final byte[] k;
    public int l;
    public final StreamSegmentDecrypter m;
    public final int n;
    public final int o;

    public StreamingAeadDecryptingStream(NonceBasedStreamingAead nonceBasedStreamingAead, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.m = nonceBasedStreamingAead.h();
        this.f = nonceBasedStreamingAead.f();
        this.k = Arrays.copyOf(bArr, bArr.length);
        int iE = nonceBasedStreamingAead.e();
        this.n = iE;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iE + 1);
        this.d = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.o = iE - nonceBasedStreamingAead.d();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(nonceBasedStreamingAead.g() + 16);
        this.e = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.g = false;
        this.h = false;
        this.i = false;
        this.l = 0;
        this.j = true;
    }

    public final void a() throws IOException {
        byte b;
        while (!this.h && this.d.remaining() > 0) {
            int i = ((FilterInputStream) this).in.read(this.d.array(), this.d.position(), this.d.remaining());
            if (i > 0) {
                ByteBuffer byteBuffer = this.d;
                byteBuffer.position(byteBuffer.position() + i);
            } else if (i == -1) {
                this.h = true;
            } else if (i == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.h) {
            b = 0;
        } else {
            ByteBuffer byteBuffer2 = this.d;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.d;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.d.flip();
        this.e.clear();
        try {
            this.m.b(this.d, this.l, this.h, this.e);
            this.l++;
            this.e.flip();
            this.d.clear();
            if (this.h) {
                return;
            }
            this.d.clear();
            this.d.limit(this.n + 1);
            this.d.put(b);
        } catch (GeneralSecurityException e) {
            this.j = false;
            this.e.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.l + " endOfCiphertext:" + this.h, e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.e.remaining();
    }

    public final void b() throws IOException {
        byte[] bArr = new byte[this.f];
        if (((FilterInputStream) this).in.read(bArr) != this.f) {
            this.j = false;
            this.e.limit(0);
            throw new IOException("Ciphertext is too short");
        }
        try {
            this.m.a(this.k, ByteBuffer.wrap(bArr));
            this.g = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i == -1) {
            return i;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i;
        long j2 = this.n;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j2, j);
        byte[] bArr = new byte[iMin];
        long j3 = j;
        while (j3 > 0 && (i = read(bArr, 0, (int) Math.min(iMin, j3))) > 0) {
            j3 -= i;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.l + "\nciphertextSegmentSize:" + this.n + "\nheaderRead:" + this.g + "\nendOfCiphertext:" + this.h + "\nendOfPlaintext:" + this.i + "\ndefinedState:" + this.j + "\nciphertextSgement position:" + this.d.position() + " limit:" + this.d.limit() + "\nplaintextSegment position:" + this.e.position() + " limit:" + this.e.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (this.j) {
                if (!this.g) {
                    b();
                    this.d.clear();
                    this.d.limit(this.o + 1);
                }
                if (this.i) {
                    return -1;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (this.e.remaining() == 0) {
                        if (this.h) {
                            this.i = true;
                            break;
                        }
                        a();
                    }
                    int iMin = Math.min(this.e.remaining(), i2 - i3);
                    this.e.get(bArr, i3 + i, iMin);
                    i3 += iMin;
                }
                if (i3 == 0 && this.i) {
                    return -1;
                }
                return i3;
            }
            throw new IOException("This StreamingAeadDecryptingStream is in an undefined state");
        } catch (Throwable th) {
            throw th;
        }
    }
}
