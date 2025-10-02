package com.airbnb.lottie.parser.moshi;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.util.Arrays;
import okio.RealBufferedSource;

/* loaded from: classes4.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] h = new String[128];
    public int d;
    public int[] e;
    public String[] f;
    public int[] g;

    public static final class Options {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f13474a;
        public final okio.Options b;

        public Options(String[] strArr, okio.Options options) {
            this.f13474a = strArr;
            this.b = options;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.airbnb.lottie.parser.moshi.JsonReader.Options a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6b
                okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6b
                okio.Buffer r1 = new okio.Buffer     // Catch: java.io.IOException -> L6b
                r1.<init>()     // Catch: java.io.IOException -> L6b
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6b
                if (r3 >= r4) goto L5b
                r4 = r12[r3]     // Catch: java.io.IOException -> L6b
                java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.JsonReader.h     // Catch: java.io.IOException -> L6b
                r6 = 34
                r1.Y(r6)     // Catch: java.io.IOException -> L6b
                int r7 = r4.length()     // Catch: java.io.IOException -> L6b
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
                r11 = 128(0x80, float:1.794E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.r0(r9, r8, r4)     // Catch: java.io.IOException -> L6b
            L3d:
                r1.t0(r10)     // Catch: java.io.IOException -> L6b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.r0(r9, r7, r4)     // Catch: java.io.IOException -> L6b
            L4a:
                r1.Y(r6)     // Catch: java.io.IOException -> L6b
                r1.readByte()     // Catch: java.io.IOException -> L6b
                long r4 = r1.e     // Catch: java.io.IOException -> L6b
                okio.ByteString r4 = r1.p0(r4)     // Catch: java.io.IOException -> L6b
                r0[r3] = r4     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto La
            L5b:
                com.airbnb.lottie.parser.moshi.JsonReader$Options r1 = new com.airbnb.lottie.parser.moshi.JsonReader$Options     // Catch: java.io.IOException -> L6b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
                okio.Options r0 = okio.Options.Companion.b(r0)     // Catch: java.io.IOException -> L6b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
                return r1
            L6b:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.Options.a(java.lang.String[]):com.airbnb.lottie.parser.moshi.JsonReader$Options");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        public static final Token d;
        public static final Token e;
        public static final Token f;
        public static final Token g;
        public static final Token h;
        public static final Token i;
        public static final Token j;
        public static final Token k;
        public static final Token l;
        public static final Token m;
        public static final /* synthetic */ Token[] n;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            d = token;
            Token token2 = new Token("END_ARRAY", 1);
            e = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            f = token3;
            Token token4 = new Token("END_OBJECT", 3);
            g = token4;
            Token token5 = new Token("NAME", 4);
            h = token5;
            Token token6 = new Token("STRING", 5);
            i = token6;
            Token token7 = new Token("NUMBER", 6);
            j = token7;
            Token token8 = new Token("BOOLEAN", 7);
            k = token8;
            Token token9 = new Token("NULL", 8);
            l = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            m = token10;
            n = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) n.clone();
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader e(RealBufferedSource realBufferedSource) {
        return new JsonUtf8Reader(realBufferedSource);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract Token f();

    public final void g(int i) {
        int i2 = this.d;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f;
            this.f = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.g;
            this.g = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    public final String getPath() {
        int i = this.d;
        int[] iArr = this.e;
        String[] strArr = this.f;
        int[] iArr2 = this.g;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract int h(Options options);

    public abstract boolean hasNext();

    public abstract void i();

    public final void j(String str) throws JsonEncodingException {
        StringBuilder sbT = a.t(str, " at path ");
        sbT.append(getPath());
        throw new JsonEncodingException(sbT.toString());
    }

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract void skipValue();
}
