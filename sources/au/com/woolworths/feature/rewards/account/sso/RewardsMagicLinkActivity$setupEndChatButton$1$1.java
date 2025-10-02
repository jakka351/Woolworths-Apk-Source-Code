package au.com.woolworths.feature.rewards.account.sso;

import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity$setupEndChatButton$1$1", f = "RewardsMagicLinkActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsMagicLinkActivity$setupEndChatButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ RewardsMagicLinkActivity p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsMagicLinkActivity$setupEndChatButton$1$1(RewardsMagicLinkActivity rewardsMagicLinkActivity, Continuation continuation) {
        super(2, continuation);
        this.p = rewardsMagicLinkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsMagicLinkActivity$setupEndChatButton$1$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsMagicLinkActivity$setupEndChatButton$1$1 rewardsMagicLinkActivity$setupEndChatButton$1$1 = (RewardsMagicLinkActivity$setupEndChatButton$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rewardsMagicLinkActivity$setupEndChatButton$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int i = RewardsMagicLinkActivity.F;
        this.p.P4().j.f(RewardsMagicLinkContract.Actions.EndChat.f5802a);
        return Unit.f24250a;
    }
}
