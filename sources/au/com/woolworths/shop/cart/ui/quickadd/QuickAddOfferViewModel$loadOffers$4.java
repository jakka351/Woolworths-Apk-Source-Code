package au.com.woolworths.shop.cart.ui.quickadd;

import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class QuickAddOfferViewModel$loadOffers$4 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        QuickAddOfferViewModel quickAddOfferViewModel = (QuickAddOfferViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = quickAddOfferViewModel.i;
        QuickAddOfferContract.ViewState viewState = (QuickAddOfferContract.ViewState) mutableStateFlow.getValue();
        QuickAddOfferContract.Content.Error error = (QuickAddOfferContract.Content.Error) quickAddOfferViewModel.n.getD();
        viewState.getClass();
        mutableStateFlow.setValue(QuickAddOfferContract.ViewState.a(false, error));
        return Unit.f24250a;
    }
}
