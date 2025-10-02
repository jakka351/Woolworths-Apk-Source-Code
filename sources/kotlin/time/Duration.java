package kotlin.time;

import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/Duration;", "", "Companion", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Duration implements Comparable<Duration> {
    public static final long e;
    public static final long f;
    public static final /* synthetic */ int g = 0;
    public final long d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = DurationJvmKt.f24681a;
        e = DurationKt.b(4611686018427387903L);
        f = DurationKt.b(-4611686018427387903L);
    }

    public /* synthetic */ Duration(long j) {
        this.d = j;
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return DurationKt.b(RangesKt.e(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.d((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            String strJ = StringsKt.J(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strJ.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strJ.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strJ, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strJ, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || f(j)) ? m(j, DurationUnit.g) : j >> 1;
    }

    public static final int e(long j) {
        if (f(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean f(long j) {
        return j == e || j == f;
    }

    public static final long l(long j, long j2) {
        if (f(j)) {
            if (!f(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? DurationKt.b(j3 / 1000000) : DurationKt.d(j3) : DurationKt.c(j3);
    }

    public static final long m(long j, DurationUnit unit) {
        Intrinsics.h(unit, "unit");
        if (j == e) {
            return Long.MAX_VALUE;
        }
        if (j == f) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.b(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.e : DurationUnit.g, unit);
    }

    public static String n(long j) {
        long j2;
        int iM;
        if (j == 0) {
            return "0s";
        }
        if (j == e) {
            return "Infinity";
        }
        if (j == f) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long jO = j < 0 ? o(j) : j;
        long jM = m(jO, DurationUnit.k);
        int iM2 = f(jO) ? 0 : (int) (m(jO, DurationUnit.j) % 24);
        if (f(jO)) {
            j2 = 0;
            iM = 0;
        } else {
            j2 = 0;
            iM = (int) (m(jO, DurationUnit.i) % 60);
        }
        int iM3 = f(jO) ? 0 : (int) (m(jO, DurationUnit.h) % 60);
        int iE = e(jO);
        boolean z2 = jM != j2;
        boolean z3 = iM2 != 0;
        boolean z4 = iM != 0;
        boolean z5 = (iM3 == 0 && iE == 0) ? false : true;
        if (z2) {
            sb.append(jM);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM3 != 0 || z2 || z3 || z4) {
                b(sb, iM3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long o(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = DurationJvmKt.f24681a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        return c(this.d, duration.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.d == ((Duration) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }

    public final String toString() {
        return n(this.d);
    }
}
