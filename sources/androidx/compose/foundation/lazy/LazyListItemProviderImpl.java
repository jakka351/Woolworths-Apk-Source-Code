package androidx.compose.foundation.lazy;

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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyListItemProviderImpl implements LazyListItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f994a;
    public final LazyListIntervalContent b;
    public final LazyItemScopeImpl c;
    public final NearestRangeKeyIndexMap d;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f994a = lazyListState;
        this.b = lazyListIntervalContent;
        this.c = lazyItemScopeImpl;
        this.d = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int a() {
        return this.b.getF993a().b;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyLayoutKeyIndexMap b() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int c(Object obj) {
        return this.d.c(obj);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final MutableIntList d() {
        MutableIntList mutableIntList = this.b.b;
        return mutableIntList != null ? mutableIntList : IntListKt.f677a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object e(int i) {
        return this.b.j(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return Intrinsics.c(this.b, ((LazyListItemProviderImpl) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object f(int i) {
        Object objA = this.d.a(i);
        return objA == null ? this.b.l(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(final int i, Composer composer, Object obj) {
        composer.o(-462424778);
        LazyLayoutPinnableItemKt.a(obj, i, this.f994a.q, ComposableLambdaKt.c(-824725566, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    LazyListItemProviderImpl lazyListItemProviderImpl = this.h;
                    MutableIntervalList mutableIntervalList = lazyListItemProviderImpl.b.f993a;
                    int i2 = i;
                    IntervalList.Interval intervalB = mutableIntervalList.b(i2);
                    ((LazyListInterval) intervalB.c).c.invoke(lazyListItemProviderImpl.c, Integer.valueOf(i2 - intervalB.f1033a), composer2, 0);
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

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    /* renamed from: i, reason: from getter */
    public final LazyItemScopeImpl getC() {
        return this.c;
    }
}
