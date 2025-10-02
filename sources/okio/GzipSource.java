package okio;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.crypto.hpke.HPKE;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GzipSource implements Source {
    public byte d;
    public final RealBufferedSource e;
    public final Inflater f;
    public final InflaterSource g;
    public final CRC32 h;

    public GzipSource(BufferedSource source) {
        Intrinsics.h(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.e = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f = inflater;
        this.g = new InflaterSource(realBufferedSource, inflater);
        this.h = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbT = a.t(str, ": actual 0x");
        sbT.append(StringsKt.J(8, SegmentedByteString.e(i2)));
        sbT.append(" != expected 0x");
        sbT.append(StringsKt.J(8, SegmentedByteString.e(i)));
        throw new IOException(sbT.toString());
    }

    public final void b(Buffer buffer, long j, long j2) {
        Segment segment = buffer.d;
        Intrinsics.e(segment);
        while (true) {
            int i = segment.c;
            int i2 = segment.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.f;
            Intrinsics.e(segment);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(segment.c - r6, j2);
            this.h.update(segment.f26782a, (int) (segment.b + j), iMin);
            j2 -= iMin;
            segment = segment.f;
            Intrinsics.e(segment);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        return this.e.d.getE();
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) throws DataFormatException, IOException {
        GzipSource gzipSource = this;
        Intrinsics.h(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = gzipSource.d;
        CRC32 crc32 = gzipSource.h;
        RealBufferedSource realBufferedSource = gzipSource.e;
        if (b == 0) {
            realBufferedSource.I1(10L);
            Buffer buffer = realBufferedSource.e;
            byte bE = buffer.e(3L);
            boolean z = ((bE >> 1) & 1) == 1;
            if (z) {
                gzipSource.b(buffer, 0L, 10L);
            }
            a(8075, realBufferedSource.readShort(), "ID1ID2");
            realBufferedSource.skip(8L);
            if (((bE >> 2) & 1) == 1) {
                realBufferedSource.I1(2L);
                if (z) {
                    b(buffer, 0L, 2L);
                }
                long jP = buffer.p() & HPKE.aead_EXPORT_ONLY;
                realBufferedSource.I1(jP);
                if (z) {
                    b(buffer, 0L, jP);
                }
                realBufferedSource.skip(jP);
            }
            if (((bE >> 3) & 1) == 1) {
                long jA = realBufferedSource.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z) {
                    b(buffer, 0L, jA + 1);
                }
                realBufferedSource.skip(jA + 1);
            }
            if (((bE >> 4) & 1) == 1) {
                long jA2 = realBufferedSource.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    gzipSource = this;
                    gzipSource.b(buffer, 0L, jA2 + 1);
                } else {
                    gzipSource = this;
                }
                realBufferedSource.skip(jA2 + 1);
            } else {
                gzipSource = this;
            }
            if (z) {
                a(realBufferedSource.e(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            gzipSource.d = (byte) 1;
        }
        if (gzipSource.d == 1) {
            long j2 = sink.e;
            long jQ2 = gzipSource.g.q2(sink, j);
            if (jQ2 != -1) {
                gzipSource.b(sink, j2, jQ2);
                return jQ2;
            }
            gzipSource.d = (byte) 2;
        }
        if (gzipSource.d == 2) {
            a(realBufferedSource.c(), (int) crc32.getValue(), "CRC");
            a(realBufferedSource.c(), (int) gzipSource.f.getBytesWritten(), "ISIZE");
            gzipSource.d = (byte) 3;
            if (!realBufferedSource.X1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
