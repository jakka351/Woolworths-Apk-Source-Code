package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.rewards.offers.provider.OfferDetailsFooterProvider;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailsScreenKt$lambda$1975123230$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OfferDetailsScreenKt$lambda$1975123230$1 d = new ComposableSingletons$OfferDetailsScreenKt$lambda$1975123230$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OfferDetailsFooter offerDetailsFooter = OfferDetailsFooterProvider.f6387a;
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
                objE = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(10);
                composer.A(objE);
            }
            composer.l();
            OfferDetailsScreenKt.d(offerDetailsFooter, false, function0, (Function1) objE, composer, 3504);
        }
        return Unit.f24250a;
    }
}
