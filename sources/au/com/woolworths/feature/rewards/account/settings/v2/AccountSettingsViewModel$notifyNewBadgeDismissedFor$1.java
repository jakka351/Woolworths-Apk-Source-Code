package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.data.AccountHomeOption;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$notifyNewBadgeDismissedFor$1", f = "AccountSettingsViewModel.kt", l = {474}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsViewModel$notifyNewBadgeDismissedFor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsViewModel q;
    public final /* synthetic */ AccountHomeOption r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModel$notifyNewBadgeDismissedFor$1(AccountSettingsViewModel accountSettingsViewModel, AccountHomeOption accountHomeOption, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsViewModel;
        this.r = accountHomeOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModel$notifyNewBadgeDismissedFor$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModel$notifyNewBadgeDismissedFor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AccountSettingsViewModel accountSettingsViewModel = this.q;
                AccountHomeOption accountHomeOption = this.r;
                AccountSettingsInteractor accountSettingsInteractor = accountSettingsViewModel.e;
                String f5710a = accountHomeOption.getF5710a();
                this.p = 1;
                AccountSettingsRepository accountSettingsRepository = accountSettingsInteractor.f5786a;
                accountSettingsRepository.c.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                if (BuildersKt.f(DefaultIoScheduler.f, new AccountSettingsRepository$notifyNewBadgeDismissed$2(accountSettingsRepository, f5710a, null), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (NoConnectivityException | ServerErrorException unused) {
        }
        return Unit.f24250a;
    }
}
