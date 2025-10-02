package au.com.woolworths.feature.shop.myorders.details.location;

import androidx.compose.runtime.Composer;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.myorders.details.models.LocationImage;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPageRationale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.myorders.details.location.ComposableSingletons$RequestLocationPermissionPrimingDialogContentKt$lambda$-1708244383$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$RequestLocationPermissionPrimingDialogContentKt$lambda$1708244383$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RequestLocationPermissionPrimingDialogContentKt.c("Turn on location to share your arrival time", CollectionsKt.R(new LocationTrackingPrimingPageRationale(false, LocationImage.e, "Sharing your location lets us calculate your estimated arrival time"), new LocationTrackingPrimingPageRationale(false, LocationImage.f, "To protect your privacy, tracking will stop once you let us know you've arrived"), new LocationTrackingPrimingPageRationale(false, LocationImage.g, "Select the **\"While using the app\"** option for the best experience")), CollectionsKt.Q(new ButtonApiData("Set location permissions", null, null, true, null, null, null, null, null, 502, null)), "You can change this at anytime in the Settings app", null, composer, 3078, 16);
        }
        return Unit.f24250a;
    }
}
