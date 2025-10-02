package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductPanelUiKt$lambda$895439694$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductPanelUiKt$lambda$895439694$1 d = new ComposableSingletons$ProductPanelUiKt$lambda$895439694$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductPanelUiKt.a(ProductCardPreviewDataKt.b(null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, null, -513, 3), null, composer, ProductCard.$stable, 2);
        }
        return Unit.f24250a;
    }
}
