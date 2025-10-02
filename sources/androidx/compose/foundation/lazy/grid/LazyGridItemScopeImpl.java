package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LazyGridItemScopeImpl implements LazyGridItemScope {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyGridItemScopeImpl f1013a = new LazyGridItemScopeImpl();

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemScope
    public final Modifier a(SpringSpec springSpec, SpringSpec springSpec2, SpringSpec springSpec3) {
        return new LazyLayoutAnimateItemElement(springSpec, springSpec2, springSpec3);
    }
}
