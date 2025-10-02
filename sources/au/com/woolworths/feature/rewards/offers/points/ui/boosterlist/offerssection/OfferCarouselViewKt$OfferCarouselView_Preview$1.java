package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.product.list.legacy.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OfferCarouselViewKt$OfferCarouselView_Preview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(28);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(29);
            composer.A(objE);
        }
        Function1 function12 = (Function1) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new a0(21);
            composer.A(objE2);
        }
        Function2 function2 = (Function2) objE2;
        Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE3 == composer$Companion$Empty$1) {
            objE3 = new c(0);
            composer.A(objE3);
        }
        Function1 function13 = (Function1) objE3;
        Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE4 == composer$Companion$Empty$1) {
            objE4 = new h(20);
            composer.A(objE4);
        }
        Function0 function0 = (Function0) objE4;
        Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE5 == composer$Companion$Empty$1) {
            objE5 = new au.com.woolworths.android.onesite.repository.b(10);
            composer.A(objE5);
        }
        composer.l();
        OfferCarouselViewKt.a(null, function1, function12, function2, function13, function0, (Function1) objE5, 2, true, false, composer, 115043760, 512);
        throw null;
    }
}
