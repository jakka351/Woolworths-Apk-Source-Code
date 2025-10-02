package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    public int e;

    public MutableScatterSet(int i) {
        this.f700a = ScatterMapKt.f699a;
        this.b = ContainerHelpersKt.c;
        if (i >= 0) {
            j(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean e(Object obj) {
        int i = this.d;
        this.b[h(obj)] = obj;
        return this.d != i;
    }

    public final Set f() {
        return new MutableSetWrapper(this);
    }

    public final void g() {
        this.d = 0;
        long[] jArr = this.f700a;
        if (jArr != ScatterMapKt.f699a) {
            ArraysKt.D(jArr, -9187201950435737472L);
            long[] jArr2 = this.f700a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.B(this.b, 0, this.c, null);
        this.e = ScatterMapKt.a(this.c) - this.d;
    }

    public final int h(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.c;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f700a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (Intrinsics.c(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int i15 = i(i5);
                long j8 = 255;
                if (this.e != 0 || ((this.f700a[i15 >> 3] >> ((i15 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i16 = this.c;
                    if (i16 > 8) {
                        int i17 = 8;
                        if (Long.compareUnsigned(this.d * 32, i16 * 25) <= 0) {
                            long[] jArr4 = this.f700a;
                            int i18 = this.c;
                            Object[] objArr2 = this.b;
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            j3 = 128;
                            while (i20 < i19) {
                                long j9 = j8;
                                long j10 = jArr4[i20] & (-9187201950435737472L);
                                jArr4[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                i17 = i17;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i21 = i17;
                            int iJ = ArraysKt.J(jArr4);
                            int i22 = iJ - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i22] = (jArr4[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iJ] = jArr4[0];
                            int i23 = 0;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j12 = (jArr4[i24] >> i25) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i23];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i26 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i18;
                                    if (((i27 - i28) & i18) / i21 == ((i23 - i28) & i18) / i21) {
                                        long j13 = j11;
                                        jArr4[i24] = ((r7 & 127) << i25) | ((~(j << i25)) & jArr4[i24]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i29 = i27 >> 3;
                                        long j15 = jArr4[i29];
                                        int i30 = (i27 & 7) << 3;
                                        if (((j15 >> i30) & j) == 128) {
                                            i2 = i21;
                                            i = i18;
                                            objArr = objArr2;
                                            jArr4[i29] = ((~(j << i30)) & j15) | ((r7 & 127) << i30);
                                            jArr4[i24] = (jArr4[i24] & (~(j << i25))) | (128 << i25);
                                            objArr[i27] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            i = i18;
                                            objArr = objArr2;
                                            i2 = i21;
                                            jArr4[i29] = ((r7 & 127) << i30) | ((~(j << i30)) & j15);
                                            Object obj3 = objArr[i27];
                                            objArr[i27] = objArr[i23];
                                            objArr[i23] = obj3;
                                            i23--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        j11 = j14;
                                        i21 = i2;
                                        i18 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            this.e = ScatterMapKt.a(this.c) - this.d;
                        }
                        i15 = i(i5);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iC = ScatterMapKt.c(this.c);
                    long[] jArr5 = this.f700a;
                    Object[] objArr3 = this.b;
                    int i31 = this.c;
                    j(iC);
                    long[] jArr6 = this.f700a;
                    Object[] objArr4 = this.b;
                    int i32 = this.c;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int i35 = i(i34 >>> 7);
                            long j16 = i34 & 127;
                            int i36 = i35 >> 3;
                            int i37 = (i35 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i36] & (~(255 << i37))) | (j16 << i37);
                            jArr[i36] = j17;
                            jArr[(((i35 - 7) & i32) + (i32 & 7)) >> 3] = j17;
                            objArr4[i35] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    i15 = i(i5);
                }
                this.d++;
                int i38 = this.e;
                long[] jArr7 = this.f700a;
                int i39 = i15 >> 3;
                long j18 = jArr7[i39];
                int i40 = (i15 & 7) << 3;
                this.e = i38 - (((j18 >> i40) & j) == j3 ? 1 : 0);
                int i41 = this.c;
                long j19 = (j18 & (~(j << i40))) | (j2 << i40);
                jArr7[i39] = j19;
                jArr7[(((i15 - 7) & i41) + (i41 & 7)) >> 3] = j19;
                return i15;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final int i(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f700a;
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

    public final void j(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        this.f700a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.e = ScatterMapKt.a(this.c) - this.d;
        this.b = iMax == 0 ? ContainerHelpersKt.c : new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f700a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.c(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L71
            r10 = -1
        L6b:
            if (r10 < 0) goto L70
            r13.o(r10)
        L70:
            return
        L71:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.k(java.lang.Object):void");
    }

    public final void l(ScatterSet elements) {
        Intrinsics.h(elements, "elements");
        Object[] objArr = elements.b;
        long[] jArr = elements.f700a;
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
                        m(objArr[(i << 3) + i3]);
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

    public final void m(Object obj) {
        this.b[h(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f700a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L47:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.c(r15, r1)
            if (r15 == 0) goto L60
            goto L70
        L60:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L47
        L66:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L79
            r11 = -1
        L70:
            if (r11 < 0) goto L73
            r2 = r12
        L73:
            if (r2 == 0) goto L78
            r0.o(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.n(java.lang.Object):boolean");
    }

    public final void o(int i) {
        this.d--;
        long[] jArr = this.f700a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public /* synthetic */ MutableScatterSet() {
        this(6);
    }
}
