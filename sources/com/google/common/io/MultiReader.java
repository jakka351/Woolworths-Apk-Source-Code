package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes6.dex */
class MultiReader extends Reader {
    public Reader d;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.d;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.d = null;
            }
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        Reader reader = this.d;
        if (reader == null) {
            return -1;
        }
        int i3 = reader.read(cArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        close();
        throw null;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        Reader reader = this.d;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        Reader reader;
        Preconditions.f("n is negative", j >= 0);
        if (j <= 0 || (reader = this.d) == null) {
            return 0L;
        }
        long jSkip = reader.skip(j);
        if (jSkip > 0) {
            return jSkip;
        }
        close();
        throw null;
    }
}
