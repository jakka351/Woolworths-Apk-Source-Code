package okhttp3.internal.connection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/SequentialExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f26723a;

    public SequentialExchangeFinder(RealRoutePlanner realRoutePlanner) {
        this.f26723a = realRoutePlanner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        return r3.getD();
     */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection a() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            okhttp3.internal.connection.RealRoutePlanner r2 = r6.f26723a
            okhttp3.internal.connection.ConnectionUser r3 = r2.l
            boolean r3 = r3.isCanceled()
            if (r3 != 0) goto L51
            okhttp3.internal.connection.RoutePlanner$Plan r3 = r2.e()     // Catch: java.io.IOException -> L2c
            boolean r4 = r3.isReady()     // Catch: java.io.IOException -> L2c
            if (r4 != 0) goto L3d
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r3.e()     // Catch: java.io.IOException -> L2c
            okhttp3.internal.connection.RoutePlanner$Plan r5 = r4.b     // Catch: java.io.IOException -> L2c
            if (r5 != 0) goto L24
            java.lang.Throwable r5 = r4.c     // Catch: java.io.IOException -> L2c
            if (r5 != 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = 0
        L25:
            if (r5 == 0) goto L2e
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = r3.getD()     // Catch: java.io.IOException -> L2c
            goto L2e
        L2c:
            r3 = move-exception
            goto L42
        L2e:
            okhttp3.internal.connection.RoutePlanner$Plan r5 = r4.b     // Catch: java.io.IOException -> L2c
            java.lang.Throwable r4 = r4.c     // Catch: java.io.IOException -> L2c
            if (r4 != 0) goto L3c
            if (r5 == 0) goto L3d
            kotlin.collections.ArrayDeque r3 = r2.p     // Catch: java.io.IOException -> L2c
            r3.addFirst(r5)     // Catch: java.io.IOException -> L2c
            goto L2
        L3c:
            throw r4     // Catch: java.io.IOException -> L2c
        L3d:
            okhttp3.internal.connection.RealConnection r0 = r3.getD()     // Catch: java.io.IOException -> L2c
            return r0
        L42:
            if (r1 != 0) goto L46
            r1 = r3
            goto L49
        L46:
            kotlin.ExceptionsKt.a(r1, r3)
        L49:
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L50
            goto L2
        L50:
            throw r1
        L51:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.SequentialExchangeFinder.a():okhttp3.internal.connection.RealConnection");
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f26723a;
    }
}
