package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractJsonLexer {

    /* renamed from: a, reason: collision with root package name */
    public int f24849a;
    public final JsonPath b;
    public String c;
    public final StringBuilder d;

    public AbstractJsonLexer() {
        JsonPath jsonPath = new JsonPath();
        jsonPath.f24864a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        jsonPath.b = iArr;
        jsonPath.c = -1;
        this.b = jsonPath;
        this.d = new StringBuilder();
    }

    public static /* synthetic */ void r(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.f24849a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        abstractJsonLexer.q(i, str, str2);
        throw null;
    }

    public static /* synthetic */ void t(AbstractJsonLexer abstractJsonLexer, byte b) {
        abstractJsonLexer.s(b, true);
        throw null;
    }

    public static boolean w(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract int A(int i);

    public abstract int B();

    public String C(int i, int i2) {
        return v().subSequence(i, i2).toString();
    }

    public final boolean D() {
        int iB = B();
        CharSequence charSequenceV = v();
        if (iB >= charSequenceV.length() || iB == -1 || charSequenceV.charAt(iB) != ',') {
            return false;
        }
        this.f24849a++;
        return true;
    }

    public final boolean E(boolean z) {
        int iA = A(B());
        int length = v().length() - iA;
        if (length >= 4 && iA != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != v().charAt(iA + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || AbstractJsonLexerKt.a(v().charAt(iA + 4)) != 0) {
                    if (z) {
                        this.f24849a = iA + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void F(char c) {
        int i = this.f24849a;
        if (i > 0 && c == '\"') {
            try {
                this.f24849a = i - 1;
                String strL = l();
                this.f24849a = i;
                if (Intrinsics.c(strL, "null")) {
                    q(this.f24849a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f24849a = i;
                throw th;
            }
        }
        t(this, AbstractJsonLexerKt.a(c));
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (u(i + 3, charSequence) + (u(i, charSequence) << 12) + (u(i + 1, charSequence) << 8) + (u(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f24849a = i;
        o();
        if (this.f24849a + 4 < charSequence.length()) {
            return a(this.f24849a, charSequence);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.d.append(v(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (v().length() - i < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (v().charAt(i + i2) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f24849a = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b) {
        byte bF = f();
        if (bF == b) {
            return bF;
        }
        t(this, b);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        r(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        r(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        r(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        r(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (v().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        r(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        r(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r21.f24849a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        r(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonLexer.i():long");
    }

    public final String j() {
        String str = this.c;
        if (str == null) {
            return e();
        }
        Intrinsics.e(str);
        this.c = null;
        return str;
    }

    public final String k(CharSequence source, int i, int i2) {
        Intrinsics.h(source, "source");
        char cCharAt = source.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i2);
                int iA = A(i2 + 1);
                if (iA == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA2 = iA + 1;
                char cCharAt2 = v().charAt(iA);
                if (cCharAt2 == 'u') {
                    iA2 = a(iA2, v());
                } else {
                    char c = cCharAt2 < 'u' ? CharMappings.f24855a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.d.append(c);
                }
                i = A(iA2);
                if (i == -1) {
                    r(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    b(i, i2);
                    i = A(i2);
                    if (i == -1) {
                        r(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = source.charAt(i2);
        }
        String strC = !z ? C(i, i2) : n(i, i2);
        this.f24849a = i2 + 1;
        return strC;
    }

    public final String l() {
        String str = this.c;
        if (str != null) {
            Intrinsics.e(str);
            this.c = null;
            return str;
        }
        int iB = B();
        if (iB >= v().length() || iB == -1) {
            r(this, "EOF", iB, null, 4);
            throw null;
        }
        byte bA = AbstractJsonLexerKt.a(v().charAt(iB));
        if (bA == 1) {
            return j();
        }
        if (bA != 0) {
            r(this, "Expected beginning of the string, but got " + v().charAt(iB), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractJsonLexerKt.a(v().charAt(iB)) == 0) {
            iB++;
            if (iB >= v().length()) {
                b(this.f24849a, iB);
                int iA = A(iB);
                if (iA == -1) {
                    this.f24849a = iB;
                    return n(0, 0);
                }
                iB = iA;
                z = true;
            }
        }
        String strC = !z ? C(this.f24849a, iB) : n(this.f24849a, iB);
        this.f24849a = iB;
        return strC;
    }

    public final String m() {
        String strL = l();
        if (!Intrinsics.c(strL, "null") || v().charAt(this.f24849a - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final String n(int i, int i2) {
        b(i, i2);
        StringBuilder sb = this.d;
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public void o() {
    }

    public final void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + v().charAt(this.f24849a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void q(int i, String message, String hint) {
        Intrinsics.h(message, "message");
        Intrinsics.h(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbT = YU.a.t(message, " at path: ");
        sbT.append(this.b.a());
        sbT.append(strConcat);
        throw JsonExceptionsKt.c(i, v(), sbT.toString());
    }

    public final void s(byte b, boolean z) {
        String strB = AbstractJsonLexerKt.b(b);
        int i = z ? this.f24849a - 1 : this.f24849a;
        r(this, YU.a.j("Expected ", strB, ", but had '", (this.f24849a == v().length() || i < 0) ? "EOF" : String.valueOf(v().charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) v());
        sb.append("', currentPosition=");
        return YU.a.l(sb, this.f24849a, ')');
    }

    public final int u(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence v();

    public abstract String x(String str, boolean z);

    public byte y() {
        CharSequence charSequenceV = v();
        int i = this.f24849a;
        while (true) {
            int iA = A(i);
            if (iA == -1) {
                this.f24849a = iA;
                return (byte) 10;
            }
            char cCharAt = charSequenceV.charAt(iA);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f24849a = iA;
                return AbstractJsonLexerKt.a(cCharAt);
            }
            i = iA + 1;
        }
    }

    public final String z(boolean z) {
        String strJ;
        byte bY = y();
        if (z) {
            if (bY != 1 && bY != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bY != 1) {
                return null;
            }
            strJ = j();
        }
        this.c = strJ;
        return strJ;
    }
}
