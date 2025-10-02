package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
final class CharSequenceReader extends Reader {
    public String d;
    public int e;
    public int f;

    public final void a() throws IOException {
        if (this.d == null) {
            throw new IOException("reader closed");
        }
    }

    public final int b() {
        Objects.requireNonNull(this.d);
        return this.d.length() - this.e;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = null;
    }

    @Override // java.io.Reader
    public final synchronized void mark(int i) {
        Preconditions.b(i, "readAheadLimit (%s) may not be negative", i >= 0);
        a();
        this.f = this.e;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final synchronized int read() {
        char cCharAt;
        a();
        Objects.requireNonNull(this.d);
        if (b() > 0) {
            String str = this.d;
            int i = this.e;
            this.e = i + 1;
            cCharAt = str.charAt(i);
        } else {
            cCharAt = 65535;
        }
        return cCharAt;
    }

    @Override // java.io.Reader
    public final synchronized boolean ready() {
        a();
        return true;
    }

    @Override // java.io.Reader
    public final synchronized void reset() {
        a();
        this.e = this.f;
    }

    @Override // java.io.Reader
    public final synchronized long skip(long j) {
        int iMin;
        Preconditions.c(j, "n (%s) may not be negative", j >= 0);
        a();
        iMin = (int) Math.min(b(), j);
        this.e += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final synchronized int read(char[] cArr, int i, int i2) {
        Preconditions.m(i, i + i2, cArr.length);
        a();
        Objects.requireNonNull(this.d);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(i2, b());
        for (int i3 = 0; i3 < iMin; i3++) {
            String str = this.d;
            int i4 = this.e;
            this.e = i4 + 1;
            cArr[i + i3] = str.charAt(i4);
        }
        return iMin;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final synchronized int read(CharBuffer charBuffer) {
        charBuffer.getClass();
        a();
        Objects.requireNonNull(this.d);
        if (!(b() > 0)) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), b());
        for (int i = 0; i < iMin; i++) {
            String str = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            charBuffer.put(str.charAt(i2));
        }
        return iMin;
    }
}
