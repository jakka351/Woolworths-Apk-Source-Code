package au.com.woolworths.shop.lists.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.lists.data.prefs.ShoppingListsRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/shop/lists/data/workers/ShoppingListsSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository;", "listLocalRepository", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListRemoteRepository;", "listRemoteRepository", "Lau/com/woolworths/shop/lists/data/prefs/ShoppingListsRepository;", "listsRepository", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "featureToggleManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lau/com/woolworths/shop/lists/data/repository/ShoppingListLocalRepository;Lau/com/woolworths/shop/lists/data/repository/ShoppingListRemoteRepository;Lau/com/woolworths/shop/lists/data/prefs/ShoppingListsRepository;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;)V", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListsSyncWorker extends CoroutineWorker {
    public final ShoppingListLocalRepository h;
    public final ShoppingListRemoteRepository i;
    public final ShoppingListsRepository j;
    public final FeatureToggleManager k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/data/workers/ShoppingListsSyncWorker$Companion;", "", "", "WORKER_INPUT_DATA_GUEST_ID", "Ljava/lang/String;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsSyncWorker(@NotNull Context context, @NotNull WorkerParameters params, @NotNull ShoppingListLocalRepository listLocalRepository, @NotNull ShoppingListRemoteRepository listRemoteRepository, @NotNull ShoppingListsRepository listsRepository, @NotNull FeatureToggleManager featureToggleManager) {
        super(context, params);
        Intrinsics.h(context, "context");
        Intrinsics.h(params, "params");
        Intrinsics.h(listLocalRepository, "listLocalRepository");
        Intrinsics.h(listRemoteRepository, "listRemoteRepository");
        Intrinsics.h(listsRepository, "listsRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.h = listLocalRepository;
        this.i = listRemoteRepository;
        this.j = listsRepository;
        this.k = featureToggleManager;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(Continuation continuation) {
        return b(getInputData().b("WORKER_INPUT_DATA_GUEST_ID"), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$1 r0 = (au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$1 r0 = new au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            goto L49
        L27:
            r6 = move-exception
            goto L4f
        L29:
            r6 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.scheduling.DefaultScheduler r7 = kotlinx.coroutines.Dispatchers.f24691a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            kotlinx.coroutines.scheduling.DefaultIoScheduler r7 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$2 r2 = new au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker$syncLists$2     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.f(r7, r2, r0)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r6)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L27 au.com.woolworths.android.onesite.network.NoConnectivityException -> L29
            return r7
        L4f:
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            r7.p(r6)
            goto L5a
        L55:
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            r7.p(r6)
        L5a:
            androidx.work.ListenableWorker$Result$Retry r6 = new androidx.work.ListenableWorker$Result$Retry
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ShoppingListsSyncWorker.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
