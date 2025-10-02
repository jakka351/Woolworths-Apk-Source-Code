package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.compose.productsearch.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductNameKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String productName) {
        int i3;
        int i4;
        Modifier modifier2;
        Intrinsics.h(productName, "productName");
        ComposerImpl composerImplV = composer.v(976677777);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerImplV.n(productName) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i3 | 432;
        if ((i5 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            i4 = i;
            modifier2 = modifier;
        } else {
            float f = 4;
            Modifier.Companion companion = Modifier.Companion.d;
            TextKt.a(productName, CoreTheme.f(composerImplV).f5120a.b.f5123a, PaddingKt.i(companion, f, f, f, 8), 0L, null, 0, 2, false, 4, null, composerImplV, (i5 & 14) | 1572864 | ((i5 << 18) & 234881024), 696);
            i4 = 4;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(productName, modifier2, i4, i2, 9);
        }
    }
}
