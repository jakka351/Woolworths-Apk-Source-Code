package androidx.compose.foundation.content.internal;

import android.view.DragEvent;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReceiveContentDragAndDropNode_androidKt {
    public static final DragAndDropNode a(final DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration, final Function1 function1) {
        return DragAndDropNodeKt.a(ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$1.h, new DragAndDropTarget() { // from class: androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt$ReceiveContentDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void R0(DragAndDropEvent dragAndDropEvent) {
                throw null;
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void T(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.b.f852a = 0;
                throw null;
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void a0(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.b.b();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void p1(DragAndDropEvent dragAndDropEvent) {
                dynamicReceiveContentConfiguration.b.a();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean u0(DragAndDropEvent dragAndDropEvent) {
                function1.invoke(dragAndDropEvent);
                DragEvent dragEvent = dragAndDropEvent.f1739a;
                dragEvent.getClipData();
                dragEvent.getClipDescription();
                throw null;
            }
        });
    }
}
