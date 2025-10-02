package au.com.woolworths.auth.auth0;

import au.com.woolworths.auth.api.AuthException;
import com.auth0.android.authentication.AuthenticationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/auth/auth0/Auth0Exception;", "Lau/com/woolworths/auth/api/AuthException;", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Auth0Exception extends AuthException {
    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean a() {
        Throwable cause = getCause();
        AuthenticationException authenticationException = cause instanceof AuthenticationException ? (AuthenticationException) cause : null;
        if (authenticationException != null) {
            return "access_denied".equals(authenticationException.d);
        }
        return false;
    }

    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean b() {
        Throwable cause = getCause();
        AuthenticationException authenticationException = cause instanceof AuthenticationException ? (AuthenticationException) cause : null;
        if (authenticationException != null) {
            return "a0.browser_not_available".equals(authenticationException.d);
        }
        return false;
    }

    @Override // au.com.woolworths.auth.api.AuthException
    public final boolean c() {
        Throwable cause = getCause();
        AuthenticationException authenticationException = cause instanceof AuthenticationException ? (AuthenticationException) cause : null;
        if (authenticationException != null) {
            return "a0.authentication_canceled".equals(authenticationException.d);
        }
        return false;
    }
}
