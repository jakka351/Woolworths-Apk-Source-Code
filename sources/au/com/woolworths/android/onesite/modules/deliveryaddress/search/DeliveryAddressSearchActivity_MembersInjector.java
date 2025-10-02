package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class DeliveryAddressSearchActivity_MembersInjector implements MembersInjector<DeliveryAddressSearchActivity> {
    public static void a(DeliveryAddressSearchActivity deliveryAddressSearchActivity, ShopAccountInteractor shopAccountInteractor) {
        deliveryAddressSearchActivity.B = shopAccountInteractor;
    }

    public static void b(DeliveryAddressSearchActivity deliveryAddressSearchActivity, FeatureToggleManager featureToggleManager) {
        deliveryAddressSearchActivity.D = featureToggleManager;
    }

    public static void c(DeliveryAddressSearchActivity deliveryAddressSearchActivity, SchedulersProvider schedulersProvider) {
        deliveryAddressSearchActivity.C = schedulersProvider;
    }
}
