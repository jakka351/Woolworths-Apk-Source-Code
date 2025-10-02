package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandedShopFullScreenErrorKt {
    public static final void a(final FullPageMessage.Error error, final Function0 onRetry, Composer composer, final int i) {
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecE;
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-575685735);
        if ((((composerImplV.n(error) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (error.equals(FullPageMessage.Error.ConnectionError.f8919a)) {
                composerImplV.o(816797796);
                fullPageMessageSpecE = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImplV, R.string.branded_shop_connection_error), onRetry, composerImplV, 7);
                composerImplV.V(false);
                composerImpl = composerImplV;
            } else {
                composerImplV.o(816804604);
                composerImpl = composerImplV;
                fullPageMessageSpecE = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.branded_shop_server_error), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecE, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(onRetry, i) { // from class: au.com.woolworths.feature.shop.brandedshop.ui.c
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    BrandedShopFullScreenErrorKt.a(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
