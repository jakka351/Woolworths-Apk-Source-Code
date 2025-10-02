package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    public static Modifier a(Modifier modifier, Function1 function1) {
        return modifier.x0(new OnLayoutRectChangedElement(function1));
    }
}
