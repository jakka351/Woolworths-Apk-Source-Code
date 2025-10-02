package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContextMenu_androidKt$ContextMenuArea$8 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ SelectionManager h;
    public final /* synthetic */ ComposableLambdaImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$8(SelectionManager selectionManager, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = selectionManager;
        this.i = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(49);
        ComposerImpl composerImplV = ((Composer) obj).v(605522716);
        SelectionManager selectionManager = this.h;
        int i = (composerImplV.I(selectionManager) ? 4 : 2) | iA;
        boolean z = composerImplV.z(i & 1, (i & 19) != 18);
        ComposableLambdaImpl composableLambdaImpl = this.i;
        if (z) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new ContextMenuState();
                composerImplV.A(objG);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$7$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ContextMenuState_androidKt.a(contextMenuState);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            ContextMenuArea_androidKt.b(contextMenuState, (Function0) objG2, SelectionManager_androidKt.a(contextMenuState, selectionManager), null, false, null, composableLambdaImpl, composerImplV, 1572918, 56);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ContextMenu_androidKt$ContextMenuArea$8(selectionManager, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
