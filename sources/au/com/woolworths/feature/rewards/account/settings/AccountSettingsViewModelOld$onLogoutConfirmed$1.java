package au.com.woolworths.feature.rewards.account.settings;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsContractOld;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld$onLogoutConfirmed$1", f = "AccountSettingsViewModelOld.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsViewModelOld$onLogoutConfirmed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsViewModelOld q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModelOld$onLogoutConfirmed$1(AccountSettingsViewModelOld accountSettingsViewModelOld, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsViewModelOld;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModelOld$onLogoutConfirmed$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModelOld$onLogoutConfirmed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        AccountSettingsViewModelOld accountSettingsViewModelOld = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsAccountInteractor rewardsAccountInteractor = accountSettingsViewModelOld.e;
                this.p = 1;
                obj = rewardsAccountInteractor.logout(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean z = this.r;
            BuildersKt.c(ViewModelKt.a(accountSettingsViewModelOld), null, null, new AccountSettingsViewModelOld$onLogoutComplete$1(accountSettingsViewModelOld, null), 3);
            accountSettingsViewModelOld.o.f(new AccountSettingsContractOld.Actions.CompleteLogout(z));
            if (!zBooleanValue) {
                Timber.f27013a.e("Logout failed", new Object[0]);
            }
        } catch (Exception e) {
            accountSettingsViewModelOld.q6(e);
        }
        return Unit.f24250a;
    }
}
