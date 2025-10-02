package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/SetSelectionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetSelectionCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f2126a;
    public final int b;

    public SetSelectionCommand(int i, int i2) {
        this.f2126a = i;
        this.b = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        int iC = RangesKt.c(this.f2126a, 0, editingBuffer.f2113a.a());
        int iC2 = RangesKt.c(this.b, 0, editingBuffer.f2113a.a());
        if (iC < iC2) {
            editingBuffer.h(iC, iC2);
        } else {
            editingBuffer.h(iC2, iC);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.f2126a == setSelectionCommand.f2126a && this.b == setSelectionCommand.b;
    }

    public final int hashCode() {
        return (this.f2126a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f2126a);
        sb.append(", end=");
        return YU.a.l(sb, this.b, ')');
    }
}
