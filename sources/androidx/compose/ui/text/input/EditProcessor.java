package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class EditProcessor {

    /* renamed from: a, reason: collision with root package name */
    public TextFieldValue f2112a;
    public EditingBuffer b;

    public final TextFieldValue a(List list) {
        final EditCommand editCommand = null;
        try {
            int size = list.size();
            int i = 0;
            EditCommand editCommand2 = null;
            while (i < size) {
                try {
                    EditCommand editCommand3 = (EditCommand) list.get(i);
                    try {
                        editCommand3.a(this.b);
                        i++;
                        editCommand2 = editCommand3;
                    } catch (Exception e) {
                        e = e;
                        editCommand = editCommand3;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(this.b.f2113a.a());
                        sb2.append(", composition=");
                        sb2.append(this.b.c());
                        sb2.append(", selection=");
                        EditingBuffer editingBuffer = this.b;
                        sb2.append((Object) TextRange.h(TextRangeKt.a(editingBuffer.b, editingBuffer.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        CollectionsKt.L(list, sb, "\n", null, null, new Function1<EditCommand, CharSequence>(this) { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String strConcat;
                                EditCommand editCommand4 = (EditCommand) obj;
                                StringBuilder sbS = YU.a.s(this.h == editCommand4 ? " > " : "   ");
                                if (editCommand4 instanceof CommitTextCommand) {
                                    StringBuilder sb3 = new StringBuilder("CommitTextCommand(text.length=");
                                    CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand4;
                                    sb3.append(commitTextCommand.f2108a.e.length());
                                    sb3.append(", newCursorPosition=");
                                    strConcat = YU.a.l(sb3, commitTextCommand.b, ')');
                                } else if (editCommand4 instanceof SetComposingTextCommand) {
                                    StringBuilder sb4 = new StringBuilder("SetComposingTextCommand(text.length=");
                                    SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand4;
                                    sb4.append(setComposingTextCommand.f2125a.e.length());
                                    sb4.append(", newCursorPosition=");
                                    strConcat = YU.a.l(sb4, setComposingTextCommand.b, ')');
                                } else if ((editCommand4 instanceof SetComposingRegionCommand) || (editCommand4 instanceof DeleteSurroundingTextCommand) || (editCommand4 instanceof DeleteSurroundingTextInCodePointsCommand) || (editCommand4 instanceof SetSelectionCommand)) {
                                    strConcat = editCommand4.toString();
                                } else if (editCommand4 instanceof FinishComposingTextCommand) {
                                    strConcat = "FinishComposingTextCommand()";
                                } else if (editCommand4 instanceof BackspaceCommand) {
                                    strConcat = "BackspaceCommand()";
                                } else if (editCommand4 instanceof MoveCursorCommand) {
                                    strConcat = "MoveCursorCommand(amount=0)";
                                } else if (editCommand4 instanceof DeleteAllCommand) {
                                    strConcat = "DeleteAllCommand()";
                                } else {
                                    String strB = Reflection.f24268a.b(editCommand4.getClass()).B();
                                    if (strB == null) {
                                        strB = "{anonymous EditCommand}";
                                    }
                                    strConcat = "Unknown EditCommand: ".concat(strB);
                                }
                                sbS.append(strConcat);
                                return sbS.toString();
                            }
                        }, 60);
                        String string = sb.toString();
                        Intrinsics.g(string, "toString(...)");
                        throw new RuntimeException(string, e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    editCommand = editCommand2;
                }
            }
            EditingBuffer editingBuffer2 = this.b;
            editingBuffer2.getClass();
            AnnotatedString annotatedString = new AnnotatedString(editingBuffer2.f2113a.toString());
            EditingBuffer editingBuffer3 = this.b;
            long jA = TextRangeKt.a(editingBuffer3.b, editingBuffer3.c);
            TextRange textRange = TextRange.g(this.f2112a.b) ? null : new TextRange(jA);
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString, textRange != null ? textRange.f2067a : TextRangeKt.a(TextRange.e(jA), TextRange.f(jA)), this.b.c());
            this.f2112a = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
