package au.com.woolworths.shop.lists.data.sync.scheduler;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.LiveDataUtils;
import au.com.woolworths.android.onesite.utils.ConnectionManager;
import au.com.woolworths.feature.shared.instore.wifi.ui.d;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.sync.ShoppingListSyncRepository;
import au.com.woolworths.shop.lists.data.sync.SyncResult;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker;
import au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker;
import au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/scheduler/SyncScheduler;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SyncScheduler {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListSyncRepository f12291a;
    public final ShoppingListsRepository b;
    public final ConnectionManager c;
    public final WorkManagerImpl d;
    public final LinkedHashMap e;
    public CompletableDeferred f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/scheduler/SyncScheduler$Companion;", "", "", "SYNC_DEBOUNCE_TIME_IN_MS", "J", "WORK_REQUEST_SCHEDULE_STALE_IN_MS", "LAST_TIME_SYNC_INTERVAL_IN_MS", "", "SYNC_UNIQUE_WORKER_NAME", "Ljava/lang/String;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12292a;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12292a = iArr;
            int[] iArr2 = new int[SyncType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SyncType syncType = SyncType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                SyncType syncType2 = SyncType.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SyncScheduler(Context context, ShoppingListSyncRepository syncRepository, ShoppingListsRepository listsRepository, ConnectionManager connectionManager) {
        Intrinsics.h(context, "context");
        Intrinsics.h(syncRepository, "syncRepository");
        Intrinsics.h(listsRepository, "listsRepository");
        Intrinsics.h(connectionManager, "connectionManager");
        this.f12291a = syncRepository;
        this.b = listsRepository;
        this.c = connectionManager;
        WorkManagerImpl workManagerImplA = WorkManager.Companion.a(context);
        this.d = workManagerImplA;
        this.e = new LinkedHashMap();
        LiveDataUtils.a(workManagerImplA.c.z().b(), WorkSpec.z, workManagerImplA.d).g(new SyncSchedulerKt$sam$androidx_lifecycle_Observer$0(new d(this, 3)));
    }

    public final synchronized WorkInfo.State a() {
        WorkInfo.State state;
        state = WorkInfo.State.e;
        if (!b(state)) {
            WorkInfo.State state2 = WorkInfo.State.d;
            if (b(state2)) {
                ShoppingListsRepository shoppingListsRepository = this.b;
                if (((Number) shoppingListsRepository.c.getValue(shoppingListsRepository, ShoppingListsRepository.j[1])).longValue() - ListsDataUtilsKt.b() > 2000) {
                    state = state2;
                }
            } else {
                state = null;
            }
        }
        return state;
    }

    public final synchronized boolean b(WorkInfo.State state) {
        Object next;
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WorkData) ((Map.Entry) next).getValue()).b == state) {
                break;
            }
        }
        return next != null;
    }

    public final void c(long j) {
        ShoppingListsRepository shoppingListsRepository = this.b;
        shoppingListsRepository.c.setValue(shoppingListsRepository, ShoppingListsRepository.j[1], Long.valueOf(j));
    }

    public final synchronized void d(SyncResult syncResult) {
        CompletableDeferred completableDeferred = this.f;
        if (completableDeferred != null) {
            completableDeferred.h(syncResult);
        }
    }

    public final Object e(String str, SyncType syncType, ContinuationImpl continuationImpl) {
        boolean z = syncType == SyncType.f && !SyncSchedulerKt.a(this.b);
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.d;
        int iOrdinal = syncType.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            WorkInfo.State stateA = a();
            if ((stateA != null ? WhenMappings.f12292a[stateA.ordinal()] : -1) == 1) {
                existingWorkPolicy = ExistingWorkPolicy.f;
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            WorkInfo.State stateA2 = a();
            if ((stateA2 != null ? WhenMappings.f12292a[stateA2.ordinal()] : -1) == 1) {
                existingWorkPolicy = null;
            }
        }
        if (z || existingWorkPolicy == null) {
            return SyncResult.Success.f12290a;
        }
        long j = syncType == SyncType.e ? 30000L : 0L;
        c(ListsDataUtilsKt.b() + j);
        if (syncType == SyncType.d) {
            d(SyncResult.Success.f12290a);
        }
        ShoppingListSyncRepository shoppingListSyncRepository = this.f12291a;
        shoppingListSyncRepository.getClass();
        Pair[] pairArr = {new Pair("WORKER_INPUT_DATA_GUEST_ID", str)};
        Data.Builder builder = new Data.Builder();
        Pair pair = pairArr[0];
        builder.b((String) pair.d, pair.e);
        Data dataA = builder.a();
        OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(ShoppingListsSyncWorker.class);
        Constraints constraints = shoppingListSyncRepository.b;
        OneTimeWorkRequest.Builder builder3 = (OneTimeWorkRequest.Builder) builder2.e(constraints);
        builder3.d.add("SYNC_LISTS_WORKER");
        OneTimeWorkRequest.Builder builder4 = (OneTimeWorkRequest.Builder) builder3.f(j, TimeUnit.MILLISECONDS);
        builder4.c.e = dataA;
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) builder4.a();
        OneTimeWorkRequest.Builder builder5 = new OneTimeWorkRequest.Builder(ShoppingListItemsSyncWorker.class);
        builder5.c.j = constraints;
        builder5.d.add("SYNC_LIST_ITEMS_WORKER");
        OneTimeWorkRequest oneTimeWorkRequest2 = (OneTimeWorkRequest) builder5.a();
        OneTimeWorkRequest.Builder builder6 = (OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(ProductsSyncWorker.class).e(shoppingListSyncRepository.b);
        builder6.d.add("SYNC_PRODUCTS_WORKER");
        OneTimeWorkRequest oneTimeWorkRequest3 = (OneTimeWorkRequest) builder6.a();
        Timber.f27013a.h("XXXXX -> syncShoppingLists:: workPolicy: " + existingWorkPolicy, new Object[0]);
        WorkManagerImpl workManagerImpl = shoppingListSyncRepository.f12286a;
        workManagerImpl.getClass();
        workManagerImpl.d(existingWorkPolicy, CollectionsKt.Q(oneTimeWorkRequest)).d(Collections.singletonList(oneTimeWorkRequest2)).d(Collections.singletonList(oneTimeWorkRequest3)).a();
        Map mapJ = MapsKt.j(new Pair(oneTimeWorkRequest.f3911a, new WorkData("SYNC_LISTS_WORKER")), new Pair(oneTimeWorkRequest2.f3911a, new WorkData("SYNC_LIST_ITEMS_WORKER")), new Pair(oneTimeWorkRequest3.f3911a, new WorkData("SYNC_PRODUCTS_WORKER")));
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.e;
            Intrinsics.h(linkedHashMap, "<this>");
            linkedHashMap.clear();
            for (Map.Entry entry : mapJ.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (syncType != SyncType.d) {
            return SyncResult.Success.f12290a;
        }
        CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        this.f = completableDeferredA;
        return completableDeferredA.await(continuationImpl);
    }
}
