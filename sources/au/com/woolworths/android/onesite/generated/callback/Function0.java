package au.com.woolworths.android.onesite.generated.callback;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$addressClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.databinding.ActivityMainBindingImpl;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.HomeOnlineShoppingModeVariantTileData;
import au.com.woolworths.feature.shop.homepage.data.ModeSelectorSubHeaderData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final ActivityMainBindingImpl d;

    public interface Listener {
    }

    public Function0(ActivityMainBindingImpl activityMainBindingImpl) {
        this.d = activityMainBindingImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableLiveData mutableLiveData;
        MainContract.ViewState viewState;
        ModeSelectorSubHeaderData modeSelectorSubHeaderData;
        HomeModeSelectorContainerData homeModeSelectorContainerData;
        HomeOnlineShoppingModeVariantTileData homeOnlineShoppingModeVariantTileData;
        MainViewModel mainViewModel = this.d.J;
        if (mainViewModel == null || (mutableLiveData = mainViewModel.w) == null || (viewState = (MainContract.ViewState) mutableLiveData.e()) == null) {
            return null;
        }
        MainContract.HeaderInfo headerInfo = viewState.e;
        CollectionMode collectionMode = headerInfo.c.f4362a.f4625a;
        String str = collectionMode instanceof CollectionMode.PickUp ? "Pick up Location" : collectionMode instanceof CollectionMode.InStore ? "In-store Location" : collectionMode instanceof CollectionMode.Delivery ? "Delivery Address" : "Not set";
        AnalyticsManager analyticsManager = mainViewModel.o;
        HomepageAnalytics.HomeScreen.Action.Companion companion = HomepageAnalytics.HomeScreen.Action.d;
        String addressToEdit = "Edit ".concat(str);
        companion.getClass();
        Intrinsics.h(addressToEdit, "addressToEdit");
        analyticsManager.g(new HomepageAnalytics$HomeScreen$Action$Companion$addressClick$1(addressToEdit));
        MainContract.FulfilmentWindowInfo fulfilmentWindowInfo = headerInfo.g;
        if (fulfilmentWindowInfo == null || (modeSelectorSubHeaderData = fulfilmentWindowInfo.c) == null || (homeModeSelectorContainerData = modeSelectorSubHeaderData.b) == null || (homeOnlineShoppingModeVariantTileData = homeModeSelectorContainerData.e) == null) {
            return null;
        }
        mainViewModel.v.onNext(new MainContract.Actions.LaunchDeepLink(homeOnlineShoppingModeVariantTileData.f7195a));
        return null;
    }
}
