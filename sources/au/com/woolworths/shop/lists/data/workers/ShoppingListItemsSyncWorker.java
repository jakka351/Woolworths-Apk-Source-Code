package au.com.woolworths.shop.lists.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/lists/data/workers/ShoppingListItemsSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository;", "listLocalRepository", "Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor;", "listItemsSyncInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository;Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor;)V", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListItemsSyncWorker extends CoroutineWorker {
    public final ShoppingListLocalRepository h;
    public final ShoppingListItemsSyncInteractor i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/data/workers/ShoppingListItemsSyncWorker$Companion;", "", "", "WORKER_INPUT_DATA_LIST_ID", "Ljava/lang/String;", "WORKER_INPUT_DATA_LIST_REFRESH", "", "PARALLEL_CALLS_TO_SYNC_NUM", "I", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncWorker(@NotNull Context context, @NotNull WorkerParameters params, @NotNull ShoppingListLocalRepository listLocalRepository, @NotNull ShoppingListItemsSyncInteractor listItemsSyncInteractor) {
        super(context, params);
        Intrinsics.h(context, "context");
        Intrinsics.h(params, "params");
        Intrinsics.h(listLocalRepository, "listLocalRepository");
        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
        this.h = listLocalRepository;
        this.i = listItemsSyncInteractor;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(Continuation continuation) {
        String strB = getInputData().b("WORKER_INPUT_DATA_LIST_ID");
        Data inputData = getInputData();
        Object obj = Boolean.FALSE;
        Object obj2 = inputData.f3896a.get("WORKER_INPUT_DATA_LIST_FORCE_REFRESH");
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return strB != null ? c(((Boolean) obj).booleanValue(), strB, (ContinuationImpl) continuation) : b((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$1 r0 = (au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$1 r0 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2 r5 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncListItems$2
            r2 = 0
            r5.<init>(r4, r2)
            r0.r = r3
            java.lang.Object r5 = kotlinx.coroutines.CoroutineScopeKt.c(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.g(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$1 r0 = (au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$1 r0 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2 r7 = new au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker$syncSingleListItems$2
            r2 = 0
            r7.<init>(r4, r6, r5, r2)
            r0.r = r3
            java.lang.Object r7 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListItemsSyncWorker.c(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
