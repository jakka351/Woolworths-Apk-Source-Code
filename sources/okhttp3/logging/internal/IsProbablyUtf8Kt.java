package okhttp3.logging.internal;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"logging-interceptor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IsProbablyUtf8Kt {
    public static final boolean a(Buffer buffer) {
        Buffer buffer2;
        int i;
        Intrinsics.h(buffer, "<this>");
        try {
            buffer2 = new Buffer();
            long j = buffer.e;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            buffer.d(buffer2, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (buffer2.X1()) {
                return true;
            }
            int iA = buffer2.A();
            if (Character.isISOControl(iA) && !Character.isWhitespace(iA)) {
                return false;
            }
        }
        return true;
    }
}
