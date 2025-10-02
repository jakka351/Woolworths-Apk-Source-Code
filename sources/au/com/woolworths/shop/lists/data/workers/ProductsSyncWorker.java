package au.com.woolworths.shop.lists.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/shop/lists/data/workers/ProductsSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepository;", "listItemsLocalRepository", "Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor;", "listItemsSyncInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lau/com/woolworths/shop/lists/data/repository/ShoppingListItemsLocalRepository;Lau/com/woolworths/shop/lists/data/ShoppingListItemsSyncInteractor;)V", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductsSyncWorker extends CoroutineWorker {
    public final ShoppingListItemsLocalRepository h;
    public final ShoppingListItemsSyncInteractor i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsSyncWorker(@NotNull Context context, @NotNull WorkerParameters params, @NotNull ShoppingListItemsLocalRepository listItemsLocalRepository, @NotNull ShoppingListItemsSyncInteractor listItemsSyncInteractor) {
        super(context, params);
        Intrinsics.h(context, "context");
        Intrinsics.h(params, "params");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        Intrinsics.h(listItemsSyncInteractor, "listItemsSyncInteractor");
        this.h = listItemsLocalRepository;
        this.i = listItemsSyncInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker$doWork$1 r0 = (au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker$doWork$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker$doWork$1 r0 = new au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker$doWork$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            goto L46
        L38:
            kotlin.ResultKt.b(r6)
            r0.r = r4
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r6 = r5.h
            java.lang.Object r6 = r6.t(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            java.util.List r6 = (java.util.List) r6
            r0.r = r3
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r2 = r5.i
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.workers.ProductsSyncWorker.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
