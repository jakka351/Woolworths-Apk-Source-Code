package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesContract;
import au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.RewardsSecurePreference;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesViewModel$fetchSecurePreference$1", f = "SecurityPreferencesViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SecurityPreferencesViewModel$fetchSecurePreference$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SecurityPreferencesViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityPreferencesViewModel$fetchSecurePreference$1(SecurityPreferencesViewModel securityPreferencesViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = securityPreferencesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SecurityPreferencesViewModel$fetchSecurePreference$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityPreferencesViewModel$fetchSecurePreference$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SecurityPreferencesViewModel securityPreferencesViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SecurityPreferencesViewModel.p6(securityPreferencesViewModel, SecurityPreferencesContract.Content.Loading.f6452a);
                SecurityPreferencesInteractor securityPreferencesInteractor = securityPreferencesViewModel.e;
                this.p = 1;
                obj = securityPreferencesInteractor.f6460a.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            SecurityPreferencesViewModel.p6(securityPreferencesViewModel, new SecurityPreferencesContract.Content.Preference((RewardsSecurePreference) obj));
        } catch (NoConnectivityException unused) {
            SecurityPreferencesViewModel.p6(securityPreferencesViewModel, SecurityPreferencesContract.Content.NoConnection.f6453a);
        } catch (ServerErrorException unused2) {
            SecurityPreferencesViewModel.p6(securityPreferencesViewModel, SecurityPreferencesContract.Content.ServerError.f6455a);
        }
        return Unit.f24250a;
    }
}
