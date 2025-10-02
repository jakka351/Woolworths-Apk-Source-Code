package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    public volatile byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final ArrayPool i;

    public static class InvalidMarkException extends IOException {
    }

    public RecyclableBufferedInputStream(InputStream inputStream, ArrayPool arrayPool) {
        super(inputStream);
        this.g = -1;
        this.i = arrayPool;
        this.d = (byte[]) arrayPool.c(byte[].class, 65536);
    }

    public static void b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.g;
        if (i != -1) {
            int i2 = this.h - i;
            int i3 = this.f;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.e == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.i.c(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.d = bArr2;
                    this.i.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.h - this.g;
                this.h = i4;
                this.g = 0;
                this.e = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.h;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.e = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.g = -1;
            this.h = 0;
            this.e = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.d == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.e - this.h) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d != null) {
            this.i.put(this.d);
            this.d = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f = Math.max(this.f, i);
        this.g = this.h;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.d;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.h >= this.e && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.d && (bArr = this.d) == null) {
            b();
            throw null;
        }
        int i = this.e;
        int i2 = this.h;
        if (i - i2 <= 0) {
            return -1;
        }
        this.h = i2 + 1;
        return bArr[i2] & 255;
    }

    public final synchronized void release() {
        if (this.d != null) {
            this.i.put(this.d);
            this.d = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.d == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.g;
        if (-1 == i) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.h + " markLimit: " + this.f);
        }
        this.h = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.d;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i = this.e;
        int i2 = this.h;
        if (i - i2 >= j) {
            this.h = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.h = i;
        if (this.g == -1 || j > this.f) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.g = -1;
            }
            return j2 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.e;
        int i4 = this.h;
        if (i3 - i4 >= j - j2) {
            this.h = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.h = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.d;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.h;
            int i6 = this.e;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.h += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.g == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.d && (bArr2 = this.d) == null) {
                        b();
                        throw null;
                    }
                    int i8 = this.e;
                    int i9 = this.h;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.h += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            b();
            throw null;
        }
    }
}
