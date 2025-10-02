package au.com.woolworths.shop.rewards;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.shop.rewards.ShopRewardsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1", f = "ShopRewardsActivityUi.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ShopRewardsViewModel q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1(ShopRewardsViewModel shopRewardsViewModel, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = shopRewardsViewModel;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw android.support.v4.media.session.a.v(obj);
        }
        ResultKt.b(obj);
        SharedFlowImpl sharedFlowImpl = this.q.m;
        final MutableState mutableState = this.r;
        FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.rewards.ShopRewardsActivityUiKt$ShopRewardsActivityUi$1$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                ShopRewardsContract.Actions actions = (ShopRewardsContract.Actions) obj2;
                if (!(actions instanceof ShopRewardsContract.Actions.ShowTooltip)) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableState.setValue(((ShopRewardsContract.Actions.ShowTooltip) actions).f12891a);
                return Unit.f24250a;
            }
        };
        this.p = 1;
        sharedFlowImpl.getClass();
        SharedFlowImpl.m(sharedFlowImpl, flowCollector, this);
        return coroutineSingletons;
    }
}
