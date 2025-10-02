package au.com.woolworths.shop.lists.data;

import androidx.work.ListenableWorker;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$2", f = "ShoppingListSyncInteractor.kt", l = {114, 119, 123}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListSyncInteractor$refreshShoppingList$2 extends SuspendLambda implements Function1<Continuation<? super ListenableWorker.Result>, Object> {
    public ShoppingListWithItemsEntity p;
    public int q;
    public final /* synthetic */ ShoppingListSyncInteractor r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListSyncInteractor$refreshShoppingList$2(ShoppingListSyncInteractor shoppingListSyncInteractor, String str, Continuation continuation) {
        super(1, continuation);
        this.r = shoppingListSyncInteractor;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ShoppingListSyncInteractor$refreshShoppingList$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ShoppingListSyncInteractor$refreshShoppingList$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[PHI: r0
  0x0059: PHI (r0v4 au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) = 
  (r0v3 au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity)
  (r0v3 au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity)
  (r0v6 au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity)
 binds: [B:19:0x004c, B:21:0x0056, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[LOOP:0: B:24:0x006e->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor r0 = r7.r
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r1 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r7.q
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L29
            if (r3 == r6) goto L25
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            kotlin.ResultKt.b(r8)
            return r8
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r0 = r7.p
            kotlin.ResultKt.b(r8)
            goto L59
        L25:
            kotlin.ResultKt.b(r8)
            goto L41
        L29:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.android.onesite.utils.ConnectionManager r8 = r0.n
            boolean r8 = r8.isConnected()
            if (r8 == 0) goto L8f
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r8 = r0.b
            r7.q = r6
            java.lang.String r0 = r7.s
            java.lang.Object r8 = r8.h(r0, r7)
            if (r8 != r2) goto L41
            goto L8d
        L41:
            r0 = r8
            au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r0 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r0
            au.com.woolworths.shop.lists.data.entity.ShoppingListEntity r8 = r0.getShoppingList()
            java.lang.String r8 = r8.getRemoteId()
            if (r8 == 0) goto L59
            r7.p = r0
            r7.q = r5
            java.lang.Object r8 = r1.c(r0, r6, r7)
            if (r8 != r2) goto L59
            goto L8d
        L59:
            java.util.List r8 = r0.getAllProductItems()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.s(r8, r3)
            r0.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
        L6e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r8.next()
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r3 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r3
            au.com.woolworths.product.models.ProductId r3 = r3.getProductId()
            r0.add(r3)
            goto L6e
        L82:
            r8 = 0
            r7.p = r8
            r7.q = r4
            java.lang.Object r8 = r1.d(r0, r7)
            if (r8 != r2) goto L8e
        L8d:
            return r2
        L8e:
            return r8
        L8f:
            au.com.woolworths.android.onesite.network.NoConnectivityException r8 = new au.com.woolworths.android.onesite.network.NoConnectivityException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor$refreshShoppingList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
