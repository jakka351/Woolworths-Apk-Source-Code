package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PromotionDetailsScreenKt$PromotionDetailsScreen$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableStateFlow mutableStateFlow = ((PromotionDetailsViewModel) this.receiver).i;
        mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, null, 111));
        return Unit.f24250a;
    }
}
