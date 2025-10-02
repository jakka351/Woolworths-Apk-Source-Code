package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.AisleSide;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductInfoGridKt$lambda$1001695567$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductInfoGridKt$lambda$1001695567$1 d = new ComposableSingletons$ProductInfoGridKt$lambda$1001695567$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InStoreLocationType inStoreLocationType = InStoreLocationType.AVAILABLE;
            ProductInfoGridKt.a(ProductCardPreviewDataKt.b(null, "Woolworths NZ Chicken 0.8-1.3kg 2-3pcs", null, "10.50 per 1kg\n$4.40 / tray (approx)", false, null, null, null, new InstoreDetailsData("Aisle 6", inStoreLocationType), null, null, null, null, null, null, null, new InStoreLocationData(new InstoreLocationDetailsData(6, AisleSide.RIGHT, "CENTRE OF STORE", 18, null, 1, 1.0d, 1.0d, 1.0d), new InstoreDetailsData("Aisle 6", inStoreLocationType)), 2013130493, 1), false, null, false, false, null, false, false, false, false, false, false, 2, false, null, true, true, null, false, composer, 48, 1769856, 421884);
        }
        return Unit.f24250a;
    }
}
