package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    public static final char[] y = CharTypes.c(true);
    public static final char[] z = CharTypes.c(false);
    public final Writer q;
    public final char r;
    public char[] s;
    public int t;
    public int u;
    public final int v;
    public char[] w;
    public SerializableString x;

    public WriterBasedJsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, Writer writer, char c) {
        super(iOContext, i, objectCodec);
        this.q = writer;
        IOContext.a(iOContext.j);
        char[] cArrB = iOContext.e.b(1, 0);
        iOContext.j = cArrB;
        this.s = cArrB;
        this.v = cArrB.length;
        this.r = c;
        if (c != '\"') {
            this.k = CharTypes.d(c);
        }
    }

    public static int B2(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i < i2) {
            bArr[i5] = bArr[i];
            i5++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i6 = iMin - i5;
            if (i6 == 0 || (i4 = inputStream.read(bArr, i5, i6)) < 0) {
                return i5;
            }
            i5 += i4;
        } while (i5 < 3);
        return i5;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void A(boolean z2) throws IOException {
        int i;
        b2("write a boolean value");
        if (this.u + 5 >= this.v) {
            m2();
        }
        int i2 = this.u;
        char[] cArr = this.s;
        if (z2) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.u = i + 1;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void C1(SerializableString serializableString) throws IOException {
        b2("write a string");
        int i = this.u;
        int i2 = this.v;
        if (i >= i2) {
            m2();
        }
        char[] cArr = this.s;
        int i3 = this.u;
        int i4 = i3 + 1;
        this.u = i4;
        char c = this.r;
        cArr[i3] = c;
        int iF = serializableString.f(cArr, i4);
        if (iF >= 0) {
            int i5 = this.u + iF;
            this.u = i5;
            if (i5 >= i2) {
                m2();
            }
            char[] cArr2 = this.s;
            int i6 = this.u;
            this.u = i6 + 1;
            cArr2[i6] = c;
            return;
        }
        char[] cArrB = serializableString.b();
        int length = cArrB.length;
        if (length < 32) {
            if (length > i2 - this.u) {
                m2();
            }
            System.arraycopy(cArrB, 0, this.s, this.u, length);
            this.u += length;
        } else {
            m2();
            this.q.write(cArrB, 0, length);
        }
        if (this.u >= i2) {
            m2();
        }
        char[] cArr3 = this.s;
        int i7 = this.u;
        this.u = i7 + 1;
        cArr3[i7] = c;
    }

    public final int C2(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.v - 6;
        int i2 = 2;
        int i3 = base64Variant.i >> 2;
        int i4 = -3;
        int i5 = 0;
        int iB2 = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i4) {
                iB2 = B2(inputStream, bArr, i5, iB2, bArr.length);
                if (iB2 < 3) {
                    break;
                }
                i4 = iB2 - 3;
                i5 = 0;
            }
            if (this.u > i) {
                m2();
            }
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) | (bArr[i5] << 8)) << 8;
            i5 += 3;
            i6 += 3;
            int iG = base64Variant.g(this.s, (bArr[i7] & 255) | i8, this.u);
            this.u = iG;
            i3--;
            if (i3 <= 0) {
                char[] cArr = this.s;
                int i9 = iG + 1;
                this.u = i9;
                cArr[iG] = '\\';
                this.u = iG + 2;
                cArr[i9] = 'n';
                i3 = base64Variant.i >> 2;
            }
        }
        if (iB2 <= 0) {
            return i6;
        }
        if (this.u > i) {
            m2();
        }
        int i10 = bArr[0] << 16;
        if (1 < iB2) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this.u = base64Variant.h(i10, i2, this.u, this.s);
        return i11;
    }

    public final int D2(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iB2;
        int i2 = this.v - 6;
        int i3 = 2;
        int i4 = base64Variant.i >> 2;
        int i5 = -3;
        int i6 = 0;
        int iB22 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i6 > i5) {
                iB22 = B2(inputStream, bArr, i6, iB22, i);
                if (iB22 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = iB22 - 3;
                i6 = 0;
            }
            if (this.u > i2) {
                m2();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i -= 3;
            int iG = base64Variant.g(this.s, (bArr[i7] & 255) | i8, this.u);
            this.u = iG;
            i4--;
            if (i4 <= 0) {
                char[] cArr = this.s;
                int i9 = iG + 1;
                this.u = i9;
                cArr[iG] = '\\';
                this.u = iG + 2;
                cArr[i9] = 'n';
                i4 = base64Variant.i >> 2;
            }
        }
        if (i <= 0 || (iB2 = B2(inputStream, bArr, i6, iB22, i)) <= 0) {
            return i;
        }
        if (this.u > i2) {
            m2();
        }
        int i10 = bArr[0] << 16;
        if (1 < iB2) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.u = base64Variant.h(i10, i3, this.u, this.s);
        return i - i3;
    }

    public final void E2() throws IOException {
        if (this.u + 4 >= this.v) {
            m2();
        }
        int i = this.u;
        char[] cArr = this.s;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.u = i + 4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void F() throws IOException {
        if (!this.h.d()) {
            a("Current context not Array but ".concat(this.h.h()));
            throw null;
        }
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.a(this, this.h.b + 1);
        } else {
            if (this.u >= this.v) {
                m2();
            }
            char[] cArr = this.s;
            int i = this.u;
            this.u = i + 1;
            cArr[i] = ']';
        }
        JsonWriteContext jsonWriteContext = this.h;
        jsonWriteContext.g = null;
        this.h = jsonWriteContext.c;
    }

    public final void F2(String str) throws IOException {
        int i = this.u;
        int i2 = this.v;
        if (i >= i2) {
            m2();
        }
        char[] cArr = this.s;
        int i3 = this.u;
        this.u = i3 + 1;
        char c = this.r;
        cArr[i3] = c;
        O0(str);
        if (this.u >= i2) {
            m2();
        }
        char[] cArr2 = this.s;
        int i4 = this.u;
        this.u = i4 + 1;
        cArr2[i4] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G0(char c) throws IOException {
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r16
  0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G2(java.lang.String r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.G2(java.lang.String):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H() throws IOException {
        if (!this.h.e()) {
            a("Current context not Object but ".concat(this.h.h()));
            throw null;
        }
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.d(this, this.h.b + 1);
        } else {
            if (this.u >= this.v) {
                m2();
            }
            char[] cArr = this.s;
            int i = this.u;
            this.u = i + 1;
            cArr[i] = '}';
        }
        JsonWriteContext jsonWriteContext = this.h;
        jsonWriteContext.g = null;
        this.h = jsonWriteContext.c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H0(SerializableString serializableString) throws IOException {
        int iD = serializableString.d(this.s, this.u);
        if (iD < 0) {
            O0(serializableString.getValue());
        } else {
            this.u += iD;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J1(String str) throws IOException {
        b2("write a string");
        if (str == null) {
            E2();
            return;
        }
        int i = this.u;
        int i2 = this.v;
        if (i >= i2) {
            m2();
        }
        char[] cArr = this.s;
        int i3 = this.u;
        this.u = i3 + 1;
        char c = this.r;
        cArr[i3] = c;
        G2(str);
        if (this.u >= i2) {
            m2();
        }
        char[] cArr2 = this.s;
        int i4 = this.u;
        this.u = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r11
  0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(char[] r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.K1(char[], int, int):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O0(String str) throws IOException {
        int length = str.length();
        int i = this.u;
        int i2 = this.v;
        int i3 = i2 - i;
        if (i3 == 0) {
            m2();
            i3 = i2 - this.u;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.s, this.u);
            this.u += length;
            return;
        }
        int i4 = this.u;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.s, i4);
        this.u += i5;
        m2();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.s, 0);
            this.t = 0;
            this.u = i2;
            m2();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.s, 0);
        this.t = 0;
        this.u = length2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P0(char[] cArr, int i) throws IOException {
        W1(cArr, i);
        if (i >= 32) {
            m2();
            this.q.write(cArr, 0, i);
        } else {
            if (i > this.v - this.u) {
                m2();
            }
            System.arraycopy(cArr, 0, this.s, this.u, i);
            this.u += i;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void T(SerializableString serializableString) throws IOException {
        int iM = this.h.m(serializableString.getValue());
        if (iM == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z2 = iM == 1;
        PrettyPrinter prettyPrinter = this.d;
        int i = this.v;
        char c = this.r;
        if (prettyPrinter != null) {
            if (z2) {
                prettyPrinter.f(this);
            } else {
                prettyPrinter.c(this);
            }
            char[] cArrB = serializableString.b();
            if (this.n) {
                P0(cArrB, cArrB.length);
                return;
            }
            if (this.u >= i) {
                m2();
            }
            char[] cArr = this.s;
            int i2 = this.u;
            this.u = i2 + 1;
            cArr[i2] = c;
            P0(cArrB, cArrB.length);
            if (this.u >= i) {
                m2();
            }
            char[] cArr2 = this.s;
            int i3 = this.u;
            this.u = i3 + 1;
            cArr2[i3] = c;
            return;
        }
        if (this.u + 1 >= i) {
            m2();
        }
        if (z2) {
            char[] cArr3 = this.s;
            int i4 = this.u;
            this.u = i4 + 1;
            cArr3[i4] = ',';
        }
        if (this.n) {
            char[] cArrB2 = serializableString.b();
            P0(cArrB2, cArrB2.length);
            return;
        }
        char[] cArr4 = this.s;
        int i5 = this.u;
        int i6 = i5 + 1;
        this.u = i6;
        cArr4[i5] = c;
        int iF = serializableString.f(cArr4, i6);
        if (iF < 0) {
            char[] cArrB3 = serializableString.b();
            P0(cArrB3, cArrB3.length);
            if (this.u >= i) {
                m2();
            }
            char[] cArr5 = this.s;
            int i7 = this.u;
            this.u = i7 + 1;
            cArr5[i7] = c;
            return;
        }
        int i8 = this.u + iF;
        this.u = i8;
        if (i8 >= i) {
            m2();
        }
        char[] cArr6 = this.s;
        int i9 = this.u;
        this.u = i9 + 1;
        cArr6[i9] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(String str) throws IOException {
        int iM = this.h.m(str);
        if (iM == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z2 = iM == 1;
        PrettyPrinter prettyPrinter = this.d;
        int i = this.v;
        char c = this.r;
        if (prettyPrinter != null) {
            if (z2) {
                prettyPrinter.f(this);
            } else {
                prettyPrinter.c(this);
            }
            if (this.n) {
                G2(str);
                return;
            }
            if (this.u >= i) {
                m2();
            }
            char[] cArr = this.s;
            int i2 = this.u;
            this.u = i2 + 1;
            cArr[i2] = c;
            G2(str);
            if (this.u >= i) {
                m2();
            }
            char[] cArr2 = this.s;
            int i3 = this.u;
            this.u = i3 + 1;
            cArr2[i3] = c;
            return;
        }
        if (this.u + 1 >= i) {
            m2();
        }
        if (z2) {
            char[] cArr3 = this.s;
            int i4 = this.u;
            this.u = i4 + 1;
            cArr3[i4] = ',';
        }
        if (this.n) {
            G2(str);
            return;
        }
        char[] cArr4 = this.s;
        int i5 = this.u;
        this.u = i5 + 1;
        cArr4[i5] = c;
        G2(str);
        if (this.u >= i) {
            m2();
        }
        char[] cArr5 = this.s;
        int i6 = this.u;
        this.u = i6 + 1;
        cArr5[i6] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void W0() throws IOException {
        b2("start an array");
        this.h = this.h.i();
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.g(this);
            return;
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Y() throws IOException {
        b2("write a null");
        E2();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void Z(double d) throws IOException {
        if (!this.g) {
            String str = NumberOutput.f14200a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !h(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                b2("write a number");
                O0(NumberOutput.k(d, h(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        J1(NumberOutput.k(d, h(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void a1(int i, Object obj) throws IOException {
        b2("start an array");
        this.h = this.h.j(obj);
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.g(this);
            return;
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i2 = this.u;
        this.u = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b0(float f) throws IOException {
        if (!this.g) {
            String str = NumberOutput.f14200a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !h(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                b2("write a number");
                O0(NumberOutput.l(f, h(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        J1(NumberOutput.l(f, h(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b1(Object obj) throws IOException {
        b2("start an array");
        this.h = this.h.j(obj);
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.g(this);
            return;
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void b2(String str) throws IOException {
        char c;
        int iN = this.h.n();
        if (this.d != null) {
            f2(iN, str);
            return;
        }
        if (iN == 1) {
            c = ',';
        } else {
            if (iN != 2) {
                if (iN != 3) {
                    if (iN != 5) {
                        return;
                    }
                    e2(str);
                    throw null;
                }
                SerializableString serializableString = this.m;
                if (serializableString != null) {
                    O0(serializableString.getValue());
                    return;
                }
                return;
            }
            c = ':';
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 0
            char[] r1 = r6.s     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L19
            boolean r1 = r6.h(r1)     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
        Ld:
            com.fasterxml.jackson.core.json.JsonWriteContext r1 = r6.h     // Catch: java.io.IOException -> L19
            boolean r2 = r1.d()     // Catch: java.io.IOException -> L19
            if (r2 == 0) goto L1b
            r6.F()     // Catch: java.io.IOException -> L19
            goto Ld
        L19:
            r1 = move-exception
            goto L29
        L1b:
            boolean r1 = r1.e()     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
            r6.H()     // Catch: java.io.IOException -> L19
            goto Ld
        L25:
            r6.m2()     // Catch: java.io.IOException -> L19
            r1 = r0
        L29:
            r2 = 0
            r6.t = r2
            r6.u = r2
            com.fasterxml.jackson.core.io.IOContext r2 = r6.j
            java.io.Writer r3 = r6.q
            if (r3 == 0) goto L5b
            boolean r4 = r2.d     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            if (r4 != 0) goto L51
            com.fasterxml.jackson.core.JsonGenerator$Feature r4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            boolean r4 = r6.h(r4)     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            if (r4 == 0) goto L41
            goto L51
        L41:
            com.fasterxml.jackson.core.JsonGenerator$Feature r4 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            boolean r4 = r6.h(r4)     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            if (r4 == 0) goto L5b
            r3.flush()     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            goto L5b
        L4d:
            r0 = move-exception
            goto L55
        L4f:
            r0 = move-exception
            goto L55
        L51:
            r3.close()     // Catch: java.lang.RuntimeException -> L4d java.io.IOException -> L4f
            goto L5b
        L55:
            if (r1 == 0) goto L5a
            r0.addSuppressed(r1)
        L5a:
            throw r0
        L5b:
            char[] r3 = r6.s
            if (r3 == 0) goto L7c
            r6.s = r0
            char[] r4 = r2.j
            if (r3 == r4) goto L72
            int r5 = r3.length
            int r4 = r4.length
            if (r5 < r4) goto L6a
            goto L72
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to release buffer smaller than original"
            r0.<init>(r1)
            throw r0
        L72:
            r2.j = r0
            com.fasterxml.jackson.core.util.BufferRecycler r0 = r2.e
            r2 = 1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.b
            r0.set(r2, r3)
        L7c:
            if (r1 != 0) goto L7f
            return
        L7f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.close():void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void d0(int i) throws IOException {
        b2("write a number");
        boolean z2 = this.g;
        int i2 = this.v;
        if (!z2) {
            if (this.u + 11 >= i2) {
                m2();
            }
            this.u = NumberOutput.h(this.s, i, this.u);
            return;
        }
        if (this.u + 13 >= i2) {
            m2();
        }
        char[] cArr = this.s;
        int i3 = this.u;
        int i4 = i3 + 1;
        this.u = i4;
        char c = this.r;
        cArr[i3] = c;
        int iH = NumberOutput.h(cArr, i, i4);
        char[] cArr2 = this.s;
        this.u = iH + 1;
        cArr2[iH] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() throws IOException {
        m2();
        Writer writer = this.q;
        if (writer == null || !h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        writer.flush();
    }

    public final char[] g2() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.w = cArr;
        return cArr;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(long j) throws IOException {
        b2("write a number");
        boolean z2 = this.g;
        int i = this.v;
        if (!z2) {
            if (this.u + 21 >= i) {
                m2();
            }
            this.u = NumberOutput.j(j, this.s, this.u);
            return;
        }
        if (this.u + 23 >= i) {
            m2();
        }
        char[] cArr = this.s;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        char c = this.r;
        cArr[i2] = c;
        int iJ = NumberOutput.j(j, cArr, i3);
        char[] cArr2 = this.s;
        this.u = iJ + 1;
        cArr2[iJ] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k0(String str) throws IOException {
        b2("write a number");
        if (str == null) {
            E2();
        } else if (this.g) {
            F2(str);
        } else {
            O0(str);
        }
    }

    public final void k2(char c, int i) throws IOException {
        int i2;
        int i3 = this.v;
        if (i >= 0) {
            if (this.u + 2 > i3) {
                m2();
            }
            char[] cArr = this.s;
            int i4 = this.u;
            int i5 = i4 + 1;
            this.u = i5;
            cArr[i4] = '\\';
            this.u = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            SerializableString serializableString = this.x;
            serializableString.getClass();
            String value = serializableString.getValue();
            this.x = null;
            int length = value.length();
            if (this.u + length > i3) {
                m2();
                if (length > i3) {
                    this.q.write(value);
                    return;
                }
            }
            value.getChars(0, length, this.s, this.u);
            this.u += length;
            return;
        }
        if (this.u + 5 >= i3) {
            m2();
        }
        int i6 = this.u;
        char[] cArr2 = this.s;
        char[] cArr3 = this.o ? y : z;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = '0';
            i2 = i6 + 4;
            cArr2[i10] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.u = i2 + 2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void m0(BigDecimal bigDecimal) throws IOException {
        b2("write a number");
        if (bigDecimal == null) {
            E2();
        } else if (this.g) {
            F2(U1(bigDecimal));
        } else {
            O0(U1(bigDecimal));
        }
    }

    public final void m2() throws IOException {
        int i = this.u;
        int i2 = this.t;
        int i3 = i - i2;
        if (i3 > 0) {
            this.t = 0;
            this.u = 0;
            this.q.write(this.s, i2, i3);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void p1() throws IOException {
        b2("start an object");
        this.h = this.h.k();
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.j(this);
            return;
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void r0(BigInteger bigInteger) throws IOException {
        b2("write a number");
        if (bigInteger == null) {
            E2();
        } else if (this.g) {
            F2(bigInteger.toString());
        } else {
            O0(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void t0(short s) throws IOException {
        b2("write a number");
        boolean z2 = this.g;
        int i = this.v;
        if (!z2) {
            if (this.u + 6 >= i) {
                m2();
            }
            this.u = NumberOutput.h(this.s, s, this.u);
            return;
        }
        if (this.u + 8 >= i) {
            m2();
        }
        char[] cArr = this.s;
        int i2 = this.u;
        int i3 = i2 + 1;
        this.u = i3;
        char c = this.r;
        cArr[i2] = c;
        int iH = NumberOutput.h(cArr, s, i3);
        char[] cArr2 = this.s;
        this.u = iH + 1;
        cArr2[iH] = c;
    }

    public final int u2(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        int i4;
        Writer writer = this.q;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrG2 = this.w;
            if (cArrG2 == null) {
                cArrG2 = g2();
            }
            cArrG2[1] = (char) i3;
            writer.write(cArrG2, 0, 2);
            return i;
        }
        if (i3 == -2) {
            SerializableString serializableString = this.x;
            serializableString.getClass();
            String value = serializableString.getValue();
            this.x = null;
            int length = value.length();
            if (i < length || i >= i2) {
                writer.write(value);
                return i;
            }
            int i6 = i - length;
            value.getChars(0, length, cArr, i6);
            return i6;
        }
        char[] cArr2 = this.o ? y : z;
        if (i <= 5 || i >= i2) {
            char[] cArrG22 = this.w;
            if (cArrG22 == null) {
                cArrG22 = g2();
            }
            this.t = this.u;
            if (c <= 255) {
                cArrG22[6] = cArr2[c >> 4];
                cArrG22[7] = cArr2[c & 15];
                writer.write(cArrG22, 2, 6);
                return i;
            }
            int i7 = c >> '\b';
            cArrG22[10] = cArr2[(i7 & 255) >> 4];
            cArrG22[11] = cArr2[i7 & 15];
            cArrG22[12] = cArr2[(c & 255) >> 4];
            cArrG22[13] = cArr2[c & 15];
            writer.write(cArrG22, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i8 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i9 = c >> '\b';
            int i10 = i - 3;
            cArr[i8] = cArr2[(i9 & 255) >> 4];
            i4 = i - 2;
            cArr[i10] = cArr2[i9 & 15];
            c = (char) (c & 255);
        } else {
            int i11 = i - 3;
            cArr[i8] = '0';
            i4 = i - 2;
            cArr[i11] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final int v(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        b2("write a binary value");
        int i2 = this.u;
        int i3 = this.v;
        if (i2 >= i3) {
            m2();
        }
        char[] cArr = this.s;
        int i4 = this.u;
        this.u = i4 + 1;
        char c = this.r;
        cArr[i4] = c;
        IOContext iOContext = this.j;
        byte[] bArrB = iOContext.b();
        try {
            if (i < 0) {
                i = C2(base64Variant, inputStream, bArrB);
            } else {
                int iD2 = D2(base64Variant, inputStream, bArrB, i);
                if (iD2 > 0) {
                    a("Too few bytes available: missing " + iD2 + " bytes (out of " + i + ")");
                    throw null;
                }
            }
            iOContext.d(bArrB);
            if (this.u >= i3) {
                m2();
            }
            char[] cArr2 = this.s;
            int i5 = this.u;
            this.u = i5 + 1;
            cArr2[i5] = c;
            return i;
        } catch (Throwable th) {
            iOContext.d(bArrB);
            throw th;
        }
    }

    public final void w2(char c, int i) throws IOException {
        int i2;
        Writer writer = this.q;
        if (i >= 0) {
            int i3 = this.u;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.t = i4;
                char[] cArr = this.s;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrG2 = this.w;
            if (cArrG2 == null) {
                cArrG2 = g2();
            }
            this.t = this.u;
            cArrG2[1] = (char) i;
            writer.write(cArrG2, 0, 2);
            return;
        }
        if (i == -2) {
            SerializableString serializableString = this.x;
            serializableString.getClass();
            String value = serializableString.getValue();
            this.x = null;
            int length = value.length();
            int i5 = this.u;
            if (i5 < length) {
                this.t = i5;
                writer.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this.t = i6;
                value.getChars(0, length, this.s, i6);
                return;
            }
        }
        char[] cArr2 = this.o ? y : z;
        int i7 = this.u;
        if (i7 < 6) {
            char[] cArrG22 = this.w;
            if (cArrG22 == null) {
                cArrG22 = g2();
            }
            this.t = this.u;
            if (c <= 255) {
                cArrG22[6] = cArr2[c >> 4];
                cArrG22[7] = cArr2[c & 15];
                writer.write(cArrG22, 2, 6);
                return;
            } else {
                int i8 = c >> '\b';
                cArrG22[10] = cArr2[(i8 & 255) >> 4];
                cArrG22[11] = cArr2[i8 & 15];
                cArrG22[12] = cArr2[(c & 255) >> 4];
                cArrG22[13] = cArr2[c & 15];
                writer.write(cArrG22, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.s;
        int i9 = i7 - 6;
        this.t = i9;
        cArr3[i9] = '\\';
        cArr3[i7 - 5] = 'u';
        if (c > 255) {
            int i10 = c >> '\b';
            cArr3[i7 - 4] = cArr2[(i10 & 255) >> 4];
            i2 = i7 - 3;
            cArr3[i2] = cArr2[i10 & 15];
            c = (char) (c & 255);
        } else {
            cArr3[i7 - 4] = '0';
            i2 = i7 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int iG;
        V1(i, i2, bArr);
        b2("write a binary value");
        int i3 = this.u;
        int i4 = this.v;
        if (i3 >= i4) {
            m2();
        }
        char[] cArr = this.s;
        int i5 = this.u;
        this.u = i5 + 1;
        char c = this.r;
        cArr[i5] = c;
        int i6 = i2 + i;
        int i7 = i6 - 3;
        int i8 = i4 - 6;
        int i9 = base64Variant.i;
        loop0: while (true) {
            int i10 = i9 >> 2;
            while (i <= i7) {
                if (this.u > i8) {
                    m2();
                }
                int i11 = i + 2;
                int i12 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iG = base64Variant.g(this.s, i12 | (bArr[i11] & 255), this.u);
                this.u = iG;
                i10--;
                if (i10 <= 0) {
                    break;
                }
            }
            char[] cArr2 = this.s;
            int i13 = iG + 1;
            this.u = i13;
            cArr2[iG] = '\\';
            this.u = iG + 2;
            cArr2[i13] = 'n';
            i9 = base64Variant.i;
        }
        int i14 = i6 - i;
        if (i14 > 0) {
            if (this.u > i8) {
                m2();
            }
            int i15 = i + 1;
            int i16 = bArr[i] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            this.u = base64Variant.h(i16, i14, this.u, this.s);
        }
        if (this.u >= i4) {
            m2();
        }
        char[] cArr3 = this.s;
        int i17 = this.u;
        this.u = i17 + 1;
        cArr3[i17] = c;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void x1(Object obj) throws IOException {
        b2("start an object");
        this.h = this.h.l(obj);
        PrettyPrinter prettyPrinter = this.d;
        if (prettyPrinter != null) {
            prettyPrinter.j(this);
            return;
        }
        if (this.u >= this.v) {
            m2();
        }
        char[] cArr = this.s;
        int i = this.u;
        this.u = i + 1;
        cArr[i] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y1(Object obj) throws IOException {
        x1(obj);
    }
}
