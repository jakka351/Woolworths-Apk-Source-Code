package coil.decode;

import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/DecodeUtils;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DecodeUtils {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    public static final double a(int i, int i2, int i3, int i4, Scale scale) {
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
}
