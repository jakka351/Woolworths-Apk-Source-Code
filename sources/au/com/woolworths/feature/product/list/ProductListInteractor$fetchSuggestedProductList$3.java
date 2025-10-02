package au.com.woolworths.feature.product.list;

import au.com.woolworths.feature.product.list.data.ProductListData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor$fetchSuggestedProductList$3", f = "ProductListInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchSuggestedProductList$3 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
    public final /* synthetic */ ProductListData p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchSuggestedProductList$3(ProductListData productListData, Continuation continuation) {
        super(1, continuation);
        this.p = productListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ProductListInteractor$fetchSuggestedProductList$3(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ProductListInteractor$fetchSuggestedProductList$3) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p;
    }
}
