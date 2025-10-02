package au.com.woolworths.shared.ui.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shared/ui/compose/CoachmarkShape;", "Landroidx/compose/ui/graphics/Shape;", "shared-ui-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CoachmarkShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final float f10087a;

    public CoachmarkShape(float f) {
        this.f10087a = f;
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.h(layoutDirection, "layoutDirection");
        Intrinsics.h(density, "density");
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        float fT1 = density.T1(CoachmarkKt.b);
        float fT12 = density.T1(CoachmarkKt.c);
        float fT13 = density.T1(CoachmarkKt.f10086a);
        int i = (int) (j >> 32);
        RoundRect roundRectC = RoundRectKt.c((Float.floatToRawIntBits(fT13) & 4294967295L) | (Float.floatToRawIntBits(fT13) << 32), new Rect(BitmapDescriptorFactory.HUE_RED, fT1, Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))));
        float f = 2;
        float fT14 = density.T1(this.f10087a) + (Float.intBitsToFloat(i) / f);
        Path.k(androidPathA, roundRectC);
        androidPathA.a(fT14 - fT1, fT1);
        androidPathA.s(f * fT1, BitmapDescriptorFactory.HUE_RED);
        float f2 = (-fT1) + fT12;
        androidPathA.s(f2, f2);
        float f3 = -fT12;
        androidPathA.f(f3, f3, -(f * fT12), BitmapDescriptorFactory.HUE_RED);
        androidPathA.close();
        return new Outline.Generic(androidPathA);
    }
}
