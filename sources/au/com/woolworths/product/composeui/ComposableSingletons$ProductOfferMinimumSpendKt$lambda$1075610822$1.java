package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.RewardsOfferInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductOfferMinimumSpendKt$lambda$1075610822$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductOfferMinimumSpendKt$lambda$1075610822$1 d = new ComposableSingletons$ProductOfferMinimumSpendKt$lambda$1075610822$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsOfferInfo rewardsOfferInfo = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3).getRewardsOfferInfo();
            Intrinsics.e(rewardsOfferInfo);
            ProductOfferMinimumSpendKt.a(rewardsOfferInfo, null, false, composer, 0, 6);
        }
        return Unit.f24250a;
    }
}
