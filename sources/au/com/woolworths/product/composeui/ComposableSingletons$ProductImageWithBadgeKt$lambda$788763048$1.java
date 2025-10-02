package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductImageWithBadgeKt$lambda$788763048$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
            ProductImageWithBadgeKt.a(productCardB.getProductImage(), productCardB.getBadgeImage(), null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true, true, null, composer, 1769472, 156);
        }
        return Unit.f24250a;
    }
}
