package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Throttler$sink$1", "Lokio/ForwardingSink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Throttler$sink$1 extends ForwardingSink {
    @Override // okio.ForwardingSink, okio.Sink
    public final void w1(Buffer source, long j) {
        Intrinsics.h(source, "source");
        if (j > 0) {
            throw null;
        }
    }
}
