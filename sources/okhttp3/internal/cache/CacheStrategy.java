package okhttp3.internal.cache;

import java.util.Date;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Factory", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheStrategy {
    public static final Companion c = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Request f26702a;
    public final Response b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(okhttp3.Request r2, okhttp3.Response r3) {
            /*
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.h(r3, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.h(r2, r0)
                int r0 = r3.g
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 == r1) goto L5a
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L5a
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L5a
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L5a
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L5a
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L5a
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L38
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L5a
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L5a
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L5a
                switch(r0) {
                    case 300: goto L5a;
                    case 301: goto L5a;
                    case 302: goto L38;
                    default: goto L37;
                }
            L37:
                goto L6c
            L38:
                java.lang.String r0 = "Expires"
                java.lang.String r0 = okhttp3.Response.b(r0, r3)
                if (r0 != 0) goto L5a
                okhttp3.CacheControl r0 = r3.a()
                int r0 = r0.c
                r1 = -1
                if (r0 != r1) goto L5a
                okhttp3.CacheControl r0 = r3.a()
                boolean r0 = r0.f
                if (r0 != 0) goto L5a
                okhttp3.CacheControl r0 = r3.a()
                boolean r0 = r0.e
                if (r0 != 0) goto L5a
                goto L6c
            L5a:
                okhttp3.CacheControl r3 = r3.a()
                boolean r3 = r3.b
                if (r3 != 0) goto L6c
                okhttp3.CacheControl r2 = r2.a()
                boolean r2 = r2.b
                if (r2 != 0) goto L6c
                r2 = 1
                return r2
            L6c:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.a(okhttp3.Request, okhttp3.Response):boolean");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public Date f26703a;
        public String b;
        public Date c;
        public String d;
        public Date e;
        public long f;
        public long g;
        public String h;
        public int i;
    }

    public CacheStrategy(Request request, Response response) {
        this.f26702a = request;
        this.b = response;
    }
}
