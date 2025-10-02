package com.woolworths.shop.product.ui.tags.promotional;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagKt;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsProductPromotionLabelKt {
    public static final void a(int i, Composer composer, Modifier modifier, final String label) {
        int i2;
        Intrinsics.h(label, "label");
        ComposerImpl composerImplV = composer.v(1188327661);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1546303024, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.tags.promotional.RewardsProductPromotionLabelKt$RewardsProductPromotionLabel$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TagKt.b(label, TagSpec.Style.h, Modifier.Companion.d, null, CoreTheme.e(composer2).g.w, null, composer2, 48, 104);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(label, modifier2, i, 11, (byte) 0);
        }
    }
}
