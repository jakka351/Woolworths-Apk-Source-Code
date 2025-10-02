package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$4$1", f = "FreshMagContentScreen.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagContentScreenKt$FreshMagContent$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PagerState q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagContentScreenKt$FreshMagContent$1$4$1(PagerState pagerState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = pagerState;
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagContentScreenKt$FreshMagContent$1$4$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagContentScreenKt$FreshMagContent$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final PagerState pagerState = this.q;
            Flow flowM = SnapshotStateKt.m(new Function0<Integer>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$4$1.1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(pagerState.j());
                }
            });
            final Function1 function1 = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContent$1$4$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    function1.invoke(new Integer(((Number) obj2).intValue()));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
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
