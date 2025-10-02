package au.com.woolworths.shop.addtolist.domain;

import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListItemInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/domain/CreateShoppingListInteractor;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreateShoppingListInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListInteractor f10120a;
    public final ShoppingListItemInteractor b;
    public final ProductsInteractor c;
    public final ListsInMemoryRepository d;

    public CreateShoppingListInteractor(ShoppingListInteractor listInteractor, ShoppingListItemInteractor listItemInteractor, ProductsInteractor productsInteractor, ListsInMemoryRepository listsInMemoryRepository) {
        Intrinsics.h(listInteractor, "listInteractor");
        Intrinsics.h(listItemInteractor, "listItemInteractor");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        this.f10120a = listInteractor;
        this.b = listItemInteractor;
        this.c = productsInteractor;
        this.d = listsInMemoryRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r11 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, java.util.Map r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor.a(java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r11, java.util.Map r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$addProductIdsToList$1
            if (r0 == 0) goto L13
            r0 = r13
            au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$addProductIdsToList$1 r0 = (au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$addProductIdsToList$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$addProductIdsToList$1 r0 = new au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$addProductIdsToList$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Iterator r11 = r0.q
            java.lang.String r12 = r0.p
            kotlin.ResultKt.b(r13)
            r5 = r12
            goto L41
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.ResultKt.b(r13)
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r5 = r11
            r11 = r12
        L41:
            r9 = r0
        L42:
            boolean r12 = r11.hasNext()
            kotlin.Unit r13 = kotlin.Unit.f24250a
            if (r12 == 0) goto L7f
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r8 = r12.floatValue()
            au.com.woolworths.product.models.ProductId$Companion r12 = au.com.woolworths.product.models.ProductId.INSTANCE
            au.com.woolworths.product.models.ProductId r6 = r12.create(r0)
            r9.p = r5
            r9.q = r11
            r9.t = r3
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor r12 = r10.b
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r12 = r12.b
            r7 = 0
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r4 = r12.f12280a
            java.lang.Object r12 = r4.h(r5, r6, r7, r8, r9)
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            if (r12 != r0) goto L7c
            r13 = r12
        L7c:
            if (r13 != r1) goto L42
            return r1
        L7f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor.b(java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (b(r4, r8, r2) == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (b(r4, r8, r2) == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r21v0, types: [au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r22, int r23, java.util.LinkedHashMap r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$createList$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$createList$1 r2 = (au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$createList$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.t = r3
            goto L1c
        L17:
            au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$createList$1 r2 = new au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor$createList$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.t
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L59
            if (r4 == r9) goto L4c
            if (r4 == r8) goto L42
            if (r4 == r7) goto L31
            if (r4 != r6) goto L3a
        L31:
            java.lang.Object r2 = r2.p
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r1)
            goto Lc0
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L42:
            java.lang.String r4 = r2.q
            java.lang.Object r8 = r2.p
            java.util.Map r8 = (java.util.Map) r8
            kotlin.ResultKt.b(r1)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> La4 au.com.woolworths.android.onesite.network.ServerErrorException -> Lb3
            return r4
        L4c:
            java.lang.Object r4 = r2.p
            java.util.Map r4 = (java.util.Map) r4
            kotlin.ResultKt.b(r1)
            r20 = r4
            r4 = r1
            r1 = r20
            goto L8b
        L59:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.shop.lists.data.model.ShoppingList r10 = new au.com.woolworths.shop.lists.data.model.ShoppingList
            r18 = 49
            r19 = 0
            r11 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r12 = r22
            r13 = r23
            r10.<init>(r11, r12, r13, r14, r16, r17, r18, r19)
            r1 = r24
            r2.p = r1
            r2.t = r9
            au.com.woolworths.shop.lists.data.ShoppingListInteractor r4 = r0.f10120a
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r4 = r4.f12257a
            java.lang.String r9 = r10.getId()
            au.com.woolworths.shop.lists.data.a r11 = new au.com.woolworths.shop.lists.data.a
            r12 = 0
            r11.<init>(r10, r12)
            java.lang.Object r4 = r4.a(r9, r11, r2)
            if (r4 != r3) goto L8b
            goto Lbf
        L8b:
            java.lang.String r4 = (java.lang.String) r4
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto Lc1
            r2.p = r1     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> La0 au.com.woolworths.android.onesite.network.ServerErrorException -> La2
            r2.q = r4     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> La0 au.com.woolworths.android.onesite.network.ServerErrorException -> La2
            r2.t = r8     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> La0 au.com.woolworths.android.onesite.network.ServerErrorException -> La2
            java.lang.Object r1 = r0.a(r4, r1, r2)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> La0 au.com.woolworths.android.onesite.network.ServerErrorException -> La2
            if (r1 != r3) goto Lc1
            goto Lbf
        La0:
            r8 = r1
            goto La4
        La2:
            r8 = r1
            goto Lb3
        La4:
            r2.p = r4
            r2.q = r5
            r2.t = r6
            java.lang.Object r1 = r0.b(r4, r8, r2)
            if (r1 != r3) goto Lb1
            goto Lbf
        Lb1:
            r2 = r4
            goto Lc0
        Lb3:
            r2.p = r4
            r2.q = r5
            r2.t = r7
            java.lang.Object r1 = r0.b(r4, r8, r2)
            if (r1 != r3) goto Lb1
        Lbf:
            return r3
        Lc0:
            return r2
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.domain.CreateShoppingListInteractor.c(java.lang.String, int, java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
