package com.woolworths.scanlibrary.ui.checkout.pay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.pay.sdk.models.StepUp;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ClickedNonSNGTransferToPOS;
import com.woolworths.scanlibrary.analytics.TenderMakePaymentTracking;
import com.woolworths.scanlibrary.analytics.TenderPayAtCheckoutTracking;
import com.woolworths.scanlibrary.analytics.TenderScreenTracking;
import com.woolworths.scanlibrary.analytics.TenderZeroPaymentTracking;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeature;
import com.woolworths.scanlibrary.data.authentication.AuthenticatedUser;
import com.woolworths.scanlibrary.data.cart.Cart;
import com.woolworths.scanlibrary.data.payment.PaymentDetail;
import com.woolworths.scanlibrary.data.payment.PaymentStatus;
import com.woolworths.scanlibrary.domain.payment.MakePaymentUC;
import com.woolworths.scanlibrary.domain.payment.MakeZeroAmountPaymentUC;
import com.woolworths.scanlibrary.domain.transfertopos.TransferToPosUC;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.error.PaymentErrorResponse;
import com.woolworths.scanlibrary.models.payment.PaymentInformation;
import com.woolworths.scanlibrary.models.payment.PaymentRequest;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.exit.ExitDTO;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.PayAtCheckout;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.extensions.FeatureToggleManagerExtKt;
import com.woolworths.scanlibrary.util.payment.PaymentInstrumentLastUsageComparator;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter;", "Lcom/woolworths/scanlibrary/ui/checkout/pay/PayContract$Presenter;", "InstrumentStepUpInfo", "TenderStatus", "MakePaymentObserver", "DefaultCard", "TransferToPOSObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PayPresenter implements PayContract.Presenter {

    /* renamed from: a, reason: collision with root package name */
    public final PayContract.View f21236a;
    public final FeatureToggleManager b;
    public final Cart c;
    public final PaymentDetail d;
    public final MakePaymentUC e;
    public final MakeZeroAmountPaymentUC f;
    public final TransferToPosUC g;
    public final ResourceResolverImpl h;
    public final AnalyticsProvider i;
    public final CompositeDisposable j;
    public int k;
    public PayFragment.PaymentErrorStatus l;
    public final MutableLiveData m;
    public final ArrayList n;
    public final LinkedHashMap o;
    public final boolean p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter$DefaultCard;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class DefaultCard {

        /* renamed from: a, reason: collision with root package name */
        public final PaymentInstrument f21237a;
        public final int b;

        public DefaultCard(PaymentInstrument paymentInstrument, int i) {
            Intrinsics.h(paymentInstrument, "paymentInstrument");
            this.f21237a = paymentInstrument;
            this.b = i;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter$InstrumentStepUpInfo;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstrumentStepUpInfo {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21238a;
        public String b = null;
        public URL c;

        public InstrumentStepUpInfo(boolean z, URL url) {
            this.f21238a = z;
            this.c = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentStepUpInfo)) {
                return false;
            }
            InstrumentStepUpInfo instrumentStepUpInfo = (InstrumentStepUpInfo) obj;
            return this.f21238a == instrumentStepUpInfo.f21238a && Intrinsics.c(this.b, instrumentStepUpInfo.b) && Intrinsics.c(this.c, instrumentStepUpInfo.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f21238a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            URL url = this.c;
            return iHashCode2 + (url != null ? url.hashCode() : 0);
        }

        public final String toString() {
            String str = this.b;
            URL url = this.c;
            StringBuilder sbT = a.t("InstrumentStepUpInfo(isMandatory=", ", stepUpToken=", str, ", stepUpUrl=", this.f21238a);
            sbT.append(url);
            sbT.append(")");
            return sbT.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter$MakePaymentObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/payment/MakePaymentUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class MakePaymentObserver extends BaseDisposableObserver<MakePaymentUC.ResponseValue> {
        public final PayContract.View g;
        public final MutableLiveData h;
        public final /* synthetic */ PayPresenter i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21239a;

            static {
                int[] iArr = new int[PaymentStatus.values().length];
                try {
                    iArr[PaymentStatus.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentStatus.PAID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PaymentStatus.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f21239a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MakePaymentObserver(PayPresenter payPresenter, PayContract.View view, MutableLiveData liveEvent, int i) {
            super(view, i);
            Intrinsics.h(liveEvent, "liveEvent");
            this.i = payPresenter;
            this.g = view;
            this.h = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final Class a() {
            return PaymentErrorResponse.class;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            PayPresenter payPresenter = this.i;
            Cart cart = payPresenter.c;
            PayContract.View view = this.g;
            view.i1(true);
            if (!(apigeeErrorResponse instanceof PaymentErrorResponse)) {
                this.e.n(i, i2, apigeeErrorResponse, new h(20));
                return;
            }
            PaymentErrorResponse paymentErrorResponse = (PaymentErrorResponse) apigeeErrorResponse;
            boolean zNeedStepUp = paymentErrorResponse.needStepUp();
            MutableLiveData mutableLiveData = this.h;
            if (zNeedStepUp) {
                PaymentErrorResponse.StepUp stepUp = paymentErrorResponse.getStepUp();
                mutableLiveData.j(new Event(new PayContract.PayViewEvent.StepUpRequestEvent(new URL(stepUp != null ? stepUp.getUrl() : null))));
            } else if (Intrinsics.c(paymentErrorResponse.getErrorCode(), "40410")) {
                mutableLiveData.j(new Event(new PayContract.PayViewEvent.ShowExitCodeEvent(new ExitDTO(cart.getC(), cart.s(), CartStatus.PAID, null, cart.getN(), 8))));
            } else {
                if (!paymentErrorResponse.getPaymentFailLimitExceeded()) {
                    mutableLiveData.j(new Event(new PayContract.PayViewEvent.PaymentFailureEvent(paymentErrorResponse.getDescription())));
                    return;
                }
                payPresenter.d.b();
                view.o(new PayAtCheckout(payPresenter.h.getString(R.string.sng_label_payment_at_checkout)));
                mutableLiveData.j(new Event(new PayContract.PayViewEvent.PaymentFailLimitExceedEvent(paymentErrorResponse.getDescription())));
            }
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.e.i0(errorType);
            this.g.i1(true);
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            MakePaymentUC.ResponseValue response = (MakePaymentUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            PayContract.View view = this.g;
            view.N3(false);
            int i = WhenMappings.f21239a[response.f21193a.getStatus().ordinal()];
            MutableLiveData mutableLiveData = this.h;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                view.i1(true);
                mutableLiveData.j(new Event(PayContract.PayViewEvent.GenericPaymentFailureEvent.f21229a));
                return;
            }
            Cart cart = this.i.c;
            mutableLiveData.j(new Event(new PayContract.PayViewEvent.ShowExitCodeEvent(new ExitDTO(cart.getC(), cart.s(), CartStatus.PAID, null, cart.getN(), 8))));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter$TenderStatus;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TenderStatus {
        public static final TenderStatus d;
        public static final TenderStatus e;
        public static final TenderStatus f;
        public static final TenderStatus g;
        public static final TenderStatus h;
        public static final TenderStatus i;
        public static final TenderStatus j;
        public static final /* synthetic */ TenderStatus[] k;
        public static final /* synthetic */ EnumEntries l;

        static {
            TenderStatus tenderStatus = new TenderStatus("PAYMENT_IN_APP_NOT_SUPPORTED", 0);
            d = tenderStatus;
            TenderStatus tenderStatus2 = new TenderStatus("PAYMENT_INFO_UNAVAILABLE", 1);
            e = tenderStatus2;
            TenderStatus tenderStatus3 = new TenderStatus("PAYMENT_NO_CARDS", 2);
            f = tenderStatus3;
            TenderStatus tenderStatus4 = new TenderStatus("PAYMENT_ALL_INSTRUMENTS_EXPIRED", 3);
            g = tenderStatus4;
            TenderStatus tenderStatus5 = new TenderStatus("PAYMENT_FAILED", 4);
            h = tenderStatus5;
            TenderStatus tenderStatus6 = new TenderStatus("PAYMENT_AVAILABLE", 5);
            i = tenderStatus6;
            TenderStatus tenderStatus7 = new TenderStatus("PAYMENT_ZERO_AMOUNT", 6);
            j = tenderStatus7;
            TenderStatus[] tenderStatusArr = {tenderStatus, tenderStatus2, tenderStatus3, tenderStatus4, tenderStatus5, tenderStatus6, tenderStatus7};
            k = tenderStatusArr;
            l = EnumEntriesKt.a(tenderStatusArr);
        }

        public static TenderStatus valueOf(String str) {
            return (TenderStatus) Enum.valueOf(TenderStatus.class, str);
        }

        public static TenderStatus[] values() {
            return (TenderStatus[]) k.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/checkout/pay/PayPresenter$TransferToPOSObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/transfertopos/TransferToPosUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TransferToPOSObserver extends BaseDisposableObserver<TransferToPosUC.ResponseValue> {
        public final PayContract.View g;
        public final MutableLiveData h;
        public final /* synthetic */ PayPresenter i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferToPOSObserver(PayPresenter payPresenter, PayContract.View view, MutableLiveData liveEvent) {
            super(view, 4006);
            Intrinsics.h(liveEvent, "liveEvent");
            this.i = payPresenter;
            this.g = view;
            this.h = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final Class a() {
            return PaymentErrorResponse.class;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            PayContract.View view = this.g;
            view.N3(false);
            view.i1(true);
            if (apigeeErrorResponse instanceof PaymentErrorResponse) {
                this.h.j(new Event(new PayContract.PayViewEvent.TransferToPosFailureEvent(((PaymentErrorResponse) apigeeErrorResponse).getDescription())));
            } else {
                this.e.n(i, i2, apigeeErrorResponse, new h(20));
            }
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.e.i0(errorType);
            this.g.i1(true);
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            TransferToPosUC.ResponseValue response = (TransferToPosUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            this.g.N3(false);
            String str = response.f21208a;
            CartStatus cartStatus = CartStatus.TRANSFERED_TO_POS;
            Cart cart = this.i.c;
            this.h.j(new Event(new PayContract.PayViewEvent.ShowExitCodeEvent(new ExitDTO(str, cart.s(), cartStatus, null, cart.getN(), 8))));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21240a;

        static {
            int[] iArr = new int[PayFragment.PaymentErrorStatus.values().length];
            try {
                iArr[PayFragment.PaymentErrorStatus.g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayFragment.PaymentErrorStatus.k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PayFragment.PaymentErrorStatus.l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PayFragment.PaymentErrorStatus.p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PayFragment.PaymentErrorStatus.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PayFragment.PaymentErrorStatus.j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21240a = iArr;
        }
    }

    public PayPresenter(PayContract.View view, AuthenticatedUser authenticatedUser, FeatureToggleManager featureToggleManager, Cart shoppingCart, PaymentDetail paymentDetail, MakePaymentUC makePaymentUC, MakeZeroAmountPaymentUC makeZeroAmountPaymentUC, TransferToPosUC transferToPosUC, ResourceResolverImpl resourceResolverImpl, AnalyticsProvider analyticsAggregator) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shoppingCart, "shoppingCart");
        Intrinsics.h(paymentDetail, "paymentDetail");
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.f21236a = view;
        this.b = featureToggleManager;
        this.c = shoppingCart;
        this.d = paymentDetail;
        this.e = makePaymentUC;
        this.f = makeZeroAmountPaymentUC;
        this.g = transferToPosUC;
        this.h = resourceResolverImpl;
        this.i = analyticsAggregator;
        this.j = new CompositeDisposable();
        this.m = new MutableLiveData();
        view.k1(this);
        paymentDetail.reset();
        paymentDetail.f(shoppingCart.getE());
        paymentDetail.j(shoppingCart.getK());
        analyticsAggregator.a(new TenderScreenTracking("Tender Screen"));
        this.n = new ArrayList();
        this.o = new LinkedHashMap();
        this.p = !featureToggleManager.c(ScanAndGoFeature.e);
    }

    public static final DefaultCard f(List list) {
        List<PaymentInstrument> list2 = list;
        String instrumentId = ((PaymentInstrument) CollectionsKt.u0(new PaymentInstrumentLastUsageComparator(), list2).get(0)).getInstrumentId();
        Intrinsics.g(instrumentId, "getInstrumentId(...)");
        int i = 0;
        for (PaymentInstrument paymentInstrument : list2) {
            int i2 = i + 1;
            if (paymentInstrument instanceof CreditCardInstrument) {
                CreditCardInstrument creditCardInstrument = (CreditCardInstrument) paymentInstrument;
                if (Intrinsics.c(creditCardInstrument.getInstrumentId(), instrumentId) && !creditCardInstrument.isExpired()) {
                    return new DefaultCard(paymentInstrument, i);
                }
            }
            i = i2;
        }
        return new DefaultCard((PaymentInstrument) list.get(0), 0);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void G(String instrumentId, String stepupToken) {
        Intrinsics.h(instrumentId, "instrumentId");
        Intrinsics.h(stepupToken, "stepupToken");
        InstrumentStepUpInfo instrumentStepUpInfo = (InstrumentStepUpInfo) this.o.get(instrumentId);
        if (instrumentStepUpInfo != null) {
            instrumentStepUpInfo.b = stepupToken;
        }
        m();
    }

    public final void H(PayFragment.PaymentErrorStatus paymentErrorStatus, String str) {
        int iOrdinal = paymentErrorStatus.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            PayFragment.PaymentErrorStatus paymentErrorStatus2 = this.l;
            int i = paymentErrorStatus2 == null ? -1 : WhenMappings.f21240a[paymentErrorStatus2.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return;
            }
        }
        this.l = paymentErrorStatus;
        this.f21236a.D4(paymentErrorStatus, str);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void I(PayError payError) {
        Intrinsics.h(payError, "payError");
        PayErrorCode payErrorCode = payError.getPayErrorCode();
        PayErrorCode payErrorCode2 = PayErrorCode.NETWORK_ERROR;
        PayContract.View view = this.f21236a;
        if (payErrorCode == payErrorCode2 && Intrinsics.c(payError.getErrorMessage(), "No connection.")) {
            view.x0();
        } else {
            view.D4(PayFragment.PaymentErrorStatus.h, "");
        }
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void M0() {
        Cart cart = this.c;
        boolean zJ = cart.J();
        PayContract.View view = this.f21236a;
        if (true == zJ) {
            view.p(TenderStatus.j);
            H(PayFragment.PaymentErrorStatus.p, "");
            return;
        }
        if (true == cart.M()) {
            view.p(TenderStatus.d);
            PayFragment.PaymentErrorStatus paymentErrorStatus = PayFragment.PaymentErrorStatus.k;
            String strK = cart.K();
            H(paymentErrorStatus, strK != null ? strK : "");
            return;
        }
        boolean zE = cart.E();
        boolean z = this.p;
        if (zE || !z) {
            if (z) {
                view.w2();
                return;
            } else {
                view.p(TenderStatus.d);
                return;
            }
        }
        view.p(TenderStatus.d);
        PayFragment.PaymentErrorStatus paymentErrorStatus2 = PayFragment.PaymentErrorStatus.m;
        String strK2 = cart.K();
        H(paymentErrorStatus2, strK2 != null ? strK2 : "");
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void O() {
        H(PayFragment.PaymentErrorStatus.g, "");
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void O0() {
        this.k++;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void R0() {
        TenderStatus tenderStatus = TenderStatus.e;
        PayContract.View view = this.f21236a;
        view.p(tenderStatus);
        view.G3();
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    /* renamed from: S, reason: from getter */
    public final MutableLiveData getM() {
        return this.m;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    /* renamed from: U0, reason: from getter */
    public final boolean getP() {
        return this.p;
    }

    @Override // com.woolworths.scanlibrary.base.mvp.MvpPresenter
    public final void X0() {
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void d1(PaymentInstrument instrument) {
        Intrinsics.h(instrument, "instrument");
        t(instrument, this.c.getK());
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void e1() {
        PayContract.View view = this.f21236a;
        view.s3();
        this.i.b(new ClickedNonSNGTransferToPOS("Transfer to POS - Non SNG Store"));
        SingleObserveOn singleObserveOnF = this.g.b(new TransferToPosUC.RequestValues()).f(AndroidSchedulers.a());
        TransferToPOSObserver transferToPOSObserver = new TransferToPOSObserver(this, view, this.m);
        singleObserveOnF.a(transferToPOSObserver);
        this.j.d(transferToPOSObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final long k() {
        return FeatureToggleManagerExtKt.a(this.b);
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void k0() {
        Cart cart = this.c;
        boolean zJ = cart.J();
        AnalyticsProvider analyticsProvider = this.i;
        PayContract.View view = this.f21236a;
        if (!zJ) {
            if (cart.E() && this.p) {
                view.i1(false);
                m();
                return;
            }
            view.G3();
            float fFloatValue = cart.getK().floatValue();
            int iZ = cart.z(false);
            TenderPayAtCheckoutTracking tenderPayAtCheckoutTracking = new TenderPayAtCheckoutTracking("scanandgo.tender.payAtCheckout");
            tenderPayAtCheckoutTracking.a("tender.payment.amount", Float.valueOf(fFloatValue));
            tenderPayAtCheckoutTracking.a("tender.payment.items", Integer.valueOf(iZ));
            analyticsProvider.b(tenderPayAtCheckoutTracking);
            return;
        }
        view.i1(false);
        view.F3();
        PaymentDetail paymentDetail = this.d;
        paymentDetail.e();
        paymentDetail.i(cart.getC());
        paymentDetail.a();
        SingleObserveOn singleObserveOnF = this.f.b(new MakeZeroAmountPaymentUC.RequestValues()).f(AndroidSchedulers.a());
        MakePaymentObserver makePaymentObserver = new MakePaymentObserver(this, view, this.m, 4004);
        singleObserveOnF.a(makePaymentObserver);
        this.j.d(makePaymentObserver);
        int iZ2 = cart.z(false);
        TenderZeroPaymentTracking tenderZeroPaymentTracking = new TenderZeroPaymentTracking("Zero Payment");
        tenderZeroPaymentTracking.a("tender.payment.items", Integer.valueOf(iZ2));
        tenderZeroPaymentTracking.a("tender.payment.amount", 0);
        analyticsProvider.b(tenderZeroPaymentTracking);
    }

    public final void m() {
        URL url;
        PaymentDetail paymentDetail = this.d;
        Iterator it = paymentDetail.getB().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.o;
            PayContract.View view = this.f21236a;
            if (!zHasNext) {
                Iterator it2 = paymentDetail.getB().iterator();
                while (it2.hasNext()) {
                    PaymentInformation paymentInformation = (PaymentInformation) it2.next();
                    InstrumentStepUpInfo instrumentStepUpInfo = (InstrumentStepUpInfo) linkedHashMap.get(paymentInformation.getPaymentInstrumentId());
                    if (instrumentStepUpInfo != null) {
                        paymentInformation.setStepUpToken(instrumentStepUpInfo.b);
                    }
                }
                Cart cart = this.c;
                PaymentRequest paymentRequest = new PaymentRequest(cart.getC(), paymentDetail.getB());
                view.F3();
                paymentDetail.e();
                paymentDetail.i(cart.getC());
                paymentDetail.a();
                SingleObserveOn singleObserveOnF = this.e.b(new MakePaymentUC.RequestValues(paymentRequest)).f(AndroidSchedulers.a());
                MakePaymentObserver makePaymentObserver = new MakePaymentObserver(this, view, this.m, 4002);
                singleObserveOnF.a(makePaymentObserver);
                this.j.d(makePaymentObserver);
                float fFloatValue = cart.getK().floatValue();
                int iZ = cart.z(false);
                TenderMakePaymentTracking tenderMakePaymentTracking = new TenderMakePaymentTracking("Make Payment");
                tenderMakePaymentTracking.a("tender.payment.amount", Float.valueOf(fFloatValue));
                tenderMakePaymentTracking.a("tender.payment.items", Integer.valueOf(iZ));
                this.i.b(tenderMakePaymentTracking);
                return;
            }
            InstrumentStepUpInfo instrumentStepUpInfo2 = (InstrumentStepUpInfo) linkedHashMap.get(((PaymentInformation) it.next()).getPaymentInstrumentId());
            if (instrumentStepUpInfo2 != null && (url = instrumentStepUpInfo2.c) != null && instrumentStepUpInfo2.f21238a) {
                view.j0(url);
                instrumentStepUpInfo2.c = null;
                view.N3(false);
                return;
            }
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    /* renamed from: r, reason: from getter */
    public final Cart getC() {
        return this.c;
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final boolean s() {
        return this.c.s();
    }

    public final void t(PaymentInstrument paymentInstrument, BigDecimal bigDecimal) {
        boolean z = paymentInstrument instanceof CreditCardInstrument;
        PayContract.View view = this.f21236a;
        if (z) {
            view.p(TenderStatus.i);
            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) paymentInstrument;
            String instrumentId = creditCardInstrument.getInstrumentId();
            Intrinsics.g(instrumentId, "getInstrumentId(...)");
            String cardSuffix = creditCardInstrument.getCardSuffix();
            String str = cardSuffix == null ? "" : cardSuffix;
            String scheme = creditCardInstrument.getScheme();
            this.d.d(new PaymentInformation(instrumentId, bigDecimal, str, scheme == null ? "" : scheme, null, creditCardInstrument.isExpired(), null, 80, null));
        } else {
            view.p(TenderStatus.f);
        }
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PaymentInstrument paymentInstrument2 = (PaymentInstrument) it.next();
            if (!(paymentInstrument2 instanceof CreditCardInstrument) || !((CreditCardInstrument) paymentInstrument2).isExpired()) {
                PayFragment.PaymentErrorStatus paymentErrorStatus = this.l;
                if (paymentErrorStatus == PayFragment.PaymentErrorStatus.i || paymentErrorStatus == PayFragment.PaymentErrorStatus.j) {
                    this.l = null;
                    view.X0();
                }
                if (arrayList.isEmpty() && this.l == PayFragment.PaymentErrorStatus.o) {
                    this.l = null;
                    view.X0();
                    return;
                }
            }
        }
        H(arrayList.size() == 1 ? PayFragment.PaymentErrorStatus.i : PayFragment.PaymentErrorStatus.j, "");
        view.p(TenderStatus.g);
        if (arrayList.isEmpty()) {
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void w() {
        int i = this.k;
        PayContract.View view = this.f21236a;
        if (i < 1) {
            view.E4();
        } else if (this.n.isEmpty()) {
            this.d.g();
            view.V2(false);
            view.p(TenderStatus.e);
            H(PayFragment.PaymentErrorStatus.n, "");
        }
    }

    @Override // com.woolworths.scanlibrary.ui.checkout.pay.PayContract.Presenter
    public final void x(List paymentInstruments) {
        DefaultCard defaultCardF;
        Intrinsics.h(paymentInstruments, "paymentInstruments");
        this.k = 0;
        PayContract.View view = this.f21236a;
        view.N3(false);
        boolean zIsEmpty = paymentInstruments.isEmpty();
        ArrayList arrayList = this.n;
        if (zIsEmpty) {
            arrayList.clear();
            view.p(TenderStatus.f);
            H(PayFragment.PaymentErrorStatus.o, "");
            view.V2(true);
            return;
        }
        arrayList.clear();
        arrayList.addAll(paymentInstruments);
        LinkedHashMap linkedHashMap = this.o;
        linkedHashMap.clear();
        Iterator it = paymentInstruments.iterator();
        while (it.hasNext()) {
            PaymentInstrument paymentInstrument = (PaymentInstrument) it.next();
            if (paymentInstrument instanceof CreditCardInstrument) {
                CreditCardInstrument creditCardInstrument = (CreditCardInstrument) paymentInstrument;
                if (creditCardInstrument.getStepUp() != null) {
                    String instrumentId = creditCardInstrument.getInstrumentId();
                    StepUp stepUp = creditCardInstrument.getStepUp();
                    Intrinsics.e(stepUp);
                    boolean zIsMandatory = stepUp.isMandatory();
                    StepUp stepUp2 = creditCardInstrument.getStepUp();
                    Intrinsics.e(stepUp2);
                    linkedHashMap.put(instrumentId, new InstrumentStepUpInfo(zIsMandatory, stepUp2.getURL()));
                }
            }
        }
        PaymentDetail paymentDetail = this.d;
        if (!paymentDetail.getB().isEmpty()) {
            Iterator it2 = paymentDetail.getB().iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    defaultCardF = f(paymentInstruments);
                    break;
                }
                PaymentInformation paymentInformation = (PaymentInformation) it2.next();
                Iterator it3 = paymentInstruments.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    int i2 = i + 1;
                    PaymentInstrument paymentInstrument2 = (PaymentInstrument) it3.next();
                    if (Intrinsics.c(paymentInstrument2.getInstrumentId(), paymentInformation.getPaymentInstrumentId())) {
                        defaultCardF = new DefaultCard(paymentInstrument2, i);
                        break loop1;
                    }
                    i = i2;
                }
            }
        } else {
            defaultCardF = f(paymentInstruments);
        }
        PaymentInstrument paymentInstrument3 = defaultCardF.f21237a;
        if (paymentDetail.getF()) {
            return;
        }
        view.o(paymentInstrument3);
        view.a(defaultCardF.b);
        t(paymentInstrument3, this.c.getK());
    }
}
