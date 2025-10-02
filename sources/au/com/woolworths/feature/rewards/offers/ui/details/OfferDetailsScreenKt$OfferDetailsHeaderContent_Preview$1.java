package au.com.woolworths.feature.rewards.offers.ui.details;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.legacy.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OfferDetailsScreenKt$OfferDetailsHeaderContent_Preview$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a0(24);
                composer.A(objG);
            }
            composer.l();
            OfferDetailsScreenKt.f(null, modifierE, (Function2) objG, composer, 432);
        }
        return Unit.f24250a;
    }
}
