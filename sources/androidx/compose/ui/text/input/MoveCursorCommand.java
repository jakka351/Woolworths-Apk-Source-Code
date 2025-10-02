package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MoveCursorCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        if (editingBuffer.d() == -1) {
            int i = editingBuffer.b;
            editingBuffer.h(i, i);
        }
        int i2 = editingBuffer.b;
        editingBuffer.f2113a.toString();
        editingBuffer.h(i2, i2);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MoveCursorCommand);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MoveCursorCommand(amount=0)";
    }
}
