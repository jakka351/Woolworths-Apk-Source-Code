package au.com.woolworths.feature.shop.storelocator.legacy;

import android.location.Location;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/LegacyStoreLocatorInteractorImpl;", "Lau/com/woolworths/foundation/shop/storelocator/LegacyStoreLocatorInteractor;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegacyStoreLocatorInteractorImpl implements LegacyStoreLocatorInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShopAccountInteractor f8154a;
    public final GuestLoginInteractorImpl b;
    public final RepositoryManager c;
    public final CollectionModeInteractor d;
    public final LocationInteractor e;
    public final StoreLocatorRepository f;

    public LegacyStoreLocatorInteractorImpl(ShopAccountInteractor accountInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, RepositoryManager repositoryManager, CollectionModeInteractor collectionModeInteractor, LocationInteractor locationInteractor, StoreLocatorRepository storeLocatorRepository) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        this.f8154a = accountInteractor;
        this.b = guestLoginInteractorImpl;
        this.c = repositoryManager;
        this.d = collectionModeInteractor;
        this.e = locationInteractor;
        this.f = storeLocatorRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1 r0 = (au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1 r0 = new au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$saveInStoreLocation$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.shop.auth.ShopAccountInteractor r6 = r4.f8154a
            boolean r6 = r6.S()
            if (r6 != 0) goto L56
            java.lang.String r6 = r5.getNo()
            java.lang.String r2 = "getNo(...)"
            kotlin.jvm.internal.Intrinsics.g(r6, r2)
            au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl r2 = r4.b
            io.reactivex.Completable r6 = r2.f(r6)
            r0.p = r5
            r0.s = r3
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.a(r6, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r6 = r4.c
            r6.b(r5)
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r6 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r0 = r4.d
            r0.i(r6)
            java.lang.String r5 = r5.getName()
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl.a(au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(Location location, Integer num, ContinuationImpl continuationImpl) {
        return this.f.b(location.getLatitude(), location.getLongitude(), num, continuationImpl);
    }

    public final Object c(String str, SuspendLambda suspendLambda) {
        StoreLocatorRepository storeLocatorRepository = this.f;
        storeLocatorRepository.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new StoreLocatorRepository$fetchStoreBySearchTerm$2(storeLocatorRepository, str, null), suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$getStoreDetail$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$getStoreDetail$1 r0 = (au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$getStoreDetail$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$getStoreDetail$1 r0 = new au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl$getStoreDetail$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.p
            kotlin.ResultKt.b(r7)
            goto L4c
        L38:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.geolocation.location.LocationInteractor r7 = r5.e
            io.reactivex.Maybe r7 = r7.b()
            r0.p = r6
            r0.s = r4
            java.lang.Object r7 = kotlinx.coroutines.rx2.RxAwaitKt.g(r7, r0)
            if (r7 != r1) goto L4c
            goto L5b
        L4c:
            android.location.Location r7 = (android.location.Location) r7
            r2 = 0
            r0.p = r2
            r0.s = r3
            au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorRepository r2 = r5.f
            java.lang.Object r6 = r2.c(r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(String str, Continuation continuation) {
        StoreLocatorRepository storeLocatorRepository = this.f;
        storeLocatorRepository.c.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new StoreLocatorRepository$fetchMatchingSuburbs$2(storeLocatorRepository, str, null), continuation);
    }
}
