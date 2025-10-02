package au.com.woolworths.android.onesite.modules.checkout.common;

import android.annotation.SuppressLint;
import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutNotifyUser;
import au.com.woolworths.android.onesite.network.PaymentsUrlUtil;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.checkout.network.CheckoutApiInterface;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.checkout.CheckoutFeature;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutInteractorImpl;", "Lau/com/woolworths/android/onesite/modules/checkout/common/CheckoutInteractor;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint
/* loaded from: classes3.dex */
public final class CheckoutInteractorImpl implements CheckoutInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutApiInterface f4273a;
    public final SchedulersProvider b;
    public final ShopAccountInteractor c;
    public final AppBuildConfig d;
    public final PublishSubject e;
    public final PublishSubject f;

    public CheckoutInteractorImpl(CheckoutApiInterface checkoutApiInterface, SchedulersProvider schedulersProvider, ShopAccountInteractor accountInteractor, AppBuildConfig appBuildConfig) {
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        this.f4273a = checkoutApiInterface;
        this.b = schedulersProvider;
        this.c = accountInteractor;
        this.d = appBuildConfig;
        this.e = new PublishSubject();
        this.f = new PublishSubject();
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor
    public final void a(boolean z) {
        this.f.onNext(new CheckoutNotifyUser.InvalidWindowError(z));
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor
    /* renamed from: b, reason: from getter */
    public final PublishSubject getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor
    /* renamed from: c, reason: from getter */
    public final PublishSubject getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor
    public final void d() {
        CheckoutFeature checkoutFeature = CheckoutFeature.d;
        String strA = PaymentsUrlUtil.a(this.c, this.d);
        Intrinsics.g(strA, "getPaymentUrl(...)");
        new SingleDoOnSuccess(new SingleOnErrorReturn(new SingleMap(this.f4273a.d("MARKETPLACE_MIXED_FULFILMENT", strA).h(this.b.d()), new e(new androidx.navigation.a(22), 8)), new androidx.media3.extractor.a(19)), new e(new androidx.navigation.fragment.e(this, 2), 9)).a(new ConsumerSingleObserver(Functions.d, Functions.e));
    }
}
