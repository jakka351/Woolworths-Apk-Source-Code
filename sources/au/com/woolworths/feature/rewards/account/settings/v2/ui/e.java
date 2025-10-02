package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.halilibo.richtext.ui.TableKt;
import com.halilibo.richtext.ui.TableLayoutResult;
import com.halilibo.richtext.ui.TableStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(long j, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        this.e = j;
        this.f = transitionAnimationState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.h(Canvas, "$this$Canvas");
                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.h() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.h() & 4294967295L));
                float f = 2;
                float f2 = fIntBitsToFloat2 / f;
                float fFloatValue = ((Number) ((State) obj2).getD()).floatValue() * fIntBitsToFloat;
                float f3 = fIntBitsToFloat / f;
                float fB = RangesKt.b(fFloatValue, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat - fIntBitsToFloat2);
                float fB2 = RangesKt.b(fFloatValue + f3, fIntBitsToFloat2, fIntBitsToFloat) - fB;
                if (fB2 > f3) {
                    fB2 = f3;
                }
                long jFloatToRawIntBits = 4294967295L & Float.floatToRawIntBits(f2);
                DrawScope.g0(Canvas, this.e, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32), (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fB2) << 32), jFloatToRawIntBits | (Float.floatToRawIntBits(f2) << 32), null, fB2 / f3, 208);
                return Unit.f24250a;
            default:
                TableStyle tableStyle = (TableStyle) obj2;
                TableLayoutResult layoutResult = (TableLayoutResult) obj;
                TextStyle textStyle = TableKt.f16296a;
                Intrinsics.h(layoutResult, "layoutResult");
                final ArrayList arrayList = layoutResult.f16297a;
                final ArrayList arrayList2 = layoutResult.b;
                Color color = tableStyle.c;
                Intrinsics.e(color);
                long j = color.f1766a;
                if (j == 16) {
                    j = this.e;
                }
                final long j2 = j;
                final float fFloatValue2 = tableStyle.d.floatValue();
                return DrawModifierKt.b(Modifier.Companion.d, new Function1() { // from class: com.halilibo.richtext.ui.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        long j3;
                        float f4;
                        DrawScope drawBehind = (DrawScope) obj3;
                        TextStyle textStyle2 = TableKt.f16296a;
                        Intrinsics.h(drawBehind, "$this$drawBehind");
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            j3 = j2;
                            f4 = fFloatValue2;
                            if (!zHasNext) {
                                break;
                            }
                            float fFloatValue3 = ((Number) it.next()).floatValue();
                            drawBehind.b1(j3, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fFloatValue3) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.h() >> 32))) << 32) | (Float.floatToRawIntBits(fFloatValue3) & 4294967295L), f4, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            float fFloatValue4 = ((Number) it2.next()).floatValue();
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L));
                            drawBehind.b1(j3, (Float.floatToRawIntBits(fFloatValue4) << 32) | (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L), (Float.floatToRawIntBits(fFloatValue4) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L), f4, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                        }
                        return Unit.f24250a;
                    }
                });
        }
    }

    public /* synthetic */ e(TableStyle tableStyle, long j) {
        this.f = tableStyle;
        this.e = j;
    }
}
