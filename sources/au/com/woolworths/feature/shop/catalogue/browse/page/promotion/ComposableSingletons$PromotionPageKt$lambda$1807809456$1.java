package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.focus.FocusRequester;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shared.instore.wifi.ui.c;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.catalogue.browse.page.promotion.ComposableSingletons$PromotionPageKt$lambda$-1807809456$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$PromotionPageKt$lambda$1807809456$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BrowsePage.Promotion promotionF = PromotionPageKt.f();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new c(27);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            PromotionPageKt.d(promotionF, function1, (Function0) objE, new FocusRequester(), null, composer, 432);
        }
        return Unit.f24250a;
    }
}
