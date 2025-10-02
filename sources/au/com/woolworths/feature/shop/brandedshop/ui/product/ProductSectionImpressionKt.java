package au.com.woolworths.feature.shop.brandedshop.ui.product;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"brandedshop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductSectionImpressionKt {
    public static final void a(String key, ProductSectionData productSectionData, ListItemsTrackerState listItemsTrackerState, Composer composer, int i) {
        Intrinsics.h(key, "key");
        ComposerImpl composerImplV = composer.v(1572649998);
        int i2 = (composerImplV.n(key) ? 4 : 2) | i | (composerImplV.I(productSectionData) ? 32 : 16) | (composerImplV.n(listItemsTrackerState) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1746271574);
            boolean z = true;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            if ((i2 & 112) != 32 && !composerImplV.I(productSectionData)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new ProductSectionImpressionKt$ProductSectionImpression$1$1(listItemsTrackerState, key, productSectionData, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, key, (Function2) objG);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(key, productSectionData, listItemsTrackerState, i, 15);
        }
    }
}
