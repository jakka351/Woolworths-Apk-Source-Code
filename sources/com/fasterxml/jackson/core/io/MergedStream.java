package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class MergedStream extends InputStream {
    public final IOContext d;
    public final InputStream e;
    public byte[] f;
    public int g;
    public final int h;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.d = iOContext;
        this.e = inputStream;
        this.f = bArr;
        this.g = i;
        this.h = i2;
    }

    public final void a() {
        byte[] bArr = this.f;
        if (bArr != null) {
            this.f = null;
            IOContext iOContext = this.d;
            if (iOContext != null) {
                iOContext.e(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f != null ? this.h - this.g : this.e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a();
        this.e.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        if (this.f == null) {
            this.e.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f == null && this.e.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f;
        if (bArr == null) {
            return this.e.read();
        }
        int i = this.g;
        int i2 = i + 1;
        this.g = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.h) {
            a();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        if (this.f == null) {
            this.e.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        if (this.f != null) {
            int i = this.g;
            j2 = this.h - i;
            if (j2 > j) {
                this.g = i + ((int) j);
                return j;
            }
            a();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? this.e.skip(j) + j2 : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f;
        if (bArr2 != null) {
            int i3 = this.g;
            int i4 = this.h;
            int i5 = i4 - i3;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i3, bArr, i, i2);
            int i6 = this.g + i2;
            this.g = i6;
            if (i6 >= i4) {
                a();
            }
            return i2;
        }
        return this.e.read(bArr, i, i2);
    }
}
