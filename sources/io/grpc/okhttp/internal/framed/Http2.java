package io.grpc.okhttp.internal.framed;

import YU.a;
import androidx.camera.core.impl.b;
import io.grpc.okhttp.internal.framed.FrameReader;
import io.grpc.okhttp.internal.framed.Hpack;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;

/* loaded from: classes7.dex */
public final class Http2 implements Variant {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f24147a = Logger.getLogger(FrameLogger.class.getName());
    public static final ByteString b;

    public static final class ContinuationSource implements Source {
        public final RealBufferedSource d;
        public int e;
        public byte f;
        public int g;
        public int h;
        public short i;

        public ContinuationSource(RealBufferedSource realBufferedSource) {
            this.d = realBufferedSource;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // okio.Source
        /* renamed from: n */
        public final Timeout getE() {
            return this.d.d.getE();
        }

        @Override // okio.Source
        public final long q2(Buffer buffer, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.h;
                RealBufferedSource realBufferedSource = this.d;
                if (i3 == 0) {
                    realBufferedSource.skip(this.i);
                    this.i = (short) 0;
                    if ((this.f & 4) == 0) {
                        i = this.g;
                        int iA = Http2.a(realBufferedSource);
                        this.h = iA;
                        this.e = iA;
                        byte b = (byte) (realBufferedSource.readByte() & 255);
                        this.f = (byte) (realBufferedSource.readByte() & 255);
                        Logger logger = Http2.f24147a;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(FrameLogger.a(true, this.g, this.e, b, this.f));
                        }
                        i2 = realBufferedSource.readInt() & Integer.MAX_VALUE;
                        this.g = i2;
                        if (b != 9) {
                            Http2.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                            throw null;
                        }
                    }
                } else {
                    long jQ2 = realBufferedSource.q2(buffer, Math.min(j, i3));
                    if (jQ2 != -1) {
                        this.h -= (int) jQ2;
                        return jQ2;
                    }
                }
                return -1L;
            } while (i2 == i);
            Http2.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public static final class FrameLogger {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f24148a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        public static final String[] b = new String[64];
        public static final String[] c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            strArr2[i3 | 8] = a.o(new StringBuilder(), strArr2[i3], "|PADDED");
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = b;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr3[i6]);
                sb.append('|');
                strArr3[i7 | 8] = a.o(sb, strArr3[i5], "|PADDED");
            }
            while (true) {
                String[] strArr4 = b;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = c[i];
                }
                i++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String a(boolean r3, int r4, int r5, byte r6, byte r7) {
            /*
                r0 = 10
                if (r6 >= r0) goto L9
                java.lang.String[] r0 = io.grpc.okhttp.internal.framed.Http2.FrameLogger.f24148a
                r0 = r0[r6]
                goto L17
            L9:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "0x%02x"
                java.lang.String r0 = java.lang.String.format(r1, r0)
            L17:
                if (r7 != 0) goto L1c
                java.lang.String r6 = ""
                goto L68
            L1c:
                r1 = 2
                java.lang.String[] r2 = io.grpc.okhttp.internal.framed.Http2.FrameLogger.c
                if (r6 == r1) goto L66
                r1 = 3
                if (r6 == r1) goto L66
                r1 = 4
                if (r6 == r1) goto L5d
                r1 = 6
                if (r6 == r1) goto L5d
                r1 = 7
                if (r6 == r1) goto L66
                r1 = 8
                if (r6 == r1) goto L66
                r1 = 64
                if (r7 >= r1) goto L3a
                java.lang.String[] r1 = io.grpc.okhttp.internal.framed.Http2.FrameLogger.b
                r1 = r1[r7]
                goto L3c
            L3a:
                r1 = r2[r7]
            L3c:
                r2 = 5
                if (r6 != r2) goto L4c
                r2 = r7 & 4
                if (r2 == 0) goto L4c
                java.lang.String r6 = "HEADERS"
                java.lang.String r7 = "PUSH_PROMISE"
                java.lang.String r6 = r1.replace(r6, r7)
                goto L68
            L4c:
                if (r6 != 0) goto L5b
                r6 = r7 & 32
                if (r6 == 0) goto L5b
                java.lang.String r6 = "PRIORITY"
                java.lang.String r7 = "COMPRESSED"
                java.lang.String r6 = r1.replace(r6, r7)
                goto L68
            L5b:
                r6 = r1
                goto L68
            L5d:
                r6 = 1
                if (r7 != r6) goto L63
                java.lang.String r6 = "ACK"
                goto L68
            L63:
                r6 = r2[r7]
                goto L68
            L66:
                r6 = r2[r7]
            L68:
                java.util.Locale r7 = java.util.Locale.US
                if (r3 == 0) goto L6f
                java.lang.String r3 = "<<"
                goto L71
            L6f:
                java.lang.String r3 = ">>"
            L71:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r0, r6}
                java.lang.String r4 = "%s 0x%08x %5d %-13s %s"
                java.lang.String r3 = java.lang.String.format(r7, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.framed.Http2.FrameLogger.a(boolean, int, int, byte, byte):java.lang.String");
        }
    }

    public static final class Reader implements FrameReader {
        public final RealBufferedSource d;
        public final ContinuationSource e;
        public final Hpack.Reader f;

        public Reader(RealBufferedSource realBufferedSource) {
            this.d = realBufferedSource;
            ContinuationSource continuationSource = new ContinuationSource(realBufferedSource);
            this.e = continuationSource;
            this.f = new Hpack.Reader(continuationSource);
        }

        public final ArrayList a(int i, short s, byte b, int i2) throws IOException {
            ContinuationSource continuationSource = this.e;
            continuationSource.h = i;
            continuationSource.e = i;
            continuationSource.i = s;
            continuationSource.f = b;
            continuationSource.g = i2;
            Hpack.Reader reader = this.f;
            RealBufferedSource realBufferedSource = reader.b;
            ArrayList arrayList = reader.f24145a;
            while (!realBufferedSource.X1()) {
                byte b2 = realBufferedSource.readByte();
                int i3 = b2 & 255;
                if (i3 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b2 & 128) == 128) {
                    int iE = reader.e(i3, 127);
                    int i4 = iE - 1;
                    if (i4 >= 0) {
                        Header[] headerArr = Hpack.b;
                        if (i4 <= headerArr.length - 1) {
                            arrayList.add(headerArr[i4]);
                        }
                    }
                    int length = reader.f + 1 + (i4 - Hpack.b.length);
                    if (length >= 0) {
                        Header[] headerArr2 = reader.e;
                        if (length <= headerArr2.length - 1) {
                            arrayList.add(headerArr2[length]);
                        }
                    }
                    throw new IOException(a.d(iE, "Header index too large "));
                }
                if (i3 == 64) {
                    ByteString byteStringD = reader.d();
                    Hpack.a(byteStringD);
                    reader.c(new Header(byteStringD, reader.d()));
                } else if ((b2 & 64) == 64) {
                    reader.c(new Header(reader.b(reader.e(i3, 63) - 1), reader.d()));
                } else if ((b2 & 32) == 32) {
                    int iE2 = reader.e(i3, 31);
                    reader.d = iE2;
                    if (iE2 < 0 || iE2 > reader.c) {
                        throw new IOException("Invalid dynamic table size update " + reader.d);
                    }
                    int i5 = reader.h;
                    if (iE2 < i5) {
                        if (iE2 == 0) {
                            Arrays.fill(reader.e, (Object) null);
                            reader.f = reader.e.length - 1;
                            reader.g = 0;
                            reader.h = 0;
                        } else {
                            reader.a(i5 - iE2);
                        }
                    }
                } else if (i3 == 16 || i3 == 0) {
                    ByteString byteStringD2 = reader.d();
                    Hpack.a(byteStringD2);
                    arrayList.add(new Header(byteStringD2, reader.d()));
                } else {
                    arrayList.add(new Header(reader.b(reader.e(i3, 15) - 1), reader.d()));
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            return arrayList2;
        }

        public final void b(FrameReader.Handler handler, int i) throws EOFException {
            RealBufferedSource realBufferedSource = this.d;
            realBufferedSource.readInt();
            realBufferedSource.readByte();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.d.close();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.grpc.okhttp.internal.framed.FrameReader
        public final boolean i1(FrameReader.Handler handler) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            RealBufferedSource realBufferedSource = this.d;
            int i = 0;
            int i2 = 0;
            try {
                realBufferedSource.I1(9L);
                int iA = Http2.a(realBufferedSource);
                if (iA < 0 || iA > 16384) {
                    Http2.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                    throw null;
                }
                byte b = (byte) (realBufferedSource.readByte() & 255);
                byte b2 = (byte) (realBufferedSource.readByte() & 255);
                int i3 = realBufferedSource.readInt() & Integer.MAX_VALUE;
                Logger logger = Http2.f24147a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrameLogger.a(true, i3, iA, b, b2));
                }
                switch (b) {
                    case 0:
                        boolean z = (b2 & 1) != 0;
                        if ((b2 & 32) != 0) {
                            Http2.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short s = (b2 & 8) != 0 ? (short) (realBufferedSource.readByte() & 255) : (short) 0;
                        handler.O(z, i3, realBufferedSource, Http2.b(iA, b2, s), iA);
                        realBufferedSource.skip(s);
                        return true;
                    case 1:
                        if (i3 == 0) {
                            Http2.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z2 = (b2 & 1) != 0;
                        short s2 = (b2 & 8) != 0 ? (short) (realBufferedSource.readByte() & 255) : (short) 0;
                        if ((b2 & 32) != 0) {
                            b(handler, i3);
                            iA -= 5;
                        }
                        handler.N(z2, i3, a(Http2.b(iA, b2, s2), s2, b2, i3));
                        return true;
                    case 2:
                        if (iA != 5) {
                            Http2.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                            throw null;
                        }
                        if (i3 != 0) {
                            b(handler, i3);
                            return true;
                        }
                        Http2.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    case 3:
                        if (iA != 4) {
                            Http2.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iA));
                            throw null;
                        }
                        if (i3 == 0) {
                            Http2.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int i4 = realBufferedSource.readInt();
                        ErrorCode[] errorCodeArrValues = ErrorCode.values();
                        int length = errorCodeArrValues.length;
                        while (true) {
                            if (i2 < length) {
                                errorCode = errorCodeArrValues[i2];
                                if (errorCode.d != i4) {
                                    i2++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            handler.M(i3, errorCode);
                            return true;
                        }
                        Http2.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i4));
                        throw null;
                    case 4:
                        if (i3 != 0) {
                            Http2.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((b2 & 1) == 0) {
                            if (iA % 6 != 0) {
                                Http2.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iA));
                                throw null;
                            }
                            Settings settings = new Settings();
                            for (int i5 = 0; i5 < iA; i5 += 6) {
                                short s3 = realBufferedSource.readShort();
                                int i6 = realBufferedSource.readInt();
                                switch (s3) {
                                    case 1:
                                    case 6:
                                        settings.b(s3, i6);
                                    case 2:
                                        if (i6 != 0 && i6 != 1) {
                                            Http2.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        settings.b(s3, i6);
                                    case 3:
                                        s3 = 4;
                                        settings.b(s3, i6);
                                    case 4:
                                        if (i6 < 0) {
                                            Http2.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        s3 = 7;
                                        settings.b(s3, i6);
                                    case 5:
                                        if (i6 < 16384 || i6 > 16777215) {
                                            Http2.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                            throw null;
                                        }
                                        settings.b(s3, i6);
                                        break;
                                    default:
                                }
                            }
                            handler.u(settings);
                            int i7 = settings.f24151a;
                            int i8 = i7 & 2;
                            int[] iArr = settings.b;
                            if ((i8 != 0 ? iArr[1] : -1) >= 0) {
                                int i9 = (i7 & 2) != 0 ? iArr[1] : -1;
                                Hpack.Reader reader = this.f;
                                reader.c = i9;
                                reader.d = i9;
                                int i10 = reader.h;
                                if (i9 < i10) {
                                    if (i9 == 0) {
                                        Arrays.fill(reader.e, (Object) null);
                                        reader.f = reader.e.length - 1;
                                        reader.g = 0;
                                        reader.h = 0;
                                        return true;
                                    }
                                    reader.a(i10 - i9);
                                }
                            }
                        } else if (iA != 0) {
                            Http2.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    case 5:
                        if (i3 == 0) {
                            Http2.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short s4 = (b2 & 8) != 0 ? (short) (realBufferedSource.readByte() & 255) : (short) 0;
                        handler.P(i3, realBufferedSource.readInt() & Integer.MAX_VALUE, a(Http2.b(iA - 4, b2, s4), s4, b2, i3));
                        return true;
                    case 6:
                        if (iA != 8) {
                            Http2.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        if (i3 == 0) {
                            handler.J(realBufferedSource.readInt(), realBufferedSource.readInt(), (b2 & 1) != 0);
                            return true;
                        }
                        Http2.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    case 7:
                        if (iA < 8) {
                            Http2.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        if (i3 != 0) {
                            Http2.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int i11 = realBufferedSource.readInt();
                        int i12 = realBufferedSource.readInt();
                        int i13 = iA - 8;
                        ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                        int length2 = errorCodeArrValues2.length;
                        while (true) {
                            if (i < length2) {
                                errorCode2 = errorCodeArrValues2[i];
                                if (errorCode2.d != i12) {
                                    i++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 == null) {
                            Http2.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i12));
                            throw null;
                        }
                        ByteString byteStringP0 = ByteString.g;
                        if (i13 > 0) {
                            byteStringP0 = realBufferedSource.p0(i13);
                        }
                        handler.Q(i11, errorCode2, byteStringP0);
                        return true;
                    case 8:
                        if (iA != 4) {
                            Http2.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                            throw null;
                        }
                        long j = realBufferedSource.readInt() & 2147483647L;
                        if (j != 0) {
                            handler.E(i3, j);
                            return true;
                        }
                        Http2.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    default:
                        realBufferedSource.skip(iA);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public static final class Writer implements FrameWriter {
        public final RealBufferedSink d;
        public final Buffer e;
        public final Hpack.Writer f;
        public int g;
        public boolean h;

        public Writer(RealBufferedSink realBufferedSink) {
            this.d = realBufferedSink;
            Buffer buffer = new Buffer();
            this.e = buffer;
            this.f = new Hpack.Writer(buffer);
            this.g = 16384;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void A0(ErrorCode errorCode, byte[] bArr) {
            try {
                if (this.h) {
                    throw new IOException("closed");
                }
                if (errorCode.d == -1) {
                    Logger logger = Http2.f24147a;
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                a(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.d.writeInt(0);
                this.d.writeInt(errorCode.d);
                if (bArr.length > 0) {
                    this.d.write(bArr);
                }
                this.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void E(int i, long j) {
            if (this.h) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Logger logger = Http2.f24147a;
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            a(i, 4, (byte) 8, (byte) 0);
            this.d.writeInt((int) j);
            this.d.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final int H1() {
            return this.g;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void J(int i, int i2, boolean z) {
            if (this.h) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.d.writeInt(i);
            this.d.writeInt(i2);
            this.d.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void M(int i, ErrorCode errorCode) {
            if (this.h) {
                throw new IOException("closed");
            }
            if (errorCode.d == -1) {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte) 3, (byte) 0);
            this.d.writeInt(errorCode.d);
            this.d.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void S() {
            try {
                if (this.h) {
                    throw new IOException("closed");
                }
                Logger logger = Http2.f24147a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + Http2.b.d());
                }
                this.d.write(Http2.b.x());
                this.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void a(int i, int i2, byte b, byte b2) {
            Logger logger = Http2.f24147a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(FrameLogger.a(false, i, i2, b, b2));
            }
            int i3 = this.g;
            if (i2 > i3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(b.i(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException(a.d(i, "reserved bit set: "));
            }
            RealBufferedSink realBufferedSink = this.d;
            realBufferedSink.writeByte((i2 >>> 16) & 255);
            realBufferedSink.writeByte((i2 >>> 8) & 255);
            realBufferedSink.writeByte(i2 & 255);
            realBufferedSink.writeByte(b & 255);
            realBufferedSink.writeByte(b2 & 255);
            realBufferedSink.writeInt(i & Integer.MAX_VALUE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r18, java.util.List r19, boolean r20) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.framed.Http2.Writer.b(int, java.util.List, boolean):void");
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void c0(int i, List list, boolean z) {
            if (this.h) {
                throw new IOException("closed");
            }
            b(i, list, z);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            this.h = true;
            this.d.close();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void flush() {
            if (this.h) {
                throw new IOException("closed");
            }
            this.d.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void k1(boolean z, int i, Buffer buffer, int i2) {
            if (this.h) {
                throw new IOException("closed");
            }
            a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.d.w1(buffer, i2);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void u(Settings settings) {
            try {
                if (this.h) {
                    throw new IOException("closed");
                }
                int i = 0;
                a(0, Integer.bitCount(settings.f24151a) * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (settings.a(i)) {
                        this.d.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.d.writeInt(settings.b[i]);
                    }
                    i++;
                }
                this.d.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public final synchronized void u1(Settings settings) {
            if (this.h) {
                throw new IOException("closed");
            }
            int i = this.g;
            if ((settings.f24151a & 32) != 0) {
                i = settings.b[5];
            }
            this.g = i;
            a(0, 0, (byte) 4, (byte) 1);
            this.d.flush();
        }
    }

    static {
        ByteString byteString = ByteString.g;
        b = ByteString.Companion.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(RealBufferedSource realBufferedSource) {
        return (realBufferedSource.readByte() & 255) | ((realBufferedSource.readByte() & 255) << 16) | ((realBufferedSource.readByte() & 255) << 8);
    }

    public static int b(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public final FrameReader d(RealBufferedSource realBufferedSource) {
        return new Reader(realBufferedSource);
    }

    public final FrameWriter e(RealBufferedSink realBufferedSink) {
        return new Writer(realBufferedSink);
    }
}
