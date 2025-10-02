package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.product.list.legacy.data.ProductListOptions;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$applyOptionsAndRefresh$1", f = "ProductListOptionsViewModel.kt", l = {891}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListOptionsViewModel$applyOptionsAndRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsViewModel q;
    public final /* synthetic */ ProductListOptions r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsViewModel$applyOptionsAndRefresh$1(ProductListOptionsViewModel productListOptionsViewModel, ProductListOptions productListOptions, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsViewModel;
        this.r = productListOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListOptionsViewModel$applyOptionsAndRefresh$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListOptionsViewModel$applyOptionsAndRefresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ProductListOptionsViewModel productListOptionsViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Activities.ProductList.ExtraProductListSource extraProductListSourceW6 = productListOptionsViewModel.w6();
            this.p = 1;
            obj = productListOptionsViewModel.u6(extraProductListSourceW6, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            productListOptionsViewModel.f.y(this.r);
        }
        return Unit.f24250a;
    }
}
