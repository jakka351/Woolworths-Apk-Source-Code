package au.com.woolworths.shop.product.details.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.product.details.ui.ComposableSingletons$ProductNameKt$lambda$-1841753062$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductNameKt$lambda$1841753062$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ScaffoldKt.a(null, null, null, null, 0L, null, ComposableSingletons$ProductNameKt.f12628a, composer, 12582912, 127);
        }
        return Unit.f24250a;
    }
}
