package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.compose.utils.graphics.ForwardingDrawInfo;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ImagePlaceholderHelperKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10211a = 100;

    public static final Painter a(final float f, int i, int i2, Composer composer) {
        composer.o(-750203112);
        boolean z = true;
        if ((i2 & 1) != 0) {
            f = f10211a;
        }
        Painter painterA = PainterResources_androidKt.a(R.drawable.ic_wapple_flat, 0, composer);
        composer.o(5004770);
        if ((((i & 14) ^ 6) <= 4 || !composer.q(f)) && (i & 6) != 4) {
            z = false;
        }
        Object objG = composer.G();
        if (z || objG == Composer.Companion.f1624a) {
            objG = new Function2() { // from class: au.com.woolworths.shop.aem.components.ui.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    DrawScope forwardingPainter = (DrawScope) obj;
                    ForwardingDrawInfo info = (ForwardingDrawInfo) obj2;
                    float f2 = ImagePlaceholderHelperKt.f10211a;
                    Intrinsics.h(forwardingPainter, "$this$forwardingPainter");
                    Intrinsics.h(info, "info");
                    float f3 = f;
                    float fT1 = forwardingPainter.T1(f3);
                    float fT12 = forwardingPainter.T1(f3);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(fT1) << 32) | (Float.floatToRawIntBits(fT12) & 4294967295L);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (forwardingPainter.h() >> 32)) / 2.0f) - (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) / 2.0f);
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (forwardingPainter.h() & 4294967295L)) / 2.0f) - (Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) / 2.0f);
                    Painter painter = info.f4708a;
                    forwardingPainter.getE().f1798a.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        painter.e(forwardingPainter, jFloatToRawIntBits, info.b, info.c);
                        float f4 = -fIntBitsToFloat;
                        float f5 = -fIntBitsToFloat2;
                        forwardingPainter.getE().f1798a.c(f4, f5, f4, f5);
                        return Unit.f24250a;
                    } catch (Throwable th) {
                        CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = forwardingPainter.getE().f1798a;
                        float f6 = -fIntBitsToFloat;
                        float f7 = -fIntBitsToFloat2;
                        canvasDrawScopeKt$asDrawTransform$1.c(f6, f7, f6, f7);
                        throw th;
                    }
                }
            };
            composer.A(objG);
        }
        composer.l();
        Painter painterA2 = ForwardingPainterKt.a(painterA, null, (Function2) objG, 6);
        composer.l();
        return painterA2;
    }
}
