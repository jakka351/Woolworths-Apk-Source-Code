package au.com.woolworths.feature.rewards.account.sso;

import au.com.woolworths.android.onesite.modules.rewards.data.RewardsTokenInfo;
import au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkViewModel$refreshToken$1", f = "RewardsMagicLinkViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsMagicLinkViewModel$refreshToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ RewardsTokenInfo p;
    public final /* synthetic */ RewardsMagicLinkViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsMagicLinkViewModel$refreshToken$1(RewardsTokenInfo rewardsTokenInfo, RewardsMagicLinkViewModel rewardsMagicLinkViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = rewardsTokenInfo;
        this.q = rewardsMagicLinkViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsMagicLinkViewModel$refreshToken$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsMagicLinkViewModel$refreshToken$1 rewardsMagicLinkViewModel$refreshToken$1 = (RewardsMagicLinkViewModel$refreshToken$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rewardsMagicLinkViewModel$refreshToken$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String accessToken;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        RewardsTokenInfo rewardsTokenInfo = this.p;
        if (rewardsTokenInfo != null && (accessToken = rewardsTokenInfo.getAccessToken()) != null) {
            RewardsMagicLinkViewModel rewardsMagicLinkViewModel = this.q;
            RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator = rewardsMagicLinkViewModel.h;
            rewardsAppTokenAuthenticator.getClass();
            String strE = rewardsAppTokenAuthenticator.e(accessToken);
            if (strE != null) {
                rewardsMagicLinkViewModel.j.f(new RewardsMagicLinkContract.Actions.ForwardAccessTokenToWebview(strE));
            }
        }
        return Unit.f24250a;
    }
}
