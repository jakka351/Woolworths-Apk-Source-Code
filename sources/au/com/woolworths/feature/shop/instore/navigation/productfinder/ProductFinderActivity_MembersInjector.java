package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.geolocation.location.LocationInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ProductFinderActivity_MembersInjector implements MembersInjector<ProductFinderActivity> {
    public static void a(ProductFinderActivity productFinderActivity, LocationInteractor locationInteractor) {
        productFinderActivity.x = locationInteractor;
    }

    public static void b(ProductFinderActivity productFinderActivity, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        productFinderActivity.y = permissionFlagInteractorImpl;
    }
}
