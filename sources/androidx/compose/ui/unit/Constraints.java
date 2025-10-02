package androidx.compose.ui.unit;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "Companion", "value", "", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Constraints {

    /* renamed from: a, reason: collision with root package name */
    public final long f2197a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "", "Infinity", "I", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static long a(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i3, 262142);
            int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public static long b(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i, 262142);
            int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        public static long c(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.a("width and height must be >= 0");
            }
            return ConstraintsKt.h(i, i, i2, i2);
        }

        public static long d(int i) {
            if (i < 0) {
                InlineClassHelperKt.a("height must be >= 0");
            }
            return ConstraintsKt.h(0, Integer.MAX_VALUE, i, i);
        }

        public static long e(int i) {
            if (i < 0) {
                InlineClassHelperKt.a("width must be >= 0");
            }
            return ConstraintsKt.h(i, i, 0, Integer.MAX_VALUE);
        }
    }

    public /* synthetic */ Constraints(long j) {
        this.f2197a = j;
    }

    public static long a(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = g(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            InlineClassHelperKt.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.h(i, i2, i3, i4);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << a.C((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean f(long j) {
        int i = (int) (3 & j);
        int iC = (1 << a.C((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iC;
        int i3 = ((int) (j >> 33)) & iC;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    public static final int g(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int h(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int iC = i2 & ((1 << a.C((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iC == 0) {
            return Integer.MAX_VALUE;
        }
        return iC - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int j(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << a.C((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public static final boolean k(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static String l(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j));
        sb.append(", maxHeight = ");
        return b.r(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Constraints) {
            return this.f2197a == ((Constraints) obj).f2197a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2197a);
    }

    public final String toString() {
        return l(this.f2197a);
    }
}
