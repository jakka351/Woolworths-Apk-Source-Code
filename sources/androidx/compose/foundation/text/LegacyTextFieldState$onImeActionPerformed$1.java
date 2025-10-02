package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "invoke-KlQnJC8", "(I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LegacyTextFieldState$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {
    public final /* synthetic */ LegacyTextFieldState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onImeActionPerformed$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.h = legacyTextFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Unit unit;
        SoftwareKeyboardController softwareKeyboardController;
        int i = ((ImeAction) obj).f2115a;
        KeyboardActionRunner keyboardActionRunner = this.h.r;
        keyboardActionRunner.getClass();
        if (i == 7) {
            function1 = keyboardActionRunner.a().f1119a;
        } else {
            if (i == 2) {
                keyboardActionRunner.a();
            } else if (i == 6) {
                function1 = keyboardActionRunner.a().b;
            } else if (i == 5) {
                keyboardActionRunner.a();
            } else if (i == 3) {
                function1 = keyboardActionRunner.a().c;
            } else if (i == 4) {
                keyboardActionRunner.a();
            } else if (i != 1 && i != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1 = null;
        }
        Unit unit2 = Unit.f24250a;
        if (function1 != null) {
            function1.invoke(keyboardActionRunner);
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (i == 6) {
                FocusManager focusManager = keyboardActionRunner.c;
                if (focusManager != null) {
                    focusManager.l(1);
                    return unit2;
                }
                Intrinsics.p("focusManager");
                throw null;
            }
            if (i == 5) {
                FocusManager focusManager2 = keyboardActionRunner.c;
                if (focusManager2 != null) {
                    focusManager2.l(2);
                    return unit2;
                }
                Intrinsics.p("focusManager");
                throw null;
            }
            if (i == 7 && (softwareKeyboardController = keyboardActionRunner.f1118a) != null) {
                softwareKeyboardController.b();
            }
        }
        return unit2;
    }
}
