package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SideCalculator$Companion$TopSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final float d(float f, float f2) {
        return f2;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final Insets e(Insets insets, int i) {
        return Insets.of(insets.left, i, insets.right, insets.bottom);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final int f(Insets insets) {
        return insets.top;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long g(long j, float f) {
        return VelocityKt.a(BitmapDescriptorFactory.HUE_RED, Velocity.e(j) - f);
    }
}
