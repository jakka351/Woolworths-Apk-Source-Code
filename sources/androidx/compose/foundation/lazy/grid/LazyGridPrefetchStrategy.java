package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import kotlin.Metadata;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LazyGridPrefetchStrategy {
    void a(NestedPrefetchScope nestedPrefetchScope, int i);

    void b(LazyGridMeasureResult lazyGridMeasureResult);

    void c(LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1, float f, LazyGridLayoutInfo lazyGridLayoutInfo);
}
