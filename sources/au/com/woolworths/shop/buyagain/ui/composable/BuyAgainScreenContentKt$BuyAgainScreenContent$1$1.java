package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$1$1", f = "BuyAgainScreenContent.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BuyAgainScreenContentKt$BuyAgainScreenContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ MutableIntState r;
    public final /* synthetic */ MutableIntState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyAgainScreenContentKt$BuyAgainScreenContent$1$1(LazyListState lazyListState, MutableIntState mutableIntState, MutableIntState mutableIntState2, Continuation continuation) {
        super(2, continuation);
        this.q = lazyListState;
        this.r = mutableIntState;
        this.s = mutableIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BuyAgainScreenContentKt$BuyAgainScreenContent$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BuyAgainScreenContentKt$BuyAgainScreenContent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowM = SnapshotStateKt.m(new au.com.woolworths.design.wx.component.topbar.a(this.q, 12));
            final MutableIntState mutableIntState = this.r;
            final MutableIntState mutableIntState2 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.buyagain.ui.composable.BuyAgainScreenContentKt$BuyAgainScreenContent$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    if (!((Boolean) obj2).booleanValue()) {
                        MutableIntState mutableIntState3 = mutableIntState;
                        int i2 = -mutableIntState3.d();
                        MutableIntState mutableIntState4 = mutableIntState2;
                        if (i2 > mutableIntState4.d() / 2) {
                            mutableIntState3.i(-mutableIntState4.d());
                        } else {
                            mutableIntState3.i(0);
                        }
                    }
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
