package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.ComposableSingletons$OrderCollectionDetailsItemKt$lambda$-2025359062$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$OrderCollectionDetailsItemKt$lambda$2025359062$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            OrderCollectionDetailsItemKt.a("Direct to Boot", "Order placed into your car boot", "Parking guide", null, new OrderCollectionParkingDetails("https://wowuatmediaaae.blob.core.windows.net/content/areadeliverymethodmap/2663.png", CollectionsKt.R("Enter the basement car park from Erin Street", "Follow the directional signage", "You'll find the parking bays near the escalator")), null, composer, 438, 40);
        }
        return Unit.f24250a;
    }
}
