package au.com.woolworths.feature.product.list.compose.facets;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$2", f = "FacetsChipGroup.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FacetsChipGroupKt$FacetsChipGroup$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ Ref.IntRef r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacetsChipGroupKt$FacetsChipGroup$2(LazyListState lazyListState, Ref.IntRef intRef, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = intRef;
        this.s = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FacetsChipGroupKt$FacetsChipGroup$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FacetsChipGroupKt$FacetsChipGroup$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowR = FlowKt.r(SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(this.q, 1)));
            final Ref.IntRef intRef = this.r;
            final Function0 function0 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$2.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    Ref.IntRef intRef2 = intRef;
                    int i2 = iIntValue - intRef2.d;
                    intRef2.d = iIntValue;
                    if (i2 > 10) {
                        function0.invoke();
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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
