package okio;

import androidx.camera.core.impl.b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InflaterSource implements Source {
    public final RealBufferedSource d;
    public final Inflater e;
    public int f;
    public boolean g;

    public InflaterSource(RealBufferedSource realBufferedSource, Inflater inflater) {
        this.d = realBufferedSource;
        this.e = inflater;
    }

    public final long a(Buffer sink, long j) throws DataFormatException, IOException {
        Inflater inflater = this.e;
        Intrinsics.h(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                Segment segmentR = sink.R(1);
                int iMin = (int) Math.min(j, 8192 - segmentR.c);
                boolean zNeedsInput = inflater.needsInput();
                RealBufferedSource realBufferedSource = this.d;
                if (zNeedsInput && !realBufferedSource.X1()) {
                    Segment segment = realBufferedSource.e.d;
                    Intrinsics.e(segment);
                    int i = segment.c;
                    int i2 = segment.b;
                    int i3 = i - i2;
                    this.f = i3;
                    inflater.setInput(segment.f26782a, i2, i3);
                }
                int iInflate = inflater.inflate(segmentR.f26782a, segmentR.c, iMin);
                int i4 = this.f;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f -= remaining;
                    realBufferedSource.skip(remaining);
                }
                if (iInflate > 0) {
                    segmentR.c += iInflate;
                    long j2 = iInflate;
                    sink.e += j2;
                    return j2;
                }
                if (segmentR.b == segmentR.c) {
                    sink.d = segmentR.a();
                    SegmentPool.a(segmentR);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.e.end();
        this.g = true;
        this.d.close();
    }

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.d.getE();
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) throws DataFormatException, IOException {
        Intrinsics.h(sink, "sink");
        do {
            long jA = a(sink, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.e;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.d.X1());
        throw new EOFException("source exhausted prematurely");
    }
}
