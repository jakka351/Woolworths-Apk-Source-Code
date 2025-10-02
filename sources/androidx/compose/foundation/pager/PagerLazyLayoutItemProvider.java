package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f1087a;
    public final LazyLayoutIntervalContent b;
    public final NearestRangeKeyIndexMap c;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent lazyLayoutIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f1087a = pagerState;
        this.b = lazyLayoutIntervalContent;
        this.c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int a() {
        return this.b.getB().b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int c(Object obj) {
        return this.c.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return Intrinsics.c(this.b, ((PagerLazyLayoutItemProvider) obj).b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object f(int i) {
        Object objA = this.c.a(i);
        return objA == null ? this.b.l(i) : objA;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(final int i, Composer composer, Object obj) {
        composer.o(-1201380429);
        LazyLayoutPinnableItemKt.a(obj, i, this.f1087a.C, ComposableLambdaKt.c(1142237095, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerLazyLayoutItemProvider$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MutableIntervalList b = this.h.b.getB();
                    int i2 = i;
                    IntervalList.Interval intervalB = b.b(i2);
                    ((PagerIntervalContent) intervalB.c).b.invoke(PagerScopeImpl.f1089a, Integer.valueOf(i2 - intervalB.f1033a), composer2, 0);
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
}
