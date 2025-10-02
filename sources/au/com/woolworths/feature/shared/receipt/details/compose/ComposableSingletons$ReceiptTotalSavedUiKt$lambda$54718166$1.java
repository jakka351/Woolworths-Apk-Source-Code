package au.com.woolworths.feature.shared.receipt.details.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import au.com.woolworths.foundation.rewards.model.receipt.ReceiptDetailsLineItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ReceiptTotalSavedUiKt$lambda$54718166$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ReceiptTotalSavedUiKt.a(new EReceiptSavings("My sabeing are amazing!", CollectionsKt.R(new ReceiptDetailsLineItem("**@", "Olla", "$22,232.22"), new ReceiptDetailsLineItem("", "Very long wkjdhgbhw 2k,djhwj,hdh wmjdh bw2j,hh dbj2h, dgbkw,jhd 2jkd h2jkdh k2,jd hn2,kj,mdh n2k,j,dh n2kjdh 2,kjdh n2,kjdnh n2", "$22,232.22"))), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
