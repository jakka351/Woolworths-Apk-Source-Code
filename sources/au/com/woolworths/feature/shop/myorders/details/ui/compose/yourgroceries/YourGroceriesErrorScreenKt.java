package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YourGroceriesErrorScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[YourGroceriesContract.ErrorState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YourGroceriesContract.ErrorState errorState = YourGroceriesContract.ErrorState.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(YourGroceriesContract.ErrorState errorState, Function0 onRetry, Composer composer, int i) {
        FullPageMessageSpec fullPageMessageSpecF;
        Function0 function0;
        ComposerImpl composerImpl;
        Intrinsics.h(errorState, "errorState");
        Intrinsics.h(onRetry, "onRetry");
        ComposerImpl composerImplV = composer.v(-835790165);
        if ((((composerImplV.r(errorState.ordinal()) ? 4 : 2) | i | (composerImplV.I(onRetry) ? 32 : 16)) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onRetry;
        } else {
            int iOrdinal = errorState.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-35446751);
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, StringResources_androidKt.c(composerImplV, R.string.your_groceries_redesign_server_error_message), null, onRetry, composerImplV, 23);
                function0 = onRetry;
                composerImpl = composerImplV;
                composerImpl.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(-35458273, composerImplV, false);
                }
                composerImplV.o(-35455386);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, StringResources_androidKt.c(composerImplV, R.string.your_groceries_redesign_network_error_message), null, onRetry, composerImpl, 23);
                composerImpl.V(false);
                function0 = onRetry;
            }
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(errorState, i, 18, function0);
        }
    }
}
