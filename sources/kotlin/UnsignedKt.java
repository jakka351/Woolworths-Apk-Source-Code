package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class UnsignedKt {
    public static final int a(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }

    public static final double b(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final String c(int i, long j) {
        if (j >= 0) {
            CharsKt.b(i);
            String string = Long.toString(j, i);
            Intrinsics.g(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        CharsKt.b(i);
        String string2 = Long.toString(j3, i);
        Intrinsics.g(string2, "toString(...)");
        CharsKt.b(i);
        String string3 = Long.toString(j4, i);
        Intrinsics.g(string3, "toString(...)");
        return string2.concat(string3);
    }
}
