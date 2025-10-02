package au.com.woolworths.feature.shop.login.guest;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.appdata.AppConfigurationInteractor;
import au.com.woolworths.android.onesite.models.authentication.LoginResult;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.modules.collectionmode.api.UpdateSelectedPickUpLocationRequest;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.rxutils.RxExtKt;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.guest.GuestLoginInteractor;
import au.com.woolworths.base.shopapp.modules.collectionmode.LegacyShoppingModeRepository;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.shop.auth.AccountRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.google.gson.reflect.TypeToken;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.completable.CompletableFromSingle;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleDoOnError;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleFromCallable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/GuestLoginInteractorImpl;", "Lau/com/woolworths/base/shopapp/guest/GuestLoginInteractor;", "Companion", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GuestLoginInteractorImpl implements GuestLoginInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final GuestLoginRepository f7455a;
    public final SchedulersProvider b;
    public final LegacyShoppingModeRepository c;
    public final ShopAccountInteractor d;
    public final TrolleyInteractor e;
    public final AppConfigurationInteractor f;
    public final CollectionModeInteractor g;
    public final PickUpLocatorRepository h;
    public final ShopAppRegionInteractor i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/login/guest/GuestLoginInteractorImpl$Companion;", "", "", "POSTCODE", "Ljava/lang/String;", "DEFAULT_POST_CODE", "STORE", "LOGIN_EXCEPTION", "LOGIN_NO_STORE", "NO_STORE_FOR_PICKUP", "ADOBE_SHOPPER_ID_TYPE", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public GuestLoginInteractorImpl(GuestLoginRepository guestLoginRepository, SchedulersProvider schedulersProvider, LegacyShoppingModeRepository shoppingModeRepository, ShopAccountInteractor accountInteractor, TrolleyInteractor trolleyInteractor, AppConfigurationInteractor appConfigurationInteractor, CollectionModeInteractor collectionModeInteractor, PickUpLocatorRepository pickUpLocatorRepository, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(shoppingModeRepository, "shoppingModeRepository");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(appConfigurationInteractor, "appConfigurationInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(pickUpLocatorRepository, "pickUpLocatorRepository");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.f7455a = guestLoginRepository;
        this.b = schedulersProvider;
        this.c = shoppingModeRepository;
        this.d = accountInteractor;
        this.e = trolleyInteractor;
        this.f = appConfigurationInteractor;
        this.g = collectionModeInteractor;
        this.h = pickUpLocatorRepository;
        this.i = shopAppRegionInteractor;
    }

    public static Completable a(GuestLoginInteractorImpl guestLoginInteractorImpl, Scheduler scheduler, String str, int i) {
        SchedulersProvider schedulersProvider = guestLoginInteractorImpl.b;
        if ((i & 1) != 0) {
            scheduler = schedulersProvider.d();
        }
        Function1 function1 = null;
        Scheduler schedulerB = (i & 2) != 0 ? schedulersProvider.b() : null;
        if ((i & 4) != 0) {
            str = null;
        }
        if (guestLoginInteractorImpl.i.b() == Region.j) {
            return CompletableEmpty.d;
        }
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("device_auth_token", guestLoginInteractorImpl.f.getDeviceId()));
        if (str != null) {
            linkedHashMapL.put("store", str);
        } else if (guestLoginInteractorImpl.g.w() instanceof CollectionMode.Delivery) {
            linkedHashMapL.put("postcode", "2000");
        }
        Single<LoginResult> singleA = guestLoginInteractorImpl.f7455a.f7456a.a(linkedHashMapL);
        if (scheduler != null) {
            singleA = singleA.h(scheduler);
        }
        if (schedulerB != null) {
            singleA = singleA.f(schedulerB);
        }
        au.com.woolworths.feature.shop.delivery.address.a aVar = new au.com.woolworths.feature.shop.delivery.address.a(new androidx.lifecycle.compose.b(function1, guestLoginInteractorImpl, linkedHashMapL, 21), 10);
        singleA.getClass();
        return new CompletableFromSingle(new SingleDoOnError(new SingleDoOnSuccess(singleA, aVar), new au.com.woolworths.feature.shop.delivery.address.a(new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(7, guestLoginInteractorImpl, linkedHashMapL), 11)));
    }

    public final void b(LoginResult loginResult, LinkedHashMap linkedHashMap) {
        ShopAccountInteractor shopAccountInteractor = this.d;
        shopAccountInteractor.T();
        if (loginResult != null) {
            ShopAccountInteractor shopAccountInteractor2 = this.d;
            synchronized (shopAccountInteractor2) {
                Member memberFromLoginResult = Member.getMemberFromLoginResult(loginResult);
                Intrinsics.g(memberFromLoginResult, "getMemberFromLoginResult(...)");
                String email = loginResult.email;
                Intrinsics.g(email, "email");
                shopAccountInteractor2.U(memberFromLoginResult, email);
            }
        }
        AccountRepository accountRepository = shopAccountInteractor.b;
        accountRepository.getClass();
        SharedPreferences.Editor editorEdit = accountRepository.b.edit();
        editorEdit.putString("guest_login_data", accountRepository.c.k(linkedHashMap, new TypeToken<Map<String, ? extends String>>() { // from class: au.com.woolworths.shop.auth.AccountRepository$saveGuestLoginData$1$1
        }.getType()));
        editorEdit.apply();
        this.e.K();
    }

    public final Completable c() {
        return g(a(this, null, null, 7));
    }

    public final MaybeFlatMapCompletable d() {
        final ShopAccountInteractor shopAccountInteractor = this.d;
        return new MaybeFlatMapCompletable(new MaybeFilterSingle(new SingleFromCallable(new androidx.webkit.internal.a(new PropertyReference0Impl(shopAccountInteractor) { // from class: au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl$loginIfNeeded$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((ShopAccountInteractor) this.receiver).S());
            }
        }, 3)), new au.com.woolworths.feature.shop.delivery.address.a(new d(24), 12)), new au.com.woolworths.feature.shop.delivery.address.a(new a(this, 0), 7));
    }

    public final Completable e() {
        return a(this, null, null, 15);
    }

    public final Completable f(String storeNo) {
        Intrinsics.h(storeNo, "storeNo");
        if (this.d.d()) {
            throw new IllegalStateException("Cannot login as guest when logged in as full user");
        }
        return a(this, null, storeNo, 11);
    }

    public final Completable g(Completable completable) {
        boolean z = this.c.m() != null;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: au.com.woolworths.feature.shop.login.guest.b
            public final /* synthetic */ GuestLoginInteractorImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.e.c.f();
                    default:
                        GuestLoginInteractorImpl guestLoginInteractorImpl = this.e;
                        String strB = guestLoginInteractorImpl.g.B();
                        if (strB != null) {
                            return new CompletableFromSingle(new SingleDoOnError(RxExtKt.a(guestLoginInteractorImpl.h.c.a(new UpdateSelectedPickUpLocationRequest(strB))), new au.com.woolworths.feature.shop.delivery.address.a(new a(guestLoginInteractorImpl, 1), 8)));
                        }
                        Timber.f27013a.o("Pick up collection mode selected but no store saved", new Object[0]);
                        return CompletableEmpty.d;
                }
            }
        };
        if (z) {
            completable = new CompletableAndThenCompletable(completable, (CompletableSource) function0.invoke());
        }
        final int i2 = 1;
        return this.g.G() ? new CompletableAndThenCompletable(completable, (CompletableSource) new Function0(this) { // from class: au.com.woolworths.feature.shop.login.guest.b
            public final /* synthetic */ GuestLoginInteractorImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.e.c.f();
                    default:
                        GuestLoginInteractorImpl guestLoginInteractorImpl = this.e;
                        String strB = guestLoginInteractorImpl.g.B();
                        if (strB != null) {
                            return new CompletableFromSingle(new SingleDoOnError(RxExtKt.a(guestLoginInteractorImpl.h.c.a(new UpdateSelectedPickUpLocationRequest(strB))), new au.com.woolworths.feature.shop.delivery.address.a(new a(guestLoginInteractorImpl, 1), 8)));
                        }
                        Timber.f27013a.o("Pick up collection mode selected but no store saved", new Object[0]);
                        return CompletableEmpty.d;
                }
            }
        }.invoke()) : completable;
    }
}
