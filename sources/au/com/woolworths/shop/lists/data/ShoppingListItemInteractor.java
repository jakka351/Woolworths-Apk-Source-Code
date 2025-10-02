package au.com.woolworths.shop.lists.data;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion;
import au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/ShoppingListItemInteractor;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListItemInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListLocalRepository f12258a;
    public final ShoppingListItemsLocalRepositoryWithSoftDeletion b;

    public ShoppingListItemInteractor(ShoppingListLocalRepository shoppingListLocalRepository, ShoppingListItemsLocalRepositoryWithSoftDeletion listItemsLocalRepository) {
        Intrinsics.h(shoppingListLocalRepository, "shoppingListLocalRepository");
        Intrinsics.h(listItemsLocalRepository, "listItemsLocalRepository");
        this.f12258a = shoppingListLocalRepository;
        this.b = listItemsLocalRepository;
    }

    public final Object a(String str, ProductCard productCard, float f, ContinuationImpl continuationImpl) {
        Object objH = this.b.f12280a.h(str, ProductId.INSTANCE.create(productCard.getProductId()), productCard, f, continuationImpl);
        return objH == CoroutineSingletons.d ? objH : Unit.f24250a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if (r26.f12258a.l(r1, r2) != r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r27, java.lang.String r28, java.lang.String r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r30
            boolean r2 = r1 instanceof au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$addOrUpdateTextItem$1
            if (r2 == 0) goto L17
            r2 = r1
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$addOrUpdateTextItem$1 r2 = (au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$addOrUpdateTextItem$1) r2
            int r3 = r2.t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.t = r3
            goto L1c
        L17:
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$addOrUpdateTextItem$1 r2 = new au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$addOrUpdateTextItem$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.t
            r5 = 0
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r6 = r0.b
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L52
            if (r4 == r9) goto L45
            if (r4 == r8) goto L3d
            if (r4 != r7) goto L35
            kotlin.ResultKt.b(r1)
            goto Lb8
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            java.lang.Object r4 = r2.p
            au.com.woolworths.shop.lists.data.entity.TextListItemEntity r4 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r4
            kotlin.ResultKt.b(r1)
            goto La7
        L45:
            java.lang.String r4 = r2.q
            java.lang.Object r9 = r2.p
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.b(r1)
            r12 = r9
        L4f:
            r23 = r4
            goto L6d
        L52:
            kotlin.ResultKt.b(r1)
            r1 = r28
            r2.p = r1
            r4 = r29
            r2.q = r4
            r2.t = r9
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r9 = r6.f12280a
            r10 = r27
            java.lang.Object r9 = r9.s(r10, r2)
            if (r9 != r3) goto L6a
            goto Lb7
        L6a:
            r12 = r1
            r1 = r9
            goto L4f
        L6d:
            au.com.woolworths.shop.lists.data.entity.TextListItemEntity r1 = (au.com.woolworths.shop.lists.data.entity.TextListItemEntity) r1
            if (r1 != 0) goto L8e
            long r15 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
            long r13 = au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt.b()
            au.com.woolworths.shop.lists.data.entity.TextListItemEntity r10 = new au.com.woolworths.shop.lists.data.entity.TextListItemEntity
            r24 = 433(0x1b1, float:6.07E-43)
            r25 = 0
            r11 = 0
            r17 = 0
            r18 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r10.<init>(r11, r12, r13, r15, r17, r18, r20, r21, r22, r23, r24, r25)
            r1 = r10
        L8e:
            r4 = r23
            au.com.woolworths.shop.cart.ui.cart.l r9 = new au.com.woolworths.shop.cart.ui.cart.l
            r10 = 16
            r9.<init>(r10, r4, r1)
            r2.p = r1
            r2.q = r5
            r2.t = r8
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r4 = r6.f12280a
            java.lang.Object r4 = r4.d(r1, r9, r2)
            if (r4 != r3) goto La6
            goto Lb7
        La6:
            r4 = r1
        La7:
            java.lang.String r1 = r4.getId()
            r2.p = r5
            r2.t = r7
            au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository r4 = r0.f12258a
            java.lang.Object r1 = r4.l(r1, r2)
            if (r1 != r3) goto Lb8
        Lb7:
            return r3
        Lb8:
            kotlin.Unit r1 = kotlin.Unit.f24250a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemInteractor.b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
    
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0106 -> B:37:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r28, java.util.List r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemInteractor.c(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(String listId, ProductId productId) {
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        this.b.a(listId, productId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r5 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r31, java.lang.String r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemInteractor.e(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$fetchItemById$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$fetchItemById$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$fetchItemById$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$fetchItemById$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$fetchItemById$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r6 = r4.b
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r6 = r6.f12280a
            java.lang.Object r6 = r6.j(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r6 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r6
            au.com.woolworths.shop.lists.data.model.ProductListItem r5 = au.com.woolworths.shop.lists.data.utils.ListsExtKt.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemInteractor.f(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r3.f12280a.r(false, r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r7, au.com.woolworths.product.models.ProductId r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$updateProductCheckedStatus$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$updateProductCheckedStatus$1 r0 = (au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$updateProductCheckedStatus$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$updateProductCheckedStatus$1 r0 = new au.com.woolworths.shop.lists.data.ShoppingListItemInteractor$updateProductCheckedStatus$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion r3 = r6.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r9)
            goto L84
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            au.com.woolworths.product.models.ProductId r8 = r0.p
            kotlin.ResultKt.b(r9)
            goto L48
        L3a:
            kotlin.ResultKt.b(r9)
            r0.p = r8
            r0.s = r5
            java.lang.Object r9 = r3.m(r7, r0)
            if (r9 != r1) goto L48
            goto L83
        L48:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r7 = r9.iterator()
        L50:
            boolean r9 = r7.hasNext()
            r2 = 0
            if (r9 == 0) goto L69
            java.lang.Object r9 = r7.next()
            r5 = r9
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r5 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r5
            au.com.woolworths.product.models.ProductId r5 = r5.getProductId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r8)
            if (r5 == 0) goto L50
            goto L6a
        L69:
            r9 = r2
        L6a:
            au.com.woolworths.shop.lists.data.entity.ProductListItemEntity r9 = (au.com.woolworths.shop.lists.data.entity.ProductListItemEntity) r9
            if (r9 == 0) goto L73
            java.lang.String r7 = r9.getId()
            goto L74
        L73:
            r7 = r2
        L74:
            if (r7 == 0) goto L84
            r0.p = r2
            r0.s = r4
            au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepository r8 = r3.f12280a
            r9 = 0
            java.lang.Object r7 = r8.r(r9, r7, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.ShoppingListItemInteractor.g(java.lang.String, au.com.woolworths.product.models.ProductId, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
