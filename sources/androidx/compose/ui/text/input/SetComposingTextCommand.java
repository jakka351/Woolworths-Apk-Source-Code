package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetComposingTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2125a;
    public final int b;

    public SetComposingTextCommand(String str, int i) {
        this.f2125a = new AnnotatedString(str);
        this.b = i;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        boolean zE = editingBuffer.e();
        AnnotatedString annotatedString = this.f2125a;
        if (zE) {
            int i = editingBuffer.d;
            editingBuffer.f(i, editingBuffer.e, annotatedString.e);
            if (annotatedString.e.length() > 0) {
                editingBuffer.g(i, annotatedString.e.length() + i);
            }
        } else {
            int i2 = editingBuffer.b;
            editingBuffer.f(i2, editingBuffer.c, annotatedString.e);
            if (annotatedString.e.length() > 0) {
                editingBuffer.g(i2, annotatedString.e.length() + i2);
            }
        }
        int iD = editingBuffer.d();
        int i3 = this.b;
        int iC = RangesKt.c(i3 > 0 ? (iD + i3) - 1 : (iD + i3) - annotatedString.e.length(), 0, editingBuffer.f2113a.a());
        editingBuffer.h(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return Intrinsics.c(this.f2125a.e, setComposingTextCommand.f2125a.e) && this.b == setComposingTextCommand.b;
    }

    public final int hashCode() {
        return (this.f2125a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f2125a.e);
        sb.append("', newCursorPosition=");
        return YU.a.l(sb, this.b, ')');
    }
}
