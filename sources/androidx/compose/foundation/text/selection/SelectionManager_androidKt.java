package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionManager_androidKt {
    public static final Function1 a(final ContextMenuState contextMenuState, final SelectionManager selectionManager) {
        return new Function1<ContextMenuScope, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    androidx.compose.foundation.contextmenu.ContextMenuScope r7 = (androidx.compose.foundation.contextmenu.ContextMenuScope) r7
                    androidx.compose.foundation.text.TextContextMenuItems r0 = androidx.compose.foundation.text.TextContextMenuItems.f
                    androidx.compose.foundation.text.selection.SelectionManager r1 = r2
                    androidx.compose.foundation.text.selection.Selection r2 = r1.e()
                    if (r2 != 0) goto Ld
                    goto L17
                Ld:
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r2.b
                    androidx.compose.foundation.text.selection.Selection$AnchorInfo r2 = r2.f1204a
                    boolean r4 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
                    if (r4 == 0) goto L19
                L17:
                    r2 = 0
                    goto L22
                L19:
                    long r4 = r2.c
                    long r2 = r3.c
                    int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r2 != 0) goto L3a
                    r2 = 1
                L22:
                    if (r2 == 0) goto L33
                    androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1 r2 = new androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                    r2.<init>(r0)
                    androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1 r0 = new androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                    androidx.compose.foundation.contextmenu.ContextMenuState r3 = r1
                    r0.<init>()
                    androidx.compose.foundation.contextmenu.ContextMenuScope.b(r7, r2, r0)
                L33:
                    androidx.compose.foundation.text.TextContextMenuItems r7 = androidx.compose.foundation.text.TextContextMenuItems.h
                    r1.h()
                    r7 = 0
                    throw r7
                L3a:
                    r1.h()
                    r7 = 0
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager_androidKt$contextMenuBuilder$1.invoke(java.lang.Object):java.lang.Object");
            }
        };
    }
}
