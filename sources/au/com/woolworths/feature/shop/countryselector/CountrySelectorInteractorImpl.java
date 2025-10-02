package au.com.woolworths.feature.shop.countryselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.login.LogOutInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAuthManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorInteractorImpl;", "Lau/com/woolworths/feature/shop/countryselector/CountrySelectorInteractor;", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountrySelectorInteractorImpl implements CountrySelectorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListSyncInteractor f7038a;
    public final InStoreWifiInteractor b;
    public final LogOutInteractorImpl c;
    public final ShopAppRegionInteractor d;
    public final CollectionModeInteractor e;
    public final GuestLoginInteractorImpl f;
    public final CartUpdateInteractor g;
    public final ShopAuthManager h;

    public CountrySelectorInteractorImpl(ShoppingListSyncInteractor shoppingListSyncInteractor, InStoreWifiInteractor inStoreWifiInteractor, LogOutInteractorImpl logOutInteractorImpl, ShopAppRegionInteractor shopAppRegionInteractor, CollectionModeInteractor collectionModeInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, CartUpdateInteractor cartUpdateInteractor, ShopAuthManager shopAuthManager) {
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(shopAuthManager, "shopAuthManager");
        this.f7038a = shoppingListSyncInteractor;
        this.b = inStoreWifiInteractor;
        this.c = logOutInteractorImpl;
        this.d = shopAppRegionInteractor;
        this.e = collectionModeInteractor;
        this.f = guestLoginInteractorImpl;
        this.g = cartUpdateInteractor;
        this.h = shopAuthManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$performCleanUpTasks$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$performCleanUpTasks$1 r0 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$performCleanUpTasks$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$performCleanUpTasks$1 r0 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$performCleanUpTasks$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.feature.shop.login.LogOutInteractorImpl r5 = r4.c
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r0 = r4.e
            r0.M(r5)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r5 = r0.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r1 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L62
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery r5 = new au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$Delivery
            au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant r1 = au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant.DeliveryStandard
            r5.<init>(r1)
            r1 = 0
            r0.l(r5, r1)
            r5 = 0
            r0.r(r5)
        L62:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.android.onesite.modules.common.Region r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$setUserRegion$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$setUserRegion$1 r0 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$setUserRegion$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$setUserRegion$1 r0 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$setUserRegion$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor r3 = r5.d
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            r0.r = r4
            java.lang.Object r6 = r3.d(r6, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.android.onesite.modules.common.Region r6 = r3.b()
            au.com.woolworths.android.onesite.modules.common.Region r7 = au.com.woolworths.android.onesite.modules.common.Region.j
            if (r6 != r7) goto L56
            au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor r6 = r5.g
            au.com.woolworths.base.shopapp.TrolleyInteractor r7 = r6.b
            r7.K()
            kotlinx.coroutines.flow.MutableStateFlow r6 = r6.k
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.setValue(r7)
        L56:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl.b(au.com.woolworths.android.onesite.modules.common.Region, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws au.com.woolworths.android.onesite.network.NoConnectivityException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$syncShoppingList$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$syncShoppingList$1 r0 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$syncShoppingList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$syncShoppingList$1 r0 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl$syncShoppingList$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            r0.r = r3
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r5 = r4.f7038a
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            au.com.woolworths.shop.lists.data.sync.SyncResult r5 = (au.com.woolworths.shop.lists.data.sync.SyncResult) r5
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.sync.SyncResult.Failure
            if (r0 == 0) goto L57
            au.com.woolworths.foundation.bark.Bark$Companion r0 = au.com.woolworths.foundation.bark.Bark.f8483a
            au.com.woolworths.foundation.bark.common.ReportOwner$Squad r0 = au.com.woolworths.foundation.bark.common.ReportOwner.Squad.w
            au.com.woolworths.foundation.bark.common.ReportOwner r1 = new au.com.woolworths.foundation.bark.common.ReportOwner
            r1.<init>(r0)
            au.com.woolworths.shop.lists.data.sync.SyncResult$Failure r5 = (au.com.woolworths.shop.lists.data.sync.SyncResult.Failure) r5
            java.io.IOException r5 = r5.f12289a
            java.lang.String r0 = "Syncing of ShoppingLists failed while signing out!"
            r2 = 8
            au.com.woolworths.foundation.bark.Bark.Barker.c(r1, r5, r0, r2)
        L57:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
