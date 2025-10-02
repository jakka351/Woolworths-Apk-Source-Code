package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.a;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@UnstableApi
/* loaded from: classes2.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final a b = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final FramePredicate f3289a;

    public interface FramePredicate {
        boolean f(int i, int i2, int i3, int i4, int i5);
    }

    public static final class Id3Header {

        /* renamed from: a, reason: collision with root package name */
        public final int f3290a;
        public final boolean b;
        public final int c;

        public Id3Header(int i, boolean z, int i2) {
            this.f3290a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public Id3Decoder(FramePredicate framePredicate) {
        this.f3289a = framePredicate;
    }

    public static ApicFrame d(ParsableByteArray parsableByteArray, int i, int i2) {
        int iV;
        String strConcat;
        int iU = parsableByteArray.u();
        Charset charsetS = s(iU);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.e(0, i3, bArr);
        if (i2 == 2) {
            strConcat = "image/" + Ascii.b(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iV = 2;
        } else {
            iV = v(0, bArr);
            String strB = Ascii.b(new String(bArr, 0, iV, StandardCharsets.ISO_8859_1));
            strConcat = strB.indexOf(47) == -1 ? "image/".concat(strB) : strB;
        }
        int i4 = bArr[iV + 1] & 255;
        int i5 = iV + 2;
        int iU2 = u(i5, iU, bArr);
        String str = new String(bArr, i5, iU2 - i5, charsetS);
        int iR = r(iU) + iU2;
        return new ApicFrame(strConcat, str, i4, i3 <= iR ? Util.c : Arrays.copyOfRange(bArr, iR, i3));
    }

    public static ChapterFrame e(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int i4 = parsableByteArray.b;
        int iV = v(i4, parsableByteArray.f2922a);
        String str = new String(parsableByteArray.f2922a, i4, iV - i4, StandardCharsets.ISO_8859_1);
        parsableByteArray.G(iV + 1);
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        long jW = parsableByteArray.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = parsableByteArray.w();
        long j = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (parsableByteArray.b < i5) {
            Id3Frame id3FrameH = h(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterFrame(str, iG, iG2, jW, j, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame f(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) throws Throwable {
        int i4 = parsableByteArray.b;
        int iV = v(i4, parsableByteArray.f2922a);
        String str = new String(parsableByteArray.f2922a, i4, iV - i4, StandardCharsets.ISO_8859_1);
        parsableByteArray.G(iV + 1);
        int iU = parsableByteArray.u();
        boolean z2 = (iU & 2) != 0;
        boolean z3 = (iU & 1) != 0;
        int iU2 = parsableByteArray.u();
        String[] strArr = new String[iU2];
        for (int i5 = 0; i5 < iU2; i5++) {
            int i6 = parsableByteArray.b;
            int iV2 = v(i6, parsableByteArray.f2922a);
            strArr[i5] = new String(parsableByteArray.f2922a, i6, iV2 - i6, StandardCharsets.ISO_8859_1);
            parsableByteArray.G(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (parsableByteArray.b < i7) {
            Id3Frame id3FrameH = h(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameH != null) {
                arrayList.add(id3FrameH);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame g(int i, ParsableByteArray parsableByteArray) {
        if (i < 4) {
            return null;
        }
        int iU = parsableByteArray.u();
        Charset charsetS = s(iU);
        byte[] bArr = new byte[3];
        parsableByteArray.e(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.e(0, i2, bArr2);
        int iU2 = u(0, iU, bArr2);
        String str2 = new String(bArr2, 0, iU2, charsetS);
        int iR = r(iU) + iU2;
        return new CommentFrame(str, str2, l(bArr2, iR, u(iR, iU, bArr2), charsetS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.media3.extractor.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.media3.extractor.metadata.id3.Id3Frame h(int r19, androidx.media3.common.util.ParsableByteArray r20, boolean r21, int r22, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.Id3Decoder.h(int, androidx.media3.common.util.ParsableByteArray, boolean, int, androidx.media3.extractor.metadata.id3.Id3Decoder$FramePredicate):androidx.media3.extractor.metadata.id3.Id3Frame");
    }

    public static GeobFrame i(int i, ParsableByteArray parsableByteArray) {
        int iU = parsableByteArray.u();
        Charset charsetS = s(iU);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(0, i2, bArr);
        int iV = v(0, bArr);
        String strM = MimeTypes.m(new String(bArr, 0, iV, StandardCharsets.ISO_8859_1));
        int i3 = iV + 1;
        int iU2 = u(i3, iU, bArr);
        String strL = l(bArr, i3, iU2, charsetS);
        int iR = r(iU) + iU2;
        int iU3 = u(iR, iU, bArr);
        String strL2 = l(bArr, iR, iU3, charsetS);
        int iR2 = r(iU) + iU3;
        return new GeobFrame(strM, strL, strL2, i2 <= iR2 ? Util.c : Arrays.copyOfRange(bArr, iR2, i2));
    }

    public static MlltFrame j(int i, ParsableByteArray parsableByteArray) {
        int iA = parsableByteArray.A();
        int iX = parsableByteArray.x();
        int iX2 = parsableByteArray.x();
        int iU = parsableByteArray.u();
        int iU2 = parsableByteArray.u();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.l(parsableByteArray);
        int i2 = ((i - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG = parsableBitArray.g(iU);
            int iG2 = parsableBitArray.g(iU2);
            iArr[i3] = iG;
            iArr2[i3] = iG2;
        }
        return new MlltFrame(iA, iX, iX2, iArr, iArr2);
    }

    public static PrivFrame k(int i, ParsableByteArray parsableByteArray) {
        byte[] bArr = new byte[i];
        parsableByteArray.e(0, i, bArr);
        int iV = v(0, bArr);
        String str = new String(bArr, 0, iV, StandardCharsets.ISO_8859_1);
        int i2 = iV + 1;
        return new PrivFrame(str, i <= i2 ? Util.c : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String l(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static TextInformationFrame m(int i, ParsableByteArray parsableByteArray, String str) {
        if (i < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(0, i2, bArr);
        return new TextInformationFrame(str, null, n(iU, 0, bArr));
    }

    public static ImmutableList n(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return ImmutableList.w("");
        }
        ImmutableList.Builder builderM = ImmutableList.m();
        int iU = u(i2, i, bArr);
        while (i2 < iU) {
            builderM.h(new String(bArr, i2, iU - i2, s(i)));
            i2 = r(i) + iU;
            iU = u(i2, i, bArr);
        }
        ImmutableList immutableListJ = builderM.j();
        return immutableListJ.isEmpty() ? ImmutableList.w("") : immutableListJ;
    }

    public static TextInformationFrame o(int i, ParsableByteArray parsableByteArray) {
        if (i < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(0, i2, bArr);
        int iU2 = u(0, iU, bArr);
        return new TextInformationFrame("TXXX", new String(bArr, 0, iU2, s(iU)), n(iU, r(iU) + iU2, bArr));
    }

    public static UrlLinkFrame p(int i, ParsableByteArray parsableByteArray, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.e(0, i, bArr);
        return new UrlLinkFrame(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static UrlLinkFrame q(int i, ParsableByteArray parsableByteArray) {
        if (i < 1) {
            return null;
        }
        int iU = parsableByteArray.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.e(0, i2, bArr);
        int iU2 = u(0, iU, bArr);
        String str = new String(bArr, 0, iU2, s(iU));
        int iR = r(iU) + iU2;
        return new UrlLinkFrame("WXXX", str, l(bArr, iR, v(iR, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(int i, int i2, byte[] bArr) {
        int iV = v(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iV;
        }
        while (iV < bArr.length - 1) {
            if ((iV - i) % 2 == 0 && bArr[iV + 1] == 0) {
                return iV;
            }
            iV = v(iV + 1, bArr);
        }
        return bArr.length;
    }

    public static int v(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(int i, ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f2922a;
        int i2 = parsableByteArray.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x(androidx.media3.common.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.g()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r1.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.Id3Decoder.x(androidx.media3.common.util.ParsableByteArray, int, int, boolean):boolean");
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.common.Metadata c(int r13, byte[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.Id3Decoder.c(int, byte[]):androidx.media3.common.Metadata");
    }
}
