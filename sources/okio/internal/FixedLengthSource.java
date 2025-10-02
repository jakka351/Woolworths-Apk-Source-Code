package okio.internal;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FixedLengthSource extends ForwardingSource {
    public final long e;
    public final boolean f;
    public long g;

    public FixedLengthSource(Source source, long j, boolean z) {
        super(source);
        this.e = j;
        this.f = z;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long q2(Buffer sink, long j) throws IOException {
        Intrinsics.h(sink, "sink");
        long j2 = this.g;
        long j3 = this.e;
        if (j2 > j3) {
            j = 0;
        } else if (this.f) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jQ2 = super.q2(sink, j);
        if (jQ2 != -1) {
            this.g += jQ2;
        }
        long j5 = this.g;
        if ((j5 >= j3 || jQ2 != -1) && j5 <= j3) {
            return jQ2;
        }
        if (jQ2 > 0 && j5 > j3) {
            long j6 = sink.e - (j5 - j3);
            Buffer buffer = new Buffer();
            buffer.U(sink);
            sink.w1(buffer, j6);
            buffer.a();
        }
        StringBuilder sbT = androidx.camera.core.impl.b.t(j3, "expected ", " bytes but got ");
        sbT.append(this.g);
        throw new IOException(sbT.toString());
    }
}
