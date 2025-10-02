package com.auth0.android.request.internal;

import androidx.camera.core.impl.utils.futures.e;
import com.auth0.android.Auth0Exception;
import com.auth0.android.authentication.AuthenticationAPIClient$Companion$createErrorAdapter$1;
import com.auth0.android.authentication.AuthenticationException;
import com.auth0.android.callback.Callback;
import com.auth0.android.request.HttpMethod;
import com.auth0.android.request.NetworkingClient;
import com.auth0.android.request.Request;
import com.auth0.android.request.RequestOptions;
import com.auth0.android.request.ServerResponse;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/internal/BaseRequest;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/auth0/android/Auth0Exception;", "U", "Lcom/auth0/android/request/Request;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BaseRequest<T, U extends Auth0Exception> implements Request<T, U> {

    /* renamed from: a, reason: collision with root package name */
    public final String f13681a;
    public final NetworkingClient b;
    public final GsonAdapter c;
    public final AuthenticationAPIClient$Companion$createErrorAdapter$1 d;
    public final CommonThreadSwitcher e;
    public final RequestOptions f;

    public BaseRequest(HttpMethod httpMethod, String url, NetworkingClient client, GsonAdapter gsonAdapter, AuthenticationAPIClient$Companion$createErrorAdapter$1 authenticationAPIClient$Companion$createErrorAdapter$1, CommonThreadSwitcher commonThreadSwitcher) {
        Intrinsics.h(url, "url");
        Intrinsics.h(client, "client");
        this.f13681a = url;
        this.b = client;
        this.c = gsonAdapter;
        this.d = authenticationAPIClient$Companion$createErrorAdapter$1;
        this.e = commonThreadSwitcher;
        this.f = new RequestOptions(httpMethod);
    }

    public final Request a(String name, String value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        this.f.c.put(name, value);
        return this;
    }

    public final Request b(Map map) {
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        if (map.containsKey("scope")) {
            linkedHashMapS.put("scope", OidcUtils.a((String) MapsKt.e("scope", map)));
        }
        this.f.b.putAll(linkedHashMapS);
        return this;
    }

    public final Object c() throws IOException {
        AuthenticationAPIClient$Companion$createErrorAdapter$1 authenticationAPIClient$Companion$createErrorAdapter$1 = this.d;
        try {
            ServerResponse serverResponseA = this.b.a(this.f13681a, this.f);
            InputStream inputStream = serverResponseA.b;
            int i = serverResponseA.f13680a;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            try {
                if (200 <= i && i < 300) {
                    try {
                        Object objFromJson = this.c.f13684a.fromJson(inputStreamReader);
                        inputStreamReader.close();
                        return objFromJson;
                    } catch (Exception e) {
                        throw ((Auth0Exception) authenticationAPIClient$Companion$createErrorAdapter$1.a(e));
                    }
                }
                try {
                    if (serverResponseA.a()) {
                        throw ((Auth0Exception) authenticationAPIClient$Companion$createErrorAdapter$1.b(i, inputStreamReader));
                    }
                    String strB = TextStreamsKt.b(inputStreamReader);
                    AuthenticationException authenticationException = new AuthenticationException(0);
                    authenticationException.d = "a0.sdk.internal_error.plain";
                    authenticationException.e = strB;
                    authenticationException.f = i;
                    throw authenticationException;
                } catch (Exception e2) {
                    throw ((Auth0Exception) authenticationAPIClient$Companion$createErrorAdapter$1.a(e2));
                }
            } catch (Throwable th) {
                throw th;
            }
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(inputStreamReader, th);
                throw th2;
            }
        } catch (IOException e3) {
            throw ((Auth0Exception) authenticationAPIClient$Companion$createErrorAdapter$1.a(e3));
        }
    }

    public final void d(Callback callback) {
        this.e.f13682a.f13683a.execute(new e(28, this, callback));
    }
}
