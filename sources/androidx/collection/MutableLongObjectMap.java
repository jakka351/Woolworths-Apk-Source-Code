package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    public int f;

    public MutableLongObjectMap(int i) {
        this.f685a = ScatterMapKt.f699a;
        this.b = LongSetKt.f688a;
        this.c = ContainerHelpersKt.c;
        if (i >= 0) {
            f(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.f685a;
        if (jArr != ScatterMapKt.f699a) {
            ArraysKt.D(jArr, -9187201950435737472L);
            long[] jArr2 = this.f685a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.B(this.c, 0, this.d, null);
        this.f = ScatterMapKt.a(this.d) - this.e;
    }

    public final int d(long j) {
        long j2;
        long j3;
        int i;
        int i2;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        Object[] objArr;
        int i3;
        long[] jArr3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr4 = this.f685a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr4[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr4[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            int i15 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iE = e(i6);
                if (this.f != 0 || ((this.f685a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    j4 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j4 = 128;
                        if (Long.compareUnsigned(this.e * 32, i18 * 25) <= 0) {
                            long[] jArr5 = this.f685a;
                            int i19 = this.d;
                            long[] jArr6 = this.b;
                            Object[] objArr2 = this.c;
                            int i20 = (i19 + 7) >> 3;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < i20) {
                                long j10 = jArr5[i21] & (-9187201950435737472L);
                                jArr5[i21] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i21++;
                                i13 = i13;
                                i15 = i15;
                                j7 = j7;
                            }
                            j3 = j7;
                            i = i15;
                            int i22 = i13;
                            char c = 7;
                            int iJ = ArraysKt.J(jArr5);
                            int i23 = iJ - 1;
                            long j11 = 72057594037927935L;
                            jArr5[i23] = (jArr5[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iJ] = jArr5[i];
                            int i24 = i;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr5[i25] >> i26) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr6[i24]) * i17;
                                    int i27 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i27);
                                    int i28 = i27 & i19;
                                    char c2 = c;
                                    if (((iE2 - i28) & i19) / 8 == ((i24 - i28) & i19) / 8) {
                                        int i29 = i22;
                                        j5 = j11;
                                        jArr5[i25] = ((r9 & 127) << i26) | (jArr5[i25] & (~(255 << i26)));
                                        jArr5[jArr5.length - i29] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        i22 = i29;
                                        c = c2;
                                    } else {
                                        int i30 = i22;
                                        j5 = j11;
                                        int i31 = iE2 >> 3;
                                        long j13 = jArr5[i31];
                                        int i32 = (iE2 & 7) << 3;
                                        if (((j13 >> i32) & 255) == 128) {
                                            i3 = i30;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i31] = (j13 & (~(255 << i32))) | ((r9 & 127) << i32);
                                            jArr5[i25] = (jArr5[i25] & (~(255 << i26))) | (128 << i26);
                                            jArr3[iE2] = jArr3[i24];
                                            jArr3[i24] = 0;
                                            objArr[iE2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            objArr = objArr2;
                                            i3 = i30;
                                            jArr3 = jArr6;
                                            jArr5[i31] = ((r9 & 127) << i32) | (j13 & (~(255 << i32)));
                                            long j14 = jArr3[iE2];
                                            jArr3[iE2] = jArr3[i24];
                                            jArr3[i24] = j14;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i24];
                                            objArr[i24] = obj;
                                            i24--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j5) | Long.MIN_VALUE;
                                        i24++;
                                        jArr6 = jArr3;
                                        i22 = i3;
                                        c = c2;
                                        objArr2 = objArr;
                                    }
                                    j11 = j5;
                                } else {
                                    i24++;
                                }
                            }
                            i2 = i22;
                            this.f = ScatterMapKt.a(this.d) - this.e;
                        }
                        iE = e(i6);
                    } else {
                        j4 = 128;
                    }
                    j2 = 255;
                    j3 = j7;
                    i = 0;
                    i2 = 1;
                    int iC = ScatterMapKt.c(this.d);
                    long[] jArr7 = this.f685a;
                    long[] jArr8 = this.b;
                    Object[] objArr3 = this.c;
                    int i33 = this.d;
                    f(iC);
                    long[] jArr9 = this.f685a;
                    long[] jArr10 = this.b;
                    Object[] objArr4 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr7[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j4) {
                            long j15 = jArr8[i35];
                            int iHashCode3 = Long.hashCode(j15) * i17;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i36 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j16 = i36 & 127;
                            int i37 = iE3 >> 3;
                            int i38 = (iE3 & 7) << 3;
                            long j17 = (jArr[i37] & (~(255 << i38))) | (j16 << i38);
                            jArr[i37] = j17;
                            jArr[(((iE3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            jArr10[iE3] = j15;
                            objArr4[iE3] = objArr3[i35];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i35++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    iE = e(i6);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr11 = this.f685a;
                int i40 = iE >> 3;
                long j18 = jArr11[i40];
                int i41 = (iE & 7) << 3;
                if (((j18 >> i41) & j2) != j4) {
                    i2 = i;
                }
                this.f = i39 - i2;
                int i42 = this.d;
                long j19 = (j18 & (~(j2 << i41))) | (j3 << i41);
                jArr11[i40] = j19;
                jArr11[(((iE - 7) & i42) + (i42 & 7)) >> 3] = j19;
                return iE;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f685a;
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

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        this.f685a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = ScatterMapKt.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f685a
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
            if (r4 == 0) goto L98
            r10 = -1
        L65:
            r14 = 0
            if (r10 < 0) goto L97
            int r15 = r13.e
            int r15 = r15 + (-1)
            r13.e = r15
            long[] r15 = r13.f685a
            int r0 = r13.d
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r15[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            r5 = 254(0xfe, double:1.255E-321)
            long r5 = r5 << r2
            long r2 = r3 | r5
            r15[r1] = r2
            int r1 = r10 + (-7)
            r1 = r1 & r0
            r0 = r0 & 7
            int r1 = r1 + r0
            int r0 = r1 >> 3
            r15[r0] = r2
            java.lang.Object[] r15 = r13.c
            r0 = r15[r10]
            r15[r10] = r14
            return r0
        L97:
            return r14
        L98:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.g(long):java.lang.Object");
    }

    public final void h(long j, Object obj) {
        int iD = d(j);
        this.b[iD] = j;
        this.c[iD] = obj;
    }

    public /* synthetic */ MutableLongObjectMap() {
        this(6);
    }
}
