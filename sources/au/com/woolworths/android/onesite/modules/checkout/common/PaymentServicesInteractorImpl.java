package au.com.woolworths.android.onesite.modules.checkout.common;

import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.checkout.models.PayPalTokenResponse;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.pay.sdk.models.merchantprofile.CreditCardInfo;
import au.com.woolworths.pay.sdk.models.merchantprofile.GiftCardInfo;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;
import au.com.woolworths.pay.sdk.models.merchantprofile.PayPalInfo;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimeout;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesInteractorImpl;", "Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesInteractor;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PaymentServicesInteractorImpl implements PaymentServicesInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutApiInterface f4279a;
    public final ShopAccountInteractor b;
    public final SchedulersProvider c;
    public final FeatureToggleManager d;
    public final NetworkExceptions e;
    public final DigitalPaySdkHelper f;
    public MerchantProfile g;
    public final BehaviorSubject h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/PaymentServicesInteractorImpl$Companion;", "", "", "MERCHANT_PROFILE_TIMEOUT_SEC", "I", "", "ENABLED", "Ljava/lang/String;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PaymentServicesInteractorImpl(CheckoutApiInterface checkoutApiInterface, ShopAccountInteractor accountInteractor, SchedulersProvider schedulersProvider, FeatureToggleManager featureToggleManager, NetworkExceptions networkExceptions, DigitalPaySdkHelper digitalPaySdkHelper) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(digitalPaySdkHelper, "digitalPaySdkHelper");
        this.f4279a = checkoutApiInterface;
        this.b = accountInteractor;
        this.c = schedulersProvider;
        this.d = featureToggleManager;
        this.e = networkExceptions;
        this.f = digitalPaySdkHelper;
        PaymentServicesStatus paymentServicesStatus = PaymentServicesStatus.e;
        BehaviorSubject behaviorSubject = new BehaviorSubject();
        behaviorSubject.d.lazySet(paymentServicesStatus);
        this.h = behaviorSubject;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final Single a() {
        PayPalInfo payPalInfo;
        MerchantProfile merchantProfile = this.g;
        String str = null;
        String str2 = (merchantProfile == null || (payPalInfo = merchantProfile.getPayPalInfo()) == null) ? null : payPalInfo.clientToken;
        if (str2 != null && !StringsKt.D(str2)) {
            str = str2;
        }
        if (str != null) {
            return Single.e(new PayPalTokenResponse(str));
        }
        Single<PayPalTokenResponse> singleA = this.f4279a.a();
        SchedulersProvider schedulersProvider = this.c;
        return singleA.h(schedulersProvider.d()).f(schedulersProvider.b());
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final SingleSubscribeOn b(boolean z) {
        Single singleE;
        if (this.d.c(BaseShopAppFeature.x)) {
            this.g = null;
            singleE = Single.e(Result.Companion.b(null));
        } else if (z) {
            singleE = m(true);
        } else {
            MerchantProfile merchantProfile = this.g;
            singleE = merchantProfile != null ? Single.e(Result.Companion.b(merchantProfile)) : m(false);
        }
        return new SingleOnErrorReturn(singleE, new androidx.media3.extractor.a(20)).h(this.c.d());
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final SingleOnErrorReturn c() {
        return new SingleOnErrorReturn(new SingleMap(this.f.c(), new e(new androidx.navigation.a(23), 12)), new androidx.media3.extractor.a(21));
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final void d(boolean z) {
        this.h.onNext(PaymentServicesStatus.e);
        this.f.d(this.b.E());
        new SingleDoOnSuccess(b(z).h(this.c.d()), new e(new b(this, 0), 11)).a(new ConsumerSingleObserver(Functions.d, Functions.e));
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final boolean e() {
        CreditCardInfo creditCardInfo;
        if (!f()) {
            return true;
        }
        MerchantProfile merchantProfile = this.g;
        return "ENABLED".equals((merchantProfile == null || (creditCardInfo = merchantProfile.getCreditCardInfo()) == null) ? null : creditCardInfo.getServiceStatus());
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final boolean f() {
        return this.g != null;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final String[] g() {
        GiftCardInfo giftCardInfo;
        MerchantProfile merchantProfile = this.g;
        String[] allowedBins = (merchantProfile == null || (giftCardInfo = merchantProfile.getGiftCardInfo()) == null) ? null : giftCardInfo.getAllowedBins();
        String[] strArr = allowedBins == null || allowedBins.length == 0 ? null : allowedBins;
        return strArr == null ? new String[]{"628000"} : strArr;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final void h() {
        Object obj = this.h.d.get();
        if (NotificationLite.l(obj) || NotificationLite.m(obj)) {
            obj = null;
        }
        if (((PaymentServicesStatus) obj) == PaymentServicesStatus.d) {
            this.f.d(this.b.E());
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final boolean i(String str) {
        MerchantProfile merchantProfile;
        CreditCardInfo creditCardInfo;
        String[] allowedNetworks;
        boolean z = this.g == null;
        if (StringsKt.D(str) || (merchantProfile = this.g) == null || (creditCardInfo = merchantProfile.getCreditCardInfo()) == null || (allowedNetworks = creditCardInfo.getAllowedNetworks()) == null) {
            return z;
        }
        for (String str2 : allowedNetworks) {
            Intrinsics.e(str2);
            String lowerCase = str2.toLowerCase(Locales.a());
            Intrinsics.g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(Locales.a());
            Intrinsics.g(lowerCase2, "toLowerCase(...)");
            if (lowerCase.equals(lowerCase2)) {
                return true;
            }
        }
        return false;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    /* renamed from: j, reason: from getter */
    public final BehaviorSubject getH() {
        return this.h;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final boolean k() {
        PayPalInfo payPalInfo;
        if (!f()) {
            return true;
        }
        MerchantProfile merchantProfile = this.g;
        return "ENABLED".equals((merchantProfile == null || (payPalInfo = merchantProfile.getPayPalInfo()) == null) ? null : payPalInfo.getServiceStatus());
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor
    public final boolean l() {
        GiftCardInfo giftCardInfo;
        if (!f()) {
            return true;
        }
        MerchantProfile merchantProfile = this.g;
        return "ENABLED".equals((merchantProfile == null || (giftCardInfo = merchantProfile.getGiftCardInfo()) == null) ? null : giftCardInfo.getServiceStatus());
    }

    public final SingleOnErrorReturn m(boolean z) {
        SingleCreate singleCreateB = this.f.b(z);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler schedulerD = this.c.d();
        ObjectHelper.b(timeUnit, "unit is null");
        ObjectHelper.b(schedulerD, "scheduler is null");
        return new SingleOnErrorReturn(new SingleMap(new SingleTimeout(singleCreateB, schedulerD), new e(new b(this, 1), 13)), new androidx.media3.extractor.a(22));
    }
}
