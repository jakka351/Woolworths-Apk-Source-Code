package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal._ZlibJvmKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DeflaterSink implements Sink {
    public final RealBufferedSink d;
    public final Deflater e;
    public boolean f;

    public DeflaterSink(RealBufferedSink realBufferedSink, Deflater deflater) {
        this.d = realBufferedSink;
        this.e = deflater;
    }

    public final void a(boolean z) throws IOException {
        Segment segmentR;
        int iDeflate;
        RealBufferedSink realBufferedSink = this.d;
        Buffer buffer = realBufferedSink.e;
        while (true) {
            segmentR = buffer.R(1);
            byte[] bArr = segmentR.f26782a;
            Deflater deflater = this.e;
            if (z) {
                try {
                    int i = segmentR.c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = segmentR.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                segmentR.c += iDeflate;
                buffer.e += iDeflate;
                realBufferedSink.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (segmentR.b == segmentR.c) {
            buffer.d = segmentR.a();
            SegmentPool.a(segmentR);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.e;
        if (this.f) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.d.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.d.flush();
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return this.d.d.getE();
    }

    public final String toString() {
        return "DeflaterSink(" + this.d + ')';
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) throws IOException {
        Intrinsics.h(source, "source");
        SegmentedByteString.b(source.e, 0L, j);
        while (true) {
            Deflater deflater = this.e;
            if (j <= 0) {
                deflater.setInput(_ZlibJvmKt.f26791a, 0, 0);
                return;
            }
            Segment segment = source.d;
            Intrinsics.e(segment);
            int iMin = (int) Math.min(j, segment.c - segment.b);
            deflater.setInput(segment.f26782a, segment.b, iMin);
            a(false);
            long j2 = iMin;
            source.e -= j2;
            int i = segment.b + iMin;
            segment.b = i;
            if (i == segment.c) {
                source.d = segment.a();
                SegmentPool.a(segment);
            }
            j -= j2;
        }
    }
}
