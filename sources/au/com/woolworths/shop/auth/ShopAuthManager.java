package au.com.woolworths.shop.auth;

import android.content.Context;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.auth.api.AuthManagerApi;
import au.com.woolworths.auth.auth0.Auth0AuthManager;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAuthManager;", "Lau/com/woolworths/auth/api/AuthManagerApi;", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAuthManager implements AuthManagerApi {

    /* renamed from: a, reason: collision with root package name */
    public final Auth0AuthManager f10231a;
    public final KeycloakAuthManager b;
    public final ShopAppRegionInteractor c;
    public final DispatcherProvider d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ShopAuthManager(Auth0AuthManager auth0AuthManager, KeycloakAuthManager keycloakAuthManager, ShopAppRegionInteractor shopAppRegionInteractor, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(auth0AuthManager, "auth0AuthManager");
        Intrinsics.h(keycloakAuthManager, "keycloakAuthManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f10231a = auth0AuthManager;
        this.b = keycloakAuthManager;
        this.c = shopAppRegionInteractor;
        this.d = dispatcherProvider;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object a(Continuation continuation) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShopAuthManager$hasCredentials$2(this, null), continuation);
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object b(ContinuationImpl continuationImpl) {
        return g().b(continuationImpl);
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object c(Context context, SuspendLambda suspendLambda) {
        Object objC = g().c(context, suspendLambda);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object d(Context context, String str, Boolean bool, Map map, Continuation continuation) {
        return g().d(context, str, bool, null, continuation);
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object e(ContinuationImpl continuationImpl) throws Throwable {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(DefaultIoScheduler.f, new ShopAuthManager$clearCredentials$2(this, null), continuationImpl);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.auth.api.AuthManagerApi
    public final Object f(Context context, Map map, Continuation continuation) {
        return g().f(context, null, continuation);
    }

    public final AuthManagerApi g() {
        int iOrdinal = this.c.b().ordinal();
        if (iOrdinal == 0) {
            return this.f10231a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
