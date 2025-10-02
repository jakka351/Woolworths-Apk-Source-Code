package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okio.Buffer;
import okio.DeflaterSink;
import okio.Okio;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageDeflater implements Closeable {
    public final boolean d;
    public final Buffer e;
    public final Deflater f;
    public final DeflaterSink g;

    public MessageDeflater(boolean z) {
        this.d = z;
        Buffer buffer = new Buffer();
        this.e = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f = deflater;
        this.g = new DeflaterSink(Okio.b(buffer), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.g.close();
    }
}
