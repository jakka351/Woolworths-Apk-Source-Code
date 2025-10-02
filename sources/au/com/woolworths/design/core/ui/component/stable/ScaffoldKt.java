package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    public static final void a(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, long j, AndroidWindowInsets androidWindowInsets, ComposableLambdaImpl composableLambdaImpl4, Composer composer, int i, int i2) {
        composer.o(-973348940);
        androidx.compose.material3.ScaffoldKt.a((i2 & 1) != 0 ? Modifier.Companion.d : modifier, (i2 & 2) != 0 ? ComposableSingletons$ScaffoldKt.f4741a : composableLambdaImpl, (i2 & 4) != 0 ? ComposableSingletons$ScaffoldKt.b : composableLambdaImpl2, (i2 & 8) != 0 ? ComposableSingletons$ScaffoldKt.c : composableLambdaImpl3, null, 0, (i2 & 16) != 0 ? CoreTheme.b(composer).e.f4848a.c : j, CoreTheme.b(composer).e.d.d, (i2 & 64) != 0 ? WindowInsets_androidKt.c(composer) : androidWindowInsets, composableLambdaImpl4, composer, ((i << 6) & 3670016) | (i & 8190) | 805306368);
        composer.l();
    }
}
