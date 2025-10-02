package com.auth0.android.provider;

import android.text.TextUtils;
import com.auth0.android.Auth0Exception;
import com.auth0.android.callback.Callback;
import com.auth0.android.request.internal.Jwt;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/auth0/android/provider/OAuthManager$assertValidIdToken$signatureVerifierCallback$1", "Lcom/auth0/android/callback/Callback;", "Lcom/auth0/android/provider/SignatureVerifier;", "Lcom/auth0/android/provider/TokenValidationException;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OAuthManager$assertValidIdToken$signatureVerifierCallback$1 implements Callback<SignatureVerifier, TokenValidationException> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OAuthManager$resume$1$onSuccess$1 f13665a;
    public final /* synthetic */ OAuthManager b;
    public final /* synthetic */ Jwt c;

    public OAuthManager$assertValidIdToken$signatureVerifierCallback$1(OAuthManager$resume$1$onSuccess$1 oAuthManager$resume$1$onSuccess$1, OAuthManager oAuthManager, Jwt jwt) {
        this.f13665a = oAuthManager$resume$1$onSuccess$1;
        this.b = oAuthManager;
        this.c = jwt;
    }

    @Override // com.auth0.android.callback.Callback
    public final void a(Auth0Exception auth0Exception) {
        TokenValidationException error = (TokenValidationException) auth0Exception;
        Intrinsics.h(error, "error");
        this.f13665a.a(error);
    }

    @Override // com.auth0.android.callback.Callback
    public final void onSuccess(Object obj) {
        SignatureVerifier result = (SignatureVerifier) obj;
        OAuthManager$resume$1$onSuccess$1 oAuthManager$resume$1$onSuccess$1 = this.f13665a;
        Intrinsics.h(result, "result");
        OAuthManager oAuthManager = this.b;
        String str = oAuthManager.g;
        Intrinsics.e(str);
        IdTokenVerificationOptions idTokenVerificationOptions = new IdTokenVerificationOptions(str, oAuthManager.e.f13651a.f13650a, result);
        LinkedHashMap linkedHashMap = oAuthManager.b;
        String str2 = (String) linkedHashMap.get("max_age");
        if (!TextUtils.isEmpty(str2)) {
            Intrinsics.e(str2);
            idTokenVerificationOptions.f = Integer.valueOf(str2);
        }
        idTokenVerificationOptions.e = (String) linkedHashMap.get("nonce");
        idTokenVerificationOptions.g = new Date(System.currentTimeMillis());
        idTokenVerificationOptions.d = (String) linkedHashMap.get("organization");
        try {
            IdTokenVerifier.a(this.c, idTokenVerificationOptions);
            oAuthManager$resume$1$onSuccess$1.onSuccess(null);
        } catch (TokenValidationException e) {
            oAuthManager$resume$1$onSuccess$1.a(e);
        }
    }
}
