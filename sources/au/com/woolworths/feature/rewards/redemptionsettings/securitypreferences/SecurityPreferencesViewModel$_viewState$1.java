package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SecurityPreferencesViewModel$_viewState$1 extends FunctionReferenceImpl implements Function1<SecurityPreferencesContract.Action, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((SecurityPreferencesContract.Action) obj);
        return Unit.f24250a;
    }

    public final void m(SecurityPreferencesContract.Action p0) {
        Intrinsics.h(p0, "p0");
        SecurityPreferencesViewModel securityPreferencesViewModel = (SecurityPreferencesViewModel) this.receiver;
        if (p0 instanceof SecurityPreferencesContract.ViewAction) {
            MutableStateFlow mutableStateFlow = securityPreferencesViewModel.g;
            mutableStateFlow.setValue(SecurityPreferencesContract.ViewState.a((SecurityPreferencesContract.ViewState) mutableStateFlow.getValue(), null, (SecurityPreferencesContract.ViewAction) p0, 13));
        } else {
            if (p0 instanceof SecurityPreferencesContract.ViewModelAction.RetryFetch) {
                securityPreferencesViewModel.getClass();
                BuildersKt.c(ViewModelKt.a(securityPreferencesViewModel), null, null, new SecurityPreferencesViewModel$fetchSecurePreference$1(securityPreferencesViewModel, null), 3);
                return;
            }
            securityPreferencesViewModel.getClass();
            if (p0 instanceof SecurityPreferencesContract.ViewModelAction.ChangeLock) {
                BuildersKt.c(ViewModelKt.a(securityPreferencesViewModel), null, null, new SecurityPreferencesViewModel$updateSecurePreference$1(((SecurityPreferencesContract.ViewModelAction.ChangeLock) p0).f6457a, securityPreferencesViewModel, null), 3);
            }
        }
    }
}
