package au.com.woolworths.feature.shop.more;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.shop.login.LogOutInteractorImpl;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreInteractor;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MoreInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final GuestLoginInteractorImpl f7604a;
    public final ShopAccountInteractor b;
    public final LogOutInteractorImpl c;
    public final InStoreWifiInteractor d;
    public final MoreRepository e;
    public final ShoppingListSyncInteractor f;
    public final CollectionModeInteractor g;
    public final RewardsAccountInteractor h;

    public MoreInteractor(GuestLoginInteractorImpl guestLoginInteractorImpl, ShopAccountInteractor accountInteractor, LogOutInteractorImpl logOutInteractorImpl, InStoreWifiInteractor inStoreWifiInteractor, MoreRepository moreRepository, ShoppingListSyncInteractor shoppingListSyncInteractor, CollectionModeInteractor collectionModeInteractor, RewardsAccountInteractor rewardsAccountInteractor) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(inStoreWifiInteractor, "inStoreWifiInteractor");
        Intrinsics.h(shoppingListSyncInteractor, "shoppingListSyncInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        this.f7604a = guestLoginInteractorImpl;
        this.b = accountInteractor;
        this.c = logOutInteractorImpl;
        this.d = inStoreWifiInteractor;
        this.e = moreRepository;
        this.f = shoppingListSyncInteractor;
        this.g = collectionModeInteractor;
        this.h = rewardsAccountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.more.MoreInteractor$fetchMoreFeed$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.more.MoreInteractor$fetchMoreFeed$1 r0 = (au.com.woolworths.feature.shop.more.MoreInteractor$fetchMoreFeed$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.more.MoreInteractor$fetchMoreFeed$1 r0 = new au.com.woolworths.feature.shop.more.MoreInteractor$fetchMoreFeed$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            au.com.woolworths.feature.shop.more.MoreRepository r3 = r6.e
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)
            goto L44
        L38:
            kotlin.ResultKt.b(r7)
            r0.r = r5
            java.lang.Object r7 = r3.b(r0)
            if (r7 != r1) goto L44
            goto L5c
        L44:
            java.lang.String r7 = (java.lang.String) r7
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r2 = r6.g
            java.lang.String r5 = r2.a()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r2 = r2.w()
            au.com.woolworths.shop.graphql.type.ShoppingModeType r2 = au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeTypeDataKt.a(r2)
            r0.r = r4
            java.lang.Object r7 = r3.a(r2, r5, r7, r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            r0 = r7
            au.com.woolworths.feature.shop.more.data.MoreFeed r0 = (au.com.woolworths.feature.shop.more.data.MoreFeed) r0
            java.util.List r0 = r0.getFeed()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.more.data.MoreRewardsCard
            if (r2 == 0) goto L6a
            goto L7a
        L79:
            r1 = 0
        L7a:
            boolean r0 = r1 instanceof au.com.woolworths.feature.shop.more.data.MoreRewardsCard
            if (r0 == 0) goto L85
            au.com.woolworths.feature.shop.more.data.MoreRewardsCard r1 = (au.com.woolworths.feature.shop.more.data.MoreRewardsCard) r1
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsState r0 = r1.getRewardsState()
            goto L87
        L85:
            au.com.woolworths.android.onesite.modules.rewards.data.RewardsState r0 = au.com.woolworths.android.onesite.modules.rewards.data.RewardsState.LEGACY_NONE
        L87:
            au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor r1 = r6.h
            r1.setRewardsState(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r8.d(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r7.c.a(r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof au.com.woolworths.feature.shop.more.MoreInteractor$logoutIntoGuestMode$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.feature.shop.more.MoreInteractor$logoutIntoGuestMode$1 r0 = (au.com.woolworths.feature.shop.more.MoreInteractor$logoutIntoGuestMode$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.more.MoreInteractor$logoutIntoGuestMode$1 r0 = new au.com.woolworths.feature.shop.more.MoreInteractor$logoutIntoGuestMode$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r8)
            goto L6d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            goto L62
        L39:
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L57
        L3d:
            r8 = move-exception
            goto L4d
        L3f:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r8 = r7.f     // Catch: java.lang.Exception -> L3d
            r0.r = r5     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L57
            goto L6c
        L4d:
            timber.log.Timber$Forest r2 = timber.log.Timber.f27013a
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Syncing of ShoppingLists failed while signing out!"
            r2.n(r6, r8, r5)
        L57:
            r0.r = r4
            au.com.woolworths.foundation.shared.instore.wifi.InStoreWifiInteractor r8 = r7.d
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L62
            goto L6c
        L62:
            r0.r = r3
            au.com.woolworths.feature.shop.login.LogOutInteractorImpl r8 = r7.c
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.more.MoreInteractor.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
