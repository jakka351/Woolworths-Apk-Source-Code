package au.com.woolworths.feature.rewards.offers.listpage.ui;

import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class OffersListPageScreenKt$OffersListPageScreen$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((OfferListPageViewModel) this.receiver).w;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, OffersListPageContract.ViewState.a((OffersListPageContract.ViewState) value, null, null, null, null, null, false, null, null, null, false, 3583)));
        return Unit.f24250a;
    }
}
