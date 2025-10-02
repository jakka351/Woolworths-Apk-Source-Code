package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.shop.buyagain.ui.BuyAgainFullPageError;
import au.com.woolworths.shop.buyagain.ui.BuyAgainListConnectionError;
import au.com.woolworths.shop.buyagain.ui.BuyAgainListEmptyState;
import au.com.woolworths.shop.buyagain.ui.BuyAgainListServerError;
import com.woolworths.R;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-buy-again_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainErrorScreenKt {
    public static final void a(BuyAgainFullPageError errorState, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecA;
        Intrinsics.h(errorState, "errorState");
        ComposerImpl composerImplV = composer.v(-1636744734);
        int i2 = i | (composerImplV.n(errorState) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.I(function02) ? 256 : 128) | (composerImplV.I(function03) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (errorState.equals(BuyAgainListEmptyState.f10273a)) {
                composerImplV.o(-953648967);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.c(PainterResources_androidKt.a(R.drawable.ic_no_products, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.buy_again_page_no_product_error_title), StringResources_androidKt.c(composerImplV, R.string.buy_again_page_no_product_error_body), StringResources_androidKt.c(composerImplV, R.string.buy_again_page_no_product_action), function0);
                composerImplV.V(false);
            } else if (errorState.equals(BuyAgainListConnectionError.f10272a)) {
                composerImplV.o(-953631144);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ConnectionError.f8919a, StringResources_androidKt.c(composerImplV, R.string.buy_again_page_bad_connection_error_body), null, function02, composerImplV, ((i2 << 9) & 458752) | 1572870, 22);
                composerImplV.V(false);
            } else {
                if (!errorState.equals(BuyAgainListServerError.f10274a)) {
                    throw au.com.woolworths.android.onesite.a.w(-953650598, composerImplV, false);
                }
                composerImplV.o(-953620441);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ServerError.f8920a, null, StringResources_androidKt.c(composerImplV, R.string.buy_again_page_server_error_body), function03, composerImplV, ((i2 << 6) & 458752) | 1572870, 14);
                composerImplV.V(false);
            }
            FullPageMessageUiKt.a(fullPageMessageSpecA, SizeKt.c, null, composerImplV, 48, 4);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) errorState, (Function) function0, (Object) function02, (Object) function03, i, 27);
        }
    }
}
