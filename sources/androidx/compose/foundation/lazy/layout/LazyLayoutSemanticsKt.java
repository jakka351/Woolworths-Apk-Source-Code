package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    public static final Modifier a(Modifier modifier, KProperty0 kProperty0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z, boolean z2) {
        return modifier.x0(new LazyLayoutSemanticsModifier(kProperty0, lazyLayoutSemanticState, orientation, z, z2));
    }
}
