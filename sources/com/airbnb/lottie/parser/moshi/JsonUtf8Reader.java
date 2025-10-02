package com.airbnb.lottie.parser.moshi;

import androidx.constraintlayout.core.state.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import kotlin.text.Charsets;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;

/* loaded from: classes4.dex */
final class JsonUtf8Reader extends JsonReader {
    public static final ByteString o;
    public static final ByteString p;
    public static final ByteString q;
    public final RealBufferedSource i;
    public final Buffer j;
    public int k;
    public long l;
    public int m;
    public String n;

    static {
        ByteString byteString = ByteString.g;
        o = ByteString.Companion.b("'\\");
        p = ByteString.Companion.b("\"\\");
        q = ByteString.Companion.b("{}[]:, \n\t\r\f/\\;#=");
        ByteString.Companion.b("\n\r");
        ByteString.Companion.b("*/");
    }

    public JsonUtf8Reader(RealBufferedSource realBufferedSource) {
        this.e = new int[32];
        this.f = new String[32];
        this.g = new int[32];
        this.k = 0;
        this.i = realBufferedSource;
        this.j = realBufferedSource.e;
        g(6);
    }

    public final String A() {
        long jV = this.i.V(q);
        Buffer buffer = this.j;
        if (jV == -1) {
            return buffer.v();
        }
        buffer.getClass();
        return buffer.r(jV, Charsets.f24671a);
    }

    public final char C() throws JsonEncodingException, EOFException {
        int i;
        RealBufferedSource realBufferedSource = this.i;
        if (!realBufferedSource.request(1L)) {
            j("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.j;
        byte b = buffer.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            j("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!realBufferedSource.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bE = buffer.e(i2);
            char c2 = (char) (c << 4);
            if (bE >= 48 && bE <= 57) {
                i = bE - 48;
            } else if (bE >= 97 && bE <= 102) {
                i = bE - 87;
            } else {
                if (bE < 65 || bE > 70) {
                    j("\\u".concat(buffer.r(4L, Charsets.f24671a)));
                    throw null;
                }
                i = bE - 55;
            }
            c = (char) (i + c2);
        }
        buffer.skip(4L);
        return c;
    }

    public final void F(ByteString byteString) throws JsonEncodingException, EOFException {
        while (true) {
            long jV = this.i.V(byteString);
            if (jV == -1) {
                j("Unterminated string");
                throw null;
            }
            Buffer buffer = this.j;
            if (buffer.e(jV) != 92) {
                buffer.skip(jV + 1);
                return;
            } else {
                buffer.skip(jV + 1);
                C();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void a() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            g(1);
            this.g[this.d - 1] = 0;
            this.k = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + f() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void b() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            g(3);
            this.k = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + f() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void c() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + f() + " at path " + getPath());
        }
        int i = this.d;
        this.d = i - 1;
        int[] iArr = this.g;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.k = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.k = 0;
        this.e[0] = 8;
        this.d = 1;
        this.j.a();
        this.i.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void d() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + f() + " at path " + getPath());
        }
        int i = this.d;
        int i2 = i - 1;
        this.d = i2;
        this.f[i2] = null;
        int[] iArr = this.g;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token f() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return JsonReader.Token.f;
            case 2:
                return JsonReader.Token.g;
            case 3:
                return JsonReader.Token.d;
            case 4:
                return JsonReader.Token.e;
            case 5:
            case 6:
                return JsonReader.Token.k;
            case 7:
                return JsonReader.Token.l;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.i;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.h;
            case 16:
            case 17:
                return JsonReader.Token.j;
            case 18:
                return JsonReader.Token.m;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int h(JsonReader.Options options) throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL < 12 || iL > 15) {
            return -1;
        }
        if (iL == 15) {
            return p(this.n, options);
        }
        int iA2 = this.i.A2(options.b);
        if (iA2 != -1) {
            this.k = 0;
            this.f[this.d - 1] = options.f13474a[iA2];
            return iA2;
        }
        String str = this.f[this.d - 1];
        String strNextName = nextName();
        int iP = p(strNextName, options);
        if (iP == -1) {
            this.k = 15;
            this.n = strNextName;
            this.f[this.d - 1] = str;
        }
        return iP;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean hasNext() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void i() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            long jV = this.i.V(q);
            Buffer buffer = this.j;
            if (jV == -1) {
                jV = buffer.e;
            }
            buffer.skip(jV);
        } else if (iL == 13) {
            F(p);
        } else if (iL == 12) {
            F(o);
        } else if (iL != 15) {
            throw new JsonDataException("Expected a name but was " + f() + " at path " + getPath());
        }
        this.k = 0;
        this.f[this.d - 1] = "null";
    }

    public final void k() throws JsonEncodingException {
        j("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (r(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.l = r8;
        r7.skip(r2);
        r9 = 16;
        r22.k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.m = r2;
        r9 = 17;
        r22.k = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l() throws com.airbnb.lottie.parser.moshi.JsonEncodingException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.l():int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean nextBoolean() throws JsonEncodingException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.k = 0;
            int[] iArr = this.g;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iL == 6) {
            this.k = 0;
            int[] iArr2 = this.g;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + f() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double nextDouble() throws JsonEncodingException, NumberFormatException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            this.k = 0;
            int[] iArr = this.g;
            int i = this.d - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iL == 17) {
            long j = this.m;
            Buffer buffer = this.j;
            buffer.getClass();
            this.n = buffer.r(j, Charsets.f24671a);
        } else if (iL == 9) {
            this.n = x(p);
        } else if (iL == 8) {
            this.n = x(o);
        } else if (iL == 10) {
            this.n = A();
        } else if (iL != 11) {
            throw new JsonDataException("Expected a double but was " + f() + " at path " + getPath());
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbN = a.n(d, "JSON forbids NaN and infinities: ", " at path ");
                sbN.append(getPath());
                throw new JsonEncodingException(sbN.toString());
            }
            this.n = null;
            this.k = 0;
            int[] iArr2 = this.g;
            int i2 = this.d - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int nextInt() throws JsonEncodingException, NumberFormatException, EOFException {
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 16) {
            long j = this.l;
            int i = (int) j;
            if (j == i) {
                this.k = 0;
                int[] iArr = this.g;
                int i2 = this.d - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.l + " at path " + getPath());
        }
        if (iL == 17) {
            long j2 = this.m;
            Buffer buffer = this.j;
            buffer.getClass();
            this.n = buffer.r(j2, Charsets.f24671a);
        } else if (iL == 9 || iL == 8) {
            String strX = iL == 9 ? x(p) : x(o);
            this.n = strX;
            try {
                int i3 = Integer.parseInt(strX);
                this.k = 0;
                int[] iArr2 = this.g;
                int i4 = this.d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iL != 11) {
            throw new JsonDataException("Expected an int but was " + f() + " at path " + getPath());
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            int i5 = (int) d;
            if (i5 != d) {
                throw new JsonDataException("Expected an int but was " + this.n + " at path " + getPath());
            }
            this.n = null;
            this.k = 0;
            int[] iArr3 = this.g;
            int i6 = this.d - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String nextName() throws JsonEncodingException, EOFException {
        String strX;
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strX = A();
        } else if (iL == 13) {
            strX = x(p);
        } else if (iL == 12) {
            strX = x(o);
        } else {
            if (iL != 15) {
                throw new JsonDataException("Expected a name but was " + f() + " at path " + getPath());
            }
            strX = this.n;
        }
        this.k = 0;
        this.f[this.d - 1] = strX;
        return strX;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String nextString() throws JsonEncodingException, EOFException {
        String strR;
        int iL = this.k;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            strR = A();
        } else if (iL == 9) {
            strR = x(p);
        } else if (iL == 8) {
            strR = x(o);
        } else if (iL == 11) {
            strR = this.n;
            this.n = null;
        } else if (iL == 16) {
            strR = Long.toString(this.l);
        } else {
            if (iL != 17) {
                throw new JsonDataException("Expected a string but was " + f() + " at path " + getPath());
            }
            long j = this.m;
            Buffer buffer = this.j;
            buffer.getClass();
            strR = buffer.r(j, Charsets.f24671a);
        }
        this.k = 0;
        int[] iArr = this.g;
        int i = this.d - 1;
        iArr[i] = iArr[i] + 1;
        return strR;
    }

    public final int p(String str, JsonReader.Options options) {
        int length = options.f13474a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.f13474a[i])) {
                this.k = 0;
                this.f[this.d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean r(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void skipValue() throws JsonEncodingException, EOFException {
        int i = 0;
        do {
            int iL = this.k;
            if (iL == 0) {
                iL = l();
            }
            if (iL == 3) {
                g(1);
            } else if (iL == 1) {
                g(3);
            } else {
                if (iL == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + f() + " at path " + getPath());
                    }
                    this.d--;
                } else if (iL == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + f() + " at path " + getPath());
                    }
                    this.d--;
                } else {
                    Buffer buffer = this.j;
                    if (iL == 14 || iL == 10) {
                        long jV = this.i.V(q);
                        if (jV == -1) {
                            jV = buffer.e;
                        }
                        buffer.skip(jV);
                    } else if (iL == 9 || iL == 13) {
                        F(p);
                    } else if (iL == 8 || iL == 12) {
                        F(o);
                    } else if (iL == 17) {
                        buffer.skip(this.m);
                    } else if (iL == 18) {
                        throw new JsonDataException("Expected a value but was " + f() + " at path " + getPath());
                    }
                }
                this.k = 0;
            }
            i++;
            this.k = 0;
        } while (i != 0);
        int[] iArr = this.g;
        int i2 = this.d - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f[i2] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.i + ")";
    }

    public final int v(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            RealBufferedSource realBufferedSource = this.i;
            if (!realBufferedSource.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            Buffer buffer = this.j;
            byte bE = buffer.e(j);
            if (bE != 10 && bE != 32 && bE != 13 && bE != 9) {
                buffer.skip(j);
                if (bE == 47) {
                    if (realBufferedSource.request(2L)) {
                        k();
                        throw null;
                    }
                } else if (bE == 35) {
                    k();
                    throw null;
                }
                return bE;
            }
            i = i2;
        }
    }

    public final String x(ByteString byteString) throws JsonEncodingException {
        StringBuilder sb = null;
        while (true) {
            long jV = this.i.V(byteString);
            if (jV == -1) {
                j("Unterminated string");
                throw null;
            }
            Buffer buffer = this.j;
            if (buffer.e(jV) != 92) {
                if (sb == null) {
                    String strR = buffer.r(jV, Charsets.f24671a);
                    buffer.readByte();
                    return strR;
                }
                sb.append(buffer.r(jV, Charsets.f24671a));
                buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.r(jV, Charsets.f24671a));
            buffer.readByte();
            sb.append(C());
        }
    }
}
