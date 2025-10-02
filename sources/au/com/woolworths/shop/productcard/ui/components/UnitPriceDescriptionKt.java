package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UnitPriceDescriptionKt {
    public static final void a(TextWithAltData description, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.h(description, "description");
        ComposerImpl composerImplV = composer.v(-1900835841);
        int i2 = (composerImplV.n(description) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(5004770);
            boolean z = (i2 & 14) == 4;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new a(description, 3);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = Modifier.Companion.d;
            TextKt.a(description.f10170a, CoreTheme.f(composerImplV).f5120a.b.f5123a, SemanticsModifierKt.a(modifier2, (Function1) objG), CoreTheme.b(composerImplV).e.d.b, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(description, i, 0, modifier2);
        }
    }
}
