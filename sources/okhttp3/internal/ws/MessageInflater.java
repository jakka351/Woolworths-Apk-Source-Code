package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okio.Buffer;
import okio.InflaterSource;
import okio.Okio;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageInflater implements Closeable {
    public final boolean d;
    public final Buffer e;
    public final Inflater f;
    public final InflaterSource g;

    public MessageInflater(boolean z) {
        this.d = z;
        Buffer buffer = new Buffer();
        this.e = buffer;
        Inflater inflater = new Inflater(true);
        this.f = inflater;
        this.g = new InflaterSource(Okio.c(buffer), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }
}
