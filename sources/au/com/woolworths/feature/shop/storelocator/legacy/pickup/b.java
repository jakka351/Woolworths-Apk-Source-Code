package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.ActivityOptionsCompat;
import au.com.woolworths.android.onesite.ActivityRequestCode;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyLegacyItemStoreLocatorLocationBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.xwray.groupie.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PickUpLocatorActivity e;

    public /* synthetic */ b(PickUpLocatorActivity pickUpLocatorActivity, int i) {
        this.d = i;
        this.e = pickUpLocatorActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        int i2 = 2;
        Unit unit = Unit.f24250a;
        PickUpLocatorActivity pickUpLocatorActivity = this.e;
        switch (i) {
            case 0:
                PickUpLocatorContract.Actions actions = (PickUpLocatorContract.Actions) obj;
                int i3 = PickUpLocatorActivity.K;
                if (Intrinsics.c(actions, PickUpLocatorContract.Actions.SetFocusOnSearchView.f8181a)) {
                    ActivityPickUpLocatorBinding activityPickUpLocatorBinding = pickUpLocatorActivity.G;
                    if (activityPickUpLocatorBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    SearchView searchView = activityPickUpLocatorBinding.B.z;
                    if (searchView.requestFocus()) {
                        Object systemService = searchView.getContext().getSystemService("input_method");
                        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).toggleSoftInput(2, 1);
                    }
                } else if (Intrinsics.c(actions, PickUpLocatorContract.Actions.GoToSettings.f8177a)) {
                    ActivityExtKt.b(pickUpLocatorActivity);
                } else if (Intrinsics.c(actions, PickUpLocatorContract.Actions.TurnOnDeviceLocation.f8183a)) {
                    LocationsKt.a(pickUpLocatorActivity, pickUpLocatorActivity);
                } else if (Intrinsics.c(actions, PickUpLocatorContract.Actions.ShowPermissionsDialog.f8182a)) {
                    LocationsKt.e(pickUpLocatorActivity);
                } else if (actions instanceof PickUpLocatorContract.Actions.LaunchLocationResult) {
                    PickUpSuburb suburb = ((PickUpLocatorContract.Actions.LaunchLocationResult) actions).f8179a;
                    Intrinsics.h(suburb, "suburb");
                    Intent intent = new Intent(pickUpLocatorActivity, (Class<?>) PickUpLocationResultActivity.class);
                    intent.putExtra("extra_pick_up_suburb", suburb);
                    ActivityRequestCode[] activityRequestCodeArr = ActivityRequestCode.d;
                    pickUpLocatorActivity.startActivityForResult(intent, 0);
                } else if (actions instanceof PickUpLocatorContract.Actions.OpenStoreDetails) {
                    PickUpLocationItem pickUpLocationItem = ((PickUpLocatorContract.Actions.OpenStoreDetails) actions).f8180a;
                    if (((PickUpLocatorContract.ViewState) pickUpLocatorActivity.R4().k.e()) != null) {
                        EpoxyLegacyItemStoreLocatorLocationBinding epoxyLegacyItemStoreLocatorLocationBinding = pickUpLocationItem.i;
                        if (epoxyLegacyItemStoreLocatorLocationBinding == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        ImageView shopIconImageView = epoxyLegacyItemStoreLocatorLocationBinding.A;
                        Intrinsics.g(shopIconImageView, "shopIconImageView");
                        Store store = pickUpLocationItem.g;
                        Intrinsics.h(store, "<this>");
                        ActivityOptionsCompat activityOptionsCompatB = ActivityOptionsCompat.b(pickUpLocatorActivity, shopIconImageView, store.d);
                        int i4 = StoreDetailsActivity.y;
                        StoreDetailsActivity.Companion.a(pickUpLocatorActivity, store, activityOptionsCompatB);
                    }
                } else {
                    if (!Intrinsics.c(actions, PickUpLocatorContract.Actions.HideKeyboard.f8178a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Views.a(pickUpLocatorActivity);
                }
                return unit;
            case 1:
                PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) obj;
                int i5 = PickUpLocatorActivity.K;
                Intrinsics.e(viewState);
                LinkedHashMap linkedHashMap = pickUpLocatorActivity.I;
                int iOrdinal = viewState.f8184a.ordinal();
                EmptyList emptyList = EmptyList.d;
                if (iOrdinal == 1) {
                    Section section = (Section) linkedHashMap.get(PickUpLocatorContract.SectionType.f);
                    if (section != null) {
                        section.q(emptyList);
                    }
                    Section section2 = (Section) linkedHashMap.get(PickUpLocatorContract.SectionType.e);
                    if (section2 != null) {
                        List list = viewState.c;
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new PickUpLocationItem((Store) it.next(), new b(pickUpLocatorActivity, i2)));
                        }
                        section2.q(arrayList);
                    }
                } else if (iOrdinal == 2) {
                    Section section3 = (Section) linkedHashMap.get(PickUpLocatorContract.SectionType.e);
                    if (section3 != null) {
                        section3.q(emptyList);
                    }
                    Section section4 = (Section) linkedHashMap.get(PickUpLocatorContract.SectionType.f);
                    if (section4 != null) {
                        List list2 = viewState.d;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new PickUpSuburbItem((PickUpSuburb) it2.next(), pickUpLocatorActivity.R4()));
                        }
                        section4.q(arrayList2);
                    }
                }
                return unit;
            default:
                PickUpLocationItem pickUpStoreItem = (PickUpLocationItem) obj;
                int i6 = PickUpLocatorActivity.K;
                Intrinsics.h(pickUpStoreItem, "pickUpStoreItem");
                pickUpLocatorActivity.R4().l.onNext(new PickUpLocatorContract.Actions.OpenStoreDetails(pickUpStoreItem));
                return unit;
        }
    }
}
