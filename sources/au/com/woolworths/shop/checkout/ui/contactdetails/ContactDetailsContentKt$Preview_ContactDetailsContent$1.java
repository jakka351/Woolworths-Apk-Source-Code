package au.com.woolworths.shop.checkout.ui.contactdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.cart.ui.productreview.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ContactDetailsContentKt$Preview_ContactDetailsContent$1 implements Function2<Composer, Integer, Unit> {
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
            objG = new h(29);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objE);
        }
        composer.l();
        ContactDetailsContentKt.a(null, function1, (Function0) objE, null, composer, 432, 8);
        throw null;
    }
}
