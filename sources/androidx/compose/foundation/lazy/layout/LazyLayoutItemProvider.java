package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    int a();

    default int c(Object obj) {
        return -1;
    }

    default Object e(int i) {
        return null;
    }

    default Object f(int i) {
        return new DefaultLazyKey(i);
    }

    void h(int i, Composer composer, Object obj);
}
