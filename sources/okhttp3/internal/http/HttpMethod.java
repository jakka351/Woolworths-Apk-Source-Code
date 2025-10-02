package okhttp3.internal.http;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final HttpMethod f26728a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean a(String method) {
        Intrinsics.h(method, "method");
        return method.equals("POST") || method.equals("PATCH") || method.equals(Request.PUT) || method.equals("DELETE") || method.equals("MOVE");
    }

    public static final boolean b(String method) {
        Intrinsics.h(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
