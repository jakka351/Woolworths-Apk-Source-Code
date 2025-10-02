package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListItemProvider f997a;
    public final LazyLayoutMeasureScope b;
    public final long c;

    public LazyListMeasuredItemProvider(long j, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.f997a = lazyListItemProvider;
        this.b = lazyLayoutMeasureScope;
        this.c = ConstraintsKt.b(z ? Constraints.h(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : Constraints.g(j), 5);
    }

    public static LazyListMeasuredItem c(LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1, int i) {
        long j = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.c;
        LazyListItemProvider lazyListItemProvider = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.f997a;
        return lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.b(i, lazyListItemProvider.f(i), lazyListItemProvider.e(i), lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.b.e0(i, j), j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i, int i2, int i3, long j) {
        LazyListItemProvider lazyListItemProvider = this.f997a;
        return b(i, lazyListItemProvider.f(i), lazyListItemProvider.e(i), this.b.e0(i, j), j);
    }

    public abstract LazyListMeasuredItem b(int i, Object obj, Object obj2, List list, long j);
}
