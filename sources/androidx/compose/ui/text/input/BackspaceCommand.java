package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/BackspaceCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackspaceCommand implements EditCommand {
    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        if (editingBuffer.e()) {
            editingBuffer.a(editingBuffer.d, editingBuffer.e);
            return;
        }
        if (editingBuffer.d() == -1) {
            int i = editingBuffer.b;
            int i2 = editingBuffer.c;
            editingBuffer.h(i, i);
            editingBuffer.a(i, i2);
            return;
        }
        if (editingBuffer.d() == 0) {
            return;
        }
        String string = editingBuffer.f2113a.toString();
        int iD = editingBuffer.d();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        editingBuffer.a(characterInstance.preceding(iD), editingBuffer.d());
    }

    public final boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(BackspaceCommand.class).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
