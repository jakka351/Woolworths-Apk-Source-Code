package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Measurable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ e(long j, int i) {
        this.d = i;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                DrawScope drawBehind = (DrawScope) obj;
                Intrinsics.h(drawBehind, "$this$drawBehind");
                long jH = drawBehind.h();
                DrawScope.j0(drawBehind, this.e, Math.max(Float.intBitsToFloat((int) ((jH >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jH & 2147483647L))) / 1.3f, 0L, null, 0, 124);
                return Unit.f24250a;
            case 1:
                DrawScope drawBehind2 = (DrawScope) obj;
                Intrinsics.h(drawBehind2, "$this$drawBehind");
                long jH2 = drawBehind2.h();
                DrawScope.j0(drawBehind2, this.e, Math.max(Float.intBitsToFloat((int) ((jH2 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jH2 & 2147483647L))) / 1.3f, 0L, null, 0, 124);
                return Unit.f24250a;
            case 2:
                DrawScope drawBehind3 = (DrawScope) obj;
                Intrinsics.h(drawBehind3, "$this$drawBehind");
                float fT1 = drawBehind3.T1(1);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind3.h() >> 32)) - r2) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind3.h() >> 32)) - (fT1 / 2);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind3.h() & 4294967295L));
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                long j = this.e;
                drawBehind3.b1(j, jFloatToRawIntBits, jFloatToRawIntBits2, fT1, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind3.h() & 4294967295L));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawBehind3.h() >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (drawBehind3.h() & 4294967295L));
                drawBehind3.b1(j, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32), fT1, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                return Unit.f24250a;
            case 3:
                CacheDrawScope drawWithCache = (CacheDrawScope) obj;
                Intrinsics.h(drawWithCache, "$this$drawWithCache");
                return drawWithCache.i(new e(this.e, 4));
            case 4:
                DrawScope onDrawBehind = (DrawScope) obj;
                Intrinsics.h(onDrawBehind, "$this$onDrawBehind");
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (onDrawBehind.h() >> 32));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (onDrawBehind.h() & 4294967295L));
                long jFloatToRawIntBits3 = (Float.floatToRawIntBits(fIntBitsToFloat7) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat6) << 32);
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (onDrawBehind.h() & 4294967295L)) / 2;
                DrawScope.g0(onDrawBehind, this.e, 0L, jFloatToRawIntBits3, (Float.floatToRawIntBits(fIntBitsToFloat8) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L), null, BitmapDescriptorFactory.HUE_RED, 242);
                return Unit.f24250a;
            case 5:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                return BackgroundKt.b(conditional, this.e, RoundedCornerShapeKt.f1100a);
            case 6:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                return BorderKt.a(conditional2, 1, this.e, RoundedCornerShapeKt.f1100a);
            case 7:
                Modifier conditional3 = (Modifier) obj;
                Intrinsics.h(conditional3, "$this$conditional");
                return PaddingKt.h(BackgroundKt.b(ClipKt.a(conditional3, RoundedCornerShapeKt.b(4)), this.e, RectangleShapeKt.f1779a), 2, BitmapDescriptorFactory.HUE_RED, 2);
            case 8:
                Measurable item = (Measurable) obj;
                Intrinsics.h(item, "item");
                return item.c0(this.e);
            case 9:
                Modifier conditional4 = (Modifier) obj;
                Intrinsics.h(conditional4, "$this$conditional");
                return BackgroundKt.b(conditional4, this.e, RectangleShapeKt.f1779a);
            default:
                return Long.valueOf(this.e);
        }
    }
}
