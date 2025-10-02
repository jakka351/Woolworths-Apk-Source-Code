package au.com.woolworths.foundation.rewards.common.ui.pointsbalance;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.foundation.RewardsColors;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "internalProgress", "minProgress", "Lkotlin/Function0;", "", "currentOnAnimationFinished", "progressAnimation", "common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointsProgressBarKt {
    public static final void a(final float f, final boolean z, Function0 onAnimationFinished, Modifier modifier, final boolean z2, Composer composer, final int i) {
        int i2;
        final Function0 function0;
        final Modifier modifier2;
        final boolean z3;
        final boolean z4;
        final float f2;
        Intrinsics.h(onAnimationFinished, "onAnimationFinished");
        ComposerImpl composerImplV = composer.v(642828209);
        if ((i & 6) == 0) {
            i2 = (composerImplV.q(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onAnimationFinished) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            f2 = f;
            z4 = z;
            function0 = onAnimationFinished;
            modifier2 = modifier;
            z3 = z2;
        } else {
            function0 = onAnimationFinished;
            modifier2 = modifier;
            z3 = z2;
            z4 = z;
            f2 = f;
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-441566978, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.pointsbalance.PointsProgressBarKt$PointsProgressBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    MutableFloatState mutableFloatState;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        float fA = BitmapDescriptorFactory.HUE_RED;
                        Object obj3 = Composer.Companion.f1624a;
                        if (objG == obj3) {
                            objG = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                            composer2.A(objG);
                        }
                        MutableFloatState mutableFloatState2 = (MutableFloatState) objG;
                        Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                        if (objE == obj3) {
                            objE = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                            composer2.A(objE);
                        }
                        MutableFloatState mutableFloatState3 = (MutableFloatState) objE;
                        composer2.l();
                        float f3 = 6;
                        float fT1 = ((Density) composer2.x(CompositionLocalsKt.h)).T1(f3);
                        MutableState mutableStateL = SnapshotStateKt.l(function0, composer2);
                        if (z) {
                            fA = mutableFloatState2.a();
                        }
                        TweenSpec tweenSpecE = AnimationSpecKt.e(1000, 0, null, 6);
                        composer2.o(5004770);
                        boolean zN = composer2.n(mutableStateL);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == obj3) {
                            objG2 = new b(mutableStateL, 21);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        float fFloatValue = z2 ? ((Number) AnimateAsStateKt.b(fA, tweenSpecE, "PointsAnimation", (Function1) objG2, composer2, 3120, 4).getD()).floatValue() : mutableFloatState2.a();
                        long j = RewardsColors.f5157a;
                        Modifier modifierG = SizeKt.g(ClipKt.a(SizeKt.e(modifier2, 1.0f), RoundedCornerShapeKt.f1100a), f3);
                        composer2.o(-1224400529);
                        boolean zQ = composer2.q(fT1);
                        float f4 = f;
                        boolean zQ2 = zQ | composer2.q(f4);
                        Object objG3 = composer2.G();
                        if (zQ2 || objG3 == obj3) {
                            Object aVar = new au.com.woolworths.compose.utils.modifier.a(fT1, f4, mutableFloatState3, mutableFloatState2, 3);
                            mutableFloatState = mutableFloatState2;
                            composer2.A(aVar);
                            objG3 = aVar;
                        } else {
                            mutableFloatState = mutableFloatState2;
                        }
                        composer2.l();
                        ProgressIndicatorKt.c(fFloatValue, 1, 0, 0, j, ToneColors.i, composer2, OnGloballyPositionedModifierKt.a(modifierG, (Function1) objG3));
                        Float fValueOf = Float.valueOf(f4);
                        composer2.o(-1746271574);
                        boolean zQ3 = composer2.q(f4);
                        Object objG4 = composer2.G();
                        if (zQ3 || objG4 == obj3) {
                            objG4 = new PointsProgressBarKt$PointsProgressBar$1$2$1(f4, mutableFloatState3, mutableFloatState, null);
                            composer2.A(objG4);
                        }
                        composer2.l();
                        EffectsKt.e(composer2, fValueOf, (Function2) objG4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Modifier modifier3 = modifier2;
            final Function0 function02 = function0;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.foundation.rewards.common.ui.pointsbalance.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    PointsProgressBarKt.a(f2, z4, function02, modifier3, z3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
