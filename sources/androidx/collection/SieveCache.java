package androidx.collection;

import YU.a;
import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/collection/SieveCache;", "", "K", "V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SieveCache<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f702a = AnonymousClass1.h;
    public final Function1 b = AnonymousClass2.h;
    public final Function4 c = AnonymousClass3.h;
    public long[] d = ScatterMapKt.f699a;
    public Object[] e;
    public Object[] f;
    public long[] g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public int l;
    public int m;
    public int n;
    public int o;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function2<Object, Object, Integer> {
        public static final AnonymousClass1 h = new AnonymousClass1(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Intrinsics.h(obj, "<anonymous parameter 0>");
            Intrinsics.h(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "K", "", "V", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements Function1 {
        public static final AnonymousClass2 h = new AnonymousClass2(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            Intrinsics.h(it, "it");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00042\b\u0010\u0007\u001a\u0004\u0018\u0001H\u00042\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.SieveCache$3, reason: invalid class name */
    final class AnonymousClass3 extends Lambda implements Function4<Object, Object, Object, Boolean, Unit> {
        public static final AnonymousClass3 h = new AnonymousClass3(4);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            ((Boolean) obj4).booleanValue();
            Intrinsics.h(obj, "<anonymous parameter 0>");
            Intrinsics.h(obj2, "<anonymous parameter 1>");
            return Unit.f24250a;
        }
    }

    public SieveCache() {
        Object[] objArr = ContainerHelpersKt.c;
        this.e = objArr;
        this.f = objArr;
        this.g = SieveCacheKt.f703a;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.k = 16;
        b(ScatterMapKt.e(16));
    }

    public final int a(int i) {
        int i2 = this.h;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.d;
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

    public final void b(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.d(i)) : 0;
        this.h = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f699a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.D(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.d = jArr;
        this.i = ScatterMapKt.a(this.h) - this.j;
        Object[] objArr = ContainerHelpersKt.c;
        this.e = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f = objArr;
        if (iMax == 0) {
            jArr2 = SieveCacheKt.f703a;
        } else {
            jArr2 = new long[iMax];
            ArraysKt.D(jArr2, 4611686018427387903L);
        }
        this.g = jArr2;
    }

    public final void c(int i) {
        char c;
        long j;
        while (this.l > i && this.j != 0) {
            long[] jArr = this.g;
            int i2 = this.o;
            if (i2 == Integer.MAX_VALUE) {
                i2 = this.n;
            }
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2];
                if (((int) ((j2 >> 62) & 1)) == 0) {
                    break;
                }
                int i3 = (int) ((j2 >> 31) & 2147483647L);
                jArr[i2] = 4611686018427387903L & j2;
                i2 = i3 != Integer.MAX_VALUE ? i3 : this.n;
            }
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            if (i4 == Integer.MAX_VALUE) {
                i4 = Integer.MAX_VALUE;
            }
            this.o = i4;
            if (i2 == Integer.MAX_VALUE) {
                return;
            }
            Object obj = this.e[i2];
            Intrinsics.f(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            this.j--;
            long[] jArr2 = this.d;
            int i5 = this.h;
            int i6 = i2 >> 3;
            int i7 = (i2 & 7) << 3;
            long j3 = ((~(255 << i7)) & jArr2[i6]) | (254 << i7);
            jArr2[i6] = j3;
            jArr2[(((i2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
            this.e[i2] = null;
            Object[] objArr = this.f;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            long[] jArr3 = this.g;
            long j4 = jArr3[i2];
            int i8 = (int) ((j4 >> 31) & 2147483647L);
            int i9 = (int) (j4 & 2147483647L);
            if (i8 != Integer.MAX_VALUE) {
                c = 31;
                j = 2147483647L;
                jArr3[i8] = (i9 & 2147483647L) | (jArr3[i8] & (-2147483648L));
            } else {
                c = 31;
                j = 2147483647L;
                this.m = i9;
            }
            if (i9 != Integer.MAX_VALUE) {
                jArr3[i9] = (jArr3[i9] & (-4611686016279904257L)) | ((i8 & j) << c);
            } else {
                this.n = i8;
            }
            if (this.o == i2) {
                this.o = i8;
            }
            jArr3[i2] = 4611686018427387903L;
            if (obj2 != null) {
                this.l -= ((Number) this.f702a.invoke(obj, obj2)).intValue();
                this.c.invoke(obj, obj2, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f1, code lost:
    
        r33 = r39[r6];
        r6 = r9;
        r8 = (int) (r33 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f7, code lost:
    
        r8 = (r31 | r8) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03ff, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0401, code lost:
    
        r10 = r6;
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0406, code lost:
    
        r10 = r6;
        r6 = (int) (r39[r7] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x040c, code lost:
    
        r1[r10] = r6 | r8;
        r9 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0413, code lost:
    
        r1 = r0.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0418, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x041a, code lost:
    
        r0.m = (int) (r39[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0421, code lost:
    
        r1 = r0.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0423, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0425, code lost:
    
        r0.n = (int) (r39[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x042c, code lost:
    
        r1 = r0.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x042e, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0430, code lost:
    
        r0.o = (int) (r39[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0439, code lost:
    
        r62 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x043c, code lost:
    
        r27 = -4611686018427387904L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x043f, code lost:
    
        r1 = androidx.collection.ScatterMapKt.c(r0.h);
        r3 = r0.d;
        r6 = r0.e;
        r7 = r0.f;
        r8 = r0.g;
        r9 = r0.h;
        r10 = new int[r9];
        r0.b(r1);
        r1 = r0.d;
        r1 = r0.e;
        r1 = r0.f;
        r1 = r0.g;
        r1 = r0.h;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0469, code lost:
    
        if (r1 >= r9) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0479, code lost:
    
        if (((r3[r1 >> 3] >> ((r1 & 7) << 3)) & 255) >= 128) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x047b, code lost:
    
        r35 = r6[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x047d, code lost:
    
        if (r35 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x047f, code lost:
    
        r36 = r35.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0484, code lost:
    
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0486, code lost:
    
        r36 = r36 * (-862048943);
        r36 = r36 ^ (r36 << 16);
        r37 = r1;
        r1 = r0.a(r36 >>> 7);
        r1 = r36 & 127;
        r36 = r6;
        r39 = r7;
        r6 = r1;
        r1 = r1 >> 3;
        r40 = (r1 & 7) << 3;
        r6 = (r1[r1] & (~(255 << r40))) | (r6 << r40);
        r1[r1] = r6;
        r1[(((r1 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1[r1] = r35;
        r1[r1] = r39[r37];
        r1[r1] = r8[r37];
        r10[r37] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04cb, code lost:
    
        r37 = r1;
        r36 = r6;
        r39 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04d1, code lost:
    
        r1 = r37 + 1;
        r6 = r36;
        r7 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04d8, code lost:
    
        r1 = r0.g;
        r3 = r1.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04dc, code lost:
    
        if (r9 >= r3) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04de, code lost:
    
        r6 = r1[r9];
        r6 = (int) ((r6 >> 31) & 2147483647L);
        r7 = (int) (r6 & 2147483647L);
        r31 = r6 & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04ef, code lost:
    
        if (r6 != Integer.MAX_VALUE) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04f1, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04f2, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04f5, code lost:
    
        r6 = r10[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04fa, code lost:
    
        r8 = (r31 | r6) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0502, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0504, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0506, code lost:
    
        r7 = r10[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x050a, code lost:
    
        r1[r19] = r7 | r8;
        r9 = r19 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0511, code lost:
    
        r1 = r0.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0516, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0518, code lost:
    
        r0.m = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x051c, code lost:
    
        r1 = r0.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x051e, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0520, code lost:
    
        r0.n = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0524, code lost:
    
        r1 = r0.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0526, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0528, code lost:
    
        r0.o = r10[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x052c, code lost:
    
        r1 = r0.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0530, code lost:
    
        r0.j++;
        r3 = r0.i;
        r5 = r0.d;
        r6 = r1 >> 3;
        r7 = r5[r6];
        r9 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0548, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x054a, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x054d, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x054e, code lost:
    
        r0.i = r3 - r10;
        r3 = r0.h;
        r5 = ((~(255 << r9)) & r7) | (r6 << r9);
        r5[r6] = r5;
        r5[(((r1 - 7) & r3) + (r3 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r1 = r5;
        r0 = r28;
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (((r2 & ((~r2) << 6)) & r23) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r36 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b4, code lost:
    
        if (((((~r9) << 6) & r9) & r23) == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b6, code lost:
    
        r1 = r0.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bc, code lost:
    
        if (r0.i != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01cf, code lost:
    
        if (((r0.d[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d1, code lost:
    
        r62 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d5, code lost:
    
        r1 = r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d9, code lost:
    
        if (r1 <= 8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01db, code lost:
    
        r27 = -4611686018427387904L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ef, code lost:
    
        if (java.lang.Long.compareUnsigned(r0.j * 32, r1 * 25) > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f1, code lost:
    
        r1 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f3, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f5, code lost:
    
        r62 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f9, code lost:
    
        r3 = r0.h;
        r6 = r0.e;
        r7 = r0.f;
        r9 = r0.g;
        r10 = new long[r3];
        java.util.Arrays.fill(r10, 0, r3, 9223372034707292159L);
        r9 = (r3 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0219, code lost:
    
        if (r6 >= r9) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        r35 = r6;
        r6 = r1[r6] & r23;
        r1[r35] = (-72340172838076674L) & ((~r6) + (r6 >>> r20));
        r6 = r35 + 1;
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        r39 = r10;
        r6 = r1.length;
        r7 = r6 - 1;
        r6 = r6 - 2;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r7] = r1[0];
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0255, code lost:
    
        if (r6 == r3) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0257, code lost:
    
        r7 = r6 >> 3;
        r35 = (r6 & 7) << 3;
        r53 = (r1[r7] >> r35) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0265, code lost:
    
        if (r53 != 128) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0267, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026c, code lost:
    
        if (r53 == 254) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x026f, code lost:
    
        r43 = r6[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0271, code lost:
    
        if (r43 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0273, code lost:
    
        r43 = r43.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0278, code lost:
    
        r43 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027a, code lost:
    
        r43 = r43 * (-862048943);
        r9 = (r43 ^ (r43 << 16)) >>> 7;
        r10 = r0.a(r9);
        r9 = r9 & r3;
        r56 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029e, code lost:
    
        if ((((r10 - r9) & r3) / 8) != (((r6 - r9) & r56) / 8)) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r1[r7] = (r1[r7] & (~(255 << r35))) | ((r43 & 127) << r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b6, code lost:
    
        if (r39[r6] != 9223372034707292159L) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b8, code lost:
    
        r9 = r6;
        r39[r6] = (r9 << 32) | r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02bf, code lost:
    
        r1[r1.length - 1] = r1[0];
        r6 = r6 + 1;
        r3 = r56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cd, code lost:
    
        r3 = r10 >> 3;
        r57 = r1[r3];
        r9 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e0, code lost:
    
        if (((r57 >> r9) & 255) != 128) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e2, code lost:
    
        r62 = r8;
        r1[r3] = (r57 & (~(255 << r9))) | ((r43 & 127) << r9);
        r1[r7] = (r1[r7] & (~(255 << r35))) | (128 << r35);
        r6[r10] = r6[r6];
        r6[r6] = null;
        r7[r10] = r7[r6];
        r7[r6] = null;
        r9[r10] = r9[r6];
        r9[r6] = 4611686018427387903L;
        r3 = (int) ((r39[r6] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0323, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0325, code lost:
    
        r39[r3] = (r39[r3] & (-4294967296L)) | r10;
        r39[r6] = (r39[r6] & 4294967295L) | (-4294967296L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0339, code lost:
    
        r39[r6] = (Integer.MAX_VALUE << 32) | r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0343, code lost:
    
        r39[r10] = (r6 << 32) | Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0351, code lost:
    
        r62 = r8;
        r1[r3] = (r57 & (~(255 << r9))) | ((r43 & 127) << r9);
        r3 = r6[r10];
        r6[r10] = r6[r6];
        r6[r6] = r3;
        r3 = r7[r10];
        r7[r10] = r7[r6];
        r7[r6] = r3;
        r7 = r9[r10];
        r9[r10] = r9[r6];
        r9[r6] = r7;
        r3 = (int) ((r39[r6] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0387, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0389, code lost:
    
        r7 = r10;
        r39[r3] = (r39[r3] & (-4294967296L)) | r7;
        r39[r6] = (r7 << 32) | (r39[r6] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x039f, code lost:
    
        r7 = r10;
        r39[r6] = (r7 << 32) | r7;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03a7, code lost:
    
        r39[r10] = (r3 << 32) | r6;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03b3, code lost:
    
        r1[r1.length - 1] = r1[0];
        r6 = r6 + 1;
        r3 = r56;
        r8 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03c4, code lost:
    
        r62 = r8;
        r0.i = androidx.collection.ScatterMapKt.a(r0.h) - r0.j;
        r1 = r0.g;
        r3 = r1.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03da, code lost:
    
        if (r9 >= r3) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03dc, code lost:
    
        r6 = r1[r9];
        r6 = (int) ((r6 >> 31) & 2147483647L);
        r7 = (int) (r6 & 2147483647L);
        r31 = r6 & (-4611686018427387904L);
        r8 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03ed, code lost:
    
        if (r6 != Integer.MAX_VALUE) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ef, code lost:
    
        r6 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r67) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        long[] jArr = this.d;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.f(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i4];
                        Intrinsics.f(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this.k);
        sb.append(", size=");
        sb.append(this.l);
        sb.append(", capacity=");
        sb.append(this.h);
        sb.append(", count=");
        return a.l(sb, this.j, ']');
    }
}
