package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureKt {
    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final int c(long j, int[] iArr) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0397, code lost:
    
        r9 = b(r2);
        r15 = a(r42);
        r54 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a1, code lost:
    
        if (r9 == r15) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a3, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03a9, code lost:
    
        if (r2[r9] != r2[r15]) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ab, code lost:
    
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ad, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b0, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b2, code lost:
    
        r0 = r42[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b5, code lost:
    
        if (r0 != (-1)) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b7, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b8, code lost:
    
        r0 = r5.d(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bc, code lost:
    
        if (r0 >= 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03be, code lost:
    
        r1 = r51;
        r15 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c2, code lost:
    
        if (r26 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c8, code lost:
    
        if (e(r15, r1, r2, r9) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03cb, code lost:
    
        r0 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ce, code lost:
    
        if (r55 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03d0, code lost:
    
        r5.g();
        r0 = r15.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03d7, code lost:
    
        if (r4 >= r0) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03d9, code lost:
    
        r3[r4] = -1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03e0, code lost:
    
        r0 = r2.length;
        r4 = new int[r0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03e4, code lost:
    
        if (r5 >= r0) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03e6, code lost:
    
        r4[r5] = r2[r9];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f4, code lost:
    
        return d(r1, r52, r3, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03f5, code lost:
    
        r52 = r3;
        r39 = r7;
        r7 = r0;
        r42 = r10;
        r44 = r11;
        r45 = r12;
        r3 = r43;
        r43 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0406, code lost:
    
        r39 = r7;
        r15 = r42;
        r7 = r52;
        r42 = r10;
        r9 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.b(r6, r0, r9);
        r44 = r11;
        r45 = r12;
        r11 = (int) (r9 & 4294967295L);
        r12 = r4;
        r3 = (int) (r9 >> 32);
        r4 = r11 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0426, code lost:
    
        if (r4 == 1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0428, code lost:
    
        r3 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x042a, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x042c, code lost:
    
        r5.h(r0, r3);
        r3 = r43;
        r12 = r3.c(r0, r9);
        r9 = c(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x043c, code lost:
    
        if (r4 == 1) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x043e, code lost:
    
        r4 = r5.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0443, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0445, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0447, code lost:
    
        if (r10 >= r11) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0449, code lost:
    
        r38 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x044d, code lost:
    
        if (r2[r10] == r9) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x044f, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0451, code lost:
    
        r27[r10].addFirst(r12);
        r15[r10] = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0458, code lost:
    
        if (r4 != null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x045a, code lost:
    
        r46 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x045d, code lost:
    
        r46 = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0461, code lost:
    
        r2[r10] = (r12.n + r9) + r46;
        r10 = r10 + 1;
        r0 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        r1 = a(r2);
        r4 = r2[r1];
        r9 = r3.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r15 >= r9) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r26 = r9;
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (r2[r15] == r2[r1]) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        r9 = r3[r37];
        r15 = r3[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0780, code lost:
    
        r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r11.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        if (r9 >= r15) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
    
        r3[r37] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        r15 = r37 + 1;
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        r4 = r5.d(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r4 >= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        r38 = r6;
        r9 = r7;
        r6 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.b(r8, r4, r1);
        r1 = r8;
        r8 = (int) (r6 & 4294967295L);
        r26 = r10;
        r9 = (int) (r6 >> 32);
        r10 = r8 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r10 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r5.h(r4, r15);
        r15 = r13.c(r4, r6);
        r6 = c(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
    
        if (r10 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r22 = r5.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        r7 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        if (r9 >= r8) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r2[r9] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        if (r22 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        r39 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        r10 = r22[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0143, code lost:
    
        r1 = (r15.n + r6) + r10;
        r3[r9] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014a, code lost:
    
        if ((r1 + r11) > 0) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        r9 = r9 + 1;
        r1 = r39;
     */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0549 A[LOOP:20: B:254:0x0547->B:255:0x0549, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x068e A[LOOP:24: B:323:0x068c->B:324:0x068e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0842 A[LOOP:30: B:379:0x07aa->B:420:0x0842, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x084c A[EDGE_INSN: B:653:0x084c->B:422:0x084c BREAK  A[LOOP:30: B:379:0x07aa->B:420:0x0842], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult d(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r51, int r52, int[] r53, int[] r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 3091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.d(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    public static final boolean e(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridMeasureContext.s;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (lazyStaggeredGridLaneInfo.d(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (lazyStaggeredGridLaneInfo.d(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iF = lazyStaggeredGridLaneInfo.f(0);
        return (iF == 0 || iF == -1 || iF == -2) ? false : true;
    }

    public static final void f(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }
}
