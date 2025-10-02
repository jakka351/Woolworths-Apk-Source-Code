package coil3.decode;

import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.util.IntPair;
import coil3.util.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/DecodeUtils;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DecodeUtils {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale = Scale.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final long a(int i, int i2, Size size, Scale scale, Size size2) {
        int i3;
        int i4;
        if (!Intrinsics.c(size, Size.c)) {
            i = c(size.f13149a, scale);
            i2 = c(size.b, scale);
        }
        Dimension dimension = size2.f13149a;
        Dimension dimension2 = size2.b;
        if (dimension instanceof Dimension.Pixels) {
            Function1 function1 = UtilsKt.f13156a;
            if (i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((Dimension.Pixels) dimension).f13147a)) {
                i = i4;
            }
        }
        if (dimension2 instanceof Dimension.Pixels) {
            Function1 function12 = UtilsKt.f13156a;
            if (i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((Dimension.Pixels) dimension2).f13147a)) {
                i2 = i3;
            }
        }
        return IntPair.a(i, i2);
    }

    public static final double b(int i, int i2, int i3, int i4, Scale scale) {
        double d = i3 / i;
        double d2 = i4 / i2;
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int c(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f13147a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
