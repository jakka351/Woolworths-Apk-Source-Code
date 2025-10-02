package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasicTextFieldKt$BasicTextField$4$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
            TextFieldDecorator textFieldDecorator = BasicTextFieldKt.f1106a;
            final boolean z = false;
            final KeyboardOptions keyboardOptions = null;
            final TextFieldLineLimits textFieldLineLimits = null;
            final TextLayoutState textLayoutState = null;
            final TextStyle textStyle = null;
            final boolean z2 = false;
            final boolean z3 = false;
            final boolean z4 = false;
            final TransformedTextFieldState transformedTextFieldState = null;
            final TextFieldSelectionState textFieldSelectionState = null;
            final Brush brush = null;
            final boolean z5 = false;
            final boolean z6 = false;
            final ScrollState scrollState = null;
            final Orientation orientation = null;
            BasicTextFieldKt$DefaultTextFieldDecorator$1.f1108a.a(ComposableLambdaKt.c(1969169726, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue2 = ((Number) obj4).intValue();
                    if (composer2.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        textLayoutState.getClass();
                        throw null;
                    }
                    composer2.j();
                    return Unit.f24250a;
                }
            }, composer), composer);
        } else {
            composer.j();
        }
        return Unit.f24250a;
    }
}
