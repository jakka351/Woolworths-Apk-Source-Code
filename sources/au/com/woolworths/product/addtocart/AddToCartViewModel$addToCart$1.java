package au.com.woolworths.product.addtocart;

import au.com.woolworths.product.addtocart.AddToCartContract;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.product.addtocart.AddToCartViewModel$addToCart$1", f = "AddToCartViewModel.kt", l = {154, 162}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AddToCartViewModel$addToCart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductCard q;
    public final /* synthetic */ AddToCartViewModel r;
    public final /* synthetic */ ProductCard s;
    public final /* synthetic */ AddToCartContract.ViewState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartViewModel$addToCart$1(ProductCard productCard, AddToCartViewModel addToCartViewModel, ProductCard productCard2, AddToCartContract.ViewState viewState, Continuation continuation) {
        super(2, continuation);
        this.q = productCard;
        this.r = addToCartViewModel;
        this.s = productCard2;
        this.t = viewState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddToCartViewModel$addToCart$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AddToCartViewModel$addToCart$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (au.com.woolworths.product.addtocart.AddToCartViewModel.q6(r2, r3, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (au.com.woolworths.product.addtocart.AddToCartViewModel.p6(r2, r4, r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            au.com.woolworths.product.addtocart.AddToCartContract$ViewState r0 = r7.t
            int r0 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r7.p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.ResultKt.b(r8)
            goto L58
        L1d:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.product.models.ProductCard r8 = r7.s
            au.com.woolworths.product.addtocart.AddToCartViewModel r2 = r7.r
            au.com.woolworths.product.models.ProductCard r5 = r7.q
            if (r5 != 0) goto L3c
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r3 = new au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras
            float r0 = au.com.woolworths.product.extensions.ProductCardExtKt.l(r8, r0)
            au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r5 = au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType.d
            r3.<init>(r8, r0, r5)
            r7.p = r4
            java.lang.Object r8 = au.com.woolworths.product.addtocart.AddToCartViewModel.q6(r2, r3, r7)
            if (r8 != r1) goto L58
            goto L57
        L3c:
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r4 = new au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras
            float r0 = au.com.woolworths.product.extensions.ProductCardExtKt.l(r8, r0)
            au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r6 = au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType.d
            r4.<init>(r8, r0, r6)
            au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras r8 = new au.com.woolworths.product.productbottomsheet.UpdateProductInCartExtras
            r0 = 0
            au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType r6 = au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType.f
            r8.<init>(r5, r0, r6)
            r7.p = r3
            java.lang.Object r8 = au.com.woolworths.product.addtocart.AddToCartViewModel.p6(r2, r4, r8, r7)
            if (r8 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.addtocart.AddToCartViewModel$addToCart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
