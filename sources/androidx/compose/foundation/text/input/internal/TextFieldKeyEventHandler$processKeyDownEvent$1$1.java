package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldKeyEventHandler$processKeyDownEvent$1$1 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
        if (textFieldPreparedSelection.a()) {
            textFieldPreparedSelection.c();
        } else {
            textFieldPreparedSelection.b();
        }
        return Unit.f24250a;
    }
}
