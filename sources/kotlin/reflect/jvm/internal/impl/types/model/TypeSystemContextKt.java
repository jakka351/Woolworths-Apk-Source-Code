package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
public final class TypeSystemContextKt {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Variance variance2 = Variance.f;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final TypeVariance a(Variance variance) {
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            return TypeVariance.g;
        }
        if (iOrdinal == 1) {
            return TypeVariance.e;
        }
        if (iOrdinal == 2) {
            return TypeVariance.f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
