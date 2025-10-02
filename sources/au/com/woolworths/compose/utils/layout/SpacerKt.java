package au.com.woolworths.compose.utils.layout;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpacerKt {
    public static final void a(float f, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(824463762);
        if ((i & 6) == 0) {
            i2 = (composerImplV.q(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            androidx.compose.foundation.layout.SpacerKt.a(composerImplV, SizeKt.g(Modifier.Companion.d, f));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(f, i, 0);
        }
    }

    public static final void b(float f, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-104802694);
        if ((i & 6) == 0) {
            i2 = (composerImplV.q(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            androidx.compose.foundation.layout.SpacerKt.a(composerImplV, SizeKt.u(Modifier.Companion.d, f));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(f, i, 1);
        }
    }

    public static final void c(ColumnScope Spacer, float f, Composer composer, int i) {
        int i2;
        Intrinsics.h(Spacer, "$this$Spacer");
        ComposerImpl composerImplV = composer.v(1525165324);
        if ((i & 48) == 0) {
            i2 = (composerImplV.q(f) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && composerImplV.c()) {
            composerImplV.j();
        } else {
            a(f, composerImplV, (i2 >> 3) & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(Spacer, f, i, 0);
        }
    }

    public static final void d(RowScope Spacer, float f, Composer composer, int i) {
        int i2;
        Intrinsics.h(Spacer, "$this$Spacer");
        ComposerImpl composerImplV = composer.v(-440966156);
        if ((i & 48) == 0) {
            i2 = (composerImplV.q(f) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(f, composerImplV, (i2 >> 3) & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(Spacer, f, i, 1);
        }
    }
}
