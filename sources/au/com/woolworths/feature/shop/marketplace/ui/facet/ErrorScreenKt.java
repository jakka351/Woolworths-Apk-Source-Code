package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MarketplaceErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarketplaceErrorState marketplaceErrorState = MarketplaceErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MarketplaceErrorState marketplaceErrorState2 = MarketplaceErrorState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MarketplaceErrorState marketplaceErrorState3 = MarketplaceErrorState.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MarketplaceErrorState marketplaceErrorState4 = MarketplaceErrorState.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MarketplaceErrorState marketplaceErrorState5 = MarketplaceErrorState.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final void a(MarketplaceErrorState error, Function0 onRetry, Composer composer, int i) {
        int i2;
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecB;
        FullPageMessageSpec fullPageMessageSpec;
        FullPageMessageSpec fullPageMessageSpecD;
        Intrinsics.h(error, "error");
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-1584674921);
        if ((i & 6) == 0) {
            i2 = (composerImplV.r(error.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRetry) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = error.ordinal();
            if (iOrdinal == 0) {
                composerImpl = composerImplV;
                composerImpl.o(1840797050);
                fullPageMessageSpecB = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImpl, R.string.message_marketplace_error_network), onRetry, composerImpl, 7);
                composerImpl.V(false);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    composerImplV.o(1840811712);
                    fullPageMessageSpecD = FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_marketplace_tab_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.message_personalised_error_server), StringResources_androidKt.c(composerImplV, R.string.title_personalised_error_server), StringResources_androidKt.c(composerImplV, R.string.try_again), onRetry);
                    composerImplV.V(false);
                } else if (iOrdinal == 3) {
                    composerImplV.o(1840826328);
                    fullPageMessageSpecD = FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_marketplace_tab_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.message_category_error_server), StringResources_androidKt.c(composerImplV, R.string.title_category_error_server), StringResources_androidKt.c(composerImplV, R.string.try_again), onRetry);
                    composerImplV.V(false);
                } else if (iOrdinal == 4) {
                    composerImplV.o(1840840594);
                    fullPageMessageSpecD = FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_marketplace_tab_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.title_brand_error_server), StringResources_androidKt.c(composerImplV, R.string.message_brand_error_server), StringResources_androidKt.c(composerImplV, R.string.try_again), onRetry);
                    composerImplV.V(false);
                } else {
                    if (iOrdinal != 5) {
                        throw au.com.woolworths.android.onesite.a.w(1840796620, composerImplV, false);
                    }
                    composerImplV.o(1840854708);
                    fullPageMessageSpecD = FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_marketplace_tab_error, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.title_seller_error_server), StringResources_androidKt.c(composerImplV, R.string.message_seller_error_server), StringResources_androidKt.c(composerImplV, R.string.try_again), onRetry);
                    composerImplV.V(false);
                }
                fullPageMessageSpec = fullPageMessageSpecD;
                composerImpl = composerImplV;
                composerImplV = composerImpl;
                FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
            } else {
                composerImplV.o(1840804245);
                composerImpl = composerImplV;
                fullPageMessageSpecB = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.message_marketplace_error_server), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
            }
            fullPageMessageSpec = fullPageMessageSpecB;
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h(error, i, 11, onRetry);
        }
    }
}
