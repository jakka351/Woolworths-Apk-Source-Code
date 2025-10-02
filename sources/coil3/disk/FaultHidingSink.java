package coil3.disk;

import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import java.io.IOException;
import kotlin.Metadata;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/disk/FaultHidingSink;", "Lokio/Sink;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FaultHidingSink implements Sink {
    public final Sink d;
    public final d e;
    public boolean f;

    public FaultHidingSink(Sink sink, d dVar) {
        this.d = sink;
        this.e = dVar;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.d.close();
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            this.d.flush();
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.getE();
    }

    @Override // okio.Sink
    public final void w1(Buffer buffer, long j) {
        if (this.f) {
            buffer.skip(j);
            return;
        }
        try {
            this.d.w1(buffer, j);
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }
}
