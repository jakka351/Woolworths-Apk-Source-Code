package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/input/TextFieldState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldStateKt$rememberTextFieldState$1$1 extends Lambda implements Function0<TextFieldState> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EmptyList emptyList = EmptyList.d;
        return new TextFieldState(null, 0L, new TextUndoManager(null, new UndoManager(emptyList, emptyList, 100)));
    }
}
