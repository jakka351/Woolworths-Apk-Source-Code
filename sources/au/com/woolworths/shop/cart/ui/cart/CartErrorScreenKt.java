package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartErrorScreenKt {
    public static final void a(CartFullErrorMessage errorState, final Modifier modifier, Function0 function0, Function0 function02, Composer composer, int i) {
        final FullPageMessageSpec fullPageMessageSpecA;
        Intrinsics.h(errorState, "errorState");
        ComposerImpl composerImplV = composer.v(377769070);
        int i2 = i | (composerImplV.n(errorState) ? 4 : 2) | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.I(function02) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (errorState.equals(CartEmptyState.d)) {
                composerImplV.o(-2036135007);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.d(PainterResources_androidKt.a(R.drawable.ic_no_products, 0, composerImplV), StringResources_androidKt.c(composerImplV, R.string.cart_page_no_product_error_title), StringResources_androidKt.c(composerImplV, R.string.cart_page_no_product_error_body), StringResources_androidKt.c(composerImplV, R.string.cart_page_no_product_action), function0);
                composerImplV.V(false);
            } else if (errorState.equals(CartConnectionError.d)) {
                composerImplV.o(-2036120589);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ConnectionError.f8915a, StringResources_androidKt.c(composerImplV, R.string.cart_page_bad_connection_error_body), null, function02, composerImplV, ((i2 << 6) & 458752) | 1572870, 22);
                composerImplV.V(false);
            } else {
                if (!errorState.equals(CartServerError.d)) {
                    throw au.com.woolworths.android.onesite.a.w(-2036136503, composerImplV, false);
                }
                composerImplV.o(-2036111709);
                fullPageMessageSpecA = FullPageMessageSpec.Companion.a(FullPageMessage.Error.ServerError.f8916a, null, StringResources_androidKt.c(composerImplV, R.string.cart_page_server_error_body), function02, composerImplV, ((i2 << 6) & 458752) | 1572870, 14);
                composerImplV.V(false);
            }
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1826775094, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.cart.CartErrorScreenKt$CartErrorScreen$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        FullPageMessageUiKt.a(fullPageMessageSpecA, modifier.x0(SizeKt.c), null, composer2, 0, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a(errorState, modifier, function0, function02, i, 28);
        }
    }
}
