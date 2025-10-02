package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/CommitTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommitTextCommand implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f2108a;
    public final int b;

    public CommitTextCommand(AnnotatedString annotatedString, int i) {
        this.f2108a = annotatedString;
        this.b = i;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(EditingBuffer editingBuffer) {
        boolean zE = editingBuffer.e();
        AnnotatedString annotatedString = this.f2108a;
        if (zE) {
            editingBuffer.f(editingBuffer.d, editingBuffer.e, annotatedString.e);
        } else {
            editingBuffer.f(editingBuffer.b, editingBuffer.c, annotatedString.e);
        }
        int iD = editingBuffer.d();
        int i = this.b;
        int iC = RangesKt.c(i > 0 ? (iD + i) - 1 : (iD + i) - annotatedString.e.length(), 0, editingBuffer.f2113a.a());
        editingBuffer.h(iC, iC);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return Intrinsics.c(this.f2108a.e, commitTextCommand.f2108a.e) && this.b == commitTextCommand.b;
    }

    public final int hashCode() {
        return (this.f2108a.e.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f2108a.e);
        sb.append("', newCursorPosition=");
        return YU.a.l(sb, this.b, ')');
    }

    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str), i);
    }
}
