package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.product.interactor.ProductsInteractor;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import java.util.List;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$setProductIds$1", f = "InstoreMapViewModel.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreMapViewModel$setProductIds$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapViewModel q;
    public final /* synthetic */ List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$setProductIds$1(InstoreMapViewModel instoreMapViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapViewModel;
        this.r = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$setProductIds$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapViewModel$setProductIds$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        InstoreMapViewModel instoreMapViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ProductsInteractor productsInteractor = instoreMapViewModel.p;
            String strA = instoreMapViewModel.g.a();
            this.p = 1;
            obj = ProductsInteractor.a(productsInteractor, this.r, strA, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        instoreMapViewModel.B6(((ProductListByProductIdsApiData) obj).getProducts());
        return Unit.f24250a;
    }
}
