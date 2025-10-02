package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f2110a;
    public final int b;

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.f2110a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int i = editingBuffer.c;
        PartialGapBuffer partialGapBuffer = editingBuffer.f2113a;
        int i2 = this.b;
        int iA = i + i2;
        if (((i ^ iA) & (i2 ^ iA)) < 0) {
            iA = partialGapBuffer.a();
        }
        editingBuffer.a(editingBuffer.c, Math.min(iA, partialGapBuffer.a()));
        int i3 = editingBuffer.b;
        int i4 = this.f2110a;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        editingBuffer.a(Math.max(0, i5), editingBuffer.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.f2110a == deleteSurroundingTextCommand.f2110a && this.b == deleteSurroundingTextCommand.b;
    }

    public final int hashCode() {
        return (this.f2110a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f2110a);
        sb.append(", lengthAfterCursor=");
        return YU.a.l(sb, this.b, ')');
    }
}
