package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RandomKt {
    public static final String a(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void b(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(a(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    public static final void c(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(a(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final int d(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
