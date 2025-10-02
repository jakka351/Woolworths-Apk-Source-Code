package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebSocketProtocol {

    /* renamed from: a, reason: collision with root package name */
    public static final WebSocketProtocol f26773a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public static String a(int i) {
        if (i < 1000 || i >= 5000) {
            return YU.a.d(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return YU.a.e(i, "Code ", " is reserved and may not be used.");
    }

    public static void b(Buffer.UnsafeCursor cursor, byte[] key) {
        long j;
        Intrinsics.h(cursor, "cursor");
        Intrinsics.h(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.h;
            int i2 = cursor.i;
            int i3 = cursor.j;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.g;
            Buffer buffer = cursor.d;
            Intrinsics.e(buffer);
            if (j2 == buffer.e) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.g;
        } while (cursor.b(j == -1 ? 0L : j + (cursor.j - cursor.i)) != -1);
    }
}
