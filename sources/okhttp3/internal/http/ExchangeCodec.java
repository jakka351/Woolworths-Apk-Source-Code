package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import okio.Sink;
import okio.Source;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Carrier", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExchangeCodec {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Carrier;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Carrier {
        /* renamed from: a */
        Route getN();

        void c();

        void cancel();

        void f(RealCall realCall, IOException iOException);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    Source a(Response response);

    Sink b(Request request, long j);

    void c();

    void cancel();

    void d();

    long e(Response response);

    void f(Request request);

    boolean g();

    Response.Builder h(boolean z);

    Carrier i();
}
