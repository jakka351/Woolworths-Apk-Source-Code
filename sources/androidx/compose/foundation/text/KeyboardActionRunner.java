package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {

    /* renamed from: a, reason: collision with root package name */
    public final SoftwareKeyboardController f1118a;
    public KeyboardActions b;
    public FocusManager c;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.f1118a = softwareKeyboardController;
    }

    public final KeyboardActions a() {
        KeyboardActions keyboardActions = this.b;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.p("keyboardActions");
        throw null;
    }
}
