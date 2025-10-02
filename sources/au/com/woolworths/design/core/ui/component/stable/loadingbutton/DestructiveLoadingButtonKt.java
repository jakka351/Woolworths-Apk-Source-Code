package au.com.woolworths.design.core.ui.component.stable.loadingbutton;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.button.d;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.LoadingButtonImplKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isLoading", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DestructiveLoadingButtonKt {
    public static final void a(String label, Function0 onClick, boolean z, Modifier modifier, String str, ButtonSpec.Size size, Composer composer, int i) {
        ButtonSpec.Size size2;
        String str2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-690572929);
        int i2 = (composerImplV.n(label) ? 4 : 2) | i | (composerImplV.I(onClick) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(modifier) ? 2048 : 1024;
        }
        int i3 = i2 | 115040256;
        if ((38347923 & i3) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
            size2 = size;
        } else {
            size2 = ButtonSpec.Size.g;
            long j = CoreTheme.b(composerImplV).f4782a.c.f4791a.f4792a;
            composerImplV.o(2079372653);
            Color color = z ? new Color(CoreTheme.b(composerImplV).f4782a.f4783a.f4784a.f4785a) : null;
            composerImplV.V(false);
            composerImplV.o(2079376135);
            Color color2 = z ? new Color(CoreTheme.b(composerImplV).f4782a.d.f4796a.f4797a) : null;
            composerImplV.V(false);
            LoadingButtonImplKt.a(label, z, null, null, ButtonSpec.Variant.Destructive.f4750a, null, size2, j, onClick, color, color2, null, "In progress", modifier, composerImplV, (i3 & 14) | 24576 | ((i3 >> 3) & 112) | 1772928 | ((i3 << 21) & 234881024), 432 | (i3 & 7168));
            str2 = "In progress";
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(label, onClick, z, modifier, str2, size2, i);
        }
    }
}
