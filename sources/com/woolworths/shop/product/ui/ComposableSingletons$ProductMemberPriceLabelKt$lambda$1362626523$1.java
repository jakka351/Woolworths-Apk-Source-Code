package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ProductMemberPriceLabelKt$lambda$1362626523$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMemberPriceLabelKt$lambda$1362626523$1 d = new ComposableSingletons$ProductMemberPriceLabelKt$lambda$1362626523$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductMemberPriceLabelKt.b("Member Price", "2 for $88.88", null, "$88.88 per 1KG", ProductMemberPriceLabelStyling.e, composer, 27702, 4);
        }
        return Unit.f24250a;
    }
}
