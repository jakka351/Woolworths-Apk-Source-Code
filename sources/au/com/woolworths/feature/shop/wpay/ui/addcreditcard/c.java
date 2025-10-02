package au.com.woolworths.feature.shop.wpay.ui.addcreditcard;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.wpay.domain.model.CreditCardFormWebEvent;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.AddCreditCardResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardContract;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardResult;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        LoadingState loadingState;
        Exception exc;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                AddCreditCardViewModel addCreditCardViewModel = (AddCreditCardViewModel) obj3;
                String it = (String) obj;
                Intrinsics.h(it, "it");
                boolean zBooleanValue = ((Boolean) ((MutableState) obj2).getD()).booleanValue();
                BufferedChannel bufferedChannel = addCreditCardViewModel.m;
                MutableStateFlow mutableStateFlow = addCreditCardViewModel.l;
                CreditCardFormWebEvent creditCardFormWebEventA = addCreditCardViewModel.j.a(it);
                if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Success) {
                    CreditCardFormWebEvent.Success success = (CreditCardFormWebEvent.Success) creditCardFormWebEventA;
                    if (zBooleanValue) {
                        BuildersKt.c(ViewModelKt.a(addCreditCardViewModel), null, null, new AddCreditCardViewModel$linkCreditCardToAccount$1(addCreditCardViewModel, success.getCheckoutSessionId(), null), 3);
                    } else {
                        bufferedChannel.k(new AddCreditCardContract.Action.Success(new AddCreditCardResult.UnlinkedCard(success.getCheckoutSessionId())));
                    }
                } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Fail) {
                    CreditCardFormWebEvent.Fail fail = (CreditCardFormWebEvent.Fail) creditCardFormWebEventA;
                    PaymentFlowTypeData flowType = addCreditCardViewModel.e;
                    AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker = addCreditCardViewModel.i;
                    if (Intrinsics.c(fail.getReason(), "invalid_details")) {
                        do {
                            value5 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value5, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value5, LoadingState.d, null, fail.getMessage(), false, 10)));
                        addCreditCardAnalyticsTracker.getClass();
                        Intrinsics.h(flowType, "flowType");
                        Integer status = fail.getStatus();
                        final int iIntValue = status != null ? status.intValue() : 0;
                        AnalyticsManager analyticsManager = addCreditCardAnalyticsTracker.f8322a;
                        final AddCreditCardAnalytics.Payment.Action action = AddCreditCardAnalyticsTracker.a(flowType).h;
                        action.getClass();
                        analyticsManager.g(new Event(action, iIntValue) { // from class: au.com.woolworths.analytics.supers.payments.AddCreditCardAnalytics$Payment$Action$addCreditCardScreenValidationFailure$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                spreadBuilder.b(action.f4041a.g);
                                spreadBuilder.a(new Pair("event.Category", "Add Credit Card"));
                                spreadBuilder.a(new Pair("event.Action", "validation_error"));
                                spreadBuilder.a(new Pair("event.Label", "Credit Card Validation Failure"));
                                androidx.constraintlayout.core.state.a.y("event.Description", "Failure to validate the credit card," + iIntValue, spreadBuilder);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "add_credit_card_screen_validation_failure";
                            }

                            public final boolean equals(Object obj4) {
                                if (!(obj4 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj4;
                                return "add_credit_card_screen_validation_failure".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        });
                    } else {
                        do {
                            value4 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value4, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value4, LoadingState.d, null, null, false, 14)));
                        bufferedChannel.k(AddCreditCardContract.Action.SnackBarServerError.f8325a);
                        addCreditCardAnalyticsTracker.b(flowType);
                        Bark.Companion companion = Bark.f8483a;
                        ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.h);
                        String message = fail.getMessage();
                        if (message == null) {
                            message = "Server error encountered when adding credit card";
                        }
                        String code = fail.getCode();
                        if (code == null) {
                            code = "";
                        }
                        Integer status2 = fail.getStatus();
                        Bark.Barker.i(reportOwner, message, "code -> " + code + ", status -> " + (status2 != null ? status2.intValue() : 0), 8);
                    }
                } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.ValidationError) {
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value3, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value3, LoadingState.d, null, null, false, 14)));
                } else if (creditCardFormWebEventA.equals(CreditCardFormWebEvent.FormChanged.f8280a)) {
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value2, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value2, null, null, null, false, 11)));
                } else if (creditCardFormWebEventA instanceof CreditCardFormWebEvent.Invalid) {
                    do {
                        value = mutableStateFlow.getValue();
                        loadingState = LoadingState.d;
                        exc = ((CreditCardFormWebEvent.Invalid) creditCardFormWebEventA).f8281a;
                    } while (!mutableStateFlow.d(value, AddCreditCardContract.ViewState.a((AddCreditCardContract.ViewState) value, loadingState, new PageResult.Fail(exc), null, false, 4)));
                    Bark.Companion companion2 = Bark.f8483a;
                    Bark.Barker.c(new ReportOwner(ReportOwner.Squad.h), exc, null, 12);
                } else if (!creditCardFormWebEventA.equals(CreditCardFormWebEvent.Unknown.f8282a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return unit;
            case 1:
                AddCreditCardViewModel addCreditCardViewModel2 = (AddCreditCardViewModel) obj3;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                ((MutableState) obj2).setValue(bool);
                AddCreditCardAnalyticsTracker addCreditCardAnalyticsTracker2 = addCreditCardViewModel2.i;
                PaymentFlowTypeData flowType2 = addCreditCardViewModel2.e;
                addCreditCardAnalyticsTracker2.getClass();
                Intrinsics.h(flowType2, "flowType");
                AddCreditCardAnalytics.Payment.Action action2 = AddCreditCardAnalyticsTracker.a(flowType2).h;
                addCreditCardAnalyticsTracker2.f8322a.g(zBooleanValue2 ? (Event) action2.d.getD() : (Event) action2.e.getD());
                return unit;
            default:
                AddCreditCardResponse addCreditCardResponse = (AddCreditCardResponse) obj2;
                WebView it2 = (WebView) obj;
                Intrinsics.h(it2, "it");
                it2.loadUrl(addCreditCardResponse.f8287a, addCreditCardResponse.b);
                ((Function1) obj3).invoke(it2);
                return unit;
        }
    }
}
