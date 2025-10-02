package androidx.compose.foundation.shape;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final RoundedCornerShape f1100a = a(50);

    public static final RoundedCornerShape a(int i) {
        CornerSize cornerSizeA = CornerSizeKt.a(i);
        return new RoundedCornerShape(cornerSizeA, cornerSizeA, cornerSizeA, cornerSizeA);
    }

    public static final RoundedCornerShape b(float f) {
        DpCornerSize dpCornerSize = new DpCornerSize(f);
        return new RoundedCornerShape(dpCornerSize, dpCornerSize, dpCornerSize, dpCornerSize);
    }

    public static final RoundedCornerShape c(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(new DpCornerSize(f), new DpCornerSize(f2), new DpCornerSize(f3), new DpCornerSize(f4));
    }

    public static RoundedCornerShape d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return c(f, f2, f3, f4);
    }
}
