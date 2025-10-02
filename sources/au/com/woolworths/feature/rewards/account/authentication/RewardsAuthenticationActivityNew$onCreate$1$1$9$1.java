package au.com.woolworths.feature.rewards.account.authentication;

import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationContractNew;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationActivityNew$onCreate$1$1$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        RewardsAuthenticationViewModelNew rewardsAuthenticationViewModelNew = (RewardsAuthenticationViewModelNew) this.receiver;
        MutableStateFlow mutableStateFlow = rewardsAuthenticationViewModelNew.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, RewardsAuthenticationContractNew.ViewState.Loading.f5661a));
        rewardsAuthenticationViewModelNew.j.f(new RewardsAuthenticationContractNew.Action.LaunchAuth0Form(false, 4));
        return Unit.f24250a;
    }
}
