package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$11$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataA;
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        checkoutSummaryViewModel.getClass();
        MutableStateFlow mutableStateFlow = checkoutSummaryViewModel.j;
        do {
            value = mutableStateFlow.getValue();
            viewState = (CheckoutContentContract.ViewState) value;
            modalBottomSheetDataA = viewState.g;
            if (modalBottomSheetDataA == null) {
                modalBottomSheetDataA = null;
            } else if (modalBottomSheetDataA instanceof ModalBottomSheetData.PromoCode) {
                modalBottomSheetDataA = ModalBottomSheetData.PromoCode.a((ModalBottomSheetData.PromoCode) modalBottomSheetDataA, null, p0, null, null, null, null, 53);
            }
        } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataA, 191)));
        return Unit.f24250a;
    }
}
