package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1) {
        return modifier.x0(new KeyInputElement(function1, null));
    }

    public static final Modifier b(Modifier modifier, Function1 function1) {
        return modifier.x0(new KeyInputElement(null, function1));
    }
}
