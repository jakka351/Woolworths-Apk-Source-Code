package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {

    /* renamed from: a, reason: collision with root package name */
    public int f1705a;
    public long[] b;
    public int[] c;
    public int[] d;
    public int e;

    public final int a(long j) {
        int i = this.f1705a + 1;
        long[] jArr = this.b;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            ArraysKt.r(0, jArr, 0, jArr2, jArr.length);
            ArraysKt.u(0, 0, 14, this.c, iArr);
            this.b = jArr2;
            this.c = iArr;
        }
        int i3 = this.f1705a;
        this.f1705a = i3 + 1;
        int length2 = this.d.length;
        if (this.e >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            ArraysKt.u(0, 0, 14, this.d, iArr2);
            this.d = iArr2;
        }
        int i7 = this.e;
        int[] iArr3 = this.d;
        this.e = iArr3[i7];
        long[] jArr3 = this.b;
        jArr3[i3] = j;
        this.c[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (jArr3[i8] <= j) {
                break;
            }
            b(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void b(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
