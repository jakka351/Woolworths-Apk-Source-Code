package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PromotionDetailsScreenKt$PromotionDetailsScreen$4$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.receiver;
        promotionDetailsViewModel.getClass();
        promotionDetailsViewModel.j.k(new PromotionDetailsContract.Action.LaunchViewShoppingList(p0, false));
        return Unit.f24250a;
    }
}
