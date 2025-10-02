package com.woolworths.shop.product.ui.boost;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.woolworths.shop.product.ui.boost.ComposableSingletons$BoostingAnimationKt$lambda$-1404654380$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$BoostingAnimationKt$lambda$1404654380$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoostingAnimationKt.b(null, BoostingState.g, null, null, composer, 48, 13);
        }
        return Unit.f24250a;
    }
}
