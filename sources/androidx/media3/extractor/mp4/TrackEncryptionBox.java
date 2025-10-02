package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes2.dex */
public final class TrackEncryptionBox {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3340a;
    public final String b;
    public final TrackOutput.CryptoData c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TrackEncryptionBox(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            androidx.media3.common.util.Assertions.b(r2)
            r4.f3340a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            androidx.media3.extractor.TrackOutput$CryptoData r5 = new androidx.media3.extractor.TrackOutput$CryptoData
            if (r6 != 0) goto L20
            goto L72
        L20:
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L4c;
                case 3046671: goto L41;
                case 3049879: goto L36;
                case 3049895: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r2
            goto L55
        L2b:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L34
            goto L29
        L34:
            r0 = 3
            goto L55
        L36:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L3f
            goto L29
        L3f:
            r0 = r11
            goto L55
        L41:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L4a
            goto L29
        L4a:
            r0 = r1
            goto L55
        L4c:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L55
            goto L29
        L55:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L71;
                case 2: goto L72;
                case 3: goto L72;
                default: goto L58;
            }
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            androidx.media3.common.util.Log.g(r7, r6)
            goto L72
        L71:
            r1 = r11
        L72:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.TrackEncryptionBox.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
