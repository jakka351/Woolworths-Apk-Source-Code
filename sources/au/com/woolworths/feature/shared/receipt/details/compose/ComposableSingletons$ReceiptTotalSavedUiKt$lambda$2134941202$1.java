package au.com.woolworths.feature.shared.receipt.details.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ReceiptTotalSavedUiKt$lambda$2134941202$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ReceiptTotalSavedUiKt.a(new EReceiptSavings("My sabeing are amazing!", null, 2, null), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
