package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.rewards.offers.model.RewardsCalendarIcon;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailMechanicsKt$lambda$722167480$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OfferDetailMechanicsKt.a(new RewardsOfferMechanicItem(RewardsCalendarIcon.CALENDAR_1_ACTIVE, "Wed 20 May – Wed 27 Dec", "Calendar icon with a checkmark", "Spend $70"), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
