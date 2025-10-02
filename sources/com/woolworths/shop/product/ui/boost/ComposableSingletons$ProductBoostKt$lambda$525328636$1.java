package com.woolworths.shop.product.ui.boost;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.woolworths.shop.product.ui.boost.ComposableSingletons$ProductBoostKt$lambda$-525328636$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ProductBoostKt$lambda$525328636$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductBoostKt.a("Add to cart to Boost. Ends 31 Dec", null, false, null, null, null, composer, 54, 124);
        }
        return Unit.f24250a;
    }
}
