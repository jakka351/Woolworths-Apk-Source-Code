package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OfferFeedInlineBannerKt$OfferFeedInlineBannerPreviewAll$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(4);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(5);
            composer.A(objE);
        }
        Function1 function12 = (Function1) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.c(6);
            composer.A(objE2);
        }
        composer.l();
        OfferFeedInlineBannerKt.c(null, false, function1, function12, (Function1) objE2, modifierF, composer, 224688);
        throw null;
    }
}
