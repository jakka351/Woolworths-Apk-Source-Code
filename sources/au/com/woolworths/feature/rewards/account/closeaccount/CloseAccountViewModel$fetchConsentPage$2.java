package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccount;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountViewModel$fetchConsentPage$2", f = "CloseAccountViewModel.kt", l = {52}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CloseAccountViewModel$fetchConsentPage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CloseAccountViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountViewModel$fetchConsentPage$2(CloseAccountViewModel closeAccountViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = closeAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountViewModel$fetchConsentPage$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountViewModel$fetchConsentPage$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        CloseAccountViewModel closeAccountViewModel = this.q;
        MutableStateFlow mutableStateFlow = closeAccountViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CloseAccountInteractor closeAccountInteractor = closeAccountViewModel.e;
                this.p = 1;
                CloseAccountRepository closeAccountRepository = closeAccountInteractor.f5687a;
                closeAccountRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new CloseAccountRepository$fetchConsentPage$2(closeAccountRepository, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            DeleteAccount deleteAccount = (DeleteAccount) obj;
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value3, new CloseAccountContract.ViewState.ConsentPage(deleteAccount, false, false)));
        } catch (NoConnectivityException unused) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new CloseAccountContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)));
        } catch (ServerErrorException unused2) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new CloseAccountContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)));
        }
        return Unit.f24250a;
    }
}
