package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier.Node node, Function0 function0) {
        ObserverNodeOwnerScope observerNodeOwnerScope = node.j;
        if (observerNodeOwnerScope == null) {
            observerNodeOwnerScope = new ObserverNodeOwnerScope((ObserverModifierNode) node);
            node.j = observerNodeOwnerScope;
        }
        OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.h(node).getSnapshotObserver();
        Function1 function1 = ObserverNodeOwnerScope.e;
        snapshotObserver.b(observerNodeOwnerScope, ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.h, function0);
    }
}
