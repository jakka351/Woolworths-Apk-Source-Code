package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    public /* synthetic */ j(float f, MutableState mutableState, float f2) {
        this.d = 2;
        this.f = f;
        this.e = mutableState;
        this.g = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CanvasDrawScope$drawContext$1 e;
        long jD;
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.e;
                float f = this.g;
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                AndroidPath androidPathA = AndroidPath_androidKt.a();
                float f2 = this.f;
                float fT1 = Canvas.T1(f2);
                float fT12 = Canvas.T1(f2);
                Path.k(androidPathA, RoundRectKt.c((Float.floatToRawIntBits(fT1) << 32) | (Float.floatToRawIntBits(fT12) & 4294967295L), rect));
                e = Canvas.getE();
                jD = e.d();
                e.a().save();
                try {
                    e.f1798a.a(androidPathA, 0);
                    DrawScope.z0(Canvas, new SolidColor(Color.b(Color.b, f)), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 126);
                    break;
                } finally {
                }
            case 1:
                Rect rect2 = (Rect) this.e;
                float f3 = this.g;
                DrawScope Canvas2 = (DrawScope) obj;
                Intrinsics.h(Canvas2, "$this$Canvas");
                AndroidPath androidPathA2 = AndroidPath_androidKt.a();
                float f4 = this.f;
                float fT13 = Canvas2.T1(f4);
                float fT14 = Canvas2.T1(f4);
                Path.k(androidPathA2, RoundRectKt.c((Float.floatToRawIntBits(fT13) << 32) | (Float.floatToRawIntBits(fT14) & 4294967295L), rect2));
                e = Canvas2.getE();
                jD = e.d();
                e.a().save();
                try {
                    e.f1798a.a(androidPathA2, 0);
                    DrawScope.z0(Canvas2, new SolidColor(Color.b(Color.b, f3)), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 126);
                    break;
                } finally {
                }
            default:
                MutableState mutableState = (MutableState) this.e;
                float f5 = this.g;
                DrawScope Canvas3 = (DrawScope) obj;
                Intrinsics.h(Canvas3, "$this$Canvas");
                AndroidPath androidPathA3 = AndroidPath_androidKt.a();
                Rect rect3 = (Rect) mutableState.getD();
                float f6 = this.f;
                float fT15 = Canvas3.T1(f6);
                float fT16 = Canvas3.T1(f6);
                Path.k(androidPathA3, RoundRectKt.c((Float.floatToRawIntBits(fT15) << 32) | (Float.floatToRawIntBits(fT16) & 4294967295L), rect3));
                e = Canvas3.getE();
                jD = e.d();
                e.a().save();
                try {
                    e.f1798a.a(androidPathA3, 0);
                    DrawScope.z0(Canvas3, new SolidColor(Color.b(Color.b, f5)), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 126);
                    break;
                } finally {
                }
        }
        androidx.camera.core.impl.b.C(e, jD);
        return Unit.f24250a;
    }

    public /* synthetic */ j(Rect rect, float f, float f2, int i) {
        this.d = i;
        this.e = rect;
        this.f = f;
        this.g = f2;
    }
}
