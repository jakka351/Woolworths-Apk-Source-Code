package au.com.woolworths.shop.cart.ui.productalternative;

import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel$fetchPage$2", f = "ProductReviewAlternativeViewModel.kt", l = {63}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductReviewAlternativeViewModel$fetchPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutableStateFlow p;
    public ProductReviewAlternativeViewModel q;
    public Object r;
    public ProductReviewAlternativeContract.ViewState s;
    public int t;
    public final /* synthetic */ ProductReviewAlternativeViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductReviewAlternativeViewModel$fetchPage$2(ProductReviewAlternativeViewModel productReviewAlternativeViewModel, Continuation continuation) {
        super(2, continuation);
        this.u = productReviewAlternativeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductReviewAlternativeViewModel$fetchPage$2(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductReviewAlternativeViewModel$fetchPage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:12:0x0042). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract$ViewState r1 = r8.s
            java.lang.Object r3 = r8.r
            au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel r4 = r8.q
            kotlinx.coroutines.flow.MutableStateFlow r5 = r8.p
            kotlin.ResultKt.b(r9)
            goto L42
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel r9 = r8.u
            kotlinx.coroutines.flow.MutableStateFlow r1 = r9.i
            r4 = r9
            r5 = r1
        L26:
            java.lang.Object r3 = r5.getValue()
            r1 = r3
            au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract$ViewState r1 = (au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract.ViewState) r1
            au.com.woolworths.shop.cart.domain.interactor.ProductReviewAlternativeFetchPage r9 = r4.f
            java.lang.String r6 = r4.e
            r8.p = r5
            r8.q = r4
            r8.r = r3
            r8.s = r1
            r8.t = r2
            java.lang.Object r9 = r9.a(r6, r8)
            if (r9 != r0) goto L42
            return r0
        L42:
            au.com.woolworths.shop.cart.domain.model.PageResult r9 = (au.com.woolworths.shop.cart.domain.model.PageResult) r9
            r6 = 10
            r7 = 0
            au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract$ViewState r9 = au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract.ViewState.a(r1, r7, r7, r9, r6)
            boolean r9 = r5.d(r3, r9)
            if (r9 == 0) goto L26
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel$fetchPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
