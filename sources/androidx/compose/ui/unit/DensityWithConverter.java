package androidx.compose.ui.unit;

import android.support.v4.media.session.a;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DensityWithConverter;", "Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final /* data */ class DensityWithConverter implements Density {
    public final float d;
    public final float e;
    public final FontScaleConverter f;

    public DensityWithConverter(float f, float f2, FontScaleConverter fontScaleConverter) {
        this.d = f;
        this.e = f2;
        this.f = fontScaleConverter;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long H(float f) {
        return TextUnitKt.e(llqqqql.a00610061aaaa, this.f.a(f));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: Q1, reason: from getter */
    public final float getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.d, densityWithConverter.d) == 0 && Float.compare(this.e, densityWithConverter.e) == 0 && Intrinsics.c(this.f, densityWithConverter.f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity, reason: from getter */
    public final float getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + a.b(this.e, Float.hashCode(this.d) * 31, 31);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j) {
        if (TextUnitType.a(TextUnit.b(j), llqqqql.a00610061aaaa)) {
            return this.f.b(TextUnit.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.f + ')';
    }
}
