package au.com.woolworths.shop.cart.ui.productreview;

import au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$fetchPage$2", f = "ProductReviewViewModel.kt", l = {98}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductReviewViewModel$fetchPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ProductReviewContract.ViewState p;
    public Object q;
    public int r;
    public final /* synthetic */ ProductReviewViewModel s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewViewModel$fetchPage$2(ProductReviewViewModel productReviewViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s = productReviewViewModel;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductReviewViewModel$fetchPage$2(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductReviewViewModel$fetchPage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.r
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel r2 = r6.s
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r6.q
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r1 = r6.p
            kotlin.ResultKt.b(r7)
            goto L3b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.flow.MutableStateFlow r7 = r2.k
            java.lang.Object r1 = r7.getValue()
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r1 = (au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract.ViewState) r1
            au.com.woolworths.shop.cart.domain.interactor.ProductReviewFetchPage r4 = r2.f
            au.com.woolworths.android.onesite.navigation.Activities$ProductsReviewActivity$Source r5 = r2.e
            r6.p = r1
            r6.q = r7
            r6.r = r3
            java.lang.Object r4 = r4.a(r5, r6)
            if (r4 != r0) goto L39
            return r0
        L39:
            r0 = r7
            r7 = r4
        L3b:
            au.com.woolworths.shop.cart.domain.model.PageResult r7 = (au.com.woolworths.shop.cart.domain.model.PageResult) r7
            r1.getClass()
            java.lang.String r1 = "productReviewResult"
            kotlin.jvm.internal.Intrinsics.h(r7, r1)
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r1 = new au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState
            r4 = 0
            r1.<init>(r4, r7)
            r0.setValue(r1)
            kotlinx.coroutines.flow.StateFlow r7 = r2.o
            java.lang.Object r7 = r7.getValue()
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$ViewState r7 = (au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract.ViewState) r7
            au.com.woolworths.shop.cart.domain.model.PageResult r7 = r7.b
            boolean r0 = r7 instanceof au.com.woolworths.shop.cart.domain.model.PageResult.Success
            if (r0 == 0) goto L71
            au.com.woolworths.shop.cart.domain.model.PageResult$Success r7 = (au.com.woolworths.shop.cart.domain.model.PageResult.Success) r7
            java.lang.Object r7 = r7.f10438a
            boolean r0 = r7 instanceof au.com.woolworths.shop.cart.domain.model.ProductReviewResult.Response
            if (r0 == 0) goto L71
            au.com.woolworths.shop.cart.domain.model.ProductReviewResult$Response r7 = (au.com.woolworths.shop.cart.domain.model.ProductReviewResult.Response) r7
            java.util.List r7 = r7.b
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L71
            goto L72
        L71:
            r3 = r4
        L72:
            boolean r7 = r6.t
            if (r7 == 0) goto L7f
            if (r3 == 0) goto L7f
            kotlinx.coroutines.channels.BufferedChannel r7 = r2.l
            au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract$Actions$ShowSnackBarReplaceProductSuccess r0 = au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract.Actions.ShowSnackBarReplaceProductSuccess.f10521a
            r7.k(r0)
        L7f:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel$fetchPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
