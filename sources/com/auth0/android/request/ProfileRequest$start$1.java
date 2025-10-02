package com.auth0.android.request;

import com.auth0.android.Auth0Exception;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.Callback;
import com.auth0.android.result.Credentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/auth0/android/request/ProfileRequest$start$1", "Lcom/auth0/android/callback/Callback;", "Lcom/auth0/android/result/Credentials;", "Lcom/auth0/android/authentication/AuthenticationException;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProfileRequest$start$1 implements Callback<Credentials, AuthenticationException> {
    @Override // com.auth0.android.callback.Callback
    public final void a(Auth0Exception auth0Exception) {
        AuthenticationException error = (AuthenticationException) auth0Exception;
        Intrinsics.h(error, "error");
        throw null;
    }

    @Override // com.auth0.android.callback.Callback
    public final void onSuccess(Object obj) {
        Credentials credentials = (Credentials) obj;
        Intrinsics.h(credentials, "credentials");
        throw null;
    }
}
