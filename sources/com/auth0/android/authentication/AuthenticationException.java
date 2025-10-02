package com.auth0.android.authentication;

import android.text.TextUtils;
import com.auth0.android.Auth0Exception;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/authentication/AuthenticationException;", "Lcom/auth0/android/Auth0Exception;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthenticationException extends Auth0Exception {
    public String d;
    public String e;
    public int f;
    public Map g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/auth0/android/authentication/AuthenticationException$Companion;", "", "", "CODE_KEY", "Ljava/lang/String;", "DEFAULT_MESSAGE", "DESCRIPTION_KEY", "ERROR_DESCRIPTION_KEY", "ERROR_KEY", "ERROR_OIDC_ACCESS_TOKEN", "ERROR_OIDC_RO", "ERROR_VALUE_AUTHENTICATION_CANCELED", "NAME_KEY", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationException(String code, String str) {
        this(0);
        Intrinsics.h(code, "code");
        this.d = code;
        this.e = str;
    }

    public final String getDescription() {
        String str = this.d;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2)) {
            Intrinsics.e(str2);
            return str2;
        }
        if (!"a0.sdk.internal_error.unknown".equals(str != null ? str : "a0.sdk.internal_error.unknown")) {
            return "Failed with unknown error";
        }
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        return String.format("Received error with code %s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public AuthenticationException(int i) {
        super("An error occurred when trying to authenticate with the server.", null);
    }
}
