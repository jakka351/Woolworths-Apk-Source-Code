package io.grpc.okhttp.internal.framed;

import com.medallia.digital.mobilesdk.q2;
import io.grpc.okhttp.internal.framed.Huffman;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.Buffer;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Source;

/* loaded from: classes7.dex */
final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f24144a;
    public static final Header[] b;
    public static final Map c;

    public static final class Reader {
        public final RealBufferedSource b;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24145a = new ArrayList();
        public Header[] e = new Header[8];
        public int f = 7;
        public int g = 0;
        public int h = 0;
        public int c = 4096;
        public int d = 4096;

        public Reader(Source source) {
            this.b = Okio.c(source);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                Header[] headerArr = this.e;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public final ByteString b(int i) throws IOException {
            if (i >= 0) {
                Header[] headerArr = Hpack.b;
                if (i <= headerArr.length - 1) {
                    return headerArr[i].f24143a;
                }
            }
            int length = this.f + 1 + (i - Hpack.b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.e;
                if (length < headerArr2.length) {
                    return headerArr2[length].f24143a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(Header header) {
            this.f24145a.add(header);
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Arrays.fill(this.e, (Object) null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr = this.e;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f = this.e.length - 1;
                this.e = headerArr2;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        public final ByteString d() throws EOFException {
            RealBufferedSource realBufferedSource = this.b;
            byte b = realBufferedSource.readByte();
            int i = b & 255;
            boolean z = (b & 128) == 128;
            int iE = e(i, 127);
            if (!z) {
                return realBufferedSource.p0(iE);
            }
            Huffman huffman = Huffman.d;
            long j = iE;
            realBufferedSource.I1(j);
            byte[] bArrJ = realBufferedSource.e.j(j);
            huffman.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Huffman.Node node = huffman.f24149a;
            Huffman.Node node2 = node;
            int i2 = 0;
            int i3 = 0;
            for (byte b2 : bArrJ) {
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    node2 = node2.f24150a[(i2 >>> (i3 - 8)) & 255];
                    if (node2.f24150a == null) {
                        byteArrayOutputStream.write(node2.b);
                        i3 -= node2.c;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node node3 = node2.f24150a[(i2 << (8 - i3)) & 255];
                Huffman.Node[] nodeArr = node3.f24150a;
                int i4 = node3.c;
                if (nodeArr != null || i4 > i3) {
                    break;
                }
                byteArrayOutputStream.write(node3.b);
                i3 -= i4;
                node2 = node;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteString byteString = ByteString.g;
            return ByteString.Companion.c(byteArray);
        }

        public final int e(int i, int i2) throws EOFException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.b.readByte();
                int i5 = b & 255;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final Buffer f24146a;
        public int c;
        public int e;
        public Header[] b = new Header[8];
        public int d = 7;

        public Writer(Buffer buffer) {
            this.f24146a = buffer;
        }

        public final void a(Header header) {
            int i;
            int i2 = header.c;
            if (i2 > 4096) {
                Arrays.fill(this.b, (Object) null);
                this.d = this.b.length - 1;
                this.c = 0;
                this.e = 0;
                return;
            }
            int i3 = (this.e + i2) - 4096;
            if (i3 > 0) {
                int length = this.b.length - 1;
                int i4 = 0;
                while (true) {
                    i = this.d;
                    if (length < i || i3 <= 0) {
                        break;
                    }
                    int i5 = this.b[length].c;
                    i3 -= i5;
                    this.e -= i5;
                    this.c--;
                    i4++;
                    length--;
                }
                Header[] headerArr = this.b;
                int i6 = i + 1;
                System.arraycopy(headerArr, i6, headerArr, i6 + i4, this.c);
                this.d += i4;
            }
            int i7 = this.c + 1;
            Header[] headerArr2 = this.b;
            if (i7 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.d = this.b.length - 1;
                this.b = headerArr3;
            }
            int i8 = this.d;
            this.d = i8 - 1;
            this.b[i8] = header;
            this.c++;
            this.e += i2;
        }

        public final void b(ByteString byteString) {
            c(byteString.c(), 127, 0);
            this.f24146a.T(byteString);
        }

        public final void c(int i, int i2, int i3) {
            Buffer buffer = this.f24146a;
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
        ByteString byteString = ByteString.g;
        f24144a = ByteString.Companion.b(":");
        Header header = new Header(Header.h, "");
        ByteString byteString2 = Header.e;
        Header header2 = new Header(byteString2, "GET");
        Header header3 = new Header(byteString2, "POST");
        ByteString byteString3 = Header.f;
        Header header4 = new Header(byteString3, q2.c);
        Header header5 = new Header(byteString3, "/index.html");
        ByteString byteString4 = Header.g;
        Header header6 = new Header(byteString4, "http");
        Header header7 = new Header(byteString4, "https");
        ByteString byteString5 = Header.d;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(byteString5, "200"), new Header(byteString5, "204"), new Header(byteString5, "206"), new Header(byteString5, "304"), new Header(byteString5, "400"), new Header(byteString5, "404"), new Header(byteString5, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].f24143a)) {
                linkedHashMap.put(headerArr[i].f24143a, Integer.valueOf(i));
            }
        }
        c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ByteString byteString) throws IOException {
        int iC = byteString.c();
        for (int i = 0; i < iC; i++) {
            byte bM = byteString.m(i);
            if (bM >= 65 && bM <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.y()));
            }
        }
    }
}
