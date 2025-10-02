package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/DeleteAllCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAllCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        editingBuffer.f(0, editingBuffer.f2113a.a(), "");
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(DeleteAllCommand.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
