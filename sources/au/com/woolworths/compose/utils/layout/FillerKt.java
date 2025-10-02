package au.com.woolworths.compose.utils.layout;

import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FillerKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1085219255);
        if (((i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier.Companion companion = Modifier.Companion.d;
            androidx.compose.foundation.layout.SpacerKt.a(composerImplV, rowScopeInstance.a(companion, 1.0f, true));
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 0, modifier);
        }
    }
}
