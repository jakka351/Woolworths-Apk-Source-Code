package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SideCalculator$Companion$LeftSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long c(long j) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final float d(float f, float f2) {
        return f;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final Insets e(Insets insets, int i) {
        return Insets.of(i, insets.top, insets.right, insets.bottom);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final int f(Insets insets) {
        return insets.left;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long g(long j, float f) {
        return VelocityKt.a(Velocity.d(j) - f, BitmapDescriptorFactory.HUE_RED);
    }
}
