package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.models.RewardsOfferInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductOfferStatusBadgeKt$lambda$120995205$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductOfferStatusBadgeKt$lambda$120995205$1 d = new ComposableSingletons$ProductOfferStatusBadgeKt$lambda$120995205$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductOfferStatusBadgeKt.a(new RewardsOfferInfo("abc123", "not boosted", "", "Min. spend $3", RewardsOfferStatus.MISSED, null, null), null, composer, 0, 2);
        }
        return Unit.f24250a;
    }
}
