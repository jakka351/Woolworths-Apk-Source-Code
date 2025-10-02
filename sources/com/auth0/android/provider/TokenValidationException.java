package com.auth0.android.provider;

import com.auth0.android.Auth0Exception;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/provider/TokenValidationException;", "Lcom/auth0/android/Auth0Exception;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class TokenValidationException extends Auth0Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenValidationException(String message, int i) {
        super(message, null);
        Intrinsics.h(message, "message");
    }
}
