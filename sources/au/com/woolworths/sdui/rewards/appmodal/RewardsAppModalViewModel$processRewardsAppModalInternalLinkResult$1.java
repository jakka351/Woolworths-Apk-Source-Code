package au.com.woolworths.sdui.rewards.appmodal;

import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1", f = "RewardsAppModalViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsAppModalViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1(RewardsAppModalViewModel rewardsAppModalViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsAppModalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            BufferedChannel bufferedChannel = this.q.h;
            this.p = 1;
            if (bufferedChannel.z(RewardsAppModalContract.Actions.Finish.f10011a, this) == coroutineSingletons) {
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
