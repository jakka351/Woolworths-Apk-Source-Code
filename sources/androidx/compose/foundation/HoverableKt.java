package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HoverableKt {
    public static Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource) {
        return modifier.x0(new HoverableElement(mutableInteractionSource));
    }
}
