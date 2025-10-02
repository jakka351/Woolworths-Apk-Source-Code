package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final PlatformMagnifierFactoryApi29Impl f847a = new PlatformMagnifierFactoryApi29Impl();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        public final void c(long j, float f, long j2) {
            boolean zIsNaN = Float.isNaN(f);
            Magnifier magnifier = this.f846a;
            if (!zIsNaN) {
                magnifier.setZoom(f);
            }
            if ((9223372034707292159L & j2) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final PlatformMagnifier a(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        if (z) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jF = density.F(j);
        float fT1 = density.T1(f);
        float fT12 = density.T1(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jF != 9205357640488583168L) {
            builder.setSize(MathKt.b(Float.intBitsToFloat((int) (jF >> 32))), MathKt.b(Float.intBitsToFloat((int) (jF & 4294967295L))));
        }
        if (!Float.isNaN(fT1)) {
            builder.setCornerRadius(fT1);
        }
        if (!Float.isNaN(fT12)) {
            builder.setElevation(fT12);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new PlatformMagnifierImpl(builder.build());
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean b() {
        return true;
    }
}
