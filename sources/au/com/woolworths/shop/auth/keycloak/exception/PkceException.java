package au.com.woolworths.shop.auth.keycloak.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/exception/PkceException;", "", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PkceException extends Throwable {
    public final String d;

    public PkceException() {
        super("Login failed as PKCE cannot be done.");
        this.d = "Login failed as PKCE cannot be done.";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }
}
