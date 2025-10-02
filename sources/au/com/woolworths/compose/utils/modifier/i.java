package au.com.woolworths.compose.utils.modifier;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;

    public /* synthetic */ i(long j, float f, float f2) {
        this.d = f;
        this.e = j;
        this.f = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawBehind = (DrawScope) obj;
        int i = VerticalShadowModifierKt.b;
        Intrinsics.h(drawBehind, "$this$drawBehind");
        Canvas canvasA = drawBehind.getE().a();
        AndroidPaint androidPaintA = AndroidPaint_androidKt.a();
        Paint paint = androidPaintA.f1759a;
        float f = this.d;
        if (!Dp.a(f, 0)) {
            paint.setMaskFilter(new BlurMaskFilter(drawBehind.T1(f), BlurMaskFilter.Blur.NORMAL));
        }
        paint.setColor(ColorKt.j(this.e));
        canvasA.k(BitmapDescriptorFactory.HUE_RED, drawBehind.T1(this.f), Float.intBitsToFloat((int) (drawBehind.h() >> 32)), Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L)), androidPaintA);
        return Unit.f24250a;
    }
}
