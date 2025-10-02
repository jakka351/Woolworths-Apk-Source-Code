package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilJvmKt;
import okio.ByteString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f26740a = new Http2();
    public static final ByteString b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static {
        ByteString byteString = ByteString.g;
        b = ByteString.Companion.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.g(binaryString, "toBinaryString(...)");
            strArr[i] = StringsKt.R(_UtilJvmKt.d("%8s", binaryString), ' ', '0');
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = YU.a.o(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = d;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = YU.a.o(sb, strArr3[i4], "|PADDED");
        }
        int length = d.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = d;
            if (strArr4[i7] == null) {
                strArr4[i7] = e[i7];
            }
        }
    }

    private Http2() {
    }

    public static String a(int i) {
        String[] strArr = c;
        return i < strArr.length ? strArr[i] : _UtilJvmKt.d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = a(r6)
            if (r7 != 0) goto L9
            java.lang.String r6 = ""
            goto L58
        L9:
            r1 = 2
            java.lang.String[] r2 = okhttp3.internal.http2.Http2.e
            if (r6 == r1) goto L56
            r1 = 3
            if (r6 == r1) goto L56
            r1 = 4
            if (r6 == r1) goto L4d
            r1 = 6
            if (r6 == r1) goto L4d
            r1 = 7
            if (r6 == r1) goto L56
            r1 = 8
            if (r6 == r1) goto L56
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.d
            int r3 = r1.length
            if (r7 >= r3) goto L29
            r1 = r1[r7]
            kotlin.jvm.internal.Intrinsics.e(r1)
            goto L2b
        L29:
            r1 = r2[r7]
        L2b:
            r2 = 5
            r3 = 0
            if (r6 != r2) goto L3c
            r2 = r7 & 4
            if (r2 == 0) goto L3c
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = kotlin.text.StringsKt.Q(r1, r6, r7, r3)
            goto L58
        L3c:
            if (r6 != 0) goto L4b
            r6 = r7 & 32
            if (r6 == 0) goto L4b
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = kotlin.text.StringsKt.Q(r1, r6, r7, r3)
            goto L58
        L4b:
            r6 = r1
            goto L58
        L4d:
            r6 = 1
            if (r7 != r6) goto L53
            java.lang.String r6 = "ACK"
            goto L58
        L53:
            r6 = r2[r7]
            goto L58
        L56:
            r6 = r2[r7]
        L58:
            if (r8 == 0) goto L5d
            java.lang.String r7 = "<<"
            goto L5f
        L5d:
            java.lang.String r7 = ">>"
        L5f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r5, r0, r6}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = okhttp3.internal._UtilJvmKt.d(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2.b(int, int, int, int, boolean):java.lang.String");
    }

    public static String c(int i, int i2, long j, boolean z) {
        return _UtilJvmKt.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
