package com.woolworths.shop.product.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.woolworths.shop.product.ui.ComposableSingletons$ProductUnitPriceLabelKt$lambda$-624287576$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ProductUnitPriceLabelKt$lambda$624287576$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductUnitPriceLabelKt$lambda$624287576$1 d = new ComposableSingletons$ProductUnitPriceLabelKt$lambda$624287576$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductUnitPriceLabelKt.a(YU.a.g(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3).getUnitPriceDescription(), " and some very long descriptive text lorem ipsum"), null, 0L, 0, 0, false, composer, 48, 124);
        }
        return Unit.f24250a;
    }
}
