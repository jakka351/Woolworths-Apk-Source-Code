package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "Companion", "SpannedItem", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyStaggeredGridLaneInfo {

    /* renamed from: a, reason: collision with root package name */
    public int f1068a;
    public int[] b = new int[16];
    public final ArrayDeque c = new ArrayDeque();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "", "FullSpan", "I", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpannedItem {

        /* renamed from: a, reason: collision with root package name */
        public final int f1069a;
        public int[] b;

        public SpannedItem(int i, int[] iArr) {
            this.f1069a = i;
            this.b = iArr;
        }
    }

    public final boolean a(int i, int i2) {
        int iF = f(i);
        return iF == i2 || iF == -1 || iF == -2;
    }

    public final void b(int i, int i2) {
        if (i > 131072) {
            InlineClassHelperKt.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            ArraysKt.u(i2, 0, 12, this.b, iArr2);
            this.b = iArr2;
        }
    }

    public final void c(int i) {
        ArrayDeque arrayDeque;
        int i2 = this.f1068a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (this.b.length / 2), 0);
            this.f1068a = iMax;
            int i4 = iMax - i2;
            if (i4 >= 0) {
                int[] iArr = this.b;
                if (i4 < iArr.length) {
                    ArraysKt.q(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), this.b.length, 0);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.b;
                if (iArr3.length + i5 < 131072) {
                    b(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        ArraysKt.q(i5, 0, iArr3.length - i5, iArr3, iArr3);
                    }
                    int[] iArr4 = this.b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i5), 0);
                }
            }
        } else {
            b(i3 + 1, 0);
        }
        while (true) {
            arrayDeque = this.c;
            if (arrayDeque.isEmpty() || ((SpannedItem) arrayDeque.first()).f1069a >= this.f1068a) {
                break;
            } else {
                arrayDeque.removeFirst();
            }
        }
        while (!arrayDeque.isEmpty() && ((SpannedItem) arrayDeque.last()).f1069a > this.f1068a + this.b.length) {
            arrayDeque.removeLast();
        }
    }

    public final int d(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!a(i, i2));
        return i;
    }

    public final int[] e(int i) {
        final Integer numValueOf = Integer.valueOf(i);
        ArrayDeque arrayDeque = this.c;
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.J(CollectionsKt.o(arrayDeque.getE(), arrayDeque, new Function1<SpannedItem, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ComparisonsKt.a(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).f1069a), numValueOf));
            }
        }), arrayDeque);
        if (spannedItem != null) {
            return spannedItem.b;
        }
        return null;
    }

    public final int f(int i) {
        int i2 = this.f1068a;
        if (i < i2) {
            return -1;
        }
        if (i >= this.b.length + i2) {
            return -1;
        }
        return r1[i - i2] - 1;
    }

    public final void g() {
        ArraysKt.C(0, 0, 6, this.b);
        this.c.clear();
    }

    public final void h(int i, int i2) {
        if (!(i >= 0)) {
            InlineClassHelperKt.a("Negative lanes are not supported");
        }
        c(i);
        this.b[i - this.f1068a] = i2 + 1;
    }
}
