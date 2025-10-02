package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/BorderConfig;", "", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class BorderConfig {

    /* renamed from: a, reason: collision with root package name */
    public final float f4711a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public BorderConfig(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4711a = f;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderConfig)) {
            return false;
        }
        BorderConfig borderConfig = (BorderConfig) obj;
        return Dp.a(this.f4711a, borderConfig.f4711a) && this.b == borderConfig.b && this.c == borderConfig.c && this.d == borderConfig.d && this.e == borderConfig.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(Float.hashCode(this.f4711a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("BorderConfig(cornerRadiusDp=", Dp.b(this.f4711a), ", hasStartBorder=", ", hasTopBorder=", this.b);
        au.com.woolworths.android.onesite.a.D(sbQ, this.c, ", hasEndBorder=", this.d, ", hasBottomBorder=");
        return YU.a.k(")", sbQ, this.e);
    }
}
