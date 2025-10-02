package com.fasterxml.jackson.core.util;

import androidx.camera.core.impl.b;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] i = new byte[0];
    public final BufferRecycler d;
    public final LinkedList e;
    public int f;
    public byte[] g;
    public int h;

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    public final void a() {
        int length = this.f + this.g.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.e.add(this.g);
        this.g = new byte[iMax];
        this.h = 0;
    }

    public final void b(int i2) {
        if (this.h >= this.g.length) {
            a();
        }
        byte[] bArr = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    public final void c(int i2) {
        int i3 = this.h;
        int i4 = i3 + 2;
        byte[] bArr = this.g;
        if (i4 >= bArr.length) {
            b(i2 >> 16);
            b(i2 >> 8);
            b(i2);
            return;
        }
        int i5 = i3 + 1;
        this.h = i5;
        bArr[i3] = (byte) (i2 >> 16);
        this.h = i4;
        bArr[i5] = (byte) (i2 >> 8);
        this.h = i3 + 3;
        bArr[i4] = (byte) i2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(int i2) {
        int i3 = this.h;
        int i4 = i3 + 1;
        byte[] bArr = this.g;
        if (i4 >= bArr.length) {
            b(i2 >> 8);
            b(i2);
        } else {
            this.h = i4;
            bArr[i3] = (byte) (i2 >> 8);
            this.h = i3 + 2;
            bArr[i4] = (byte) i2;
        }
    }

    public final byte[] e() {
        int i2 = this.f + this.h;
        if (i2 == 0) {
            return i;
        }
        byte[] bArr = new byte[i2];
        LinkedList linkedList = this.e;
        Iterator it = linkedList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i3, length);
            i3 += length;
        }
        System.arraycopy(this.g, 0, bArr, i3, this.h);
        int i4 = i3 + this.h;
        if (i4 != i2) {
            throw new RuntimeException(b.j(i2, i4, "Internal error: total len assumed to be ", ", copied ", " bytes"));
        }
        if (!linkedList.isEmpty()) {
            reset();
        }
        return bArr;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final void reset() {
        this.f = 0;
        this.h = 0;
        LinkedList linkedList = this.e;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i2) {
        this.e = new LinkedList();
        this.d = bufferRecycler;
        this.g = bufferRecycler == null ? new byte[i2 > 131072 ? 131072 : i2] : bufferRecycler.a(2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        while (true) {
            int iMin = Math.min(this.g.length - this.h, i3);
            if (iMin > 0) {
                System.arraycopy(bArr, i2, this.g, this.h, iMin);
                i2 += iMin;
                this.h += iMin;
                i3 -= iMin;
            }
            if (i3 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public ByteArrayBuilder(byte[] bArr, int i2) {
        this.e = new LinkedList();
        this.d = null;
        this.g = bArr;
        this.h = i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        b(i2);
    }
}
