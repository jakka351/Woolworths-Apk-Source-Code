package com.auth0.android.authentication;

import android.util.Log;
import com.auth0.android.Auth0Exception;
import com.auth0.android.request.ErrorAdapter;
import com.auth0.android.request.internal.GsonAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/auth0/android/authentication/AuthenticationAPIClient$Companion$createErrorAdapter$1", "Lcom/auth0/android/request/ErrorAdapter;", "Lcom/auth0/android/authentication/AuthenticationException;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthenticationAPIClient$Companion$createErrorAdapter$1 implements ErrorAdapter<AuthenticationException> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GsonAdapter f13652a;

    public AuthenticationAPIClient$Companion$createErrorAdapter$1(GsonAdapter gsonAdapter) {
        this.f13652a = gsonAdapter;
    }

    public final Object a(Exception exc) {
        return new AuthenticationException("Something went wrong", new Auth0Exception("Something went wrong", exc));
    }

    public final Object b(int i, InputStreamReader inputStreamReader) {
        Map values = (Map) this.f13652a.f13684a.fromJson(inputStreamReader);
        Intrinsics.h(values, "values");
        AuthenticationException authenticationException = new AuthenticationException(0);
        authenticationException.f = i;
        authenticationException.g = values;
        String str = (String) values.get(values.containsKey("error") ? "error" : "code");
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        authenticationException.d = str;
        if (values.containsKey(lqlqqlq.mmm006Dm006Dm)) {
            Object obj = values.get(lqlqqlq.mmm006Dm006Dm);
            if (obj instanceof String) {
                authenticationException.e = (String) obj;
                return authenticationException;
            }
            if ((obj instanceof Map) && "invalid_password".equals(str) && "PasswordStrengthError".equals(values.get(AppMeasurementSdk.ConditionalUserProperty.NAME))) {
                authenticationException.e = new PasswordStrengthErrorParser((Map) obj).a();
            }
        } else {
            authenticationException.e = (String) values.get("error_description");
            if ("invalid_request".equals(str) && ("OIDC conformant clients cannot use /oauth/access_token".equals(authenticationException.getDescription()) || "OIDC conformant clients cannot use /oauth/ro".equals(authenticationException.getDescription()))) {
                Log.w("AuthenticationAPIClient", "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
                return authenticationException;
            }
        }
        return authenticationException;
    }
}
