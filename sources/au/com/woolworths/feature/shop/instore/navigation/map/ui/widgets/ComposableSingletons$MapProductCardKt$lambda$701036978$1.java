package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.ComposableSingletons$MapProductCardKt$lambda$-701036978$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$MapProductCardKt$lambda$701036978$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            MapProductCardKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 3), null, new DirectionAndDistanceIndicatorData(45.0f, 12.0f), composer, ProductCard.$stable, 2);
        }
        return Unit.f24250a;
    }
}
