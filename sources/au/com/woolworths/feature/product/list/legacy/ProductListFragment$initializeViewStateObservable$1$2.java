package au.com.woolworths.feature.product.list.legacy;

import androidx.paging.PagedList;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListFragment$initializeViewStateObservable$1$2", f = "ProductListFragment.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListFragment$initializeViewStateObservable$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ ProductListFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListFragment$initializeViewStateObservable$1$2(ProductListViewModel productListViewModel, ProductListFragment productListFragment, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = productListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListFragment$initializeViewStateObservable$1$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ProductListFragment$initializeViewStateObservable$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow sharedFlow = this.q.B;
            final ProductListFragment productListFragment = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListFragment$initializeViewStateObservable$1$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    PagedList<T> pagedList = (PagedList) obj2;
                    ProductListController productListController = productListFragment.p;
                    if (productListController != null) {
                        productListController.submitList(pagedList);
                        return Unit.f24250a;
                    }
                    Intrinsics.p("productListController");
                    throw null;
                }
            };
            this.p = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
