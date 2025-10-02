package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f26729a;
    public final ArrayList b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        Intrinsics.h(request, "request");
        this.f26729a = realCall;
        this.b = arrayList;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            exchange = realInterceptorChain.d;
        }
        Exchange exchange2 = exchange;
        if ((i2 & 4) != 0) {
            request = realInterceptorChain.e;
        }
        Request request2 = request;
        int i4 = realInterceptorChain.f;
        int i5 = realInterceptorChain.g;
        int i6 = realInterceptorChain.h;
        Intrinsics.h(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f26729a, realInterceptorChain.b, i3, exchange2, request2, i4, i5, i6);
    }

    public final RealConnection a() {
        Exchange exchange = this.d;
        if (exchange != null) {
            return exchange.d();
        }
        return null;
    }

    public final Response c(Request request) {
        Intrinsics.h(request, "request");
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        Exchange exchange = this.d;
        if (exchange != null) {
            if (!exchange.c.b().c(request.f26690a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainB = b(this, i2, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseA = interceptor.a(realInterceptorChainB);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i2 >= arrayList.size() || realInterceptorChainB.i == 1) {
            return responseA;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }
}
