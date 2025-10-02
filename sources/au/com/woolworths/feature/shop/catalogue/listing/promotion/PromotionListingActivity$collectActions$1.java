package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PromotionListingActivity$collectActions$1 extends AdaptedFunctionReference implements Function2<PromotionListingContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PromotionListingContract.Action action = (PromotionListingContract.Action) obj;
        PromotionListingActivity promotionListingActivity = (PromotionListingActivity) this.d;
        int i = PromotionListingActivity.z;
        promotionListingActivity.getClass();
        if (!(action instanceof PromotionListingContract.Action.LaunchDeepLink)) {
            throw new NoWhenBranchMatchedException();
        }
        promotionListingActivity.startActivity(ShopAppDeepLink.a(new PromotionListingActivity$launchDeepLink$1(), ((PromotionListingContract.Action.LaunchDeepLink) action).f6882a));
        return Unit.f24250a;
    }
}
