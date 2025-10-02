package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectIntMap;", "K", "Landroidx/collection/ObjectIntMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {
    public int f;

    public MutableObjectIntMap(int i) {
        this.f692a = ScatterMapKt.f699a;
        this.b = ContainerHelpersKt.c;
        this.c = IntSetKt.f681a;
        if (i >= 0) {
            f(ScatterMapKt.e(i));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.f692a;
        if (jArr != ScatterMapKt.f699a) {
            ArraysKt.D(jArr, -9187201950435737472L);
            long[] jArr2 = this.f692a;
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
            long[] jArr = this.f692a;
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

    public final int e(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f692a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (Intrinsics.c(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iD = d(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.f692a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.f692a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iJ = ArraysKt.J(jArr4);
                            int i20 = iJ - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iJ] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iD2 = d(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((iD2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i19;
                                        j11 = j13;
                                    } else {
                                        int i26 = i19;
                                        int i27 = iD2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (iD2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iD2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iD2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[iD2];
                                            objArr[iD2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[iD2];
                                            iArr[iD2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        i19 = i26;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = ScatterMapKt.a(this.d) - this.e;
                        }
                        iD = d(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iC = ScatterMapKt.c(this.d);
                    long[] jArr5 = this.f692a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i30 = this.d;
                    f(iC);
                    long[] jArr6 = this.f692a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD3 = d(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = iD3 >> 3;
                            int i35 = (iD3 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((iD3 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[iD3] = obj4;
                            iArr3[iD3] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iD = d(i4);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr7 = this.f692a;
                int i37 = iD >> 3;
                long j17 = jArr7[i37];
                int i38 = (iD & 7) << 3;
                this.f = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((iD - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~iD;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
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
        this.f692a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f = ScatterMapKt.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new int[iMax];
    }

    public final void g(int i) {
        this.e--;
        long[] jArr = this.f692a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void h(int i, Object obj) {
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        this.b[iE] = obj;
        this.c[iE] = i;
    }

    public /* synthetic */ MutableObjectIntMap() {
        this(6);
    }
}
