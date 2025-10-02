package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@Deprecated
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class OverscrollConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final long f842a;
    public final PaddingValuesImpl b;

    public OverscrollConfiguration() {
        long jD = ColorKt.d(4284900966L);
        PaddingValuesImpl paddingValuesImplA = PaddingKt.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3);
        this.f842a = jD;
        this.b = paddingValuesImplA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OverscrollConfiguration.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.c(this.f842a, overscrollConfiguration.f842a) && Intrinsics.c(this.b, overscrollConfiguration.b);
    }

    public final int hashCode() {
        int i = Color.l;
        return this.b.hashCode() + (Long.hashCode(this.f842a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        android.support.v4.media.session.a.A(this.f842a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
