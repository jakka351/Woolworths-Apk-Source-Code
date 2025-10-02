package au.com.woolworths.feature.rewards.offers.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.rewards.offers.model.RewardsCalendarIcon;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanics;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicsSeparatorIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.rewards.offers.ui.ComposableSingletons$OfferDetailMechanicsCarouselKt$lambda$-490193453$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OfferDetailMechanicsCarouselKt$lambda$490193453$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OfferDetailMechanicsCarouselKt.a(new RewardsOfferMechanics("2023-01-01T00:00:00Z", RewardsOfferMechanicsSeparatorIcon.PLUS_SIGN, 0, CollectionsKt.R(new RewardsOfferMechanicItem(RewardsCalendarIcon.CALENDAR_1_DISABLED, "Special Offer Day", "Special offer available today!", "Offer Day"), new RewardsOfferMechanicItem(RewardsCalendarIcon.CALENDAR_2_DISABLED, "Double Points", "Earn double points on purchases!", "Double Points"))), null, composer, 0);
        }
        return Unit.f24250a;
    }
}
