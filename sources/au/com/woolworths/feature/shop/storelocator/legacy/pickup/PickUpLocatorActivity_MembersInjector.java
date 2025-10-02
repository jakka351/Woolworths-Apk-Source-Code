package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.geolocation.location.LocationInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PickUpLocatorActivity_MembersInjector implements MembersInjector<PickUpLocatorActivity> {
    public static void a(PickUpLocatorActivity pickUpLocatorActivity, FeatureToggleManager featureToggleManager) {
        pickUpLocatorActivity.E = featureToggleManager;
    }

    public static void b(PickUpLocatorActivity pickUpLocatorActivity, LocationInteractor locationInteractor) {
        pickUpLocatorActivity.C = locationInteractor;
    }

    public static void c(PickUpLocatorActivity pickUpLocatorActivity, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        pickUpLocatorActivity.D = permissionFlagInteractorImpl;
    }

    public static void d(PickUpLocatorActivity pickUpLocatorActivity, SchedulersProvider schedulersProvider) {
        pickUpLocatorActivity.B = schedulersProvider;
    }
}
