package com.auth0.android.callback;

import com.auth0.android.Auth0Exception;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/callback/Callback;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/auth0/android/Auth0Exception;", "U", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Callback<T, U extends Auth0Exception> {
    void a(Auth0Exception auth0Exception);

    void onSuccess(Object obj);
}
