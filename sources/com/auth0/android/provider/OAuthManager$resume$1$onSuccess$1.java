package com.auth0.android.provider;

import com.auth0.android.Auth0Exception;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.Callback;
import com.auth0.android.result.Credentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/auth0/android/provider/OAuthManager$resume$1$onSuccess$1", "Lcom/auth0/android/callback/Callback;", "Ljava/lang/Void;", "Lcom/auth0/android/Auth0Exception;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OAuthManager$resume$1$onSuccess$1 implements Callback<Void, Auth0Exception> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OAuthManager f13667a;
    public final /* synthetic */ Credentials b;

    public OAuthManager$resume$1$onSuccess$1(OAuthManager oAuthManager, Credentials credentials) {
        this.f13667a = oAuthManager;
        this.b = credentials;
    }

    @Override // com.auth0.android.callback.Callback
    public final void a(Auth0Exception error) {
        Intrinsics.h(error, "error");
        this.f13667a.f13664a.a(new AuthenticationException("Could not verify the ID token", error));
    }

    @Override // com.auth0.android.callback.Callback
    public final void onSuccess(Object obj) {
        this.f13667a.f13664a.onSuccess(this.b);
    }
}
