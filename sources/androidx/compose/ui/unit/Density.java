package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface Density extends FontScaling {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default float B(int i) {
        return i / getDensity();
    }

    default float C(float f) {
        return f / getDensity();
    }

    default long F(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fT1 = T1(DpSize.b(j));
        float fT12 = T1(DpSize.a(j));
        return (Float.floatToRawIntBits(fT12) & 4294967295L) | (Float.floatToRawIntBits(fT1) << 32);
    }

    default float T1(float f) {
        return getDensity() * f;
    }

    default int W1(long j) {
        return Math.round(t1(j));
    }

    float getDensity();

    default long p(long j) {
        if (j != 9205357640488583168L) {
            return DpKt.a(C(Float.intBitsToFloat((int) (j >> 32))), C(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default int r1(float f) {
        float fT1 = T1(f);
        if (Float.isInfinite(fT1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fT1);
    }

    default long t(int i) {
        return H(B(i));
    }

    default float t1(long j) {
        if (!TextUnitType.a(TextUnit.b(j), llqqqql.a00610061aaaa)) {
            InlineClassHelperKt.b("Only Sp can convert to Px");
        }
        return T1(r(j));
    }

    default long v(float f) {
        return H(C(f));
    }
}
