package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    public final boolean a(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1 function1, boolean z, boolean z2, Function0 function0) {
        if (KeyEvent_androidKt.b(keyEvent) != 2 || !keyEvent.isFromSource(257) || TextFieldKeyEventHandler_androidKt.a(keyEvent)) {
            return super.a(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, function1, z, z2, function0);
        }
        textFieldSelectionState.getClass();
        throw null;
    }
}
