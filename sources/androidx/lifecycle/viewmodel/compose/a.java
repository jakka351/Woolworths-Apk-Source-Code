package androidx.lifecycle.viewmodel.compose;

import android.content.Intent;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.os.compose.LocalSavedStateRegistryOwnerKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsExtraContent;
import au.com.woolworths.analytics.model.AnalyticsExtraContent$$serializer;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetFit;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkDispatchDefinition;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Activities.ComposeProductListLegacy composeProductListLegacy = Activities.ComposeProductListLegacy.f4460a;
        Activities.MainActivity mainActivity = Activities.MainActivity.f4487a;
        switch (i) {
            case 0:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalViewModelStoreOwner.f2816a;
                return null;
            case 1:
                ProvidableCompositionLocal providableCompositionLocal = LocalSavedStateRegistryOwnerKt.f3733a;
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                AnalyticsData.Companion companion = AnalyticsData.INSTANCE;
                return new ArrayListSerializer(AnalyticsExtraContent$$serializer.f4019a);
            case 3:
                AnalyticsExtraContent.Companion companion2 = AnalyticsExtraContent.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 4:
                DownloadableAsset.Companion companion3 = DownloadableAsset.INSTANCE;
                return EnumsKt.b(DownloadableAssetType.values(), "au.com.woolworths.android.onesite.data.DownloadableAssetType");
            case 5:
                DownloadableAsset.Companion companion4 = DownloadableAsset.INSTANCE;
                return EnumsKt.b(DownloadableAssetFit.values(), "au.com.woolworths.android.onesite.data.DownloadableAssetFit");
            case 6:
                return mainActivity.c(Activities.MainActivity.Tab.e, null);
            case 7:
                return ActivityNavigatorKt.a(Activities.CheckoutActivity.f4457a, ApplicationType.e);
            case 8:
                return ActivityNavigatorKt.a(Activities.MyOrders.f4491a, ApplicationType.e);
            case 9:
                Intent intentA = ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e);
                intentA.putExtra("EXTRA_AUTH_CONFIG", new Activities.Authentication.Extras(1));
                return intentA;
            case 10:
                return ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e);
            case 11:
                return ActivityNavigatorKt.a(Activities.ModeSelectorActivity.f4490a, ApplicationType.e);
            case 12:
                return ActivityNavigatorKt.a(Activities.DeliveryUnlimitedSignUpLanding.f4468a, ApplicationType.e);
            case 13:
                return ActivityNavigatorKt.a(Activities.ProductFinderActivity.f4504a, ApplicationType.e);
            case 14:
                return mainActivity.c(Activities.MainActivity.Tab.d, null);
            case 15:
                return mainActivity.c(Activities.MainActivity.Tab.e, null);
            case 16:
                return mainActivity.c(Activities.MainActivity.Tab.e, null);
            case 17:
                return mainActivity.c(Activities.MainActivity.Tab.e, null);
            case 18:
                return ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e);
            case 19:
                CollectionMode.InStore collectionMode = CollectionMode.InStore.d;
                Intrinsics.h(collectionMode, "collectionMode");
                Intent intentPutExtra = mainActivity.b().putExtra("EXTRA_COLLECTION_MODE", collectionMode);
                Intrinsics.g(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 20:
                return ActivityNavigatorKt.a(Activities.BuyAgainActivity.f4453a, ApplicationType.e);
            case 21:
                return mainActivity.c(Activities.MainActivity.Tab.h, null);
            case 22:
                return composeProductListLegacy.c(Activities.ProductList.ProductListType.H);
            case 23:
                return ActivityNavigatorKt.a(Activities.ShopReceiptListActivity.f4533a, ApplicationType.e);
            case 24:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.q, "", null);
            case 25:
                return composeProductListLegacy.c(Activities.ProductList.ProductListType.I);
            case 26:
                return ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e);
            case 27:
                return mainActivity.c(Activities.MainActivity.Tab.f, null);
            case 28:
                return Activities.PreferencesDetails.f4501a.b();
            default:
                return ActivityNavigatorKt.a(Activities.InstoreWifiActivity.f4482a, ApplicationType.e);
        }
    }
}
