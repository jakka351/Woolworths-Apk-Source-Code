package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$ProductMultiBuyLabelKt$lambda$1820981442$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMultiBuyLabelKt$lambda$1820981442$1 d = new ComposableSingletons$ProductMultiBuyLabelKt$lambda$1820981442$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductMultiBuyLabelKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, "Member Price 123 for $4567.89", null, null, null, null, null, null, null, null, null, null, null, -4097, 3), null, null, composer, ProductCard.$stable, 14);
        }
        return Unit.f24250a;
    }
}
