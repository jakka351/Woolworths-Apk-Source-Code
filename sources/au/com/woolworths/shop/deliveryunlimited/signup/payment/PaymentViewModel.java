package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.wpay.data.json.parser.CreditCardFormEventParser;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayAnalyticsTracker;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.domain.interactor.DeliveryUnlimitedPaymentInteractor;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentViewModel extends ViewModel {
    public final String e;
    public final DeliveryUnlimitedPaymentInteractor f;
    public final UnlinkCreditCardInteractor g;
    public final CreditCardFormEventParser h;
    public final WPayAnalyticsTracker i;
    public final ConnectionManager j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final BufferedChannel m;
    public final Flow n;
    public String o;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentViewModel$Factory;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        PaymentViewModel a(String str);
    }

    public PaymentViewModel(String selectedPlanId, DeliveryUnlimitedPaymentInteractor deliveryUnlimitedPaymentInteractor, UnlinkCreditCardInteractor unlinkCreditCardInteractor, CreditCardFormEventParser creditCardFormEventParser, WPayAnalyticsTracker wPayAnalyticsTracker, ConnectionManager connectionManager) {
        Intrinsics.h(selectedPlanId, "selectedPlanId");
        Intrinsics.h(connectionManager, "connectionManager");
        this.e = selectedPlanId;
        this.f = deliveryUnlimitedPaymentInteractor;
        this.g = unlinkCreditCardInteractor;
        this.h = creditCardFormEventParser;
        this.i = wPayAnalyticsTracker;
        this.j = connectionManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PaymentContract.ViewState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511));
        this.k = mutableStateFlowA;
        this.l = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.m = bufferedChannelA;
        this.n = FlowKt.I(bufferedChannelA);
    }

    public static /* synthetic */ void q6(PaymentViewModel paymentViewModel, int i) {
        LoadingState loadingState = LoadingState.e;
        if ((i & 1) != 0) {
            loadingState = LoadingState.f;
        }
        paymentViewModel.p6(loadingState, ErrorState.FullScreen.f8349a, paymentViewModel.o);
    }

    public final void p6(LoadingState loadingState, ErrorState errorState, String str) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(loadingState, "loadingState");
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, loadingState, null, null, null, false, null, null, null, null, 510)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new PaymentViewModel$fetchDeliveryUnlimitedPayment$2(this, str, errorState, null), 3);
    }

    public final void r6(PaymentMethodItem.CreditCard.Add addCreditCard) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(addCreditCard, "addCreditCard");
        this.i.d(addCreditCard.getClickAnalytics());
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, new ModalBottomSheetData.AddCreditCard(addCreditCard.getTitle()), false, null, null, null, null, 503)));
    }

    public final void s6(String str, String str2, String errorDescription) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(errorDescription, "errorDescription");
        PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.e;
        WPayAnalyticsTracker wPayAnalyticsTracker = this.i;
        wPayAnalyticsTracker.getClass();
        AnalyticsManager analyticsManager = wPayAnalyticsTracker.f8369a;
        PaymentCommonAnalytics.Payment.Action actionA = WPayAnalyticsTracker.a(paymentFlowTypeData);
        actionA.getClass();
        analyticsManager.g(new PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1(actionA, errorDescription));
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.d, null, null, null, true, null, null, null, null, 494)));
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), YU.a.i("Error encountered when loading the WebView url: ", str, " errorReason: ", str2), null, 12);
    }

    public final void t6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        this.i.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.e).b.getD());
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.e, null, null, null, false, null, null, null, null, 494)));
    }

    public final void u6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, null, false, null, null, null, null, 383)));
    }

    public final void v6(TermItemUiModel item, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(item, "item");
        TermsBottomSheetData termsBottomSheetData = ((PaymentContract.ViewState) this.l.getValue()).h;
        TermsBottomSheetData.Terms terms = termsBottomSheetData instanceof TermsBottomSheetData.Terms ? (TermsBottomSheetData.Terms) termsBottomSheetData : null;
        if (terms == null) {
            return;
        }
        ConfirmSubscriptionTermsUiModel confirmSubscriptionTermsUiModel = terms.f10894a;
        List<TermItemUiModel> list = confirmSubscriptionTermsUiModel.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (TermItemUiModel termItemUiModelA : list) {
            if (Intrinsics.c(termItemUiModelA, item)) {
                termItemUiModelA = TermItemUiModel.a(termItemUiModelA, z);
            }
            arrayList.add(termItemUiModelA);
        }
        do {
            mutableStateFlow = this.k;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, null, null, null, null, false, null, null, new TermsBottomSheetData.Terms(ConfirmSubscriptionTermsUiModel.a(confirmSubscriptionTermsUiModel, arrayList), terms.b), null, 383)));
    }
}
