package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f1084a;
    public final int b;

    public PagerBeyondBoundsState(PagerState pagerState, int i) {
        this.f1084a = pagerState;
        this.b = i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int a() {
        return this.f1084a.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int b() {
        int i;
        PagerState pagerState = this.f1084a;
        if (pagerState.l().getF1088a().size() == 0) {
            return 0;
        }
        PagerLayoutInfo pagerLayoutInfoL = pagerState.l();
        int iA = (int) (pagerLayoutInfoL.getE() == Orientation.d ? pagerLayoutInfoL.a() & 4294967295L : pagerLayoutInfoL.a() >> 32);
        int c = pagerState.l().getC() + pagerState.l().getB();
        if (c != 0 && (i = iA / c) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return Math.max(0, this.f1084a.e - this.b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean d() {
        return !this.f1084a.l().getF1088a().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int e() {
        return Math.min(r0.m() - 1, ((PageInfo) CollectionsKt.O(this.f1084a.l().getF1088a())).getF1082a() + this.b);
    }
}
