package okio;

import YU.a;
import androidx.camera.core.impl.b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "UnsafeCursor", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment d;
    public long e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class UnsafeCursor implements Closeable {
        public Buffer d;
        public boolean e;
        public Segment f;
        public byte[] h;
        public long g = -1;
        public int i = -1;
        public int j = -1;

        public final void a(long j) {
            Buffer buffer = this.d;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.e) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = buffer.e;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(b.k(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.d;
                    Intrinsics.e(segment);
                    Segment segment2 = segment.g;
                    Intrinsics.e(segment2);
                    int i = segment2.c;
                    long j4 = i - segment2.b;
                    if (j4 > j3) {
                        segment2.c = i - ((int) j3);
                        break;
                    } else {
                        buffer.d = segment2.a();
                        SegmentPool.a(segment2);
                        j3 -= j4;
                    }
                }
                this.f = null;
                this.g = j;
                this.h = null;
                this.i = -1;
                this.j = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    Segment segmentR = buffer.R(i2);
                    int iMin = (int) Math.min(j5, 8192 - segmentR.c);
                    int i3 = segmentR.c + iMin;
                    segmentR.c = i3;
                    j5 -= iMin;
                    if (z) {
                        this.f = segmentR;
                        this.g = j2;
                        this.h = segmentR.f26782a;
                        this.i = i3 - iMin;
                        this.j = i3;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            buffer.e = j;
        }

        public final int b(long j) {
            Buffer buffer = this.d;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = buffer.e;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f = null;
                        this.g = j;
                        this.h = null;
                        this.i = -1;
                        this.j = -1;
                        return -1;
                    }
                    Segment segment = buffer.d;
                    Segment segment2 = this.f;
                    long j3 = 0;
                    if (segment2 != null) {
                        long j4 = this.g - (this.i - segment2.b);
                        if (j4 > j) {
                            segment2 = segment;
                            segment = segment2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        segment2 = segment;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            Intrinsics.e(segment2);
                            long j5 = (segment2.c - segment2.b) + j3;
                            if (j < j5) {
                                break;
                            }
                            segment2 = segment2.f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.e(segment);
                            segment = segment.g;
                            Intrinsics.e(segment);
                            j2 -= segment.c - segment.b;
                        }
                        segment2 = segment;
                        j3 = j2;
                    }
                    if (this.e) {
                        Intrinsics.e(segment2);
                        if (segment2.d) {
                            byte[] bArr = segment2.f26782a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.g(bArrCopyOf, "copyOf(...)");
                            Segment segment3 = new Segment(bArrCopyOf, segment2.b, segment2.c, false, true);
                            if (buffer.d == segment2) {
                                buffer.d = segment3;
                            }
                            segment2.b(segment3);
                            Segment segment4 = segment3.g;
                            Intrinsics.e(segment4);
                            segment4.a();
                            segment2 = segment3;
                        }
                    }
                    this.f = segment2;
                    this.g = j;
                    Intrinsics.e(segment2);
                    this.h = segment2.f26782a;
                    int i = segment2.b + ((int) (j - j3));
                    this.i = i;
                    int i2 = segment2.c;
                    this.j = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbT = b.t(j, "offset=", " > size=");
            sbT.append(buffer.e);
            throw new ArrayIndexOutOfBoundsException(sbT.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.d == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.d = null;
            this.f = null;
            this.g = -1L;
            this.h = null;
            this.i = -1;
            this.j = -1;
        }
    }

    public final int A() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            throw new EOFException();
        }
        byte bE = e(0L);
        if ((bE & 128) == 0) {
            i = bE & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bE & 224) == 192) {
            i = bE & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bE & 240) == 224) {
            i = bE & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bE & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bE & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.e < j) {
            StringBuilder sbR = a.r(i2, "size < ", ": ");
            sbR.append(this.e);
            sbR.append(" (to read code point prefixed 0x");
            sbR.append(SegmentedByteString.d(bE));
            sbR.append(')');
            throw new EOFException(sbR.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bE2 = e(j2);
            if ((bE2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bE2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // okio.BufferedSource
    public final int A2(Options options) {
        Intrinsics.h(options, "options");
        int iD = okio.internal.Buffer.d(this, options, false);
        if (iD == -1) {
            return -1;
        }
        skip(options.d[iD].c());
        return iD;
    }

    @Override // okio.BufferedSource
    public final String B1() {
        return n1(Long.MAX_VALUE);
    }

    public final ByteString C() {
        long j = this.e;
        if (j <= 2147483647L) {
            return H((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.e).toString());
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink F0(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    public final ByteString H(int i) {
        if (i == 0) {
            return ByteString.g;
        }
        SegmentedByteString.b(this.e, 0L, i);
        Segment segment = this.d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.e(segment);
            int i5 = segment.c;
            int i6 = segment.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.d;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.e(segment2);
            bArr[i7] = segment2.f26782a;
            i2 += segment2.c - segment2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.b;
            segment2.d = true;
            i7++;
            segment2 = segment2.f;
        }
        return new C1866SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSource
    public final String I0(Charset charset) {
        Intrinsics.h(charset, "charset");
        return r(this.e, charset);
    }

    @Override // okio.BufferedSource
    public final void I1(long j) throws EOFException {
        if (this.e < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink L0(long j) {
        d0(j);
        return this;
    }

    public final Segment R(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.d;
        if (segment == null) {
            Segment segmentB = SegmentPool.b();
            this.d = segmentB;
            segmentB.g = segmentB;
            segmentB.f = segmentB;
            return segmentB;
        }
        Segment segment2 = segment.g;
        Intrinsics.e(segment2);
        if (segment2.c + i <= 8192 && segment2.e) {
            return segment2;
        }
        Segment segmentB2 = SegmentPool.b();
        segment2.b(segmentB2);
        return segmentB2;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink S0(ByteString byteString) {
        T(byteString);
        return this;
    }

    public final void T(ByteString byteString) {
        Intrinsics.h(byteString, "byteString");
        byteString.z(this, byteString.c());
    }

    public final long U(Source source) {
        Intrinsics.h(source, "source");
        long j = 0;
        while (true) {
            long jQ2 = source.q2(this, 8192L);
            if (jQ2 == -1) {
                return j;
            }
            j += jQ2;
        }
    }

    @Override // okio.BufferedSource
    public final long V(ByteString targetBytes) {
        Intrinsics.h(targetBytes, "targetBytes");
        return g(0L, targetBytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long X0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.Segment r6 = r14.d
            kotlin.jvm.internal.Intrinsics.e(r6)
            byte[] r7 = r6.f26782a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.d0(r4)
            r0.Y(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.v()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = okio.SegmentedByteString.d(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r8 != r9) goto L85
            okio.Segment r7 = r6.a()
            r14.d = r7
            okio.SegmentPool.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            okio.Segment r6 = r14.d
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.e
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.e = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.X0():long");
    }

    @Override // okio.BufferedSource
    public final boolean X1() {
        return this.e == 0;
    }

    public final void Y(int i) {
        Segment segmentR = R(1);
        byte[] bArr = segmentR.f26782a;
        int i2 = segmentR.c;
        segmentR.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.e++;
    }

    public final void a() {
        skip(this.e);
    }

    @Override // okio.BufferedSource
    public final boolean a0(long j, ByteString bytes) {
        Intrinsics.h(bytes, "bytes");
        return h(bytes.c(), j, bytes);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.e == 0) {
            return buffer;
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        Segment segmentC = segment.c();
        buffer.d = segmentC;
        segmentC.g = segmentC;
        segmentC.f = segmentC;
        for (Segment segment2 = segment.f; segment2 != segment; segment2 = segment2.f) {
            Segment segment3 = segmentC.g;
            Intrinsics.e(segment3);
            Intrinsics.e(segment2);
            segment3.b(segment2.c());
        }
        buffer.e = this.e;
        return buffer;
    }

    public final void b0(long j) {
        boolean z;
        if (j == 0) {
            Y(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                t0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = okio.internal.Buffer.f26785a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > okio.internal.Buffer.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        Segment segmentR = R(i);
        byte[] bArr2 = segmentR.f26782a;
        int i2 = segmentR.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = okio.internal.Buffer.f26785a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        segmentR.c += i;
        this.e += i;
    }

    public final long c() {
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        Segment segment2 = segment.g;
        Intrinsics.e(segment2);
        return (segment2.c >= 8192 || !segment2.e) ? j : j - (r3 - segment2.b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    public final void d(Buffer out, long j, long j2) {
        Intrinsics.h(out, "out");
        long j3 = j;
        SegmentedByteString.b(this.e, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.e += j2;
        Segment segment = this.d;
        while (true) {
            Intrinsics.e(segment);
            long j4 = segment.c - segment.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            segment = segment.f;
        }
        Segment segment2 = segment;
        long j5 = j2;
        while (j5 > 0) {
            Intrinsics.e(segment2);
            Segment segmentC = segment2.c();
            int i = segmentC.b + ((int) j3);
            segmentC.b = i;
            segmentC.c = Math.min(i + ((int) j5), segmentC.c);
            Segment segment3 = out.d;
            if (segment3 == null) {
                segmentC.g = segmentC;
                segmentC.f = segmentC;
                out.d = segmentC;
            } else {
                Segment segment4 = segment3.g;
                Intrinsics.e(segment4);
                segment4.b(segmentC);
            }
            j5 -= segmentC.c - segmentC.b;
            segment2 = segment2.f;
            j3 = 0;
        }
    }

    public final void d0(long j) {
        if (j == 0) {
            Y(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment segmentR = R(i);
        byte[] bArr = segmentR.f26782a;
        int i2 = segmentR.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.Buffer.f26785a[(int) (15 & j)];
            j >>>= 4;
        }
        segmentR.c += i;
        this.e += i;
    }

    public final byte e(long j) {
        SegmentedByteString.b(this.e, j, 1L);
        Segment segment = this.d;
        if (segment == null) {
            Intrinsics.e(null);
            throw null;
        }
        long j2 = this.e;
        if (j2 - j < j) {
            while (j2 > j) {
                segment = segment.g;
                Intrinsics.e(segment);
                j2 -= segment.c - segment.b;
            }
            return segment.f26782a[(int) ((segment.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = segment.c;
            int i2 = segment.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return segment.f26782a[(int) ((i2 + j) - j3)];
            }
            segment = segment.f;
            Intrinsics.e(segment);
            j3 = j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.e;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        Segment segment2 = buffer.d;
        Intrinsics.e(segment2);
        int i = segment.b;
        int i2 = segment2.b;
        long j2 = 0;
        while (j2 < this.e) {
            long jMin = Math.min(segment.c - i, segment2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.f26782a[i] != segment2.f26782a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.c) {
                segment = segment.f;
                Intrinsics.e(segment);
                i = segment.b;
            }
            if (i2 == segment2.c) {
                segment2 = segment2.f;
                Intrinsics.e(segment2);
                i2 = segment2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final long f(byte b, long j, long j2) {
        Segment segment;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.e);
            androidx.constraintlayout.core.state.a.A(sb, " fromIndex=", j3, " toIndex=");
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.e;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (segment = this.d) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                segment = segment.g;
                Intrinsics.e(segment);
                j6 -= segment.c - segment.b;
            }
            while (j6 < j4) {
                byte[] bArr = segment.f26782a;
                long j8 = j7;
                int iMin = (int) Math.min(segment.c, (segment.b + j4) - j6);
                for (int i = (int) ((segment.b + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return (i - segment.b) + j6;
                    }
                }
                j6 += segment.c - segment.b;
                segment = segment.f;
                Intrinsics.e(segment);
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (segment.c - segment.b) + j5;
            if (j9 > j3) {
                break;
            }
            segment = segment.f;
            Intrinsics.e(segment);
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = segment.f26782a;
            int iMin2 = (int) Math.min(segment.c, (segment.b + j4) - j5);
            for (int i2 = (int) ((segment.b + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - segment.b) + j5;
                }
            }
            j5 += segment.c - segment.b;
            segment = segment.f;
            Intrinsics.e(segment);
            j3 = j5;
        }
        return -1L;
    }

    @Override // okio.BufferedSink
    public final BufferedSink f1() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
    }

    public final long g(long j, ByteString targetBytes) {
        Intrinsics.h(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "fromIndex < 0: ").toString());
        }
        Segment segment = this.d;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.e;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.g;
                Intrinsics.e(segment);
                j3 -= segment.c - segment.b;
            }
            if (targetBytes.c() == 2) {
                byte bM = targetBytes.m(0);
                byte bM2 = targetBytes.m(1);
                while (j3 < this.e) {
                    byte[] bArr = segment.f26782a;
                    int i = segment.c;
                    for (int i2 = (int) ((segment.b + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == bM || b == bM2) {
                            return (i2 - segment.b) + j3;
                        }
                    }
                    j3 += segment.c - segment.b;
                    segment = segment.f;
                    Intrinsics.e(segment);
                    j = j3;
                }
            } else {
                byte[] bArrL = targetBytes.getData();
                while (j3 < this.e) {
                    byte[] bArr2 = segment.f26782a;
                    int i3 = segment.c;
                    for (int i4 = (int) ((segment.b + j) - j3); i4 < i3; i4++) {
                        byte b2 = bArr2[i4];
                        for (byte b3 : bArrL) {
                            if (b2 == b3) {
                                return (i4 - segment.b) + j3;
                            }
                        }
                    }
                    j3 += segment.c - segment.b;
                    segment = segment.f;
                    Intrinsics.e(segment);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.c - segment.b) + j2;
            if (j4 > j) {
                break;
            }
            segment = segment.f;
            Intrinsics.e(segment);
            j2 = j4;
        }
        if (targetBytes.c() == 2) {
            byte bM3 = targetBytes.m(0);
            byte bM4 = targetBytes.m(1);
            while (j2 < this.e) {
                byte[] bArr3 = segment.f26782a;
                int i5 = segment.c;
                for (int i6 = (int) ((segment.b + j) - j2); i6 < i5; i6++) {
                    byte b4 = bArr3[i6];
                    if (b4 == bM3 || b4 == bM4) {
                        return (i6 - segment.b) + j2;
                    }
                }
                j2 += segment.c - segment.b;
                segment = segment.f;
                Intrinsics.e(segment);
                j = j2;
            }
        } else {
            byte[] bArrL2 = targetBytes.getData();
            while (j2 < this.e) {
                byte[] bArr4 = segment.f26782a;
                int i7 = segment.c;
                for (int i8 = (int) ((segment.b + j) - j2); i8 < i7; i8++) {
                    byte b5 = bArr4[i8];
                    for (byte b6 : bArrL2) {
                        if (b5 == b6) {
                            return (i8 - segment.b) + j2;
                        }
                    }
                }
                j2 += segment.c - segment.b;
                segment = segment.f;
                Intrinsics.e(segment);
                j = j2;
            }
        }
        return -1L;
    }

    public final boolean h(int i, long j, ByteString bytes) {
        Intrinsics.h(bytes, "bytes");
        if (i >= 0 && j >= 0 && i + j <= this.e && i <= bytes.c()) {
            return i == 0 || okio.internal.Buffer.a(this, bytes, j, j + 1, i) != -1;
        }
        return false;
    }

    public final int hashCode() {
        Segment segment = this.d;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.c;
            for (int i3 = segment.b; i3 < i2; i3++) {
                i = (i * 31) + segment.f26782a[i3];
            }
            segment = segment.f;
            Intrinsics.e(segment);
        } while (segment != this.d);
        return i;
    }

    public final UnsafeCursor i(UnsafeCursor unsafeCursor) {
        Intrinsics.h(unsafeCursor, "unsafeCursor");
        byte[] bArr = okio.internal.Buffer.f26785a;
        if (unsafeCursor == SegmentedByteString.f26780a) {
            unsafeCursor = new UnsafeCursor();
        }
        if (unsafeCursor.d != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.d = this;
        unsafeCursor.e = true;
        return unsafeCursor;
    }

    public final void i0(int i) {
        Segment segmentR = R(4);
        byte[] bArr = segmentR.f26782a;
        int i2 = segmentR.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentR.c = i2 + 4;
        this.e += 4;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink i2(int i, int i2, String str) {
        r0(i, i2, str);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.k(j, "byteCount: ").toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r1 = new okio.Buffer();
        r1.b0(r8);
        r1.Y(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.v()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.k():long");
    }

    public final void k0(int i) {
        Segment segmentR = R(2);
        byte[] bArr = segmentR.f26782a;
        int i2 = segmentR.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        segmentR.c = i2 + 2;
        this.e += 2;
    }

    @Override // okio.BufferedSource
    public final void l1(Buffer buffer, long j) throws EOFException {
        long j2 = this.e;
        if (j2 >= j) {
            buffer.w1(this, j);
        } else {
            buffer.w1(this, j2);
            throw new EOFException();
        }
    }

    public final void m0(OutputStream out, long j) throws IOException {
        Intrinsics.h(out, "out");
        SegmentedByteString.b(this.e, 0L, j);
        Segment segment = this.d;
        long j2 = j;
        while (j2 > 0) {
            Intrinsics.e(segment);
            int iMin = (int) Math.min(j2, segment.c - segment.b);
            out.write(segment.f26782a, segment.b, iMin);
            int i = segment.b + iMin;
            segment.b = i;
            long j3 = iMin;
            this.e -= j3;
            j2 -= j3;
            if (i == segment.c) {
                Segment segmentA = segment.a();
                this.d = segmentA;
                SegmentPool.a(segment);
                segment = segmentA;
            }
        }
    }

    @Override // okio.Source
    public final Timeout n() {
        return Timeout.e;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink n0(long j) {
        b0(j);
        return this;
    }

    @Override // okio.BufferedSource
    public final String n1(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jF = f((byte) 10, 0L, j2);
        if (jF != -1) {
            return okio.internal.Buffer.c(this, jF);
        }
        if (j2 < this.e && e(j2 - 1) == 13 && e(j2) == 10) {
            return okio.internal.Buffer.c(this, j2);
        }
        Buffer buffer = new Buffer();
        d(buffer, 0L, Math.min(32, this.e));
        throw new EOFException("\\n not found: limit=" + Math.min(this.e, j) + " content=" + buffer.p0(buffer.e).d() + (char) 8230);
    }

    public final short p() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // okio.BufferedSource
    public final ByteString p0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.k(j, "byteCount: ").toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(j(j));
        }
        ByteString byteStringH = H((int) j);
        skip(j);
        return byteStringH;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* renamed from: q */
    public final Buffer getE() {
        return this;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.k(j, "byteCount < 0: ").toString());
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.w1(this, j);
        return j;
    }

    public final String r(long j, Charset charset) {
        Intrinsics.h(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(b.k(j, "byteCount: ").toString());
        }
        if (this.e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        int i = segment.b;
        if (i + j > segment.c) {
            return new String(j(j), charset);
        }
        int i2 = (int) j;
        String str = new String(segment.f26782a, i, i2, charset);
        int i3 = segment.b + i2;
        segment.b = i3;
        this.e -= j;
        if (i3 == segment.c) {
            this.d = segment.a();
            SegmentPool.a(segment);
        }
        return str;
    }

    public final void r0(int i, int i2, String string) {
        char cCharAt;
        Intrinsics.h(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(a.d(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(b.i(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbR = a.r(i2, "endIndex > string.length: ", " > ");
            sbR.append(string.length());
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentR = R(1);
                byte[] bArr = segmentR.f26782a;
                int i3 = segmentR.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = segmentR.c;
                int i6 = (i3 + i) - i5;
                segmentR.c = i5 + i6;
                this.e += i6;
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentR2 = R(2);
                    byte[] bArr2 = segmentR2.f26782a;
                    int i7 = segmentR2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | BERTags.PRIVATE);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentR2.c = i7 + 2;
                    this.e += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentR3 = R(3);
                    byte[] bArr3 = segmentR3.f26782a;
                    int i8 = segmentR3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentR3.c = i8 + 3;
                    this.e += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        Y(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentR4 = R(4);
                        byte[] bArr4 = segmentR4.f26782a;
                        int i11 = segmentR4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        segmentR4.c = i11 + 4;
                        this.e += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink r1(String str) {
        t0(str);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.h(sink, "sink");
        Segment segment = this.d;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.c - segment.b);
        sink.put(segment.f26782a, segment.b, iMin);
        int i = segment.b + iMin;
        segment.b = i;
        this.e -= iMin;
        if (i == segment.c) {
            this.d = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        if (this.e == 0) {
            throw new EOFException();
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        int i = segment.b;
        int i2 = segment.c;
        int i3 = i + 1;
        byte b = segment.f26782a[i];
        this.e--;
        if (i3 != i2) {
            segment.b = i3;
            return b;
        }
        this.d = segment.a();
        SegmentPool.a(segment);
        return b;
    }

    @Override // okio.BufferedSource
    public final void readFully(byte[] sink) throws EOFException {
        Intrinsics.h(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // okio.BufferedSource
    public final int readInt() throws EOFException {
        if (this.e < 4) {
            throw new EOFException();
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.f26782a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.e -= 4;
        if (i5 != i2) {
            segment.b = i5;
            return i6;
        }
        this.d = segment.a();
        SegmentPool.a(segment);
        return i6;
    }

    @Override // okio.BufferedSource
    public final long readLong() throws EOFException {
        if (this.e < 8) {
            throw new EOFException();
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.f26782a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.e -= 8;
        if (i4 != i2) {
            segment.b = i4;
            return j2;
        }
        this.d = segment.a();
        SegmentPool.a(segment);
        return j2;
    }

    @Override // okio.BufferedSource
    public final short readShort() throws EOFException {
        if (this.e < 2) {
            throw new EOFException();
        }
        Segment segment = this.d;
        Intrinsics.e(segment);
        int i = segment.b;
        int i2 = segment.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.f26782a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.e -= 2;
        if (i5 == i2) {
            this.d = segment.a();
            SegmentPool.a(segment);
        } else {
            segment.b = i5;
        }
        return (short) i6;
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        return this.e >= j;
    }

    @Override // okio.BufferedSource
    public final void skip(long j) {
        while (j > 0) {
            Segment segment = this.d;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.c - segment.b);
            long j2 = iMin;
            this.e -= j2;
            j -= j2;
            int i = segment.b + iMin;
            segment.b = i;
            if (i == segment.c) {
                this.d = segment.a();
                SegmentPool.a(segment);
            }
        }
    }

    public final void t0(String string) {
        Intrinsics.h(string, "string");
        r0(0, string.length(), string);
    }

    @Override // okio.BufferedSource
    public final long t2(BufferedSink bufferedSink) {
        long j = this.e;
        if (j > 0) {
            bufferedSink.w1(this, j);
        }
        return j;
    }

    public final String toString() {
        return C().toString();
    }

    @Override // okio.BufferedSource
    public final byte[] u0() {
        return j(this.e);
    }

    public final String v() {
        return r(this.e, Charsets.f24671a);
    }

    @Override // okio.Sink
    public final void w1(Buffer source, long j) {
        Segment segmentB;
        Intrinsics.h(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        SegmentedByteString.b(source.e, 0L, j);
        while (j > 0) {
            Segment segment = source.d;
            Intrinsics.e(segment);
            int i = segment.c;
            Segment segment2 = source.d;
            Intrinsics.e(segment2);
            long j2 = i - segment2.b;
            int i2 = 0;
            if (j < j2) {
                Segment segment3 = this.d;
                Segment segment4 = segment3 != null ? segment3.g : null;
                if (segment4 != null && segment4.e) {
                    if ((segment4.c + j) - (segment4.d ? 0 : segment4.b) <= 8192) {
                        Segment segment5 = source.d;
                        Intrinsics.e(segment5);
                        segment5.d(segment4, (int) j);
                        source.e -= j;
                        this.e += j;
                        return;
                    }
                }
                Segment segment6 = source.d;
                Intrinsics.e(segment6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > segment6.c - segment6.b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    segmentB = segment6.c();
                } else {
                    segmentB = SegmentPool.b();
                    byte[] bArr = segment6.f26782a;
                    byte[] bArr2 = segmentB.f26782a;
                    int i4 = segment6.b;
                    ArraysKt.v(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                segmentB.c = segmentB.b + i3;
                segment6.b += i3;
                Segment segment7 = segment6.g;
                Intrinsics.e(segment7);
                segment7.b(segmentB);
                source.d = segmentB;
            }
            Segment segment8 = source.d;
            Intrinsics.e(segment8);
            long j3 = segment8.c - segment8.b;
            source.d = segment8.a();
            Segment segment9 = this.d;
            if (segment9 == null) {
                this.d = segment8;
                segment8.g = segment8;
                segment8.f = segment8;
            } else {
                Segment segment10 = segment9.g;
                Intrinsics.e(segment10);
                segment10.b(segment8);
                Segment segment11 = segment8.g;
                if (segment11 == segment8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.e(segment11);
                if (segment11.e) {
                    int i5 = segment8.c - segment8.b;
                    Segment segment12 = segment8.g;
                    Intrinsics.e(segment12);
                    int i6 = 8192 - segment12.c;
                    Segment segment13 = segment8.g;
                    Intrinsics.e(segment13);
                    if (!segment13.d) {
                        Segment segment14 = segment8.g;
                        Intrinsics.e(segment14);
                        i2 = segment14.b;
                    }
                    if (i5 <= i6 + i2) {
                        Segment segment15 = segment8.g;
                        Intrinsics.e(segment15);
                        segment8.d(segment15, i5);
                        segment8.a();
                        SegmentPool.a(segment8);
                    }
                }
            }
            source.e -= j3;
            this.e += j3;
            j -= j3;
        }
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        m599write(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i) {
        Y(i);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeInt(int i) {
        i0(i);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeShort(int i) {
        k0(i);
        return this;
    }

    public final void z0(int i) {
        if (i < 128) {
            Y(i);
            return;
        }
        if (i < 2048) {
            Segment segmentR = R(2);
            byte[] bArr = segmentR.f26782a;
            int i2 = segmentR.c;
            bArr[i2] = (byte) ((i >> 6) | BERTags.PRIVATE);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            segmentR.c = i2 + 2;
            this.e += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            Y(63);
            return;
        }
        if (i < 65536) {
            Segment segmentR2 = R(3);
            byte[] bArr2 = segmentR2.f26782a;
            int i3 = segmentR2.c;
            bArr2[i3] = (byte) ((i >> 12) | BERTags.FLAGS);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            segmentR2.c = i3 + 3;
            this.e += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(SegmentedByteString.e(i)));
        }
        Segment segmentR3 = R(4);
        byte[] bArr3 = segmentR3.f26782a;
        int i4 = segmentR3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        segmentR3.c = i4 + 4;
        this.e += 4;
    }

    @Override // okio.BufferedSource
    public final InputStream z2() {
        return new Buffer$inputStream$1(this);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.h(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentR = R(1);
            int iMin = Math.min(i, 8192 - segmentR.c);
            source.get(segmentR.f26782a, segmentR.c, iMin);
            i -= iMin;
            segmentR.c += iMin;
        }
        this.e += iRemaining;
        return iRemaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m599write(byte[] source) {
        Intrinsics.h(source, "source");
        write(source, 0, source.length);
    }

    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.h(sink, "sink");
        SegmentedByteString.b(sink.length, i, i2);
        Segment segment = this.d;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.c - segment.b);
        byte[] bArr = segment.f26782a;
        int i3 = segment.b;
        ArraysKt.p(i, i3, i3 + iMin, bArr, sink);
        int i4 = segment.b + iMin;
        segment.b = i4;
        this.e -= iMin;
        if (i4 == segment.c) {
            this.d = segment.a();
            SegmentPool.a(segment);
        }
        return iMin;
    }

    public final void write(byte[] source, int i, int i2) {
        Intrinsics.h(source, "source");
        long j = i2;
        SegmentedByteString.b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentR = R(1);
            int iMin = Math.min(i3 - i, 8192 - segmentR.c);
            int i4 = i + iMin;
            ArraysKt.p(segmentR.c, i, i4, source, segmentR.f26782a);
            segmentR.c += iMin;
            i = i4;
        }
        this.e += j;
    }
}
