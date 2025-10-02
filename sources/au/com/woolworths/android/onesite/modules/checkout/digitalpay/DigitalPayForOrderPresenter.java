package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.FloatExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.checkout.NewCreditCardData;
import au.com.woolworths.android.onesite.models.checkout.NewGiftCardData;
import au.com.woolworths.android.onesite.models.checkout.PaymentFailureError;
import au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentBreakdownState;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardNumberStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardPayAmountStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.GiftCardPinStatus;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.enums.UIStatus;
import au.com.woolworths.android.onesite.modules.mvp.BasePresenterImpl;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.Jsons;
import au.com.woolworths.android.onesite.utils.ProductInfoFormatter;
import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.checkout.models.PaymentState;
import au.com.woolworths.devicefingerprint.DeviceFingerprintInteractor;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutError;
import au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentData;
import au.com.woolworths.foundation.shop.model.checkout.DigitalPayPaymentMethod;
import au.com.woolworths.foundation.shop.model.checkout.OrderSummary;
import au.com.woolworths.foundation.shop.model.checkout.PaymentErrors;
import au.com.woolworths.foundation.shop.model.checkout.PaymentErrorsKt;
import au.com.woolworths.foundation.shop.model.checkout.PaymentStepUp;
import au.com.woolworths.foundation.shop.model.checkout.ResponseError;
import au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorList;
import au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorListForOkStatus;
import au.com.woolworths.pay.internal.services.balances.GiftCardBalanceInstrumentsResult;
import au.com.woolworths.pay.internal.services.balances.GiftCardBalanceService;
import au.com.woolworths.pay.internal.services.tokenise.TokeniseGiftCardResponse;
import au.com.woolworths.pay.internal.services.tokenise.TokeniseGiftCardService;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.GiftCardInstrument;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.pay.sdk.models.SaveOptions;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.error.PaymentErrorResponse;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.rxkotlin.SinglesKt;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter;", "Lau/com/woolworths/android/onesite/modules/mvp/BasePresenterImpl;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$View;", "Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderContract$Presenter;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DigitalPayForOrderPresenter extends BasePresenterImpl<DigitalPayForOrderContract.View> implements DigitalPayForOrderContract.Presenter {
    public boolean A;
    public PayPalInstrument B;
    public boolean C;
    public final HashMap D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public String I;
    public int J;
    public QueryFormStatusProvider K;
    public boolean L;
    public PaymentState M;
    public boolean N;
    public FormFocusState O;
    public GiftCardNumberStatus P;
    public GiftCardPinStatus Q;
    public final CompositeDisposable R;
    public final CompositeDisposable S;
    public PaymentFailureHelper.GlobalErrorLabelProvider T;
    public boolean U;
    public boolean V;
    public final HashMap W;
    public String[] X;
    public boolean Y;
    public boolean Z;
    public SingleCache a0;
    public SingleFlatMap b0;
    public final ApiService c;
    public SingleCache c0;
    public final CheckoutInteractor d;
    public SingleCreate d0;
    public final Gson e;
    public Runnable e0;
    public final PaymentServicesInteractor f;
    public boolean f0;
    public final CollectionModeInteractor g;
    public final DeviceFingerprintInteractor h;
    public final SchedulersProvider i;
    public final ShopAppTokenAuthenticator j;
    public final NetworkExceptions k;
    public final AnalyticsManager l;
    public final PayClient m;
    public final CollectDeviceData n;
    public final FeatureToggleManager o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList t;
    public final ArrayList u;
    public NewGiftCardData v;
    public final ArrayList w;
    public CardCaptureView x;
    public String y;
    public String z;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/digitalpay/DigitalPayForOrderPresenter$Companion;", "", "", "CVV_LOAD_ERROR_STEPUP", "Ljava/lang/String;", "", "LIQUOR_PICKING_HOURS_CODE", "I", "MODE_PAYMENT_SELECTION", "MODE_MANAGE_INSTRUMENTS", "CLIENT_REFERENCE", "NEW_CREDIT_CARD_INSTRUMENT_ID", "VISA_CREDIT_CARD_SCHEME", "MASTERCARD_CREDIT_CARD_SCHEME", "DINERS_CREDIT_CARD_SCHEME", "JCB_CREDIT_CARD_SCHEME", "AMEX_CREDIT_CARD_SCHEME", "ADD_GIFT_CARD_INVALID_PIN_ERROR", "ADD_GIFT_CARD_INVALID_CARD_NUMBER_ERROR", "ADD_GIFT_CARD_UNABLE_TO_RETRIEVE_BALANCE", "VALID_GIFTCARD_NUMBER_DIGIT", "VALID_GIFTCARD_PIN_DIGIT", "STATUS_CODE_BRUTEFORCE", "", "CAPTURE_VIEW_FAIL_DELAY", "J", "CARD_CAPTURE_LOAD_DELAY", "CARD_CAPTURE_ERROR_LIMIT", "SAVED_GIFT_CARD_DELAY", "MERCHANT_ID", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[GiftCardNumberStatus.values().length];
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[6] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[GiftCardPayAmountStatus.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[6] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public DigitalPayForOrderPresenter(ApiService apiService, CheckoutInteractor checkoutInteractor, Gson gson, PaymentServicesInteractor paymentServicesInteractor, CollectionModeInteractor collectionModeInteractor, DeviceFingerprintInteractor deviceFingerprintInteractor, SchedulersProvider schedulersProvider, ShopAppTokenAuthenticator authenticator, NetworkExceptions networkExceptions, AnalyticsManager analyticsManager, PayClient payClient, CollectDeviceData collectDeviceData, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(apiService, "apiService");
        Intrinsics.h(checkoutInteractor, "checkoutInteractor");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(paymentServicesInteractor, "paymentServicesInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(deviceFingerprintInteractor, "deviceFingerprintInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(authenticator, "authenticator");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(payClient, "payClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.c = apiService;
        this.d = checkoutInteractor;
        this.e = gson;
        this.f = paymentServicesInteractor;
        this.g = collectionModeInteractor;
        this.h = deviceFingerprintInteractor;
        this.i = schedulersProvider;
        this.j = authenticator;
        this.k = networkExceptions;
        this.l = analyticsManager;
        this.m = payClient;
        this.n = collectDeviceData;
        this.o = featureToggleManager;
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.w = new ArrayList();
        this.D = new HashMap();
        this.F = true;
        this.R = new CompositeDisposable();
        this.S = new CompositeDisposable();
        this.U = true;
        this.W = new HashMap();
        this.X = new String[0];
        this.Y = true;
        if (featureToggleManager.c(CheckoutFeature.f) && featureToggleManager.c(CheckoutFeature.g)) {
            deviceFingerprintInteractor.a();
        }
    }

    public static String C(String expiryMonth, String expiryYear) {
        Intrinsics.h(expiryMonth, "expiryMonth");
        Intrinsics.h(expiryYear, "expiryYear");
        return (StringsKt.D(expiryMonth) || StringsKt.D(expiryYear)) ? "" : String.format("Exp %s/%s", Arrays.copyOf(new Object[]{expiryMonth, expiryYear}, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter r20, java.util.List r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.j(au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter, java.util.List, java.lang.String):void");
    }

    public static final void k(DigitalPayForOrderPresenter digitalPayForOrderPresenter, OrderSummary orderSummary) {
        digitalPayForOrderPresenter.y = null;
        digitalPayForOrderPresenter.D.clear();
        digitalPayForOrderPresenter.z = null;
        Object obj = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).y();
        Object obj2 = digitalPayForOrderPresenter.f4374a;
        Intrinsics.e(obj2);
        ((DigitalPayForOrderContract.View) obj2).Z3(orderSummary.getOrderId());
    }

    public static final void l(DigitalPayForOrderPresenter digitalPayForOrderPresenter) {
        PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider = digitalPayForOrderPresenter.T;
        Intrinsics.e(globalErrorLabelProvider);
        String strA = globalErrorLabelProvider.a(15);
        Intrinsics.g(strA, "getErrorLabel(...)");
        digitalPayForOrderPresenter.N = false;
        digitalPayForOrderPresenter.I(new PaymentFailureError(strA));
    }

    public static PaymentBreakdownState v(PaymentState paymentState, boolean z, int i, String str) {
        float total;
        float totalRemaining;
        if (paymentState != null) {
            total = paymentState.getTotal();
            totalRemaining = paymentState.getTotalRemaining();
        } else {
            total = BitmapDescriptorFactory.HUE_RED;
            totalRemaining = 0.0f;
        }
        return new PaymentBreakdownState(total == totalRemaining ? R.string.checkout_total_label : R.string.checkout_still_to_pay_label, i, FloatExtKt.a(totalRemaining), str, z);
    }

    public final void A(String str) {
        if (this.N) {
            return;
        }
        if (i() && !this.N) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).u();
        }
        SingleOnErrorReturn singleOnErrorReturnC = this.f.c();
        SchedulersProvider schedulersProvider = this.i;
        SingleObserveOn singleObserveOnF = singleOnErrorReturnC.h(schedulersProvider.d()).f(schedulersProvider.b());
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new f(new androidx.lifecycle.f(6, this, str), 4), Functions.e);
        singleObserveOnF.a(consumerSingleObserver);
        this.b.d(consumerSingleObserver);
    }

    public final void A0() {
        if (i() && this.c0 == null) {
            if (!this.f.k()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).d0();
                return;
            }
            if (m() && n()) {
                ArrayList arrayList = this.w;
                if (arrayList == null || arrayList.isEmpty()) {
                    Object obj2 = this.f4374a;
                    Intrinsics.e(obj2);
                    ((DigitalPayForOrderContract.View) obj2).T1();
                } else {
                    Object obj3 = this.f4374a;
                    Intrinsics.e(obj3);
                    String payPalId = ((PayPalInstrument) arrayList.get(0)).getPayPalId();
                    Intrinsics.g(payPalId, "getPayPalId(...)");
                    ((DigitalPayForOrderContract.View) obj3).H3(payPalId);
                }
            }
        }
    }

    public final void B() {
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).u();
        }
        this.d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(au.com.woolworths.checkout.models.PaymentState r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L27
            r1.M = r2
            r1.o0()
            java.util.List r0 = r2.getErrors()
            if (r0 == 0) goto L27
            java.util.List r0 = r2.getErrors()
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.List r2 = r2.getErrors()
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            au.com.woolworths.foundation.shop.model.checkout.CheckoutError r2 = (au.com.woolworths.foundation.shop.model.checkout.CheckoutError) r2
            java.lang.String r2 = r2.getMessage()
            goto L28
        L27:
            r2 = 0
        L28:
            boolean r0 = r1.i()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.f4374a
            kotlin.jvm.internal.Intrinsics.e(r0)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r0 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r0
            r0.y()
            if (r2 == 0) goto L4b
            boolean r0 = kotlin.text.StringsKt.D(r2)
            if (r0 == 0) goto L41
            goto L4b
        L41:
            java.lang.Object r0 = r1.f4374a
            kotlin.jvm.internal.Intrinsics.e(r0)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r0 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r0
            r0.D1(r2)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.B0(au.com.woolworths.checkout.models.PaymentState):void");
    }

    public final void C0() {
        if (i()) {
            String str = this.y;
            if (str != null && !StringsKt.D(str) && this.f.e() && O()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).g1();
            }
            D0();
            v0();
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).f2(D());
            z0();
        }
    }

    public final String D() {
        BigDecimal bigDecimalE = E();
        BigDecimal ZERO = BigDecimal.ZERO;
        if (bigDecimalE.compareTo(ZERO) < 0) {
            Intrinsics.g(ZERO, "ZERO");
        } else {
            ZERO = E();
        }
        String strB = ProductInfoFormatter.b(ZERO);
        Intrinsics.g(strB, "getPrice(...)");
        return strB;
    }

    public final void D0() {
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj;
            String str = this.z;
            view.v0(D(), !(str == null || StringsKt.D(str)), this.A);
            v0();
        }
    }

    public final BigDecimal E() {
        PaymentState paymentState = this.M;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(paymentState != null ? paymentState.getTotalRemaining() : BitmapDescriptorFactory.HUE_RED));
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        if (this.M != null) {
            if (Q()) {
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    SavedGiftCardData savedGiftCardData = (SavedGiftCardData) it.next();
                    if (savedGiftCardData.isSelectedForPayment() && savedGiftCardData.getPaymentAmount() != null) {
                        bigDecimalAdd = bigDecimalAdd.add(savedGiftCardData.getPaymentAmount());
                    }
                }
            }
            if (K()) {
                Iterator it2 = this.u.iterator();
                while (it2.hasNext()) {
                    NewGiftCardData newGiftCardData = (NewGiftCardData) it2.next();
                    if (newGiftCardData.getPaymentAmount() != null) {
                        bigDecimalAdd = bigDecimalAdd.add(newGiftCardData.getPaymentAmount());
                    }
                }
            }
            NewGiftCardData newGiftCardData2 = this.v;
            if (newGiftCardData2 != null && newGiftCardData2.getPaymentAmount() != null) {
                NewGiftCardData newGiftCardData3 = this.v;
                Intrinsics.e(newGiftCardData3);
                bigDecimalAdd = bigDecimalAdd.add(newGiftCardData3.getPaymentAmount());
            }
        }
        Intrinsics.e(bigDecimalAdd);
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimalAdd);
        Intrinsics.g(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public final void F(List list) {
        String str;
        if (list == null) {
            if (!"NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
                this.y = null;
            }
            this.z = null;
            l0();
            o0();
            if (i()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).y();
                return;
            }
            return;
        }
        final ArrayList arrayListB = CollectionsKt.B(list);
        ArrayList arrayList = this.q;
        arrayList.clear();
        ArrayList arrayList2 = this.p;
        arrayList2.clear();
        ArrayList arrayList3 = this.r;
        Intrinsics.e(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = this.w;
        Intrinsics.e(arrayList4);
        arrayList4.clear();
        this.J = 0;
        HashMap map = this.W;
        map.clear();
        ArrayList arrayList5 = this.t;
        if (arrayList5 != null && arrayList5.size() > 0) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                SavedGiftCardData savedGiftCardData = (SavedGiftCardData) it.next();
                map.put(savedGiftCardData.getPaymentInstrumentId(), savedGiftCardData);
            }
        }
        arrayList5.clear();
        this.s.clear();
        String str2 = this.y;
        boolean z = true;
        boolean z2 = str2 == null || StringsKt.D(str2);
        boolean z3 = this.c0 != null || (str = this.z) == null || StringsKt.D(str);
        Iterator it2 = arrayListB.iterator();
        while (it2.hasNext()) {
            PaymentInstrument paymentInstrument = (PaymentInstrument) it2.next();
            if (paymentInstrument instanceof CreditCardInstrument) {
                CreditCardInstrument creditCardInstrument = (CreditCardInstrument) paymentInstrument;
                String scheme = creditCardInstrument.getScheme();
                Intrinsics.g(scheme, "getScheme(...)");
                if (this.f.i(scheme) && creditCardInstrument.isAllowed()) {
                    if (creditCardInstrument.isExpired()) {
                        arrayList2.add(creditCardInstrument);
                    } else {
                        arrayList.add(creditCardInstrument);
                    }
                    if (!z2 && Intrinsics.c(creditCardInstrument.getInstrumentId(), this.y)) {
                        z2 = true;
                    }
                }
            } else if (paymentInstrument instanceof GiftCardInstrument) {
                if (((GiftCardInstrument) paymentInstrument).isAllowed()) {
                    arrayList3.add(paymentInstrument);
                }
            } else if (paymentInstrument instanceof PayPalInstrument) {
                PayPalInstrument payPalInstrument = (PayPalInstrument) paymentInstrument;
                if (payPalInstrument.isAllowed()) {
                    arrayList4.add(payPalInstrument);
                    if (!z3 && Intrinsics.c(payPalInstrument.getInstrumentId(), this.z)) {
                        z3 = true;
                    }
                }
            }
        }
        if (this.B != null) {
            Iterator it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    PayPalInstrument payPalInstrument2 = this.B;
                    Intrinsics.e(payPalInstrument2);
                    arrayList4.add(payPalInstrument2);
                    if (!z3) {
                        PayPalInstrument payPalInstrument3 = this.B;
                        Intrinsics.e(payPalInstrument3);
                        if (!Intrinsics.c(payPalInstrument3.getInstrumentId(), this.z)) {
                            break;
                        }
                    }
                } else {
                    String instrumentId = ((PayPalInstrument) it3.next()).getInstrumentId();
                    PayPalInstrument payPalInstrument4 = this.B;
                    Intrinsics.e(payPalInstrument4);
                    if (Intrinsics.c(instrumentId, payPalInstrument4.getInstrumentId())) {
                        break;
                    }
                }
            }
            z = z3;
            this.B = null;
            z3 = z;
        }
        if (!z2 && !"NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
            this.y = null;
        }
        if (this.c0 == null && !z3) {
            this.z = null;
        }
        if (arrayList3.isEmpty()) {
            y(arrayListB, null);
            l0();
            o0();
            if (i()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).y();
                return;
            }
            return;
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        if (i() && !this.N) {
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).u();
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((GiftCardInstrument) it4.next()).getInstrumentId());
        }
        final SchedulersProvider schedulersProvider = this.i;
        final ShopAppTokenAuthenticator shopAppTokenAuthenticator = this.j;
        BasePayResultCallback<List<? extends GiftCardBalanceInstrumentsResult>> basePayResultCallback = new BasePayResultCallback<List<? extends GiftCardBalanceInstrumentsResult>>(schedulersProvider, shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$fetchGiftCardBalances$1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj4) {
                List giftCardBalanceInstrumentsResults = (List) obj4;
                Intrinsics.h(giftCardBalanceInstrumentsResults, "giftCardBalanceInstrumentsResults");
                ArrayList arrayList7 = arrayListB;
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.h;
                DigitalPayForOrderPresenter.j(digitalPayForOrderPresenter, giftCardBalanceInstrumentsResults, digitalPayForOrderPresenter.y(arrayList7, giftCardBalanceInstrumentsResults));
                digitalPayForOrderPresenter.l0();
                digitalPayForOrderPresenter.o0();
                if (!digitalPayForOrderPresenter.i() || digitalPayForOrderPresenter.N) {
                    return;
                }
                Object obj5 = digitalPayForOrderPresenter.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).y();
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                Intrinsics.h(payError, "payError");
                Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.h;
                digitalPayForOrderPresenter.y(arrayListB, null);
                DigitalPayForOrderPresenter.j(digitalPayForOrderPresenter, null, null);
                digitalPayForOrderPresenter.l0();
                digitalPayForOrderPresenter.o0();
                if (digitalPayForOrderPresenter.i()) {
                    Object obj4 = digitalPayForOrderPresenter.f4374a;
                    Intrinsics.e(obj4);
                    ((DigitalPayForOrderContract.View) obj4).y();
                }
            }
        };
        PayClient payClient = this.m;
        payClient.getClass();
        Object[] array = arrayList6.toArray();
        new GiftCardBalanceService(payClient.b, payClient.c, payClient.e, (String[]) Arrays.copyOf(array, array.length, String[].class)).a(basePayResultCallback);
    }

    public final void G() {
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).y();
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).t1();
            v0();
        }
    }

    public final void H(GiftCardNumberStatus giftCardNumberStatus, GiftCardPinStatus giftCardPinStatus) {
        Object obj = this.f4374a;
        if (obj == null) {
            return;
        }
        GiftCardPinStatus giftCardPinStatus2 = GiftCardPinStatus.j;
        UIStatus uIStatus = UIStatus.e;
        GiftCardNumberStatus giftCardNumberStatus2 = GiftCardNumberStatus.l;
        if (giftCardNumberStatus != giftCardNumberStatus2 || giftCardPinStatus != giftCardPinStatus2) {
            ((DigitalPayForOrderContract.View) obj).S1();
            if (P()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).h1(false, Q());
            } else {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).K0();
            }
            Object obj4 = this.f4374a;
            Intrinsics.e(obj4);
            ((DigitalPayForOrderContract.View) obj4).C0(uIStatus);
            Object obj5 = this.f4374a;
            Intrinsics.e(obj5);
            ((DigitalPayForOrderContract.View) obj5).U3(uIStatus);
            Object obj6 = this.f4374a;
            Intrinsics.e(obj6);
            ((DigitalPayForOrderContract.View) obj6).O(uIStatus);
            Object obj7 = this.f4374a;
            Intrinsics.e(obj7);
            ((DigitalPayForOrderContract.View) obj7).z4();
            Object obj8 = this.f4374a;
            Intrinsics.e(obj8);
            ((DigitalPayForOrderContract.View) obj8).L1();
        }
        UIStatus uIStatus2 = UIStatus.d;
        GiftCardPinStatus giftCardPinStatus3 = GiftCardPinStatus.h;
        if (giftCardPinStatus == giftCardPinStatus3) {
            Object obj9 = this.f4374a;
            Intrinsics.e(obj9);
            ((DigitalPayForOrderContract.View) obj9).g3(uIStatus2);
            Object obj10 = this.f4374a;
            Intrinsics.e(obj10);
            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj10;
            Object obj11 = this.f4374a;
            Intrinsics.e(obj11);
            view.e2(((DigitalPayForOrderContract.View) obj11).y1(), Q() || K());
        } else {
            Object obj12 = this.f4374a;
            Intrinsics.e(obj12);
            ((DigitalPayForOrderContract.View) obj12).g3(uIStatus);
        }
        GiftCardPinStatus giftCardPinStatus4 = GiftCardPinStatus.f;
        GiftCardNumberStatus giftCardNumberStatus3 = GiftCardNumberStatus.j;
        if ((giftCardNumberStatus != giftCardNumberStatus2 && giftCardNumberStatus != giftCardNumberStatus3) || (giftCardPinStatus != giftCardPinStatus2 && giftCardPinStatus != giftCardPinStatus4)) {
            this.v = null;
        }
        switch (giftCardNumberStatus.ordinal()) {
            case 2:
                Object obj13 = this.f4374a;
                Intrinsics.e(obj13);
                DigitalPayForOrderContract.View view2 = (DigitalPayForOrderContract.View) obj13;
                Object obj14 = this.f4374a;
                Intrinsics.e(obj14);
                view2.e2(((DigitalPayForOrderContract.View) obj14).y1(), Q() || K());
                Object obj15 = this.f4374a;
                Intrinsics.e(obj15);
                ((DigitalPayForOrderContract.View) obj15).O2(uIStatus2);
                break;
            case 3:
                Object obj16 = this.f4374a;
                Intrinsics.e(obj16);
                DigitalPayForOrderContract.View view3 = (DigitalPayForOrderContract.View) obj16;
                Object obj17 = this.f4374a;
                Intrinsics.e(obj17);
                view3.e2(((DigitalPayForOrderContract.View) obj17).Y2(), Q() || K());
                Object obj18 = this.f4374a;
                Intrinsics.e(obj18);
                ((DigitalPayForOrderContract.View) obj18).O2(uIStatus2);
                break;
            case 4:
                Object obj19 = this.f4374a;
                Intrinsics.e(obj19);
                DigitalPayForOrderContract.View view4 = (DigitalPayForOrderContract.View) obj19;
                Object obj20 = this.f4374a;
                Intrinsics.e(obj20);
                view4.e2(((DigitalPayForOrderContract.View) obj20).P0(), Q() || K());
                Object obj21 = this.f4374a;
                Intrinsics.e(obj21);
                ((DigitalPayForOrderContract.View) obj21).O2(uIStatus);
                Object obj22 = this.f4374a;
                Intrinsics.e(obj22);
                ((DigitalPayForOrderContract.View) obj22).g3(uIStatus);
                break;
            case 5:
                Object obj23 = this.f4374a;
                Intrinsics.e(obj23);
                DigitalPayForOrderContract.View view5 = (DigitalPayForOrderContract.View) obj23;
                Object obj24 = this.f4374a;
                Intrinsics.e(obj24);
                view5.e2(((DigitalPayForOrderContract.View) obj24).c3(), Q() || K());
                Object obj25 = this.f4374a;
                Intrinsics.e(obj25);
                ((DigitalPayForOrderContract.View) obj25).O2(uIStatus);
                Object obj26 = this.f4374a;
                Intrinsics.e(obj26);
                ((DigitalPayForOrderContract.View) obj26).g3(uIStatus);
                break;
            case 6:
                Object obj27 = this.f4374a;
                Intrinsics.e(obj27);
                DigitalPayForOrderContract.View view6 = (DigitalPayForOrderContract.View) obj27;
                Object obj28 = this.f4374a;
                Intrinsics.e(obj28);
                view6.u0(((DigitalPayForOrderContract.View) obj28).N0(), Q() || K());
                Object obj29 = this.f4374a;
                Intrinsics.e(obj29);
                ((DigitalPayForOrderContract.View) obj29).O2(uIStatus);
                Object obj30 = this.f4374a;
                Intrinsics.e(obj30);
                ((DigitalPayForOrderContract.View) obj30).b4();
                break;
            case 7:
                Object obj31 = this.f4374a;
                Intrinsics.e(obj31);
                DigitalPayForOrderContract.View view7 = (DigitalPayForOrderContract.View) obj31;
                Object obj32 = this.f4374a;
                Intrinsics.e(obj32);
                view7.e2(((DigitalPayForOrderContract.View) obj32).c1(), Q() || K());
                Object obj33 = this.f4374a;
                Intrinsics.e(obj33);
                ((DigitalPayForOrderContract.View) obj33).O2(uIStatus2);
                break;
            default:
                Object obj34 = this.f4374a;
                Intrinsics.e(obj34);
                ((DigitalPayForOrderContract.View) obj34).O2(uIStatus);
                break;
        }
        if (giftCardNumberStatus != GiftCardNumberStatus.f && giftCardNumberStatus != GiftCardNumberStatus.g && giftCardNumberStatus != GiftCardNumberStatus.k && giftCardNumberStatus != GiftCardNumberStatus.h && giftCardNumberStatus != GiftCardNumberStatus.i && giftCardNumberStatus != giftCardNumberStatus3 && giftCardPinStatus != giftCardPinStatus3 && giftCardPinStatus != GiftCardPinStatus.g && giftCardPinStatus != GiftCardPinStatus.i && giftCardPinStatus != giftCardPinStatus4) {
            Object obj35 = this.f4374a;
            Intrinsics.e(obj35);
            ((DigitalPayForOrderContract.View) obj35).a4();
        }
        if (giftCardNumberStatus == giftCardNumberStatus2 && giftCardPinStatus == giftCardPinStatus2) {
            NewGiftCardData newGiftCardData = this.v;
            if ((newGiftCardData != null ? newGiftCardData.getBalance() : null) != null) {
                Object obj36 = this.f4374a;
                Intrinsics.e(obj36);
                ((DigitalPayForOrderContract.View) obj36).b4();
            }
        }
    }

    public final void I(Throwable th) {
        Response response;
        ResponseBody responseBody;
        ArrayList arrayList;
        PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider;
        List errors;
        g0(w(), null);
        if (th != null) {
            Timber.f27013a.p(th);
            if (!r0(th)) {
                t();
                if (i() && (th instanceof PaymentFailureError)) {
                    PaymentFailureError paymentFailureError = (PaymentFailureError) th;
                    if (paymentFailureError.isTimeout()) {
                        Object obj = this.f4374a;
                        Intrinsics.e(obj);
                        ((DigitalPayForOrderContract.View) obj).y();
                        Object obj2 = this.f4374a;
                        Intrinsics.e(obj2);
                        ((DigitalPayForOrderContract.View) obj2).S2();
                    } else {
                        n0(paymentFailureError.getErrorMessage());
                    }
                } else {
                    try {
                        try {
                            this.k.getClass();
                        } catch (IOException e) {
                            Timber.f27013a.p(e);
                        }
                    } catch (JsonParseException e2) {
                        Timber.f27013a.p(e2);
                    }
                    if (!NetworkExceptions.c(th) || (response = ((HttpException) th).e) == null || (responseBody = response.c) == null) {
                        n0(null);
                    } else {
                        String strD = responseBody.d();
                        boolean z = strD.contains("termsAndConditionsText") || strD.contains("paymentMethods");
                        Gson gson = this.e;
                        if (z) {
                            try {
                            } catch (JsonParseException e3) {
                                Timber.b(e3);
                            }
                            PaymentState paymentState = (strD.contains("termsAndConditionsText") || strD.contains("paymentMethods")) ? (PaymentState) gson.d(PaymentState.class, strD) : null;
                            B0(paymentState);
                            n0(null);
                        } else {
                            PaymentErrors paymentErrorsA = Jsons.a(gson, strD);
                            if (PaymentErrorsKt.a(paymentErrorsA)) {
                                m0();
                            } else {
                                String strA = "";
                                if ((paymentErrorsA != null ? paymentErrorsA.getResponseStatus() : null) != null) {
                                    ResponseStatusWithErrorList responseStatus = paymentErrorsA.getResponseStatus();
                                    if (responseStatus == null || (errors = responseStatus.getErrors()) == null) {
                                        arrayList = null;
                                    } else {
                                        arrayList = new ArrayList();
                                        for (Object obj3 : errors) {
                                            ResponseError responseError = (ResponseError) obj3;
                                            if (PaymentErrorResponse.ERROR_REQUIRE_STEPUP_TOKEN.equals(responseError.getErrorCode()) && responseError.getStepUp() != null) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    }
                                    ResponseStatusWithErrorList responseStatus2 = paymentErrorsA.getResponseStatus();
                                    String message = responseStatus2 != null ? responseStatus2.getMessage() : null;
                                    if (message != null && !StringsKt.D(message)) {
                                        ResponseStatusWithErrorList responseStatus3 = paymentErrorsA.getResponseStatus();
                                        strA = responseStatus3 != null ? responseStatus3.getMessage() : null;
                                    }
                                    if (arrayList == null || arrayList.isEmpty() || !i()) {
                                        ResponseStatusWithErrorList responseStatus4 = paymentErrorsA.getResponseStatus();
                                        List errors2 = responseStatus4 != null ? responseStatus4.getErrors() : null;
                                        if (errors2 != null && !errors2.isEmpty()) {
                                            ResponseStatusWithErrorList responseStatus5 = paymentErrorsA.getResponseStatus();
                                            Intrinsics.e(responseStatus5);
                                            List errors3 = responseStatus5.getErrors();
                                            Intrinsics.e(errors3);
                                            Iterator it = errors3.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                String errorCode = ((ResponseError) it.next()).getErrorCode();
                                                if ("UN99".equalsIgnoreCase(errorCode) && (globalErrorLabelProvider = this.T) != null) {
                                                    strA = "UN99".equalsIgnoreCase(errorCode) ? globalErrorLabelProvider.a(14) : globalErrorLabelProvider.a(13);
                                                }
                                            }
                                        }
                                        n0(strA);
                                    } else {
                                        J(((ResponseError) arrayList.get(0)).getStepUp());
                                        n0(strA);
                                    }
                                } else {
                                    ResponseStatusWithErrorListForOkStatus responseStatusWithErrorListForOkStatus = (ResponseStatusWithErrorListForOkStatus) gson.d(ResponseStatusWithErrorListForOkStatus.class, strD);
                                    List listB = responseStatusWithErrorListForOkStatus != null ? responseStatusWithErrorListForOkStatus.b() : null;
                                    if (listB == null || listB.isEmpty()) {
                                        n0(null);
                                    } else {
                                        List listB2 = responseStatusWithErrorListForOkStatus.b();
                                        Intrinsics.g(listB2, "getPaymentResponses(...)");
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj4 : listB2) {
                                            ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse paymentInstrumentResponse = (ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse) obj4;
                                            if (PaymentErrorResponse.ERROR_REQUIRE_STEPUP_TOKEN.equals(paymentInstrumentResponse.a()) && paymentInstrumentResponse.g() != null) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        String strA2 = responseStatusWithErrorListForOkStatus.a();
                                        if (strA2 != null && !StringsKt.D(strA2)) {
                                            strA = responseStatusWithErrorListForOkStatus.a();
                                            Intrinsics.e(strA);
                                        }
                                        n0(strA);
                                        if (!arrayList2.isEmpty() && i()) {
                                            J(((ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse) arrayList2.get(0)).g());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.L = false;
        this.D.clear();
        this.N = false;
        f0();
    }

    public final void J(PaymentStepUp paymentStepUp) {
        String path;
        if (paymentStepUp == null || !paymentStepUp.b() || (path = paymentStepUp.a().getPath()) == null || StringsKt.D(path)) {
            return;
        }
        Object obj = this.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).y();
        v0();
        Object obj2 = this.f4374a;
        Intrinsics.e(obj2);
        URL urlA = paymentStepUp.a();
        Intrinsics.g(urlA, "getUrl(...)");
        ((DigitalPayForOrderContract.View) obj2).R3(urlA);
    }

    public final boolean K() {
        return !this.u.isEmpty();
    }

    public final boolean L() {
        return !this.p.isEmpty();
    }

    public final boolean M() {
        return !this.s.isEmpty();
    }

    public final boolean N(String instrumentId) {
        Intrinsics.h(instrumentId, "instrumentId");
        String[] strArr = this.X;
        if (strArr != null && strArr.length != 0) {
            Intrinsics.e(strArr);
            for (String str : strArr) {
                if (!StringsKt.D(instrumentId) && instrumentId.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return !this.q.isEmpty();
    }

    public final boolean P() {
        return Q() || M();
    }

    public final boolean Q() {
        return !this.t.isEmpty();
    }

    public final boolean R() {
        return O() || L();
    }

    public final void S() {
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).y();
        }
    }

    public final void T(final boolean z) {
        if (this.d0 == null) {
            this.O = null;
            if (i()) {
                if (z) {
                    Object obj = this.f4374a;
                    Intrinsics.e(obj);
                    ((DigitalPayForOrderContract.View) obj).u();
                }
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).B2(false);
                SingleCreate singleCreate = new SingleCreate(new f(this, 1));
                this.d0 = singleCreate;
                DisposableSingleObserver<CardCaptureView> disposableSingleObserver = new DisposableSingleObserver<CardCaptureView>() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$createInitialiseCardCaptureObserver$1
                    @Override // io.reactivex.SingleObserver
                    public final void onError(Throwable throwable) {
                        Intrinsics.h(throwable, "throwable");
                        Timber.f27013a.p(throwable);
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
                        if (digitalPayForOrderPresenter.i() && z) {
                            Object obj3 = digitalPayForOrderPresenter.f4374a;
                            Intrinsics.e(obj3);
                            ((DigitalPayForOrderContract.View) obj3).y();
                            Object obj4 = digitalPayForOrderPresenter.f4374a;
                            Intrinsics.e(obj4);
                            Object obj5 = digitalPayForOrderPresenter.f4374a;
                            Intrinsics.e(obj5);
                            ((DigitalPayForOrderContract.View) obj4).D1(((DigitalPayForOrderContract.View) obj5).M3());
                        }
                        digitalPayForOrderPresenter.d0 = null;
                    }

                    @Override // io.reactivex.SingleObserver
                    public final void onSuccess(Object obj3) {
                        CardCaptureView cardCaptureView = (CardCaptureView) obj3;
                        Intrinsics.h(cardCaptureView, "cardCaptureView");
                        final DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.e;
                        if (digitalPayForOrderPresenter.i()) {
                            try {
                                digitalPayForOrderPresenter.x = cardCaptureView;
                                digitalPayForOrderPresenter.U = true;
                                Object obj4 = digitalPayForOrderPresenter.f4374a;
                                Intrinsics.e(obj4);
                                ((DigitalPayForOrderContract.View) obj4).p0(digitalPayForOrderPresenter.x);
                                CardCaptureView cardCaptureView2 = digitalPayForOrderPresenter.x;
                                Intrinsics.e(cardCaptureView2);
                                cardCaptureView2.setCallback(new FormView.FormViewCallback() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$createInitialiseCardCaptureObserver$1$onSuccess$1
                                    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
                                    public static int g(FormFocusState formFocusState) {
                                        ?? H = h(formFocusState.f);
                                        int i = H;
                                        if (h(formFocusState.e)) {
                                            i = H + 1;
                                        }
                                        int i2 = i;
                                        if (h(formFocusState.d)) {
                                            i2 = i + 1;
                                        }
                                        return h(formFocusState.c) ? i2 + 1 : i2;
                                    }

                                    public static boolean h(Boolean bool) {
                                        return bool != null && bool.equals(Boolean.FALSE);
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void a(FormFocusState formFocusState) {
                                        FormFocusState formFocusState2;
                                        Boolean bool;
                                        Boolean bool2;
                                        Boolean bool3;
                                        Boolean bool4;
                                        Boolean bool5;
                                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        if (digitalPayForOrderPresenter2.i()) {
                                            if (!formFocusState.f9191a.booleanValue()) {
                                                Object obj5 = digitalPayForOrderPresenter2.f4374a;
                                                Intrinsics.e(obj5);
                                                if (((DigitalPayForOrderContract.View) obj5).U2()) {
                                                    if (g(formFocusState) >= 3) {
                                                        Object obj6 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj6);
                                                        Object obj7 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj7);
                                                        ((DigitalPayForOrderContract.View) obj6).g4(((DigitalPayForOrderContract.View) obj7).s0(), digitalPayForOrderPresenter2.O());
                                                    } else if (h(formFocusState.f) && h(formFocusState.e)) {
                                                        Object obj8 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj8);
                                                        Object obj9 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj9);
                                                        ((DigitalPayForOrderContract.View) obj8).g4(((DigitalPayForOrderContract.View) obj9).T2(), digitalPayForOrderPresenter2.O());
                                                    } else if (g(formFocusState) == 2) {
                                                        Object obj10 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj10);
                                                        Object obj11 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj11);
                                                        ((DigitalPayForOrderContract.View) obj10).g4(((DigitalPayForOrderContract.View) obj11).s0(), digitalPayForOrderPresenter2.O());
                                                    } else if (h(formFocusState.c)) {
                                                        Boolean bool6 = formFocusState.g;
                                                        if (bool6 == null || !bool6.booleanValue()) {
                                                            Object obj12 = digitalPayForOrderPresenter2.f4374a;
                                                            Intrinsics.e(obj12);
                                                            Object obj13 = digitalPayForOrderPresenter2.f4374a;
                                                            Intrinsics.e(obj13);
                                                            ((DigitalPayForOrderContract.View) obj12).g4(((DigitalPayForOrderContract.View) obj13).Z1(), digitalPayForOrderPresenter2.O());
                                                        } else {
                                                            Object obj14 = digitalPayForOrderPresenter2.f4374a;
                                                            Intrinsics.e(obj14);
                                                            Object obj15 = digitalPayForOrderPresenter2.f4374a;
                                                            Intrinsics.e(obj15);
                                                            ((DigitalPayForOrderContract.View) obj14).g4(((DigitalPayForOrderContract.View) obj15).e1(), digitalPayForOrderPresenter2.O());
                                                        }
                                                    } else if (h(formFocusState.e)) {
                                                        Object obj16 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj16);
                                                        Object obj17 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj17);
                                                        ((DigitalPayForOrderContract.View) obj16).g4(((DigitalPayForOrderContract.View) obj17).q3(), digitalPayForOrderPresenter2.O());
                                                    } else if (h(formFocusState.f)) {
                                                        Object obj18 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj18);
                                                        Object obj19 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj19);
                                                        ((DigitalPayForOrderContract.View) obj18).g4(((DigitalPayForOrderContract.View) obj19).f4(), digitalPayForOrderPresenter2.O());
                                                    } else if (h(formFocusState.d)) {
                                                        Object obj20 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj20);
                                                        Object obj21 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj21);
                                                        ((DigitalPayForOrderContract.View) obj20).g4(((DigitalPayForOrderContract.View) obj21).y4(), digitalPayForOrderPresenter2.O());
                                                    } else {
                                                        Object obj22 = digitalPayForOrderPresenter2.f4374a;
                                                        Intrinsics.e(obj22);
                                                        ((DigitalPayForOrderContract.View) obj22).x2();
                                                    }
                                                    digitalPayForOrderPresenter2.O = formFocusState;
                                                }
                                            }
                                            Object obj23 = digitalPayForOrderPresenter2.f4374a;
                                            Intrinsics.e(obj23);
                                            boolean z2 = true;
                                            ((DigitalPayForOrderContract.View) obj23).B2(!formFocusState.b.booleanValue());
                                            if (!digitalPayForOrderPresenter2.o() || ((formFocusState2 = digitalPayForOrderPresenter2.O) != null && (((bool = formFocusState2.g) != null && !bool.booleanValue()) || (((bool2 = formFocusState2.c) != null && !bool2.booleanValue()) || (((bool3 = formFocusState2.e) != null && !bool3.booleanValue()) || (((bool4 = formFocusState2.f) != null && !bool4.booleanValue()) || ((bool5 = formFocusState2.d) != null && !bool5.booleanValue()))))))) {
                                                z2 = false;
                                            }
                                            Object obj24 = digitalPayForOrderPresenter2.f4374a;
                                            Intrinsics.e(obj24);
                                            ((DigitalPayForOrderContract.View) obj24).I4(DigitalPayForOrderPresenter.v(digitalPayForOrderPresenter2.M, z2, R.string.place_order, ""));
                                            Boolean allFieldsEmpty = formFocusState.b;
                                            Intrinsics.g(allFieldsEmpty, "allFieldsEmpty");
                                            digitalPayForOrderPresenter2.U = allFieldsEmpty.booleanValue();
                                        }
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void b() {
                                        final DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        digitalPayForOrderPresenter2.b0(new Runnable() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$createInitialiseCardCaptureObserver$1$onSuccess$1$onPageLoaded$1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DigitalPayForOrderPresenter digitalPayForOrderPresenter3 = digitalPayForOrderPresenter2;
                                                if (digitalPayForOrderPresenter3.i()) {
                                                    Object obj5 = digitalPayForOrderPresenter3.f4374a;
                                                    Intrinsics.e(obj5);
                                                    if (((DigitalPayForOrderContract.View) obj5).U0()) {
                                                        Object obj6 = digitalPayForOrderPresenter3.f4374a;
                                                        Intrinsics.e(obj6);
                                                        ((DigitalPayForOrderContract.View) obj6).Z();
                                                    }
                                                }
                                            }
                                        }, 1000L);
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void c(boolean z2, boolean z3) {
                                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        QueryFormStatusProvider queryFormStatusProvider = digitalPayForOrderPresenter2.K;
                                        if (queryFormStatusProvider != null) {
                                            queryFormStatusProvider.e(z3);
                                            digitalPayForOrderPresenter2.K = null;
                                            digitalPayForOrderPresenter2.U = z3;
                                            return;
                                        }
                                        if (digitalPayForOrderPresenter2.i()) {
                                            if (z2) {
                                                digitalPayForOrderPresenter2.y = "NEW_CREDIT_CARD_INSTRUMENT_ID";
                                                if (digitalPayForOrderPresenter2.O()) {
                                                    Object obj5 = digitalPayForOrderPresenter2.f4374a;
                                                    Intrinsics.e(obj5);
                                                    ((DigitalPayForOrderContract.View) obj5).g1();
                                                }
                                                Object obj6 = digitalPayForOrderPresenter2.f4374a;
                                                Intrinsics.e(obj6);
                                                ((DigitalPayForOrderContract.View) obj6).x2();
                                                digitalPayForOrderPresenter2.v0();
                                            } else {
                                                digitalPayForOrderPresenter2.y = null;
                                                digitalPayForOrderPresenter2.v0();
                                            }
                                            digitalPayForOrderPresenter2.z0();
                                        }
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void d(BaseError baseError) {
                                        Timber.f27013a.o(baseError.toString(), new Object[0]);
                                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        if (digitalPayForOrderPresenter2.i()) {
                                            Object obj5 = digitalPayForOrderPresenter2.f4374a;
                                            Intrinsics.e(obj5);
                                            ((DigitalPayForOrderContract.View) obj5).y();
                                            if (baseError.getPayErrorCode() == PayErrorCode.NETWORK_ERROR || baseError.getPayErrorCode() == PayErrorCode.TIMEOUT_ERROR || DigitalPayUtils.b(baseError)) {
                                                digitalPayForOrderPresenter2.x = null;
                                                digitalPayForOrderPresenter2.O = null;
                                                digitalPayForOrderPresenter2.U = true;
                                                Object obj6 = digitalPayForOrderPresenter2.f4374a;
                                                Intrinsics.e(obj6);
                                                if (((DigitalPayForOrderContract.View) obj6).U2()) {
                                                    Object obj7 = digitalPayForOrderPresenter2.f4374a;
                                                    Intrinsics.e(obj7);
                                                    Object obj8 = digitalPayForOrderPresenter2.f4374a;
                                                    Intrinsics.e(obj8);
                                                    ((DigitalPayForOrderContract.View) obj7).t2(((DigitalPayForOrderContract.View) obj8).M3(), digitalPayForOrderPresenter2.R());
                                                }
                                            } else if (PayErrorCode.FORM_ERROR == baseError.getPayErrorCode() && "The session has expired.".equals(baseError.getErrorMessage())) {
                                                Object obj9 = digitalPayForOrderPresenter2.f4374a;
                                                Intrinsics.e(obj9);
                                                Object obj10 = digitalPayForOrderPresenter2.f4374a;
                                                Intrinsics.e(obj10);
                                                ((DigitalPayForOrderContract.View) obj9).g4(((DigitalPayForOrderContract.View) obj10).i3(), digitalPayForOrderPresenter2.O());
                                                if (digitalPayForOrderPresenter2.N) {
                                                    digitalPayForOrderPresenter2.N = false;
                                                }
                                                digitalPayForOrderPresenter2.T(true);
                                            } else {
                                                String errorMessage = baseError.getErrorMessage();
                                                if (errorMessage == null || StringsKt.D(errorMessage)) {
                                                    Object obj11 = digitalPayForOrderPresenter2.f4374a;
                                                    Intrinsics.e(obj11);
                                                    ((DigitalPayForOrderContract.View) obj11).x2();
                                                } else {
                                                    Object obj12 = digitalPayForOrderPresenter2.f4374a;
                                                    Intrinsics.e(obj12);
                                                    String errorMessage2 = baseError.getErrorMessage();
                                                    Intrinsics.e(errorMessage2);
                                                    ((DigitalPayForOrderContract.View) obj12).g4(errorMessage2, digitalPayForOrderPresenter2.O());
                                                }
                                            }
                                        } else if (baseError.getPayErrorCode() == PayErrorCode.NETWORK_ERROR || baseError.getPayErrorCode() == PayErrorCode.TIMEOUT_ERROR || DigitalPayUtils.b(baseError) || ((PayErrorCode.FORM_ERROR == baseError.getPayErrorCode() && "The session has expired.".equals(baseError.getErrorMessage())) || digitalPayForOrderPresenter2.N)) {
                                            digitalPayForOrderPresenter2.x = null;
                                            digitalPayForOrderPresenter2.O = null;
                                            digitalPayForOrderPresenter2.U = true;
                                            digitalPayForOrderPresenter2.V = true;
                                        }
                                        digitalPayForOrderPresenter2.V = true;
                                        if (digitalPayForOrderPresenter2.N) {
                                            DigitalPayForOrderPresenter.l(digitalPayForOrderPresenter2);
                                        }
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void e(String auditId, String paymentInstrumentId, String stepUpToken) throws JSONException {
                                        Intrinsics.h(auditId, "auditId");
                                        Intrinsics.h(paymentInstrumentId, "paymentInstrumentId");
                                        Intrinsics.h(stepUpToken, "stepUpToken");
                                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        digitalPayForOrderPresenter2.O = null;
                                        digitalPayForOrderPresenter2.y = paymentInstrumentId;
                                        digitalPayForOrderPresenter2.D.put(paymentInstrumentId, stepUpToken);
                                        digitalPayForOrderPresenter2.q0();
                                        digitalPayForOrderPresenter2.V = true;
                                    }

                                    @Override // au.com.woolworths.pay.sdk.web.FormView.FormViewCallback
                                    public final void f(String fieldName, Boolean bool) {
                                        boolean zBooleanValue = bool.booleanValue();
                                        Intrinsics.h(fieldName, "fieldName");
                                        DigitalPayForOrderPresenter digitalPayForOrderPresenter2 = digitalPayForOrderPresenter;
                                        if (!zBooleanValue) {
                                            digitalPayForOrderPresenter2.y = null;
                                            return;
                                        }
                                        digitalPayForOrderPresenter2.y = "NEW_CREDIT_CARD_INSTRUMENT_ID";
                                        if (digitalPayForOrderPresenter2.O()) {
                                            Object obj5 = digitalPayForOrderPresenter2.f4374a;
                                            Intrinsics.e(obj5);
                                            ((DigitalPayForOrderContract.View) obj5).g1();
                                        }
                                        Object obj6 = digitalPayForOrderPresenter2.f4374a;
                                        Intrinsics.e(obj6);
                                        ((DigitalPayForOrderContract.View) obj6).x2();
                                        if (digitalPayForOrderPresenter2.i()) {
                                            Object obj7 = digitalPayForOrderPresenter2.f4374a;
                                            Intrinsics.e(obj7);
                                            ((DigitalPayForOrderContract.View) obj7).Q3();
                                        }
                                    }
                                });
                                if (z) {
                                    Object obj5 = digitalPayForOrderPresenter.f4374a;
                                    Intrinsics.e(obj5);
                                    ((DigitalPayForOrderContract.View) obj5).y();
                                    digitalPayForOrderPresenter.k0(true);
                                }
                            } catch (Exception e) {
                                Timber.f27013a.p(e);
                            }
                        }
                        digitalPayForOrderPresenter.d0 = null;
                    }
                };
                singleCreate.a(disposableSingleObserver);
                this.b.d(disposableSingleObserver);
            }
        }
    }

    public final boolean U(int i) {
        String str;
        if (!O() || i < 0) {
            return false;
        }
        ArrayList arrayList = this.q;
        if (i >= arrayList.size() || (str = this.y) == null || StringsKt.D(str)) {
            return false;
        }
        return Intrinsics.c(this.y, ((CreditCardInstrument) arrayList.get(i)).getInstrumentId());
    }

    public final boolean V(String str) {
        CharSequence charSequence;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            CreditCardInstrument creditCardInstrument = (CreditCardInstrument) it.next();
            if (Intrinsics.c(creditCardInstrument.getInstrumentId(), str)) {
                if (!creditCardInstrument.isRequiresCVV()) {
                    return true;
                }
                HashMap map = this.D;
                return ((!map.containsKey(str) || (charSequence = (CharSequence) map.get(str)) == null || StringsKt.D(charSequence)) && this.e0 == null) ? false : true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4374a
            r1 = 0
            if (r0 != 0) goto L7
            goto L6a
        L7:
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r0 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r0
            java.lang.String r0 = r0.I0()
            java.lang.Object r2 = r5.f4374a
            kotlin.jvm.internal.Intrinsics.e(r2)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r2 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r2
            java.lang.String r2 = r2.U()
            boolean r3 = kotlin.text.StringsKt.D(r0)
            r4 = 1
            if (r3 != 0) goto L2a
            int r0 = r0.length()
            r3 = 19
            if (r0 >= r3) goto L28
            goto L2a
        L28:
            r0 = r1
            goto L2b
        L2a:
            r0 = r4
        L2b:
            boolean r3 = kotlin.text.StringsKt.D(r2)
            if (r3 != 0) goto L3b
            int r2 = r2.length()
            r3 = 4
            if (r2 >= r3) goto L39
            goto L3b
        L39:
            r2 = r1
            goto L3c
        L3b:
            r2 = r4
        L3c:
            java.lang.Object r3 = r5.f4374a
            kotlin.jvm.internal.Intrinsics.e(r3)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r3 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r3
            boolean r3 = r3.Z2()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r5.f4374a
            kotlin.jvm.internal.Intrinsics.e(r3)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r3 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r3
            java.lang.String r3 = r3.j2()
            boolean r3 = kotlin.text.StringsKt.D(r3)
            if (r3 == 0) goto L5c
            r3 = r4
            goto L5d
        L5c:
            r3 = r1
        L5d:
            if (r0 != 0) goto L63
            if (r2 != 0) goto L63
            if (r3 == 0) goto L6a
        L63:
            if (r0 == 0) goto L6b
            if (r2 == 0) goto L6b
            if (r3 != 0) goto L6a
            goto L6b
        L6a:
            return r1
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.W():boolean");
    }

    public final boolean X() {
        PaymentState paymentState = this.M;
        Intrinsics.e(paymentState);
        return paymentState.getTotalRemaining() <= BitmapDescriptorFactory.HUE_RED;
    }

    public final void Y() {
        if (this.F && this.f.l()) {
            if (P()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).h1(true, Q());
            } else {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).X(K());
            }
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).Y0();
        }
    }

    public final void Z() {
        if (this.Y) {
            x0(null);
            if (i()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).n4();
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).s1();
            }
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.mvp.BasePresenterImpl, au.com.woolworths.android.onesite.modules.mvp.BasePresenter
    public final void a() {
        super.a();
        this.d0 = null;
        this.I = null;
        this.R.e();
        this.S.e();
        this.M = null;
    }

    public final void a0() {
        DigitalPayPaymentData digitalPayPaymentData = new DigitalPayPaymentData();
        String str = this.y;
        String str2 = this.z;
        boolean z = (str2 == null || StringsKt.D(str2) || E().compareTo(BigDecimal.ZERO) <= 0) ? false : true;
        if (str != null && !StringsKt.D(str) && E().compareTo(BigDecimal.ZERO) > 0) {
            DigitalPayPaymentMethod digitalPayPaymentMethod = new DigitalPayPaymentMethod(str, E());
            String str3 = (String) this.D.get(str);
            if (str3 != null && !StringsKt.D(str3) && !"Valid".equals(str3)) {
                digitalPayPaymentMethod.d(str3);
            }
            digitalPayPaymentData.a().add(digitalPayPaymentMethod);
        } else if (z) {
            digitalPayPaymentData.a().add(new DigitalPayPaymentMethod(this.z, E()));
        }
        if (Q()) {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                SavedGiftCardData savedGiftCardData = (SavedGiftCardData) it.next();
                if (savedGiftCardData.isSelectedForPayment() && savedGiftCardData.isPaymentAmountValid()) {
                    digitalPayPaymentData.a().add(new DigitalPayPaymentMethod(savedGiftCardData.getPaymentInstrumentId(), savedGiftCardData.getPaymentAmount()));
                }
            }
        }
        if (K()) {
            Iterator it2 = this.u.iterator();
            while (it2.hasNext()) {
                NewGiftCardData newGiftCardData = (NewGiftCardData) it2.next();
                if (newGiftCardData.getPaymentAmount() != null) {
                    digitalPayPaymentData.a().add(new DigitalPayPaymentMethod(newGiftCardData.getPaymentInstrumentId(), newGiftCardData.getPaymentAmount()));
                }
            }
        }
        NewGiftCardData newGiftCardData2 = this.v;
        if (newGiftCardData2 != null && newGiftCardData2.isPaymentAmountValid()) {
            NewGiftCardData newGiftCardData3 = this.v;
            Intrinsics.e(newGiftCardData3);
            String paymentInstrumentId = newGiftCardData3.getPaymentInstrumentId();
            NewGiftCardData newGiftCardData4 = this.v;
            Intrinsics.e(newGiftCardData4);
            digitalPayPaymentData.a().add(new DigitalPayPaymentMethod(paymentInstrumentId, newGiftCardData4.getPaymentAmount()));
        }
        SingleFlatMap singleFlatMap = new SingleFlatMap(SinglesKt.a((this.o.c(CheckoutFeature.f) && z) ? new SingleFlatMap(this.f.a(), new f(new k(this, 0), 2)) : RxSingleKt.a(new DigitalPayForOrderPresenter$getDeviceDataSingle$2(2, null)), RxSingleKt.a(new DigitalPayForOrderPresenter$getDeviceFingerPrintIdSingle$1(this, null))), new f(new androidx.lifecycle.f(7, this, digitalPayPaymentData), 11));
        this.b0 = singleFlatMap;
        DigitalPayForOrderPresenter$createPayForOrderObserver$1 digitalPayForOrderPresenter$createPayForOrderObserver$1 = new DigitalPayForOrderPresenter$createPayForOrderObserver$1(this);
        singleFlatMap.a(digitalPayForOrderPresenter$createPayForOrderObserver$1);
        this.b.d(digitalPayForOrderPresenter$createPayForOrderObserver$1);
    }

    public final void b0(Runnable runnable, long j) {
        ObservableTimer observableTimerK = Observable.k(j, TimeUnit.MILLISECONDS);
        SchedulersProvider schedulersProvider = this.i;
        ObservableObserveOn observableObserveOnF = observableTimerK.i(schedulersProvider.c()).f(schedulersProvider.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new f(new n(runnable, 1), 10), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        this.S.d(lambdaObserver);
    }

    public final void c0(Throwable th) throws JSONException {
        Timber.f27013a.p(th);
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), th, "Retrieving PaymentState returned with error.", 24);
        try {
            this.k.getClass();
            if (NetworkExceptions.c(th)) {
                e0(th);
            } else {
                G();
            }
        } catch (JsonParseException e) {
            G();
            Timber.f27013a.p(e);
        } catch (IOException e2) {
            G();
            Timber.f27013a.p(e2);
        }
    }

    public final void d0(PaymentState paymentState) throws JSONException {
        if (paymentState == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Retrieving PaymentState returned successfully but with null value", null, 12);
            G();
            return;
        }
        this.M = paymentState;
        if (X()) {
            v0();
            this.Z = true;
            if (i()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).a0(false);
            }
            q0();
        } else {
            this.Z = false;
            if (i()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).a0(true);
            }
            z();
        }
        List<CheckoutError> errors = paymentState.getErrors();
        List<CheckoutError> list = errors;
        if (list == null || list.isEmpty()) {
            return;
        }
        Object obj3 = this.f4374a;
        Intrinsics.e(obj3);
        ((DigitalPayForOrderContract.View) obj3).k0(((CheckoutError) CollectionsKt.D(errors)).getMessage());
    }

    public final void e0(Throwable th) throws JSONException {
        HttpException httpException = (HttpException) th;
        PaymentState paymentState = null;
        if ((httpException != null ? httpException.e : null) == null) {
            G();
            return;
        }
        Response response = httpException.e;
        Intrinsics.e(response);
        ResponseBody responseBody = response.c;
        if (responseBody == null) {
            G();
            return;
        }
        String strD = responseBody.d();
        Gson gson = this.e;
        try {
            if (strD.contains("termsAndConditionsText") || strD.contains("paymentMethods")) {
                paymentState = (PaymentState) gson.d(PaymentState.class, strD);
            }
        } catch (JsonParseException e) {
            Timber.b(e);
        }
        if (paymentState == null) {
            G();
            return;
        }
        if (PaymentState.doesPaymentStateHaveInvalidWindowError(paymentState)) {
            m0();
            return;
        }
        if (PaymentState.isPaymentStateValid(paymentState)) {
            d0(paymentState);
            return;
        }
        List<CheckoutError> errors = paymentState.getErrors();
        Intrinsics.g(errors, "getErrors(...)");
        List<CheckoutError> list = errors;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CheckoutError) it.next()).getErrorCode() == 1030) {
                    S();
                    List<CheckoutError> errors2 = paymentState.getErrors();
                    Intrinsics.g(errors2, "getErrors(...)");
                    for (CheckoutError checkoutError : errors2) {
                        if (checkoutError.getErrorCode() == 1030) {
                            String message = checkoutError.getMessage();
                            Object obj = this.f4374a;
                            Intrinsics.e(obj);
                            ((DigitalPayForOrderContract.View) obj).k0(message);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        if (i()) {
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).y();
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).d2();
            v0();
        }
    }

    public final void f0() {
        if (i() && this.V) {
            this.V = false;
            T(false);
        }
    }

    public final void g0(PaymentFailureHelper paymentFailureHelper, List list) {
        paymentFailureHelper.c();
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse paymentInstrumentResponse = (ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse) it.next();
                if ("ES470".equals(paymentInstrumentResponse.a()) || "BI24".equals(paymentInstrumentResponse.a())) {
                    if (paymentInstrumentResponse.d() != null) {
                        hashSet.add(paymentInstrumentResponse.d());
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = this.q;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (hashSet.contains(((CreditCardInstrument) it2.next()).getInstrumentId())) {
                            it2.remove();
                        }
                    }
                }
                ArrayList arrayList2 = this.t;
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (hashSet.contains(((SavedGiftCardData) it3.next()).getPaymentInstrumentId())) {
                            it3.remove();
                        }
                    }
                }
                ArrayList arrayList3 = this.w;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        if (hashSet.contains(((PayPalInstrument) it4.next()).getInstrumentId())) {
                            it4.remove();
                            this.z = null;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse paymentInstrumentResponse2 = (ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse) it5.next();
                if (!Strings.a(paymentInstrumentResponse2.a())) {
                    String strE = paymentInstrumentResponse2.e();
                    strE.getClass();
                    switch (strE) {
                        case "PayPal":
                            hashSet2.add(paymentInstrumentResponse2.d());
                            break;
                        case "GiftCard":
                            if (paymentFailureHelper.d(paymentInstrumentResponse2.d())) {
                                hashSet2.add(paymentInstrumentResponse2.d());
                                break;
                            } else {
                                break;
                            }
                        case "CreditCard":
                            if (paymentFailureHelper.g != null) {
                                break;
                            } else {
                                String strD = paymentInstrumentResponse2.d();
                                List list2 = paymentFailureHelper.e;
                                if (strD == null || Strings.a(strD) || list2 == null || list2.size() == 0) {
                                    break;
                                } else {
                                    Iterator it6 = list2.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            break;
                                        } else if (strD.equals(((CreditCardInstrument) it6.next()).getInstrumentId())) {
                                            hashSet2.add(paymentInstrumentResponse2.d());
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            }
            x0((String[]) hashSet2.toArray(new String[0]));
        }
        for (final String str : paymentFailureHelper.c()) {
            PayClient payClient = paymentFailureHelper.l;
            final ShopAppTokenAuthenticator shopAppTokenAuthenticator = paymentFailureHelper.k;
            payClient.a(str, new BasePayEmptyResultCallback(shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.PaymentFailureHelper.1
                public final /* synthetic */ String h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(final ShopAppTokenAuthenticator shopAppTokenAuthenticator2, final String str2) {
                    super(null, shopAppTokenAuthenticator2);
                    str = str2;
                }

                @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                public final void d2() {
                    Timber.f27013a.o("[pay] successfully deleted instrument: %s", str);
                }

                @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
                public final void v(PayError payError) {
                    Timber.f27013a.o("[pay] failed to delete instrument: %s", str);
                }
            });
        }
        this.u.clear();
        this.v = null;
        if (this.L && this.y != null) {
            this.y = null;
            this.L = false;
        }
        if (i()) {
            this.Y = false;
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            if (((DigitalPayForOrderContract.View) obj).H1()) {
                this.P = null;
                this.Q = null;
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).U1(true);
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                UIStatus uIStatus = UIStatus.e;
                ((DigitalPayForOrderContract.View) obj3).C0(uIStatus);
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).O2(uIStatus);
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).g3(uIStatus);
                Object obj6 = this.f4374a;
                Intrinsics.e(obj6);
                ((DigitalPayForOrderContract.View) obj6).a4();
                Object obj7 = this.f4374a;
                Intrinsics.e(obj7);
                ((DigitalPayForOrderContract.View) obj7).z4();
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).L1();
            }
            t();
            Object obj9 = this.f4374a;
            Intrinsics.e(obj9);
            ((DigitalPayForOrderContract.View) obj9).B2(false);
            Object obj10 = this.f4374a;
            Intrinsics.e(obj10);
            ((DigitalPayForOrderContract.View) obj10).u4();
            Object obj11 = this.f4374a;
            Intrinsics.e(obj11);
            ((DigitalPayForOrderContract.View) obj11).d1();
            Object obj12 = this.f4374a;
            Intrinsics.e(obj12);
            ((DigitalPayForOrderContract.View) obj12).g1();
            if (!P()) {
                Object obj13 = this.f4374a;
                Intrinsics.e(obj13);
                ((DigitalPayForOrderContract.View) obj13).X(false);
            }
            A0();
            this.Y = true;
        }
        C0();
    }

    public final void h0(Runnable runnable) {
        ObservableObserveOn observableObserveOnF = Observable.k(200L, TimeUnit.MILLISECONDS).f(this.i.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new f(new n(runnable, 0), 5), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        this.R.d(lambdaObserver);
    }

    public final void i0(int i) {
        if (i >= 0 && L()) {
            ArrayList arrayList = this.p;
            if (i < arrayList.size()) {
                this.I = ((CreditCardInstrument) arrayList.get(i)).getInstrumentId();
                return;
            }
        }
        this.I = null;
    }

    public final void j0(int i, boolean z) {
        boolean z2 = !z && "NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y);
        if (!z && !z2) {
            if (DigitalPayUtils.c(this.O)) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj).g4(((DigitalPayForOrderContract.View) obj2).G(), O());
                return;
            }
            return;
        }
        if (this.F) {
            if (P()) {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).h1(true, Q());
            } else {
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).X(K());
            }
            Object obj5 = this.f4374a;
            Intrinsics.e(obj5);
            ((DigitalPayForOrderContract.View) obj5).Y0();
        }
        if (this.f.e()) {
            if (!z2) {
                t();
                Object obj6 = this.f4374a;
                Intrinsics.e(obj6);
                ((DigitalPayForOrderContract.View) obj6).I3();
            }
            if (R()) {
                Object obj7 = this.f4374a;
                Intrinsics.e(obj7);
                ((DigitalPayForOrderContract.View) obj7).v4();
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).D2(R(), O());
            } else {
                Object obj9 = this.f4374a;
                Intrinsics.e(obj9);
                ((DigitalPayForOrderContract.View) obj9).Y1();
                Object obj10 = this.f4374a;
                Intrinsics.e(obj10);
                ((DigitalPayForOrderContract.View) obj10).n0();
            }
        }
        ((SavedGiftCardData) this.t.get(i)).setSelectedForPayment(!((SavedGiftCardData) r5.get(i)).isSelectedForPayment());
        if (i()) {
            if (Q()) {
                Object obj11 = this.f4374a;
                Intrinsics.e(obj11);
                ((DigitalPayForOrderContract.View) obj11).d1();
                s();
            }
            C0();
        }
    }

    public final void k0(boolean z) {
        Object obj = this.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).n4();
        if (i()) {
            CardCaptureView cardCaptureView = this.x;
            PaymentServicesInteractor paymentServicesInteractor = this.f;
            if (cardCaptureView == null) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                if (((DigitalPayForOrderContract.View) obj2).U2()) {
                    Object obj3 = this.f4374a;
                    Intrinsics.e(obj3);
                    ((DigitalPayForOrderContract.View) obj3).I3();
                    return;
                }
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj4).t2(((DigitalPayForOrderContract.View) obj5).M3(), R());
                this.y = null;
                this.z = null;
                D0();
                if (P() && paymentServicesInteractor.e()) {
                    Object obj6 = this.f4374a;
                    Intrinsics.e(obj6);
                    ((DigitalPayForOrderContract.View) obj6).D2(false, O());
                    if (O()) {
                        Object obj7 = this.f4374a;
                        Intrinsics.e(obj7);
                        ((DigitalPayForOrderContract.View) obj7).g1();
                    }
                }
                Y();
                v0();
                return;
            }
            if (!this.E && !this.F) {
                if (paymentServicesInteractor.l()) {
                    if (W()) {
                        Object obj8 = this.f4374a;
                        Intrinsics.e(obj8);
                        DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj8;
                        Object obj9 = this.f4374a;
                        Intrinsics.e(obj9);
                        view.e2(((DigitalPayForOrderContract.View) obj9).G(), Q() || K());
                    }
                    y0();
                    return;
                }
                return;
            }
            this.y = null;
            this.z = null;
            D0();
            if (paymentServicesInteractor.e()) {
                if (O()) {
                    Object obj10 = this.f4374a;
                    Intrinsics.e(obj10);
                    ((DigitalPayForOrderContract.View) obj10).g1();
                } else {
                    Object obj11 = this.f4374a;
                    Intrinsics.e(obj11);
                    ((DigitalPayForOrderContract.View) obj11).j3();
                }
                if (R()) {
                    Object obj12 = this.f4374a;
                    Intrinsics.e(obj12);
                    ((DigitalPayForOrderContract.View) obj12).D2(false, O());
                } else {
                    Object obj13 = this.f4374a;
                    Intrinsics.e(obj13);
                    ((DigitalPayForOrderContract.View) obj13).Y1();
                    Object obj14 = this.f4374a;
                    Intrinsics.e(obj14);
                    ((DigitalPayForOrderContract.View) obj14).n0();
                }
            }
            Y();
            v0();
            Object obj15 = this.f4374a;
            Intrinsics.e(obj15);
            ((DigitalPayForOrderContract.View) obj15).e4(z, O(), L());
        }
    }

    public final void l0() {
        GiftCardPinStatus giftCardPinStatus;
        if (i()) {
            if (!this.f.l()) {
                this.H = 0;
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).E3();
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).a4();
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).K0();
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).b3();
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).r3();
                Object obj6 = this.f4374a;
                Intrinsics.e(obj6);
                ((DigitalPayForOrderContract.View) obj6).h0();
                Object obj7 = this.f4374a;
                Intrinsics.e(obj7);
                ((DigitalPayForOrderContract.View) obj7).Y0();
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).V();
                return;
            }
            if (!n() || !m()) {
                if (n()) {
                    return;
                }
                if (!P()) {
                    u0();
                    return;
                }
                w0();
                if (Q()) {
                    Object obj9 = this.f4374a;
                    Intrinsics.e(obj9);
                    ((DigitalPayForOrderContract.View) obj9).d1();
                    s();
                    return;
                }
                Object obj10 = this.f4374a;
                Intrinsics.e(obj10);
                ((DigitalPayForOrderContract.View) obj10).h0();
                Object obj11 = this.f4374a;
                Intrinsics.e(obj11);
                ((DigitalPayForOrderContract.View) obj11).r3();
                return;
            }
            if (!P()) {
                Object obj12 = this.f4374a;
                Intrinsics.e(obj12);
                ((DigitalPayForOrderContract.View) obj12).b3();
                Object obj13 = this.f4374a;
                Intrinsics.e(obj13);
                ((DigitalPayForOrderContract.View) obj13).h0();
                Object obj14 = this.f4374a;
                Intrinsics.e(obj14);
                ((DigitalPayForOrderContract.View) obj14).r3();
                Object obj15 = this.f4374a;
                Intrinsics.e(obj15);
                ((DigitalPayForOrderContract.View) obj15).K0();
                if (K()) {
                    Object obj16 = this.f4374a;
                    Intrinsics.e(obj16);
                    ((DigitalPayForOrderContract.View) obj16).u4();
                } else {
                    Object obj17 = this.f4374a;
                    Intrinsics.e(obj17);
                    ((DigitalPayForOrderContract.View) obj17).E3();
                }
                if (this.v == null && this.F) {
                    Object obj18 = this.f4374a;
                    Intrinsics.e(obj18);
                    ((DigitalPayForOrderContract.View) obj18).X(K());
                    return;
                }
                Object obj19 = this.f4374a;
                Intrinsics.e(obj19);
                ((DigitalPayForOrderContract.View) obj19).E();
                Object obj20 = this.f4374a;
                Intrinsics.e(obj20);
                Object obj21 = this.f4374a;
                Intrinsics.e(obj21);
                ((DigitalPayForOrderContract.View) obj20).e2(((DigitalPayForOrderContract.View) obj21).G(), true);
                y0();
                r();
                return;
            }
            Object obj22 = this.f4374a;
            Intrinsics.e(obj22);
            ((DigitalPayForOrderContract.View) obj22).V();
            w0();
            if (Q()) {
                Object obj23 = this.f4374a;
                Intrinsics.e(obj23);
                ((DigitalPayForOrderContract.View) obj23).d1();
                s();
            } else {
                Object obj24 = this.f4374a;
                Intrinsics.e(obj24);
                ((DigitalPayForOrderContract.View) obj24).r3();
                Object obj25 = this.f4374a;
                Intrinsics.e(obj25);
                ((DigitalPayForOrderContract.View) obj25).h0();
            }
            if (K()) {
                Object obj26 = this.f4374a;
                Intrinsics.e(obj26);
                ((DigitalPayForOrderContract.View) obj26).u4();
            } else {
                Object obj27 = this.f4374a;
                Intrinsics.e(obj27);
                ((DigitalPayForOrderContract.View) obj27).E3();
            }
            if (this.v == null && this.F) {
                Object obj28 = this.f4374a;
                Intrinsics.e(obj28);
                ((DigitalPayForOrderContract.View) obj28).Y0();
                Object obj29 = this.f4374a;
                Intrinsics.e(obj29);
                ((DigitalPayForOrderContract.View) obj29).h1(true, Q());
                return;
            }
            Object obj30 = this.f4374a;
            Intrinsics.e(obj30);
            ((DigitalPayForOrderContract.View) obj30).h1(this.E, Q());
            Object obj31 = this.f4374a;
            Intrinsics.e(obj31);
            ((DigitalPayForOrderContract.View) obj31).p4(Q(), M());
            y0();
            r();
            GiftCardNumberStatus giftCardNumberStatus = this.P;
            if (giftCardNumberStatus == null || !((giftCardNumberStatus == GiftCardNumberStatus.l || giftCardNumberStatus == GiftCardNumberStatus.j) && (giftCardPinStatus = this.Q) != null && (giftCardPinStatus == GiftCardPinStatus.j || giftCardPinStatus == GiftCardPinStatus.f))) {
                H(GiftCardNumberStatus.f, GiftCardPinStatus.h);
                return;
            }
            NewGiftCardData newGiftCardData = this.v;
            Intrinsics.e(newGiftCardData);
            if (newGiftCardData.getPaymentAmount() == null) {
                Object obj32 = this.f4374a;
                Intrinsics.e(obj32);
                DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj32;
                Object obj33 = this.f4374a;
                Intrinsics.e(obj33);
                view.e2(((DigitalPayForOrderContract.View) obj33).G(), Q() || K());
            }
        }
    }

    public final boolean m() {
        return this.G == 0;
    }

    public final void m0() {
        Object obj = this.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).y();
        this.d.a(this.g.R());
    }

    public final boolean n() {
        return this.H == 0;
    }

    public final void n0(String str) {
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).y();
            v0();
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj2;
            if (str == null || StringsKt.D(str)) {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                str = ((DigitalPayForOrderContract.View) obj3).Z0();
            }
            view.D1(str);
        }
    }

    public final boolean o() {
        String str;
        String str2;
        String str3;
        int iCompareTo = E().compareTo(BigDecimal.ZERO);
        return this.M != null && (m() && n()) && ((this.M != null && X()) || (iCompareTo == 0 && q() && ((str3 = this.y) == null || StringsKt.D(str3) || V(this.y))) || (q() && iCompareTo > 0 && (((str = this.y) != null && !StringsKt.D(str) && V(this.y)) || ((str2 = this.z) != null && !StringsKt.D(str2)))));
    }

    public final void o0() {
        String strL4;
        String strL42;
        if (i()) {
            PaymentServicesInteractor paymentServicesInteractor = this.f;
            boolean z = false;
            if (paymentServicesInteractor.e()) {
                boolean zM = m();
                ArrayList arrayList = this.p;
                if (zM && n()) {
                    if (this.x == null) {
                        T(false);
                    }
                    if (paymentServicesInteractor.f()) {
                        Object obj = this.f4374a;
                        Intrinsics.e(obj);
                        ((DigitalPayForOrderContract.View) obj).E0(paymentServicesInteractor.i("visa"));
                        Object obj2 = this.f4374a;
                        Intrinsics.e(obj2);
                        ((DigitalPayForOrderContract.View) obj2).M0(paymentServicesInteractor.i("mastercard"));
                        Object obj3 = this.f4374a;
                        Intrinsics.e(obj3);
                        ((DigitalPayForOrderContract.View) obj3).W(paymentServicesInteractor.i("diners"));
                        Object obj4 = this.f4374a;
                        Intrinsics.e(obj4);
                        ((DigitalPayForOrderContract.View) obj4).T3(paymentServicesInteractor.i("jcb"));
                        Object obj5 = this.f4374a;
                        Intrinsics.e(obj5);
                        ((DigitalPayForOrderContract.View) obj5).V1(paymentServicesInteractor.i("amex"));
                    } else {
                        Object obj6 = this.f4374a;
                        Intrinsics.e(obj6);
                        ((DigitalPayForOrderContract.View) obj6).E0(false);
                        Object obj7 = this.f4374a;
                        Intrinsics.e(obj7);
                        ((DigitalPayForOrderContract.View) obj7).M0(false);
                        Object obj8 = this.f4374a;
                        Intrinsics.e(obj8);
                        ((DigitalPayForOrderContract.View) obj8).W(false);
                        Object obj9 = this.f4374a;
                        Intrinsics.e(obj9);
                        ((DigitalPayForOrderContract.View) obj9).T3(false);
                        Object obj10 = this.f4374a;
                        Intrinsics.e(obj10);
                        ((DigitalPayForOrderContract.View) obj10).V1(false);
                    }
                    String str = this.y;
                    if (str == null || StringsKt.D(str) || !"NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
                        Object obj11 = this.f4374a;
                        Intrinsics.e(obj11);
                        ((DigitalPayForOrderContract.View) obj11).B2(false);
                    }
                    if (R()) {
                        if (L()) {
                            Object obj12 = this.f4374a;
                            Intrinsics.e(obj12);
                            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj12;
                            if (arrayList.size() == 1) {
                                Object obj13 = this.f4374a;
                                Intrinsics.e(obj13);
                                strL42 = ((DigitalPayForOrderContract.View) obj13).F1();
                            } else {
                                Object obj14 = this.f4374a;
                                Intrinsics.e(obj14);
                                strL42 = ((DigitalPayForOrderContract.View) obj14).l4();
                            }
                            view.M1(strL42);
                        } else {
                            Object obj15 = this.f4374a;
                            Intrinsics.e(obj15);
                            ((DigitalPayForOrderContract.View) obj15).r4();
                        }
                        if (O()) {
                            Object obj16 = this.f4374a;
                            Intrinsics.e(obj16);
                            ((DigitalPayForOrderContract.View) obj16).g1();
                        } else {
                            Object obj17 = this.f4374a;
                            Intrinsics.e(obj17);
                            ((DigitalPayForOrderContract.View) obj17).j3();
                        }
                        Object obj18 = this.f4374a;
                        Intrinsics.e(obj18);
                        ((DigitalPayForOrderContract.View) obj18).v4();
                        Object obj19 = this.f4374a;
                        Intrinsics.e(obj19);
                        DigitalPayForOrderContract.View view2 = (DigitalPayForOrderContract.View) obj19;
                        Object obj20 = this.f4374a;
                        Intrinsics.e(obj20);
                        if (!((DigitalPayForOrderContract.View) obj20).U2() && R()) {
                            z = true;
                        }
                        view2.D2(z, O());
                    } else {
                        Object obj21 = this.f4374a;
                        Intrinsics.e(obj21);
                        ((DigitalPayForOrderContract.View) obj21).r4();
                        Object obj22 = this.f4374a;
                        Intrinsics.e(obj22);
                        ((DigitalPayForOrderContract.View) obj22).j3();
                        Object obj23 = this.f4374a;
                        Intrinsics.e(obj23);
                        ((DigitalPayForOrderContract.View) obj23).Y1();
                        Object obj24 = this.f4374a;
                        Intrinsics.e(obj24);
                        ((DigitalPayForOrderContract.View) obj24).n0();
                    }
                } else if (!m()) {
                    if (R()) {
                        if (L()) {
                            Object obj25 = this.f4374a;
                            Intrinsics.e(obj25);
                            DigitalPayForOrderContract.View view3 = (DigitalPayForOrderContract.View) obj25;
                            if (arrayList.size() == 1) {
                                Object obj26 = this.f4374a;
                                Intrinsics.e(obj26);
                                strL4 = ((DigitalPayForOrderContract.View) obj26).F1();
                            } else {
                                Object obj27 = this.f4374a;
                                Intrinsics.e(obj27);
                                strL4 = ((DigitalPayForOrderContract.View) obj27).l4();
                            }
                            view3.M1(strL4);
                        } else {
                            Object obj28 = this.f4374a;
                            Intrinsics.e(obj28);
                            ((DigitalPayForOrderContract.View) obj28).r4();
                        }
                        if (O()) {
                            Object obj29 = this.f4374a;
                            Intrinsics.e(obj29);
                            ((DigitalPayForOrderContract.View) obj29).g1();
                        } else {
                            Object obj30 = this.f4374a;
                            Intrinsics.e(obj30);
                            ((DigitalPayForOrderContract.View) obj30).j3();
                        }
                    } else {
                        t0(false);
                    }
                }
            } else {
                this.G = 0;
                Object obj31 = this.f4374a;
                Intrinsics.e(obj31);
                ((DigitalPayForOrderContract.View) obj31).r4();
                Object obj32 = this.f4374a;
                Intrinsics.e(obj32);
                ((DigitalPayForOrderContract.View) obj32).j3();
                Object obj33 = this.f4374a;
                Intrinsics.e(obj33);
                ((DigitalPayForOrderContract.View) obj33).Y1();
                Object obj34 = this.f4374a;
                Intrinsics.e(obj34);
                ((DigitalPayForOrderContract.View) obj34).v4();
                Object obj35 = this.f4374a;
                Intrinsics.e(obj35);
                ((DigitalPayForOrderContract.View) obj35).x2();
                Object obj36 = this.f4374a;
                Intrinsics.e(obj36);
                ((DigitalPayForOrderContract.View) obj36).I3();
            }
        }
        if (i() && m() && n()) {
            Object obj37 = this.f4374a;
            Intrinsics.e(obj37);
            ((DigitalPayForOrderContract.View) obj37).L();
        }
        if (i() && this.c0 == null) {
            A0();
            this.B = null;
        }
        if (m() && n() && i() && this.M != null) {
            Object obj38 = this.f4374a;
            Intrinsics.e(obj38);
            ((DigitalPayForOrderContract.View) obj38).f2(D());
            D0();
            z0();
        }
    }

    public final void p(boolean z) {
        PaymentServicesInteractor paymentServicesInteractor = this.f;
        if (!z) {
            if ("NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
                if (paymentServicesInteractor.l()) {
                    Object obj = this.f4374a;
                    Intrinsics.e(obj);
                    ((DigitalPayForOrderContract.View) obj).p4(Q(), M());
                    return;
                }
                return;
            }
            if (DigitalPayUtils.c(this.O)) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj2).g4(((DigitalPayForOrderContract.View) obj3).G(), O());
                return;
            }
            return;
        }
        t();
        Object obj4 = this.f4374a;
        Intrinsics.e(obj4);
        ((DigitalPayForOrderContract.View) obj4).p4(Q() || K(), M());
        Object obj5 = this.f4374a;
        Intrinsics.e(obj5);
        ((DigitalPayForOrderContract.View) obj5).I3();
        if (P() && paymentServicesInteractor.l()) {
            Object obj6 = this.f4374a;
            Intrinsics.e(obj6);
            ((DigitalPayForOrderContract.View) obj6).h1(false, Q());
        } else {
            Object obj7 = this.f4374a;
            Intrinsics.e(obj7);
            ((DigitalPayForOrderContract.View) obj7).K0();
        }
        if (paymentServicesInteractor.e()) {
            if (R()) {
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).v4();
                Object obj9 = this.f4374a;
                Intrinsics.e(obj9);
                ((DigitalPayForOrderContract.View) obj9).D2(R(), O());
                return;
            }
            Object obj10 = this.f4374a;
            Intrinsics.e(obj10);
            ((DigitalPayForOrderContract.View) obj10).Y1();
            Object obj11 = this.f4374a;
            Intrinsics.e(obj11);
            ((DigitalPayForOrderContract.View) obj11).n0();
        }
    }

    public final void p0() {
        PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider = this.T;
        Intrinsics.e(globalErrorLabelProvider);
        String strA = globalErrorLabelProvider.a(1);
        Object obj = this.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).y();
        Object obj2 = this.f4374a;
        Intrinsics.e(obj2);
        Intrinsics.e(strA);
        ((DigitalPayForOrderContract.View) obj2).D1(strA);
    }

    public final boolean q() {
        NewGiftCardData newGiftCardData;
        boolean z = this.F || ((newGiftCardData = this.v) != null && newGiftCardData.isPaymentAmountValid());
        if (Q()) {
            Iterator it = this.t.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SavedGiftCardData savedGiftCardData = (SavedGiftCardData) it.next();
                if (savedGiftCardData.isSelectedForPayment() && !savedGiftCardData.isPaymentAmountValid()) {
                    z = false;
                    break;
                }
            }
        }
        if (K()) {
            Iterator it2 = this.u.iterator();
            while (it2.hasNext()) {
                if (!((NewGiftCardData) it2.next()).isPaymentAmountValid()) {
                    return false;
                }
            }
        }
        return z;
    }

    public final void q0() throws JSONException {
        String paymentInstrumentId;
        if (!o()) {
            if (this.N) {
                this.N = false;
                if (i()) {
                    Object obj = this.f4374a;
                    Intrinsics.e(obj);
                    ((DigitalPayForOrderContract.View) obj).y();
                }
            }
            f0();
            return;
        }
        this.N = true;
        Z();
        if (X()) {
            if (i()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).u();
            }
            SingleCache singleCache = new SingleCache(this.c.a());
            this.a0 = singleCache;
            DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1 digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1 = new DigitalPayForOrderPresenter$createZeroBalancePaymentObserver$1(this);
            singleCache.a(digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1);
            this.b.d(digitalPayForOrderPresenter$createZeroBalancePaymentObserver$1);
            this.N = true;
            return;
        }
        if (i()) {
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).u();
        }
        if (!"NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
            boolean zK = K();
            PayClient payClient = this.m;
            if (zK && K()) {
                ArrayList arrayList = this.u;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    NewGiftCardData newGiftCardData = (NewGiftCardData) it.next();
                    String paymentInstrumentId2 = newGiftCardData.getPaymentInstrumentId();
                    if (paymentInstrumentId2 == null || StringsKt.D(paymentInstrumentId2)) {
                        if (newGiftCardData.isPaymentAmountValid()) {
                            final AtomicInteger atomicInteger = new AtomicInteger(0);
                            final AtomicInteger atomicInteger2 = new AtomicInteger(0);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                NewGiftCardData newGiftCardData2 = (NewGiftCardData) next;
                                String paymentInstrumentId3 = newGiftCardData2.getPaymentInstrumentId();
                                if (paymentInstrumentId3 == null || StringsKt.D(paymentInstrumentId3)) {
                                    if (newGiftCardData2.isPaymentAmountValid()) {
                                        arrayList2.add(next);
                                    }
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                final NewGiftCardData newGiftCardData3 = (NewGiftCardData) it3.next();
                                atomicInteger.incrementAndGet();
                                String cardNumber = newGiftCardData3.getCardNumber();
                                String pin = newGiftCardData3.getPin();
                                SaveOptions saveOptions = newGiftCardData3.isSaveForLater() ? SaveOptions.SAVE_NOT_PRIMARY : SaveOptions.DO_NOT_SAVE;
                                final SchedulersProvider schedulersProvider = this.i;
                                final ShopAppTokenAuthenticator shopAppTokenAuthenticator = this.j;
                                BasePayResultCallback<TokeniseGiftCardResponse> basePayResultCallback = new BasePayResultCallback<TokeniseGiftCardResponse>(schedulersProvider, shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$processUntokenisedGiftCardPayments$1$1
                                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                    public final void k0(Object obj4) throws JSONException {
                                        String strB4;
                                        TokeniseGiftCardResponse tokeniseGiftCardResponse = (TokeniseGiftCardResponse) obj4;
                                        Intrinsics.h(tokeniseGiftCardResponse, "tokeniseGiftCardResponse");
                                        newGiftCardData3.setPaymentInstrumentId(tokeniseGiftCardResponse.giftCard.getInstrumentId());
                                        if (atomicInteger.decrementAndGet() == 0) {
                                            int i = atomicInteger2.get();
                                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = this;
                                            if (i == 0) {
                                                digitalPayForOrderPresenter.q0();
                                                return;
                                            }
                                            digitalPayForOrderPresenter.N = false;
                                            digitalPayForOrderPresenter.f0();
                                            if (digitalPayForOrderPresenter.i()) {
                                                Object obj5 = digitalPayForOrderPresenter.f4374a;
                                                Intrinsics.e(obj5);
                                                strB4 = ((DigitalPayForOrderContract.View) obj5).B4();
                                            } else {
                                                strB4 = null;
                                            }
                                            digitalPayForOrderPresenter.n0(strB4);
                                        }
                                    }

                                    @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                                    public final void v(PayError payError) {
                                        Intrinsics.h(payError, "payError");
                                        Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                                        atomicInteger2.incrementAndGet();
                                        if (atomicInteger.decrementAndGet() == 0) {
                                            DigitalPayForOrderPresenter.l(this);
                                        }
                                    }
                                };
                                TokeniseGiftCardService tokeniseGiftCardService = new TokeniseGiftCardService(payClient.b, payClient.c, payClient.e);
                                tokeniseGiftCardService.e = cardNumber;
                                tokeniseGiftCardService.f = pin;
                                tokeniseGiftCardService.g = saveOptions;
                                tokeniseGiftCardService.a(basePayResultCallback);
                            }
                        }
                    }
                }
            }
            NewGiftCardData newGiftCardData4 = this.v;
            if (newGiftCardData4 != null && ((paymentInstrumentId = newGiftCardData4.getPaymentInstrumentId()) == null || StringsKt.D(paymentInstrumentId))) {
                NewGiftCardData newGiftCardData5 = this.v;
                Intrinsics.e(newGiftCardData5);
                if (newGiftCardData5.isPaymentAmountValid()) {
                    NewGiftCardData newGiftCardData6 = this.v;
                    Intrinsics.e(newGiftCardData6);
                    String cardNumber2 = newGiftCardData6.getCardNumber();
                    NewGiftCardData newGiftCardData7 = this.v;
                    Intrinsics.e(newGiftCardData7);
                    String pin2 = newGiftCardData7.getPin();
                    NewGiftCardData newGiftCardData8 = this.v;
                    Intrinsics.e(newGiftCardData8);
                    SaveOptions saveOptions2 = newGiftCardData8.isSaveForLater() ? SaveOptions.SAVE_NOT_PRIMARY : SaveOptions.DO_NOT_SAVE;
                    final SchedulersProvider schedulersProvider2 = this.i;
                    final ShopAppTokenAuthenticator shopAppTokenAuthenticator2 = this.j;
                    BasePayResultCallback<TokeniseGiftCardResponse> basePayResultCallback2 = new BasePayResultCallback<TokeniseGiftCardResponse>(schedulersProvider2, shopAppTokenAuthenticator2) { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$processNewGiftCardPayments$1
                        @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                        public final void k0(Object obj4) {
                            TokeniseGiftCardResponse tokeniseGiftCardResponse = (TokeniseGiftCardResponse) obj4;
                            Intrinsics.h(tokeniseGiftCardResponse, "tokeniseGiftCardResponse");
                            DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.h;
                            NewGiftCardData newGiftCardData9 = digitalPayForOrderPresenter.v;
                            Intrinsics.e(newGiftCardData9);
                            newGiftCardData9.setPaymentInstrumentId(tokeniseGiftCardResponse.giftCard.getInstrumentId());
                            digitalPayForOrderPresenter.a0();
                        }

                        @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
                        public final void v(PayError payError) {
                            Intrinsics.h(payError, "payError");
                            Timber.f27013a.o(payError.getErrorMessage(), new Object[0]);
                            DigitalPayForOrderPresenter.l(this.h);
                        }
                    };
                    TokeniseGiftCardService tokeniseGiftCardService2 = new TokeniseGiftCardService(payClient.b, payClient.c, payClient.e);
                    tokeniseGiftCardService2.e = cardNumber2;
                    tokeniseGiftCardService2.f = pin2;
                    tokeniseGiftCardService2.g = saveOptions2;
                    tokeniseGiftCardService2.a(basePayResultCallback2);
                    return;
                }
            }
            a0();
            return;
        }
        this.L = true;
        CardCaptureView cardCaptureView = this.x;
        if (cardCaptureView != null) {
            cardCaptureView.e(this.C ? SaveOptions.SAVE_NOT_PRIMARY : SaveOptions.DO_NOT_SAVE, Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.r():void");
    }

    public final boolean r0(Throwable th) {
        if (!(th instanceof SocketTimeoutException)) {
            return false;
        }
        this.N = false;
        PaymentFailureHelper.GlobalErrorLabelProvider globalErrorLabelProvider = this.T;
        Intrinsics.e(globalErrorLabelProvider);
        I(new PaymentFailureError(globalErrorLabelProvider.a(22), 2));
        return true;
    }

    public final void s() {
        String strN0;
        if (i()) {
            if (this.J <= 0) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).r3();
                return;
            }
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj2;
            if (this.J > 1) {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                strN0 = ((DigitalPayForOrderContract.View) obj3).A();
            } else {
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                strN0 = ((DigitalPayForOrderContract.View) obj4).N0();
            }
            view.p3(strN0);
        }
    }

    public final void s0(boolean z) {
        this.l.c(DigipayActions.e);
        if (i()) {
            boolean z2 = true;
            if (!z) {
                CardCaptureView cardCaptureView = this.x;
                if (cardCaptureView == null) {
                    p(true);
                    return;
                }
                this.K = new QueryFormStatusProvider() { // from class: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$toggleAddNewGiftCardView$1
                    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.QueryFormStatusProvider
                    public final void e(boolean z3) {
                        DigitalPayForOrderPresenter digitalPayForOrderPresenter = this.d;
                        digitalPayForOrderPresenter.R.e();
                        digitalPayForOrderPresenter.p(z3);
                        digitalPayForOrderPresenter.U = z3;
                    }
                };
                cardCaptureView.loadUrl("javascript:queryFormStatus()");
                h0(new l(this, 1));
                return;
            }
            if (this.F) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).Y0();
                if (P()) {
                    Object obj2 = this.f4374a;
                    Intrinsics.e(obj2);
                    ((DigitalPayForOrderContract.View) obj2).h1(true, Q());
                    return;
                } else {
                    Object obj3 = this.f4374a;
                    Intrinsics.e(obj3);
                    ((DigitalPayForOrderContract.View) obj3).X(K());
                    return;
                }
            }
            if (this.E) {
                return;
            }
            if (W()) {
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj4;
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                String strG = ((DigitalPayForOrderContract.View) obj5).G();
                if (!Q() && !K()) {
                    z2 = false;
                }
                view.e2(strG, z2);
            }
            y0();
        }
    }

    public final void t() {
        CardCaptureView cardCaptureView = this.x;
        if (cardCaptureView != null) {
            cardCaptureView.b();
            this.U = true;
            this.O = null;
        }
        if ("NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
            this.y = null;
        }
        if (i()) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).x2();
        }
    }

    public final void t0(boolean z) {
        String strL4;
        if (i()) {
            if ((!m() || !O()) && !z) {
                this.G = 0;
                this.I = null;
                v0();
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).J2();
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).s1();
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).n4();
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).x2();
                l0();
                o0();
                z0();
                return;
            }
            this.G = 1;
            Object obj5 = this.f4374a;
            Intrinsics.e(obj5);
            ((DigitalPayForOrderContract.View) obj5).I4(v(this.M, false, R.string.place_order, ""));
            Object obj6 = this.f4374a;
            Intrinsics.e(obj6);
            ((DigitalPayForOrderContract.View) obj6).a1(O());
            if (O()) {
                Object obj7 = this.f4374a;
                Intrinsics.e(obj7);
                ((DigitalPayForOrderContract.View) obj7).g1();
            } else {
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).j3();
            }
            if (L()) {
                Object obj9 = this.f4374a;
                Intrinsics.e(obj9);
                DigitalPayForOrderContract.View view = (DigitalPayForOrderContract.View) obj9;
                if (this.p.size() == 1) {
                    Object obj10 = this.f4374a;
                    Intrinsics.e(obj10);
                    strL4 = ((DigitalPayForOrderContract.View) obj10).F1();
                } else {
                    Object obj11 = this.f4374a;
                    Intrinsics.e(obj11);
                    strL4 = ((DigitalPayForOrderContract.View) obj11).l4();
                }
                view.M1(strL4);
            } else {
                Object obj12 = this.f4374a;
                Intrinsics.e(obj12);
                ((DigitalPayForOrderContract.View) obj12).r4();
            }
            Object obj13 = this.f4374a;
            Intrinsics.e(obj13);
            ((DigitalPayForOrderContract.View) obj13).d0();
            Object obj14 = this.f4374a;
            Intrinsics.e(obj14);
            ((DigitalPayForOrderContract.View) obj14).L();
            Object obj15 = this.f4374a;
            Intrinsics.e(obj15);
            ((DigitalPayForOrderContract.View) obj15).h0();
            Object obj16 = this.f4374a;
            Intrinsics.e(obj16);
            ((DigitalPayForOrderContract.View) obj16).r3();
            Object obj17 = this.f4374a;
            Intrinsics.e(obj17);
            ((DigitalPayForOrderContract.View) obj17).b3();
            Object obj18 = this.f4374a;
            Intrinsics.e(obj18);
            ((DigitalPayForOrderContract.View) obj18).K0();
            Object obj19 = this.f4374a;
            Intrinsics.e(obj19);
            ((DigitalPayForOrderContract.View) obj19).Y0();
            Object obj20 = this.f4374a;
            Intrinsics.e(obj20);
            ((DigitalPayForOrderContract.View) obj20).I3();
            Object obj21 = this.f4374a;
            Intrinsics.e(obj21);
            ((DigitalPayForOrderContract.View) obj21).E3();
            v0();
            Object obj22 = this.f4374a;
            Intrinsics.e(obj22);
            ((DigitalPayForOrderContract.View) obj22).V();
            Object obj23 = this.f4374a;
            Intrinsics.e(obj23);
            ((DigitalPayForOrderContract.View) obj23).x2();
            t();
        }
    }

    public final void u() {
        if (i()) {
            this.l.c(DigipayActions.h);
            this.P = null;
            this.Q = null;
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).f1();
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            ((DigitalPayForOrderContract.View) obj2).a4();
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).z4();
            Object obj4 = this.f4374a;
            Intrinsics.e(obj4);
            ((DigitalPayForOrderContract.View) obj4).L1();
            if (P()) {
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).h1(false, Q());
            } else {
                Object obj6 = this.f4374a;
                Intrinsics.e(obj6);
                ((DigitalPayForOrderContract.View) obj6).K0();
            }
            C0();
        }
    }

    public final void u0() {
        if (i()) {
            if (!n() || !Q()) {
                this.H = 0;
                if ("NEW_CREDIT_CARD_INSTRUMENT_ID".equals(this.y)) {
                    Object obj = this.f4374a;
                    Intrinsics.e(obj);
                    ((DigitalPayForOrderContract.View) obj).e4(true, O(), L());
                } else if (this.U) {
                    Object obj2 = this.f4374a;
                    Intrinsics.e(obj2);
                    ((DigitalPayForOrderContract.View) obj2).I3();
                } else {
                    k0(true);
                }
                v0();
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).T();
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                ((DigitalPayForOrderContract.View) obj4).s1();
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                ((DigitalPayForOrderContract.View) obj5).n4();
                s();
                l0();
                o0();
                z0();
                return;
            }
            this.H = 1;
            Object obj6 = this.f4374a;
            Intrinsics.e(obj6);
            ((DigitalPayForOrderContract.View) obj6).I4(v(this.M, false, R.string.place_order, ""));
            Object obj7 = this.f4374a;
            Intrinsics.e(obj7);
            ((DigitalPayForOrderContract.View) obj7).c0(Q());
            if (Q()) {
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).d1();
            } else {
                Object obj9 = this.f4374a;
                Intrinsics.e(obj9);
                ((DigitalPayForOrderContract.View) obj9).h0();
            }
            if (K()) {
                Object obj10 = this.f4374a;
                Intrinsics.e(obj10);
                ((DigitalPayForOrderContract.View) obj10).u4();
            } else {
                Object obj11 = this.f4374a;
                Intrinsics.e(obj11);
                ((DigitalPayForOrderContract.View) obj11).E3();
            }
            w0();
            Object obj12 = this.f4374a;
            Intrinsics.e(obj12);
            ((DigitalPayForOrderContract.View) obj12).f1();
            Object obj13 = this.f4374a;
            Intrinsics.e(obj13);
            ((DigitalPayForOrderContract.View) obj13).z4();
            Object obj14 = this.f4374a;
            Intrinsics.e(obj14);
            ((DigitalPayForOrderContract.View) obj14).L1();
            Object obj15 = this.f4374a;
            Intrinsics.e(obj15);
            ((DigitalPayForOrderContract.View) obj15).Y0();
            Object obj16 = this.f4374a;
            Intrinsics.e(obj16);
            ((DigitalPayForOrderContract.View) obj16).V();
            Object obj17 = this.f4374a;
            Intrinsics.e(obj17);
            ((DigitalPayForOrderContract.View) obj17).a4();
            Object obj18 = this.f4374a;
            Intrinsics.e(obj18);
            ((DigitalPayForOrderContract.View) obj18).r3();
            Object obj19 = this.f4374a;
            Intrinsics.e(obj19);
            ((DigitalPayForOrderContract.View) obj19).d0();
            Object obj20 = this.f4374a;
            Intrinsics.e(obj20);
            ((DigitalPayForOrderContract.View) obj20).L();
            Object obj21 = this.f4374a;
            Intrinsics.e(obj21);
            ((DigitalPayForOrderContract.View) obj21).j3();
            Object obj22 = this.f4374a;
            Intrinsics.e(obj22);
            ((DigitalPayForOrderContract.View) obj22).r4();
            Object obj23 = this.f4374a;
            Intrinsics.e(obj23);
            ((DigitalPayForOrderContract.View) obj23).Y1();
            Object obj24 = this.f4374a;
            Intrinsics.e(obj24);
            ((DigitalPayForOrderContract.View) obj24).v4();
            Object obj25 = this.f4374a;
            Intrinsics.e(obj25);
            ((DigitalPayForOrderContract.View) obj25).I3();
            v0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0() {
        /*
            r5 = this;
            java.lang.String r0 = r5.z
            if (r0 == 0) goto L38
            boolean r0 = kotlin.text.StringsKt.D(r0)
            if (r0 == 0) goto Lb
            goto L38
        Lb:
            java.util.ArrayList r0 = r5.t
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 != 0) goto L2b
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData r1 = (au.com.woolworths.android.onesite.models.checkout.SavedGiftCardData) r1
            boolean r1 = r1.isSelectedForPayment()
            if (r1 == 0) goto L18
            goto L2e
        L2b:
            boolean r0 = r5.F
            r2 = r2 ^ r0
        L2e:
            if (r2 != 0) goto L38
            boolean r0 = r5.Z
            if (r0 != 0) goto L38
            r0 = 2132018559(0x7f14057f, float:1.9675428E38)
            goto L3b
        L38:
            r0 = 2132018622(0x7f1405be, float:1.9675556E38)
        L3b:
            java.lang.Object r1 = r5.f4374a
            kotlin.jvm.internal.Intrinsics.e(r1)
            au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract$View r1 = (au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract.View) r1
            au.com.woolworths.checkout.models.PaymentState r2 = r5.M
            boolean r3 = r5.o()
            java.lang.String r4 = ""
            au.com.woolworths.android.onesite.modules.checkout.common.PaymentBreakdownState r0 = v(r2, r3, r0, r4)
            r1.I4(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.v0():void");
    }

    public final PaymentFailureHelper w() {
        String str;
        PaymentFailureHelper.Builder builder = new PaymentFailureHelper.Builder();
        builder.f4288a = this.m;
        return new PaymentFailureHelper(builder.f4288a, this.j, this.T, this.t, this.s, this.u, this.v, this.q, this.p, (!this.L || (str = this.y) == null || "NEW_CREDIT_CARD_INSTRUMENT_ID".equals(str)) ? null : new NewCreditCardData(this.y, this.C));
    }

    public final void w0() {
        String strW1;
        String strU3;
        if (i()) {
            if (!M()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).b3();
                return;
            }
            ArrayList arrayList = this.s;
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((SavedGiftCardData) it.next()).isExpired()) {
                    i++;
                }
            }
            int size = arrayList.size() - i;
            if (size > 1) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                strW1 = ((DigitalPayForOrderContract.View) obj2).B3();
            } else {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                strW1 = ((DigitalPayForOrderContract.View) obj3).W1();
            }
            if (i > 1) {
                Object obj4 = this.f4374a;
                Intrinsics.e(obj4);
                strU3 = ((DigitalPayForOrderContract.View) obj4).b0();
            } else {
                Object obj5 = this.f4374a;
                Intrinsics.e(obj5);
                strU3 = ((DigitalPayForOrderContract.View) obj5).u3();
            }
            if (i > 0 && size > 0) {
                Object obj6 = this.f4374a;
                Intrinsics.e(obj6);
                strW1 = String.format("%1$s\n- %2$s\n- %3$s", Arrays.copyOf(new Object[]{((DigitalPayForOrderContract.View) obj6).c2(), strU3, strW1}, 3));
            } else if (size <= 0) {
                strW1 = strU3;
            }
            Object obj7 = this.f4374a;
            Intrinsics.e(obj7);
            ((DigitalPayForOrderContract.View) obj7).G0(strW1);
        }
    }

    public final void x() {
        this.y = null;
        Object obj = this.f4374a;
        Intrinsics.e(obj);
        ((DigitalPayForOrderContract.View) obj).I3();
        t();
        if (this.f.e()) {
            if (R()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).D2(R(), O());
            }
            if (O()) {
                Object obj3 = this.f4374a;
                Intrinsics.e(obj3);
                ((DigitalPayForOrderContract.View) obj3).g1();
            }
        }
    }

    public final void x0(String[] strArr) {
        this.X = strArr;
        if (strArr == null || strArr.length == 0) {
            this.A = false;
        } else {
            String str = this.z;
            if (str != null) {
                this.A = N(str);
            }
            String str2 = this.y;
            if (str2 != null && N(str2)) {
                this.y = null;
            }
            ArrayList arrayList = this.t;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SavedGiftCardData savedGiftCardData = (SavedGiftCardData) it.next();
                    if (savedGiftCardData.isSelectedForPayment()) {
                        String paymentInstrumentId = savedGiftCardData.getPaymentInstrumentId();
                        Intrinsics.g(paymentInstrumentId, "getPaymentInstrumentId(...)");
                        if (N(paymentInstrumentId)) {
                            savedGiftCardData.setSelectedForPayment(false);
                        }
                    }
                }
            }
            String str3 = this.z;
            if (str3 != null && N(str3)) {
                this.z = null;
            }
            C0();
        }
        if (i()) {
            if (O() && n()) {
                Object obj = this.f4374a;
                Intrinsics.e(obj);
                ((DigitalPayForOrderContract.View) obj).g1();
            }
            if (Q() && m()) {
                Object obj2 = this.f4374a;
                Intrinsics.e(obj2);
                ((DigitalPayForOrderContract.View) obj2).d1();
            }
            ArrayList arrayList2 = this.w;
            if (((arrayList2 != null && arrayList2.size() > 0) || this.B != null) && n() && m()) {
                C0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y(java.util.ArrayList r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.y(java.util.ArrayList, java.util.List):java.lang.String");
    }

    public final void y0() {
        Object obj = this.f4374a;
        if (obj == null) {
            return;
        }
        GiftCardNumberStatus giftCardNumberStatusB = this.P;
        if (giftCardNumberStatusB == null) {
            giftCardNumberStatusB = GiftCardUtils.b(((DigitalPayForOrderContract.View) obj).I0(), this.f.g(), this.u);
        }
        GiftCardPinStatus giftCardPinStatusC = this.Q;
        if (giftCardPinStatusC == null) {
            Object obj2 = this.f4374a;
            Intrinsics.e(obj2);
            giftCardPinStatusC = GiftCardUtils.c(((DigitalPayForOrderContract.View) obj2).U());
        }
        GiftCardNumberStatus giftCardNumberStatus = GiftCardNumberStatus.d;
        GiftCardNumberStatus giftCardNumberStatus2 = GiftCardNumberStatus.l;
        UIStatus uIStatus = UIStatus.e;
        UIStatus uIStatus2 = UIStatus.d;
        if (giftCardNumberStatusB == giftCardNumberStatus || giftCardNumberStatusB == giftCardNumberStatus2) {
            Object obj3 = this.f4374a;
            Intrinsics.e(obj3);
            ((DigitalPayForOrderContract.View) obj3).O2(uIStatus);
        } else {
            Object obj4 = this.f4374a;
            Intrinsics.e(obj4);
            ((DigitalPayForOrderContract.View) obj4).O2(uIStatus2);
        }
        GiftCardPinStatus giftCardPinStatus = GiftCardPinStatus.d;
        GiftCardPinStatus giftCardPinStatus2 = GiftCardPinStatus.j;
        if (giftCardPinStatusC == giftCardPinStatus || giftCardPinStatusC == giftCardPinStatus2) {
            Object obj5 = this.f4374a;
            Intrinsics.e(obj5);
            ((DigitalPayForOrderContract.View) obj5).g3(uIStatus);
        } else {
            Object obj6 = this.f4374a;
            Intrinsics.e(obj6);
            ((DigitalPayForOrderContract.View) obj6).g3(uIStatus2);
        }
        if ((giftCardNumberStatusB == giftCardNumberStatus2 || giftCardNumberStatusB == GiftCardNumberStatus.j) && (giftCardPinStatusC == giftCardPinStatus2 || giftCardPinStatusC == GiftCardPinStatus.f)) {
            Object obj7 = this.f4374a;
            Intrinsics.e(obj7);
            if (((DigitalPayForOrderContract.View) obj7).Z2()) {
                Object obj8 = this.f4374a;
                Intrinsics.e(obj8);
                ((DigitalPayForOrderContract.View) obj8).U3(uIStatus2);
                Object obj9 = this.f4374a;
                Intrinsics.e(obj9);
                ((DigitalPayForOrderContract.View) obj9).C0(uIStatus2);
                Object obj10 = this.f4374a;
                Intrinsics.e(obj10);
                ((DigitalPayForOrderContract.View) obj10).O(uIStatus2);
                return;
            }
        }
        Object obj11 = this.f4374a;
        Intrinsics.e(obj11);
        ((DigitalPayForOrderContract.View) obj11).U3(uIStatus);
        Object obj12 = this.f4374a;
        Intrinsics.e(obj12);
        ((DigitalPayForOrderContract.View) obj12).C0(uIStatus);
        Object obj13 = this.f4374a;
        Intrinsics.e(obj13);
        ((DigitalPayForOrderContract.View) obj13).O(uIStatus);
    }

    public final void z() {
        if (i() && !this.N) {
            Object obj = this.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).u();
        }
        SingleObserveOn singleObserveOnF = this.f.b(false).f(this.i.b());
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new f(new k(this, 1), 3), Functions.e);
        singleObserveOnF.a(consumerSingleObserver);
        this.b.d(consumerSingleObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter.z0():void");
    }
}
