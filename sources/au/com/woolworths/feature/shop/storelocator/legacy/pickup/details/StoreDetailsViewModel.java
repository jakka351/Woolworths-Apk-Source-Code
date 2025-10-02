package au.com.woolworths.feature.shop.storelocator.legacy.pickup.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreDetailsViewModel extends ViewModel {
    public final LegacyStoreLocatorInteractorImpl e;
    public final CollectionModeInteractor f;
    public final AnalyticsManager g;
    public final ShoppingModeSelectorRepository h;
    public final FeatureToggleManager i;
    public String j;
    public final MutableStateFlow k;
    public final StateFlow l;

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsViewModel$Factory;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        StoreDetailsViewModel a(boolean z);
    }

    public StoreDetailsViewModel(LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, ShoppingModeSelectorRepository shoppingModeSelectorRepository, FeatureToggleManager featureToggleManager, boolean z) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = legacyStoreLocatorInteractorImpl;
        this.f = collectionModeInteractor;
        this.g = analyticsManager;
        this.h = shoppingModeSelectorRepository;
        this.i = featureToggleManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new StoreDetailsContract.ViewState(StoreDetailsContract.PageState.d, null, z, 956));
        this.k = mutableStateFlowA;
        this.l = FlowKt.b(mutableStateFlowA);
        mutableStateFlowA.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlowA.getValue(), null, null, null, null, null, null, new StoreDetailsViewModel$1$1(1, this, StoreDetailsViewModel.class, "triggerAction", "triggerAction(Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$Action;)V", 0), null, new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 16), 383));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r0 = r10.f
            boolean r1 = r13 instanceof au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setShoppingModeApi$1
            if (r1 == 0) goto L16
            r1 = r13
            au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setShoppingModeApi$1 r1 = (au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setShoppingModeApi$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.r = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setShoppingModeApi$1 r1 = new au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setShoppingModeApi$1
            r1.<init>(r10, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r8.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r8.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r13)
            goto L48
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.ResultKt.b(r13)
            au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository r2 = r10.h
            r8.r = r3
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 25
            r4 = r11
            r5 = r12
            java.lang.Object r13 = au.com.woolworths.feature.shop.modeselector.ShoppingModeSelectorRepository.c(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r1) goto L48
            return r1
        L48:
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent r13 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorMutationContent) r13
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelector r10 = r13.f7540a
            r11 = 0
            if (r10 == 0) goto L73
            java.util.ArrayList r10 = r10.b
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L5a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L6c
            java.lang.Object r13 = r10.next()
            boolean r1 = r13 instanceof au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection
            if (r1 == 0) goto L5a
            r12.add(r13)
            goto L5a
        L6c:
            java.lang.Object r10 = kotlin.collections.CollectionsKt.F(r12)
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection$ShoppingModeSelectorAddressInfoSection r10 = (au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) r10
            goto L74
        L73:
            r10 = r11
        L74:
            if (r10 == 0) goto L7a
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorAddressDetails r10 = r10.f7533a
            au.com.woolworths.feature.shop.modeselector.model.ShoppingModeDetails r11 = r10.g
        L7a:
            if (r11 == 0) goto L9e
            java.lang.String r10 = r11.f7531a
            r0.r(r10)
            java.lang.Integer r10 = r11.c
            r0.M(r10)
            java.lang.String r10 = r11.b
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r11 = r0.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery r12 = new au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery
            au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant r13 = au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant.DeliveryNow
            r12.<init>(r13)
            boolean r11 = r11.equals(r12)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r10 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt.c(r10, r11)
            r0.i(r10)
        L9e:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel.p6(au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void q6(Store store) {
        Intrinsics.h(store, "store");
        MutableStateFlow mutableStateFlow = this.k;
        StoreDetailsContract.ViewState viewState = (StoreDetailsContract.ViewState) mutableStateFlow.getValue();
        StoreDetailsContract.PageState pageState = StoreDetailsContract.PageState.e;
        CollectionModeInteractor collectionModeInteractor = this.f;
        mutableStateFlow.setValue(StoreDetailsContract.ViewState.a(viewState, pageState, store, collectionModeInteractor.B(), null, null, collectionModeInteractor.w().equals(CollectionMode.InStore.d) ? collectionModeInteractor.y() : null, null, null, null, 984));
    }

    public final void r6(String storeNumber) {
        Intrinsics.h(storeNumber, "storeNumber");
        this.j = storeNumber;
        MutableStateFlow mutableStateFlow = this.k;
        mutableStateFlow.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow.getValue(), StoreDetailsContract.PageState.d, null, null, null, null, null, null, null, null, 1020));
        BuildersKt.c(ViewModelKt.a(this), null, null, new StoreDetailsViewModel$setStoreNumber$2(this, storeNumber, null), 3);
    }
}
