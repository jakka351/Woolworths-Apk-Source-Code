package com.google.zxing.aztec;

import com.google.zxing.Reader;

/* loaded from: classes6.dex */
public final class AztecReader implements Reader {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:34:0x005f->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    @Override // com.google.zxing.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.Result a(com.google.zxing.BinaryBitmap r12, java.util.Map r13) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r11 = this;
            com.google.zxing.aztec.detector.Detector r1 = new com.google.zxing.aztec.detector.Detector
            com.google.zxing.common.BitMatrix r12 = r12.b()
            r1.<init>(r12)
            r12 = 0
            r2 = 0
            com.google.zxing.aztec.AztecDetectorResult r0 = r1.a(r12)     // Catch: com.google.zxing.FormatException -> L23 com.google.zxing.NotFoundException -> L26
            com.google.zxing.ResultPoint[] r3 = r0.b     // Catch: com.google.zxing.FormatException -> L23 com.google.zxing.NotFoundException -> L26
            com.google.zxing.aztec.decoder.Decoder r4 = new com.google.zxing.aztec.decoder.Decoder     // Catch: com.google.zxing.FormatException -> L1f com.google.zxing.NotFoundException -> L21
            r4.<init>()     // Catch: com.google.zxing.FormatException -> L1f com.google.zxing.NotFoundException -> L21
            com.google.zxing.common.DecoderResult r0 = r4.a(r0)     // Catch: com.google.zxing.FormatException -> L1f com.google.zxing.NotFoundException -> L21
            r4 = r2
            r2 = r0
            r0 = r3
            r3 = r4
            goto L31
        L1f:
            r0 = move-exception
            goto L29
        L21:
            r0 = move-exception
            goto L2d
        L23:
            r0 = move-exception
            r3 = r2
            goto L29
        L26:
            r0 = move-exception
            r3 = r2
            goto L2d
        L29:
            r4 = r0
            r0 = r3
            r3 = r2
            goto L31
        L2d:
            r4 = r3
            r3 = r0
            r0 = r4
            r4 = r2
        L31:
            if (r2 != 0) goto L51
            r0 = 1
            com.google.zxing.aztec.AztecDetectorResult r0 = r1.a(r0)     // Catch: com.google.zxing.FormatException -> L45 com.google.zxing.NotFoundException -> L48
            com.google.zxing.ResultPoint[] r1 = r0.b     // Catch: com.google.zxing.FormatException -> L45 com.google.zxing.NotFoundException -> L48
            com.google.zxing.aztec.decoder.Decoder r2 = new com.google.zxing.aztec.decoder.Decoder     // Catch: com.google.zxing.FormatException -> L45 com.google.zxing.NotFoundException -> L48
            r2.<init>()     // Catch: com.google.zxing.FormatException -> L45 com.google.zxing.NotFoundException -> L48
            com.google.zxing.common.DecoderResult r2 = r2.a(r0)     // Catch: com.google.zxing.FormatException -> L45 com.google.zxing.NotFoundException -> L48
            r8 = r1
            goto L52
        L45:
            r0 = move-exception
        L46:
            r12 = r0
            goto L4a
        L48:
            r0 = move-exception
            goto L46
        L4a:
            if (r3 != 0) goto L50
            if (r4 == 0) goto L4f
            throw r4
        L4f:
            throw r12
        L50:
            throw r3
        L51:
            r8 = r0
        L52:
            if (r13 == 0) goto L69
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.l
            java.lang.Object r13 = r13.get(r0)
            com.google.zxing.ResultPointCallback r13 = (com.google.zxing.ResultPointCallback) r13
            if (r13 == 0) goto L69
            int r0 = r8.length
        L5f:
            if (r12 >= r0) goto L69
            r1 = r8[r12]
            r13.a()
            int r12 = r12 + 1
            goto L5f
        L69:
            com.google.zxing.Result r5 = new com.google.zxing.Result
            java.lang.String r6 = r2.b
            byte[] r7 = r2.f16143a
            java.lang.System.currentTimeMillis()
            r10 = 0
            com.google.zxing.BarcodeFormat r9 = com.google.zxing.BarcodeFormat.d
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.List r12 = r2.c
            if (r12 == 0) goto L81
            com.google.zxing.ResultMetadataType r13 = com.google.zxing.ResultMetadataType.e
            r5.b(r13, r12)
        L81:
            java.lang.String r12 = r2.d
            if (r12 == 0) goto L8a
            com.google.zxing.ResultMetadataType r13 = com.google.zxing.ResultMetadataType.f
            r5.b(r13, r12)
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.AztecReader.a(com.google.zxing.BinaryBitmap, java.util.Map):com.google.zxing.Result");
    }

    @Override // com.google.zxing.Reader
    public final void reset() {
    }
}
