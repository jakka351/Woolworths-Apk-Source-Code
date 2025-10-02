package coil.disk;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/disk/FaultHidingSink;", "Lokio/ForwardingSink;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FaultHidingSink extends ForwardingSink {
    public final Function1 e;
    public boolean f;

    public FaultHidingSink(Sink sink, Function1 function1) {
        super(sink);
        this.e = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f = true;
            ((DiskLruCache$newJournalWriter$faultHidingSink$1) this.e).invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void w1(Buffer buffer, long j) {
        if (this.f) {
            buffer.skip(j);
            return;
        }
        try {
            super.w1(buffer, j);
        } catch (IOException e) {
            this.f = true;
            ((DiskLruCache$newJournalWriter$faultHidingSink$1) this.e).invoke(e);
        }
    }
}
