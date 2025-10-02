package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.EOFException;

/* loaded from: classes2.dex */
final class OggPageHeader {

    /* renamed from: a, reason: collision with root package name */
    public int f3348a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final ParsableByteArray g = new ParsableByteArray(255);

    public final boolean a(ExtractorInput extractorInput, boolean z) throws ParserException, EOFException {
        boolean zH;
        boolean zH2;
        this.f3348a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        ParsableByteArray parsableByteArray = this.g;
        parsableByteArray.D(27);
        try {
            zH = extractorInput.h(parsableByteArray.f2922a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zH = false;
        }
        if (zH && parsableByteArray.w() == 1332176723) {
            if (parsableByteArray.u() == 0) {
                this.f3348a = parsableByteArray.u();
                this.b = parsableByteArray.j();
                parsableByteArray.l();
                parsableByteArray.l();
                parsableByteArray.l();
                int iU = parsableByteArray.u();
                this.c = iU;
                this.d = iU + 27;
                parsableByteArray.D(iU);
                try {
                    zH2 = extractorInput.h(parsableByteArray.f2922a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zH2 = false;
                }
                if (zH2) {
                    for (int i = 0; i < this.c; i++) {
                        int iU2 = parsableByteArray.u();
                        this.f[i] = iU2;
                        this.e += iU2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10.f(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(androidx.media3.extractor.ExtractorInput r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.getPosition()
            long r2 = r10.j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            androidx.media3.common.util.Assertions.b(r0)
            androidx.media3.common.util.ParsableByteArray r0 = r9.g
            r3 = 4
            r0.D(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2b
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4b
        L2b:
            byte[] r5 = r0.f2922a
            boolean r5 = r10.h(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L32
            goto L33
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L4b
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L47
            r10.i()
            return r2
        L47:
            r10.l(r2)
            goto L1a
        L4b:
            if (r4 == 0) goto L55
            long r5 = r10.getPosition()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L55:
            int r0 = r10.f(r2)
            r3 = -1
            if (r0 == r3) goto L5d
            goto L4b
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.OggPageHeader.b(androidx.media3.extractor.ExtractorInput, long):boolean");
    }
}
