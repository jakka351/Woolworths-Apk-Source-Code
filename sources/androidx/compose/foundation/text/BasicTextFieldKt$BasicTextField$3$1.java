package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final TextFieldSelectionState textFieldSelectionState = null;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                TextToolbarHandler textToolbarHandler = textFieldSelectionState2.f;
                if (textToolbarHandler != null) {
                    textToolbarHandler.a();
                }
                textFieldSelectionState2.g = null;
                textFieldSelectionState2.e = null;
            }
        };
    }
}
