package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "androidx/compose/foundation/text/ContextMenu_androidKt$TextItem$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ ContextMenuState h;
    public final /* synthetic */ SelectionManager i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2(ContextMenuState contextMenuState, SelectionManager selectionManager) {
        super(0);
        this.h = contextMenuState;
        this.i = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.i.i();
        ContextMenuState_androidKt.a(this.h);
        return Unit.f24250a;
    }
}
