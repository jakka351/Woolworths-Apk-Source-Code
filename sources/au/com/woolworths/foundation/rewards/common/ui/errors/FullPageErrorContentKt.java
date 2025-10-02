package au.com.woolworths.foundation.rewards.common.ui.errors;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.b;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.k;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullPageErrorContentKt {
    public static final void a(final FullPageError fullPageError, Modifier modifier, final Function0 onSecondaryButtonClick, Composer composer, int i) {
        Intrinsics.h(onSecondaryButtonClick, "onSecondaryButtonClick");
        ComposerImpl composerImplV = composer.v(145784479);
        if ((((composerImplV.n(fullPageError) ? 4 : 2) | i | 48 | (composerImplV.I(onSecondaryButtonClick) ? 256 : 128)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(641167452, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.errors.FullPageErrorContentKt$FullPageErrorContent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    FullPageMessageSpec fullPageMessageSpecF;
                    Composer composer2;
                    Composer composer3 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer3.c()) {
                        composer3.j();
                    } else {
                        FullPageError.ConnectionError connectionError = FullPageError.ConnectionError.f8581a;
                        FullPageError fullPageError2 = fullPageError;
                        boolean zEquals = fullPageError2.equals(connectionError);
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        Function0 function0 = onSecondaryButtonClick;
                        if (zEquals) {
                            composer3.o(1300146673);
                            composer3.o(5004770);
                            boolean zN = composer3.n(function0);
                            Object objG = composer3.G();
                            if (zN || objG == composer$Companion$Empty$1) {
                                objG = new k(13, function0);
                                composer3.A(objG);
                            }
                            composer3.l();
                            composer2 = composer3;
                            fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, null, null, (Function0) objG, composer2, 31);
                            composer2.l();
                        } else {
                            if (!(fullPageError2 instanceof FullPageError.ServerError)) {
                                throw a.x(composer3, 1981601122);
                            }
                            composer3.o(1300375701);
                            composer3.o(5004770);
                            boolean zN2 = composer3.n(function0);
                            Object objG2 = composer3.G();
                            if (zN2 || objG2 == composer$Companion$Empty$1) {
                                objG2 = new k(14, function0);
                                composer3.A(objG2);
                            }
                            composer3.l();
                            fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, null, null, (Function0) objG2, composer3, 31);
                            composer2 = composer3;
                            composer2.l();
                        }
                        FullPageMessageSpec fullPageMessageSpec = fullPageMessageSpecF;
                        FullPageMessageUiKt.a(fullPageMessageSpec, Modifier.Companion.d, null, composer2, 0, 4);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(fullPageError, modifier2, onSecondaryButtonClick, i, 10);
        }
    }
}
