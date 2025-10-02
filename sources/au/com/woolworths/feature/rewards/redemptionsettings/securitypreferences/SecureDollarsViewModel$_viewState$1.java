package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SecureDollarsViewModel$_viewState$1 extends FunctionReferenceImpl implements Function1<SecureDollarsContract.Action, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SecureDollarsContract.Action p0 = (SecureDollarsContract.Action) obj;
        Intrinsics.h(p0, "p0");
        SecureDollarsViewModel secureDollarsViewModel = (SecureDollarsViewModel) this.receiver;
        if (p0 instanceof SecureDollarsContract.ViewAction) {
            MutableStateFlow mutableStateFlow = secureDollarsViewModel.g;
            SecureDollarsContract.ViewState viewState = (SecureDollarsContract.ViewState) mutableStateFlow.getValue();
            mutableStateFlow.setValue(SecureDollarsContract.ViewState.a(viewState, null, null, null, viewState.e, 111));
        } else {
            secureDollarsViewModel.getClass();
            if (p0.equals(SecureDollarsContract.ViewModelAction.Retry.f6445a)) {
                BuildersKt.c(ViewModelKt.a(secureDollarsViewModel), null, null, new SecureDollarsViewModel$secureRewardsDollars$1(secureDollarsViewModel, null), 3);
            }
        }
        return Unit.f24250a;
    }
}
