package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableLongSet extends LongSet {
    public int e;

    public MutableLongSet(int i) {
        this.f687a = ScatterMapKt.f699a;
        this.b = LongSetKt.f688a;
        if (i >= 0) {
            c(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f687a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        this.f687a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.e = ScatterMapKt.a(this.c) - this.d;
        this.b = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        r1 = b(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (r38.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (((r38.f687a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r27 = 255;
        r25 = r10;
        r33 = 0;
        r35 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        r1 = r38.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (java.lang.Long.compareUnsigned(r38.d * 32, r1 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r1 = r38.f687a;
        r2 = r38.c;
        r4 = r38.b;
        r5 = (r2 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        if (r6 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        r27 = r7;
        r7 = r1[r6] & (-9187201950435737472L);
        r1[r6] = (-72340172838076674L) & ((~r7) + (r7 >>> 7));
        r6 = r6 + 1;
        r10 = r10;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        r27 = r7;
        r25 = r10;
        r11 = 7;
        r5 = kotlin.collections.ArraysKt.J(r1);
        r6 = r5 - 1;
        r9 = 72057594037927935L;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r5] = r1[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0103, code lost:
    
        if (r5 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        r6 = r5 >> 3;
        r14 = (r5 & 7) << 3;
        r7 = (r1[r6] >> r14) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0112, code lost:
    
        if (r7 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0114, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0119, code lost:
    
        if (r7 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        r7 = java.lang.Long.hashCode(r4[r5]) * r19;
        r8 = (r7 ^ (r7 << 16)) >>> 7;
        r15 = b(r8);
        r8 = r8 & r2;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        if ((((r15 - r8) & r2) / 8) != (((r5 - r8) & r2) / 8)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013f, code lost:
    
        r33 = r12;
        r1[r6] = ((r7 & 127) << r14) | (r1[r6] & (~(r27 << r14)));
        r1[r1.length - r13] = (r1[r33] & r29) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r11;
        r9 = r29;
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
    
        r18 = r11;
        r33 = r12;
        r8 = r15 >> 3;
        r9 = r1[r8];
        r11 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0175, code lost:
    
        if (((r9 >> r11) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0177, code lost:
    
        r35 = r13;
        r1[r8] = (r9 & (~(r27 << r11))) | ((r7 & 127) << r11);
        r1[r6] = (r1[r6] & (~(r27 << r14))) | (128 << r14);
        r4[r15] = r4[r5];
        r4[r5] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019c, code lost:
    
        r35 = r13;
        r1[r8] = ((r7 & 127) << r11) | (r9 & (~(r27 << r11)));
        r6 = r4[r15];
        r4[r15] = r4[r5];
        r4[r5] = r6;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        r1[r1.length - 1] = (r1[r33] & r29) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r18;
        r9 = r29;
        r12 = r33;
        r13 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ca, code lost:
    
        r33 = r12;
        r35 = r13;
        r38.e = androidx.collection.ScatterMapKt.a(r38.c) - r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01dd, code lost:
    
        r27 = 255;
        r25 = r10;
        r33 = 0;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e8, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01eb, code lost:
    
        r1 = androidx.collection.ScatterMapKt.c(r38.c);
        r2 = r38.f687a;
        r4 = r38.b;
        r5 = r38.c;
        c(r1);
        r1 = r38.f687a;
        r6 = r38.b;
        r7 = r38.c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0202, code lost:
    
        if (r8 >= r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0211, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0213, code lost:
    
        r9 = r4[r8];
        r11 = java.lang.Long.hashCode(r9) * r19;
        r11 = r11 ^ (r11 << 16);
        r12 = b(r11 >>> 7);
        r13 = r11 & 127;
        r11 = r12 >> 3;
        r15 = (r12 & 7) << 3;
        r23 = r1;
        r22 = r2;
        r1 = (r1[r11] & (~(255 << r15))) | (r13 << r15);
        r23[r11] = r1;
        r23[(((r12 - 7) & r7) + (r7 & 7)) >> 3] = r1;
        r6[r12] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0249, code lost:
    
        r23 = r1;
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024d, code lost:
    
        r8 = r8 + 1;
        r2 = r22;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0254, code lost:
    
        r1 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0258, code lost:
    
        r16 = r1;
        r38.d++;
        r1 = r38.e;
        r2 = r38.f687a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0272, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0274, code lost:
    
        r33 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r38.e = r1 - r33;
        r1 = r38.c;
        r4 = (r4 & (~(r27 << r6))) | (r25 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r39) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.d(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f687a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L91
            r10 = -1
        L65:
            if (r10 < 0) goto L90
            int r14 = r13.d
            int r14 = r14 + (-1)
            r13.d = r14
            long[] r14 = r13.f687a
            int r15 = r13.c
            int r0 = r10 >> 3
            r1 = r10 & 7
            int r1 = r1 << 3
            r2 = r14[r0]
            r4 = 255(0xff, double:1.26E-321)
            long r4 = r4 << r1
            long r4 = ~r4
            long r2 = r2 & r4
            r4 = 254(0xfe, double:1.255E-321)
            long r4 = r4 << r1
            long r1 = r2 | r4
            r14[r0] = r1
            int r10 = r10 + (-7)
            r0 = r10 & r15
            r15 = r15 & 7
            int r0 = r0 + r15
            int r15 = r0 >> 3
            r14[r15] = r1
        L90:
            return
        L91:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.e(long):void");
    }
}
