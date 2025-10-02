package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RotaryInputModifierKt {
    public static final Modifier a(Function1 function1) {
        return new RotaryInputElement(function1);
    }
}
