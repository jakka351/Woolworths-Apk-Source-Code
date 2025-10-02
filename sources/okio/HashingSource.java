package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HashingSource extends ForwardingSource implements Source {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/HashingSource$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        long jQ2 = super.q2(sink, j);
        if (jQ2 != -1) {
            long j2 = sink.e;
            long j3 = j2 - jQ2;
            Segment segment = sink.d;
            Intrinsics.e(segment);
            while (j2 > j3) {
                segment = segment.g;
                Intrinsics.e(segment);
                j2 -= segment.c - segment.b;
            }
            if (j2 < sink.e) {
                Intrinsics.e(null);
                throw null;
            }
        }
        return jQ2;
    }
}
