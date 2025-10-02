package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import android.widget.ImageView;
import androidx.core.app.ActivityOptionsCompat;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyLegacyItemStoreLocatorLocationBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocationItem;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultContract;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.xwray.groupie.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PickUpLocationResultActivity e;

    public /* synthetic */ a(PickUpLocationResultActivity pickUpLocationResultActivity, int i) {
        this.d = i;
        this.e = pickUpLocationResultActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        PickUpLocationResultActivity pickUpLocationResultActivity = this.e;
        switch (i) {
            case 0:
                PickUpLocationResultContract.Actions actions = (PickUpLocationResultContract.Actions) obj;
                int i2 = PickUpLocationResultActivity.I;
                if (actions instanceof PickUpLocationResultContract.Actions.OpenStoreDetails) {
                    PickUpLocationItem pickUpLocationItem = ((PickUpLocationResultContract.Actions.OpenStoreDetails) actions).f8205a;
                    if (((PickUpLocationResultContract.ViewState) pickUpLocationResultActivity.R4().j.e()) != null) {
                        EpoxyLegacyItemStoreLocatorLocationBinding epoxyLegacyItemStoreLocatorLocationBinding = pickUpLocationItem.i;
                        if (epoxyLegacyItemStoreLocatorLocationBinding == null) {
                            Intrinsics.p("binding");
                            throw null;
                        }
                        ImageView shopIconImageView = epoxyLegacyItemStoreLocatorLocationBinding.A;
                        Intrinsics.g(shopIconImageView, "shopIconImageView");
                        Store store = pickUpLocationItem.g;
                        Intrinsics.h(store, "<this>");
                        ActivityOptionsCompat activityOptionsCompatB = ActivityOptionsCompat.b(pickUpLocationResultActivity, shopIconImageView, store.d);
                        int i3 = StoreDetailsActivity.y;
                        StoreDetailsActivity.Companion.a(pickUpLocationResultActivity, store, activityOptionsCompatB);
                    }
                }
                return unit;
            case 1:
                PickUpLocationResultContract.ViewState viewState = (PickUpLocationResultContract.ViewState) obj;
                int i4 = PickUpLocationResultActivity.I;
                if (viewState.f8206a == PickUpLocationResultContract.PageState.e) {
                    List list = viewState.c;
                    Section section = pickUpLocationResultActivity.G;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new PickUpLocationItem((Store) it.next(), new a(pickUpLocationResultActivity, 2)));
                    }
                    section.q(arrayList);
                }
                return unit;
            default:
                PickUpLocationItem pickUpLocationItem2 = (PickUpLocationItem) obj;
                int i5 = PickUpLocationResultActivity.I;
                Intrinsics.h(pickUpLocationItem2, "pickUpLocationItem");
                pickUpLocationResultActivity.R4().l.onNext(new PickUpLocationResultContract.Actions.OpenStoreDetails(pickUpLocationItem2));
                return unit;
        }
    }
}
