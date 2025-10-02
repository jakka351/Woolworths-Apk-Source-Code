package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BorderModifierKt {
    public static Modifier a(Modifier border, final long j, float f, int i) {
        final float f2 = 1;
        if ((i & 4) != 0) {
            f = 0;
        }
        final float f3 = f;
        final boolean z = (i & 16) != 0;
        final boolean z2 = (i & 64) != 0;
        Intrinsics.h(border, "$this$border");
        return border.x0(ComposedModifierKt.a(Modifier.Companion.d, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: au.com.woolworths.shop.cart.ui.productreview.BorderModifierKt$border$1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier composed = (Modifier) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                Intrinsics.h(composed, "$this$composed");
                composer.o(-48140717);
                Density density = (Density) composer.x(CompositionLocalsKt.h);
                float f4 = f3;
                final float fT1 = density.T1(f4);
                final float fT12 = density.T1(f2);
                composer.o(-1224400529);
                boolean zP = composer.p(z2) | composer.q(fT1) | composer.p(z) | composer.p(true) | composer.s(j) | composer.q(fT12) | composer.p(true) | composer.q(f4);
                Object objG = composer.G();
                if (zP || objG == Composer.Companion.f1624a) {
                    final boolean z3 = z2;
                    final boolean z4 = z;
                    final long j2 = j;
                    final float f5 = f3;
                    Function1 function1 = new Function1() { // from class: au.com.woolworths.shop.cart.ui.productreview.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            boolean z5;
                            char c;
                            int i2;
                            DrawScope drawBehind = (DrawScope) obj4;
                            Intrinsics.h(drawBehind, "$this$drawBehind");
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.h() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
                            boolean z6 = z3;
                            float f6 = fT1;
                            float f7 = z6 ? fIntBitsToFloat2 - f6 : fIntBitsToFloat2;
                            boolean z7 = z4;
                            float f8 = z7 ? f6 : 0.0f;
                            long j3 = j2;
                            float f9 = fT12;
                            drawBehind.b1(j3, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), f9, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                            drawBehind.b1(j3, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), f9, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                            if (z7) {
                                drawBehind.b1(j3, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat - f6) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), f9, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                            }
                            if (z6) {
                                drawBehind.b1(j3, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat - f6) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), f9, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                            }
                            if (!Dp.a(f5, 0)) {
                                if (z7) {
                                    float f10 = 2 * f6;
                                    z5 = z6;
                                    c = ' ';
                                    i2 = 2;
                                    drawBehind.R1(j3, 180.0f, 90.0f, 0L, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f9, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                                } else {
                                    z5 = z6;
                                    c = ' ';
                                    i2 = 2;
                                }
                                if (z7) {
                                    float f11 = i2 * f6;
                                    drawBehind.R1(j3, 270.0f, 90.0f, (Float.floatToRawIntBits(fIntBitsToFloat - f11) << c) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f11) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f9, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                                }
                                if (z5) {
                                    float f12 = i2 * f6;
                                    drawBehind.R1(j3, 90.0f, 90.0f, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << c) | (Float.floatToRawIntBits(fIntBitsToFloat2 - f12) & 4294967295L), (Float.floatToRawIntBits(f12) << c) | (Float.floatToRawIntBits(f12) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f9, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                                }
                                if (z5) {
                                    float f13 = i2 * f6;
                                    drawBehind.R1(j3, BitmapDescriptorFactory.HUE_RED, 90.0f, (Float.floatToRawIntBits(fIntBitsToFloat - f13) << c) | (Float.floatToRawIntBits(fIntBitsToFloat2 - f13) & 4294967295L), (Float.floatToRawIntBits(f13) << c) | (Float.floatToRawIntBits(f13) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f9, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                                }
                            }
                            return Unit.f24250a;
                        }
                    };
                    composer.A(function1);
                    objG = function1;
                }
                composer.l();
                Modifier modifierB = DrawModifierKt.b(Modifier.Companion.d, (Function1) objG);
                composer.l();
                return modifierB;
            }
        }));
    }
}
