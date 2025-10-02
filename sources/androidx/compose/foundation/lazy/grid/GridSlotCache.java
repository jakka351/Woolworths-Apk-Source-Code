package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridSlotCache;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class GridSlotCache implements LazyGridSlotsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Lambda f1008a;
    public long b = ConstraintsKt.b(0, 0, 15);
    public float c;
    public LazyGridSlots d;

    /* JADX WARN: Multi-variable type inference failed */
    public GridSlotCache(Function2 function2) {
        this.f1008a = (Lambda) function2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    public final LazyGridSlots a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (this.d != null && Constraints.b(this.b, j) && this.c == lazyLayoutMeasureScope.getD()) {
            LazyGridSlots lazyGridSlots = this.d;
            Intrinsics.e(lazyGridSlots);
            return lazyGridSlots;
        }
        this.b = j;
        this.c = lazyLayoutMeasureScope.getD();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.f1008a.invoke(lazyLayoutMeasureScope, new Constraints(j));
        this.d = lazyGridSlots2;
        return lazyGridSlots2;
    }
}
