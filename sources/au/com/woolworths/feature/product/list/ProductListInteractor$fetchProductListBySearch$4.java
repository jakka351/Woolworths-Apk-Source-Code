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
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/product/list/data/ProductListData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListInteractor$fetchProductListBySearch$4", f = "ProductListInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListInteractor$fetchProductListBySearch$4 extends SuspendLambda implements Function1<Continuation<? super ProductListData>, Object> {
    public final /* synthetic */ Ref.ObjectRef p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListInteractor$fetchProductListBySearch$4(Ref.ObjectRef objectRef, Continuation continuation) {
        super(1, continuation);
        this.p = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ProductListInteractor$fetchProductListBySearch$4(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ProductListInteractor$fetchProductListBySearch$4) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p.d;
    }
}
