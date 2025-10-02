package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemPropsKt {
    public static final int a() {
        return SystemPropsKt__SystemPropsKt.f24731a;
    }

    public static final long b(long j, long j2, long j3, String str) {
        String strC = c(str);
        if (strC == null) {
            return j;
        }
        Long lJ0 = StringsKt.j0(strC);
        if (lJ0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strC + '\'').toString());
        }
        long jLongValue = lJ0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j2);
        androidx.constraintlayout.core.state.a.A(sb, "..", j3, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final String c(String str) {
        int i = SystemPropsKt__SystemPropsKt.f24731a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static int d(int i, int i2, String str) {
        return (int) b(i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
