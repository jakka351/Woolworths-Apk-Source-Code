package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.SavedStateHandle;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.legacy.data.ProductListOptions;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOption;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$initObserver$1", f = "ProductListOptionsViewModel.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductListOptionsViewModel$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductListOptionsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListOptionsViewModel$initObserver$1(ProductListOptionsViewModel productListOptionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = productListOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductListOptionsViewModel$initObserver$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductListOptionsViewModel$initObserver$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final ProductListOptionsViewModel productListOptionsViewModel = this.q;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(productListOptionsViewModel.f.o);
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel$initObserver$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    List list;
                    ProductListOptions productListOptions = (ProductListOptions) obj2;
                    ProductListOptionsViewModel productListOptionsViewModel2 = productListOptionsViewModel;
                    productListOptionsViewModel2.p = productListOptions;
                    if (productListOptions == null) {
                        Intrinsics.p("productListOptions");
                        throw null;
                    }
                    Iterator<T> it = productListOptions.d.iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((FilterOption) it.next()).f.size();
                    }
                    if (size <= ((Number) productListOptionsViewModel2.t.getD()).intValue()) {
                        ProductListOptions productListOptions2 = productListOptionsViewModel2.p;
                        if (productListOptions2 == null) {
                            Intrinsics.p("productListOptions");
                            throw null;
                        }
                        list = productListOptions2.d;
                    } else {
                        list = EmptyList.d;
                    }
                    List list2 = list;
                    SavedStateHandle savedStateHandle = productListOptionsViewModel2.h;
                    ProductListOptions productListOptions3 = productListOptionsViewModel2.p;
                    if (productListOptions3 == null) {
                        Intrinsics.p("productListOptions");
                        throw null;
                    }
                    savedStateHandle.b(new ProductListOptionsViewModel.SavedStateProductListOptions(productListOptions3.f, productListOptions3.e, list2, productListOptions3.g, productListOptions3.h, productListOptions3.i), "SAVED_PRODUCT_LIST_OPTIONS");
                    String str = ((ProductListOptionsContract.ViewState) productListOptionsViewModel2.i.getValue()).d;
                    if (str != null) {
                        productListOptionsViewModel2.H6(str);
                    }
                    productListOptionsViewModel2.I6();
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
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
