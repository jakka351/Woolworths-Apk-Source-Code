package com.auth0.android.request;

import com.auth0.android.request.HttpMethod;
import com.auth0.android.request.internal.GsonProvider;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._HeadersCommonKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/request/DefaultClient;", "Lcom/auth0/android/request/NetworkingClient;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DefaultClient implements NetworkingClient {
    public static final MediaType d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f13674a = EmptyMap.d;
    public final Gson b = GsonProvider.f13685a;
    public final OkHttpClient c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/DefaultClient$Companion;", "", "", "DEFAULT_TIMEOUT_SECONDS", "I", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MediaType.e.getClass();
        d = MediaType.Companion.a("application/json; charset=utf-8");
    }

    public DefaultClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.c(10, timeUnit);
        builder.d(10, timeUnit);
        this.c = new OkHttpClient(builder);
    }

    @Override // com.auth0.android.request.NetworkingClient
    public final ServerResponse a(String url, RequestOptions options) throws NumberFormatException, IOException {
        Intrinsics.h(url, "url");
        Intrinsics.h(options, "options");
        HttpUrl.j.getClass();
        HttpUrl httpUrlC = HttpUrl.Companion.c(url);
        Request.Builder builder = new Request.Builder();
        HttpUrl.Builder builderG = httpUrlC.g();
        if (options.getF13679a() instanceof HttpMethod.GET) {
            LinkedHashMap b = options.getB();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : b.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                Intrinsics.f(value, "null cannot be cast to non-null type kotlin.String");
                builderG.c(str, (String) value);
                arrayList.add(builderG);
            }
            builder.e(options.getF13679a().toString(), null);
        } else {
            RequestBody.Companion companion = RequestBody.f26692a;
            String strJ = this.b.j(options.getB());
            Intrinsics.g(strJ, "gson.toJson(options.parameters)");
            companion.getClass();
            builder.e(options.getF13679a().toString(), RequestBody.Companion.b(strJ, d));
        }
        Headers.Companion companion2 = Headers.e;
        LinkedHashMap linkedHashMapM = MapsKt.m(this.f13674a, options.getC());
        companion2.getClass();
        String[] strArr = new String[linkedHashMapM.size() * 2];
        int i = 0;
        for (Map.Entry entry3 : linkedHashMapM.entrySet()) {
            String str2 = (String) entry3.getKey();
            String str3 = (String) entry3.getValue();
            String string = StringsKt.k0(str2).toString();
            String string2 = StringsKt.k0(str3).toString();
            _HeadersCommonKt.b(string);
            _HeadersCommonKt.c(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        Headers headers = new Headers(strArr);
        builder.f26691a = builderG.d();
        builder.d(headers);
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.c.a(new okhttp3.Request(builder)));
        int i2 = responseExecute.g;
        ResponseBody responseBody = responseExecute.j;
        Intrinsics.e(responseBody);
        return new ServerResponse(i2, responseBody.U0().z2(), responseExecute.i.h());
    }
}
