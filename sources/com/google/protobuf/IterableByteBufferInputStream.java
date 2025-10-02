package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes6.dex */
class IterableByteBufferInputStream extends InputStream {
    public Iterator d;
    public ByteBuffer e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public byte[] j;
    public int k;
    public long l;

    public final boolean a() {
        this.g++;
        Iterator it = this.d;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.e = byteBuffer;
        this.h = byteBuffer.position();
        if (this.e.hasArray()) {
            this.i = true;
            this.j = this.e.array();
            this.k = this.e.arrayOffset();
        } else {
            this.i = false;
            this.l = UnsafeUtil.b(this.e);
            this.j = null;
        }
        return true;
    }

    public final void b(int i) {
        int i2 = this.h + i;
        this.h = i2;
        if (i2 == this.e.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.g == this.f) {
            return -1;
        }
        if (this.i) {
            int i = this.j[this.h + this.k] & 255;
            b(1);
            return i;
        }
        int iF = UnsafeUtil.c.f(this.h + this.l) & 255;
        b(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.g == this.f) {
            return -1;
        }
        int iLimit = this.e.limit();
        int i3 = this.h;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.i) {
            System.arraycopy(this.j, i3 + this.k, bArr, i, i2);
            b(i2);
            return i2;
        }
        int iPosition = this.e.position();
        this.e.position(this.h);
        this.e.get(bArr, i, i2);
        this.e.position(iPosition);
        b(i2);
        return i2;
    }
}
