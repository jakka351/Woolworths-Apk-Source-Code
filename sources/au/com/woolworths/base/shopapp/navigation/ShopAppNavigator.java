package au.com.woolworths.base.shopapp.navigation;

import android.app.Activity;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.AddressableActivity;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/navigation/ShopAppNavigator;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppNavigator {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f4629a;
    public final Activity b;

    public ShopAppNavigator(FeatureToggleManager featureToggleManager, Activity activity) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(activity, "activity");
        this.f4629a = featureToggleManager;
        this.b = activity;
    }

    public static void b(Activity activity, Activities.StoreLocatorLegacy.ExtraStoreLocatorData extraStoreLocatorData, int i) {
        activity.startActivityForResult(ActivityNavigatorKt.a(Activities.StoreLocatorLegacy.f4548a, ApplicationType.e).putExtra("EXTRA_STORE_LOCATOR_DATA", extraStoreLocatorData), i);
    }

    public static void e(Activity activity, Activities.StoreLocator.ExtraStoreLocatorData extraStoreLocatorData, int i) {
        Intrinsics.h(activity, "activity");
        activity.startActivityForResult(ActivityNavigatorKt.a(Activities.StoreLocator.f4547a, ApplicationType.e).putExtra("EXTRA_STORE_LOCATOR_DATA", extraStoreLocatorData), i);
    }

    public final void a() {
        AddressableActivity addressableActivity;
        boolean zC = this.f4629a.c(BaseShopAppFeature.V);
        if (zC) {
            addressableActivity = Activities.BarcodeScanner.f4449a;
        } else {
            if (zC) {
                throw new NoWhenBranchMatchedException();
            }
            addressableActivity = Activities.BarcodeScannerLegacy.f4450a;
        }
        this.b.startActivity(ActivityNavigatorKt.a(addressableActivity, ApplicationType.e));
    }

    public final void c(Parcelable parcelable) {
        this.b.startActivity(Activities.OriientInstoreMapActivity.b(parcelable != null ? CollectionsKt.Q(parcelable) : EmptyList.d));
    }

    public final void d(String productId) throws NumberFormatException {
        Intrinsics.h(productId, "productId");
        ShopRemoteConfig shopRemoteConfig = ShopRemoteConfig.s;
        FeatureToggleManager featureToggleManager = this.f4629a;
        boolean z = false;
        int i = Integer.parseInt(featureToggleManager.e(shopRemoteConfig, false));
        Integer numI0 = StringsKt.i0(productId);
        boolean z2 = (numI0 != null ? numI0.intValue() : 0) <= i;
        boolean zC = featureToggleManager.c(BaseShopAppFeature.G);
        boolean zC2 = featureToggleManager.c(BaseShopAppFeature.q);
        boolean z3 = zC && z2;
        if (zC && zC2) {
            z = true;
        }
        Activity activity = this.b;
        if (z3 || z) {
            activity.startActivity(Activities.ProductDetailsActivity.f4503a.b(productId));
        } else {
            Activities.LegacyProductDetails.f4484a.c(activity, productId);
        }
    }
}
