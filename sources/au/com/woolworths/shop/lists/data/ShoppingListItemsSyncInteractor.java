package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository;
import au.com.woolworths.shop.lists.data.sync.ShoppingListItemsSyncUpDelta;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListItemsSyncInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListLocalRepository f12259a;
    public final ShoppingListItemsLocalRepository b;
    public final ShoppingListRemoteRepository c;
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor$Companion;", "", "", "MAX_PRODUCTS_PER_QUERY", "I", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShoppingListItemsSyncInteractor(ShoppingListLocalRepository listLocalRepository, ShoppingListItemsLocalRepository listItemsLocalRepository, ShoppingListRemoteRepository listRemoteRepository) {
        Intrinsics.h(listLocalRepository, "listLocalRepository");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        Intrinsics.h(listRemoteRepository, "listRemoteRepository");
        this.f12259a = listLocalRepository;
        this.b = listItemsLocalRepository;
        this.c = listRemoteRepository;
        this.d = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r5, java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$1
            if (r0 == 0) goto L16
            r0 = r7
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.r = r1
            goto L1b
        L16:
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$2 r2 = new au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r5)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4e au.com.woolworths.android.onesite.network.NoConnectivityException -> L50
            return r7
        L4e:
            r5 = move-exception
            goto L52
        L50:
            r5 = move-exception
            goto L58
        L52:
            timber.log.Timber$Forest r6 = timber.log.Timber.f27013a
            r6.p(r5)
            goto L5d
        L58:
            timber.log.Timber$Forest r6 = timber.log.Timber.f27013a
            r6.p(r5)
        L5d:
            androidx.work.ListenableWorker$Result$Retry r5 = new androidx.work.ListenableWorker$Result$Retry
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor.a(au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r15, au.com.woolworths.shop.graphql.type.SyncListItemsInput r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor.b(au.com.woolworths.shop.lists.data.entity.ShoppingListEntity, au.com.woolworths.shop.graphql.type.SyncListItemsInput, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(ShoppingListWithItemsEntity shoppingListWithItemsEntity, boolean z, SuspendLambda suspendLambda) {
        ShoppingListItemsSyncUpDelta shoppingListItemsSyncUpDelta = new ShoppingListItemsSyncUpDelta(shoppingListWithItemsEntity);
        if (shoppingListItemsSyncUpDelta.getB() || z) {
            Object objB = b(shoppingListWithItemsEntity.getShoppingList(), shoppingListItemsSyncUpDelta.c(shoppingListWithItemsEntity.getShoppingList()), suspendLambda);
            if (objB == CoroutineSingletons.d) {
                return objB;
            }
        }
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$2 r2 = new au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$syncProducts$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor.d(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
