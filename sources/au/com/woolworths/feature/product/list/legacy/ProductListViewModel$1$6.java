package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.MediatorLiveData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$1$6", f = "ProductListViewModel.kt", l = {319}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListViewModel$1$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListViewModel q;
    public final /* synthetic */ MediatorLiveData r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$1$6$1, reason: invalid class name */
    final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ ProductListViewModel d;
        public final /* synthetic */ MediatorLiveData e;

        public AnonymousClass1(ProductListViewModel productListViewModel, MediatorLiveData mediatorLiveData) {
            this.d = productListViewModel;
            this.e = mediatorLiveData;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(au.com.woolworths.feature.product.list.legacy.ProductListContract.ProductListFlow r26, kotlin.coroutines.Continuation r27) {
            /*
                Method dump skipped, instructions count: 501
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$1$6.AnonymousClass1.emit(au.com.woolworths.feature.product.list.legacy.ProductListContract$ProductListFlow, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$1$6(ProductListViewModel productListViewModel, MediatorLiveData mediatorLiveData, Continuation continuation) {
        super(2, continuation);
        this.q = productListViewModel;
        this.r = mediatorLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListViewModel$1$6(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((ProductListViewModel$1$6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        ProductListViewModel productListViewModel = this.q;
        MutableStateFlow mutableStateFlow = productListViewModel.e.n;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(productListViewModel, this.r);
        this.p = 1;
        mutableStateFlow.collect(anonymousClass1, this);
        return coroutineSingletons;
    }
}
