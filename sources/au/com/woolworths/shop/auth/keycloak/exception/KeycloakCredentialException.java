package au.com.woolworths.shop.auth.keycloak.exception;

import au.com.woolworths.auth.api.CredentialException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/auth/keycloak/exception/KeycloakCredentialException;", "Lau/com/woolworths/auth/api/CredentialException;", "auth-keycloak_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeycloakCredentialException extends CredentialException {
    /* JADX WARN: Illegal instructions before constructor call */
    public KeycloakCredentialException(Throwable th) {
        String message = th.getMessage();
        super(message == null ? "" : message, th);
    }

    @Override // au.com.woolworths.auth.api.CredentialException
    public final boolean a() {
        return (getCause() instanceof SessionExpiredException) || (getCause() instanceof PkceException) || (getCause() instanceof MissingCredentialsException);
    }
}
