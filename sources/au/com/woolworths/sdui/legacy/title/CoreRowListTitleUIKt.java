package au.com.woolworths.sdui.legacy.title;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CoreRowListTitleUIKt {
    public static final void a(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-961611071);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.a(str, CoreTheme.f(composerImplV).d.c.b, PaddingKt.f(SizeKt.e(companion, 1.0f), 16), CoreTheme.b(composerImplV).e.c.d, null, 0, 2, false, 1, null, composerImplV, (i3 & 14) | 102236160, 688);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(str, modifier2, i, 5, (byte) 0);
        }
    }
}
