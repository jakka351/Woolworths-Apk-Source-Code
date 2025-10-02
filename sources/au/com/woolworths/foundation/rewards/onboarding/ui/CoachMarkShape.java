package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/CoachMarkShape;", "Landroidx/compose/ui/graphics/Shape;", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CoachMarkShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public final float f8638a;
    public final boolean b;

    public CoachMarkShape(float f, boolean z) {
        this.f8638a = f;
        this.b = z;
    }

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.h(layoutDirection, "layoutDirection");
        Intrinsics.h(density, "density");
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        float fT1 = density.T1(CoachMarkFrameKt.b);
        float fT12 = density.T1(CoachMarkFrameKt.c);
        float fT13 = density.T1(CoachMarkFrameKt.f8637a);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        RoundRect roundRectC = RoundRectKt.c((Float.floatToRawIntBits(fT13) << 32) | (Float.floatToRawIntBits(fT13) & 4294967295L), new Rect(BitmapDescriptorFactory.HUE_RED, fT1, Float.intBitsToFloat(i), Float.intBitsToFloat(i2)));
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float f = 2;
        float f2 = fT13 + fT1;
        float fB = Float.intBitsToFloat(i) >= f * f2 ? RangesKt.b(density.T1(this.f8638a) + (fIntBitsToFloat / f), f2, Float.intBitsToFloat(i) - f2) : Float.intBitsToFloat(i) / f;
        Path.k(androidPathA, roundRectC);
        androidPathA.a(fB - fT1, fT1);
        androidPathA.s(f * fT1, BitmapDescriptorFactory.HUE_RED);
        float f3 = (-fT1) + fT12;
        androidPathA.s(f3, f3);
        float f4 = -fT12;
        androidPathA.h(f4, f4, -(f * fT12), BitmapDescriptorFactory.HUE_RED);
        androidPathA.close();
        if (this.b) {
            float[] fArrA = Matrix.a();
            Matrix.e(fArrA, 1.0f, -1.0f);
            Matrix.h(fArrA, BitmapDescriptorFactory.HUE_RED, -Float.intBitsToFloat(i2), 5);
            if (androidPathA.d == null) {
                androidPathA.d = new android.graphics.Matrix();
            }
            android.graphics.Matrix matrix = androidPathA.d;
            Intrinsics.e(matrix);
            AndroidMatrixConversions_androidKt.a(matrix, fArrA);
            android.graphics.Path path = androidPathA.f1761a;
            android.graphics.Matrix matrix2 = androidPathA.d;
            Intrinsics.e(matrix2);
            path.transform(matrix2);
        }
        return new Outline.Generic(androidPathA);
    }
}
