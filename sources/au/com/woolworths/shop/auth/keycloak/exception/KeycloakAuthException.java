package au.com.woolworths.shop.auth.keycloak.exception;

import au.com.woolworths.auth.api.AuthException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/exception/KeycloakAuthException;", "Lau/com/woolworths/auth/api/AuthException;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakAuthException extends AuthException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeycloakAuthException(String message, Throwable th) {
        super(message, th);
        Intrinsics.h(message, "message");
    }

    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean a() {
        return getCause() instanceof PkceException;
    }

    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean b() {
        return getCause() instanceof BrowserNotInstalledException;
    }

    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean c() {
        return getCause() instanceof AuthCancelledException;
    }
}
