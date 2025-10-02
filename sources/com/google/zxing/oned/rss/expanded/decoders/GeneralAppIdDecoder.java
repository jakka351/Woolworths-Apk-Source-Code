package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;

/* loaded from: classes6.dex */
final class GeneralAppIdDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final BitArray f16195a;
    public final CurrentParsingState b;
    public final StringBuilder c;

    public GeneralAppIdDecoder(BitArray bitArray) {
        CurrentParsingState currentParsingState = new CurrentParsingState();
        currentParsingState.f16192a = 0;
        currentParsingState.b = CurrentParsingState.State.d;
        this.b = currentParsingState;
        this.c = new StringBuilder();
        this.f16195a = bitArray;
    }

    public static int c(int i, int i2, BitArray bitArray) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.d(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    public final String a(int i, StringBuilder sb) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            DecodedInformation decodedInformationB = b(i, str);
            String strA = FieldParser.a(decodedInformationB.b);
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = decodedInformationB.d ? String.valueOf(decodedInformationB.c) : null;
            int i2 = decodedInformationB.f16193a;
            if (i == i2) {
                return sb.toString();
            }
            i = i2;
            str = strValueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0215, code lost:
    
        r3 = r1.f16192a;
        r5 = r3 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021b, code lost:
    
        if (r5 <= r6.e) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x021e, code lost:
    
        if (r3 >= r5) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0224, code lost:
    
        if (r6.d(r3) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x022c, code lost:
    
        if (d(r1.f16192a) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x022e, code lost:
    
        r3 = r1.f16192a;
        r5 = r3 + 5;
        r6 = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0234, code lost:
    
        if (r5 >= r6) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0236, code lost:
    
        r1.f16192a = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023b, code lost:
    
        r1.f16192a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x023d, code lost:
    
        r1.b = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0240, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0243, code lost:
    
        r1.f16192a += 3;
        r1.b = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024b, code lost:
    
        r5 = new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        r3 = r1.f16192a;
        r5 = r3 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (r5 <= r6.e) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        if (r3 >= r5) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r6.d(r3) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e7, code lost:
    
        if (d(r1.f16192a) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
    
        r3 = r1.f16192a;
        r5 = r3 + 5;
        r6 = r6.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r5 >= r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
    
        r1.f16192a = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        r1.f16192a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        r1.b = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        r1.f16192a += 3;
        r1.b = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        r5 = new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(null, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0344 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb A[LOOP:1: B:8:0x002c->B:45:0x00cb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.zxing.oned.rss.expanded.decoders.DecodedInformation b(int r18, java.lang.String r19) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder.b(int, java.lang.String):com.google.zxing.oned.rss.expanded.decoders.DecodedInformation");
    }

    public final boolean d(int i) {
        int i2;
        int i3 = i + 1;
        BitArray bitArray = this.f16195a;
        if (i3 > bitArray.e) {
            return false;
        }
        for (int i4 = 0; i4 < 5 && (i2 = i4 + i) < bitArray.e; i4++) {
            if (i4 == 2) {
                if (!bitArray.d(i + 2)) {
                    return false;
                }
            } else if (bitArray.d(i2)) {
                return false;
            }
        }
        return true;
    }
}
