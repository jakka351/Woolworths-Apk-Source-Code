package au.com.woolworths.shop.checkout.ui.timeselector;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.b;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeSelectorErrorScreenKt {
    public static final void a(TimeSelectorContract.TimeSelectorErrorState errorState, Function0 onNetworkErrorRetry, Function0 onServerErrorRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecG;
        Intrinsics.h(errorState, "errorState");
        Intrinsics.h(onNetworkErrorRetry, "onNetworkErrorRetry");
        Intrinsics.h(onServerErrorRetry, "onServerErrorRetry");
        ComposerImpl composerImplV = composer.v(-1571541668);
        int i2 = (composerImplV.n(errorState) ? 4 : 2) | i | (composerImplV.I(onNetworkErrorRetry) ? 32 : 16) | (composerImplV.I(onServerErrorRetry) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (errorState.equals(TimeSelectorContract.TimeSelectorErrorState.TimeSelectorNetworkError.f10836a)) {
                composerImplV.o(1640972341);
                fullPageMessageSpecG = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ConnectionError.f8915a, StringResources_androidKt.c(composerImplV, R.string.checkout_time_selector_network_error_message), null, onNetworkErrorRetry, composerImplV, 1572870 | ((i2 << 12) & 458752), 22);
                composerImplV.V(false);
            } else if (errorState.equals(TimeSelectorContract.TimeSelectorErrorState.TimeSelectorServerError.f10837a)) {
                composerImplV.o(1641355067);
                fullPageMessageSpecG = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ServerError.f8916a, StringResources_androidKt.c(composerImplV, R.string.checkout_time_selector_server_error_message), null, onServerErrorRetry, composerImplV, 1572870 | ((i2 << 9) & 458752), 22);
                composerImplV.V(false);
            } else {
                if (!errorState.equals(TimeSelectorContract.TimeSelectorErrorState.TimeSelectorFullEmpty.f10835a)) {
                    throw au.com.woolworths.android.onesite.a.w(1576952924, composerImplV, false);
                }
                composerImplV.o(1641730508);
                fullPageMessageSpecG = FullPageMessageSpec.Companion.g(PainterResources_androidKt.a(R.drawable.ic_no_results, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.title_no_available_windows_error), StringResources_androidKt.c(composerImplV, R.string.message_no_available_windows_error));
                composerImplV.V(false);
            }
            FullPageMessageUiKt.a(fullPageMessageSpecG, SizeKt.c, null, composerImplV, 48, 4);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(errorState, onNetworkErrorRetry, onServerErrorRetry, i, 28);
        }
    }
}
