package androidx.compose.ui.unit;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "widthVal", "heightVal", "", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConstraintsKt {
    public static final long a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i2);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iJ = Constraints.j(j);
        int iH = Constraints.h(j);
        if (i < iJ) {
            i = iJ;
        }
        if (i <= iH) {
            iH = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int i3 = Constraints.i(j);
        int iG = Constraints.g(j);
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 <= iG) {
            iG = i2;
        }
        return (iH << 32) | (iG & 4294967295L);
    }

    public static final long e(long j, long j2) {
        int iJ = Constraints.j(j);
        int iH = Constraints.h(j);
        int i = Constraints.i(j);
        int iG = Constraints.g(j);
        int iJ2 = Constraints.j(j2);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = Constraints.h(j2);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        int i2 = Constraints.i(j2);
        if (i2 < i) {
            i2 = i;
        }
        if (i2 > iG) {
            i2 = iG;
        }
        int iG2 = Constraints.g(j2);
        if (iG2 >= i) {
            i = iG2;
        }
        if (i <= iG) {
            iG = i;
        }
        return a(iJ2, iH, i2, iG);
    }

    public static final int f(int i, long j) {
        int i2 = Constraints.i(j);
        int iG = Constraints.g(j);
        if (i < i2) {
            i = i2;
        }
        return i > iG ? iG : i;
    }

    public static final int g(int i, long j) {
        int iJ = Constraints.j(j);
        int iH = Constraints.h(j);
        if (i < iJ) {
            i = iJ;
        }
        return i > iH ? iH : i;
    }

    public static final long h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iC = c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iC2 = c(i6);
        if (iC + iC2 > 31) {
            k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iC2 - 13;
        return ((i7 & (~(i7 >> 31))) << 33) | ((i9 >> 1) + (i9 & 1)) | (i << 2) | (i3 << (iC2 + 2)) | ((i8 & (~(i8 >> 31))) << (iC2 + 33));
    }

    public static final long i(int i, int i2, long j) {
        int iJ = Constraints.j(j) + i;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = Constraints.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i) < 0) {
            iH = 0;
        }
        int i3 = Constraints.i(j) + i2;
        if (i3 < 0) {
            i3 = 0;
        }
        int iG = Constraints.g(j);
        return a(iJ, iH, i3, (iG == Integer.MAX_VALUE || (iG = iG + i2) >= 0) ? iG : 0);
    }

    public static /* synthetic */ long j(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(i, i2, j);
    }

    public static final void k(int i, int i2) {
        throw new IllegalArgumentException(b.j(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void l(int i) {
        throw new IllegalArgumentException(a.e(i, "Can't represent a size of ", " in Constraints"));
    }
}
