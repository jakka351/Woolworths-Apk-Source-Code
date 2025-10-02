package com.caverock.androidsvg;

import android.support.v4.media.session.a;
import android.util.Log;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
class CSSParser {
    public final Source b;
    public boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f13994a = MediaType.e;

    /* renamed from: com.caverock.androidsvg.CSSParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13995a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PseudoClassIdents.values().length];
            b = iArr;
            try {
                PseudoClassIdents pseudoClassIdents = PseudoClassIdents.d;
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = b;
                PseudoClassIdents pseudoClassIdents2 = PseudoClassIdents.d;
                iArr2[7] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = b;
                PseudoClassIdents pseudoClassIdents3 = PseudoClassIdents.d;
                iArr3[10] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = b;
                PseudoClassIdents pseudoClassIdents4 = PseudoClassIdents.d;
                iArr4[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = b;
                PseudoClassIdents pseudoClassIdents5 = PseudoClassIdents.d;
                iArr5[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = b;
                PseudoClassIdents pseudoClassIdents6 = PseudoClassIdents.d;
                iArr6[11] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = b;
                PseudoClassIdents pseudoClassIdents7 = PseudoClassIdents.d;
                iArr7[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = b;
                PseudoClassIdents pseudoClassIdents8 = PseudoClassIdents.d;
                iArr8[12] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = b;
                PseudoClassIdents pseudoClassIdents9 = PseudoClassIdents.d;
                iArr9[2] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = b;
                PseudoClassIdents pseudoClassIdents10 = PseudoClassIdents.d;
                iArr10[3] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = b;
                PseudoClassIdents pseudoClassIdents11 = PseudoClassIdents.d;
                iArr11[4] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = b;
                PseudoClassIdents pseudoClassIdents12 = PseudoClassIdents.d;
                iArr12[5] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = b;
                PseudoClassIdents pseudoClassIdents13 = PseudoClassIdents.d;
                iArr13[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = b;
                PseudoClassIdents pseudoClassIdents14 = PseudoClassIdents.d;
                iArr14[0] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = b;
                PseudoClassIdents pseudoClassIdents15 = PseudoClassIdents.d;
                iArr15[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = b;
                PseudoClassIdents pseudoClassIdents16 = PseudoClassIdents.d;
                iArr16[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = b;
                PseudoClassIdents pseudoClassIdents17 = PseudoClassIdents.d;
                iArr17[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                int[] iArr18 = b;
                PseudoClassIdents pseudoClassIdents18 = PseudoClassIdents.d;
                iArr18[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                int[] iArr19 = b;
                PseudoClassIdents pseudoClassIdents19 = PseudoClassIdents.d;
                iArr19[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr20 = b;
                PseudoClassIdents pseudoClassIdents20 = PseudoClassIdents.d;
                iArr20[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr21 = b;
                PseudoClassIdents pseudoClassIdents21 = PseudoClassIdents.d;
                iArr21[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr22 = b;
                PseudoClassIdents pseudoClassIdents22 = PseudoClassIdents.d;
                iArr22[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr23 = b;
                PseudoClassIdents pseudoClassIdents23 = PseudoClassIdents.d;
                iArr23[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr24 = b;
                PseudoClassIdents pseudoClassIdents24 = PseudoClassIdents.d;
                iArr24[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr25 = new int[AttribOp.values().length];
            f13995a = iArr25;
            try {
                iArr25[1] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13995a[2] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13995a[3] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static class Attrib {

        /* renamed from: a, reason: collision with root package name */
        public final String f13996a;
        public final AttribOp b;
        public final String c;

        public Attrib(String str, AttribOp attribOp, String str2) {
            this.f13996a = str;
            this.b = attribOp;
            this.c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttribOp {
        public static final AttribOp d;
        public static final AttribOp e;
        public static final AttribOp f;
        public static final AttribOp g;
        public static final /* synthetic */ AttribOp[] h;

        static {
            AttribOp attribOp = new AttribOp("EXISTS", 0);
            d = attribOp;
            AttribOp attribOp2 = new AttribOp("EQUALS", 1);
            e = attribOp2;
            AttribOp attribOp3 = new AttribOp("INCLUDES", 2);
            f = attribOp3;
            AttribOp attribOp4 = new AttribOp("DASHMATCH", 3);
            g = attribOp4;
            h = new AttribOp[]{attribOp, attribOp2, attribOp3, attribOp4};
        }

        public static AttribOp valueOf(String str) {
            return (AttribOp) Enum.valueOf(AttribOp.class, str);
        }

        public static AttribOp[] values() {
            return (AttribOp[]) h.clone();
        }
    }

    public static class CSSTextScanner extends SVGParser.TextScanner {

        public static class AnPlusB {

            /* renamed from: a, reason: collision with root package name */
            public final int f13997a;
            public final int b;

            public AnPlusB(int i, int i2) {
                this.f13997a = i;
                this.b = i2;
            }
        }

        public CSSTextScanner(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.f14036a.charAt(this.b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i = 1; i <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb.append((char) iR2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb.toString();
        }

        public final String t() {
            int i;
            int i2;
            boolean zF = f();
            String str = this.f14036a;
            if (zF) {
                i2 = this.b;
            } else {
                int i3 = this.b;
                int iCharAt = str.charAt(i3);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i = i3;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i = this.b;
                }
                this.b = i3;
                i2 = i;
            }
            int i4 = this.b;
            if (i2 == i4) {
                return null;
            }
            String strSubstring = str.substring(i4, i2);
            this.b = i2;
            return strSubstring;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x02fc  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x03c9  */
        /* JADX WARN: Removed duplicated region for block: B:242:0x03ce  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0408  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x0425  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x025e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:279:0x03e7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0448 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
        /* JADX WARN: Type inference failed for: r10v0, types: [com.caverock.androidsvg.CSSParser$AttribOp] */
        /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v26, types: [com.caverock.androidsvg.CSSParser$PseudoClassOnlyChild] */
        /* JADX WARN: Type inference failed for: r10v27, types: [com.caverock.androidsvg.CSSParser$PseudoClassOnlyChild] */
        /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v3, types: [com.caverock.androidsvg.CSSParser$AttribOp] */
        /* JADX WARN: Type inference failed for: r10v32, types: [com.caverock.androidsvg.CSSParser$PseudoClassNot, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v34, types: [com.caverock.androidsvg.CSSParser$PseudoClassNotSupported] */
        /* JADX WARN: Type inference failed for: r10v38, types: [com.caverock.androidsvg.CSSParser$PseudoClassNotSupported] */
        /* JADX WARN: Type inference failed for: r10v52 */
        /* JADX WARN: Type inference failed for: r10v53 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v27, types: [com.caverock.androidsvg.CSSParser$CSSTextScanner$AnPlusB] */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v41 */
        /* JADX WARN: Type inference failed for: r11v42 */
        /* JADX WARN: Type inference failed for: r11v43, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v46 */
        /* JADX WARN: Type inference failed for: r11v47 */
        /* JADX WARN: Type inference failed for: r11v48 */
        /* JADX WARN: Type inference failed for: r13v4, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r14v11, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r15v3, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r16v0, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.caverock.androidsvg.CSSParser$Combinator] */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r8v10, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r8v13, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r8v14, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r8v15, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9, types: [com.caverock.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r9v17, types: [com.caverock.androidsvg.CSSParser$PseudoClassAnPlusB] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.ArrayList u() throws com.caverock.androidsvg.CSSParseException {
            /*
                Method dump skipped, instructions count: 1166
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.CSSTextScanner.u():java.util.ArrayList");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Combinator {
        public static final Combinator d;
        public static final Combinator e;
        public static final Combinator f;
        public static final /* synthetic */ Combinator[] g;

        static {
            Combinator combinator = new Combinator("DESCENDANT", 0);
            d = combinator;
            Combinator combinator2 = new Combinator("CHILD", 1);
            e = combinator2;
            Combinator combinator3 = new Combinator("FOLLOWS", 2);
            f = combinator3;
            g = new Combinator[]{combinator, combinator2, combinator3};
        }

        public static Combinator valueOf(String str) {
            return (Combinator) Enum.valueOf(Combinator.class, str);
        }

        public static Combinator[] values() {
            return (Combinator[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MediaType {
        public static final MediaType d;
        public static final MediaType e;
        public static final /* synthetic */ MediaType[] f;

        static {
            MediaType mediaType = new MediaType("all", 0);
            d = mediaType;
            MediaType mediaType2 = new MediaType("aural", 1);
            MediaType mediaType3 = new MediaType("braille", 2);
            MediaType mediaType4 = new MediaType("embossed", 3);
            MediaType mediaType5 = new MediaType("handheld", 4);
            MediaType mediaType6 = new MediaType("print", 5);
            MediaType mediaType7 = new MediaType("projection", 6);
            MediaType mediaType8 = new MediaType("screen", 7);
            e = mediaType8;
            f = new MediaType[]{mediaType, mediaType2, mediaType3, mediaType4, mediaType5, mediaType6, mediaType7, mediaType8, new MediaType("speech", 8), new MediaType("tty", 9), new MediaType("tv", 10)};
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) f.clone();
        }
    }

    public interface PseudoClass {
        boolean a(SVG.SvgElementBase svgElementBase);
    }

    public static class PseudoClassAnPlusB implements PseudoClass {

        /* renamed from: a, reason: collision with root package name */
        public final int f13998a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;

        public PseudoClassAnPlusB(String str, int i, int i2, boolean z, boolean z2) {
            this.f13998a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0065 A[RETURN] */
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(com.caverock.androidsvg.SVG.SvgElementBase r8) {
            /*
                r7 = this;
                boolean r0 = r7.d
                java.lang.String r1 = r7.e
                if (r0 == 0) goto Lc
                if (r1 != 0) goto Lc
                java.lang.String r1 = r8.m()
            Lc:
                com.caverock.androidsvg.SVG$SvgContainer r0 = r8.b
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L3c
                java.util.List r0 = r0.getChildren()
                java.util.Iterator r0 = r0.iterator()
                r4 = r2
                r5 = r4
            L1c:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L3e
                java.lang.Object r6 = r0.next()
                com.caverock.androidsvg.SVG$SvgObject r6 = (com.caverock.androidsvg.SVG.SvgObject) r6
                com.caverock.androidsvg.SVG$SvgElementBase r6 = (com.caverock.androidsvg.SVG.SvgElementBase) r6
                if (r6 != r8) goto L2d
                r4 = r5
            L2d:
                if (r1 == 0) goto L39
                java.lang.String r6 = r6.m()
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto L1c
            L39:
                int r5 = r5 + 1
                goto L1c
            L3c:
                r4 = r2
                r5 = r3
            L3e:
                boolean r8 = r7.c
                if (r8 == 0) goto L44
                int r4 = r4 + r3
                goto L46
            L44:
                int r4 = r5 - r4
            L46:
                int r8 = r7.f13998a
                int r0 = r7.b
                if (r8 != 0) goto L4f
                if (r4 != r0) goto L65
                goto L64
            L4f:
                int r4 = r4 - r0
                int r0 = r4 % r8
                if (r0 != 0) goto L65
                int r0 = java.lang.Integer.signum(r4)
                if (r0 == 0) goto L64
                int r0 = java.lang.Integer.signum(r4)
                int r8 = java.lang.Integer.signum(r8)
                if (r0 != r8) goto L65
            L64:
                return r3
            L65:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB.a(com.caverock.androidsvg.SVG$SvgElementBase):boolean");
        }

        public final String toString() {
            String str = this.c ? "" : "last-";
            boolean z = this.d;
            int i = this.b;
            int i2 = this.f13998a;
            return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    public static class PseudoClassEmpty implements PseudoClass {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            return !(svgElementBase instanceof SVG.SvgContainer) || ((SVG.SvgContainer) svgElementBase).getChildren().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PseudoClassIdents {
        public static final PseudoClassIdents d;
        public static final PseudoClassIdents e;
        public static final PseudoClassIdents f;
        public static final PseudoClassIdents g;
        public static final HashMap h;
        public static final /* synthetic */ PseudoClassIdents[] i;

        /* JADX INFO: Fake field, exist only in values array */
        PseudoClassIdents EF1;

        static {
            PseudoClassIdents pseudoClassIdents = new PseudoClassIdents("target", 0);
            PseudoClassIdents pseudoClassIdents2 = new PseudoClassIdents("root", 1);
            PseudoClassIdents pseudoClassIdents3 = new PseudoClassIdents("nth_child", 2);
            d = pseudoClassIdents3;
            PseudoClassIdents pseudoClassIdents4 = new PseudoClassIdents("nth_last_child", 3);
            PseudoClassIdents pseudoClassIdents5 = new PseudoClassIdents("nth_of_type", 4);
            e = pseudoClassIdents5;
            PseudoClassIdents pseudoClassIdents6 = new PseudoClassIdents("nth_last_of_type", 5);
            f = pseudoClassIdents6;
            PseudoClassIdents pseudoClassIdents7 = new PseudoClassIdents("first_child", 6);
            PseudoClassIdents pseudoClassIdents8 = new PseudoClassIdents("last_child", 7);
            PseudoClassIdents pseudoClassIdents9 = new PseudoClassIdents("first_of_type", 8);
            PseudoClassIdents pseudoClassIdents10 = new PseudoClassIdents("last_of_type", 9);
            PseudoClassIdents pseudoClassIdents11 = new PseudoClassIdents("only_child", 10);
            PseudoClassIdents pseudoClassIdents12 = new PseudoClassIdents("only_of_type", 11);
            PseudoClassIdents pseudoClassIdents13 = new PseudoClassIdents("empty", 12);
            PseudoClassIdents pseudoClassIdents14 = new PseudoClassIdents("not", 13);
            PseudoClassIdents pseudoClassIdents15 = new PseudoClassIdents("lang", 14);
            PseudoClassIdents pseudoClassIdents16 = new PseudoClassIdents("link", 15);
            PseudoClassIdents pseudoClassIdents17 = new PseudoClassIdents("visited", 16);
            PseudoClassIdents pseudoClassIdents18 = new PseudoClassIdents("hover", 17);
            PseudoClassIdents pseudoClassIdents19 = new PseudoClassIdents(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            PseudoClassIdents pseudoClassIdents20 = new PseudoClassIdents("focus", 19);
            PseudoClassIdents pseudoClassIdents21 = new PseudoClassIdents("enabled", 20);
            PseudoClassIdents pseudoClassIdents22 = new PseudoClassIdents("disabled", 21);
            PseudoClassIdents pseudoClassIdents23 = new PseudoClassIdents("checked", 22);
            PseudoClassIdents pseudoClassIdents24 = new PseudoClassIdents("indeterminate", 23);
            PseudoClassIdents pseudoClassIdents25 = new PseudoClassIdents("UNSUPPORTED", 24);
            g = pseudoClassIdents25;
            i = new PseudoClassIdents[]{pseudoClassIdents, pseudoClassIdents2, pseudoClassIdents3, pseudoClassIdents4, pseudoClassIdents5, pseudoClassIdents6, pseudoClassIdents7, pseudoClassIdents8, pseudoClassIdents9, pseudoClassIdents10, pseudoClassIdents11, pseudoClassIdents12, pseudoClassIdents13, pseudoClassIdents14, pseudoClassIdents15, pseudoClassIdents16, pseudoClassIdents17, pseudoClassIdents18, pseudoClassIdents19, pseudoClassIdents20, pseudoClassIdents21, pseudoClassIdents22, pseudoClassIdents23, pseudoClassIdents24, pseudoClassIdents25};
            h = new HashMap();
            for (PseudoClassIdents pseudoClassIdents26 : values()) {
                if (pseudoClassIdents26 != g) {
                    h.put(pseudoClassIdents26.name().replace('_', '-'), pseudoClassIdents26);
                }
            }
        }

        public static PseudoClassIdents valueOf(String str) {
            return (PseudoClassIdents) Enum.valueOf(PseudoClassIdents.class, str);
        }

        public static PseudoClassIdents[] values() {
            return (PseudoClassIdents[]) i.clone();
        }
    }

    public static class PseudoClassNot implements PseudoClass {

        /* renamed from: a, reason: collision with root package name */
        public List f13999a;

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            Iterator it = this.f13999a.iterator();
            while (it.hasNext()) {
                if (CSSParser.g((Selector) it.next(), svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return a.t(new StringBuilder("not("), this.f13999a, ")");
        }
    }

    public static class PseudoClassNotSupported implements PseudoClass {

        /* renamed from: a, reason: collision with root package name */
        public final String f14000a;

        public PseudoClassNotSupported(String str) {
            this.f14000a = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            return false;
        }

        public final String toString() {
            return this.f14000a;
        }
    }

    public static class PseudoClassOnlyChild implements PseudoClass {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14001a;
        public final String b;

        public PseudoClassOnlyChild(boolean z, String str) {
            this.f14001a = z;
            this.b = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            int i;
            boolean z = this.f14001a;
            String strM = this.b;
            if (z && strM == null) {
                strM = svgElementBase.m();
            }
            SVG.SvgContainer svgContainer = svgElementBase.b;
            if (svgContainer != null) {
                Iterator it = svgContainer.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) ((SVG.SvgObject) it.next());
                    if (strM == null || svgElementBase2.m().equals(strM)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public final String toString() {
            return this.f14001a ? YU.a.h("only-of-type <", this.b, ">") : "only-child";
        }
    }

    public static class PseudoClassRoot implements PseudoClass {
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            return svgElementBase.b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    public static class PseudoClassTarget implements PseudoClass {
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean a(SVG.SvgElementBase svgElementBase) {
            return false;
        }

        public final String toString() {
            return "target";
        }
    }

    public static class Rule {

        /* renamed from: a, reason: collision with root package name */
        public Selector f14002a;
        public SVG.Style b;
        public Source c;

        public final String toString() {
            return String.valueOf(this.f14002a) + " {...} (src=" + this.c + ")";
        }
    }

    public static class RuleMatchContext {
        public final String toString() {
            return "";
        }
    }

    public static class Ruleset {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f14003a = null;

        public final void a(Rule rule) {
            if (this.f14003a == null) {
                this.f14003a = new ArrayList();
            }
            for (int i = 0; i < this.f14003a.size(); i++) {
                if (((Rule) this.f14003a.get(i)).f14002a.b > rule.f14002a.b) {
                    this.f14003a.add(i, rule);
                    return;
                }
            }
            this.f14003a.add(rule);
        }

        public final void b(Ruleset ruleset) {
            if (ruleset.f14003a == null) {
                return;
            }
            if (this.f14003a == null) {
                this.f14003a = new ArrayList(ruleset.f14003a.size());
            }
            Iterator it = ruleset.f14003a.iterator();
            while (it.hasNext()) {
                a((Rule) it.next());
            }
        }

        public final String toString() {
            if (this.f14003a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f14003a.iterator();
            while (it.hasNext()) {
                sb.append(((Rule) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public static class Selector {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f14004a = null;
        public int b = 0;

        public final void a() {
            this.b += 1000;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f14004a.iterator();
            while (it.hasNext()) {
                sb.append((SimpleSelector) it.next());
                sb.append(' ');
            }
            sb.append('[');
            return YU.a.l(sb, this.b, ']');
        }
    }

    public static class SimpleSelector {

        /* renamed from: a, reason: collision with root package name */
        public final Combinator f14005a;
        public final String b;
        public ArrayList c = null;
        public ArrayList d = null;

        public SimpleSelector(Combinator combinator, String str) {
            this.f14005a = null;
            this.b = null;
            this.f14005a = combinator == null ? Combinator.d : combinator;
            this.b = str;
        }

        public final void a(String str, AttribOp attribOp, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new Attrib(str, attribOp, str2));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            Combinator combinator = Combinator.e;
            Combinator combinator2 = this.f14005a;
            if (combinator2 == combinator) {
                sb.append("> ");
            } else if (combinator2 == Combinator.f) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Attrib attrib = (Attrib) it.next();
                    sb.append('[');
                    String str2 = attrib.f13996a;
                    String str3 = attrib.c;
                    sb.append(str2);
                    int iOrdinal = attrib.b.ordinal();
                    if (iOrdinal == 1) {
                        sb.append('=');
                        sb.append(str3);
                    } else if (iOrdinal == 2) {
                        sb.append("~=");
                        sb.append(str3);
                    } else if (iOrdinal == 3) {
                        sb.append("|=");
                        sb.append(str3);
                    }
                    sb.append(']');
                }
            }
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    PseudoClass pseudoClass = (PseudoClass) it2.next();
                    sb.append(':');
                    sb.append(pseudoClass);
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {
        public static final Source d;
        public static final Source e;
        public static final /* synthetic */ Source[] f;

        static {
            Source source = new Source("Document", 0);
            d = source;
            Source source2 = new Source("RenderOptions", 1);
            e = source2;
            f = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f.clone();
        }
    }

    public CSSParser(Source source) {
        this.b = source;
    }

    public static int a(ArrayList arrayList, int i, SVG.SvgElementBase svgElementBase) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        SVG.SvgContainer svgContainer = svgElementBase.b;
        if (obj != svgContainer) {
            return -1;
        }
        Iterator it = svgContainer.getChildren().iterator();
        while (it.hasNext()) {
            if (((SVG.SvgObject) it.next()) == svgElementBase) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList c(CSSTextScanner cSSTextScanner) {
        ArrayList arrayList = new ArrayList();
        while (!cSSTextScanner.f()) {
            String str = cSSTextScanner.f14036a;
            String strSubstring = null;
            if (!cSSTextScanner.f()) {
                int i = cSSTextScanner.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cSSTextScanner.b = i;
                } else {
                    int iA = cSSTextScanner.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = cSSTextScanner.a();
                    }
                    strSubstring = str.substring(i, cSSTextScanner.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(MediaType.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cSSTextScanner.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean f(Selector selector, int i, ArrayList arrayList, int i2, SVG.SvgElementBase svgElementBase) {
        SimpleSelector simpleSelector = (SimpleSelector) selector.f14004a.get(i);
        if (!i(simpleSelector, svgElementBase)) {
            return false;
        }
        Combinator combinator = simpleSelector.f14005a;
        if (combinator == Combinator.d) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!h(selector, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (combinator == Combinator.e) {
            return h(selector, i - 1, arrayList, i2);
        }
        int iA = a(arrayList, i2, svgElementBase);
        if (iA <= 0) {
            return false;
        }
        return f(selector, i - 1, arrayList, i2, (SVG.SvgElementBase) svgElementBase.b.getChildren().get(iA - 1));
    }

    public static boolean g(Selector selector, SVG.SvgElementBase svgElementBase) {
        ArrayList arrayList = new ArrayList();
        Object obj = svgElementBase.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((SVG.SvgObject) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = selector.f14004a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return i((SimpleSelector) selector.f14004a.get(0), svgElementBase);
        }
        ArrayList arrayList3 = selector.f14004a;
        return f(selector, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, svgElementBase);
    }

    public static boolean h(Selector selector, int i, ArrayList arrayList, int i2) {
        SimpleSelector simpleSelector = (SimpleSelector) selector.f14004a.get(i);
        SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) arrayList.get(i2);
        if (!i(simpleSelector, svgElementBase)) {
            return false;
        }
        Combinator combinator = simpleSelector.f14005a;
        if (combinator == Combinator.d) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (h(selector, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (combinator == Combinator.e) {
            return h(selector, i - 1, arrayList, i2 - 1);
        }
        int iA = a(arrayList, i2, svgElementBase);
        if (iA <= 0) {
            return false;
        }
        return f(selector, i - 1, arrayList, i2, (SVG.SvgElementBase) svgElementBase.b.getChildren().get(iA - 1));
    }

    public static boolean i(SimpleSelector simpleSelector, SVG.SvgElementBase svgElementBase) {
        ArrayList arrayList;
        String str = simpleSelector.b;
        if (str != null && !str.equals(svgElementBase.m().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = simpleSelector.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Attrib attrib = (Attrib) it.next();
                String str2 = attrib.f13996a;
                String str3 = attrib.c;
                if (str2.equals("id")) {
                    if (!str3.equals(svgElementBase.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = svgElementBase.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = simpleSelector.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((PseudoClass) it2.next()).a(svgElementBase)) {
                return false;
            }
        }
        return true;
    }

    public final void b(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        int iIntValue;
        char cCharAt;
        int iR;
        String strT = cSSTextScanner.t();
        cSSTextScanner.q();
        if (strT == null) {
            throw new CSSParseException("Invalid '@' rule");
        }
        int i = 0;
        if (!this.c && strT.equals("media")) {
            ArrayList arrayListC = c(cSSTextScanner);
            if (!cSSTextScanner.d('{')) {
                throw new CSSParseException("Invalid @media rule: missing rule set");
            }
            cSSTextScanner.q();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                MediaType mediaType = (MediaType) it.next();
                if (mediaType == MediaType.d || mediaType == this.f13994a) {
                    this.c = true;
                    ruleset.b(e(cSSTextScanner));
                    this.c = false;
                    break;
                }
            }
            e(cSSTextScanner);
            if (!cSSTextScanner.f() && !cSSTextScanner.d('}')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !strT.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strT + " rule");
            while (!cSSTextScanner.f() && ((iIntValue = cSSTextScanner.h().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strS = null;
            if (!cSSTextScanner.f()) {
                int i2 = cSSTextScanner.b;
                if (cSSTextScanner.e("url(")) {
                    cSSTextScanner.q();
                    String strS2 = cSSTextScanner.s();
                    if (strS2 == null) {
                        String str = cSSTextScanner.f14036a;
                        StringBuilder sb = new StringBuilder();
                        while (!cSSTextScanner.f() && (cCharAt = str.charAt(cSSTextScanner.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !SVGParser.TextScanner.g(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            cSSTextScanner.b++;
                            if (cCharAt == '\\') {
                                if (!cSSTextScanner.f()) {
                                    int i3 = cSSTextScanner.b;
                                    cSSTextScanner.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = CSSTextScanner.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !cSSTextScanner.f() && (iR = CSSTextScanner.r(str.charAt(cSSTextScanner.b))) != -1; i4++) {
                                                cSSTextScanner.b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strS2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strS2 == null) {
                        cSSTextScanner.b = i2;
                    } else {
                        cSSTextScanner.q();
                        if (cSSTextScanner.f() || cSSTextScanner.e(")")) {
                            strS = strS2;
                        } else {
                            cSSTextScanner.b = i2;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = cSSTextScanner.s();
            }
            if (strS == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()");
            }
            cSSTextScanner.q();
            c(cSSTextScanner);
            if (!cSSTextScanner.f() && !cSSTextScanner.d(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cSSTextScanner.q();
    }

    public final boolean d(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        ArrayList arrayListU = cSSTextScanner.u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!cSSTextScanner.d('{')) {
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        cSSTextScanner.q();
        SVG.Style style = new SVG.Style();
        do {
            String strT = cSSTextScanner.t();
            cSSTextScanner.q();
            if (!cSSTextScanner.d(':')) {
                throw new CSSParseException("Expected ':'");
            }
            cSSTextScanner.q();
            String str = cSSTextScanner.f14036a;
            String strSubstring = null;
            if (!cSSTextScanner.f()) {
                int i = cSSTextScanner.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!SVGParser.TextScanner.g(iCharAt)) {
                        i2 = cSSTextScanner.b + 1;
                    }
                    iCharAt = cSSTextScanner.a();
                }
                if (cSSTextScanner.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    cSSTextScanner.b = i;
                }
            }
            if (strSubstring == null) {
                throw new CSSParseException("Expected property value");
            }
            cSSTextScanner.q();
            if (cSSTextScanner.d('!')) {
                cSSTextScanner.q();
                if (!cSSTextScanner.e("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'");
                }
                cSSTextScanner.q();
            }
            cSSTextScanner.d(';');
            SVGParser.E(style, strT, strSubstring);
            cSSTextScanner.q();
            if (cSSTextScanner.f()) {
                break;
            }
        } while (!cSSTextScanner.d('}'));
        cSSTextScanner.q();
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            Selector selector = (Selector) it.next();
            Rule rule = new Rule();
            rule.f14002a = selector;
            rule.b = style;
            rule.c = this.b;
            ruleset.a(rule);
        }
        return true;
    }

    public final Ruleset e(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.f()) {
            try {
                if (!cSSTextScanner.e("<!--") && !cSSTextScanner.e("-->")) {
                    if (!cSSTextScanner.d('@')) {
                        if (!d(ruleset, cSSTextScanner)) {
                            break;
                        }
                    } else {
                        b(ruleset, cSSTextScanner);
                    }
                }
            } catch (CSSParseException e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return ruleset;
            }
        }
        return ruleset;
    }
}
