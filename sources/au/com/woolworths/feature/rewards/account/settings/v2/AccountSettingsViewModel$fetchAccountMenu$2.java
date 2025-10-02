package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsViewModel$fetchAccountMenu$2", f = "AccountSettingsViewModel.kt", l = {118}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsViewModel$fetchAccountMenu$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsViewModel$fetchAccountMenu$2(AccountSettingsViewModel accountSettingsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsViewModel$fetchAccountMenu$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsViewModel$fetchAccountMenu$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object objA;
        Object value6;
        Object value7;
        AccountSettingsViewModel accountSettingsViewModel = this.q;
        BufferedChannel bufferedChannel = accountSettingsViewModel.m;
        MutableStateFlow mutableStateFlow = accountSettingsViewModel.k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        AccountSettingsInteractor accountSettingsInteractor = accountSettingsViewModel.e;
                        this.p = 1;
                        objA = accountSettingsInteractor.a(this);
                        if (objA == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                        objA = obj;
                    }
                    RewardsAccountMenu rewardsAccountMenu = (RewardsAccountMenu) objA;
                    do {
                        value6 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value6, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value6, false, false, rewardsAccountMenu, null, false, false, false, 251)));
                    accountSettingsViewModel.o = true;
                    String str = accountSettingsViewModel.p;
                    if (str != null) {
                        accountSettingsViewModel.q6(str);
                    }
                    do {
                        value7 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value7, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value7, false, false, null, null, false, false, false, 252)));
                } catch (NoConnectivityException unused) {
                    if (accountSettingsViewModel.o) {
                        bufferedChannel.k(new AccountSettingsContract.Action.ShowErrorMessage(new ResText(R.string.default_connection_error_description)));
                    } else {
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value, false, false, null, FullPageMessage.Error.ConnectionError.f8915a, false, false, false, 239)));
                    }
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value2, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value2, false, false, null, null, false, false, false, 252)));
                }
            } catch (ServerErrorException unused2) {
                if (accountSettingsViewModel.o) {
                    bufferedChannel.k(new AccountSettingsContract.Action.ShowErrorMessage(new ResText(R.string.default_server_error_description)));
                } else {
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value3, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value3, false, false, null, FullPageMessage.Error.ServerError.f8916a, false, false, false, 239)));
                }
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value4, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value4, false, false, null, null, false, false, false, 252)));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            do {
                value5 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value5, AccountSettingsContract.ViewState.a((AccountSettingsContract.ViewState) value5, false, false, null, null, false, false, false, 252)));
            throw th;
        }
    }
}
