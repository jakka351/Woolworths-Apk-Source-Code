package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f991a;

    public LazyListBeyondBoundsState(LazyListState lazyListState) {
        this.f991a = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int a() {
        return this.f991a.j().getN();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int b() {
        int i;
        LazyListState lazyListState = this.f991a;
        if (lazyListState.j().f().isEmpty()) {
            return 0;
        }
        int iA = LazyListSnapLayoutInfoProviderKt.a(lazyListState.j());
        int iA2 = LazyListLayoutInfoKt.a(lazyListState.j());
        if (iA2 != 0 && (i = iA / iA2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return Math.max(0, this.f991a.h());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean d() {
        return !this.f991a.j().f().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int e() {
        return Math.min(a() - 1, ((LazyListItemInfo) CollectionsKt.O(this.f991a.j().f())).getF996a());
    }
}
