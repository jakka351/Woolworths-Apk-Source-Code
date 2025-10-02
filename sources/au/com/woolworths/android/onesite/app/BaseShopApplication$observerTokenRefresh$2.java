package au.com.woolworths.android.onesite.app;

import au.com.woolworths.android.onesite.analytics.adobe.data.ErrorData;
import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/app/BaseShopApplication$observerTokenRefresh$2", "Lau/com/woolworths/android/onesite/network/RefreshTokenListener$Callback;", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseShopApplication$observerTokenRefresh$2 implements RefreshTokenListener.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseShopApplication f4078a;

    public BaseShopApplication$observerTokenRefresh$2(BaseShopApplication baseShopApplication) {
        this.f4078a = baseShopApplication;
    }

    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    public final void a(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        LegacyShopAnalyticsManager legacyShopAnalyticsManagerB = this.f4078a.i().B();
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        legacyShopAnalyticsManagerB.d(ErrorData.Companion.a("Refresh token authenticator", message));
    }

    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    public final void b(String accessToken) {
        Intrinsics.h(accessToken, "accessToken");
    }

    @Override // au.com.woolworths.android.onesite.network.RefreshTokenListener.Callback
    public final Object c(ContinuationImpl continuationImpl) {
        BaseShopApplication baseShopApplication = this.f4078a;
        BuildersKt.c(baseShopApplication.g, null, null, new BaseShopApplication$observerTokenRefresh$2$onForceLogout$2(baseShopApplication, null), 3);
        return Unit.f24250a;
    }
}
