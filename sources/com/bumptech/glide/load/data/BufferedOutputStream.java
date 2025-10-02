package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class BufferedOutputStream extends OutputStream {
    public final FileOutputStream d;
    public byte[] e;
    public final ArrayPool f;
    public int g;

    public BufferedOutputStream(FileOutputStream fileOutputStream, ArrayPool arrayPool) {
        this.d = fileOutputStream;
        this.f = arrayPool;
        this.e = (byte[]) arrayPool.c(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.d;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.e;
            if (bArr != null) {
                this.f.put(bArr);
                this.e = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.g;
        FileOutputStream fileOutputStream = this.d;
        if (i > 0) {
            fileOutputStream.write(this.e, 0, i);
            this.g = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.e;
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.d.write(bArr, 0, i3);
        this.g = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.g;
            FileOutputStream fileOutputStream = this.d;
            if (i6 == 0 && i4 >= this.e.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.e.length - i6);
            System.arraycopy(bArr, i5, this.e, this.g, iMin);
            int i7 = this.g + iMin;
            this.g = i7;
            i3 += iMin;
            byte[] bArr2 = this.e;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.g = 0;
            }
        } while (i3 < i2);
    }
}
