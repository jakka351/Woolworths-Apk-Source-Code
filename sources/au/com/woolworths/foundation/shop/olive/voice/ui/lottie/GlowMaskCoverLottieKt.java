package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.rewards.common.ui.b;
import au.com.woolworths.foundation.shop.olive.voice.ui.lottie.GlowMaskCoverLottiePhase;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GlowMaskCoverLottieKt {
    public static final void a(GlowMaskCoverLottiePhase phase, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(phase, "phase");
        ComposerImpl composerImplV = composer.v(26061741);
        int i2 = (composerImplV.n(phase) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.glow_mask_cover), composerImplV, 0);
            if (lottieCompositionResultImplC.getD() != null) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (objG == composer$Companion$Empty$1) {
                    objG = SnapshotStateKt.f(phase);
                    composerImplV.A(objG);
                }
                MutableState mutableState = (MutableState) objG;
                composerImplV.V(false);
                composerImplV.o(-1633490746);
                boolean z = (i2 & 14) == 4;
                Object objG2 = composerImplV.G();
                if (z || objG2 == composer$Companion$Empty$1) {
                    objG2 = new GlowMaskCoverLottieKt$GlowMaskCoverLottie$1$1$1(mutableState, phase, null);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, phase, (Function2) objG2);
                LottieDynamicProperties lottieDynamicPropertiesA = LottieDynamicPropertiesKt.a(new LottieDynamicProperty[]{LottieDynamicPropertiesKt.b(LottieProperty.F, new PorterDuffColorFilter(ColorKt.j(CoreTheme.d(composerImplV).f4872a.e), PorterDuff.Mode.SRC_ATOP), new String[]{"Green Mask Cover Layer", "**"}, composerImplV)}, composerImplV);
                Modifier modifierA = Intrinsics.c(mutableState.getD(), GlowMaskCoverLottiePhase.Contract.f8843a) ? ScaleKt.a(modifier, 1.5f) : modifier;
                LottieClipSpec.Frame frame = new LottieClipSpec.Frame(Integer.valueOf(((GlowMaskCoverLottiePhase) mutableState.getD()).getStart()), Integer.valueOf(((GlowMaskCoverLottiePhase) mutableState.getD()).a()));
                ((GlowMaskCoverLottiePhase) mutableState.getD()).getClass();
                LottieAnimationKt.a(lottieCompositionResultImplC.getD(), modifierA, frame, 1, lottieDynamicPropertiesA, null, ContentScale.Companion.b, false, composerImplV, 0, 200704, 2056108);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(phase, i, 5, modifier);
        }
    }
}
