package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.android.onesite.navigation.Activities;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$updateQuantity$2", f = "ProductReviewViewModel.kt", l = {208}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductReviewViewModel$updateQuantity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductReviewViewModel q;
    public final /* synthetic */ Activities.ProductsReviewActivity.Source r;
    public final /* synthetic */ Set s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewViewModel$updateQuantity$2(ProductReviewViewModel productReviewViewModel, Activities.ProductsReviewActivity.Source source, Set set, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = productReviewViewModel;
        this.r = source;
        this.s = set;
        this.t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductReviewViewModel$updateQuantity$2(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductReviewViewModel$updateQuantity$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r4.p
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel r2 = r4.q
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.b(r5)
            goto L29
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.shop.cart.domain.interactor.ProductReviewUpdateQuantityProduct r5 = r2.g
            r4.p = r3
            au.com.woolworths.android.onesite.navigation.Activities$ProductsReviewActivity$Source r1 = r4.r
            java.util.Set r3 = r4.s
            java.lang.Object r5 = r5.a(r1, r3, r4)
            if (r5 != r0) goto L29
            return r0
        L29:
            au.com.woolworths.shop.cart.domain.model.PageResult r5 = (au.com.woolworths.shop.cart.domain.model.PageResult) r5
            kotlinx.coroutines.flow.MutableStateFlow r0 = r2.k
            java.lang.Object r1 = r0.getValue()
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r1 = (au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract.ViewState) r1
            boolean r2 = r5 instanceof au.com.woolworths.shop.cart.domain.model.PageResult.Fail
            if (r2 == 0) goto L3e
            au.com.woolworths.shop.cart.domain.model.PageResult r2 = r1.b
            boolean r3 = r2 instanceof au.com.woolworths.shop.cart.domain.model.PageResult.Success
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            r2 = r5
        L3f:
            r1.getClass()
            java.lang.String r1 = "productReviewResult"
            kotlin.jvm.internal.Intrinsics.h(r2, r1)
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r1 = new au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState
            r3 = 0
            r1.<init>(r3, r2)
            r0.setValue(r1)
            kotlin.jvm.functions.Function1 r0 = r4.t
            r0.invoke(r5)
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$updateQuantity$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
