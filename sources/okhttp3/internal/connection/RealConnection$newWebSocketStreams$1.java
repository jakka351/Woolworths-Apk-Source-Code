package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/connection/RealConnection$newWebSocketStreams$1", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    public final /* synthetic */ Exchange f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(Exchange exchange, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        super(bufferedSource, bufferedSink);
        this.f = exchange;
    }

    public final void cancel() {
        this.f.d.cancel();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.a(-1L, true, true, null);
    }
}
