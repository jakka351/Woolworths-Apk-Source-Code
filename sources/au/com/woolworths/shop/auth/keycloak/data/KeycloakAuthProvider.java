package au.com.woolworths.shop.auth.keycloak.data;

import android.content.Context;
import android.content.Intent;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.shop.auth.keycloak.KeycloakAuthManager$signInOrRegister$2$1;
import au.com.woolworths.shop.auth.keycloak.exception.KeycloakAuthException;
import au.com.woolworths.shop.auth.keycloak.ui.KeycloakAuthActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakAuthProvider;", "", "Builder", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakAuthProvider {

    /* renamed from: a, reason: collision with root package name */
    public static KeycloakAuthManager$signInOrRegister$2$1 f10239a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/data/KeycloakAuthProvider$Builder;", "", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f10240a;

        public final void a(Context context, KeycloakAuthManager$signInOrRegister$2$1 keycloakAuthManager$signInOrRegister$2$1) {
            KeycloakAuthProvider.f10239a = keycloakAuthManager$signInOrRegister$2$1;
            String str = this.f10240a;
            if (str == null) {
                throw new KeycloakAuthException("You must call withUrl(url) before calling start(context, callback).", new IllegalArgumentException());
            }
            int i = KeycloakAuthActivity.u;
            Intent intent = new Intent(context, (Class<?>) KeycloakAuthActivity.class);
            intent.putExtra("authUrl", new KeycloakAuthActivity.Companion.AuthUrl(str));
            context.startActivity(intent);
        }

        public final void b(String url) {
            Intrinsics.h(url, "url");
            this.f10240a = url;
        }
    }

    public static final void a(KeycloakAuthException keycloakAuthException) {
        KeycloakAuthManager$signInOrRegister$2$1 keycloakAuthManager$signInOrRegister$2$1 = f10239a;
        if (keycloakAuthManager$signInOrRegister$2$1 != null) {
            keycloakAuthManager$signInOrRegister$2$1.f10236a.resumeWith(ResultKt.a(keycloakAuthException));
            f10239a = null;
        } else {
            Bark.Companion companion = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.w), "keycloakAuthCallback listener is not registered", null);
        }
    }
}
