package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CompatRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompatRippleTheme implements RippleTheme {

    /* renamed from: a, reason: collision with root package name */
    public static final CompatRippleTheme f1415a = new CompatRippleTheme();

    @Override // androidx.compose.material.ripple.RippleTheme
    public final long a(Composer composer) {
        composer.o(-1844533201);
        long j = ((Color) composer.x(ContentColorKt.f1427a)).f1766a;
        composer.l();
        return j;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha b(Composer composer) {
        composer.o(-290975286);
        composer.l();
        return RippleDefaults.f1478a;
    }
}
