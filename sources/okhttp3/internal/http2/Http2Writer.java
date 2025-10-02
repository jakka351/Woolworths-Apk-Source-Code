package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Http2Writer implements Closeable, Lockable {
    public static final Logger i;
    public final BufferedSink d;
    public final Buffer e;
    public int f;
    public boolean g;
    public final Hpack.Writer h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "<init>", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        i = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(BufferedSink sink) {
        Intrinsics.h(sink, "sink");
        this.d = sink;
        Buffer buffer = new Buffer();
        this.e = buffer;
        this.f = 16384;
        this.h = new Hpack.Writer(buffer);
    }

    public final void E(int i2, long j) {
        synchronized (this) {
            try {
                if (this.g) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = i;
                if (logger.isLoggable(Level.FINE)) {
                    Http2.f26740a.getClass();
                    logger.fine(Http2.c(i2, 4, j, false));
                }
                b(i2, 4, 8, 0);
                this.d.writeInt((int) j);
                this.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(int i2, int i3, boolean z) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            b(0, 8, 6, z ? 1 : 0);
            this.d.writeInt(i2);
            this.d.writeInt(i3);
            this.d.flush();
        }
    }

    public final void a(Settings peerSettings) {
        Intrinsics.h(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.g) {
                    throw new IOException("closed");
                }
                int i2 = this.f;
                int i3 = peerSettings.f26747a;
                if ((i3 & 32) != 0) {
                    i2 = peerSettings.b[5];
                }
                this.f = i2;
                if (((i3 & 2) != 0 ? peerSettings.b[1] : -1) != -1) {
                    Hpack.Writer writer = this.h;
                    int i4 = (i3 & 2) != 0 ? peerSettings.b[1] : -1;
                    writer.getClass();
                    int iMin = Math.min(i4, 16384);
                    int i5 = writer.d;
                    if (i5 != iMin) {
                        if (iMin < i5) {
                            writer.b = Math.min(writer.b, iMin);
                        }
                        writer.c = true;
                        writer.d = iMin;
                        int i6 = writer.h;
                        if (iMin < i6) {
                            if (iMin == 0) {
                                Header[] headerArr = writer.e;
                                ArraysKt.B(headerArr, 0, headerArr.length, null);
                                writer.f = writer.e.length - 1;
                                writer.g = 0;
                                writer.h = 0;
                            } else {
                                writer.a(i6 - iMin);
                            }
                        }
                    }
                }
                b(0, 0, 4, 1);
                this.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i2, int i3, int i4, int i5) {
        if (i4 != 8) {
            Level level = Level.FINE;
            Logger logger = i;
            if (logger.isLoggable(level)) {
                Http2.f26740a.getClass();
                logger.fine(Http2.b(i2, i3, i4, i5, false));
            }
        }
        if (i3 > this.f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException(YU.a.d(i2, "reserved bit set: ").toString());
        }
        byte[] bArr = _UtilCommonKt.f26698a;
        BufferedSink bufferedSink = this.d;
        Intrinsics.h(bufferedSink, "<this>");
        bufferedSink.writeByte((i3 >>> 16) & 255);
        bufferedSink.writeByte((i3 >>> 8) & 255);
        bufferedSink.writeByte(i3 & 255);
        bufferedSink.writeByte(i4 & 255);
        bufferedSink.writeByte(i5 & 255);
        bufferedSink.writeInt(i2 & Integer.MAX_VALUE);
    }

    public final void c(int i2, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (errorCode.d == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            b(0, bArr.length + 8, 7, 0);
            this.d.writeInt(i2);
            this.d.writeInt(errorCode.d);
            if (bArr.length != 0) {
                this.d.write(bArr);
            }
            this.d.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.g = true;
            this.d.close();
        }
    }

    public final void d(boolean z, int i2, ArrayList arrayList) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            this.h.d(arrayList);
            long j = this.e.e;
            long jMin = Math.min(this.f, j);
            int i3 = j == jMin ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            b(i2, (int) jMin, 1, i3);
            this.d.w1(this.e, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f, j2);
                    j2 -= jMin2;
                    b(i2, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.d.w1(this.e, jMin2);
                }
            }
        }
    }

    public final void e(int i2, ErrorCode errorCode) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            if (errorCode.d == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            b(i2, 4, 3, 0);
            this.d.writeInt(errorCode.d);
            this.d.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            this.d.flush();
        }
    }

    public final void k1(boolean z, int i2, Buffer buffer, int i3) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            b(i2, i3, 0, z ? 1 : 0);
            if (i3 > 0) {
                BufferedSink bufferedSink = this.d;
                Intrinsics.e(buffer);
                bufferedSink.w1(buffer, i3);
            }
        }
    }
}
