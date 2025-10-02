package com.fasterxml.jackson.core.json;

import android.support.v4.media.session.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {
    public final OutputStream q;
    public final byte r;
    public byte[] s;
    public int t;
    public final int u;
    public final int v;
    public char[] w;
    public final int x;
    public final boolean y;
    public static final byte[] z = CharTypes.b(true);
    public static final byte[] A = CharTypes.b(false);
    public static final byte[] B = {110, 117, 108, 108};
    public static final byte[] C = {116, 114, 117, 101};
    public static final byte[] D = {102, 97, 108, 115, 101};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream, char c) {
        super(iOContext, i, objectCodec);
        BufferRecycler bufferRecycler = iOContext.e;
        this.q = outputStream;
        this.r = (byte) c;
        if (c != '\"') {
            this.k = CharTypes.d(c);
        }
        this.y = true;
        IOContext.a(iOContext.g);
        byte[] bArrA = bufferRecycler.a(1);
        iOContext.g = bArrA;
        this.s = bArrA;
        int length = bArrA.length;
        this.u = length;
        this.v = length >> 3;
        IOContext.a(iOContext.j);
        char[] cArrB = bufferRecycler.b(1, 0);
        iOContext.j = cArrB;
        this.w = cArrB;
        this.x = cArrB.length;
        if (h(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            j(127);
        }
    }

    public static int u2(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
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
        b2("write a boolean value");
        if (this.t + 5 >= this.u) {
            g2();
        }
        byte[] bArr = z2 ? C : D;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.s, this.t, length);
        this.t += length;
    }

    public final int B2(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iU2;
        int i2 = this.u - 6;
        int i3 = 2;
        int i4 = base64Variant.i >> 2;
        int i5 = -3;
        int i6 = 0;
        int iU22 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i6 > i5) {
                iU22 = u2(inputStream, bArr, i6, iU22, i);
                if (iU22 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = iU22 - 3;
                i6 = 0;
            }
            if (this.t > i2) {
                g2();
            }
            int i7 = i6 + 2;
            int i8 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i -= 3;
            int iF = base64Variant.f((bArr[i7] & 255) | i8, this.t, this.s);
            this.t = iF;
            i4--;
            if (i4 <= 0) {
                byte[] bArr2 = this.s;
                int i9 = iF + 1;
                this.t = i9;
                bArr2[iF] = 92;
                this.t = iF + 2;
                bArr2[i9] = 110;
                i4 = base64Variant.i >> 2;
            }
        }
        if (i <= 0 || (iU2 = u2(inputStream, bArr, i6, iU22, i)) <= 0) {
            return i;
        }
        if (this.t > i2) {
            g2();
        }
        int i10 = bArr[0] << 16;
        if (1 < iU2) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this.t = base64Variant.i(i10, i3, this.s, this.t);
        return i - i3;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void C1(SerializableString serializableString) throws IOException {
        b2("write a string");
        int i = this.t;
        int i2 = this.u;
        if (i >= i2) {
            g2();
        }
        byte[] bArr = this.s;
        int i3 = this.t;
        int i4 = i3 + 1;
        this.t = i4;
        byte b = this.r;
        bArr[i3] = b;
        int iA = serializableString.a(i4, bArr);
        if (iA < 0) {
            C2(serializableString.c());
        } else {
            this.t += iA;
        }
        if (this.t >= i2) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i5 = this.t;
        this.t = i5 + 1;
        bArr2[i5] = b;
    }

    public final void C2(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.t + length > this.u) {
            g2();
            if (length > 512) {
                this.q.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.s, this.t, length);
        this.t += length;
    }

    public final int D2(int i, int i2) {
        int i3;
        byte[] bArr = this.s;
        byte[] bArr2 = this.o ? z : A;
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            int i6 = i2 + 3;
            bArr[i4] = bArr2[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i6] = bArr2[i5 & 15];
            i &= 255;
        } else {
            int i7 = i2 + 3;
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i7] = 48;
        }
        int i8 = i3 + 1;
        bArr[i3] = bArr2[i >> 4];
        int i9 = i3 + 2;
        bArr[i8] = bArr2[i & 15];
        return i9;
    }

    public final void E2() throws IOException {
        if (this.t + 4 >= this.u) {
            g2();
        }
        System.arraycopy(B, 0, this.s, this.t, 4);
        this.t += 4;
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
            if (this.t >= this.u) {
                g2();
            }
            byte[] bArr = this.s;
            int i = this.t;
            this.t = i + 1;
            bArr[i] = 93;
        }
        JsonWriteContext jsonWriteContext = this.h;
        jsonWriteContext.g = null;
        this.h = jsonWriteContext.c;
    }

    public final void F2(String str) throws IOException {
        int i = this.t;
        int i2 = this.u;
        if (i >= i2) {
            g2();
        }
        byte[] bArr = this.s;
        int i3 = this.t;
        this.t = i3 + 1;
        byte b = this.r;
        bArr[i3] = b;
        O0(str);
        if (this.t >= i2) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i4 = this.t;
        this.t = i4 + 1;
        bArr2[i4] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void G0(char c) throws IOException {
        if (this.t + 3 >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        if (c <= 127) {
            int i = this.t;
            this.t = i + 1;
            bArr[i] = (byte) c;
        } else {
            if (c >= 2048) {
                m2(c, 0, 0, null);
                return;
            }
            int i2 = this.t;
            int i3 = i2 + 1;
            this.t = i3;
            bArr[i2] = (byte) ((c >> 6) | BERTags.PRIVATE);
            this.t = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
        }
    }

    public final void G2(int i, int i2, String str) throws IOException {
        char cCharAt;
        int i3 = i2 + i;
        int i4 = this.t;
        byte[] bArr = this.s;
        int[] iArr = this.k;
        while (i < i3 && (cCharAt = str.charAt(i)) <= 127 && iArr[cCharAt] == 0) {
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.t = i4;
        if (i < i3) {
            int i5 = this.l;
            int i6 = this.u;
            if (i5 == 0) {
                if (a.c(i3, i, 6, i4) > i6) {
                    g2();
                }
                int iK2 = this.t;
                byte[] bArr2 = this.s;
                int[] iArr2 = this.k;
                while (i < i3) {
                    int i7 = i + 1;
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 <= 127) {
                        int i8 = iArr2[cCharAt2];
                        if (i8 == 0) {
                            bArr2[iK2] = (byte) cCharAt2;
                            i = i7;
                            iK2++;
                        } else if (i8 > 0) {
                            int i9 = iK2 + 1;
                            bArr2[iK2] = 92;
                            iK2 += 2;
                            bArr2[i9] = (byte) i8;
                        } else {
                            iK2 = D2(cCharAt2, iK2);
                        }
                    } else if (cCharAt2 <= 2047) {
                        int i10 = iK2 + 1;
                        bArr2[iK2] = (byte) ((cCharAt2 >> 6) | BERTags.PRIVATE);
                        iK2 += 2;
                        bArr2[i10] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        iK2 = k2(cCharAt2, iK2);
                    }
                    i = i7;
                }
                this.t = iK2;
                return;
            }
            if (a.c(i3, i, 6, i4) > i6) {
                g2();
            }
            int iK22 = this.t;
            byte[] bArr3 = this.s;
            int[] iArr3 = this.k;
            int i11 = this.l;
            while (i < i3) {
                int i12 = i + 1;
                char cCharAt3 = str.charAt(i);
                if (cCharAt3 <= 127) {
                    int i13 = iArr3[cCharAt3];
                    if (i13 == 0) {
                        bArr3[iK22] = (byte) cCharAt3;
                        i = i12;
                        iK22++;
                    } else if (i13 > 0) {
                        int i14 = iK22 + 1;
                        bArr3[iK22] = 92;
                        iK22 += 2;
                        bArr3[i14] = (byte) i13;
                    } else {
                        iK22 = D2(cCharAt3, iK22);
                    }
                } else if (cCharAt3 > i11) {
                    iK22 = D2(cCharAt3, iK22);
                } else if (cCharAt3 <= 2047) {
                    int i15 = iK22 + 1;
                    bArr3[iK22] = (byte) ((cCharAt3 >> 6) | BERTags.PRIVATE);
                    iK22 += 2;
                    bArr3[i15] = (byte) ((cCharAt3 & '?') | 128);
                } else {
                    iK22 = k2(cCharAt3, iK22);
                }
                i = i12;
            }
            this.t = iK22;
        }
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
            if (this.t >= this.u) {
                g2();
            }
            byte[] bArr = this.s;
            int i = this.t;
            this.t = i + 1;
            bArr[i] = 125;
        }
        JsonWriteContext jsonWriteContext = this.h;
        jsonWriteContext.g = null;
        this.h = jsonWriteContext.c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void H0(SerializableString serializableString) throws IOException {
        int iE = serializableString.e(this.t, this.s);
        if (iE < 0) {
            C2(serializableString.g());
        } else {
            this.t += iE;
        }
    }

    public final void H2(char[] cArr, int i, int i2) throws IOException {
        char c;
        int i3 = i2 + i;
        int i4 = this.t;
        byte[] bArr = this.s;
        int[] iArr = this.k;
        while (i < i3 && (c = cArr[i]) <= 127 && iArr[c] == 0) {
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.t = i4;
        if (i < i3) {
            int i5 = this.l;
            int i6 = this.u;
            if (i5 == 0) {
                if (a.c(i3, i, 6, i4) > i6) {
                    g2();
                }
                int iK2 = this.t;
                byte[] bArr2 = this.s;
                int[] iArr2 = this.k;
                while (i < i3) {
                    int i7 = i + 1;
                    char c2 = cArr[i];
                    if (c2 <= 127) {
                        int i8 = iArr2[c2];
                        if (i8 == 0) {
                            bArr2[iK2] = (byte) c2;
                            i = i7;
                            iK2++;
                        } else if (i8 > 0) {
                            int i9 = iK2 + 1;
                            bArr2[iK2] = 92;
                            iK2 += 2;
                            bArr2[i9] = (byte) i8;
                        } else {
                            iK2 = D2(c2, iK2);
                        }
                    } else if (c2 <= 2047) {
                        int i10 = iK2 + 1;
                        bArr2[iK2] = (byte) ((c2 >> 6) | BERTags.PRIVATE);
                        iK2 += 2;
                        bArr2[i10] = (byte) ((c2 & '?') | 128);
                    } else {
                        iK2 = k2(c2, iK2);
                    }
                    i = i7;
                }
                this.t = iK2;
                return;
            }
            if (a.c(i3, i, 6, i4) > i6) {
                g2();
            }
            int iK22 = this.t;
            byte[] bArr3 = this.s;
            int[] iArr3 = this.k;
            int i11 = this.l;
            while (i < i3) {
                int i12 = i + 1;
                char c3 = cArr[i];
                if (c3 <= 127) {
                    int i13 = iArr3[c3];
                    if (i13 == 0) {
                        bArr3[iK22] = (byte) c3;
                        i = i12;
                        iK22++;
                    } else if (i13 > 0) {
                        int i14 = iK22 + 1;
                        bArr3[iK22] = 92;
                        iK22 += 2;
                        bArr3[i14] = (byte) i13;
                    } else {
                        iK22 = D2(c3, iK22);
                    }
                } else if (c3 > i11) {
                    iK22 = D2(c3, iK22);
                } else if (c3 <= 2047) {
                    int i15 = iK22 + 1;
                    bArr3[iK22] = (byte) ((c3 >> 6) | BERTags.PRIVATE);
                    iK22 += 2;
                    bArr3[i15] = (byte) ((c3 & '?') | 128);
                } else {
                    iK22 = k2(c3, iK22);
                }
                i = i12;
            }
            this.t = iK22;
        }
    }

    public final void I2(String str, boolean z2) throws IOException {
        byte b = this.r;
        int i = this.u;
        if (z2) {
            if (this.t >= i) {
                g2();
            }
            byte[] bArr = this.s;
            int i2 = this.t;
            this.t = i2 + 1;
            bArr[i2] = b;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int iMin = Math.min(this.v, length);
            if (this.t + iMin > i) {
                g2();
            }
            G2(i3, iMin, str);
            i3 += iMin;
            length -= iMin;
        }
        if (z2) {
            if (this.t >= i) {
                g2();
            }
            byte[] bArr2 = this.s;
            int i4 = this.t;
            this.t = i4 + 1;
            bArr2[i4] = b;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void J1(String str) throws IOException {
        b2("write a string");
        if (str == null) {
            E2();
            return;
        }
        int length = str.length();
        if (length > this.v) {
            I2(str, true);
            return;
        }
        int i = this.t + length;
        int i2 = this.u;
        if (i >= i2) {
            g2();
        }
        byte[] bArr = this.s;
        int i3 = this.t;
        this.t = i3 + 1;
        byte b = this.r;
        bArr[i3] = b;
        G2(0, length, str);
        if (this.t >= i2) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i4 = this.t;
        this.t = i4 + 1;
        bArr2[i4] = b;
    }

    public final void J2(char[] cArr, int i, int i2) throws IOException {
        do {
            int iMin = Math.min(this.v, i2);
            if (this.t + iMin > this.u) {
                g2();
            }
            H2(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void K1(char[] cArr, int i, int i2) throws IOException {
        b2("write a string");
        int i3 = this.t;
        int i4 = this.u;
        if (i3 >= i4) {
            g2();
        }
        byte[] bArr = this.s;
        int i5 = this.t;
        int i6 = i5 + 1;
        this.t = i6;
        byte b = this.r;
        bArr[i5] = b;
        if (i2 <= this.v) {
            if (i6 + i2 > i4) {
                g2();
            }
            H2(cArr, i, i2);
        } else {
            J2(cArr, i, i2);
        }
        if (this.t >= i4) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i7 = this.t;
        this.t = i7 + 1;
        bArr2[i7] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void O0(String str) throws IOException {
        char c;
        int length = str.length();
        char[] cArr = this.w;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            P0(cArr, length);
            return;
        }
        int length2 = str.length();
        if (((length2 - length) | length) < 0) {
            a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", 0, Integer.valueOf(length), Integer.valueOf(length2)));
            throw null;
        }
        char[] cArr2 = this.w;
        int length3 = cArr2.length;
        if (length <= length3) {
            str.getChars(0, length, cArr2, 0);
            P0(cArr2, length);
            return;
        }
        int i = this.u;
        int iMin = Math.min(length3, (i >> 2) + (i >> 4));
        int i2 = iMin * 3;
        int i3 = 0;
        while (length > 0) {
            int iMin2 = Math.min(iMin, length);
            str.getChars(i3, i3 + iMin2, cArr2, 0);
            if (this.t + i2 > i) {
                g2();
            }
            if (iMin2 > 1 && (c = cArr2[iMin2 - 1]) >= 55296 && c <= 56319) {
                iMin2--;
            }
            int iM2 = 0;
            while (iM2 < iMin2) {
                do {
                    char c2 = cArr2[iM2];
                    if (c2 > 127) {
                        iM2++;
                        if (c2 < 2048) {
                            byte[] bArr = this.s;
                            int i4 = this.t;
                            int i5 = i4 + 1;
                            this.t = i5;
                            bArr[i4] = (byte) ((c2 >> 6) | BERTags.PRIVATE);
                            this.t = i4 + 2;
                            bArr[i5] = (byte) ((c2 & '?') | 128);
                        } else {
                            iM2 = m2(c2, iM2, iMin2, cArr2);
                        }
                    } else {
                        byte[] bArr2 = this.s;
                        int i6 = this.t;
                        this.t = i6 + 1;
                        bArr2[i6] = (byte) c2;
                        iM2++;
                    }
                } while (iM2 < iMin2);
                i3 += iMin2;
                length -= iMin2;
            }
            i3 += iMin2;
            length -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void P0(char[] cArr, int i) throws IOException {
        W1(cArr, i);
        int i2 = i + i + i;
        int i3 = this.t + i2;
        int iM2 = 0;
        int i4 = this.u;
        if (i3 > i4) {
            if (i4 < i2) {
                byte[] bArr = this.s;
                while (iM2 < i) {
                    do {
                        char c = cArr[iM2];
                        if (c >= 128) {
                            if (this.t + 3 >= i4) {
                                g2();
                            }
                            int iM22 = iM2 + 1;
                            char c2 = cArr[iM2];
                            if (c2 < 2048) {
                                int i5 = this.t;
                                int i6 = i5 + 1;
                                this.t = i6;
                                bArr[i5] = (byte) ((c2 >> 6) | BERTags.PRIVATE);
                                this.t = i5 + 2;
                                bArr[i6] = (byte) ((c2 & '?') | 128);
                            } else {
                                iM22 = m2(c2, iM22, i, cArr);
                            }
                            iM2 = iM22;
                        } else {
                            if (this.t >= i4) {
                                g2();
                            }
                            int i7 = this.t;
                            this.t = i7 + 1;
                            bArr[i7] = (byte) c;
                            iM2++;
                        }
                    } while (iM2 < i);
                    return;
                }
                return;
            }
            g2();
        }
        while (iM2 < i) {
            do {
                char c3 = cArr[iM2];
                if (c3 > 127) {
                    iM2++;
                    if (c3 < 2048) {
                        byte[] bArr2 = this.s;
                        int i8 = this.t;
                        int i9 = i8 + 1;
                        this.t = i9;
                        bArr2[i8] = (byte) ((c3 >> 6) | BERTags.PRIVATE);
                        this.t = i8 + 2;
                        bArr2[i9] = (byte) ((c3 & '?') | 128);
                    } else {
                        iM2 = m2(c3, iM2, i, cArr);
                    }
                } else {
                    byte[] bArr3 = this.s;
                    int i10 = this.t;
                    this.t = i10 + 1;
                    bArr3[i10] = (byte) c3;
                    iM2++;
                }
            } while (iM2 < i);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void T(SerializableString serializableString) throws IOException {
        PrettyPrinter prettyPrinter = this.d;
        byte b = this.r;
        int i = this.u;
        if (prettyPrinter != null) {
            int iM = this.h.m(serializableString.getValue());
            if (iM == 4) {
                a("Can not write a field name, expecting a value");
                throw null;
            }
            if (iM == 1) {
                this.d.f(this);
            } else {
                this.d.c(this);
            }
            boolean z2 = this.n;
            if (!z2) {
                if (this.t >= i) {
                    g2();
                }
                byte[] bArr = this.s;
                int i2 = this.t;
                this.t = i2 + 1;
                bArr[i2] = b;
            }
            int iA = serializableString.a(this.t, this.s);
            if (iA < 0) {
                C2(serializableString.c());
            } else {
                this.t += iA;
            }
            if (z2) {
                return;
            }
            if (this.t >= i) {
                g2();
            }
            byte[] bArr2 = this.s;
            int i3 = this.t;
            this.t = i3 + 1;
            bArr2[i3] = b;
            return;
        }
        int iM2 = this.h.m(serializableString.getValue());
        if (iM2 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        if (iM2 == 1) {
            if (this.t >= i) {
                g2();
            }
            byte[] bArr3 = this.s;
            int i4 = this.t;
            this.t = i4 + 1;
            bArr3[i4] = 44;
        }
        if (this.n) {
            int iA2 = serializableString.a(this.t, this.s);
            if (iA2 < 0) {
                C2(serializableString.c());
                return;
            } else {
                this.t += iA2;
                return;
            }
        }
        if (this.t >= i) {
            g2();
        }
        byte[] bArr4 = this.s;
        int i5 = this.t;
        int i6 = i5 + 1;
        this.t = i6;
        bArr4[i5] = b;
        int iA3 = serializableString.a(i6, bArr4);
        if (iA3 < 0) {
            C2(serializableString.c());
        } else {
            this.t += iA3;
        }
        if (this.t >= i) {
            g2();
        }
        byte[] bArr5 = this.s;
        int i7 = this.t;
        this.t = i7 + 1;
        bArr5[i7] = b;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void T0(SerializableString serializableString) throws IOException {
        b2("write a raw (unencoded) value");
        int iE = serializableString.e(this.t, this.s);
        if (iE < 0) {
            C2(serializableString.g());
        } else {
            this.t += iE;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void U(String str) throws IOException {
        PrettyPrinter prettyPrinter = this.d;
        int i = this.x;
        int i2 = this.v;
        byte b = this.r;
        int i3 = 0;
        int i4 = this.u;
        if (prettyPrinter != null) {
            int iM = this.h.m(str);
            if (iM == 4) {
                a("Can not write a field name, expecting a value");
                throw null;
            }
            if (iM == 1) {
                this.d.f(this);
            } else {
                this.d.c(this);
            }
            if (this.n) {
                I2(str, false);
                return;
            }
            int length = str.length();
            if (length > i) {
                I2(str, true);
                return;
            }
            if (this.t >= i4) {
                g2();
            }
            byte[] bArr = this.s;
            int i5 = this.t;
            this.t = i5 + 1;
            bArr[i5] = b;
            str.getChars(0, length, this.w, 0);
            if (length <= i2) {
                if (this.t + length > i4) {
                    g2();
                }
                H2(this.w, 0, length);
            } else {
                J2(this.w, 0, length);
            }
            if (this.t >= i4) {
                g2();
            }
            byte[] bArr2 = this.s;
            int i6 = this.t;
            this.t = i6 + 1;
            bArr2[i6] = b;
            return;
        }
        int iM2 = this.h.m(str);
        if (iM2 == 4) {
            a("Can not write a field name, expecting a value");
            throw null;
        }
        if (iM2 == 1) {
            if (this.t >= i4) {
                g2();
            }
            byte[] bArr3 = this.s;
            int i7 = this.t;
            this.t = i7 + 1;
            bArr3[i7] = 44;
        }
        if (this.n) {
            I2(str, false);
            return;
        }
        int length2 = str.length();
        if (length2 > i) {
            I2(str, true);
            return;
        }
        if (this.t >= i4) {
            g2();
        }
        byte[] bArr4 = this.s;
        int i8 = this.t;
        int i9 = i8 + 1;
        this.t = i9;
        bArr4[i8] = b;
        if (length2 <= i2) {
            if (i9 + length2 > i4) {
                g2();
            }
            G2(0, length2, str);
        } else {
            do {
                int iMin = Math.min(i2, length2);
                if (this.t + iMin > i4) {
                    g2();
                }
                G2(i3, iMin, str);
                i3 += iMin;
                length2 -= iMin;
            } while (length2 > 0);
        }
        if (this.t >= i4) {
            g2();
        }
        byte[] bArr5 = this.s;
        int i10 = this.t;
        this.t = i10 + 1;
        bArr5[i10] = b;
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
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i = this.t;
        this.t = i + 1;
        bArr[i] = 91;
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
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.f)) {
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
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i2 = this.t;
        this.t = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void b0(float f) throws IOException {
        if (!this.g) {
            String str = NumberOutput.f14200a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.b(this.f)) {
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
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i = this.t;
        this.t = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void b2(String str) throws IOException {
        byte b;
        int iN = this.h.n();
        if (this.d != null) {
            f2(iN, str);
            return;
        }
        if (iN == 1) {
            b = 44;
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
                    byte[] bArrG = serializableString.g();
                    if (bArrG.length > 0) {
                        C2(bArrG);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i = this.t;
        this.t = i + 1;
        bArr[i] = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = r8.s     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
            com.fasterxml.jackson.core.JsonGenerator$Feature r1 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT     // Catch: java.io.IOException -> L19
            boolean r1 = r8.h(r1)     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
        Ld:
            com.fasterxml.jackson.core.json.JsonWriteContext r1 = r8.h     // Catch: java.io.IOException -> L19
            boolean r2 = r1.d()     // Catch: java.io.IOException -> L19
            if (r2 == 0) goto L1b
            r8.F()     // Catch: java.io.IOException -> L19
            goto Ld
        L19:
            r1 = move-exception
            goto L29
        L1b:
            boolean r1 = r1.e()     // Catch: java.io.IOException -> L19
            if (r1 == 0) goto L25
            r8.H()     // Catch: java.io.IOException -> L19
            goto Ld
        L25:
            r8.g2()     // Catch: java.io.IOException -> L19
            r1 = r0
        L29:
            r2 = 0
            r8.t = r2
            com.fasterxml.jackson.core.io.IOContext r2 = r8.j
            java.io.OutputStream r3 = r8.q
            if (r3 == 0) goto L59
            boolean r4 = r2.d     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            if (r4 != 0) goto L4f
            com.fasterxml.jackson.core.JsonGenerator$Feature r4 = com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            boolean r4 = r8.h(r4)     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            if (r4 == 0) goto L3f
            goto L4f
        L3f:
            com.fasterxml.jackson.core.JsonGenerator$Feature r4 = com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            boolean r4 = r8.h(r4)     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            if (r4 == 0) goto L59
            r3.flush()     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            goto L59
        L4b:
            r0 = move-exception
            goto L53
        L4d:
            r0 = move-exception
            goto L53
        L4f:
            r3.close()     // Catch: java.lang.RuntimeException -> L4b java.io.IOException -> L4d
            goto L59
        L53:
            if (r1 == 0) goto L58
            r0.addSuppressed(r1)
        L58:
            throw r0
        L59:
            byte[] r3 = r8.s
            r4 = 1
            java.lang.String r5 = "Trying to release buffer smaller than original"
            if (r3 == 0) goto L7e
            boolean r6 = r8.y
            if (r6 == 0) goto L7e
            r8.s = r0
            byte[] r6 = r2.g
            if (r3 == r6) goto L75
            int r7 = r3.length
            int r6 = r6.length
            if (r7 < r6) goto L6f
            goto L75
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L75:
            r2.g = r0
            com.fasterxml.jackson.core.util.BufferRecycler r6 = r2.e
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r6.f14218a
            r6.set(r4, r3)
        L7e:
            char[] r3 = r8.w
            if (r3 == 0) goto L9c
            r8.w = r0
            char[] r6 = r2.j
            if (r3 == r6) goto L93
            int r7 = r3.length
            int r6 = r6.length
            if (r7 < r6) goto L8d
            goto L93
        L8d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L93:
            r2.j = r0
            com.fasterxml.jackson.core.util.BufferRecycler r0 = r2.e
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.b
            r0.set(r4, r3)
        L9c:
            if (r1 != 0) goto L9f
            return
        L9f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.close():void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void d0(int i) throws IOException {
        b2("write a number");
        int i2 = this.t + 11;
        int i3 = this.u;
        if (i2 >= i3) {
            g2();
        }
        if (!this.g) {
            this.t = NumberOutput.g(i, this.t, this.s);
            return;
        }
        if (this.t + 13 >= i3) {
            g2();
        }
        byte[] bArr = this.s;
        int i4 = this.t;
        int i5 = i4 + 1;
        this.t = i5;
        byte b = this.r;
        bArr[i4] = b;
        int iG = NumberOutput.g(i, i5, bArr);
        byte[] bArr2 = this.s;
        this.t = iG + 1;
        bArr2[iG] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public final void flush() throws IOException {
        g2();
        OutputStream outputStream = this.q;
        if (outputStream == null || !h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        outputStream.flush();
    }

    public final void g2() throws IOException {
        int i = this.t;
        if (i > 0) {
            this.t = 0;
            this.q.write(this.s, 0, i);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void i0(long j) throws IOException {
        b2("write a number");
        boolean z2 = this.g;
        int i = this.u;
        if (!z2) {
            if (this.t + 21 >= i) {
                g2();
            }
            this.t = NumberOutput.i(this.t, j, this.s);
            return;
        }
        if (this.t + 23 >= i) {
            g2();
        }
        byte[] bArr = this.s;
        int i2 = this.t;
        int i3 = i2 + 1;
        this.t = i3;
        byte b = this.r;
        bArr[i2] = b;
        int i4 = NumberOutput.i(i3, j, bArr);
        byte[] bArr2 = this.s;
        this.t = i4 + 1;
        bArr2[i4] = b;
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

    public final int k2(int i, int i2) {
        byte[] bArr = this.o ? z : A;
        byte[] bArr2 = this.s;
        if (i < 55296 || i > 57343) {
            bArr2[i2] = (byte) ((i >> 12) | BERTags.FLAGS);
            int i3 = i2 + 2;
            bArr2[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
            int i4 = i2 + 3;
            bArr2[i3] = (byte) ((i & 63) | 128);
            return i4;
        }
        bArr2[i2] = 92;
        bArr2[i2 + 1] = 117;
        bArr2[i2 + 2] = bArr[(i >> 12) & 15];
        bArr2[i2 + 3] = bArr[(i >> 8) & 15];
        int i5 = i2 + 5;
        bArr2[i2 + 4] = bArr[(i >> 4) & 15];
        int i6 = i2 + 6;
        bArr2[i5] = bArr[i & 15];
        return i6;
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

    public final int m2(int i, int i2, int i3, char[] cArr) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.s;
            int i4 = this.t;
            int i5 = i4 + 1;
            this.t = i5;
            bArr[i4] = (byte) ((i >> 12) | BERTags.FLAGS);
            int i6 = i4 + 2;
            this.t = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.t = i4 + 3;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            a(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)));
            throw null;
        }
        char c = cArr[i2];
        if (c < 56320 || c > 57343) {
            a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(c)));
            throw null;
        }
        int i7 = (c - 56320) + ((i - 55296) << 10) + 65536;
        if (this.t + 4 > this.u) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i8 = this.t;
        int i9 = i8 + 1;
        this.t = i9;
        bArr2[i8] = (byte) ((i7 >> 18) | 240);
        int i10 = i8 + 2;
        this.t = i10;
        bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
        int i11 = i8 + 3;
        this.t = i11;
        bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
        this.t = i8 + 4;
        bArr2[i11] = (byte) ((i7 & 63) | 128);
        return i2 + 1;
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
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i = this.t;
        this.t = i + 1;
        bArr[i] = 123;
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
        int i = this.t + 6;
        int i2 = this.u;
        if (i >= i2) {
            g2();
        }
        if (!this.g) {
            this.t = NumberOutput.g(s, this.t, this.s);
            return;
        }
        if (this.t + 8 >= i2) {
            g2();
        }
        byte[] bArr = this.s;
        int i3 = this.t;
        int i4 = i3 + 1;
        this.t = i4;
        byte b = this.r;
        bArr[i3] = b;
        int iG = NumberOutput.g(s, i4, bArr);
        byte[] bArr2 = this.s;
        this.t = iG + 1;
        bArr2[iG] = b;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final int v(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        b2("write a binary value");
        int i2 = this.t;
        int i3 = this.u;
        if (i2 >= i3) {
            g2();
        }
        byte[] bArr = this.s;
        int i4 = this.t;
        this.t = i4 + 1;
        byte b = this.r;
        bArr[i4] = b;
        IOContext iOContext = this.j;
        byte[] bArrB = iOContext.b();
        try {
            if (i < 0) {
                i = w2(base64Variant, inputStream, bArrB);
            } else {
                int iB2 = B2(base64Variant, inputStream, bArrB, i);
                if (iB2 > 0) {
                    a("Too few bytes available: missing " + iB2 + " bytes (out of " + i + ")");
                    throw null;
                }
            }
            iOContext.d(bArrB);
            if (this.t >= i3) {
                g2();
            }
            byte[] bArr2 = this.s;
            int i5 = this.t;
            this.t = i5 + 1;
            bArr2[i5] = b;
            return i;
        } catch (Throwable th) {
            iOContext.d(bArrB);
            throw th;
        }
    }

    public final int w2(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.u - 6;
        int i2 = 2;
        int i3 = base64Variant.i >> 2;
        int i4 = -3;
        int i5 = 0;
        int iU2 = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i4) {
                iU2 = u2(inputStream, bArr, i5, iU2, bArr.length);
                if (iU2 < 3) {
                    break;
                }
                i4 = iU2 - 3;
                i5 = 0;
            }
            if (this.t > i) {
                g2();
            }
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) | (bArr[i5] << 8)) << 8;
            i5 += 3;
            i6 += 3;
            int iF = base64Variant.f((bArr[i7] & 255) | i8, this.t, this.s);
            this.t = iF;
            i3--;
            if (i3 <= 0) {
                byte[] bArr2 = this.s;
                int i9 = iF + 1;
                this.t = i9;
                bArr2[iF] = 92;
                this.t = iF + 2;
                bArr2[i9] = 110;
                i3 = base64Variant.i >> 2;
            }
        }
        if (iU2 <= 0) {
            return i6;
        }
        if (this.t > i) {
            g2();
        }
        int i10 = bArr[0] << 16;
        if (1 < iU2) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this.t = base64Variant.i(i10, i2, this.s, this.t);
        return i11;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        int iF;
        V1(i, i2, bArr);
        b2("write a binary value");
        int i3 = this.t;
        int i4 = this.u;
        if (i3 >= i4) {
            g2();
        }
        byte[] bArr2 = this.s;
        int i5 = this.t;
        this.t = i5 + 1;
        byte b = this.r;
        bArr2[i5] = b;
        int i6 = i2 + i;
        int i7 = i6 - 3;
        int i8 = i4 - 6;
        int i9 = base64Variant.i;
        loop0: while (true) {
            int i10 = i9 >> 2;
            while (i <= i7) {
                if (this.t > i8) {
                    g2();
                }
                int i11 = i + 2;
                int i12 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iF = base64Variant.f(i12 | (bArr[i11] & 255), this.t, this.s);
                this.t = iF;
                i10--;
                if (i10 <= 0) {
                    break;
                }
            }
            byte[] bArr3 = this.s;
            int i13 = iF + 1;
            this.t = i13;
            bArr3[iF] = 92;
            this.t = iF + 2;
            bArr3[i13] = 110;
            i9 = base64Variant.i;
        }
        int i14 = i6 - i;
        if (i14 > 0) {
            if (this.t > i8) {
                g2();
            }
            int i15 = i + 1;
            int i16 = bArr[i] << 16;
            if (i14 == 2) {
                i16 |= (bArr[i15] & 255) << 8;
            }
            this.t = base64Variant.i(i16, i14, this.s, this.t);
        }
        if (this.t >= i4) {
            g2();
        }
        byte[] bArr4 = this.s;
        int i17 = this.t;
        this.t = i17 + 1;
        bArr4[i17] = b;
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
        if (this.t >= this.u) {
            g2();
        }
        byte[] bArr = this.s;
        int i = this.t;
        this.t = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void y1(Object obj) throws IOException {
        x1(obj);
    }
}
