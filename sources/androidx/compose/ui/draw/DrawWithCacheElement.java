package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {
    public final Function1 d;

    public DrawWithCacheElement(Function1 function1) {
        this.d = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.d);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = (CacheDrawModifierNodeImpl) node;
        cacheDrawModifierNodeImpl.u = this.d;
        cacheDrawModifierNodeImpl.z1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.c(this.d, ((DrawWithCacheElement) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.d + ')';
    }
}
