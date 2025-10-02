package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    public final CompositionLocalMap d;

    public CompositionLocalMapInjectionElement(CompositionLocalMap compositionLocalMap) {
        this.d = compositionLocalMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        CompositionLocalMapInjectionNode compositionLocalMapInjectionNode = new CompositionLocalMapInjectionNode();
        compositionLocalMapInjectionNode.r = this.d;
        return compositionLocalMapInjectionNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CompositionLocalMapInjectionNode compositionLocalMapInjectionNode = (CompositionLocalMapInjectionNode) node;
        CompositionLocalMap compositionLocalMap = this.d;
        compositionLocalMapInjectionNode.r = compositionLocalMap;
        DelegatableNodeKt.g(compositionLocalMapInjectionNode).i(compositionLocalMap);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && Intrinsics.c(((CompositionLocalMapInjectionElement) obj).d, this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
