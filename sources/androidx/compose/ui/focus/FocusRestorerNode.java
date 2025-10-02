package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public PinnableContainer.PinnedHandle r;
    public final Function1 s = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:190:0x0167, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:211:0x0076, code lost:
        
            continue;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 491
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerNode$onExit$1.invoke(java.lang.Object):java.lang.Object");
        }
    };
    public final Function1 t = new Function1<FocusEnterExitScope, Unit>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x007f, code lost:
        
            continue;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1.invoke(java.lang.Object):java.lang.Object");
        }
    };

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void E1(FocusProperties focusProperties) {
        focusProperties.b(this.t);
        focusProperties.d(this.s);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void l2() {
        PinnableContainer.PinnedHandle pinnedHandle = this.r;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.r = null;
    }
}
