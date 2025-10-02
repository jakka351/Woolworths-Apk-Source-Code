package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductPricingFootnoteLabelKt$lambda$783931816$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductPricingFootnoteLabelKt$lambda$783931816$1 d = new ComposableSingletons$ProductPricingFootnoteLabelKt$lambda$783931816$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductPricingFootnoteLabelKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1), Modifier.Companion.d, true, composer, 432, 0);
        }
        return Unit.f24250a;
    }
}
