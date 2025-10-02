package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldKeyInput {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyTextFieldState f1130a;
    public final TextFieldSelectionManager b;
    public final TextFieldValue c;
    public final boolean d;
    public final boolean e;
    public final TextPreparedSelectionState f;
    public final OffsetMapping g;
    public final UndoManager h;
    public final DeadKeyCombiner i;
    public final KeyMapping_androidKt$platformDefaultKeyMapping$1 j = KeyMapping_androidKt.f1117a;
    public final Function1 k;
    public final int l;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<TextFieldValue, Unit> {
        static {
            new AnonymousClass1(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Unit.f24250a;
        }
    }

    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, Function1 function1, int i) {
        this.f1130a = legacyTextFieldState;
        this.b = textFieldSelectionManager;
        this.c = textFieldValue;
        this.d = z;
        this.e = z2;
        this.f = textPreparedSelectionState;
        this.g = offsetMapping;
        this.h = undoManager;
        this.i = deadKeyCombiner;
        this.k = function1;
        this.l = i;
    }

    public final void a(List list) {
        EditProcessor editProcessor = this.f1130a.d;
        ArrayList arrayListJ0 = CollectionsKt.J0(list);
        arrayListJ0.add(0, new FinishComposingTextCommand());
        this.k.invoke(editProcessor.a(arrayListJ0));
    }
}
