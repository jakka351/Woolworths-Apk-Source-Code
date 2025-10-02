package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    public static final WindowInsets a() {
        return new FixedIntInsets();
    }

    public static final WindowInsets b(float f, float f2, float f3, float f4) {
        return new FixedDpInsets(f, f2, f3, f4);
    }

    public static WindowInsets c(float f) {
        return new FixedDpInsets(f, 0, 0, 0);
    }

    public static final PaddingValues d(AndroidWindowInsets androidWindowInsets, Composer composer) {
        return new InsetsPaddingValues(androidWindowInsets, (Density) composer.x(CompositionLocalsKt.h));
    }

    public static final PaddingValues e(WindowInsets windowInsets, Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }

    public static final WindowInsets f(WindowInsets windowInsets, WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    public static final WindowInsets g(WindowInsets windowInsets, int i) {
        return new LimitInsets(windowInsets, i);
    }
}
