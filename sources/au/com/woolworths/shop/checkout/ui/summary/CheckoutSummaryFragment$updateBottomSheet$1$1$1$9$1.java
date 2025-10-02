package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataA;
        MutableStateFlow mutableStateFlow = ((CheckoutSummaryViewModel) this.receiver).j;
        do {
            value = mutableStateFlow.getValue();
            viewState = (CheckoutContentContract.ViewState) value;
            modalBottomSheetDataA = viewState.g;
            if (modalBottomSheetDataA == null) {
                modalBottomSheetDataA = null;
            } else if (modalBottomSheetDataA instanceof ModalBottomSheetData.StoreCredit) {
                modalBottomSheetDataA = ModalBottomSheetData.StoreCredit.a((ModalBottomSheetData.StoreCredit) modalBottomSheetDataA, null, 1);
            }
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataA, 191)));
        return Unit.f24250a;
    }
}
