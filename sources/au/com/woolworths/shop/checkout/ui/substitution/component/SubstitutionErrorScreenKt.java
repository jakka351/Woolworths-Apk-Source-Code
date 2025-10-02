package au.com.woolworths.shop.checkout.ui.substitution.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.account.ui.details.components.c;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubstitutionErrorScreenKt {
    public static final void a(FullPageMessage.Error error, Function0 onRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-1952198029);
        if ((((composerImplV.n(error) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onRetry;
        } else {
            if (error.equals(FullPageMessage.Error.ConnectionError.f8915a)) {
                composerImplV.o(838410302);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composerImplV, R.string.substitution_connection_error), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
                function0 = onRetry;
            } else {
                if (!error.equals(FullPageMessage.Error.ServerError.f8916a)) {
                    throw au.com.woolworths.android.onesite.a.w(838407818, composerImplV, false);
                }
                composerImplV.o(838418038);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.substitution_server_error), null, onRetry, composerImplV, 23);
                function0 = onRetry;
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(error, function0, i, 3);
        }
    }
}
