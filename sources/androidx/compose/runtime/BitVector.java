package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BitVector {

    /* renamed from: a, reason: collision with root package name */
    public long f1621a;
    public long b;
    public long[] c;

    public final int a(int i) {
        int iNumberOfTrailingZeros;
        if (i < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.f1621a) >>> i) << i)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (i < 128) {
            int i2 = i - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.b) >>> i2) << i2);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(i, 128);
        int i3 = (iMax / 64) - 2;
        long[] jArr = this.c;
        int length = jArr.length;
        for (int i4 = i3; i4 < length; i4++) {
            long j = ~jArr[i4];
            if (i4 == i3) {
                int i5 = iMax % 64;
                j = (j >>> i5) << i5;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j);
            if (iNumberOfTrailingZeros3 < 64) {
                return YU.a.C(i4, 64, 128, iNumberOfTrailingZeros3);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BitVector ["
            r0.<init>(r1)
            long[] r1 = r14.c
            int r1 = r1.length
            int r1 = r1 + 2
            r2 = 64
            int r1 = r1 * r2
            r3 = 1
            r4 = 0
            r5 = r4
        L12:
            if (r5 >= r1) goto L57
            r6 = 0
            r8 = 1
            if (r5 >= r2) goto L23
            long r10 = r14.f1621a
            long r8 = r8 << r5
            long r8 = r8 & r10
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
            goto L49
        L23:
            r10 = 128(0x80, float:1.794E-43)
            if (r5 >= r10) goto L32
            long r10 = r14.b
            int r12 = r5 + (-64)
            long r8 = r8 << r12
            long r8 = r8 & r10
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
            goto L49
        L32:
            long[] r10 = r14.c
            int r11 = r10.length
            if (r11 != 0) goto L38
            goto L54
        L38:
            int r12 = r5 / 64
            int r12 = r12 + (-2)
            if (r12 < r11) goto L3f
            goto L54
        L3f:
            int r11 = r5 % 64
            r12 = r10[r12]
            long r8 = r8 << r11
            long r8 = r8 & r12
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L54
        L49:
            if (r3 != 0) goto L50
            java.lang.String r3 = ", "
            r0.append(r3)
        L50:
            r0.append(r5)
            r3 = r4
        L54:
            int r5 = r5 + 1
            goto L12
        L57:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.BitVector.toString():java.lang.String");
    }
}
