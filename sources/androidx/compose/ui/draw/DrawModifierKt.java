package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawModifierKt {
    public static final CacheDrawModifierNode a(Function1 function1) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), function1);
    }

    public static final Modifier b(Modifier modifier, Function1 function1) {
        return modifier.x0(new DrawBehindElement(function1));
    }

    public static final Modifier c(Modifier modifier, Function1 function1) {
        return modifier.x0(new DrawWithCacheElement(function1));
    }

    public static final Modifier d(Modifier modifier, Function1 function1) {
        return modifier.x0(new DrawWithContentElement(function1));
    }
}
