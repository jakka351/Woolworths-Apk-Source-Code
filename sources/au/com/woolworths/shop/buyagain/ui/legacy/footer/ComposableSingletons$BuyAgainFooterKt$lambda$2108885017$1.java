package au.com.woolworths.shop.buyagain.ui.legacy.footer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainContractLegacy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.buyagain.ui.legacy.footer.ComposableSingletons$BuyAgainFooterKt$lambda$-2108885017$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$BuyAgainFooterKt$lambda$2108885017$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BuyAgainContractLegacy.FooterState footerState = new BuyAgainContractLegacy.FooterState(true, new ButtonApiData("Add to cart", null, ButtonStyleApiData.PRIMARY, true, null, null, null, null, null, 448, null), new ButtonApiData("Save to list", null, ButtonStyleApiData.SECONDARY, true, null, null, null, null, null, 448, null), 2);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            BuyAgainFooterKt.a(footerState, function0, (Function0) objE, composer, 432);
        }
        return Unit.f24250a;
    }
}
