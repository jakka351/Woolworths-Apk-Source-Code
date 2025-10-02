package au.com.woolworths.feature.shop.storelocator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.storelocator.StoreLocatorInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorInteractorImpl;", "Lau/com/woolworths/foundation/shop/storelocator/StoreLocatorInteractor;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreLocatorInteractorImpl implements StoreLocatorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAccountInteractor f8128a;
    public final GuestLoginInteractorImpl b;
    public final RepositoryManager c;
    public final CollectionModeInteractor d;
    public final StoreLocatorRepositoryImpl e;

    public StoreLocatorInteractorImpl(ShopAccountInteractor accountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor, LocationInteractor locationInteractor, StoreLocatorRepositoryImpl storeLocatorRepositoryImpl) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        this.f8128a = accountInteractor;
        this.b = guestLoginInteractorImpl;
        this.c = repositoryManager;
        this.d = collectionModeInteractor;
        this.e = storeLocatorRepositoryImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl$saveInStoreLocation$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl$saveInStoreLocation$1 r0 = (au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl$saveInStoreLocation$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl$saveInStoreLocation$1 r0 = new au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl$saveInStoreLocation$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.auth.ShopAccountInteractor r6 = r4.f8128a
            boolean r6 = r6.S()
            if (r6 != 0) goto L4f
            au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl r6 = r4.b
            java.lang.String r2 = r5.d
            io.reactivex.Completable r6 = r6.f(r2)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.a(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r6 = r4.c
            r6.a(r5)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r6 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r0 = r4.d
            r0.i(r6)
            java.lang.String r5 = r5.f
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.StoreLocatorInteractorImpl.a(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
