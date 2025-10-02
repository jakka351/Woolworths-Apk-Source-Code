package com.woolworths.shop.product.ui.tags.promotional;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.woolworths.shop.product.ui.tags.promotional.ComposableSingletons$RewardsProductPromotionLabelKt$lambda$-219185305$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$RewardsProductPromotionLabelKt$lambda$219185305$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RewardsProductPromotionLabelKt.a(6, composer, null, "80 points");
        }
        return Unit.f24250a;
    }
}
