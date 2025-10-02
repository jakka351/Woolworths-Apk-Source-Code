package au.com.woolworths.feature.shop.storelocator.legacy;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.dynatrace.android.callback.Callback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorContract$ViewState;", "", "eventHandler", "Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorEventHandler;", "<init>", "(Lau/com/woolworths/feature/shop/storelocator/legacy/StoreLocatorEventHandler;)V", "buildModels", "", "viewState", "queryText", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreLocatorEpoxyController extends Typed2EpoxyController<StoreLocatorContract.ViewState, String> {
    public static final int $stable = 8;

    @NotNull
    private final StoreLocatorEventHandler eventHandler;

    public StoreLocatorEpoxyController(@NotNull StoreLocatorEventHandler eventHandler) {
        Intrinsics.h(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(StoreLocatorEpoxyController storeLocatorEpoxyController, LegacyItemStoreLocatorLocationBindingModel_ legacyItemStoreLocatorLocationBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        dataBindingHolder.f13309a.h.setOnClickListener(new androidx.navigation.ui.a(12, storeLocatorEpoxyController, legacyItemStoreLocatorLocationBindingModel_));
    }

    private static final void buildModels$lambda$3$lambda$2$lambda$1$lambda$0(StoreLocatorEpoxyController storeLocatorEpoxyController, LegacyItemStoreLocatorLocationBindingModel_ legacyItemStoreLocatorLocationBindingModel_, View view) {
        StoreLocatorEventHandler storeLocatorEventHandler = storeLocatorEpoxyController.eventHandler;
        Store store = legacyItemStoreLocatorLocationBindingModel_.o;
        Intrinsics.g(store, "location(...)");
        storeLocatorEventHandler.x(store);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$6$lambda$5(StoreLocatorEpoxyController storeLocatorEpoxyController, ItemStoreLocatorSuburbMatchBindingModel_ itemStoreLocatorSuburbMatchBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        dataBindingHolder.f13309a.h.setOnClickListener(new androidx.navigation.ui.a(13, storeLocatorEpoxyController, itemStoreLocatorSuburbMatchBindingModel_));
    }

    private static final void buildModels$lambda$7$lambda$6$lambda$5$lambda$4(StoreLocatorEpoxyController storeLocatorEpoxyController, ItemStoreLocatorSuburbMatchBindingModel_ itemStoreLocatorSuburbMatchBindingModel_, View view) {
        StoreLocatorEventHandler storeLocatorEventHandler = storeLocatorEpoxyController.eventHandler;
        PickUpSuburb pickUpSuburb = itemStoreLocatorSuburbMatchBindingModel_.o;
        Intrinsics.g(pickUpSuburb, "suburb(...)");
        storeLocatorEventHandler.w(pickUpSuburb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$buildModels$lambda$3$lambda$2$lambda$1$-Lau-com-woolworths-feature-shop-storelocator-legacy-StoreLocatorEpoxyController-Lau-com-woolworths-feature-shop-storelocator-legacy-LegacyItemStoreLocatorLocationBindingModel_-Lcom-airbnb-epoxy-DataBindingEpoxyModel$DataBindingHolder-I-V, reason: not valid java name */
    public static /* synthetic */ void m46x46acdfdd(StoreLocatorEpoxyController storeLocatorEpoxyController, LegacyItemStoreLocatorLocationBindingModel_ legacyItemStoreLocatorLocationBindingModel_, View view) {
        Callback.g(view);
        try {
            buildModels$lambda$3$lambda$2$lambda$1$lambda$0(storeLocatorEpoxyController, legacyItemStoreLocatorLocationBindingModel_, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$buildModels$lambda$7$lambda$6$lambda$5$-Lau-com-woolworths-feature-shop-storelocator-legacy-StoreLocatorEpoxyController-Lau-com-woolworths-feature-shop-storelocator-legacy-ItemStoreLocatorSuburbMatchBindingModel_-Lcom-airbnb-epoxy-DataBindingEpoxyModel$DataBindingHolder-I-V, reason: not valid java name */
    public static /* synthetic */ void m47xf5329d11(StoreLocatorEpoxyController storeLocatorEpoxyController, ItemStoreLocatorSuburbMatchBindingModel_ itemStoreLocatorSuburbMatchBindingModel_, View view) {
        Callback.g(view);
        try {
            buildModels$lambda$7$lambda$6$lambda$5$lambda$4(storeLocatorEpoxyController, itemStoreLocatorSuburbMatchBindingModel_, view);
        } finally {
            Callback.h();
        }
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(@NotNull StoreLocatorContract.ViewState viewState, @NotNull String queryText) {
        Intrinsics.h(viewState, "viewState");
        List<PickUpSuburb> list = viewState.d;
        Intrinsics.h(queryText, "queryText");
        List<Store> list2 = viewState.c;
        if (!list2.isEmpty()) {
            for (Store store : list2) {
                LegacyItemStoreLocatorLocationBindingModel_ legacyItemStoreLocatorLocationBindingModel_ = new LegacyItemStoreLocatorLocationBindingModel_();
                legacyItemStoreLocatorLocationBindingModel_.M("store_" + store.d);
                legacyItemStoreLocatorLocationBindingModel_.t();
                legacyItemStoreLocatorLocationBindingModel_.o = store;
                f fVar = new f(this, 0);
                legacyItemStoreLocatorLocationBindingModel_.t();
                legacyItemStoreLocatorLocationBindingModel_.n = fVar;
                add(legacyItemStoreLocatorLocationBindingModel_);
            }
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (PickUpSuburb pickUpSuburb : list) {
            ItemStoreLocatorSuburbMatchBindingModel_ itemStoreLocatorSuburbMatchBindingModel_ = new ItemStoreLocatorSuburbMatchBindingModel_();
            String str = pickUpSuburb.f;
            String str2 = pickUpSuburb.d;
            String str3 = pickUpSuburb.e;
            StringBuilder sbV = YU.a.v("postcode_", str, "_", str2, "_");
            sbV.append(str3);
            itemStoreLocatorSuburbMatchBindingModel_.M(sbV.toString());
            itemStoreLocatorSuburbMatchBindingModel_.t();
            itemStoreLocatorSuburbMatchBindingModel_.o = pickUpSuburb;
            itemStoreLocatorSuburbMatchBindingModel_.t();
            itemStoreLocatorSuburbMatchBindingModel_.p = queryText;
            f fVar2 = new f(this, 1);
            itemStoreLocatorSuburbMatchBindingModel_.t();
            itemStoreLocatorSuburbMatchBindingModel_.n = fVar2;
            add(itemStoreLocatorSuburbMatchBindingModel_);
        }
    }
}
