package au.com.woolworths.feature.product.list;

import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$onEdrBoostButtonClick$1", f = "ProductListViewModel.kt", l = {1880}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListViewModel$onEdrBoostButtonClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public EdrOfferBannerData p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ProductListViewModel s;
    public final /* synthetic */ EdrOfferBannerData t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$onEdrBoostButtonClick$1(ProductListViewModel productListViewModel, EdrOfferBannerData edrOfferBannerData, Continuation continuation) {
        super(2, continuation);
        this.s = productListViewModel;
        this.t = edrOfferBannerData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductListViewModel$onEdrBoostButtonClick$1 productListViewModel$onEdrBoostButtonClick$1 = new ProductListViewModel$onEdrBoostButtonClick$1(this.s, this.t, continuation);
        productListViewModel$onEdrBoostButtonClick$1.r = obj;
        return productListViewModel$onEdrBoostButtonClick$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListViewModel$onEdrBoostButtonClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:21:0x0099, B:23:0x009f, B:25:0x00d7, B:28:0x00f8, B:30:0x00fe, B:32:0x0132, B:17:0x0084), top: B:44:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8 A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:21:0x0099, B:23:0x009f, B:25:0x00d7, B:28:0x00f8, B:30:0x00fe, B:32:0x0132, B:17:0x0084), top: B:44:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListViewModel$onEdrBoostButtonClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
