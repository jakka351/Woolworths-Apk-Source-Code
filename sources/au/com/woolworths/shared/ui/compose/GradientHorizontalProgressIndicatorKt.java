package au.com.woolworths.shared.ui.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "progress", "progressAnimation", "shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GradientHorizontalProgressIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10090a = ProgressIndicatorDefaults.f1309a;
    public static final float b = 100;

    public static final void a(float f, Modifier increaseSemanticsBounds, Brush brush, Brush brush2, int i, Composer composer, int i2) {
        final Brush brushA;
        final Brush solidColor;
        final int i3;
        Brush brush3;
        Brush brush4;
        int i4;
        ComposerImpl composerImplV = composer.v(-954785085);
        int i5 = i2 | (composerImplV.q(f) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.n(increaseSemanticsBounds) ? 32 : 16;
        }
        if (((i5 | 11648) & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            brush3 = brush;
            brush4 = brush2;
            i4 = i;
        } else {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                brushA = Brush.Companion.a(CollectionsKt.R(new Color(ColorKt.d(4278233934L)), new Color(ColorKt.d(4291488621L))), 0L, 0L, 14);
                solidColor = new SolidColor(ColorKt.b(872415231));
                i3 = 1;
            } else {
                composerImplV.j();
                brushA = brush;
                solidColor = brush2;
                i3 = i;
            }
            composerImplV.W();
            float fB = RangesKt.b(f / 100, 0.01f, 1.0f);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objG;
            composerImplV.V(false);
            final State stateB = AnimateAsStateKt.b(fB, AnimationSpecKt.e(500, 0, EasingKt.f756a, 2), "progressAnimation", null, composerImplV, 3072, 20);
            Float fValueOf = Float.valueOf(fB);
            composerImplV.o(-1633490746);
            boolean zQ = composerImplV.q(fB);
            Object objG2 = composerImplV.G();
            if (zQ || objG2 == obj) {
                objG2 = new GradientHorizontalProgressIndicatorKt$GradientHorizontalProgressIndicator$1$1(fB, mutableFloatState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, fValueOf, (Function2) objG2);
            float f2 = 10;
            Intrinsics.h(increaseSemanticsBounds, "$this$increaseSemanticsBounds");
            Modifier modifierR = SizeKt.r(ProgressSemanticsKt.b(PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(increaseSemanticsBounds, new au.com.woolworths.compose.utils.modifier.f(f2, 0)), true, new au.com.woolworths.android.onesite.repository.b(9)), BitmapDescriptorFactory.HUE_RED, f2, 1), ((Number) stateB.getD()).floatValue(), RangesKt.j(BitmapDescriptorFactory.HUE_RED, 1.0f), 0), b, f10090a);
            composerImplV.o(-1224400529);
            boolean zR = composerImplV.r(i3) | composerImplV.n(stateB);
            Object objG3 = composerImplV.G();
            if (zR || objG3 == obj) {
                objG3 = new Function1() { // from class: au.com.woolworths.shared.ui.compose.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DrawScope Canvas = (DrawScope) obj2;
                        float f3 = GradientHorizontalProgressIndicatorKt.f10090a;
                        Intrinsics.h(Canvas, "$this$Canvas");
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.h() & 4294967295L));
                        Brush brush5 = solidColor;
                        int i6 = i3;
                        GradientHorizontalProgressIndicatorKt.b(Canvas, 1.0f, brush5, fIntBitsToFloat, i6);
                        GradientHorizontalProgressIndicatorKt.b(Canvas, ((Number) stateB.getD()).floatValue(), brushA, fIntBitsToFloat, i6);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            CanvasKt.a(modifierR, (Function1) objG3, composerImplV, 0);
            brush3 = brushA;
            brush4 = solidColor;
            i4 = i3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new e(f, increaseSemanticsBounds, brush3, brush4, i4, i2);
        }
    }

    public static final void b(DrawScope drawScope, float f, Brush brush, float f2, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.h() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.h() & 4294967295L));
        float f3 = 2;
        float f4 = fIntBitsToFloat2 / f3;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.d;
        float f5 = (z ? 0.0f : 1.0f - f) * fIntBitsToFloat;
        float f6 = (z ? f : 1.0f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            drawScope.m1(brush, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f2, (496 & 16) != 0 ? 0 : 0, (496 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f7 = f2 / f3;
        ClosedFloatingPointRange closedFloatingPointRangeJ = RangesKt.j(f7, fIntBitsToFloat - f7);
        float fFloatValue = ((Number) RangesKt.f(Float.valueOf(f5), closedFloatingPointRangeJ)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.f(Float.valueOf(f6), closedFloatingPointRangeJ)).floatValue();
        if (Math.abs(f - BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED) {
            drawScope.m1(brush, (Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f2, (496 & 16) != 0 ? 0 : i, (496 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        }
    }
}
