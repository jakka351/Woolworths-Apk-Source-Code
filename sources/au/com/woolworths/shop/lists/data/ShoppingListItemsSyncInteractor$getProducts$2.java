package au.com.woolworths.shop.lists.data;

import androidx.work.ListenableWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$2", f = "ShoppingListItemsSyncInteractor.kt", l = {176, 177}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListItemsSyncInteractor$getProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    public int p;
    public final /* synthetic */ ShoppingListItemsSyncInteractor q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsSyncInteractor$getProducts$2(ShoppingListItemsSyncInteractor shoppingListItemsSyncInteractor, List list, Continuation continuation) {
        super(2, continuation);
        this.q = shoppingListItemsSyncInteractor;
        this.r = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListItemsSyncInteractor$getProducts$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListItemsSyncInteractor$getProducts$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r1.f((au.com.woolworths.product.models.ProductListByProductIdsApiData) r14, r2, r13) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r13.p
            java.util.List r2 = r13.r
            au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor r3 = r13.q
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.ResultKt.b(r14)
            r12 = r13
            goto L7c
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.ResultKt.b(r14)
            r12 = r13
            goto L6f
        L22:
            kotlin.ResultKt.b(r14)
            au.com.woolworths.shop.lists.data.repository.ShoppingListRemoteRepository r14 = r3.c
            r13.p = r5
            au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository r1 = r14.c
            au.com.woolworths.product.interactor.ProductsInteractor r14 = r14.b
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.s(r5, r6)
            r7.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            au.com.woolworths.product.models.ProductId r6 = (au.com.woolworths.product.models.ProductId) r6
            java.lang.String r6 = r6.getValue()
            r7.add(r6)
            goto L3f
        L53:
            java.lang.String r8 = r1.d()
            boolean r10 = r1.g()
            au.com.woolworths.product.interactor.ProductsRepository r6 = r14.f9320a
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r14 = r14.b
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r1 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.g
            boolean r11 = r14.c(r1)
            java.lang.String r9 = "lists"
            r12 = r13
            java.lang.Object r14 = r6.a(r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L6f
            goto L7b
        L6f:
            au.com.woolworths.product.models.ProductListByProductIdsApiData r14 = (au.com.woolworths.product.models.ProductListByProductIdsApiData) r14
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r1 = r3.b
            r12.p = r4
            java.lang.Object r14 = r1.f(r14, r2, r13)
            if (r14 != r0) goto L7c
        L7b:
            return r0
        L7c:
            androidx.work.ListenableWorker$Result$Success r14 = androidx.work.ListenableWorker.Result.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemsSyncInteractor$getProducts$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
