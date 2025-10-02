package au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses;

import au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesContract;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ManageFullDeliveryAddressesActivity_MembersInjector implements MembersInjector<ManageFullDeliveryAddressesActivity> {
    public static void a(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity, ManageFullDeliveryAddressesContract.Presenter presenter) {
        manageFullDeliveryAddressesActivity.B = presenter;
    }

    public static void b(ManageFullDeliveryAddressesActivity manageFullDeliveryAddressesActivity, ShopAccountInteractor shopAccountInteractor) {
        manageFullDeliveryAddressesActivity.C = shopAccountInteractor;
    }
}
