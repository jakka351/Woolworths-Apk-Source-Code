package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$initViewStateObserver$1", f = "ProductListOptionsFilterFragment.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListOptionsFilterFragment$initViewStateObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsFilterFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$initViewStateObserver$1$1", f = "ProductListOptionsFilterFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$initViewStateObserver$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ProductListOptionsContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ ProductListOptionsFilterFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductListOptionsFilterFragment productListOptionsFilterFragment, Continuation continuation) {
            super(2, continuation);
            this.q = productListOptionsFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ProductListOptionsContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ProductListOptionsContract.ViewState viewState = (ProductListOptionsContract.ViewState) this.p;
            ProductListOptionsFilterController productListOptionsFilterController = this.q.m;
            if (productListOptionsFilterController != null) {
                productListOptionsFilterController.setData(viewState.f);
                return Unit.f24250a;
            }
            Intrinsics.p("controller");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsFilterFragment$initViewStateObserver$1(ProductListOptionsFilterFragment productListOptionsFilterFragment, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListOptionsFilterFragment$initViewStateObserver$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListOptionsFilterFragment$initViewStateObserver$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProductListOptionsFilterFragment productListOptionsFilterFragment = this.q;
            StateFlow stateFlow = productListOptionsFilterFragment.I1().j;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListOptionsFilterFragment, null);
            this.p = 1;
            if (FlowKt.h(stateFlow, anonymousClass1, this) == coroutineSingletons) {
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
