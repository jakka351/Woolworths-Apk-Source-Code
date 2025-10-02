package au.com.woolworths.shop.lists.ui.snapalist.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.b;
import au.com.woolworths.foundation.shop.olive.voice.ui.permission.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatableKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "isCameraIconVisible", "", "scale", "alpha", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SnapAListLoopedLottieKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-502881913);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.snap_a_list_looped), composerImplV, 0);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            final LottieAnimatable lottieAnimatableA = LottieAnimatableKt.a(composerImplV);
            final State stateB = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 0.4f : 0.1f, AnimationSpecKt.d(0.45f, 1500.0f, null, 4), "Scale Animation", null, composerImplV, 3120, 20);
            final State stateB2 = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 1.0f : BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.e(500, 0, EasingFunctionsKt.b, 2), "Opacity Animation", null, composerImplV, 3072, 20);
            LottieComposition d = lottieCompositionResultImplC.getD();
            composerImplV.o(-1746271574);
            boolean zN = composerImplV.n(lottieCompositionResultImplC) | composerImplV.n(lottieAnimatableA);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == obj) {
                objG2 = new SnapAListLoopedLottieKt$SnapAListLoopedLottie$1$1(mutableState, lottieCompositionResultImplC, lottieAnimatableA, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, d, (Function2) objG2);
            AnimatedVisibilityKt.d(((Boolean) mutableState.getD()).booleanValue(), null, null, null, null, ComposableLambdaKt.c(22592431, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.ui.SnapAListLoopedLottieKt$SnapAListLoopedLottie$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj2;
                    Composer composer2 = (Composer) obj3;
                    ((Number) obj4).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    LottieComposition d2 = lottieCompositionResultImplC.getD();
                    Modifier modifierB = GraphicsLayerModifierKt.b(SizeKt.q(ScaleKt.a(Modifier.Companion.d, ((Number) stateB.getD()).floatValue()), 200), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Number) stateB2.getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131067);
                    composer2.o(5004770);
                    LottieAnimatable lottieAnimatable = lottieAnimatableA;
                    boolean zN2 = composer2.n(lottieAnimatable);
                    Object objG3 = composer2.G();
                    if (zN2 || objG3 == Composer.Companion.f1624a) {
                        objG3 = new b(lottieAnimatable, 5);
                        composer2.A(objG3);
                    }
                    composer2.l();
                    LottieAnimationKt.b(d2, (Function0) objG3, modifierB, false, false, false, null, false, null, null, null, false, false, null, null, false, composer2, 0, 0, 65528);
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 196608, 30);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 24);
        }
    }
}
