package au.com.woolworths.feature.rewards.account.settings.v2;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import com.woolworths.R;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$logout$2", f = "AccountSettingsViewModel.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsViewModel$logout$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsViewModel q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModel$logout$2(AccountSettingsViewModel accountSettingsViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsViewModel;
        this.r = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModel$logout$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModel$logout$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        AccountSettingsViewModel accountSettingsViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsAccountInteractor rewardsAccountInteractor = accountSettingsViewModel.f;
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
            AccountSettingsViewModel.p6(accountSettingsViewModel, ((Boolean) obj).booleanValue(), this.r);
        } catch (Exception e) {
            if (e instanceof NoConnectivityException) {
                MutableStateFlow mutableStateFlow = accountSettingsViewModel.k;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, null, null, false, false, false, 127)));
                accountSettingsViewModel.m.k(new AccountSettingsContract.Action.ShowErrorMessage(new ResText(R.string.rewards_logout_internet_error)));
            } else {
                BuildersKt.c(ViewModelKt.a(accountSettingsViewModel), null, null, new AccountSettingsViewModel$onLogoutFailed$2(accountSettingsViewModel, null), 3);
            }
        }
        return Unit.f24250a;
    }
}
