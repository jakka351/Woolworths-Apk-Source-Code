package com.woolworths.shop.product.ui.boost;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ComposableSingletons$BoostingAnimationKt$lambda$1674713841$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BoostingAnimationKt$lambda$1674713841$1 d = new ComposableSingletons$BoostingAnimationKt$lambda$1674713841$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoostingState boostingState = BoostingState.d;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new com.woolworths.scanlibrary.domain.productsearch.a(23);
                composer.A(objG);
            }
            composer.l();
            BoostingAnimationKt.c(boostingState, null, (Function1) objG, composer, 390);
        }
        return Unit.f24250a;
    }
}
