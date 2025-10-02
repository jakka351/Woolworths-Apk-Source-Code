package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f26730a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        Intrinsics.h(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }
}
