package au.com.woolworths.foundation.rewards.common.ui;

import android.graphics.Path;
import android.graphics.RectF;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/OneEarBearShape;", "Landroidx/compose/ui/graphics/Shape;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class OneEarBearShape implements Shape {

    /* renamed from: a, reason: collision with root package name */
    public static final OneEarBearShape f8569a = new OneEarBearShape();

    @Override // androidx.compose.ui.graphics.Shape
    public final Outline a(long j, LayoutDirection layoutDirection, Density density) {
        Intrinsics.h(layoutDirection, "layoutDirection");
        Intrinsics.h(density, "density");
        AndroidPath androidPathA = AndroidPath_androidKt.a();
        Path path = androidPathA.f1761a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        Path.Direction[] directionArr = Path.Direction.d;
        if (androidPathA.b == null) {
            androidPathA.b = new RectF();
        }
        RectF rectF = androidPathA.b;
        Intrinsics.e(rectF);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2);
        RectF rectF2 = androidPathA.b;
        Intrinsics.e(rectF2);
        Path.Direction direction = Path.Direction.CCW;
        path.addOval(rectF2, direction);
        float fT1 = density.T1(16);
        float f = -density.T1(2);
        float f2 = fT1 + f;
        if (androidPathA.b == null) {
            androidPathA.b = new RectF();
        }
        RectF rectF3 = androidPathA.b;
        Intrinsics.e(rectF3);
        rectF3.set(f, f, f2, f2);
        RectF rectF4 = androidPathA.b;
        Intrinsics.e(rectF4);
        path.addOval(rectF4, direction);
        return new Outline.Generic(androidPathA);
    }
}
