package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f2111a;
    public final int b;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.f2111a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.f2111a) {
                int i4 = i3 + 1;
                int i5 = editingBuffer.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(editingBuffer.b((i5 - i4) + (-1))) && Character.isLowSurrogate(editingBuffer.b(editingBuffer.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iA = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iA + 1;
            int i7 = editingBuffer.c;
            PartialGapBuffer partialGapBuffer = editingBuffer.f2113a;
            if (i7 + i6 >= partialGapBuffer.a()) {
                iA = partialGapBuffer.a() - editingBuffer.c;
                break;
            } else {
                iA = (Character.isHighSurrogate(editingBuffer.b((editingBuffer.c + i6) + (-1))) && Character.isLowSurrogate(editingBuffer.b(editingBuffer.c + i6))) ? iA + 2 : i6;
                i++;
            }
        }
        int i8 = editingBuffer.c;
        editingBuffer.a(i8, iA + i8);
        int i9 = editingBuffer.b;
        editingBuffer.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.f2111a == deleteSurroundingTextInCodePointsCommand.f2111a && this.b == deleteSurroundingTextInCodePointsCommand.b;
    }

    public final int hashCode() {
        return (this.f2111a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f2111a);
        sb.append(", lengthAfterCursor=");
        return YU.a.l(sb, this.b, ')');
    }
}
