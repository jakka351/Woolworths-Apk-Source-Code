package au.com.woolworths.shop.lists.ui.lists;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.ListScreen;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePromptClickHandler;", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsViewModel extends ViewModel implements InstorePresencePromptClickHandler {
    public final AnalyticsManager e;
    public final ShoppingListSyncInteractor f;
    public final ShoppingListInteractor g;
    public final ListsInMemoryRepository h;
    public final InstorePresenceInteractor i;
    public final LegacyStoreLocatorInteractorImpl j;
    public final FeatureToggleManager k;
    public final ShopAppRegionInteractor l;
    public final SharedFlowImpl m;
    public final Flow n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsViewModel$Companion;", "", "", "EVENT_FIRE_DELAY_MS", "J", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ListsViewModel(AnalyticsManager analyticsManager, ShoppingListSyncInteractor shoppingListSyncInteractor, ShoppingListInteractor shoppingListInteractor, ListsInMemoryRepository listsInMemoryRepository, InstorePresenceInteractor instorePresenceInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, FeatureToggleManager featureToggleManager, ShopAppRegionInteractor shopAppRegionInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(instorePresenceInteractor, "instorePresenceInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        this.e = analyticsManager;
        this.f = shoppingListSyncInteractor;
        this.g = shoppingListInteractor;
        this.h = listsInMemoryRepository;
        this.i = instorePresenceInteractor;
        this.j = legacyStoreLocatorInteractorImpl;
        this.k = featureToggleManager;
        this.l = shopAppRegionInteractor;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = FlowKt.a(sharedFlowImplB);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: L5, reason: from getter */
    public final InstorePresenceInteractor getI() {
        return this.i;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: c, reason: from getter */
    public final AnalyticsManager getE() {
        return this.e;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final LegacyStoreLocatorInteractor e3() {
        return this.j;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final Screen f() {
        return new ListScreen.Lists(this.h.a());
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final CloseableCoroutineScope s0() {
        return ViewModelKt.a(this);
    }
}
