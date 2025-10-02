package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList(int i) {
        this.f676a = i == 0 ? IntSetKt.f681a : new int[i];
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.f676a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.f676a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            Intrinsics.g(iArrCopyOf, "copyOf(...)");
            this.f676a = iArrCopyOf;
        }
    }

    public final int e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f676a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ArraysKt.q(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
        return i3;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            RuntimeHelpersKt.c("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f676a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ MutableIntList() {
        this(16);
    }
}
