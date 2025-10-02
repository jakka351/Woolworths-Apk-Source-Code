package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LegacyTextFieldState$onValueChange$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    public final /* synthetic */ LegacyTextFieldState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onValueChange$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.h = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        String str = textFieldValue.f2127a.e;
        LegacyTextFieldState legacyTextFieldState = this.h;
        MutableState mutableState = legacyTextFieldState.t;
        AnnotatedString annotatedString = legacyTextFieldState.j;
        if (!Intrinsics.c(str, annotatedString != null ? annotatedString.e : null)) {
            ((SnapshotMutableStateImpl) legacyTextFieldState.k).setValue(HandleState.d);
            if (((Boolean) ((SnapshotMutableStateImpl) mutableState).getD()).booleanValue()) {
                ((SnapshotMutableStateImpl) mutableState).setValue(Boolean.FALSE);
            } else {
                ((SnapshotMutableStateImpl) legacyTextFieldState.s).setValue(Boolean.FALSE);
            }
        }
        long j = TextRange.b;
        legacyTextFieldState.f(j);
        legacyTextFieldState.e(j);
        legacyTextFieldState.u.invoke(textFieldValue);
        legacyTextFieldState.b.invalidate();
        return Unit.f24250a;
    }
}
