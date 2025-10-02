package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AddCreditCardModalKt$AddCreditCardModal$4$3$4$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        AddCreditCardContract.ViewState viewState;
        MutableStateFlow mutableStateFlow = ((AddCreditCardViewModel) this.receiver).l;
        do {
            value = mutableStateFlow.getValue();
            viewState = (AddCreditCardContract.ViewState) value;
        } while (!mutableStateFlow.d(value, AddCreditCardContract.ViewState.a(viewState, LoadingState.d, null, null, viewState.b instanceof PageResult.Success, 6)));
        return Unit.f24250a;
    }
}
