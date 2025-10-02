package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.geolocation.location.LocationInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreMapActivity_MembersInjector implements MembersInjector<InstoreMapActivity> {
    public static void a(InstoreMapActivity instoreMapActivity, LocationInteractor locationInteractor) {
        instoreMapActivity.x = locationInteractor;
    }

    public static void b(InstoreMapActivity instoreMapActivity, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        instoreMapActivity.y = permissionFlagInteractorImpl;
    }
}
