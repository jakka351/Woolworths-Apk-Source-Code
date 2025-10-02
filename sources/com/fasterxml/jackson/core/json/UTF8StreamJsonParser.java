package com.fasterxml.jackson.core.json;

import android.support.v4.media.session.a;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class UTF8StreamJsonParser extends ParserBase {
    public static final int b0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.e;
    public static final int c0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.e;
    public static final int d0 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.e;
    public static final int e0 = JsonParser.Feature.ALLOW_MISSING_VALUES.e;
    public static final int f0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.e;
    public static final int g0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.e;
    public static final int h0 = JsonParser.Feature.ALLOW_COMMENTS.e;
    public static final int i0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.e;
    public static final int[] j0 = CharTypes.f;
    public static final int[] k0 = CharTypes.e;
    public final ObjectCodec R;
    public final ByteQuadsCanonicalizer S;
    public int[] T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public InputStream Y;
    public byte[] Z;
    public final boolean a0;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(iOContext, i);
        this.T = new int[16];
        this.Y = inputStream;
        this.R = objectCodec;
        this.S = byteQuadsCanonicalizer;
        this.Z = bArr;
        this.r = i2;
        this.s = i3;
        this.v = i2 - i4;
        this.t = (-i2) + i4;
        this.a0 = z;
    }

    public static final int x3(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    public final String A3(int i) throws JsonParseException {
        int i2 = i;
        int[] iArr = k0;
        if (i2 != 34) {
            ByteQuadsCanonicalizer byteQuadsCanonicalizer = this.S;
            if (i2 == 39 && (this.d & f0) != 0) {
                if (this.r >= this.s && !o3()) {
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    k2(": was expecting closing ''' for field name");
                    throw null;
                }
                byte[] bArr = this.Z;
                int i3 = this.r;
                this.r = i3 + 1;
                int iK2 = bArr[i3] & 255;
                if (iK2 == 39) {
                    return "";
                }
                int[] iArrW2 = this.T;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (iK2 != 39) {
                    if (iArr[iK2] != 0 && iK2 != 34) {
                        if (iK2 != 92) {
                            T2(iK2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        } else {
                            iK2 = K2();
                        }
                        if (iK2 > 127) {
                            if (i4 >= 4) {
                                if (i5 >= iArrW2.length) {
                                    iArrW2 = ParserBase.W2(iArrW2.length, iArrW2);
                                    this.T = iArrW2;
                                }
                                iArrW2[i5] = i6;
                                i5++;
                                i4 = 0;
                                i6 = 0;
                            }
                            if (iK2 < 2048) {
                                i6 = (i6 << 8) | (iK2 >> 6) | BERTags.PRIVATE;
                                i4++;
                            } else {
                                int i7 = (i6 << 8) | (iK2 >> 12) | BERTags.FLAGS;
                                int i8 = i4 + 1;
                                if (i8 >= 4) {
                                    if (i5 >= iArrW2.length) {
                                        iArrW2 = ParserBase.W2(iArrW2.length, iArrW2);
                                        this.T = iArrW2;
                                    }
                                    iArrW2[i5] = i7;
                                    i5++;
                                    i8 = 0;
                                    i7 = 0;
                                }
                                i6 = (i7 << 8) | ((iK2 >> 6) & 63) | 128;
                                i4 = i8 + 1;
                            }
                            iK2 = (iK2 & 63) | 128;
                        }
                    }
                    if (i4 < 4) {
                        i4++;
                        iK2 |= i6 << 8;
                    } else {
                        if (i5 >= iArrW2.length) {
                            iArrW2 = ParserBase.W2(iArrW2.length, iArrW2);
                            this.T = iArrW2;
                        }
                        iArrW2[i5] = i6;
                        i5++;
                        i4 = 1;
                    }
                    i6 = iK2;
                    if (this.r >= this.s && !o3()) {
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        k2(" in field name");
                        throw null;
                    }
                    byte[] bArr2 = this.Z;
                    int i9 = this.r;
                    this.r = i9 + 1;
                    iK2 = bArr2[i9] & 255;
                }
                if (i4 > 0) {
                    if (i5 >= iArrW2.length) {
                        iArrW2 = ParserBase.W2(iArrW2.length, iArrW2);
                        this.T = iArrW2;
                    }
                    iArrW2[i5] = x3(i6, i4);
                    i5++;
                }
                String strM = byteQuadsCanonicalizer.m(i5, iArrW2);
                return strM == null ? a4(i5, i4, iArrW2) : strM;
            }
            int i10 = 0;
            if ((this.d & g0) == 0) {
                u2((char) e3(i), "was expecting double-quote to start field name");
                throw null;
            }
            int[] iArr2 = CharTypes.h;
            if (iArr2[i2] != 0) {
                u2(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                throw null;
            }
            int[] iArrW22 = this.T;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 < 4) {
                    i11++;
                    i2 |= i10 << 8;
                } else {
                    if (i12 >= iArrW22.length) {
                        iArrW22 = ParserBase.W2(iArrW22.length, iArrW22);
                        this.T = iArrW22;
                    }
                    iArrW22[i12] = i10;
                    i12++;
                    i11 = 1;
                }
                i10 = i2;
                if (this.r >= this.s && !o3()) {
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    k2(" in field name");
                    throw null;
                }
                byte[] bArr3 = this.Z;
                int i13 = this.r;
                i2 = bArr3[i13] & 255;
                if (iArr2[i2] != 0) {
                    if (i11 > 0) {
                        if (i12 >= iArrW22.length) {
                            iArrW22 = ParserBase.W2(iArrW22.length, iArrW22);
                            this.T = iArrW22;
                        }
                        iArrW22[i12] = i10;
                        i12++;
                    }
                    String strM2 = byteQuadsCanonicalizer.m(i12, iArrW22);
                    return strM2 == null ? a4(i12, i11, iArrW22) : strM2;
                }
                this.r = i13 + 1;
            }
        } else {
            int i14 = this.r;
            int i15 = i14 + 13;
            int i16 = this.s;
            if (i15 > i16) {
                if (i14 >= i16 && !o3()) {
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    k2(": was expecting closing '\"' for name");
                    throw null;
                }
                byte[] bArr4 = this.Z;
                int i17 = this.r;
                this.r = i17 + 1;
                int i18 = bArr4[i17] & 255;
                return i18 == 34 ? "" : g4(0, 0, i18, 0, this.T);
            }
            byte[] bArr5 = this.Z;
            int i19 = i14 + 1;
            this.r = i19;
            int i20 = bArr5[i14] & 255;
            if (iArr[i20] != 0) {
                return i20 == 34 ? "" : g4(0, 0, i20, 0, this.T);
            }
            int i21 = i14 + 2;
            this.r = i21;
            int i22 = bArr5[i19] & 255;
            if (iArr[i22] != 0) {
                return i22 == 34 ? b4(i20, 1) : g4(0, i20, i22, 1, this.T);
            }
            int i23 = i22 | (i20 << 8);
            int i24 = i14 + 3;
            this.r = i24;
            int i25 = bArr5[i21] & 255;
            if (iArr[i25] != 0) {
                return i25 == 34 ? b4(i23, 2) : g4(0, i23, i25, 2, this.T);
            }
            int i26 = (i23 << 8) | i25;
            int i27 = i14 + 4;
            this.r = i27;
            int i28 = bArr5[i24] & 255;
            if (iArr[i28] != 0) {
                return i28 == 34 ? b4(i26, 3) : g4(0, i26, i28, 3, this.T);
            }
            int i29 = (i26 << 8) | i28;
            int i30 = i14 + 5;
            this.r = i30;
            int i31 = bArr5[i27] & 255;
            if (iArr[i31] != 0) {
                return i31 == 34 ? b4(i29, 4) : g4(0, i29, i31, 4, this.T);
            }
            int i32 = i14 + 6;
            this.r = i32;
            int i33 = bArr5[i30] & 255;
            if (iArr[i33] != 0) {
                if (i33 == 34) {
                    return c4(i29, i31, 1);
                }
                int[] iArr3 = this.T;
                iArr3[0] = i29;
                return g4(1, i31, i33, 1, iArr3);
            }
            int i34 = (i31 << 8) | i33;
            int i35 = i14 + 7;
            this.r = i35;
            int i36 = bArr5[i32] & 255;
            if (iArr[i36] != 0) {
                if (i36 == 34) {
                    return c4(i29, i34, 2);
                }
                int[] iArr4 = this.T;
                iArr4[0] = i29;
                return g4(1, i34, i36, 2, iArr4);
            }
            int i37 = (i34 << 8) | i36;
            int i38 = i14 + 8;
            this.r = i38;
            int i39 = bArr5[i35] & 255;
            if (iArr[i39] != 0) {
                if (i39 == 34) {
                    return c4(i29, i37, 3);
                }
                int[] iArr5 = this.T;
                iArr5[0] = i29;
                return g4(1, i37, i39, 3, iArr5);
            }
            int i40 = (i37 << 8) | i39;
            int i41 = i14 + 9;
            this.r = i41;
            int i42 = bArr5[i38] & 255;
            if (iArr[i42] != 0) {
                if (i42 == 34) {
                    return c4(i29, i40, 4);
                }
                int[] iArr6 = this.T;
                iArr6[0] = i29;
                return g4(1, i40, i42, 4, iArr6);
            }
            int i43 = i14 + 10;
            this.r = i43;
            int i44 = bArr5[i41] & 255;
            if (iArr[i44] != 0) {
                return i44 == 34 ? d4(i29, i40, i42, 1) : h4(i29, i40, i42, i44, 1);
            }
            int i45 = (i42 << 8) | i44;
            int i46 = i14 + 11;
            this.r = i46;
            int i47 = bArr5[i43] & 255;
            if (iArr[i47] != 0) {
                return i47 == 34 ? d4(i29, i40, i45, 2) : h4(i29, i40, i45, i47, 2);
            }
            int i48 = (i45 << 8) | i47;
            int i49 = i14 + 12;
            this.r = i49;
            int i50 = bArr5[i46] & 255;
            if (iArr[i50] != 0) {
                return i50 == 34 ? d4(i29, i40, i48, 3) : h4(i29, i40, i48, i50, 3);
            }
            int i51 = (i48 << 8) | i50;
            this.r = i15;
            int i52 = bArr5[i49] & 255;
            if (iArr[i52] != 0) {
                return i52 == 34 ? d4(i29, i40, i51, 4) : h4(i29, i40, i51, i52, 4);
            }
            int[] iArr7 = this.T;
            iArr7[0] = i29;
            iArr7[1] = i40;
            iArr7[2] = i51;
            int i53 = i52;
            int i54 = 3;
            while (true) {
                int i55 = this.r;
                int i56 = i55 + 4;
                if (i56 > this.s) {
                    return g4(i54, 0, i53, 0, this.T);
                }
                int i57 = i55 + 1;
                this.r = i57;
                int i58 = bArr5[i55] & 255;
                if (iArr[i58] != 0) {
                    return i58 == 34 ? e4(i54, i53, 1, this.T) : g4(i54, i53, i58, 1, this.T);
                }
                int i59 = (i53 << 8) | i58;
                int i60 = i55 + 2;
                this.r = i60;
                int i61 = bArr5[i57] & 255;
                if (iArr[i61] != 0) {
                    return i61 == 34 ? e4(i54, i59, 2, this.T) : g4(i54, i59, i61, 2, this.T);
                }
                int i62 = (i59 << 8) | i61;
                int i63 = i55 + 3;
                this.r = i63;
                int i64 = bArr5[i60] & 255;
                if (iArr[i64] != 0) {
                    return i64 == 34 ? e4(i54, i62, 3, this.T) : g4(i54, i62, i64, 3, this.T);
                }
                int i65 = (i62 << 8) | i64;
                this.r = i56;
                int i66 = bArr5[i63] & 255;
                if (iArr[i66] != 0) {
                    return i66 == 34 ? e4(i54, i65, 4, this.T) : g4(i54, i65, i66, 4, this.T);
                }
                int[] iArr8 = this.T;
                if (i54 >= iArr8.length) {
                    this.T = ParserBase.W2(i54, iArr8);
                }
                this.T[i54] = i65;
                i53 = i66;
                i54++;
            }
        }
    }

    public final JsonToken B3(char[] cArr, int i, boolean z, int i2) throws JsonParseException {
        TextBuffer textBuffer;
        int i3;
        int i4;
        char[] cArrK = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            int i7 = this.r;
            int i8 = this.s;
            textBuffer = this.B;
            if (i7 >= i8 && !o3()) {
                textBuffer.i = i5;
                return a3(i6, z);
            }
            byte[] bArr = this.Z;
            i3 = this.r;
            this.r = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrK.length) {
                i5 = 0;
                cArrK = textBuffer.k();
            }
            cArrK[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return y3(cArrK, i5, i4, z, i6);
        }
        this.r = i3;
        textBuffer.i = i5;
        if (this.z.f()) {
            Z3(this.Z[this.r] & 255);
        }
        return a3(i6, z);
    }

    public final JsonToken C3(boolean z) throws JsonParseException {
        int i;
        int i2;
        TextBuffer textBuffer = this.B;
        char[] cArrH = textBuffer.h();
        int i3 = 1;
        int i4 = 0;
        if (z) {
            cArrH[0] = '-';
            i4 = 1;
        }
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i5 = this.r;
        this.r = i5 + 1;
        int iY3 = bArr[i5] & 255;
        if (iY3 <= 48) {
            if (iY3 != 48) {
                return iY3 == 46 ? z3(z) : m3(iY3, z, true);
            }
            iY3 = Y3();
        } else if (iY3 > 57) {
            return m3(iY3, z, true);
        }
        int i6 = i4 + 1;
        cArrH[i4] = (char) iY3;
        int iMin = Math.min(this.s, (this.r + cArrH.length) - i6);
        while (true) {
            i = this.r;
            if (i >= iMin) {
                return B3(cArrH, i6, z, i3);
            }
            byte[] bArr2 = this.Z;
            this.r = i + 1;
            i2 = bArr2[i] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i3++;
            cArrH[i6] = (char) i2;
            i6++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return y3(cArrH, i6, i2, z, i3);
        }
        this.r = i;
        textBuffer.i = i6;
        if (this.z.f()) {
            Z3(i2);
        }
        return a3(i3, z);
    }

    public final JsonToken D3(int i) throws JsonParseException {
        int i2;
        int i3;
        TextBuffer textBuffer = this.B;
        char[] cArrH = textBuffer.h();
        if (i == 48) {
            i = Y3();
        }
        cArrH[0] = (char) i;
        int i4 = 1;
        int iMin = Math.min(this.s, (this.r + cArrH.length) - 1);
        int i5 = 1;
        while (true) {
            i2 = this.r;
            if (i2 >= iMin) {
                return B3(cArrH, i4, false, i5);
            }
            byte[] bArr = this.Z;
            this.r = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrH[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return y3(cArrH, i4, i3, false, i5);
        }
        this.r = i2;
        textBuffer.i = i4;
        if (this.z.f()) {
            Z3(i3);
        }
        return a3(i5, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        r17.U = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0124, code lost:
    
        if (r7 <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0126, code lost:
    
        r8 = r8 + r7;
        r19.write(r20, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E3(com.fasterxml.jackson.core.Base64Variant r18, java.io.OutputStream r19, byte[] r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.E3(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public final void F3(int i) throws JsonParseException {
        if (i < 32) {
            B2(i);
            throw null;
        }
        G3(i);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int G0() throws InputCoercionException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.H0();
        }
        int i = this.G;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return P2();
            }
            if (i2 == 0) {
                V2();
            }
        }
        return this.H;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void G2() throws IOException {
        if (this.Y != null) {
            if (this.p.d || JsonParser.Feature.AUTO_CLOSE_SOURCE.a(this.d)) {
                this.Y.close();
            }
            this.Y = null;
        }
    }

    public final void G3(int i) throws JsonParseException {
        throw new JsonParseException(this, a.k(i, new StringBuilder("Invalid UTF-8 start byte 0x")));
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final int H0() throws InputCoercionException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.H0();
        }
        int i = this.G;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return P2();
            }
            if (i2 == 0) {
                V2();
            }
        }
        return this.H;
    }

    public final void H3(int i, int i2) throws JsonParseException {
        this.r = i2;
        I3(i);
        throw null;
    }

    public final void I3(int i) throws JsonParseException {
        throw new JsonParseException(this, a.k(i, new StringBuilder("Invalid UTF-8 middle byte 0x")));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String J1() throws JsonParseException {
        JsonToken jsonTokenC3;
        this.G = 0;
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            v3();
            return null;
        }
        if (this.U) {
            P3();
        }
        int iV3 = V3();
        if (iV3 < 0) {
            close();
            this.f = null;
            return null;
        }
        this.F = null;
        if (iV3 == 93) {
            b3();
            this.f = JsonToken.END_ARRAY;
            return null;
        }
        if (iV3 == 125) {
            c3();
            this.f = JsonToken.END_OBJECT;
            return null;
        }
        if (this.z.k()) {
            if (iV3 != 44) {
                u2(iV3, "was expecting comma to separate " + this.z.h() + " entries");
                throw null;
            }
            iV3 = T3();
            if ((this.d & b0) != 0 && (iV3 == 93 || iV3 == 125)) {
                if (iV3 == 125) {
                    c3();
                    this.f = JsonToken.END_OBJECT;
                    return null;
                }
                b3();
                this.f = JsonToken.END_ARRAY;
                return null;
            }
        }
        if (!this.z.e()) {
            X3();
            w3(iV3);
            return null;
        }
        this.W = this.u;
        int i = this.r;
        this.V = i;
        this.X = i - this.v;
        String strA3 = A3(iV3);
        this.z.l(strA3);
        this.f = jsonToken2;
        int iL3 = L3();
        X3();
        if (iL3 == 34) {
            this.U = true;
            this.A = JsonToken.VALUE_STRING;
            return strA3;
        }
        if (iL3 == 43) {
            jsonTokenC3 = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d) ? C3(false) : n3(iL3);
        } else if (iL3 == 91) {
            jsonTokenC3 = JsonToken.START_ARRAY;
        } else if (iL3 == 102) {
            q3();
            jsonTokenC3 = JsonToken.VALUE_FALSE;
        } else if (iL3 == 110) {
            r3();
            jsonTokenC3 = JsonToken.VALUE_NULL;
        } else if (iL3 == 116) {
            u3();
            jsonTokenC3 = JsonToken.VALUE_TRUE;
        } else if (iL3 == 123) {
            jsonTokenC3 = JsonToken.START_OBJECT;
        } else if (iL3 == 45) {
            jsonTokenC3 = C3(true);
        } else if (iL3 != 46) {
            switch (iL3) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenC3 = D3(iL3);
                    break;
                default:
                    jsonTokenC3 = n3(iL3);
                    break;
            }
        } else {
            jsonTokenC3 = z3(false);
        }
        this.A = jsonTokenC3;
        return strA3;
    }

    public final void J3(String str, String str2) throws JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.r >= this.s && !o3()) {
                break;
            }
            byte[] bArr = this.Z;
            int i = this.r;
            this.r = i + 1;
            char cE3 = (char) e3(bArr[i]);
            if (!Character.isJavaIdentifierPart(cE3)) {
                break;
            }
            sb.append(cE3);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String K1() {
        if (this.f == JsonToken.FIELD_NAME) {
            this.D = false;
            JsonToken jsonToken = this.A;
            this.A = null;
            this.f = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (!this.U) {
                    return this.B.g();
                }
                this.U = false;
                return j3();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this.z = this.z.i(this.x, this.y);
                return null;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                this.z = this.z.j(this.x, this.y);
                return null;
            }
        } else if (N1() == JsonToken.VALUE_STRING) {
            return k0();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final char K2() throws JsonParseException {
        if (this.r >= this.s && !o3()) {
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            k2(" in character escape sequence");
            throw null;
        }
        byte[] bArr = this.Z;
        int i = this.r;
        this.r = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
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
            char cE3 = (char) e3(b);
            O2(cE3);
            return cE3;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.r >= this.s && !o3()) {
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                k2(" in character escape sequence");
                throw null;
            }
            byte[] bArr2 = this.Z;
            int i4 = this.r;
            this.r = i4 + 1;
            byte b2 = bArr2[i4];
            int iA = CharTypes.a(b2);
            if (iA < 0) {
                u2(b2 & 255, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | iA;
        }
        return (char) i2;
    }

    public final void K3() {
        if (this.r < this.s || o3()) {
            byte[] bArr = this.Z;
            int i = this.r;
            if (bArr[i] == 10) {
                this.r = i + 1;
            }
        }
        this.u++;
        this.v = this.r;
    }

    public final int L3() {
        int i = this.r;
        if (i + 4 >= this.s) {
            return M3(false);
        }
        byte[] bArr = this.Z;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.r = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return M3(true);
                }
                this.r = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this.r = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return M3(true);
                    }
                    this.r = i + 3;
                    return b3;
                }
            }
            return M3(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this.r = i4;
            b = bArr[i4];
        }
        if (b != 58) {
            return M3(false);
        }
        int i5 = this.r;
        int i6 = i5 + 1;
        this.r = i6;
        byte b4 = bArr[i6];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return M3(true);
            }
            this.r = i5 + 2;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            int i7 = i5 + 2;
            this.r = i7;
            byte b5 = bArr[i7];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return M3(true);
                }
                this.r = i5 + 3;
                return b5;
            }
        }
        return M3(true);
    }

    public final int M3(boolean z) throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !o3()) {
                k2(" within/between " + this.z.h() + " entries");
                throw null;
            }
            byte[] bArr = this.Z;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    N3();
                } else if (i3 == 35 && (this.d & i0) != 0) {
                    O3();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        u2(i3, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.u++;
                this.v = i2;
            } else if (i3 == 13) {
                K3();
            } else if (i3 != 9) {
                B2(i3);
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken N1() throws JsonParseException {
        JsonToken jsonTokenC3;
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return v3();
        }
        this.G = 0;
        if (this.U) {
            P3();
        }
        int iV3 = V3();
        if (iV3 < 0) {
            close();
            this.f = null;
            return null;
        }
        this.F = null;
        if (iV3 == 93) {
            b3();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this.f = jsonToken3;
            return jsonToken3;
        }
        if (iV3 == 125) {
            c3();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this.f = jsonToken4;
            return jsonToken4;
        }
        if (this.z.k()) {
            if (iV3 != 44) {
                u2(iV3, "was expecting comma to separate " + this.z.h() + " entries");
                throw null;
            }
            iV3 = T3();
            if ((this.d & b0) != 0 && (iV3 == 93 || iV3 == 125)) {
                if (iV3 == 125) {
                    c3();
                    JsonToken jsonToken5 = JsonToken.END_OBJECT;
                    this.f = jsonToken5;
                    return jsonToken5;
                }
                b3();
                JsonToken jsonToken6 = JsonToken.END_ARRAY;
                this.f = jsonToken6;
                return jsonToken6;
            }
        }
        if (!this.z.e()) {
            X3();
            return w3(iV3);
        }
        this.W = this.u;
        int i = this.r;
        this.V = i;
        this.X = i - this.v;
        this.z.l(A3(iV3));
        this.f = jsonToken2;
        int iL3 = L3();
        X3();
        if (iL3 == 34) {
            this.U = true;
            this.A = JsonToken.VALUE_STRING;
            return this.f;
        }
        if (iL3 == 43) {
            jsonTokenC3 = JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d) ? C3(false) : n3(iL3);
        } else if (iL3 == 91) {
            jsonTokenC3 = JsonToken.START_ARRAY;
        } else if (iL3 == 102) {
            q3();
            jsonTokenC3 = JsonToken.VALUE_FALSE;
        } else if (iL3 == 110) {
            r3();
            jsonTokenC3 = JsonToken.VALUE_NULL;
        } else if (iL3 == 116) {
            u3();
            jsonTokenC3 = JsonToken.VALUE_TRUE;
        } else if (iL3 == 123) {
            jsonTokenC3 = JsonToken.START_OBJECT;
        } else if (iL3 == 45) {
            jsonTokenC3 = C3(true);
        } else if (iL3 != 46) {
            switch (iL3) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenC3 = D3(iL3);
                    break;
                default:
                    jsonTokenC3 = n3(iL3);
                    break;
            }
        } else {
            jsonTokenC3 = z3(false);
        }
        this.A = jsonTokenC3;
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        k2(" in a comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N3() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r9 = this;
            int r0 = r9.d
            int r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.h0
            r0 = r0 & r1
            r1 = 0
            r2 = 47
            if (r0 == 0) goto La3
            int r0 = r9.r
            int r3 = r9.s
            java.lang.String r4 = " in a comment"
            if (r0 < r3) goto L1d
            boolean r0 = r9.o3()
            if (r0 == 0) goto L19
            goto L1d
        L19:
            r9.k2(r4)
            throw r1
        L1d:
            byte[] r0 = r9.Z
            int r3 = r9.r
            int r5 = r3 + 1
            r9.r = r5
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L2f
            r9.O3()
            return
        L2f:
            r3 = 42
            if (r0 != r3) goto L9d
            int[] r5 = com.fasterxml.jackson.core.io.CharTypes.i
        L35:
            int r0 = r9.r
            int r6 = r9.s
            if (r0 < r6) goto L41
            boolean r0 = r9.o3()
            if (r0 == 0) goto L6f
        L41:
            byte[] r0 = r9.Z
            int r6 = r9.r
            int r7 = r6 + 1
            r9.r = r7
            r0 = r0[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5[r0]
            if (r6 == 0) goto L35
            r8 = 2
            if (r6 == r8) goto L99
            r8 = 3
            if (r6 == r8) goto L95
            r8 = 4
            if (r6 == r8) goto L91
            r8 = 10
            if (r6 == r8) goto L88
            r8 = 13
            if (r6 == r8) goto L84
            if (r6 != r3) goto L80
            int r0 = r9.s
            if (r7 < r0) goto L73
            boolean r0 = r9.o3()
            if (r0 == 0) goto L6f
            goto L73
        L6f:
            r9.k2(r4)
            throw r1
        L73:
            byte[] r0 = r9.Z
            int r6 = r9.r
            r0 = r0[r6]
            if (r0 != r2) goto L35
            int r6 = r6 + 1
            r9.r = r6
            return
        L80:
            r9.F3(r0)
            throw r1
        L84:
            r9.K3()
            goto L35
        L88:
            int r0 = r9.u
            int r0 = r0 + 1
            r9.u = r0
            r9.v = r7
            goto L35
        L91:
            r9.S3()
            goto L35
        L95:
            r9.R3()
            goto L35
        L99:
            r9.Q3()
            goto L35
        L9d:
            java.lang.String r2 = "was expecting either '*' or '/' for a comment"
            r9.u2(r0, r2)
            throw r1
        La3:
            java.lang.String r0 = "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)"
            r9.u2(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.N3():void");
    }

    public final void O3() throws JsonParseException {
        int[] iArr = CharTypes.i;
        while (true) {
            if (this.r >= this.s && !o3()) {
                return;
            }
            byte[] bArr = this.Z;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    Q3();
                } else if (i4 == 3) {
                    R3();
                } else if (i4 == 4) {
                    S3();
                } else if (i4 == 10) {
                    this.u++;
                    this.v = i2;
                    return;
                } else if (i4 == 13) {
                    K3();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    F3(i3);
                    throw null;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int P1(Base64Variant base64Variant, ByteBufferBackedOutputStream byteBufferBackedOutputStream) throws IOException {
        if (!this.U || this.f != JsonToken.VALUE_STRING) {
            byte[] bArrH = h(base64Variant);
            byteBufferBackedOutputStream.write(bArrH);
            return bArrH.length;
        }
        IOContext iOContext = this.p;
        byte[] bArrB = iOContext.b();
        try {
            return E3(base64Variant, byteBufferBackedOutputStream, bArrB);
        } finally {
            iOContext.d(bArrB);
        }
    }

    public final void P3() throws JsonParseException {
        this.U = false;
        byte[] bArr = this.Z;
        while (true) {
            int i = this.r;
            int i2 = this.s;
            if (i >= i2) {
                p3();
                i = this.r;
                i2 = this.s;
            }
            while (true) {
                if (i >= i2) {
                    this.r = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int i5 = j0[i4];
                if (i5 != 0) {
                    this.r = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        K2();
                    } else if (i5 == 2) {
                        Q3();
                    } else if (i5 == 3) {
                        R3();
                    } else if (i5 == 4) {
                        S3();
                    } else {
                        if (i4 >= 32) {
                            F3(i4);
                            throw null;
                        }
                        T2(i4, "string value");
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    public final void Q3() throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            return;
        }
        H3(b & 255, i2);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void R2() {
        byte[] bArr;
        byte[] bArr2;
        super.R2();
        this.S.p();
        if (!this.a0 || (bArr = this.Z) == null || bArr == (bArr2 = ParserMinimalBase.g)) {
            return;
        }
        this.Z = bArr2;
        this.p.e(bArr);
    }

    public final void R3() throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            H3(b & 255, i2);
            throw null;
        }
        if (i2 >= this.s) {
            p3();
        }
        byte[] bArr2 = this.Z;
        int i3 = this.r;
        int i4 = i3 + 1;
        this.r = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) == 128) {
            return;
        }
        H3(b2 & 255, i4);
        throw null;
    }

    public final void S3() throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            H3(b & 255, i2);
            throw null;
        }
        if (i2 >= this.s) {
            p3();
        }
        byte[] bArr2 = this.Z;
        int i3 = this.r;
        int i4 = i3 + 1;
        this.r = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            H3(b2 & 255, i4);
            throw null;
        }
        if (i4 >= this.s) {
            p3();
        }
        byte[] bArr3 = this.Z;
        int i5 = this.r;
        int i6 = i5 + 1;
        this.r = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) == 128) {
            return;
        }
        H3(b3 & 255, i6);
        throw null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String T0() {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        if (!this.U) {
            return this.B.g();
        }
        this.U = false;
        return j3();
    }

    public final int T3() throws JsonParseException {
        while (true) {
            int i = this.r;
            if (i >= this.s) {
                return U3();
            }
            byte[] bArr = this.Z;
            int i2 = i + 1;
            this.r = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this.r = i;
                return U3();
            }
            if (i3 != 32) {
                if (i3 == 10) {
                    this.u++;
                    this.v = i2;
                } else if (i3 == 13) {
                    K3();
                } else if (i3 != 9) {
                    B2(i3);
                    throw null;
                }
            }
        }
    }

    public final int U3() throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !o3()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.z.h() + " entries");
            }
            byte[] bArr = this.Z;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    N3();
                } else {
                    if (i3 != 35 || (this.d & i0) == 0) {
                        return i3;
                    }
                    O3();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.u++;
                this.v = i2;
            } else if (i3 == 13) {
                K3();
            } else if (i3 != 9) {
                B2(i3);
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String V0() {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? p() : super.V0();
        }
        if (!this.U) {
            return this.B.g();
        }
        this.U = false;
        return j3();
    }

    public final int V3() throws JsonParseException {
        if (this.r >= this.s && !o3()) {
            b2();
            return -1;
        }
        byte[] bArr = this.Z;
        int i = this.r;
        int i2 = i + 1;
        this.r = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this.r = i;
            return W3();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.u++;
                this.v = i2;
            } else if (i3 == 13) {
                K3();
            } else if (i3 != 9) {
                B2(i3);
                throw null;
            }
        }
        while (true) {
            int i4 = this.r;
            if (i4 >= this.s) {
                return W3();
            }
            byte[] bArr2 = this.Z;
            int i5 = i4 + 1;
            this.r = i5;
            int i6 = bArr2[i4] & 255;
            if (i6 > 32) {
                if (i6 != 47 && i6 != 35) {
                    return i6;
                }
                this.r = i4;
                return W3();
            }
            if (i6 != 32) {
                if (i6 == 10) {
                    this.u++;
                    this.v = i5;
                } else if (i6 == 13) {
                    K3();
                } else if (i6 != 9) {
                    B2(i6);
                    throw null;
                }
            }
        }
    }

    public final int W3() throws JsonParseException {
        while (true) {
            if (this.r >= this.s && !o3()) {
                b2();
                return -1;
            }
            byte[] bArr = this.Z;
            int i = this.r;
            int i2 = i + 1;
            this.r = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    N3();
                } else {
                    if (i3 != 35 || (this.d & i0) == 0) {
                        return i3;
                    }
                    O3();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.u++;
                this.v = i2;
            } else if (i3 == 13) {
                K3();
            } else if (i3 != 9) {
                B2(i3);
                throw null;
            }
        }
    }

    public final void X3() {
        this.x = this.u;
        int i = this.r;
        this.w = this.t + i;
        this.y = i - this.v;
    }

    public final int Y3() throws JsonParseException {
        if (this.r < this.s || o3()) {
            byte[] bArr = this.Z;
            int i = this.r;
            int i2 = bArr[i] & 255;
            if (i2 >= 48 && i2 <= 57) {
                if ((this.d & c0) == 0) {
                    C2();
                    throw null;
                }
                this.r = i + 1;
                if (i2 == 48) {
                    do {
                        if (this.r >= this.s && !o3()) {
                            return i2;
                        }
                        byte[] bArr2 = this.Z;
                        int i3 = this.r;
                        i2 = bArr2[i3] & 255;
                        if (i2 >= 48 && i2 <= 57) {
                            this.r = i3 + 1;
                        }
                    } while (i2 == 48);
                }
                return i2;
            }
        }
        return 48;
    }

    public final void Z3(int i) throws JsonParseException {
        int i2 = this.r;
        int i3 = i2 + 1;
        this.r = i3;
        if (i != 9) {
            if (i == 10) {
                this.u++;
                this.v = i3;
            } else if (i == 13) {
                this.r = i2;
            } else {
                if (i == 32) {
                    return;
                }
                u2(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a4(int r20, int r21, int[] r22) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.a4(int, int, int[]):java.lang.String");
    }

    public final void b3() throws JsonParseException {
        X3();
        if (!this.z.d()) {
            S2('}', 93);
            throw null;
        }
        JsonReadContext jsonReadContext = this.z;
        jsonReadContext.g = null;
        this.z = jsonReadContext.c;
    }

    public final String b4(int i, int i2) {
        int iX3 = x3(i, i2);
        String strJ = this.S.j(iX3);
        if (strJ != null) {
            return strJ;
        }
        int[] iArr = this.T;
        iArr[0] = iX3;
        return a4(1, i2, iArr);
    }

    public final void c3() throws JsonParseException {
        X3();
        if (!this.z.e()) {
            S2(']', 125);
            throw null;
        }
        JsonReadContext jsonReadContext = this.z;
        jsonReadContext.g = null;
        this.z = jsonReadContext.c;
    }

    public final String c4(int i, int i2, int i3) {
        int iX3 = x3(i2, i3);
        String strK = this.S.k(i, iX3);
        if (strK != null) {
            return strK;
        }
        int[] iArr = this.T;
        iArr[0] = i;
        iArr[1] = iX3;
        return a4(2, i3, iArr);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JacksonFeatureSet d0() {
        return ParserBase.Q;
    }

    public final byte[] d3(Base64Variant base64Variant) throws JsonParseException {
        ByteArrayBuilder byteArrayBuilderN2 = N2();
        while (true) {
            if (this.r >= this.s) {
                p3();
            }
            byte[] bArr = this.Z;
            int i = this.r;
            this.r = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int iD = base64Variant.d(i2);
                char c = base64Variant.h;
                boolean z = base64Variant.j;
                if (iD < 0) {
                    if (i2 == 34) {
                        return byteArrayBuilderN2.e();
                    }
                    iD = J2(base64Variant, i2, 0);
                    if (iD < 0) {
                        continue;
                    }
                }
                if (this.r >= this.s) {
                    p3();
                }
                byte[] bArr2 = this.Z;
                int i3 = this.r;
                this.r = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int iD2 = base64Variant.d(i4);
                if (iD2 < 0) {
                    iD2 = J2(base64Variant, i4, 1);
                }
                int i5 = (iD << 6) | iD2;
                if (this.r >= this.s) {
                    p3();
                }
                byte[] bArr3 = this.Z;
                int i6 = this.r;
                this.r = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iD3 = base64Variant.d(i7);
                if (iD3 < 0) {
                    if (iD3 != -2) {
                        if (i7 == 34) {
                            byteArrayBuilderN2.b(i5 >> 4);
                            if (!z) {
                                return byteArrayBuilderN2.e();
                            }
                            this.r--;
                            throw new JsonParseException(this, base64Variant.j());
                        }
                        iD3 = J2(base64Variant, i7, 2);
                    }
                    if (iD3 == -2) {
                        if (this.r >= this.s) {
                            p3();
                        }
                        byte[] bArr4 = this.Z;
                        int i8 = this.r;
                        this.r = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (i9 != c && J2(base64Variant, i9, 3) != -2) {
                            throw ParserBase.X2(base64Variant, i9, 3, "expected padding character '" + c + "'");
                        }
                        byteArrayBuilderN2.b(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iD3;
                if (this.r >= this.s) {
                    p3();
                }
                byte[] bArr5 = this.Z;
                int i11 = this.r;
                this.r = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int iD4 = base64Variant.d(i12);
                if (iD4 < 0) {
                    if (iD4 != -2) {
                        if (i12 == 34) {
                            byteArrayBuilderN2.d(i10 >> 2);
                            if (!z) {
                                return byteArrayBuilderN2.e();
                            }
                            this.r--;
                            throw new JsonParseException(this, base64Variant.j());
                        }
                        iD4 = J2(base64Variant, i12, 3);
                    }
                    if (iD4 == -2) {
                        byteArrayBuilderN2.d(i10 >> 2);
                    }
                }
                byteArrayBuilderN2.c((i10 << 6) | iD4);
            }
        }
    }

    public final String d4(int i, int i2, int i3, int i4) {
        int iX3 = x3(i3, i4);
        String strL = this.S.l(i, i2, iX3);
        if (strL != null) {
            return strL;
        }
        int[] iArr = this.T;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = x3(iX3, i4);
        return a4(3, i4, iArr);
    }

    public final int e3(int i) throws JsonParseException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & BERTags.FLAGS) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else {
            if ((i & 248) != 240) {
                G3(i & 255);
                throw null;
            }
            i2 = i & 7;
            c = 3;
        }
        int iF4 = f4();
        if ((iF4 & BERTags.PRIVATE) != 128) {
            I3(iF4 & 255);
            throw null;
        }
        int i4 = (i2 << 6) | (iF4 & 63);
        if (c <= 1) {
            return i4;
        }
        int iF42 = f4();
        if ((iF42 & BERTags.PRIVATE) != 128) {
            I3(iF42 & 255);
            throw null;
        }
        int i5 = (i4 << 6) | (iF42 & 63);
        if (c <= 2) {
            return i5;
        }
        int iF43 = f4();
        if ((iF43 & BERTags.PRIVATE) == 128) {
            return (i5 << 6) | (iF43 & 63);
        }
        I3(iF43 & 255);
        throw null;
    }

    public final String e4(int i, int i2, int i3, int[] iArr) {
        if (i >= iArr.length) {
            iArr = ParserBase.W2(iArr.length, iArr);
            this.T = iArr;
        }
        int i4 = i + 1;
        iArr[i] = x3(i2, i3);
        String strM = this.S.m(i4, iArr);
        return strM == null ? a4(i4, i3, iArr) : strM;
    }

    public final int f3(int i) throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i2 = this.r;
        int i3 = i2 + 1;
        this.r = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        H3(b & 255, i3);
        throw null;
    }

    public final int f4() {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i = this.r;
        this.r = i + 1;
        return bArr[i] & 255;
    }

    public final int g3(int i) throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        int i2 = i & 15;
        byte[] bArr = this.Z;
        int i3 = this.r;
        int i4 = i3 + 1;
        this.r = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            H3(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        if (i4 >= this.s) {
            p3();
        }
        byte[] bArr2 = this.Z;
        int i6 = this.r;
        int i7 = i6 + 1;
        this.r = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        H3(b2 & 255, i7);
        throw null;
    }

    public final String g4(int i, int i2, int i3, int i4, int[] iArr) throws JsonParseException {
        while (true) {
            if (k0[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.W2(iArr.length, iArr);
                            this.T = iArr;
                        }
                        iArr[i] = x3(i2, i4);
                        i++;
                    }
                    String strM = this.S.m(i, iArr);
                    return strM == null ? a4(i, i4, iArr) : strM;
                }
                if (i3 != 92) {
                    T2(i3, AppMeasurementSdk.ConditionalUserProperty.NAME);
                } else {
                    i3 = K2();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.W2(iArr.length, iArr);
                            this.T = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | BERTags.PRIVATE;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | BERTags.FLAGS;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.W2(iArr.length, iArr);
                                this.T = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.W2(iArr.length, iArr);
                    this.T = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.r >= this.s && !o3()) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                k2(" in field name");
                throw null;
            }
            byte[] bArr = this.Z;
            int i8 = this.r;
            this.r = i8 + 1;
            i3 = bArr[i8] & 255;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final byte[] h(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this.F == null)) {
            throw new JsonParseException(this, "Current token (" + this.f + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.U) {
            try {
                this.F = d3(base64Variant);
                this.U = false;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Failed to decode VALUE_STRING as base64 (");
                sb.append(base64Variant);
                sb.append("): ");
                throw new JsonParseException(this, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.l(e, sb));
            }
        } else if (this.F == null) {
            ByteArrayBuilder byteArrayBuilderN2 = N2();
            W1(k0(), byteArrayBuilderN2, base64Variant);
            this.F = byteArrayBuilderN2.e();
        }
        return this.F;
    }

    public final int h3(int i) throws JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.Z;
        int i3 = this.r;
        int i4 = i3 + 1;
        this.r = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            H3(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        int i6 = i3 + 2;
        this.r = i6;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        H3(b2 & 255, i6);
        throw null;
    }

    public final String h4(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.T;
        iArr[0] = i;
        iArr[1] = i2;
        return g4(2, i3, i4, i5, iArr);
    }

    public final int i3(int i) throws JsonParseException {
        if (this.r >= this.s) {
            p3();
        }
        byte[] bArr = this.Z;
        int i2 = this.r;
        int i3 = i2 + 1;
        this.r = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            H3(b & 255, i3);
            throw null;
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (i3 >= this.s) {
            p3();
        }
        byte[] bArr2 = this.Z;
        int i5 = this.r;
        int i6 = i5 + 1;
        this.r = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            H3(b2 & 255, i6);
            throw null;
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (i6 >= this.s) {
            p3();
        }
        byte[] bArr3 = this.Z;
        int i8 = this.r;
        int i9 = i8 + 1;
        this.r = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) == 128) {
            return ((i7 << 6) | (b3 & 63)) - 65536;
        }
        H3(b3 & 255, i9);
        throw null;
    }

    public final String j3() throws JsonParseException {
        int i = this.r;
        if (i >= this.s) {
            p3();
            i = this.r;
        }
        TextBuffer textBuffer = this.B;
        char[] cArrH = textBuffer.h();
        int iMin = Math.min(this.s, cArrH.length + i);
        byte[] bArr = this.Z;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (j0[i3] == 0) {
                i++;
                cArrH[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.r = i + 1;
                textBuffer.i = i2;
                if (textBuffer.g > 0) {
                    return textBuffer.g();
                }
                String str = i2 == 0 ? "" : new String(textBuffer.h, 0, i2);
                textBuffer.j = str;
                return str;
            }
        }
        this.r = i;
        l3(cArrH, i2);
        return textBuffer.g();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final ObjectCodec k() {
        return this.R;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String k0() {
        JsonToken jsonToken = this.f;
        JsonToken jsonToken2 = JsonToken.VALUE_STRING;
        TextBuffer textBuffer = this.B;
        if (jsonToken == jsonToken2) {
            if (!this.U) {
                return textBuffer.g();
            }
            this.U = false;
            return j3();
        }
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        return i != 5 ? (i == 6 || i == 7 || i == 8) ? textBuffer.g() : jsonToken.d : this.z.f;
    }

    public final void k3() throws JsonParseException {
        int i = this.r;
        if (i >= this.s) {
            p3();
            i = this.r;
        }
        TextBuffer textBuffer = this.B;
        char[] cArrH = textBuffer.h();
        int iMin = Math.min(this.s, cArrH.length + i);
        byte[] bArr = this.Z;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (j0[i3] == 0) {
                i++;
                cArrH[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.r = i + 1;
                textBuffer.i = i2;
                return;
            }
        }
        this.r = i;
        l3(cArrH, i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation l() {
        return new JsonLocation(H2(), this.t + this.r, -1L, this.u, (this.r - this.v) + 1);
    }

    public final void l3(char[] cArr, int i) throws JsonParseException {
        byte[] bArr = this.Z;
        while (true) {
            int i2 = this.r;
            if (i2 >= this.s) {
                p3();
                i2 = this.r;
            }
            int length = cArr.length;
            int i3 = 0;
            TextBuffer textBuffer = this.B;
            if (i >= length) {
                cArr = textBuffer.k();
                i = 0;
            }
            int iMin = Math.min(this.s, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.r = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iK2 = bArr[i2] & 255;
                int i5 = j0[iK2];
                if (i5 != 0) {
                    this.r = i4;
                    if (iK2 == 34) {
                        textBuffer.i = i;
                        return;
                    }
                    if (i5 == 1) {
                        iK2 = K2();
                    } else if (i5 == 2) {
                        iK2 = f3(iK2);
                    } else if (i5 == 3) {
                        iK2 = this.s - i4 >= 2 ? h3(iK2) : g3(iK2);
                    } else if (i5 == 4) {
                        int iI3 = i3(iK2);
                        int i6 = i + 1;
                        cArr[i] = (char) ((iI3 >> 10) | 55296);
                        if (i6 >= cArr.length) {
                            cArr = textBuffer.k();
                            i = 0;
                        } else {
                            i = i6;
                        }
                        iK2 = (iI3 & 1023) | 56320;
                    } else {
                        if (iK2 >= 32) {
                            F3(iK2);
                            throw null;
                        }
                        T2(iK2, "string value");
                    }
                    if (i >= cArr.length) {
                        cArr = textBuffer.k();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) iK2;
                } else {
                    cArr[i] = (char) iK2;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] m0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return null;
        }
        int i = jsonToken.g;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return jsonToken.e;
                }
            } else if (this.U) {
                this.U = false;
                k3();
            }
            return this.B.m();
        }
        if (!this.D) {
            String str = this.z.f;
            int length = str.length();
            char[] cArr = this.C;
            if (cArr == null) {
                this.C = this.p.c(length);
            } else if (cArr.length < length) {
                this.C = new char[length];
            }
            str.getChars(0, length, this.C, 0);
            this.D = true;
        }
        return this.C;
    }

    public final JsonToken m3(int i, boolean z, boolean z2) throws JsonParseException {
        String str;
        if (i == 73) {
            if (this.r >= this.s && !o3()) {
                m2(JsonToken.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.Z;
            int i2 = this.r;
            this.r = i2 + 1;
            i = bArr[i2];
            if (i == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            s3(3, str);
            if ((this.d & d0) != 0) {
                return Y2(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY, str);
            }
            f2(str, "Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            throw null;
        }
        if (JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d) || z) {
            w2(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        w2(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r13 != 44) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r12.z.d() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r12.z.f() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r12.d & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.e0) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.r--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.core.JsonToken n3(int r13) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.n3(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final boolean o3() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.Y;
        if (inputStream == null || (length = (bArr = this.Z).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i <= 0) {
            G2();
            if (i == 0) {
                throw new IOException(YU.a.m(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.Z.length, " bytes"));
            }
            return false;
        }
        int i2 = this.s;
        this.t += i2;
        this.v -= i2;
        this.V -= i2;
        this.r = 0;
        this.s = i;
        return true;
    }

    public final void p3() {
        if (o3()) {
            return;
        }
        g2();
        throw null;
    }

    public final void q3() throws JsonParseException {
        int i;
        int i2 = this.r;
        if (i2 + 4 < this.s) {
            byte[] bArr = this.Z;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this.r = i6;
                            return;
                        }
                    }
                }
            }
        }
        t3(1, "false");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int r0() throws JsonParseException {
        JsonToken jsonToken = this.f;
        if (jsonToken == null) {
            return 0;
        }
        int i = jsonToken.g;
        if (i == 5) {
            return this.z.f.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return jsonToken.e.length;
            }
        } else if (this.U) {
            this.U = false;
            k3();
        }
        return this.B.q();
    }

    public final void r3() throws JsonParseException {
        int i;
        int i2 = this.r;
        if (i2 + 3 < this.s) {
            byte[] bArr = this.Z;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.r = i5;
                        return;
                    }
                }
            }
        }
        t3(1, "null");
    }

    public final void s3(int i, String str) throws JsonParseException {
        int length = str.length();
        if (this.r + length >= this.s) {
            t3(i, str);
            return;
        }
        while (this.Z[this.r] == str.charAt(i)) {
            int i2 = this.r + 1;
            this.r = i2;
            i++;
            if (i >= length) {
                int i3 = this.Z[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) e3(i3))) {
                    return;
                }
                J3(str.substring(0, i), U2());
                throw null;
            }
        }
        J3(str.substring(0, i), U2());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t0() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L22
            int r0 = r0.g
            r2 = 6
            if (r0 == r2) goto L12
            r2 = 7
            if (r0 == r2) goto L1b
            r2 = 8
            if (r0 == r2) goto L1b
            goto L22
        L12:
            boolean r0 = r3.U
            if (r0 == 0) goto L1b
            r3.U = r1
            r3.k3()
        L1b:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3.B
            int r0 = r0.n()
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.t0():int");
    }

    public final void t3(int i, String str) throws JsonParseException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.r >= this.s && !o3()) || this.Z[this.r] != str.charAt(i)) {
                J3(str.substring(0, i), U2());
                throw null;
            }
            i2 = this.r + 1;
            this.r = i2;
            i++;
        } while (i < length);
        if ((i2 < this.s || o3()) && (i3 = this.Z[this.r] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) e3(i3))) {
            J3(str.substring(0, i), U2());
            throw null;
        }
    }

    public final void u3() throws JsonParseException {
        int i;
        int i2 = this.r;
        if (i2 + 3 < this.s) {
            byte[] bArr = this.Z;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this.r = i5;
                        return;
                    }
                }
            }
        }
        t3(1, "true");
    }

    public final JsonToken v3() {
        this.D = false;
        JsonToken jsonToken = this.A;
        this.A = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.z = this.z.i(this.x, this.y);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.z = this.z.j(this.x, this.y);
        }
        this.f = jsonToken;
        return jsonToken;
    }

    public final JsonToken w3(int i) throws JsonParseException {
        if (i == 34) {
            this.U = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.e.a(this.d)) {
                JsonToken jsonTokenC3 = C3(false);
                this.f = jsonTokenC3;
                return jsonTokenC3;
            }
            JsonToken jsonTokenN3 = n3(i);
            this.f = jsonTokenN3;
            return jsonTokenN3;
        }
        if (i == 91) {
            this.z = this.z.i(this.x, this.y);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            q3();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            r3();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            u3();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            this.z = this.z.j(this.x, this.y);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f = jsonToken6;
            return jsonToken6;
        }
        if (i == 45) {
            JsonToken jsonTokenC32 = C3(true);
            this.f = jsonTokenC32;
            return jsonTokenC32;
        }
        if (i == 46) {
            JsonToken jsonTokenZ3 = z3(false);
            this.f = jsonTokenZ3;
            return jsonTokenZ3;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonTokenD3 = D3(i);
                this.f = jsonTokenD3;
                return jsonTokenD3;
            default:
                JsonToken jsonTokenN32 = n3(i);
                this.f = jsonTokenN32;
                return jsonTokenN32;
        }
    }

    public final JsonToken y3(char[] cArr, int i, int i2, boolean z, int i3) throws JsonParseException {
        char[] cArrK;
        int i4;
        int i5;
        boolean z2;
        int i6 = i2;
        TextBuffer textBuffer = this.B;
        int i7 = 0;
        if (i6 == 46) {
            cArrK = cArr;
            int i8 = i;
            if (i8 >= cArrK.length) {
                cArrK = textBuffer.k();
                i8 = 0;
            }
            int i9 = i8 + 1;
            cArrK[i8] = (char) i6;
            int i10 = 0;
            while (true) {
                if (this.r >= this.s && !o3()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.Z;
                int i11 = this.r;
                this.r = i11 + 1;
                i6 = bArr[i11] & 255;
                if (i6 < 48 || i6 > 57) {
                    break;
                }
                i10++;
                if (i9 >= cArrK.length) {
                    cArrK = textBuffer.k();
                    i9 = 0;
                }
                cArrK[i9] = (char) i6;
                i9++;
            }
            z2 = false;
            if (i10 == 0 && !JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.e.a(this.d)) {
                w2(i6, "Decimal point not followed by a digit");
                throw null;
            }
            int i12 = i10;
            i4 = i9;
            i5 = i12;
        } else {
            cArrK = cArr;
            i4 = i;
            i5 = 0;
            z2 = false;
        }
        if (i6 == 101 || i6 == 69) {
            if (i4 >= cArrK.length) {
                cArrK = textBuffer.k();
                i4 = 0;
            }
            int i13 = i4 + 1;
            cArrK[i4] = (char) i6;
            if (this.r >= this.s) {
                p3();
            }
            byte[] bArr2 = this.Z;
            int i14 = this.r;
            this.r = i14 + 1;
            i6 = bArr2[i14] & 255;
            if (i6 == 45 || i6 == 43) {
                if (i13 >= cArrK.length) {
                    cArrK = textBuffer.k();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                cArrK[i13] = (char) i6;
                if (this.r >= this.s) {
                    p3();
                }
                byte[] bArr3 = this.Z;
                int i16 = this.r;
                this.r = i16 + 1;
                i6 = bArr3[i16] & 255;
                i13 = i15;
            }
            int i17 = 0;
            while (i6 >= 48 && i6 <= 57) {
                i17++;
                if (i13 >= cArrK.length) {
                    cArrK = textBuffer.k();
                    i13 = 0;
                }
                int i18 = i13 + 1;
                cArrK[i13] = (char) i6;
                if (this.r >= this.s && !o3()) {
                    z2 = true;
                    i7 = i17;
                    i4 = i18;
                    break;
                }
                byte[] bArr4 = this.Z;
                int i19 = this.r;
                this.r = i19 + 1;
                i6 = bArr4[i19] & 255;
                i13 = i18;
            }
            i7 = i17;
            i4 = i13;
            if (i7 == 0) {
                w2(i6, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.r--;
            if (this.z.f()) {
                Z3(i6);
            }
        }
        textBuffer.i = i4;
        return Z2(i3, i5, i7, z);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonLocation z0() {
        if (this.f != JsonToken.FIELD_NAME) {
            return new JsonLocation(H2(), this.w - 1, -1L, this.x, this.y);
        }
        return new JsonLocation(H2(), this.t + (this.V - 1), -1L, this.W, this.X);
    }

    public final JsonToken z3(boolean z) {
        if (!JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.e.a(this.d)) {
            return n3(46);
        }
        char[] cArrH = this.B.h();
        int i = 0;
        if (z) {
            cArrH[0] = '-';
            i = 1;
        }
        return y3(cArrH, i, 46, z, 0);
    }
}
