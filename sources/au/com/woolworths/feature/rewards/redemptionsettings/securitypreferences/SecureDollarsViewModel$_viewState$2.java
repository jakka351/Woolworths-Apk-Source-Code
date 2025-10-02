package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SecureDollarsViewModel$_viewState$2 extends FunctionReferenceImpl implements Function1<SecureDollarsContract.ViewAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SecureDollarsContract.ViewAction p0 = (SecureDollarsContract.ViewAction) obj;
        Intrinsics.h(p0, "p0");
        ((SecureDollarsViewModel) this.receiver).q6(p0);
        return Unit.f24250a;
    }
}
