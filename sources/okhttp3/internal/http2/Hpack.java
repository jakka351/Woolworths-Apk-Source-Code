package okhttp3.internal.http2;

import com.medallia.digital.mobilesdk.q2;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import okio.Buffer;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f26737a = new Hpack();
    public static final Header[] b;
    public static final Map c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reader {
        public final RealBufferedSource c;
        public int f;
        public int g;

        /* renamed from: a, reason: collision with root package name */
        public int f26738a = 4096;
        public final ArrayList b = new ArrayList();
        public Header[] d = new Header[8];
        public int e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.c = Okio.c(continuationSource);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.d[length];
                    Intrinsics.e(header);
                    int i4 = header.c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                Header[] headerArr = this.d;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final ByteString b(int i) throws IOException {
            if (i >= 0) {
                Hpack hpack = Hpack.f26737a;
                hpack.getClass();
                Header[] headerArr = Hpack.b;
                if (i <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i].f26736a;
                }
            }
            Hpack.f26737a.getClass();
            int length = this.e + 1 + (i - Hpack.b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    Intrinsics.e(header);
                    return header.f26736a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(Header header) {
            this.b.add(header);
            int i = header.c;
            int i2 = this.f26738a;
            if (i > i2) {
                Header[] headerArr = this.d;
                ArraysKt.B(headerArr, 0, headerArr.length, null);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i) - i2);
            int i3 = this.f + 1;
            Header[] headerArr2 = this.d;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.e = this.d.length - 1;
                this.d = headerArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = header;
            this.f++;
            this.g += i;
        }

        public final ByteString d() throws EOFException {
            RealBufferedSource source = this.c;
            byte b = source.readByte();
            byte[] bArr = _UtilCommonKt.f26698a;
            int i = b & 255;
            int i2 = 0;
            boolean z = (b & 128) == 128;
            long jE = e(i, 127);
            if (!z) {
                return source.p0(jE);
            }
            Buffer buffer = new Buffer();
            Huffman.f26743a.getClass();
            Intrinsics.h(source, "source");
            Huffman.Node node = Huffman.d;
            Huffman.Node node2 = node;
            int i3 = 0;
            for (long j = 0; j < jE; j++) {
                byte b2 = source.readByte();
                byte[] bArr2 = _UtilCommonKt.f26698a;
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    Huffman.Node[] nodeArr = node2.f26744a;
                    Intrinsics.e(nodeArr);
                    node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                    Intrinsics.e(node2);
                    if (node2.f26744a == null) {
                        buffer.Y(node2.b);
                        i3 -= node2.c;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node[] nodeArr2 = node2.f26744a;
                Intrinsics.e(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                Intrinsics.e(node3);
                int i4 = node3.c;
                if (node3.f26744a != null || i4 > i3) {
                    break;
                }
                buffer.Y(node3.b);
                i3 -= i4;
                node2 = node;
            }
            return buffer.p0(buffer.e);
        }

        public final int e(int i, int i2) throws EOFException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.c.readByte();
                byte[] bArr = _UtilCommonKt.f26698a;
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final Buffer f26739a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public Header[] e = new Header[8];
        public int f = 7;

        public Writer(Buffer buffer) {
            this.f26739a = buffer;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    Intrinsics.e(header);
                    i -= header.c;
                    int i4 = this.h;
                    Header header2 = this.e[length];
                    Intrinsics.e(header2);
                    this.h = i4 - header2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                Header[] headerArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(Header header) {
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Header[] headerArr = this.e;
                ArraysKt.B(headerArr, 0, headerArr.length, null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        public final void c(ByteString data) throws EOFException {
            Intrinsics.h(data, "data");
            Huffman.f26743a.getClass();
            int iC = data.c();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < iC; i++) {
                byte bM = data.m(i);
                byte[] bArr = _UtilCommonKt.f26698a;
                j2 += Huffman.c[bM & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int iC2 = data.c();
            Buffer buffer = this.f26739a;
            if (i2 >= iC2) {
                e(data.c(), 127, 0);
                buffer.T(data);
                return;
            }
            Buffer buffer2 = new Buffer();
            Huffman.f26743a.getClass();
            int iC3 = data.c();
            int i3 = 0;
            for (int i4 = 0; i4 < iC3; i4++) {
                byte bM2 = data.m(i4);
                byte[] bArr2 = _UtilCommonKt.f26698a;
                int i5 = bM2 & 255;
                int i6 = Huffman.b[i5];
                byte b = Huffman.c[i5];
                j = (j << b) | i6;
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    buffer2.Y((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                buffer2.Y((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            ByteString byteStringP0 = buffer2.p0(buffer2.e);
            e(byteStringP0.c(), 127, 128);
            buffer.T(byteStringP0);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.ArrayList r14) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i, int i2, int i3) {
            Buffer buffer = this.f26739a;
            if (i < i2) {
                buffer.Y(i | i3);
                return;
            }
            buffer.Y(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                buffer.Y(128 | (i4 & 127));
                i4 >>>= 7;
            }
            buffer.Y(i4);
        }
    }

    static {
        Header header = new Header(Header.i, "");
        ByteString byteString = Header.f;
        Header header2 = new Header(byteString, "GET");
        Header header3 = new Header(byteString, "POST");
        ByteString byteString2 = Header.g;
        Header header4 = new Header(byteString2, q2.c);
        Header header5 = new Header(byteString2, "/index.html");
        ByteString byteString3 = Header.h;
        Header header6 = new Header(byteString3, "http");
        Header header7 = new Header(byteString3, "https");
        ByteString byteString4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length, 1.0f);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].f26736a)) {
                linkedHashMap.put(headerArr[i].f26736a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.g(mapUnmodifiableMap, "unmodifiableMap(...)");
        c = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(ByteString name) throws IOException {
        Intrinsics.h(name, "name");
        int iC = name.c();
        for (int i = 0; i < iC; i++) {
            byte bM = name.m(i);
            if (65 <= bM && bM < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.y()));
            }
        }
    }
}
