package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductUnitPriceLabelKt$lambda$2077501439$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductUnitPriceLabelKt$lambda$2077501439$1 d = new ComposableSingletons$ProductUnitPriceLabelKt$lambda$2077501439$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductUnitPriceLabelKt.a("10.50 per 1kg\n$4.40 / tray (approx)", null, null, 0L, 2, 0, 5, false, composer, 24630, 172);
        }
        return Unit.f24250a;
    }
}
