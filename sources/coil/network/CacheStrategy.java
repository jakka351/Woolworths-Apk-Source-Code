package coil.network;

import android.graphics.Bitmap;
import coil.util.Utils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal.http.DateFormattingKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/network/CacheStrategy;", "", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final Request f13010a;
    public final CacheResponse b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/CacheStrategy$Companion;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String strD = headers.d(i);
                String strI = headers.i(i);
                if ((!"Warning".equalsIgnoreCase(strD) || !StringsKt.W(strI, "1", false)) && ("Content-Length".equalsIgnoreCase(strD) || RequestBuilder.CONTENT_ENCODING.equalsIgnoreCase(strD) || RequestBuilder.CONTENT_TYPE.equalsIgnoreCase(strD) || !b(strD) || headers2.b(strD) == null)) {
                    builder.d(strD, strI);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strD2 = headers2.d(i2);
                if (!"Content-Length".equalsIgnoreCase(strD2) && !RequestBuilder.CONTENT_ENCODING.equalsIgnoreCase(strD2) && !RequestBuilder.CONTENT_TYPE.equalsIgnoreCase(strD2) && b(strD2)) {
                    builder.d(strD2, headers2.i(i2));
                }
            }
            return builder.e();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/CacheStrategy$Factory;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final Request f13011a;
        public final CacheResponse b;
        public final Date c;
        public final String d;
        public final Date e;
        public final String f;
        public final Date g;
        public final long h;
        public final long i;
        public final String j;
        public final int k;

        public Factory(Request request, CacheResponse cacheResponse) {
            int i;
            this.f13011a = request;
            this.b = cacheResponse;
            this.k = -1;
            if (cacheResponse != null) {
                this.h = cacheResponse.c;
                this.i = cacheResponse.d;
                Headers headers = cacheResponse.f;
                int size = headers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strD = headers.d(i2);
                    if (strD.equalsIgnoreCase("Date")) {
                        String strB = headers.b("Date");
                        this.c = strB != null ? DateFormattingKt.a(strB) : null;
                        this.d = headers.i(i2);
                    } else if (strD.equalsIgnoreCase("Expires")) {
                        String strB2 = headers.b("Expires");
                        this.g = strB2 != null ? DateFormattingKt.a(strB2) : null;
                    } else if (strD.equalsIgnoreCase("Last-Modified")) {
                        String strB3 = headers.b("Last-Modified");
                        this.e = strB3 != null ? DateFormattingKt.a(strB3) : null;
                        this.f = headers.i(i2);
                    } else if (strD.equalsIgnoreCase("ETag")) {
                        this.j = headers.i(i2);
                    } else if (strD.equalsIgnoreCase("Age")) {
                        String strI = headers.i(i2);
                        Bitmap.Config[] configArr = Utils.f13033a;
                        Long lJ0 = StringsKt.j0(strI);
                        if (lJ0 != null) {
                            long jLongValue = lJ0.longValue();
                            i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i = -1;
                        }
                        this.k = i;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final coil.network.CacheStrategy a() {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.network.CacheStrategy.Factory.a():coil.network.CacheStrategy");
        }
    }

    public CacheStrategy(Request request, CacheResponse cacheResponse) {
        this.f13010a = request;
        this.b = cacheResponse;
    }
}
