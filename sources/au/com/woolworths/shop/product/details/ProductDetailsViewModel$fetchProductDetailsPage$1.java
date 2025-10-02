package au.com.woolworths.shop.product.details;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsViewModel$fetchProductDetailsPage$1", f = "ProductDetailsViewModel.kt", l = {250, 282}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProductDetailsViewModel$fetchProductDetailsPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductDetailsViewModel q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsViewModel$fetchProductDetailsPage$1(ProductDetailsViewModel productDetailsViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = productDetailsViewModel;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsViewModel$fetchProductDetailsPage$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsViewModel$fetchProductDetailsPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r11.y6(r23) == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[DONT_GENERATE] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.details.ProductDetailsViewModel$fetchProductDetailsPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
