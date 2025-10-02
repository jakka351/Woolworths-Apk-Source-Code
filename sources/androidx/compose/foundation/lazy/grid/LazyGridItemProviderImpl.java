package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LazyGridItemProviderImpl implements LazyGridItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridState f1012a;
    public final LazyGridIntervalContent b;
    public final NearestRangeKeyIndexMap c;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f1012a = lazyGridState;
        this.b = lazyGridIntervalContent;
        this.c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int a() {
        return this.b.getB().b;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyLayoutKeyIndexMap b() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int c(Object obj) {
        return this.c.c(obj);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final MutableIntList d() {
        this.b.getClass();
        return IntListKt.f677a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object e(int i) {
        return this.b.j(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return Intrinsics.c(this.b, ((LazyGridItemProviderImpl) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object f(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.l(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(final int i, Composer composer, Object obj) {
        composer.o(1493551140);
        LazyLayoutPinnableItemKt.a(obj, i, this.f1012a.q, ComposableLambdaKt.c(726189336, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MutableIntervalList mutableIntervalList = this.h.b.b;
                    int i2 = i;
                    IntervalList.Interval intervalB = mutableIntervalList.b(i2);
                    ((LazyGridInterval) intervalB.c).d.invoke(LazyGridItemScopeImpl.f1013a, Integer.valueOf(i2 - intervalB.f1033a), composer2, 6);
                } else {
                    composer2.j();
                }
                return Unit.f24250a;
            }
        }, composer), composer, 3072);
        composer.l();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyGridSpanLayoutProvider j() {
        return this.b.f1011a;
    }
}
