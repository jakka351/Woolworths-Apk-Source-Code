package au.com.woolworths.shop.lists.ui.lottie;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.d;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "isGlowVisible", "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "", "animationAlpha", "scale", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GlowLottieKt {
    public static final void a(final int i, final int i2, final int i3, Composer composer) {
        ComposerImpl composerImplV = composer.v(282277965);
        if ((((composerImplV.r(i) ? 4 : 2) | i3) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(i), composerImplV, 0);
            LottieDynamicProperties lottieDynamicPropertiesA = LottieDynamicPropertiesKt.a(new LottieDynamicProperty[]{LottieDynamicPropertiesKt.b(LottieProperty.e, Float.valueOf(((Density) composerImplV.x(CompositionLocalsKt.h)).T1(i2)), new String[]{"**"}, composerImplV)}, composerImplV);
            State stateB = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 1.0f : BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.e(1000, 0, EasingFunctionsKt.f755a, 2), "fadeInAnimation", null, composerImplV, 3072, 20);
            State stateB2 = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 1.0f : 0.1f, AnimationSpecKt.e(1000, 0, EasingFunctionsKt.b, 2), "scaleAnimation", null, composerImplV, 3072, 20);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new GlowLottieKt$GlowLottie$1$1(mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            Modifier modifierQ = SizeKt.q(ScaleKt.a(Modifier.Companion.d, ((Number) stateB2.getD()).floatValue()), nlnlnnn.xxx00780078x0078);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(stateB);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                objG3 = new d(stateB, 6);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            LottieAnimationKt.a(lottieCompositionResultImplC.getD(), GraphicsLayerModifierKt.a(modifierQ, (Function1) objG3), null, Integer.MAX_VALUE, lottieDynamicPropertiesA, null, null, false, composerImplV, 1572864, 1576960, 2023356);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(i, i2, i3) { // from class: au.com.woolworths.shop.lists.ui.lottie.a
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(49);
                    GlowLottieKt.a(this.d, this.e, iA, (Composer) obj);
                    return Unit.f24250a;
                }
            };
        }
    }
}
