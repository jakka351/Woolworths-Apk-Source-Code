package au.com.woolworths.feature.shop.recipes.freshmag.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shared.receipt.details.compose.a;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeErrorState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FreshMagErrorKt {
    public static final void a(FullPageErrorCause fullPageErrorCause, Function0 onRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecC;
        FullPageMessageSpec fullPageMessageSpec;
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-2099920840);
        if ((((composerImplV.I(fullPageErrorCause) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (fullPageErrorCause == FreshMagHomeErrorState.d || fullPageErrorCause == FreshMagContentErrorState.d) {
                composerImplV.o(1752168346);
                fullPageMessageSpecC = FullPageMessageSpec.Companion.c(null, String.valueOf(fullPageErrorCause.getD()), fullPageErrorCause.getE().toString(), null, onRetry, composerImplV, 19);
                onRetry = onRetry;
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (fullPageErrorCause == FreshMagHomeErrorState.e || fullPageErrorCause == FreshMagContentErrorState.e) {
                composerImplV.o(1752541214);
                FullPageMessageSpec fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, String.valueOf(fullPageErrorCause.getD()), fullPageErrorCause.getE().toString(), null, onRetry, composerImplV, 19);
                composerImplV = composerImplV;
                composerImplV.V(false);
                fullPageMessageSpec = fullPageMessageSpecF;
                onRetry = onRetry;
                FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
            } else {
                composerImplV.o(1752830630);
                FreshMagHomeErrorState freshMagHomeErrorState = FreshMagHomeErrorState.f;
                fullPageMessageSpecC = FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(R.drawable.ic_no_catalogue, 0, composerImplV), String.valueOf(freshMagHomeErrorState.getD()), freshMagHomeErrorState.getE().toString());
                composerImplV.V(false);
            }
            fullPageMessageSpec = fullPageMessageSpecC;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(fullPageErrorCause, i, 27, onRetry);
        }
    }
}
