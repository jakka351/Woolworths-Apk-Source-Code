package au.com.woolworths.feature.shop.account.viewmodel.delete;

import au.com.woolworths.analytics.supers.more.accountdeletion.AccountDeletionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountTnCData;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel$fetchDeleteAccountTnC$1", f = "DeleteAccountViewModel.kt", l = {89}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class DeleteAccountViewModel$fetchDeleteAccountTnC$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DeleteAccountViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountViewModel$fetchDeleteAccountTnC$1(DeleteAccountViewModel deleteAccountViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = deleteAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountViewModel$fetchDeleteAccountTnC$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountViewModel$fetchDeleteAccountTnC$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        DeleteAccountViewModel deleteAccountViewModel = this.q;
        AnalyticsManager analyticsManager = deleteAccountViewModel.e;
        MutableStateFlow mutableStateFlow = deleteAccountViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value3, DeleteAccountContract.ViewState.Loading.f6593a));
                DeleteAccountInteractorImpl deleteAccountInteractorImpl = deleteAccountViewModel.f;
                this.p = 1;
                obj = deleteAccountInteractorImpl.f6568a.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            DeleteAccountTnCData deleteAccountTnCData = (DeleteAccountTnCData) obj;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value4, new DeleteAccountContract.ViewState.Content(deleteAccountTnCData, AccountDeletionState.d)));
        } catch (NoConnectivityException unused) {
            analyticsManager.g(AccountDeletionAnalytics.CloseAccount.Action.e);
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value2, new DeleteAccountContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a)));
        } catch (ServerErrorException unused2) {
            analyticsManager.g(AccountDeletionAnalytics.CloseAccount.Action.d);
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, new DeleteAccountContract.ViewState.Error(FullPageMessage.Error.ServerError.f8916a)));
        }
        return Unit.f24250a;
    }
}
