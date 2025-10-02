package au.com.woolworths.shop.productcard.ui.components;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.productcard.ui.components.ComposableSingletons$HeadlinePriceKt$lambda$-63206890$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HeadlinePriceKt$lambda$63206890$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            HeadlinePriceKt.a(null, null, "0", "33", "/Kg", 0L, composer, 28032, 35);
        }
        return Unit.f24250a;
    }
}
