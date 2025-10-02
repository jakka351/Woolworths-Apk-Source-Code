package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes2.dex */
final class LogWriter extends Writer {
    public final StringBuilder e = new StringBuilder(128);
    public final String d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.e;
        if (sb.length() > 0) {
            Log.d(this.d, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.e.append(c);
            }
        }
    }
}
