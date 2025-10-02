package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class MarkEnforcingInputStream extends FilterInputStream {
    public int d;

    public MarkEnforcingInputStream(ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
        super(exceptionPassthroughInputStream);
        this.d = Integer.MIN_VALUE;
    }

    public final long a(long j) {
        int i = this.d;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.d;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void b(long j) {
        int i = this.d;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.d = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.d = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i = super.read();
        b(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jA = a(j);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iA = (int) a(i2);
        if (iA == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iA);
        b(i3);
        return i3;
    }
}
