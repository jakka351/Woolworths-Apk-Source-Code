package au.com.woolworths.foundation.shop.olive.voice.ui.lottie;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.feature.shop.modeselector.ui.b;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AudioPermissionLottieKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1873936425);
        if ((i & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LottieAnimationKt.a(RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.audio_permission), composerImplV, 0).getD(), Modifier.Companion.d, null, Integer.MAX_VALUE, null, null, ContentScale.Companion.b, false, composerImplV, 1572912, 1769472, 1998780);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(i, 28);
        }
    }
}
