package au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wpay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SectionTitleItemKt {
    public static final void a(int i, Composer composer, Modifier modifier, String title) {
        Modifier modifier2;
        Intrinsics.h(title, "title");
        ComposerImpl composerImplV = composer.v(674362384);
        int i2 = (composerImplV.n(title) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            TextKt.b(title, null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.b, composerImplV, i2 & 14, 0, 65530);
            composerImplV = composerImplV;
            modifier2 = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.g(modifier2, 16));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(title, modifier2, i, 10);
        }
    }
}
