package au.com.woolworths.android.onesite.app;

import au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData;
import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/app/BaseShopApplication$observerTokenRefresh$1", "Lau/com/woolworths/android/onesite/network/RefreshTokenListener$Callback;", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseShopApplication$observerTokenRefresh$1 implements RefreshTokenListener.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseShopApplication f4077a;

    public BaseShopApplication$observerTokenRefresh$1(BaseShopApplication baseShopApplication) {
        this.f4077a = baseShopApplication;
    }

    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    public final void a(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        LegacyShopAnalyticsManager legacyShopAnalyticsManagerB = this.f4077a.i().B();
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        legacyShopAnalyticsManagerB.d(ErrorData.Companion.a("Refresh token authenticator", message));
    }

    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    public final void b(String accessToken) {
        Intrinsics.h(accessToken, "accessToken");
        this.f4077a.i().n().h();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.InterruptedException {
        /*
            r11 = this;
            au.com.woolworths.android.onesite.app.BaseShopApplication r0 = r11.f4077a
            kotlinx.coroutines.internal.ContextScope r1 = r0.g
            boolean r2 = r12 instanceof au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$1
            if (r2 == 0) goto L17
            r2 = r12
            au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$1 r2 = (au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$1 r2 = new au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$1
            r2.<init>(r11, r12)
        L1c:
            java.lang.Object r12 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            r5 = 0
            kotlin.Unit r6 = kotlin.Unit.f24250a
            r7 = 1
            if (r4 == 0) goto L36
            if (r4 != r7) goto L2e
            kotlin.ResultKt.b(r12)
            goto L97
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            kotlin.ResultKt.b(r12)
            au.com.woolworths.android.onesite.app.di.ShopEntryPoint r12 = r0.i()
            au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl r12 = r12.L()
            au.com.woolworths.android.onesite.rxutils.SchedulersProvider r4 = r12.b
            io.reactivex.internal.schedulers.TrampolineScheduler r4 = r4.a()
            r8 = 12
            io.reactivex.Completable r4 = au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl.a(r12, r4, r5, r8)
            io.reactivex.Completable r4 = r12.g(r4)
            au.com.woolworths.feature.shop.homepage.presentation.modeselector.d r8 = new au.com.woolworths.feature.shop.homepage.presentation.modeselector.d
            r9 = 23
            r8.<init>(r9)
            au.com.woolworths.feature.shop.delivery.address.a r9 = new au.com.woolworths.feature.shop.delivery.address.a
            r10 = 9
            r9.<init>(r8, r10)
            io.reactivex.internal.operators.completable.CompletableOnErrorComplete r8 = new io.reactivex.internal.operators.completable.CompletableOnErrorComplete
            r8.<init>(r4, r9)
            au.com.woolworths.feature.shop.account.viewmodel.delete.a r4 = new au.com.woolworths.feature.shop.account.viewmodel.delete.a
            r9 = 2
            r4.<init>(r12, r9)
            io.reactivex.internal.operators.completable.CompletablePeek r12 = new io.reactivex.internal.operators.completable.CompletablePeek
            io.reactivex.functions.Consumer r9 = io.reactivex.internal.functions.Functions.d
            r12.<init>(r8, r9, r4)
            io.reactivex.internal.observers.BlockingMultiObserver r4 = new io.reactivex.internal.observers.BlockingMultiObserver
            r4.<init>()
            r12.a(r4)
            r4.a()
            au.com.woolworths.android.onesite.app.di.ShopEntryPoint r12 = r0.i()
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r12 = r12.t()
            r12.clearRewardsData()
            au.com.woolworths.android.onesite.app.di.ShopEntryPoint r12 = r0.i()
            au.com.woolworths.auth.auth0.Auth0AuthManager r12 = r12.E()
            r2.r = r7
            r12.e(r2)
            if (r6 != r3) goto L97
            return r3
        L97:
            au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$2 r12 = new au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$2
            r12.<init>(r0, r5)
            r2 = 3
            kotlinx.coroutines.BuildersKt.c(r1, r5, r5, r12, r2)
            au.com.woolworths.android.onesite.app.di.ShopEntryPoint r12 = r0.i()
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r12 = r12.I()
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r3 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.l
            boolean r12 = r12.c(r3)
            if (r12 == 0) goto Lb8
            au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$3 r12 = new au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1$onForceLogout$3
            r12.<init>(r0, r5)
            kotlinx.coroutines.BuildersKt.c(r1, r5, r5, r12, r2)
        Lb8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.app.BaseShopApplication$observerTokenRefresh$1.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
