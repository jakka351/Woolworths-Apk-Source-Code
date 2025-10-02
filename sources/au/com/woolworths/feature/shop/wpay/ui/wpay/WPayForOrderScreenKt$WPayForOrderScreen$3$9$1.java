package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class WPayForOrderScreenKt$WPayForOrderScreen$3$9$1 extends FunctionReferenceImpl implements Function1<PaymentInstrumentsResponse.ValidationFailure, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        PaymentInstrumentsResponse.ValidationFailure p0 = (PaymentInstrumentsResponse.ValidationFailure) obj;
        Intrinsics.h(p0, "p0");
        WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) this.receiver;
        wPayForOrderViewModel.getClass();
        AnalyticsData analyticsData = p0.c;
        if (analyticsData != null) {
            wPayForOrderViewModel.p.c(analyticsData);
        }
        MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.d, null, null, null, null, null, null, null, false, null, null, new AlertDialogData.ValidationFailure(p0.b, p0.f8304a), null, 6142)));
        return Unit.f24250a;
    }
}
