package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$saveProductToList$2<T> implements FlowCollector {
    public final /* synthetic */ ProductCard d;
    public final /* synthetic */ ViewSimilarProductsViewModel e;
    public final /* synthetic */ String f;

    public ViewSimilarProductsViewModel$saveProductToList$2(ProductCard productCard, ViewSimilarProductsViewModel viewSimilarProductsViewModel, String str) {
        this.d = productCard;
        this.e = viewSimilarProductsViewModel;
        this.f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel.q6(r4, r3, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2$emit$1
            if (r0 == 0) goto L13
            r0 = r12
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2$emit$1 r0 = (au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2$emit$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2$emit$1 r0 = new au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2$emit$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            java.lang.String r3 = r10.f
            au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel r4 = r10.e
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3a
            if (r2 == r6) goto L36
            if (r2 != r5) goto L2e
            kotlin.ResultKt.b(r12)
            goto L99
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.ResultKt.b(r12)
            goto L90
        L3a:
            kotlin.ResultKt.b(r12)
            au.com.woolworths.product.models.ProductId$Companion r12 = au.com.woolworths.product.models.ProductId.INSTANCE
            au.com.woolworths.product.models.ProductCard r2 = r10.d
            java.lang.String r7 = r2.getProductId()
            au.com.woolworths.product.models.ProductId r12 = r12.create(r7)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L4f:
            boolean r7 = r11.hasNext()
            r8 = 0
            if (r7 == 0) goto L68
            java.lang.Object r7 = r11.next()
            r9 = r7
            au.com.woolworths.shop.lists.data.model.ProductListItem r9 = (au.com.woolworths.shop.lists.data.model.ProductListItem) r9
            au.com.woolworths.product.models.ProductId r9 = r9.getProductId()
            boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r12)
            if (r9 == 0) goto L4f
            goto L69
        L68:
            r7 = r8
        L69:
            au.com.woolworths.shop.lists.data.model.ProductListItem r7 = (au.com.woolworths.shop.lists.data.model.ProductListItem) r7
            au.com.woolworths.product.models.ProductShoppingList r11 = r2.getProductShoppingList()
            double r11 = r11.getMinimum()
            float r11 = (float) r11
            if (r7 == 0) goto L7f
            float r12 = r7.getQuantity()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r12)
        L7f:
            boolean r12 = kotlin.jvm.internal.Intrinsics.b(r8, r11)
            if (r12 != 0) goto L90
            au.com.woolworths.shop.lists.data.ShoppingListItemInteractor r12 = r4.f
            r0.r = r6
            java.lang.Object r11 = r12.a(r3, r2, r11, r0)
            if (r11 != r1) goto L90
            goto L98
        L90:
            r0.r = r5
            java.lang.Object r11 = au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel.q6(r4, r3, r0)
            if (r11 != r1) goto L99
        L98:
            return r1
        L99:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$saveProductToList$2.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
