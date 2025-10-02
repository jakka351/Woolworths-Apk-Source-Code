package au.com.woolworths.shop.lists.ui.lottie;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CircleAndLoaderLottieKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1576355211);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            LottieAnimationKt.a(RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.circle_loader), composerImplV, 0).getD(), SizeKt.q(Modifier.Companion.d, 200), null, 0, null, null, null, false, composerImplV, 48, 1572864, 2031612);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(i, 17);
        }
    }
}
