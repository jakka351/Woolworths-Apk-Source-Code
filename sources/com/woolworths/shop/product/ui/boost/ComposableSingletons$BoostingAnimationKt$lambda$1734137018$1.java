package com.woolworths.shop.product.ui.boost;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$BoostingAnimationKt$lambda$1734137018$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BoostingAnimationKt$lambda$1734137018$1 d = new ComposableSingletons$BoostingAnimationKt$lambda$1734137018$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoostingAnimationKt.a(BoostingState.f, null, null, composer, 6, 6);
        }
        return Unit.f24250a;
    }
}
