package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import android.widget.Toast;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecureDollarsContract;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", UrlHandler.ACTION, "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/SecureDollarsContract$ViewAction;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1", f = "SecurityPreferencesSecureDollarsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1 extends SuspendLambda implements Function3<CoroutineScope, SecureDollarsContract.ViewAction, Continuation<? super Unit>, Object> {
    public /* synthetic */ SecureDollarsContract.ViewAction p;
    public final /* synthetic */ SecurityPreferencesSecureDollarsActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1(SecurityPreferencesSecureDollarsActivity securityPreferencesSecureDollarsActivity, Continuation continuation) {
        super(3, continuation);
        this.q = securityPreferencesSecureDollarsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1 securityPreferencesSecureDollarsActivity$setupUI$1$1$1 = new SecurityPreferencesSecureDollarsActivity$setupUI$1$1$1(this.q, (Continuation) obj3);
        securityPreferencesSecureDollarsActivity$setupUI$1$1$1.p = (SecureDollarsContract.ViewAction) obj2;
        Unit unit = Unit.f24250a;
        securityPreferencesSecureDollarsActivity$setupUI$1$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        SecureDollarsContract.ViewAction viewAction = this.p;
        int i = SecurityPreferencesSecureDollarsActivity.z;
        SecurityPreferencesSecureDollarsActivity securityPreferencesSecureDollarsActivity = this.q;
        ((SecureDollarsViewModel) securityPreferencesSecureDollarsActivity.x.getD()).q6(viewAction);
        if (!(viewAction instanceof SecureDollarsContract.ViewAction.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Toast.makeText(securityPreferencesSecureDollarsActivity, ((SecureDollarsContract.ViewAction.Success) viewAction).f6444a, 1).show();
        securityPreferencesSecureDollarsActivity.finish();
        return Unit.f24250a;
    }
}
