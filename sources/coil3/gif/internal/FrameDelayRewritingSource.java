package coil3.gif.internal;

import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/gif/internal/FrameDelayRewritingSource;", "Lokio/ForwardingSource;", "Companion", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FrameDelayRewritingSource extends ForwardingSource {
    public static final ByteString f;
    public final Buffer e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcoil3/gif/internal/FrameDelayRewritingSource$Companion;", "", "Lokio/ByteString;", "FRAME_DELAY_START_MARKER", "Lokio/ByteString;", "", "FRAME_DELAY_START_MARKER_SIZE_BYTES", "I", "MINIMUM_FRAME_DELAY", "DEFAULT_FRAME_DELAY", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ByteString byteString = ByteString.g;
        f = ByteString.Companion.a("0021F904");
    }

    public FrameDelayRewritingSource(BufferedSource bufferedSource) {
        super(bufferedSource);
        this.e = new Buffer();
    }

    public final boolean a(long j) {
        Buffer buffer = this.e;
        long j2 = buffer.e;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.q2(buffer, j3) == j3;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long q2(Buffer buffer, long j) {
        long j2;
        long j3;
        a(j);
        Buffer buffer2 = this.e;
        long j4 = 0;
        if (buffer2.e == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jF = -1;
            while (true) {
                ByteString byteString = f;
                jF = this.e.f(byteString.data[0], jF + 1, Long.MAX_VALUE);
                if (jF == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (a(byteString.data.length) && buffer2.a0(jF, byteString)) {
                    break;
                }
                j4 = j2;
            }
            if (jF == -1) {
                break;
            }
            long jQ2 = buffer2.q2(buffer, jF + 4);
            if (jQ2 < j2) {
                jQ2 = j2;
            }
            j5 += jQ2;
            if (a(5L) && buffer2.e(4L) == 0 && (((buffer2.e(2L) & 255) << 8) | (buffer2.e(1L) & 255)) < 2) {
                buffer.Y(buffer2.e(j2));
                buffer.Y(10);
                buffer.Y(0);
                buffer2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jQ22 = buffer2.q2(buffer, j - j5);
            j3 = 0;
            if (jQ22 < 0) {
                jQ22 = 0;
            }
            j5 += jQ22;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
