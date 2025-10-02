package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DebugRippleTheme implements RippleTheme {

    /* renamed from: a, reason: collision with root package name */
    public static final DebugRippleTheme f1384a = new DebugRippleTheme();

    @Override // androidx.compose.material.ripple.RippleTheme
    public final long a(Composer composer) {
        composer.o(2042140174);
        long j = Color.b;
        ColorKt.i(j);
        composer.l();
        return j;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha b(Composer composer) {
        composer.o(-1629816343);
        RippleAlpha rippleAlpha = ((double) ColorKt.i(Color.b)) > 0.5d ? RippleThemeKt.b : RippleThemeKt.c;
        composer.l();
        return rippleAlpha;
    }
}
