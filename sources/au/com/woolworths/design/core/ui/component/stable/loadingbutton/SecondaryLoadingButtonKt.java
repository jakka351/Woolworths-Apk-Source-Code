package au.com.woolworths.design.core.ui.component.stable.loadingbutton;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal.LoadingButtonImplKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SecondaryLoadingButtonKt {
    public static final void a(String label, Function0 onClick, boolean z, Modifier modifier, String str, ButtonSpec.Size size, Composer composer, int i) {
        ButtonSpec.Size size2;
        ButtonSpec.Variant.Secondary secondary;
        String str2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-813862301);
        int i2 = i | (composerImplV.n(label) ? 4 : 2) | (composerImplV.I(onClick) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128) | 115040256;
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            str2 = str;
            size2 = size;
        } else {
            size2 = ButtonSpec.Size.g;
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new ButtonSpec.Variant.Secondary(true);
                composerImplV.A(objG);
            }
            ButtonSpec.Variant.Secondary secondary2 = (ButtonSpec.Variant.Secondary) objG;
            boolean z2 = false;
            composerImplV.V(false);
            long j = CoreTheme.b(composerImplV).f4782a.c.c.f4794a;
            composerImplV.o(-437595473);
            BorderStroke borderStrokeA = null;
            Color color = z ? new Color(CoreTheme.b(composerImplV).f4782a.f4783a.c.f4787a) : null;
            composerImplV.V(false);
            composerImplV.o(-437592055);
            Color color2 = z ? new Color(CoreTheme.b(composerImplV).f4782a.d.d.f4801a) : null;
            composerImplV.V(false);
            composerImplV.o(-437588942);
            if (z) {
                secondary = secondary2;
                borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composerImplV).f4782a.b.f4789a.f4790a, 1);
                z2 = false;
            } else {
                secondary = secondary2;
            }
            BorderStroke borderStroke = borderStrokeA;
            composerImplV.V(z2);
            LoadingButtonImplKt.a(label, z, null, null, secondary, null, size2, j, onClick, color, color2, borderStroke, "In progress", modifier, composerImplV, (i2 & 14) | 24576 | ((i2 >> 3) & 112) | 1772928 | ((i2 << 21) & 234881024), 3456);
            str2 = "In progress";
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(label, onClick, z, modifier, str2, size2, i);
        }
    }
}
