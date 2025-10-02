package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {
    public int f;

    public MutableObjectFloatMap(int i) {
        this.f690a = ScatterMapKt.f699a;
        this.b = ContainerHelpersKt.c;
        this.c = FloatSetKt.f673a;
        if (i >= 0) {
            e(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.f690a;
        if (jArr != ScatterMapKt.f699a) {
            ArraysKt.D(jArr, -9187201950435737472L);
            long[] jArr2 = this.f690a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.B(this.b, 0, this.d, null);
        this.f = ScatterMapKt.a(this.d) - this.e;
    }

    public final int d(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f690a;
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

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        this.f690a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = ScatterMapKt.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new float[iMax];
    }

    public final void f(MutableObjectFloatMap mutableObjectFloatMap) {
        Object[] objArr = mutableObjectFloatMap.b;
        float[] fArr = mutableObjectFloatMap.c;
        long[] jArr = mutableObjectFloatMap.f690a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        g(objArr[i4], fArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r2 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r37.f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (((r37.f690a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        r23 = 255;
        r27 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.e * 32, r2 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r2 = r37.f690a;
        r3 = r37.d;
        r4 = r37.b;
        r6 = r37.c;
        r7 = (r3 + 7) >> 3;
        r23 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        r27 = r11;
        r9 = 7;
        r7 = kotlin.collections.ArraysKt.J(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        if (r7 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        if (r10 == 254) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0132, code lost:
    
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r25 = d(r11);
        r11 = r11 & r3;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
    
        if ((((r25 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        r32 = r12;
        r2[r8] = ((r10 & 127) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r29;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        r32 = r12;
        r9 = r25 >> 3;
        r11 = r2[r9];
        r13 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0181, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0183, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r25] = r34[r7];
        r34[r7] = null;
        r6[r25] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01af, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & 127) << r13);
        r3 = r34[r25];
        r34[r25] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r25];
        r6[r25] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r26;
        r9 = r29;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ea, code lost:
    
        r37.f = androidx.collection.ScatterMapKt.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f9, code lost:
    
        r23 = 255;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0200, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
    
        r2 = androidx.collection.ScatterMapKt.c(r37.d);
        r3 = r37.f690a;
        r4 = r37.b;
        r6 = r37.c;
        r7 = r37.d;
        e(r2);
        r2 = r37.f690a;
        r8 = r37.b;
        r9 = r37.c;
        r10 = r37.d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021d, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022c, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022e, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0230, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0232, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0237, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0238, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = d(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026f, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0271, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0278, code lost:
    
        r2 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027c, code lost:
    
        r37.e++;
        r1 = r37.f;
        r3 = r37.f690a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0294, code lost:
    
        if (((r5 >> r7) & r23) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0296, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0298, code lost:
    
        r37.f = r1 - r15;
        r1 = r37.d;
        r5 = (r5 & (~(r23 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r38, float r39) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableObjectFloatMap.g(java.lang.Object, float):void");
    }

    public /* synthetic */ MutableObjectFloatMap() {
        this(6);
    }
}
