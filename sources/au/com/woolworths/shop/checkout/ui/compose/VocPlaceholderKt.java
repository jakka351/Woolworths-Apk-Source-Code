package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class VocPlaceholderKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier) {
        ComposerImpl composerImplV = composer.v(-792681777);
        if ((((composerImplV.r(i) ? 4 : 2) | i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            float fB = ((Density) composerImplV.x(CompositionLocalsKt.h)).B(i);
            Modifier.Companion companion = Modifier.Companion.d;
            SpacerKt.a(composerImplV, SizeKt.e(SizeKt.g(companion, fB), 1.0f));
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.a(i, modifier, i2, 6);
        }
    }
}
