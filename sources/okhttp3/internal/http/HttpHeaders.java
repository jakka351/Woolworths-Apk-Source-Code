package okhttp3.internal.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okio.Buffer;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f26727a;
    public static final ByteString b;

    static {
        ByteString byteString = ByteString.g;
        f26727a = ByteString.Companion.b("\"\\");
        b = ByteString.Companion.b("\t ,=");
    }

    public static final boolean a(Response response) {
        if (Intrinsics.c(response.d.b, "HEAD")) {
            return false;
        }
        int i = response.g;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && _UtilJvmKt.e(response) == -1 && !"chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0108, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0108, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(okio.Buffer r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(okio.Buffer, java.util.ArrayList):void");
    }

    public static final String c(Buffer buffer) {
        long jV = buffer.V(b);
        if (jV == -1) {
            jV = buffer.e;
        }
        if (jV != 0) {
            return buffer.r(jV, Charsets.f24671a);
        }
        return null;
    }

    public static final void d(CookieJar cookieJar, HttpUrl url, Headers headers) {
        Intrinsics.h(cookieJar, "<this>");
        Intrinsics.h(url, "url");
        Intrinsics.h(headers, "headers");
        if (cookieJar == CookieJar.f26674a) {
            return;
        }
        Cookie.k.getClass();
        List listC = Cookie.Companion.c(url, headers);
        if (listC.isEmpty()) {
            return;
        }
        cookieJar.b(url, listC);
    }

    public static final boolean e(Buffer buffer) {
        boolean z = false;
        while (!buffer.X1()) {
            byte bE = buffer.e(0L);
            if (bE != 44) {
                if (bE != 32 && bE != 9) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }
}
