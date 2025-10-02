package au.com.woolworths.feature.rewards.account.callback;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlContract;
import au.com.woolworths.feature.rewards.account.data.RewardsMagicLink;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkInteractor;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlViewModel$launchUrl$1", f = "RewardsCallbackUrlViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsCallbackUrlViewModel$launchUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsCallbackUrlViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCallbackUrlViewModel$launchUrl$1(RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsCallbackUrlViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsCallbackUrlViewModel$launchUrl$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsCallbackUrlViewModel$launchUrl$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsCallbackUrlViewModel rewardsCallbackUrlViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModel, rewardsCallbackUrlViewModel.g, true, null, this.r, null, 2);
                RewardsMagicLinkInteractor rewardsMagicLinkInteractor = rewardsCallbackUrlViewModel.e;
                String str = this.r;
                this.p = 1;
                obj = RewardsMagicLinkInteractor.a(rewardsMagicLinkInteractor, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RewardsMagicLink rewardsMagicLink = (RewardsMagicLink) obj;
            RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModel, rewardsCallbackUrlViewModel.g, false, rewardsMagicLink.c, null, null, 13);
            rewardsCallbackUrlViewModel.i.f(new RewardsCallbackUrlContract.Actions.OpenInWebView(rewardsMagicLink.f5718a, rewardsMagicLink.b));
        } catch (NoConnectivityException unused) {
            RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModel, rewardsCallbackUrlViewModel.g, false, null, null, RewardsCallbackUrlErrorState.d, 7);
        } catch (ServerErrorException unused2) {
            RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModel, rewardsCallbackUrlViewModel.g, false, null, null, RewardsCallbackUrlErrorState.e, 7);
        }
        RewardsCallbackUrlViewModel.p6(rewardsCallbackUrlViewModel, rewardsCallbackUrlViewModel.g, false, null, null, null, 14);
        return Unit.f24250a;
    }
}
