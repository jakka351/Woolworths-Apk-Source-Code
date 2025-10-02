package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PickUpLocationResultActivity_MembersInjector implements MembersInjector<PickUpLocationResultActivity> {
    public static void a(PickUpLocationResultActivity pickUpLocationResultActivity, FeatureToggleManager featureToggleManager) {
        pickUpLocationResultActivity.C = featureToggleManager;
    }

    public static void b(PickUpLocationResultActivity pickUpLocationResultActivity, SchedulersProvider schedulersProvider) {
        pickUpLocationResultActivity.B = schedulersProvider;
    }
}
