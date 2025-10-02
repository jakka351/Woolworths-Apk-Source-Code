package au.com.woolworths.shop.auth;

import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.network.RefreshTokenListener;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/ShopAuthenticator;", "Lokhttp3/Authenticator;", "Lau/com/woolworths/android/onesite/network/RefreshTokenListener;", "shop-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAuthenticator implements Authenticator, RefreshTokenListener {
    public final ShopAppTokenAuthenticator b;
    public final KeycloakTokenAuthenticator c;
    public final ShopAppRegionInteractor d;

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

    public ShopAuthenticator(ShopAppTokenAuthenticator auth0TokenAuthenticator, KeycloakTokenAuthenticator keycloakTokenAuthenticator, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(auth0TokenAuthenticator, "auth0TokenAuthenticator");
        Intrinsics.h(keycloakTokenAuthenticator, "keycloakTokenAuthenticator");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.b = auth0TokenAuthenticator;
        this.c = keycloakTokenAuthenticator;
        this.d = shopAppRegionInteractor;
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        Authenticator authenticator;
        int iOrdinal = this.d.b().ordinal();
        if (iOrdinal == 0) {
            authenticator = this.b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            authenticator = this.c;
        }
        return authenticator.a(route, response);
    }
}
