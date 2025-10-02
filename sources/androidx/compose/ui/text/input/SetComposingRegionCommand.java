package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingRegionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetComposingRegionCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final int f2124a;
    public final int b;

    public SetComposingRegionCommand(int i, int i2) {
        this.f2124a = i;
        this.b = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        boolean zE = editingBuffer.e();
        PartialGapBuffer partialGapBuffer = editingBuffer.f2113a;
        if (zE) {
            editingBuffer.d = -1;
            editingBuffer.e = -1;
        }
        int iC = RangesKt.c(this.f2124a, 0, partialGapBuffer.a());
        int iC2 = RangesKt.c(this.b, 0, partialGapBuffer.a());
        if (iC != iC2) {
            if (iC < iC2) {
                editingBuffer.g(iC, iC2);
            } else {
                editingBuffer.g(iC2, iC);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.f2124a == setComposingRegionCommand.f2124a && this.b == setComposingRegionCommand.b;
    }

    public final int hashCode() {
        return (this.f2124a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f2124a);
        sb.append(", end=");
        return YU.a.l(sb, this.b, ')');
    }
}
