package au.com.woolworths.compose.utils.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BorderModifierKt {
    public static Modifier a(Modifier customBorder, final long j, final float f, final boolean z, int i) {
        final float f2 = 1;
        final boolean z2 = (i & 16) != 0;
        Intrinsics.h(customBorder, "$this$customBorder");
        return DrawModifierKt.b(customBorder, new Function1() { // from class: au.com.woolworths.compose.utils.modifier.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float f3;
                DrawScope drawBehind = (DrawScope) obj;
                Intrinsics.h(drawBehind, "$this$drawBehind");
                drawBehind.getD();
                float f4 = f;
                float fT1 = drawBehind.T1(f4);
                drawBehind.getD();
                float fT12 = drawBehind.T1(f2);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.h() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
                float f5 = 2;
                float f6 = fT12 / f5;
                float f7 = 0.9f * f6;
                boolean z3 = z;
                float f8 = z3 ? (fIntBitsToFloat2 - fT1) - f7 : fIntBitsToFloat2;
                boolean z4 = z2;
                float f9 = z4 ? fT1 + f7 : 0.0f;
                float f10 = fT1 + (fT1 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f7);
                float f11 = fIntBitsToFloat - fT1;
                if (fT1 == BitmapDescriptorFactory.HUE_RED) {
                    f7 = 0.0f;
                }
                float f12 = f11 - f7;
                long j2 = j;
                drawBehind.b1(j2, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L), fT12, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                float f13 = fIntBitsToFloat - f6;
                drawBehind.b1(j2, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), fT12, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                if (z4) {
                    drawBehind.b1(j2, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), fT12, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                }
                if (z3) {
                    float f14 = fIntBitsToFloat2 - f6;
                    drawBehind.b1(j2, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), fT12, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                }
                long j3 = j2;
                if (!Dp.a(f4, 0)) {
                    if (z4) {
                        float f15 = fT1 * f5;
                        f3 = fT12;
                        drawBehind.R1(j3, 180.0f, 90.0f, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(fT12, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                        j3 = j3;
                    } else {
                        f3 = fT12;
                    }
                    if (z4) {
                        float f16 = fT1 * f5;
                        long j4 = j3;
                        drawBehind.R1(j4, 270.0f, 90.0f, (Float.floatToRawIntBits((fIntBitsToFloat - f16) - f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f3, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                        j3 = j4;
                    }
                    if (z3) {
                        float f17 = fT1 * f5;
                        long j5 = j3;
                        drawBehind.R1(j5, 90.0f, 90.0f, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits((fIntBitsToFloat2 - f17) - f6) & 4294967295L), (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f3, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                        j3 = j5;
                    }
                    if (z3) {
                        float f18 = fT1 * f5;
                        drawBehind.R1(j3, BitmapDescriptorFactory.HUE_RED, 90.0f, (Float.floatToRawIntBits((fIntBitsToFloat - f18) - f6) << 32) | (Float.floatToRawIntBits((fIntBitsToFloat2 - f18) - f6) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), (832 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new Stroke(f3, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30));
                    }
                }
                return Unit.f24250a;
            }
        });
    }
}
