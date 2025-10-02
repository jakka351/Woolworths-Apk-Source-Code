package com.auth0.android.request.internal;

import com.auth0.android.Auth0Exception;
import com.auth0.android.authentication.AuthenticationAPIClient$Companion$createErrorAdapter$1;
import com.auth0.android.request.DefaultClient;
import com.auth0.android.request.HttpMethod;
import com.auth0.android.request.NetworkingClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/internal/RequestFactory;", "Lcom/auth0/android/Auth0Exception;", "U", "", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RequestFactory<U extends Auth0Exception> {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkingClient f13688a;
    public final AuthenticationAPIClient$Companion$createErrorAdapter$1 b;
    public final LinkedHashMap c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/auth0/android/request/internal/RequestFactory$Companion;", "", "", "ACCEPT_LANGUAGE_HEADER", "Ljava/lang/String;", "AUTH0_CLIENT_INFO_HEADER", "DEFAULT_LOCALE_IF_MISSING", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public RequestFactory(DefaultClient client, AuthenticationAPIClient$Companion$createErrorAdapter$1 authenticationAPIClient$Companion$createErrorAdapter$1) {
        Intrinsics.h(client, "client");
        this.f13688a = client;
        this.b = authenticationAPIClient$Companion$createErrorAdapter$1;
        String string = Locale.getDefault().toString();
        Intrinsics.g(string, "getDefault().toString()");
        this.c = MapsKt.l(new Pair("Accept-Language", string.length() <= 0 ? "en_US" : string));
    }

    public final BaseRequest a(HttpMethod httpMethod, String url, GsonAdapter gsonAdapter, AuthenticationAPIClient$Companion$createErrorAdapter$1 authenticationAPIClient$Companion$createErrorAdapter$1) {
        CommonThreadSwitcher commonThreadSwitcherA = CommonThreadSwitcher.b.a();
        Intrinsics.h(url, "url");
        NetworkingClient client = this.f13688a;
        Intrinsics.h(client, "client");
        BaseRequest baseRequest = new BaseRequest(httpMethod, url, client, gsonAdapter, authenticationAPIClient$Companion$createErrorAdapter$1, commonThreadSwitcherA);
        LinkedHashMap linkedHashMap = this.c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            baseRequest.a((String) entry.getKey(), (String) entry.getValue());
            arrayList.add(baseRequest);
        }
        return baseRequest;
    }
}
