package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    @Override // androidx.compose.ui.unit.Density
    default float B(int i) {
        return i / getD();
    }

    @Override // androidx.compose.ui.unit.Density
    default float C(float f) {
        return f / getD();
    }

    @Override // androidx.compose.ui.unit.Density
    default long F(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fT1 = T1(DpSize.b(j));
        float fT12 = T1(DpSize.a(j));
        return (Float.floatToRawIntBits(fT12) & 4294967295L) | (Float.floatToRawIntBits(fT1) << 32);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    default long H(float f) {
        return TextUnitKt.e(llqqqql.a00610061aaaa, f / getE());
    }

    List e0(int i, long j);

    @Override // androidx.compose.ui.unit.Density
    default long p(long j) {
        if (j != 9205357640488583168L) {
            return DpKt.a(C(Float.intBitsToFloat((int) (j >> 32))), C(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    default float r(long j) {
        if (!TextUnitType.a(TextUnit.b(j), llqqqql.a00610061aaaa)) {
            InlineClassHelperKt.c("Only Sp can convert to Px");
        }
        return getE() * TextUnit.c(j);
    }

    @Override // androidx.compose.ui.unit.Density
    default long t(int i) {
        return TextUnitKt.e(llqqqql.a00610061aaaa, i / (getD() * getE()));
    }

    @Override // androidx.compose.ui.unit.Density
    default long v(float f) {
        return TextUnitKt.e(llqqqql.a00610061aaaa, f / (getD() * getE()));
    }
}
