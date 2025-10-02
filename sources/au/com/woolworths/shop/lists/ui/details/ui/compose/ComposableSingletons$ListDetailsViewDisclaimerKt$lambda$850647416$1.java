package au.com.woolworths.shop.lists.ui.details.ui.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalDisclaimer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ListDetailsViewDisclaimerKt$lambda$850647416$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ListDetailsViewDisclaimerKt.a(new ListDetailsTotalDisclaimer("*Totals indicate price of available products for your shopping method, location and latest internet connection. Final prices may differ."), SizeKt.e(Modifier.Companion.d, 1.0f), composer, 48);
        }
        return Unit.f24250a;
    }
}
