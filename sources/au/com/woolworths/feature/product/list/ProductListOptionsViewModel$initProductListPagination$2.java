package au.com.woolworths.feature.product.list;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.data.ProductListData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListOptionsViewModel$initProductListPagination$2", f = "ProductListOptionsViewModel.kt", l = {603}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListOptionsViewModel$initProductListPagination$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsViewModel q;
    public final /* synthetic */ Activities.ProductList.ExtrasByCategory r;
    public final /* synthetic */ ProductListData s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsViewModel$initProductListPagination$2(ProductListOptionsViewModel productListOptionsViewModel, Activities.ProductList.ExtrasByCategory extrasByCategory, ProductListData productListData, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsViewModel;
        this.r = extrasByCategory;
        this.s = productListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListOptionsViewModel$initProductListPagination$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListOptionsViewModel$initProductListPagination$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProductListOptionsViewModel productListOptionsViewModel = this.q;
            ProductListInteractor productListInteractor = productListOptionsViewModel.f;
            Integer num = new Integer(0);
            Activities.ProductList.Extras extras = productListOptionsViewModel.o;
            if (extras == null) {
                Intrinsics.p("pageExtras");
                throw null;
            }
            String str = this.r.d;
            boolean zA6 = productListOptionsViewModel.A6();
            this.p = 1;
            if (ProductListInteractor.i(productListInteractor, num, extras, str, this.s, null, null, null, zA6, this, 96) == coroutineSingletons) {
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
