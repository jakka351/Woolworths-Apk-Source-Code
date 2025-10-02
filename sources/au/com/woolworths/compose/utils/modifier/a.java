package au.com.woolworths.compose.utils.modifier;

import android.graphics.Paint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SweepGradient;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutCoordinates;
import au.com.woolworths.design.wx.foundation.ToneColors;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(float f, float f2, Object obj, Object obj2, int i) {
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = obj;
        this.h = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Paint paint = (Paint) this.g;
                androidx.compose.ui.graphics.Paint paint2 = (androidx.compose.ui.graphics.Paint) this.h;
                ContentDrawScope drawWithContent = (ContentDrawScope) obj;
                Intrinsics.h(drawWithContent, "$this$drawWithContent");
                Canvas canvasA = drawWithContent.getE().a();
                long j = Color.b;
                float f = this.e;
                float fT1 = drawWithContent.T1(f);
                int iJ = ColorKt.j(Color.b(j, 0.18f));
                int iJ2 = ColorKt.j(Color.b(j, BitmapDescriptorFactory.HUE_RED));
                float fT12 = drawWithContent.T1(this.f);
                paint.setColor(iJ2);
                paint.setShadowLayer(fT1, BitmapDescriptorFactory.HUE_RED, drawWithContent.T1(f / 2.0f), iJ);
                canvasA.t(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (drawWithContent.h() >> 32)), Float.intBitsToFloat((int) (drawWithContent.h() & 4294967295L)), fT12, fT12, paint2);
                drawWithContent.Q0();
                break;
            case 1:
                Animatable animatable = (Animatable) this.g;
                Animatable animatable2 = (Animatable) this.h;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.M0() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.M0() & 4294967295L)) - (this.e * this.f);
                DrawScope.j0(Canvas, ((Color) animatable.f()).f1766a, ((Number) animatable2.f()).floatValue(), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), null, 0, 120);
                break;
            case 2:
                Stroke stroke = (Stroke) this.g;
                List list = (List) this.h;
                DrawScope Canvas2 = (DrawScope) obj;
                Intrinsics.h(Canvas2, "$this$Canvas");
                long j2 = ToneColors.h;
                float fC = Size.c(Canvas2.h()) / 2.0f;
                float f2 = this.e;
                DrawScope.j0(Canvas2, j2, fC - f2, 0L, stroke, 0, 108);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas2.h() >> 32)) - (2 * f2);
                Canvas2.N1(new SweepGradient(list), BitmapDescriptorFactory.HUE_RED, this.f, false, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat3)), (832 & 128) != 0 ? Fill.f1802a : stroke);
                break;
            default:
                MutableFloatState mutableFloatState = (MutableFloatState) this.g;
                MutableFloatState mutableFloatState2 = (MutableFloatState) this.h;
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.h(it, "it");
                mutableFloatState.p(this.e / ((int) (it.a() >> 32)));
                if (this.f < mutableFloatState.a()) {
                    mutableFloatState2.p(mutableFloatState.a());
                }
                return Unit.f24250a;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(float f, Stroke stroke, List list, float f2) {
        this.d = 2;
        this.e = f;
        this.g = stroke;
        this.h = list;
        this.f = f2;
    }
}
