package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CircularIntArray {

    /* renamed from: a, reason: collision with root package name */
    public int[] f670a;
    public int b;
    public int c;
    public int d;

    public CircularIntArray() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = iHighestOneBit - 1;
        this.f670a = new int[iHighestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.f670a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            ArraysKt.q(0, i4, length, iArr, iArr2);
            ArraysKt.q(i5, 0, this.b, this.f670a, iArr2);
            this.f670a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public final int b() {
        int i = this.b;
        if (i == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f670a[i];
        this.b = (i + 1) & this.d;
        return i2;
    }
}
