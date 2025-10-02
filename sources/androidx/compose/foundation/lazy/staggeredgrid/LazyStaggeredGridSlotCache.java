package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlotCache;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {

    /* renamed from: a, reason: collision with root package name */
    public long f1077a;
    public float b;
    public LazyStaggeredGridSlots c;

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    public final LazyStaggeredGridSlots a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (this.c != null && Constraints.b(this.f1077a, j) && this.b == lazyLayoutMeasureScope.getD()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.c;
            Intrinsics.e(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.f1077a = j;
        this.b = lazyLayoutMeasureScope.getD();
        new Constraints(j);
        throw null;
    }
}
