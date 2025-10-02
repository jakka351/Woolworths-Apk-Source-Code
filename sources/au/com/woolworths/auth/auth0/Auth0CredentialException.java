package au.com.woolworths.auth.auth0;

import au.com.woolworths.auth.api.CredentialException;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.provider.TokenValidationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/auth/auth0/Auth0CredentialException;", "Lau/com/woolworths/auth/api/CredentialException;", "auth-auth0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Auth0CredentialException extends CredentialException {
    public Auth0CredentialException(String str, Throwable th) {
        super(str, th);
    }

    @Override // au.com.woolworths.auth.api.CredentialException
    public final boolean a() {
        Throwable cause = getCause();
        AuthenticationException authenticationException = cause instanceof AuthenticationException ? (AuthenticationException) cause : null;
        if (authenticationException == null) {
            return false;
        }
        String str = authenticationException.d;
        int i = authenticationException.f;
        String str2 = authenticationException.e;
        if ("mfa_required".equals(str) || "a0.mfa_required".equals(str) || "a0.mfa_registration_required".equals(str) || "unsupported_challenge_type".equals(str) || "a0.mfa_invalid_code".equals(str)) {
            return true;
        }
        if ("invalid_grant".equals(str) && "Invalid otp_code.".equals(str2)) {
            return true;
        }
        if (Intrinsics.c(str, "invalid_grant") && Intrinsics.c(str2, "Invalid binding_code.")) {
            return true;
        }
        if (Intrinsics.c(str, "invalid_grant") && Intrinsics.c(str2, "MFA Authorization rejected.")) {
            return true;
        }
        if ("expired_token".equals(str) && "mfa_token is expired".equals(str2)) {
            return true;
        }
        if (("invalid_grant".equals(str) && "Malformed mfa_token".equals(str2)) || "unauthorized".equals(str) || "access_denied".equals(str)) {
            return true;
        }
        if ("invalid_grant".equals(str) && 403 == i && "The refresh_token was generated for a user who doesn't exist anymore.".equals(str2)) {
            return true;
        }
        if (("invalid_grant".equals(str) && "Unknown or invalid refresh token.".equals(str2)) || (authenticationException.getCause() instanceof TokenValidationException) || "too_many_attempts".equals(str)) {
            return true;
        }
        if (i != 403) {
            return false;
        }
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        return str.equals("invalid_grant");
    }

    public final String b() {
        Throwable cause = getCause();
        AuthenticationException authenticationException = cause instanceof AuthenticationException ? (AuthenticationException) cause : null;
        if (authenticationException == null) {
            return null;
        }
        String str = authenticationException.d;
        return str != null ? str : "a0.sdk.internal_error.unknown";
    }
}
