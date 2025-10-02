package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyItemScopeImpl implements LazyItemScope {

    /* renamed from: a, reason: collision with root package name */
    public MutableIntState f989a;
    public MutableIntState b;

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final Modifier a(SpringSpec springSpec, SpringSpec springSpec2, SpringSpec springSpec3) {
        return new LazyLayoutAnimateItemElement(springSpec, springSpec2, springSpec3);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public final Modifier d(Modifier modifier, float f) {
        return modifier.x0(new ParentSizeElement(f, this.f989a));
    }
}
