package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class FaultHidingSink extends ForwardingSink {
    public final Function1 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(Sink delegate, Function1 function1) {
        super(delegate);
        Intrinsics.h(delegate, "delegate");
        this.e = function1;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        if (this.f) {
            source.skip(j);
            return;
        }
        try {
            super.w1(source, j);
        } catch (IOException e) {
            this.f = true;
            this.e.invoke(e);
        }
    }
}
