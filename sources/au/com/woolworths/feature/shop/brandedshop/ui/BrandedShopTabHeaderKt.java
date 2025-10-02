package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt;
import au.com.woolworths.shop.aem.components.ui.tab.TabRowStyle;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandedShopTabHeaderKt {
    public static final void a(ArrayList arrayList, int i, g gVar, Composer composer, int i2) {
        ComposerImpl composerImplV = composer.v(-11883722);
        int i3 = (composerImplV.I(arrayList) ? 4 : 2) | i2 | (composerImplV.r(i) ? 32 : 16) | (composerImplV.I(gVar) ? 256 : 128);
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TabItemsKt.b(arrayList, gVar, i, null, arrayList.size() > 2 ? TabRowStyle.e : TabRowStyle.d, null, composerImplV, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 40);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(arrayList, i, gVar, i2, 20);
        }
    }
}
