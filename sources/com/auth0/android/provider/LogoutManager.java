package com.auth0.android.provider;

import com.auth0.android.Auth0;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.Callback;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/provider/LogoutManager;", "Lcom/auth0/android/provider/ResumableManager;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LogoutManager extends ResumableManager {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f13663a;
    public final HashMap b;
    public final CustomTabsOptions c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/auth0/android/provider/LogoutManager$Companion;", "", "", "KEY_CLIENT_ID", "Ljava/lang/String;", "KEY_FEDERATED", "KEY_RETURN_TO_URL", "KEY_USER_AGENT", "kotlin.jvm.PlatformType", "TAG", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public LogoutManager(Auth0 account, Callback callback, String returnToUrl, CustomTabsOptions ctOptions) {
        Intrinsics.h(account, "account");
        Intrinsics.h(returnToUrl, "returnToUrl");
        Intrinsics.h(ctOptions, "ctOptions");
        this.f13663a = callback;
        HashMap map = new HashMap();
        this.b = map;
        map.put("returnTo", returnToUrl);
        this.c = ctOptions;
    }

    @Override // com.auth0.android.provider.ResumableManager
    public final void a(AuthenticationException authenticationException) {
        this.f13663a.a(authenticationException);
    }

    @Override // com.auth0.android.provider.ResumableManager
    public final boolean b(AuthorizeResult authorizeResult) {
        boolean zA = authorizeResult.a();
        Callback callback = this.f13663a;
        if (zA) {
            callback.a(new AuthenticationException("a0.authentication_canceled", "The user closed the browser app so the logout was cancelled."));
            return true;
        }
        callback.onSuccess(null);
        return true;
    }
}
