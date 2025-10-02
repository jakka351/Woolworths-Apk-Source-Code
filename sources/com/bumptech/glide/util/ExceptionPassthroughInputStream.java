package com.bumptech.glide.util;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class ExceptionPassthroughInputStream extends InputStream {
    public static final ArrayDeque f;
    public RecyclableBufferedInputStream d;
    public IOException e;

    static {
        char[] cArr = Util.f13989a;
        f = new ArrayDeque(0);
    }

    public static ExceptionPassthroughInputStream a(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        ExceptionPassthroughInputStream exceptionPassthroughInputStream;
        ArrayDeque arrayDeque = f;
        synchronized (arrayDeque) {
            exceptionPassthroughInputStream = (ExceptionPassthroughInputStream) arrayDeque.poll();
        }
        if (exceptionPassthroughInputStream == null) {
            exceptionPassthroughInputStream = new ExceptionPassthroughInputStream();
        }
        exceptionPassthroughInputStream.d = recyclableBufferedInputStream;
        return exceptionPassthroughInputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.d.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.d.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.d.read();
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    public final void release() {
        this.e = null;
        this.d = null;
        ArrayDeque arrayDeque = f;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.d.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.d.skip(j);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.d.read(bArr);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.d.read(bArr, i, i2);
        } catch (IOException e) {
            this.e = e;
            throw e;
        }
    }
}
