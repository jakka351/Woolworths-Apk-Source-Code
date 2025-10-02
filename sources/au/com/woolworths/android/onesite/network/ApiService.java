package au.com.woolworths.android.onesite.network;

import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import au.com.woolworths.shop.checkout.domain.interactor.MakePayment;
import au.com.woolworths.shop.checkout.domain.interactor.MakeZeroPayment;
import dagger.Lazy;
import io.reactivex.internal.operators.single.SingleObserveOn;

/* loaded from: classes3.dex */
public class ApiService {

    /* renamed from: a, reason: collision with root package name */
    public final ApiInterface f4562a;
    public final CheckoutApiInterface b;
    public final Lazy c;
    public final AppConfigurationInteractor d;
    public final SchedulersProvider e;
    public final AppBuildConfig f;
    public final MakePayment g;
    public final MakeZeroPayment h;
    public final FeatureToggleManager i;

    public ApiService(ApiInterface apiInterface, CheckoutApiInterface checkoutApiInterface, Lazy lazy, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, AppConfigurationInteractor appConfigurationInteractor, SchedulersProvider schedulersProvider, AppBuildConfig appBuildConfig, MakePayment makePayment, MakeZeroPayment makeZeroPayment, FeatureToggleManager featureToggleManager) {
        this.f4562a = apiInterface;
        this.b = checkoutApiInterface;
        this.c = lazy;
        this.d = appConfigurationInteractor;
        this.e = schedulersProvider;
        this.f = appBuildConfig;
        this.g = makePayment;
        this.h = makeZeroPayment;
        this.i = featureToggleManager;
    }

    public final SingleObserveOn a() {
        boolean zC = this.i.c(CheckoutFeature.f);
        SchedulersProvider schedulersProvider = this.e;
        if (zC) {
            return this.h.a().h(schedulersProvider.d()).f(schedulersProvider.b());
        }
        return this.b.c("MARKETPLACE_MIXED_FULFILMENT", PaymentsUrlUtil.a((ShopAccountInteractor) this.c.get(), this.f) + "/zero").h(schedulersProvider.d()).f(schedulersProvider.b());
    }
}
