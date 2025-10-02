package com.woolworths.shop.product.ui.boost;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.woolworths.shop.product.ui.boost.ComposableSingletons$BoostingAnimationKt$lambda$-646314323$1, reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$BoostingAnimationKt$lambda$646314323$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(SizeKt.u(SizeKt.g(Modifier.Companion.d, 23), 88), null, 0L, 0L, null, null, ComposableSingletons$BoostingAnimationKt.f23629a, composer, 62);
        }
        return Unit.f24250a;
    }
}
