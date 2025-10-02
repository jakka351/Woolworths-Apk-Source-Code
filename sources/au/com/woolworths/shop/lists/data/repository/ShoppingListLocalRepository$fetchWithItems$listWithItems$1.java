package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListWithItemsEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$listWithItems$1", f = "ShoppingListLocalRepository.kt", l = {154, 158}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$fetchWithItems$listWithItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ShoppingListWithItemsEntity>, Object> {
    public Object p;
    public ShoppingListLocalRepository q;
    public Iterator r;
    public ProductListItemEntity s;
    public int t;
    public final /* synthetic */ ShoppingListLocalRepository u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$fetchWithItems$listWithItems$1(ShoppingListLocalRepository shoppingListLocalRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.u = shoppingListLocalRepository;
        this.v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShoppingListLocalRepository$fetchWithItems$listWithItems$1(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ShoppingListLocalRepository$fetchWithItems$listWithItems$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:24:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.t
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r2 = r8.u
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r1 = r8.s
            java.util.Iterator r2 = r8.r
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r4 = r8.q
            java.lang.Object r5 = r8.p
            kotlin.ResultKt.b(r9)
            goto L70
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            kotlin.ResultKt.b(r9)
            goto L36
        L26:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.shop.lists.data.database.ShoppingListDao r9 = r2.b
            r8.t = r4
            java.lang.String r1 = r8.v
            java.lang.Object r9 = r9.h(r1, r8)
            if (r9 != r0) goto L36
            goto L6c
        L36:
            r1 = r9
            au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity r1 = (au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity) r1
            if (r1 == 0) goto L80
            java.util.List r1 = r1.getProductItems()
            if (r1 == 0) goto L80
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r5 = r9
            r9 = r2
            r2 = r1
        L4a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r2.next()
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r1 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r1
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r4 = r9.c
            au.com.woolworths.product.models.ProductId r6 = r1.getProductId()
            r8.p = r5
            r8.q = r9
            r8.r = r2
            r8.s = r1
            r8.t = r3
            java.lang.Object r4 = r4.q(r6, r8)
            if (r4 != r0) goto L6d
        L6c:
            return r0
        L6d:
            r7 = r4
            r4 = r9
            r9 = r7
        L70:
            au.com.woolworths.shop.lists.data.entity.ProductsWithCategory r9 = (au.com.woolworths.shop.lists.data.entity.ProductsWithCategory) r9
            if (r9 == 0) goto L79
            au.com.woolworths.product.models.ProductCard r9 = au.com.woolworths.shop.lists.data.utils.ProductExtKt.b(r9)
            goto L7a
        L79:
            r9 = 0
        L7a:
            r1.setProduct(r9)
            r9 = r4
            goto L4a
        L7f:
            return r5
        L80:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$fetchWithItems$listWithItems$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
