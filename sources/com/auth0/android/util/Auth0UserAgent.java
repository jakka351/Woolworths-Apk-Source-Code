package com.auth0.android.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.auth0.android.request.internal.GsonProvider;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/util/Auth0UserAgent;", "", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Auth0UserAgent {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13690a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/auth0/android/util/Auth0UserAgent$Companion;", "", "", "ANDROID_KEY", "Ljava/lang/String;", "ENV_KEY", "HEADER_NAME", "LIBRARY_VERSION_KEY", "NAME_KEY", "VERSION_KEY", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public Auth0UserAgent() {
        TextUtils.isEmpty("Auth0.Android");
        TextUtils.isEmpty("2.11.0");
        HashMap map = new HashMap();
        map.put("android", String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty(null)) {
            map.put("auth0.android", null);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.g(mapUnmodifiableMap, "unmodifiableMap(tmpEnv)");
        this.f13690a = mapUnmodifiableMap;
        HashMap map2 = new HashMap();
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "Auth0.Android");
        map2.put("version", "2.11.0");
        map2.put("env", mapUnmodifiableMap);
        String json = GsonProvider.f13685a.j(map2);
        Intrinsics.g(json, "json");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.g(UTF_8, "UTF_8");
        byte[] bytes = json.getBytes(UTF_8);
        Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrEncode = Base64.encode(bytes, 10);
        Intrinsics.g(bArrEncode, "encode(bytes, Base64.URL_SAFE or Base64.NO_WRAP)");
        this.b = new String(bArrEncode, UTF_8);
    }
}
