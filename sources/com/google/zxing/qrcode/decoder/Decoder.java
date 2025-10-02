package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;

/* loaded from: classes6.dex */
public final class Decoder {

    /* renamed from: a, reason: collision with root package name */
    public final ReedSolomonDecoder f16225a = new ReedSolomonDecoder(GenericGF.l);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[Catch: ChecksumException | FormatException -> 0x0050, TryCatch #2 {ChecksumException | FormatException -> 0x0050, blocks: (B:9:0x0011, B:10:0x0024, B:12:0x0028, B:13:0x002b, B:15:0x002f, B:17:0x0039, B:18:0x003f, B:20:0x0044), top: B:25:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.common.DecoderResult a(com.google.zxing.common.BitMatrix r9, java.util.Map r10) {
        /*
            r8 = this;
            com.google.zxing.qrcode.decoder.BitMatrixParser r0 = new com.google.zxing.qrcode.decoder.BitMatrixParser
            r0.<init>(r9)
            r9 = 0
            com.google.zxing.common.DecoderResult r9 = r8.b(r0, r10)     // Catch: com.google.zxing.ChecksumException -> Lb com.google.zxing.FormatException -> Lf
            return r9
        Lb:
            r1 = move-exception
            r2 = r1
            r1 = r9
            goto L11
        Lf:
            r1 = move-exception
            r2 = r9
        L11:
            r0.d()     // Catch: java.lang.Throwable -> L50
            r0.b = r9     // Catch: java.lang.Throwable -> L50
            r0.c = r9     // Catch: java.lang.Throwable -> L50
            r9 = 1
            r0.d = r9     // Catch: java.lang.Throwable -> L50
            r0.c()     // Catch: java.lang.Throwable -> L50
            r0.b()     // Catch: java.lang.Throwable -> L50
            com.google.zxing.common.BitMatrix r9 = r0.f16221a     // Catch: java.lang.Throwable -> L50
            r3 = 0
        L24:
            int r4 = r9.d     // Catch: java.lang.Throwable -> L50
            if (r3 >= r4) goto L44
            int r4 = r3 + 1
            r5 = r4
        L2b:
            int r6 = r9.e     // Catch: java.lang.Throwable -> L50
            if (r5 >= r6) goto L42
            boolean r6 = r9.b(r3, r5)     // Catch: java.lang.Throwable -> L50
            boolean r7 = r9.b(r5, r3)     // Catch: java.lang.Throwable -> L50
            if (r6 == r7) goto L3f
            r9.a(r5, r3)     // Catch: java.lang.Throwable -> L50
            r9.a(r3, r5)     // Catch: java.lang.Throwable -> L50
        L3f:
            int r5 = r5 + 1
            goto L2b
        L42:
            r3 = r4
            goto L24
        L44:
            com.google.zxing.common.DecoderResult r9 = r8.b(r0, r10)     // Catch: java.lang.Throwable -> L50
            com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData r10 = new com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData     // Catch: java.lang.Throwable -> L50
            r10.<init>()     // Catch: java.lang.Throwable -> L50
            r9.e = r10     // Catch: java.lang.Throwable -> L50
            return r9
        L50:
            if (r1 == 0) goto L53
            throw r1
        L53:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.Decoder.a(com.google.zxing.common.BitMatrix, java.util.Map):com.google.zxing.common.DecoderResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x033b, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.common.DecoderResult b(com.google.zxing.qrcode.decoder.BitMatrixParser r28, java.util.Map r29) throws com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.Decoder.b(com.google.zxing.qrcode.decoder.BitMatrixParser, java.util.Map):com.google.zxing.common.DecoderResult");
    }
}
