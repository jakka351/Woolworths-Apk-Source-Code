package au.com.woolworths.feature.product.list;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.data.ProductListData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListOptionsViewModel$initProductListPagination$5", f = "ProductListOptionsViewModel.kt", l = {639}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListOptionsViewModel$initProductListPagination$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsViewModel q;
    public final /* synthetic */ Activities.ProductList.ExtrasByFacet r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ ProductListData t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsViewModel$initProductListPagination$5(ProductListOptionsViewModel productListOptionsViewModel, Activities.ProductList.ExtrasByFacet extrasByFacet, Map map, ProductListData productListData, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsViewModel;
        this.r = extrasByFacet;
        this.s = map;
        this.t = productListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListOptionsViewModel$initProductListPagination$5(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListOptionsViewModel$initProductListPagination$5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProductListInteractor productListInteractor = this.q.f;
            Integer num = new Integer(0);
            Activities.ProductList.ExtrasByFacet extrasByFacet = this.r;
            String str = extrasByFacet.d;
            String str2 = extrasByFacet.e;
            String str3 = extrasByFacet.f;
            String str4 = extrasByFacet.g;
            String str5 = extrasByFacet.h;
            this.p = 1;
            if (productListInteractor.j(num, str, str2, str3, str4, str5, this.s, this.t, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
