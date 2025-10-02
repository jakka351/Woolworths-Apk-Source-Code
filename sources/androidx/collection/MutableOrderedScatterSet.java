package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    public int h;

    public MutableOrderedScatterSet(int i) {
        this.f696a = ScatterMapKt.f699a;
        this.b = ContainerHelpersKt.c;
        this.c = SieveCacheKt.f703a;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        if (i >= 0) {
            g(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(Object obj) {
        int i = this.g;
        int iE = e(obj);
        this.b[iE] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iE] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((iE & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = iE;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iE;
        }
        return this.g != i;
    }

    public final Set c() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void d() {
        this.g = 0;
        long[] jArr = this.f696a;
        if (jArr != ScatterMapKt.f699a) {
            ArraysKt.D(jArr, -9187201950435737472L);
            long[] jArr2 = this.f696a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.B(this.b, 0, this.f, null);
        ArraysKt.D(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = ScatterMapKt.a(this.f) - this.g;
    }

    public final int e(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f696a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (Intrinsics.c(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iF = f(i4);
                long j9 = 255;
                if (this.h != 0 || ((this.f696a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compareUnsigned(this.g * 32, i13 * 25) <= 0) {
                            long[] jArr4 = this.f696a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr5 = this.c;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iF2 = f(i23);
                                        int i24 = i23 & i14;
                                        if (((iF2 - i24) & i14) / 8 == ((i20 - i24) & i14) / 8) {
                                            int i25 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | ((r17 & 127) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i25;
                                            objArr = objArr2;
                                        } else {
                                            int i26 = i14;
                                            Object[] objArr3 = objArr;
                                            int i27 = iF2 >> 3;
                                            long j14 = jArr4[i27];
                                            int i28 = (iF2 & 7) << 3;
                                            if (((j14 >> i28) & j2) == 128) {
                                                jArr4[i27] = (j14 & (~(j2 << i28))) | ((r17 & 127) << i28);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iF2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iF2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i29 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                int i30 = Integer.MAX_VALUE;
                                                if (i29 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i29] = iF2 | (jArr6[i29] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                    i30 = Integer.MAX_VALUE;
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = (Integer.MAX_VALUE << 32) | iF2;
                                                }
                                                jArr6[iF2] = (i20 << 32) | i30;
                                            } else {
                                                j4 = j6;
                                                jArr4[i27] = ((r17 & 127) << i28) | (j14 & (~(j2 << i28)));
                                                Object obj3 = objArr3[iF2];
                                                objArr3[iF2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iF2];
                                                jArr5[iF2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i31 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i31 != Integer.MAX_VALUE) {
                                                    long j16 = iF2;
                                                    jArr6[i31] = (jArr6[i31] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iF2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i31 = i20;
                                                }
                                                jArr6[iF2] = (i31 << 32) | i20;
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.h = ScatterMapKt.a(this.f) - this.g;
                                long[] jArr7 = this.c;
                                int length2 = jArr7.length;
                                for (int i32 = 0; i32 < length2; i32++) {
                                    long j18 = jArr7[i32];
                                    jArr7[i32] = (((j18 & (-4611686018427387904L)) | (((int) ((j18 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j18 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i33 = this.d;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr6[i33] & 4294967295L);
                                }
                                int i34 = this.e;
                                if (i34 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i34] & 4294967295L);
                                }
                            }
                        }
                        iF = f(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iC = ScatterMapKt.c(this.f);
                    long[] jArr8 = this.f696a;
                    Object[] objArr4 = this.b;
                    long[] jArr9 = this.c;
                    int i35 = this.f;
                    int[] iArr = new int[i35];
                    g(iC);
                    long[] jArr10 = this.f696a;
                    Object[] objArr5 = this.b;
                    long[] jArr11 = this.c;
                    int i36 = this.f;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr8[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iF3 = f(i38 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i38 & 127;
                            int i39 = iF3 >> 3;
                            int i40 = (iF3 & 7) << 3;
                            long j20 = (jArr[i39] & (~(255 << i40))) | (j19 << i40);
                            jArr[i39] = j20;
                            jArr[(((iF3 - 7) & i36) + (i36 & 7)) >> 3] = j20;
                            objArr5[iF3] = obj4;
                            jArr11[iF3] = jArr9[i37];
                            iArr[i37] = iF3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i37++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.c;
                    int length3 = jArr12.length;
                    for (int i41 = 0; i41 < length3; i41++) {
                        long j21 = jArr12[i41];
                        jArr12[i41] = (((j21 & (-4611686018427387904L)) | (((int) ((j21 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j21 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i42 = this.d;
                    if (i42 != Integer.MAX_VALUE) {
                        this.d = iArr[i42];
                    }
                    int i43 = this.e;
                    if (i43 != Integer.MAX_VALUE) {
                        this.e = iArr[i43];
                    }
                    iF = f(i4);
                }
                this.g++;
                int i44 = this.h;
                long[] jArr13 = this.f696a;
                int i45 = iF >> 3;
                long j22 = jArr13[i45];
                int i46 = (iF & 7) << 3;
                if (((j22 >> i46) & j2) == j3) {
                    i = 1;
                }
                this.h = i44 - i;
                int i47 = this.f;
                long j23 = (j22 & (~(j2 << i46))) | (j << i46);
                jArr13[i45] = j23;
                jArr13[(((iF - 7) & i47) + (i47 & 7)) >> 3] = j23;
                return iF;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    public final int f(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f696a;
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

    public final void g(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
        }
        this.f696a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.h = ScatterMapKt.a(this.f) - this.g;
        this.b = iMax == 0 ? ContainerHelpersKt.c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = SieveCacheKt.f703a;
        } else {
            jArr2 = new long[iMax];
            ArraysKt.D(jArr2, 4611686018427387903L);
        }
        this.c = jArr2;
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
    public final boolean h(java.lang.Object r18) {
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
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f696a
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
            r0.i(r11)
        L78:
            return r2
        L79:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.h(java.lang.Object):boolean");
    }

    public final void i(int i) {
        this.g--;
        long[] jArr = this.f696a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.h(r1, r2)
            java.lang.Object[] r2 = r0.b
            int r3 = r0.g
            long[] r4 = r0.f696a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = kotlin.collections.CollectionsKt.t(r14, r15)
            if (r14 != 0) goto L4c
            r0.i(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.j(java.util.Collection):boolean");
    }
}
