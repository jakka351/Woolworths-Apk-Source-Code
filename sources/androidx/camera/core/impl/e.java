package androidx.camera.core.impl;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.CorePixelDp;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.ReorderingSeiMessageQueue;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.ts.SeiReader;
import au.com.woolworths.android.onesite.app.deeplink.ShopAppBranchDeepLinkActivity;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutPaymentState;
import au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.BasePayResultCallback;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderContract;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.QueryFormStatusProvider;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.adapters.ExpiredCreditCardRecyclerViewAdapter;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.viewholders.ExpiredCreditCardViewHolder;
import au.com.woolworths.android.onesite.modules.checkout.paypal.PayPalData;
import au.com.woolworths.android.onesite.modules.checkout.payserviceserror.PayServicesErrorContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesPresenter;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.pay.internal.services.paymentinstruments.PaymentInstrumentService;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.shop.auth.ShopAppTokenAuthenticator;
import com.woolworths.R;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import io.reactivex.ObservableSource;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.Resolver, TextFieldState.NotifyImeListener, CorePixelDp, BinarySearchSeeker.SeekTimestampConverter, ReorderingSeiMessageQueue.SeiConsumer, Branch.BranchReferralInitListener, OnApplyWindowInsetsListener, Function, Consumer, SingleOnSubscribe, RecyclerViewListener.View, QueryFormStatusProvider, RecyclerViewListener.StringValueChange {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.RecyclerViewListener.View
    public void a(int i) {
        DigitalPayForOrderPresenter digitalPayForOrderPresenter = ((ExpiredCreditCardRecyclerViewAdapter) this.e).k;
        if (digitalPayForOrderPresenter.i()) {
            digitalPayForOrderPresenter.Z();
            Object obj = digitalPayForOrderPresenter.f4374a;
            Intrinsics.e(obj);
            ((DigitalPayForOrderContract.View) obj).Q0(R.string.updating_credit_card_message);
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 9:
                ((androidx.navigation.fragment.e) obj2).invoke(obj);
                break;
            case 11:
                ((au.com.woolworths.android.onesite.modules.checkout.common.b) obj2).invoke(obj);
                break;
            case 20:
                ((ManageFullDeliveryAddressesContract.View) ((ManageFullDeliveryAddressesPresenter) obj2).f4374a).r0();
                break;
            case 21:
                int i2 = DeliveryAddressSearchActivity.J;
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.a) obj2).invoke(obj);
                break;
            case 22:
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) obj2).invoke(obj);
                break;
            case 23:
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) obj2).invoke(obj);
                break;
            case 26:
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) obj2).invoke(obj);
                break;
            case 27:
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) obj2).invoke(obj);
                break;
            default:
                ((au.com.woolworths.android.onesite.modules.deliveryaddress.search.d) obj2).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: apply */
    public Object mo0apply(Object p0) {
        switch (this.d) {
            case 8:
                androidx.navigation.a aVar = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (CheckoutPaymentState) aVar.invoke(p0);
            case 12:
                androidx.navigation.a aVar2 = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (Result) aVar2.invoke(p0);
            case 13:
                au.com.woolworths.android.onesite.modules.checkout.common.b bVar = (au.com.woolworths.android.onesite.modules.checkout.common.b) this.e;
                Intrinsics.h(p0, "p0");
                return (Result) bVar.invoke(p0);
            case 17:
                androidx.navigation.a aVar3 = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (PayPalData) aVar3.invoke(p0);
            case 18:
                androidx.navigation.a aVar4 = (androidx.navigation.a) this.e;
                Intrinsics.h(p0, "p0");
                return (PayServicesErrorContract.ViewState) aVar4.invoke(p0);
            case 19:
                return ((LegacyShoppingModeRepository) this.e).h((SaveAddressResult.Address) p0);
            case 24:
                au.com.woolworths.android.onesite.modules.deliveryaddress.search.c cVar = (au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) cVar.invoke(p0);
            case 25:
                au.com.woolworths.android.onesite.modules.deliveryaddress.search.c cVar2 = (au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) this.e;
                Intrinsics.h(p0, "p0");
                return (ObservableSource) cVar2.invoke(p0);
            default:
                au.com.woolworths.android.onesite.modules.deliveryaddress.search.c cVar3 = (au.com.woolworths.android.onesite.modules.deliveryaddress.search.c) this.e;
                Intrinsics.h(p0, "p0");
                cVar3.invoke(p0);
                return ObservableEmpty.d;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        LiveDataObservable liveDataObservable = (LiveDataObservable) this.e;
        CameraXExecutors.d().execute(new f(4, liveDataObservable, completer));
        return liveDataObservable + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // io.branch.referral.Branch.BranchReferralInitListener
    public void b(JSONObject jSONObject, BranchError branchError) {
        ShopAppBranchDeepLinkActivity shopAppBranchDeepLinkActivity = (ShopAppBranchDeepLinkActivity) this.e;
        if (branchError != null) {
            int i = ShopAppBranchDeepLinkActivity.A;
            Bark.Companion companion = Bark.f8483a;
            ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.g);
            String str = branchError.f23850a;
            Intrinsics.g(str, "getMessage(...)");
            Bark.Barker.i(reportOwner, str, null, 12);
        } else {
            BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = shopAppBranchDeepLinkActivity.x;
            if (branchDeepLinkInteractorImpl == null) {
                Intrinsics.p("branchDeepLinkInteractor");
                throw null;
            }
            ApplicationType applicationType = ApplicationType.d;
            branchDeepLinkInteractorImpl.c(ApplicationType.e, shopAppBranchDeepLinkActivity, jSONObject != null ? BranchDeepLinkInteractorImpl.h(jSONObject) : null, String.valueOf(shopAppBranchDeepLinkActivity.getIntent().getData()));
        }
        shopAppBranchDeepLinkActivity.finish();
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long c(long j) {
        return Util.j((j * r0.e) / 1000000, 0L, ((FlacStreamMetadata) this.e).j - 1);
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void d(final SingleEmitter singleEmitter) {
        DigitalPaySdkHelperImpl digitalPaySdkHelperImpl = (DigitalPaySdkHelperImpl) this.e;
        PayClient payClient = digitalPaySdkHelperImpl.c;
        final SchedulersProvider schedulersProvider = digitalPaySdkHelperImpl.f4276a;
        final ShopAppTokenAuthenticator shopAppTokenAuthenticator = digitalPaySdkHelperImpl.b;
        new PaymentInstrumentService(payClient.b, payClient.c, payClient.e).a(new BasePayResultCallback<List<? extends PaymentInstrument>>(schedulersProvider, shopAppTokenAuthenticator) { // from class: au.com.woolworths.android.onesite.modules.checkout.common.DigitalPaySdkHelperImpl$getListPaymentInstrumentsSingle$1$1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                List paymentInstruments = (List) obj;
                Intrinsics.h(paymentInstruments, "paymentInstruments");
                singleEmitter.onSuccess(paymentInstruments);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                Intrinsics.h(payError, "payError");
                singleEmitter.onError(DigitalPaySdkHelperImplKt.a(payError));
            }
        });
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.digitalpay.QueryFormStatusProvider
    public void e(boolean z) {
        ((ExpiredCreditCardViewHolder) this.e).f4295a.I.setVisibility(8);
    }

    @Override // androidx.media3.container.ReorderingSeiMessageQueue.SeiConsumer
    public void f(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.a(j, parsableByteArray, ((SeiReader) this.e).b);
    }

    public float g(float f) {
        return ((State) this.e).k.getE() * f;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat windowInsetsCompat) {
        Function2 function2 = (Function2) this.e;
        Intrinsics.h(v, "v");
        Insets insetsE = windowInsetsCompat.e(655);
        Intrinsics.g(insetsE, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        function2.invoke(marginLayoutParams, insetsE);
        v.setLayoutParams(marginLayoutParams);
        return WindowInsetsCompat.b;
    }
}
