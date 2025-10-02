package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchAllShoppingLists$2", f = "ShoppingListLocalRepository.kt", l = {96, 98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$fetchAllShoppingLists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ShoppingListEntity>>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ShoppingListLocalRepository r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$fetchAllShoppingLists$2(boolean z, ShoppingListLocalRepository shoppingListLocalRepository, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = shoppingListLocalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$fetchAllShoppingLists$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$fetchAllShoppingLists$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r6 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r6 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r0 = r5.r
            au.com.woolworths.shop.lists.data.database.ShoppingListDao r0 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r5.p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            kotlin.ResultKt.b(r6)
            goto L3c
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            kotlin.ResultKt.b(r6)
            goto L30
        L20:
            kotlin.ResultKt.b(r6)
            boolean r6 = r5.q
            if (r6 == 0) goto L33
            r5.p = r4
            java.lang.Object r6 = r0.n(r5)
            if (r6 != r1) goto L30
            goto L3b
        L30:
            java.util.List r6 = (java.util.List) r6
            return r6
        L33:
            r5.p = r3
            java.lang.Object r6 = r0.c(r5)
            if (r6 != r1) goto L3c
        L3b:
            return r1
        L3c:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchAllShoppingLists$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
