package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.recipes.details.RecipeDetailsFullPageErrorState;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeDetailsFullPageMessageKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RecipeDetailsFullPageErrorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState = RecipeDetailsFullPageErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RecipeDetailsFullPageErrorState recipeDetailsFullPageErrorState2 = RecipeDetailsFullPageErrorState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(RecipeDetailsFullPageErrorState errorState, Function0 onRetryClicked, Function0 onLaunchLoginClick, Composer composer, int i) {
        ComposerImpl composerImpl;
        FullPageMessageSpec fullPageMessageSpecB;
        FullPageMessageSpec fullPageMessageSpec;
        Intrinsics.h(errorState, "errorState");
        Intrinsics.h(onRetryClicked, "onRetryClicked");
        Intrinsics.h(onLaunchLoginClick, "onLaunchLoginClick");
        ComposerImpl composerImplV = composer.v(1551066677);
        int i2 = (composerImplV.r(errorState.ordinal()) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onRetryClicked) ? 32 : 16;
        }
        if (((i2 | (composerImplV.I(onLaunchLoginClick) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int iOrdinal = errorState.ordinal();
            if (iOrdinal == 0) {
                composerImpl = composerImplV;
                composerImpl.o(221434172);
                fullPageMessageSpecB = FullPageMessageSpec.Companion.b(null, StringResources_androidKt.c(composerImpl, R.string.recipe_detail_connection_error), onRetryClicked, composerImpl, 7);
                composerImpl.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(221442014);
                composerImpl = composerImplV;
                fullPageMessageSpecB = FullPageMessageSpec.Companion.e(null, null, StringResources_androidKt.c(composerImplV, R.string.recipe_detail_unable_to_load_results), null, onRetryClicked, composerImpl, 23);
                composerImpl.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(221431947, composerImplV, false);
                }
                composerImplV.o(-1724988000);
                FullPageMessageSpec fullPageMessageSpecC = FullPageMessageSpec.Companion.c(PainterResources_androidKt.a(R.drawable.no_saved_recipes, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.save_recipe_login_title), StringResources_androidKt.c(composerImplV, R.string.save_recipe_login_message), StringResources_androidKt.c(composerImplV, R.string.save_recipe_login), onLaunchLoginClick);
                composerImplV.V(false);
                fullPageMessageSpec = fullPageMessageSpecC;
                composerImpl = composerImplV;
                composerImplV = composerImpl;
                FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
            }
            fullPageMessageSpec = fullPageMessageSpecB;
            composerImplV = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpec, null, null, composerImplV, 0, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(errorState, onRetryClicked, onLaunchLoginClick, i, 24);
        }
    }
}
