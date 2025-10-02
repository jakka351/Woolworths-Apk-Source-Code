package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SecurityPreferencesViewModel$_viewState$2 extends FunctionReferenceImpl implements Function1<SecurityPreferencesContract.ViewAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SecurityPreferencesContract.ViewAction p0 = (SecurityPreferencesContract.ViewAction) obj;
        Intrinsics.h(p0, "p0");
        MutableStateFlow mutableStateFlow = ((SecurityPreferencesViewModel) this.receiver).g;
        mutableStateFlow.setValue(SecurityPreferencesContract.ViewState.a((SecurityPreferencesContract.ViewState) mutableStateFlow.getValue(), null, null, 13));
        return Unit.f24250a;
    }
}
