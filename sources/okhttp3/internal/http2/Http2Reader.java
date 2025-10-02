package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "ContinuationSource", "Handler", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    public static final Companion g = new Companion(0);
    public static final Logger h;
    public final BufferedSource d;
    public final ContinuationSource e;
    public final Hpack.Reader f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(androidx.camera.core.impl.b.i(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContinuationSource implements Source {
        public final BufferedSource d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public ContinuationSource(BufferedSource source) {
            Intrinsics.h(source, "source");
            this.d = source;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // okio.Source
        /* renamed from: n */
        public final Timeout getE() {
            return this.d.getE();
        }

        @Override // okio.Source
        public final long q2(Buffer sink, long j) throws IOException {
            int i;
            int i2;
            Intrinsics.h(sink, "sink");
            do {
                int i3 = this.h;
                BufferedSource bufferedSource = this.d;
                if (i3 == 0) {
                    bufferedSource.skip(this.i);
                    this.i = 0;
                    if ((this.f & 4) == 0) {
                        i = this.g;
                        int iO = _UtilCommonKt.o(bufferedSource);
                        this.h = iO;
                        this.e = iO;
                        int i4 = bufferedSource.readByte() & 255;
                        this.f = bufferedSource.readByte() & 255;
                        Http2Reader.g.getClass();
                        Logger logger = Http2Reader.h;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.f26740a;
                            int i5 = this.g;
                            int i6 = this.e;
                            int i7 = this.f;
                            http2.getClass();
                            logger.fine(Http2.b(i5, i6, i4, i7, true));
                        }
                        i2 = bufferedSource.readInt() & Integer.MAX_VALUE;
                        this.g = i2;
                        if (i4 != 9) {
                            throw new IOException(i4 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long jQ2 = bufferedSource.q2(sink, Math.min(j, i3));
                    if (jQ2 != -1) {
                        this.h -= (int) jQ2;
                        return jQ2;
                    }
                }
                return -1L;
            } while (i2 == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics.g(logger, "getLogger(...)");
        h = logger;
    }

    public Http2Reader(BufferedSource source) {
        Intrinsics.h(source, "source");
        this.d = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.e = continuationSource;
        this.f = new Hpack.Reader(continuationSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x023a, code lost:
    
        throw new java.io.IOException(YU.a.d(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r19, okhttp3.internal.http2.Http2Connection.ReaderRunnable r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.a(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    public final List b(int i, int i2, int i3, int i4) throws IOException {
        ContinuationSource continuationSource = this.e;
        continuationSource.h = i;
        continuationSource.e = i;
        continuationSource.i = i2;
        continuationSource.f = i3;
        continuationSource.g = i4;
        Hpack.Reader reader = this.f;
        RealBufferedSource realBufferedSource = reader.c;
        ArrayList arrayList = reader.b;
        while (!realBufferedSource.X1()) {
            byte b = realBufferedSource.readByte();
            byte[] bArr = _UtilCommonKt.f26698a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = reader.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    Hpack hpack = Hpack.f26737a;
                    hpack.getClass();
                    Header[] headerArr = Hpack.b;
                    if (i6 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i6]);
                    }
                }
                Hpack.f26737a.getClass();
                int length = reader.e + 1 + (i6 - Hpack.b.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.d;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        Intrinsics.e(header);
                        arrayList.add(header);
                    }
                }
                throw new IOException(YU.a.d(iE, "Header index too large "));
            }
            if (i5 == 64) {
                Hpack hpack2 = Hpack.f26737a;
                ByteString byteStringD = reader.d();
                hpack2.getClass();
                Hpack.a(byteStringD);
                reader.c(new Header(byteStringD, reader.d()));
            } else if ((b & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i5, 63) - 1), reader.d()));
            } else if ((b & 32) == 32) {
                int iE2 = reader.e(i5, 31);
                reader.f26738a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.f26738a);
                }
                int i7 = reader.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        Header[] headerArr3 = reader.d;
                        ArraysKt.B(headerArr3, 0, headerArr3.length, null);
                        reader.e = reader.d.length - 1;
                        reader.f = 0;
                        reader.g = 0;
                    } else {
                        reader.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Hpack hpack3 = Hpack.f26737a;
                ByteString byteStringD2 = reader.d();
                hpack3.getClass();
                Hpack.a(byteStringD2);
                arrayList.add(new Header(byteStringD2, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i5, 15) - 1), reader.d()));
            }
        }
        List listG0 = CollectionsKt.G0(arrayList);
        arrayList.clear();
        return listG0;
    }

    public final void c(Http2Connection.ReaderRunnable readerRunnable, int i) {
        BufferedSource bufferedSource = this.d;
        bufferedSource.readInt();
        bufferedSource.readByte();
        byte[] bArr = _UtilCommonKt.f26698a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }
}
