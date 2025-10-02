package au.com.woolworths.feature.shop.storelocator.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.analytics.adobe.data.StoreSearchData;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorEventHandler;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreLocatorViewModel extends ViewModel implements StoreLocatorEventHandler, FullPageErrorStateClickHandler {
    public final LegacyStoreLocatorInteractorImpl e;
    public final LocationInteractor f;
    public final LegacyShopAnalyticsManager g;
    public final NetworkExceptions h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final SharedFlowImpl k;
    public String l;
    public final Flow m;
    public final MutableLiveData n;
    public final MutableLiveData o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorViewModel$Companion;", "", "", "MINIMUM_SEARCH_THRESHOLD", "I", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8166a;

        static {
            int[] iArr = new int[StoreLocatorFullPageErrorState.values().length];
            try {
                StoreLocatorFullPageErrorState storeLocatorFullPageErrorState = StoreLocatorFullPageErrorState.d;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StoreLocatorFullPageErrorState storeLocatorFullPageErrorState2 = StoreLocatorFullPageErrorState.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StoreLocatorFullPageErrorState storeLocatorFullPageErrorState3 = StoreLocatorFullPageErrorState.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StoreLocatorFullPageErrorState storeLocatorFullPageErrorState4 = StoreLocatorFullPageErrorState.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                StoreLocatorFullPageErrorState storeLocatorFullPageErrorState5 = StoreLocatorFullPageErrorState.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8166a = iArr;
        }
    }

    public StoreLocatorViewModel(LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, LocationInteractor locationInteractor, LegacyShopAnalyticsManager analyticsManager, NetworkExceptions networkExceptions) {
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(networkExceptions, "networkExceptions");
        this.e = legacyStoreLocatorInteractorImpl;
        this.f = locationInteractor;
        this.g = analyticsManager;
        this.h = networkExceptions;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.i = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.j = mutableLiveData2;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.k = sharedFlowImplB;
        this.l = "";
        this.m = FlowKt.a(sharedFlowImplB);
        this.n = mutableLiveData;
        this.o = mutableLiveData2;
    }

    public static void t6(StoreLocatorViewModel storeLocatorViewModel, MutableLiveData mutableLiveData, boolean z, StoreLocatorContract.StoreListDisplayMode storeListDisplayMode, List list, StoreLocatorFullPageErrorState storeLocatorFullPageErrorState, int i) {
        StoreLocatorContract.ViewState viewState;
        List list2;
        List list3;
        StoreLocatorContract.StoreListDisplayMode storeListDisplayMode2;
        if ((i & 1) != 0) {
            StoreLocatorContract.ViewState viewState2 = (StoreLocatorContract.ViewState) storeLocatorViewModel.n.e();
            z = viewState2 != null ? viewState2.f8164a : false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            StoreLocatorContract.ViewState viewState3 = (StoreLocatorContract.ViewState) storeLocatorViewModel.n.e();
            if (viewState3 == null || (storeListDisplayMode2 = viewState3.b) == null) {
                storeListDisplayMode2 = StoreLocatorContract.StoreListDisplayMode.d;
            }
            storeListDisplayMode = storeListDisplayMode2;
        }
        StoreLocatorContract.StoreListDisplayMode storeListDisplayMode3 = storeListDisplayMode;
        int i2 = i & 4;
        List list4 = EmptyList.d;
        if (i2 != 0) {
            StoreLocatorContract.ViewState viewState4 = (StoreLocatorContract.ViewState) storeLocatorViewModel.n.e();
            list = (viewState4 == null || (list3 = viewState4.c) == null) ? list4 : list3;
        }
        List list5 = list;
        if ((i & 8) != 0 && (viewState = (StoreLocatorContract.ViewState) storeLocatorViewModel.n.e()) != null && (list2 = viewState.d) != null) {
            list4 = list2;
        }
        List list6 = list4;
        if ((i & 16) != 0) {
            StoreLocatorContract.ViewState viewState5 = (StoreLocatorContract.ViewState) storeLocatorViewModel.n.e();
            storeLocatorFullPageErrorState = viewState5 != null ? viewState5.e : null;
        }
        storeLocatorViewModel.getClass();
        mutableLiveData.m(new StoreLocatorContract.ViewState(z2, storeListDisplayMode3, list5, list6, storeLocatorFullPageErrorState));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState;
        MutableLiveData mutableLiveData = this.n;
        StoreLocatorContract.ViewState viewState = (StoreLocatorContract.ViewState) mutableLiveData.e();
        String strName = null;
        StoreLocatorFullPageErrorState storeLocatorFullPageErrorState2 = viewState != null ? viewState.e : null;
        int i = storeLocatorFullPageErrorState2 == null ? -1 : WhenMappings.f8166a[storeLocatorFullPageErrorState2.ordinal()];
        SharedFlowImpl sharedFlowImpl = this.k;
        if (i == 1) {
            sharedFlowImpl.f(StoreLocatorContract.Actions.ShowPermissionsDialog.f8160a);
            return;
        }
        if (i == 2) {
            sharedFlowImpl.f(StoreLocatorContract.Actions.GoToSettings.f8157a);
            return;
        }
        if (i == 3) {
            sharedFlowImpl.f(StoreLocatorContract.Actions.TurnOnDeviceLocation.f8162a);
            return;
        }
        if (i == 4) {
            r6();
            return;
        }
        if (i == 5) {
            r6();
            return;
        }
        StoreLocatorContract.ViewState viewState2 = (StoreLocatorContract.ViewState) mutableLiveData.e();
        if (viewState2 != null && (storeLocatorFullPageErrorState = viewState2.e) != null) {
            strName = storeLocatorFullPageErrorState.name();
        }
        throw new IllegalStateException(YU.a.h("Unrecognised error state ", strName, " action is clicked"));
    }

    public final void p6() {
        LocationInteractor locationInteractor = this.f;
        boolean zB = LocationsKt.b(locationInteractor.f8946a);
        MutableLiveData mutableLiveData = this.i;
        if (!zB) {
            t6(this, mutableLiveData, false, null, null, locationInteractor.e() ? StoreLocatorFullPageErrorState.g : StoreLocatorFullPageErrorState.f, 15);
        } else if (!locationInteractor.d()) {
            t6(this, mutableLiveData, false, null, null, StoreLocatorFullPageErrorState.d, 15);
        } else {
            t6(this, mutableLiveData, true, null, null, null, 14);
            BuildersKt.c(ViewModelKt.a(this), null, null, new StoreLocatorViewModel$fetchStoresByLocation$1(this, null), 3);
        }
    }

    public final void q6(StoreLocatorContract.StoreListDisplayMode storeListDisplayMode) {
        StoreLocatorContract.ViewState viewState = (StoreLocatorContract.ViewState) this.n.e();
        if ((viewState != null ? viewState.b : null) == storeListDisplayMode) {
            return;
        }
        t6(this, this.i, false, storeListDisplayMode, null, null, 29);
        ActionData actionDataA = ActionData.Companion.a(storeListDisplayMode == StoreLocatorContract.StoreListDisplayMode.d ? "storeSelectorDidSelectListMode" : "storeSelectorDidSelectMapMode");
        actionDataA.b = "Store Selector screen";
        actionDataA.c = "1";
        this.g.d(actionDataA);
    }

    public final void r6() {
        if (StringsKt.D(this.l)) {
            p6();
        } else {
            s6(this.l);
        }
    }

    public final void s6(String str) {
        StoreSearchData storeSearchData = new StoreSearchData("Search a Store");
        storeSearchData.b = "Store Selector screen";
        storeSearchData.c = "1";
        storeSearchData.d = "1";
        String storeName = StringsKt.k0(str).toString();
        Intrinsics.h(storeName, "storeName");
        storeSearchData.f = storeName;
        this.g.d(storeSearchData);
        t6(this, this.i, true, null, null, null, 14);
        BuildersKt.c(ViewModelKt.a(this), null, null, new StoreLocatorViewModel$searchStores$1(str, this, null), 3);
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEventHandler
    public final void w(PickUpSuburb suburb) {
        Intrinsics.h(suburb, "suburb");
        s6(suburb.f);
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorEventHandler
    public final void x(Store store) {
        Intrinsics.h(store, "store");
        this.k.f(new StoreLocatorContract.Actions.OpenStoreDetails(store));
        StoreSearchData storeSearchData = new StoreSearchData("Select a Searched store");
        storeSearchData.b = "Store Selector screen";
        storeSearchData.c = "1";
        storeSearchData.e = "1";
        String storeName = store.f;
        Intrinsics.h(storeName, "storeName");
        storeSearchData.f = storeName;
        this.g.d(storeSearchData);
    }
}
