package okio;

import androidx.camera.core.impl.b;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GzipSink implements Sink {
    public final RealBufferedSink d;
    public final Deflater e;
    public final DeflaterSink f;
    public boolean g;
    public final CRC32 h;

    public GzipSink(BufferedSink bufferedSink) {
        RealBufferedSink realBufferedSink = new RealBufferedSink(bufferedSink);
        this.d = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.e = deflater;
        this.f = new DeflaterSink(realBufferedSink, deflater);
        this.h = new CRC32();
        Buffer buffer = realBufferedSink.e;
        buffer.k0(8075);
        buffer.Y(8);
        buffer.Y(0);
        buffer.i0(0);
        buffer.Y(0);
        buffer.Y(0);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z;
        Buffer buffer;
        Deflater deflater = this.e;
        RealBufferedSink realBufferedSink = this.d;
        if (this.g) {
            return;
        }
        try {
            DeflaterSink deflaterSink = this.f;
            deflaterSink.e.finish();
            deflaterSink.a(false);
            value = (int) this.h.getValue();
            z = realBufferedSink.f;
            buffer = realBufferedSink.e;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        buffer.i0(SegmentedByteString.c(value));
        realBufferedSink.a();
        int bytesRead = (int) deflater.getBytesRead();
        if (realBufferedSink.f) {
            throw new IllegalStateException("closed");
        }
        buffer.i0(SegmentedByteString.c(bytesRead));
        realBufferedSink.a();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            realBufferedSink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.f.flush();
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.d.getE();
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) throws IOException {
        Intrinsics.h(source, "source");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        Segment segment = source.d;
        Intrinsics.e(segment);
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, segment.c - segment.b);
            this.h.update(segment.f26782a, segment.b, iMin);
            j2 -= iMin;
            segment = segment.f;
            Intrinsics.e(segment);
        }
        this.f.w1(source, j);
    }
}
