package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingContract;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PromotionListingActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        PromotionListingViewModel promotionListingViewModel = (PromotionListingViewModel) this.receiver;
        promotionListingViewModel.getClass();
        ActionData productCardAction = p0.getProductCardAction();
        if (productCardAction != null) {
            promotionListingViewModel.g.k(new PromotionListingContract.Action.LaunchDeepLink(productCardAction.getAction()));
        }
        return Unit.f24250a;
    }
}
