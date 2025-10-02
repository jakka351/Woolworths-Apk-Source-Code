package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupLocationTrackingStatus;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingStatusImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$LocationTrackingStatusItemKt$lambda$1689490844$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            LocationTrackingStatusItemKt.a(new CurrentPickupLocationTrackingStatus("Sharing your estimated arrival time", "Leave the app open so we know you’re near. You can change your location permissions at any time in the Settings app.", LocationTrackingStatusImage.e), composer, 0);
        }
        return Unit.f24250a;
    }
}
