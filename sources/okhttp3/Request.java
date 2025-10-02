package okhttp3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f26690a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Map e;
    public CacheControl f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f26691a;
        public RequestBody d;
        public Object e = EmptyMap.d;
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final void a(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            this.c.a(name, value);
        }

        public final void b(CacheControl cacheControl) {
            Intrinsics.h(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.c.g("Cache-Control");
            } else {
                c("Cache-Control", string);
            }
        }

        public final void c(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            Headers.Builder builder = this.c;
            builder.getClass();
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.c(value, name);
            builder.g(name);
            _HeadersCommonKt.a(builder, name, value);
        }

        public final void d(Headers headers) {
            Intrinsics.h(headers, "headers");
            this.c = headers.g();
        }

        public final void e(String method, RequestBody requestBody) {
            Intrinsics.h(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f26728a;
                if (method.equals("POST") || method.equals(com.salesforce.marketingcloud.sfmcsdk.components.http.Request.PUT) || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(YU.a.h("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.b(method)) {
                throw new IllegalArgumentException(YU.a.h("method ", method, " must not have a request body.").toString());
            }
            this.b = method;
            this.d = requestBody;
        }

        public final void f(RequestBody body) {
            Intrinsics.h(body, "body");
            e("POST", body);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
        public final void g(Class type, Object obj) {
            Map mapB;
            Intrinsics.h(type, "type");
            KClass kClassE = JvmClassMappingKt.e(type);
            if (obj == null) {
                if (this.e.isEmpty()) {
                    return;
                }
                Object obj2 = this.e;
                Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                TypeIntrinsics.b(obj2).remove(kClassE);
                return;
            }
            if (this.e.isEmpty()) {
                mapB = new LinkedHashMap();
                this.e = mapB;
            } else {
                Object obj3 = this.e;
                Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapB = TypeIntrinsics.b(obj3);
            }
            if (kClassE.z(obj)) {
                mapB.put(kClassE, obj);
            } else {
                throw new ClassCastException("Value cannot be cast to " + kClassE.x());
            }
        }

        public final void h(String url) {
            Intrinsics.h(url, "url");
            HttpUrl.Companion companion = HttpUrl.j;
            if (StringsKt.W(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.g(strSubstring, "substring(...)");
                url = "http:".concat(strSubstring);
            } else if (StringsKt.W(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.g(strSubstring2, "substring(...)");
                url = "https:".concat(strSubstring2);
            }
            companion.getClass();
            this.f26691a = HttpUrl.Companion.c(url);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public Request(Builder builder) {
        Intrinsics.h(builder, "builder");
        HttpUrl httpUrl = builder.f26691a;
        if (httpUrl == null) {
            throw new IllegalStateException("url == null");
        }
        this.f26690a = httpUrl;
        this.b = builder.b;
        this.c = builder.c.e();
        this.d = builder.d;
        this.e = MapsKt.q(builder.e);
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.c);
        this.f = cacheControlA;
        return cacheControlA;
    }

    public final Builder b() {
        Builder builder = new Builder();
        builder.e = EmptyMap.d;
        builder.f26691a = this.f26690a;
        builder.b = this.b;
        builder.d = this.d;
        Map map = this.e;
        builder.e = map.isEmpty() ? EmptyMap.d : MapsKt.s(map);
        builder.c = this.c.g();
        return builder;
    }

    public final String toString() {
        StringBuilder sbO = androidx.constraintlayout.core.state.a.o(32, "Request{method=");
        sbO.append(this.b);
        sbO.append(", url=");
        sbO.append(this.f26690a);
        Headers headers = this.c;
        if (headers.size() != 0) {
            sbO.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : headers) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.d;
                String str2 = (String) pair2.e;
                if (i > 0) {
                    sbO.append(", ");
                }
                sbO.append(str);
                sbO.append(':');
                if (_UtilCommonKt.m(str)) {
                    str2 = "██";
                }
                sbO.append(str2);
                i = i2;
            }
            sbO.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sbO.append(", tags=");
            sbO.append(map);
        }
        sbO.append('}');
        return sbO.toString();
    }
}
