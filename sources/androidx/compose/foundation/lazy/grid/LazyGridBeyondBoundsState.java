package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridState f1009a;

    public LazyGridBeyondBoundsState(LazyGridState lazyGridState) {
        this.f1009a = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int a() {
        return this.f1009a.i().getO();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int b() {
        int i;
        boolean z;
        long u;
        LazyGridState lazyGridState = this.f1009a;
        int i2 = 0;
        if (lazyGridState.i().f().isEmpty()) {
            return 0;
        }
        LazyGridLayoutInfo lazyGridLayoutInfoI = lazyGridState.i();
        Orientation q = lazyGridLayoutInfoI.getQ();
        Orientation orientation = Orientation.d;
        int iA = (int) (q == orientation ? lazyGridLayoutInfoI.a() & 4294967295L : lazyGridLayoutInfoI.a() >> 32);
        LazyGridLayoutInfo lazyGridLayoutInfoI2 = lazyGridState.i();
        boolean z2 = lazyGridLayoutInfoI2.getQ() == orientation;
        List listF = lazyGridLayoutInfoI2.f();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < listF.size()) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) lazyGridLayoutInfoI2.f().get(i3);
            int w = z2 ? lazyGridItemInfo.getW() : lazyGridItemInfo.getX();
            if (w == -1) {
                i3++;
            } else {
                int iMax = i2;
                while (i3 < listF.size()) {
                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) lazyGridLayoutInfoI2.f().get(i3);
                    if ((z2 ? lazyGridItemInfo2.getW() : lazyGridItemInfo2.getX()) != w) {
                        break;
                    }
                    if (z2) {
                        z = z2;
                        u = ((LazyGridItemInfo) listF.get(i3)).getU() & 4294967295L;
                    } else {
                        z = z2;
                        u = ((LazyGridItemInfo) listF.get(i3)).getU() >> 32;
                    }
                    iMax = Math.max(iMax, (int) u);
                    i3++;
                    z2 = z;
                }
                i4 += iMax;
                i5++;
                z2 = z2;
                i2 = 0;
            }
        }
        int s = lazyGridLayoutInfoI2.getS() + (i4 / i5);
        if (s != 0 && (i = iA / s) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return this.f1009a.g();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean d() {
        return !this.f1009a.i().f().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int e() {
        return ((LazyGridItemInfo) CollectionsKt.O(this.f1009a.i().f())).getF996a();
    }
}
