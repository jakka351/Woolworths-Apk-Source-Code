package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics;
import au.com.woolworths.analytics.supers.payments.PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shop.wpay.WPayFeature;
import au.com.woolworths.feature.shop.wpay.data.json.parser.CreditCardFormEventParser;
import au.com.woolworths.feature.shop.wpay.data.json.parser.GooglePayDataParser;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetLinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.GetPaymentInstrumentsInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.MakePaymentInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.ProvideFingerprintInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkCreditCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkGiftCardInteractor;
import au.com.woolworths.feature.shop.wpay.domain.interactor.UnlinkPayPalInteractor;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.google.pay.GooglePayManager;
import com.medallia.digital.mobilesdk.l3;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WPayForOrderViewModel extends ViewModel {
    public final GetPaymentInstrumentsInteractor e;
    public final UnlinkCreditCardInteractor f;
    public final GetLinkPayPalInteractor g;
    public final UnlinkGiftCardInteractor h;
    public final UnlinkPayPalInteractor i;
    public final ProvideFingerprintInteractor j;
    public final MakePaymentInteractor k;
    public final CurrencyFormatter l;
    public final CreditCardFormEventParser m;
    public final GooglePayDataParser n;
    public final ConnectionManager o;
    public final WPayAnalyticsTracker p;
    public final GooglePayManager q;
    public final MutableStateFlow r;
    public final BufferedChannel s;
    public final StateFlow t;
    public final Flow u;
    public String v;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/WPayForOrderViewModel$Companion;", "", "", "PAGE_IMPRESSION_KEY", "Ljava/lang/String;", "GOOGLE_PAY_EXTRA_CONTENT_KEY", "", "CENTS_IN_DOLLAR", "I", "LAST_USED_PAYMENT_METHOD", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public WPayForOrderViewModel(GetPaymentInstrumentsInteractor getPaymentInstrumentsInteractor, UnlinkCreditCardInteractor unlinkCreditCardInteractor, GetLinkPayPalInteractor getLinkPayPalInteractor, UnlinkGiftCardInteractor unlinkGiftCardInteractor, UnlinkPayPalInteractor unlinkPayPalInteractor, ProvideFingerprintInteractor provideFingerprintInteractor, MakePaymentInteractor makePaymentInteractor, CurrencyFormatter currencyFormatter, CreditCardFormEventParser creditCardFormEventParser, GooglePayDataParser googlePayDataParser, ConnectionManager connectionManager, WPayAnalyticsTracker wPayAnalyticsTracker, GooglePayManager googlePayManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(connectionManager, "connectionManager");
        Intrinsics.h(googlePayManager, "googlePayManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = getPaymentInstrumentsInteractor;
        this.f = unlinkCreditCardInteractor;
        this.g = getLinkPayPalInteractor;
        this.h = unlinkGiftCardInteractor;
        this.i = unlinkPayPalInteractor;
        this.j = provideFingerprintInteractor;
        this.k = makePaymentInteractor;
        this.l = currencyFormatter;
        this.m = creditCardFormEventParser;
        this.n = googlePayDataParser;
        this.o = connectionManager;
        this.p = wPayAnalyticsTracker;
        this.q = googlePayManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new WPayForOrderContract.ViewState(null, null, null, null, featureToggleManager.c(WPayFeature.d) ? "LAST_USED" : null, l3.b));
        this.r = mutableStateFlowA;
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.s = bufferedChannelA;
        this.t = mutableStateFlowA;
        this.u = FlowKt.I(bufferedChannelA);
        this.v = androidx.constraintlayout.core.state.a.h("toString(...)");
    }

    public static final String p6(WPayForOrderViewModel wPayForOrderViewModel, PageResult pageResult) {
        PaymentInstrumentsResponse.Success successB;
        PaymentInstrumentsResponse paymentInstrumentsResponse = (PaymentInstrumentsResponse) pageResult.c();
        if (paymentInstrumentsResponse == null || (successB = paymentInstrumentsResponse.b()) == null) {
            return null;
        }
        for (PaymentMethodItem paymentMethodItem : successB.b.getPaymentMethods()) {
            if (!(paymentMethodItem instanceof PaymentMethodItem.CreditCard.Add) && !(paymentMethodItem instanceof PaymentMethodItem.CreditCard.Expired)) {
                if (paymentMethodItem instanceof PaymentMethodItem.CreditCard.Linked) {
                    PaymentMethodItem.CreditCard.Linked linked = (PaymentMethodItem.CreditCard.Linked) paymentMethodItem;
                    if (linked.getIsSelected()) {
                        return linked.getId();
                    }
                } else if (paymentMethodItem instanceof PaymentMethodItem.CreditCard.Unlinked) {
                    PaymentMethodItem.CreditCard.Unlinked unlinked = (PaymentMethodItem.CreditCard.Unlinked) paymentMethodItem;
                    if (unlinked.e) {
                        return unlinked.f8305a;
                    }
                } else if (paymentMethodItem instanceof PaymentMethodItem.GooglePay) {
                    PaymentMethodItem.GooglePay googlePay = (PaymentMethodItem.GooglePay) paymentMethodItem;
                    if (googlePay.b) {
                        return googlePay.f;
                    }
                } else if (paymentMethodItem instanceof PaymentMethodItem.PayPal.Add) {
                    continue;
                } else {
                    if (!(paymentMethodItem instanceof PaymentMethodItem.PayPal.Linked)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PaymentMethodItem.PayPal.Linked linked2 = (PaymentMethodItem.PayPal.Linked) paymentMethodItem;
                    if (linked2.d) {
                        return linked2.f8308a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q6(au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel r6, au.com.woolworths.feature.shop.wpay.domain.model.PageResult r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$getGooglePayUiState$1
            if (r0 == 0) goto L16
            r0 = r8
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$getGooglePayUiState$1 r0 = (au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$getGooglePayUiState$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$getGooglePayUiState$1 r0 = new au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel$getGooglePayUiState$1
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState$Unavailable r4 = au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState.Unavailable.f8365a
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem$GooglePay r6 = r0.p
            kotlin.ResultKt.b(r8)
            goto L85
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r8)
            java.lang.Object r7 = r7.c()
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse) r7
            if (r7 == 0) goto Ld5
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse$Success r7 = r7.b()
            if (r7 != 0) goto L49
            goto Ld5
        L49:
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodSection r7 = r7.b
            java.util.List r7 = r7.getPaymentMethods()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r7.next()
            boolean r5 = r2 instanceof au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem.GooglePay
            if (r5 == 0) goto L5a
            r8.add(r2)
            goto L5a
        L6c:
            java.lang.Object r7 = kotlin.collections.CollectionsKt.F(r8)
            au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem$GooglePay r7 = (au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem.GooglePay) r7
            if (r7 != 0) goto L75
            goto Ld5
        L75:
            au.com.woolworths.foundation.google.pay.GooglePayManager r6 = r6.q
            java.lang.Object r8 = r7.g
            r0.p = r7
            r0.s = r3
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            r6 = r7
        L85:
            au.com.woolworths.foundation.google.pay.GooglePayState r8 = (au.com.woolworths.foundation.google.pay.GooglePayState) r8
            boolean r7 = r8 instanceof au.com.woolworths.foundation.google.pay.GooglePayState.Success
            if (r7 == 0) goto La2
            au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState$Available r7 = new au.com.woolworths.feature.shop.wpay.ui.wpay.GooglePayUiState$Available
            int r0 = r6.e
            double r0 = (double) r0
            r2 = 100
            double r2 = (double) r2
            double r0 = r0 / r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r6 = r6.g
            au.com.woolworths.foundation.google.pay.GooglePayState$Success r8 = (au.com.woolworths.foundation.google.pay.GooglePayState.Success) r8
            java.lang.String r8 = r8.f8531a
            r7.<init>(r0, r6, r8)
            return r7
        La2:
            boolean r7 = r8 instanceof au.com.woolworths.foundation.google.pay.GooglePayState.Fail
            if (r7 == 0) goto Lcf
            au.com.woolworths.foundation.bark.Bark$Companion r7 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r7 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.h
            au.com.woolworths.foundation.bark.common.ReportOwner r0 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r0.<init>(r7)
            au.com.woolworths.foundation.google.pay.GooglePayState$Fail r8 = (au.com.woolworths.foundation.google.pay.GooglePayState.Fail) r8
            int r7 = r8.f8530a
            java.lang.String r8 = r8.b
            java.lang.Object r6 = r6.g
            java.lang.String r1 = ": "
            java.lang.String r2 = ", supportedNetworks: "
            java.lang.String r3 = "Unable to use Google Pay: "
            java.lang.StringBuilder r7 = androidx.constraintlayout.core.state.a.p(r3, r7, r1, r8, r2)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r8 = 12
            au.com.woolworths.foundation.bark.Bark.Barker.i(r0, r6, r7, r8)
            return r4
        Lcf:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Ld5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel.q6(au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel, au.com.woolworths.feature.shop.wpay.domain.model.PageResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ void s6(WPayForOrderViewModel wPayForOrderViewModel, ErrorState.SnackBar snackBar, int i) {
        LoadingState loadingState = LoadingState.e;
        if ((i & 1) != 0) {
            loadingState = LoadingState.f;
        }
        ErrorState errorState = snackBar;
        if ((i & 2) != 0) {
            errorState = ErrorState.FullScreen.f8349a;
        }
        wPayForOrderViewModel.r6(loadingState, errorState, new au.com.woolworths.android.onesite.deeplink.h(20), new au.com.woolworths.android.onesite.deeplink.h(20));
    }

    public final void r6(LoadingState loadingState, ErrorState errorState, Function0 function0, Function0 function02) {
        Intrinsics.h(loadingState, "loadingState");
        Intrinsics.h(errorState, "errorState");
        BuildersKt.c(ViewModelKt.a(this), null, null, new WPayForOrderViewModel$fetchPaymentInstruments$3(this, loadingState, errorState, function0, function02, null), 3);
    }

    public final InputPayment t6() {
        PaymentInstrumentsResponse paymentInstrumentsResponse = (PaymentInstrumentsResponse) ((WPayForOrderContract.ViewState) this.r.getValue()).c.c();
        PaymentMethodItem paymentMethodItemA = paymentInstrumentsResponse != null ? paymentInstrumentsResponse.a() : null;
        if (paymentMethodItemA instanceof PaymentMethodItem.CreditCard.Unlinked) {
            PaymentMethodItem.CreditCard.Unlinked unlinked = (PaymentMethodItem.CreditCard.Unlinked) paymentMethodItemA;
            return new InputPayment.CreditCard(unlinked.f8305a, unlinked.h);
        }
        if (paymentMethodItemA instanceof PaymentMethodItem.PayPal.Linked) {
            PaymentMethodItem.PayPal.Linked linked = (PaymentMethodItem.PayPal.Linked) paymentMethodItemA;
            return new InputPayment.PayPal(linked.f8308a, linked.g);
        }
        if (paymentMethodItemA instanceof PaymentMethodItem.CreditCard.Linked) {
            throw new IllegalStateException("Unexpected payment submission using Linked Credit Card. Needs CVV validation.");
        }
        if (paymentMethodItemA instanceof PaymentMethodItem.GooglePay) {
            throw new IllegalStateException("Unexpected payment submission using Google Pay. Needs Google Pay token.");
        }
        if ((paymentMethodItemA instanceof PaymentMethodItem.CreditCard.Add) || (paymentMethodItemA instanceof PaymentMethodItem.CreditCard.Expired) || (paymentMethodItemA instanceof PaymentMethodItem.PayPal.Add) || paymentMethodItemA == null) {
            return InputPayment.None.f8296a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void u6(String str, String str2, String errorDescription) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.h(errorDescription, "errorDescription");
        PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.d;
        WPayAnalyticsTracker wPayAnalyticsTracker = this.p;
        wPayAnalyticsTracker.getClass();
        AnalyticsManager analyticsManager = wPayAnalyticsTracker.f8369a;
        PaymentCommonAnalytics.Payment.Action actionA = WPayAnalyticsTracker.a(paymentFlowTypeData);
        actionA.getClass();
        analyticsManager.g(new PaymentCommonAnalytics$Payment$Action$paymentScreenRetrieveCvvFailureImpression$1(actionA, errorDescription));
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.d, null, null, null, null, null, null, null, true, null, null, null, null, 7934)));
        Bark.Companion companion = Bark.f8483a;
        ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.h);
        StringBuilder sbV = YU.a.v("Error encountered when loading the WebView url: ", str, " errorReason: ", str2, " errorDescription: ");
        sbV.append(errorDescription);
        Bark.Barker.i(reportOwner, sbV.toString(), null, 12);
    }

    public final void v6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        this.p.f8369a.g((Event) WPayAnalyticsTracker.a(PaymentFlowTypeData.d).b.getD());
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.e, null, null, null, null, null, null, null, false, null, null, null, null, 7934)));
    }

    public final void w6() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, null, 6143)));
    }

    public final void x6(InputPayment inputPayment) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, LoadingState.f, null, null, null, null, null, null, null, false, null, null, null, null, 8190)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new WPayForOrderViewModel$proceedPayment$2(this, inputPayment, null), 3);
    }

    public final void y6(String str, boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.r;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, null, null, null, null, null, null, false, null, null, null, !z ? str : null, l3.b)));
        LoadingState loadingState = LoadingState.d;
        s6(this, new ErrorState.SnackBar(R.string.checkout_payment_select_credit_card_fail_msg), 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z6(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
        L4:
            kotlinx.coroutines.flow.MutableStateFlow r2 = r0.r
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract$ViewState r4 = (au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract.ViewState) r4
            java.util.Map r5 = r4.f
            java.util.LinkedHashMap r10 = kotlin.collections.MapsKt.s(r5)
            au.com.woolworths.feature.shop.wpay.ui.wpay.q r5 = new au.com.woolworths.feature.shop.wpay.ui.wpay.q
            r6 = 1
            r5.<init>(r0, r6)
            au.com.woolworths.feature.shop.wpay.ui.wpay.r r6 = new au.com.woolworths.feature.shop.wpay.ui.wpay.r
            r7 = 0
            r6.<init>(r7, r5)
            r10.computeIfPresent(r1, r6)
            java.util.Map r5 = r4.g
            java.util.LinkedHashMap r11 = kotlin.collections.MapsKt.s(r5)
            au.com.woolworths.feature.shop.wpay.ui.wpay.q r5 = new au.com.woolworths.feature.shop.wpay.ui.wpay.q
            r6 = 2
            r5.<init>(r0, r6)
            au.com.woolworths.feature.shop.wpay.ui.wpay.r r6 = new au.com.woolworths.feature.shop.wpay.ui.wpay.r
            r7 = 1
            r6.<init>(r7, r5)
            r11.computeIfPresent(r1, r6)
            r17 = 0
            r18 = 8095(0x1f9f, float:1.1344E-41)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract$ViewState r4 = au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract.ViewState.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r2.d(r3, r4)
            if (r3 == 0) goto L4
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract$ViewState r1 = (au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract.ViewState) r1
            java.util.Map r1 = r1.f
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L6c
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6c
            goto L81
        L6c:
            java.util.Iterator r1 = r1.iterator()
        L70:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r1.next()
            au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit$Linked r3 = (au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit.Linked) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L70
            goto Lb1
        L81:
            java.lang.Object r1 = r2.getValue()
            au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract$ViewState r1 = (au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract.ViewState) r1
            java.util.Map r1 = r1.g
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L9d
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L9d
            goto Lca
        L9d:
            java.util.Iterator r1 = r1.iterator()
        La1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r1.next()
            au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit$Unlinked r2 = (au.com.woolworths.feature.shop.wpay.ui.wpay.GiftCardEdit.Unlinked) r2
            boolean r2 = r2.e
            if (r2 == 0) goto La1
        Lb1:
            au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState r1 = au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState.e
            au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState$SnackBar r2 = new au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState$SnackBar
            r3 = 2132017224(0x7f140048, float:1.967272E38)
            r2.<init>(r3)
            au.com.woolworths.feature.shop.wpay.ui.wpay.s r3 = new au.com.woolworths.feature.shop.wpay.ui.wpay.s
            r4 = 0
            r3.<init>(r0, r4)
            au.com.woolworths.feature.shop.wpay.ui.wpay.s r4 = new au.com.woolworths.feature.shop.wpay.ui.wpay.s
            r5 = 1
            r4.<init>(r0, r5)
            r0.r6(r1, r2, r3, r4)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel.z6(java.lang.String):void");
    }
}
