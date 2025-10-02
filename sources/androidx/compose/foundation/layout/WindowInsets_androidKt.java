package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.core.graphics.Insets;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    public static final AndroidWindowInsets a(Composer composer) {
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        return WindowInsetsHolder.Companion.c(composer).e;
    }

    public static final AndroidWindowInsets b(Composer composer) {
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        return WindowInsetsHolder.Companion.c(composer).f;
    }

    public static final AndroidWindowInsets c(Composer composer) {
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        return WindowInsetsHolder.Companion.c(composer).g;
    }

    public static final InsetsValues d(Insets insets) {
        return new InsetsValues(insets.f2430a, insets.b, insets.c, insets.d);
    }
}
