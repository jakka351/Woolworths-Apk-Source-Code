package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.network.ServerError;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardViewModel;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AddCreditCardModalKt$AddCreditCardModal$4$3$4$5$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m((String) obj, (String) obj2);
        return Unit.f24250a;
    }

    public final void m(String str, String str2) {
        Object value;
        AddCreditCardViewModel addCreditCardViewModel = (AddCreditCardViewModel) this.receiver;
        if (addCreditCardViewModel.k == AddCreditCardViewModel.WebOperation.d) {
            AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker = addCreditCardViewModel.i;
            PaymentFlowTypeData flowType = addCreditCardViewModel.e;
            addCreditCardAnalyticsTracker.getClass();
            Intrinsics.h(flowType, "flowType");
            addCreditCardAnalyticsTracker.f8322a.g((Event) AddCreditCardAnalyticsTracker.a(flowType).h.c.getD());
        }
        MutableStateFlow mutableStateFlow = addCreditCardViewModel.l;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value, LoadingState.d, new PageResult.Fail(new ServerErrorException(new ServerError(ServerErrorCode.e, str2))), null, false, 12)));
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), YU.a.i("Server error encountered when loading the WebView url: ", str, " errorReason: ", str2), null, 12);
    }
}
