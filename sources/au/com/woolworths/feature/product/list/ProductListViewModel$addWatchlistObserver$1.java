package au.com.woolworths.feature.product.list;

import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MediatorLiveData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$addWatchlistObserver$1", f = "ProductListViewModel.kt", l = {1430}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListViewModel$addWatchlistObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ MediatorLiveData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$addWatchlistObserver$1(ProductListViewModel productListViewModel, MediatorLiveData mediatorLiveData, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = mediatorLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListViewModel$addWatchlistObserver$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListViewModel$addWatchlistObserver$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ProductListViewModel productListViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            CompletableDeferred completableDeferred = productListViewModel.v;
            this.p = 1;
            if (completableDeferred.await(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        CoroutineLiveData coroutineLiveDataB = FlowLiveDataConversions.b(FlowKt.r(productListViewModel.p.e), null, 3);
        MediatorLiveData mediatorLiveData = this.r;
        mediatorLiveData.n(coroutineLiveDataB, new ProductListViewModelKt$sam$androidx_lifecycle_Observer$0(new g(3, productListViewModel, mediatorLiveData)));
        return Unit.f24250a;
    }
}
