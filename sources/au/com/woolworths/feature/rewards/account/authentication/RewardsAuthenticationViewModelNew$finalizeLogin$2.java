package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationFullPageMessageError;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationViewModelNew$finalizeLogin$2", f = "RewardsAuthenticationViewModelNew.kt", l = {58}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsAuthenticationViewModelNew$finalizeLogin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsAuthenticationViewModelNew q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAuthenticationViewModelNew$finalizeLogin$2(RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew, String str, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsAuthenticationViewModelNew;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsAuthenticationViewModelNew$finalizeLogin$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAuthenticationViewModelNew$finalizeLogin$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew = this.q;
        MutableStateFlow mutableStateFlow = rewardsAuthenticationViewModelNew.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsAccountInteractor rewardsAccountInteractor = rewardsAuthenticationViewModelNew.e;
                String str = this.r;
                this.p = 1;
                if (rewardsAccountInteractor.exchangeToken(str, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            rewardsAuthenticationViewModelNew.j.f(RewardsAuthenticationContractNew.Action.LaunchHomepage.f5658a);
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new RewardsAuthenticationContractNew.ViewState.Error(RewardsAuthenticationFullPageMessageError.ConnectionError.f5663a)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new RewardsAuthenticationContractNew.ViewState.Error(RewardsAuthenticationFullPageMessageError.ServerError.f5665a)));
        }
        return Unit.f24250a;
    }
}
