package au.com.woolworths.shop.lists.data.repository;

import androidx.room.RoomDatabase;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.shop.lists.data.a;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao;
import au.com.woolworths.shop.lists.data.database.ShoppingListRoomDatabase;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShoppingListLocalRepository {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12281a;
    public final ShoppingListDao b;
    public final ShoppingListItemsLocalRepository c;
    public final DispatcherProvider d;
    public final Flow e;
    public final Flow f;
    public final Flow g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository$Companion;", "", "", "MAX_BATCH_SIZE", "I", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShoppingListLocalRepository(ShoppingListRoomDatabase database, ShoppingListDao listDao, ShoppingListItemsLocalRepository listItemsLocalRepository, DispatcherProvider dispatcher) {
        Intrinsics.h(database, "database");
        Intrinsics.h(listDao, "listDao");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f12281a = database;
        this.b = listDao;
        this.c = listItemsLocalRepository;
        this.d = dispatcher;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.e = listDao.g();
        this.f = listDao.j();
        this.g = FlowKt.r(listDao.e());
    }

    public final Object a(String str, Function1 function1, ContinuationImpl continuationImpl) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$addOrUpdateList$2(this, str, function1, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011d, code lost:
    
        if (r8.m(r1, r2) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014a, code lost:
    
        if (r8.l(r1, r2) == r3) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v5, types: [au.com.woolworths.shop.lists.data.sync.SyncDelta] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c7 -> B:29:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x011d -> B:36:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x014a -> B:43:0x014d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(au.com.woolworths.shop.lists.data.sync.ShoppingListsSyncDownDelta r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository.b(au.com.woolworths.shop.lists.data.sync.ShoppingListsSyncDownDelta, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object c(ContinuationImpl continuationImpl) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$countShoppingLists$2(this, null), continuationImpl);
    }

    public final Object d(ShoppingListEntity shoppingListEntity, Continuation continuation) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$delete$2(this, shoppingListEntity, null), continuation);
    }

    public final Object e(String str, a aVar, Continuation continuation) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$duplicateList$2(this, str, aVar, null), continuation);
    }

    public final Object f(String str, ContinuationImpl continuationImpl) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$fetch$2(this, str, null), continuationImpl);
    }

    public final Object g(boolean z, ContinuationImpl continuationImpl) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$fetchAllShoppingLists$2(z, this, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$1 r0 = (au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$1 r0 = new au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider r7 = r5.d
            r7.getClass()
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$listWithItems$1 r2 = new au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$listWithItems$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r7 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r7
            if (r7 == 0) goto L4f
            return r7
        L4f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "fetchWithItems cannot return null here because with a valid listId, there has to be a corresponding entry in the local db"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository.h(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 i(String listId) {
        Intrinsics.h(listId, "listId");
        Flow flowF = this.b.f(listId);
        ShoppingListItemsLocalRepository shoppingListItemsLocalRepository = this.c;
        return FlowKt.i(flowF, shoppingListItemsLocalRepository.o(listId), shoppingListItemsLocalRepository.l(listId), new ShoppingListLocalRepository$shoppingListWithItems$1(this, null));
    }

    public final Object j(ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$syncDown$2(this, arrayList, arrayList2, null), continuation);
    }

    public final Object k(String str, Continuation continuation) {
        this.d.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new ShoppingListLocalRepository$updateLastSyncedTime$2(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r1 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            boolean r2 = r1 instanceof au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLocalTimestamp$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLocalTimestamp$1 r2 = (au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLocalTimestamp$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.r = r3
            goto L1c
        L17:
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLocalTimestamp$1 r2 = new au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$updateLocalTimestamp$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.r
            au.com.woolworths.shop.lists.data.database.ShoppingListDao r5 = r0.b
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3c
            if (r4 == r7) goto L38
            if (r4 != r6) goto L30
            kotlin.ResultKt.b(r1)
            goto L78
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L4a
        L3c:
            kotlin.ResultKt.b(r1)
            r2.r = r7
            r1 = r27
            java.lang.Object r1 = r5.k(r1, r2)
            if (r1 != r3) goto L4a
            goto L77
        L4a:
            r7 = r1
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r7 = (au.com.woolworths.shop.lists.data.entity.ShoppingListEntity) r7
            if (r7 == 0) goto L81
            long r11 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
            r24 = 4091(0xffb, float:5.733E-42)
            r25 = 0
            r8 = 0
            r9 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r1 = au.com.woolworths.shop.lists.data.entity.ShoppingListEntity.copy$default(r7, r8, r9, r11, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25)
            r2.r = r6
            java.lang.Object r1 = r5.l(r1, r2)
            if (r1 != r3) goto L78
        L77:
            return r3
        L78:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            kotlin.coroutines.jvm.internal.Boxing.a(r1)
        L81:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository.l(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
