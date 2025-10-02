package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.IOException;
import java.io.InputStream;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
final class MultiInputStream extends InputStream {
    public InputStream d;

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.d;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.d = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream == null) {
            return -1;
        }
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        close();
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        InputStream inputStream = this.d;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.d.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        InputStream inputStream = this.d;
        if (inputStream == null) {
            return -1;
        }
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        close();
        throw null;
    }
}
