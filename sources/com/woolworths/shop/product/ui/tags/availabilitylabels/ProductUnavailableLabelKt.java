package com.woolworths.shop.product.ui.tags.availabilitylabels;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.feature.shop.recipes.details.ui.a;
import com.woolworths.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductUnavailableLabelKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        ComposerImpl composerImplV = composer.v(121775016);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        }
        if ((i3 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            Modifier modifier2 = modifier;
            TagKt.b(StringResources_androidKt.c(composerImplV, R.string.product_tag_unavailable), TagSpec.Style.j, modifier2, null, null, null, composerImplV, ((i3 << 6) & 896) | 48, 120);
            modifier = modifier2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(modifier, i, i2, 8);
        }
    }
}
