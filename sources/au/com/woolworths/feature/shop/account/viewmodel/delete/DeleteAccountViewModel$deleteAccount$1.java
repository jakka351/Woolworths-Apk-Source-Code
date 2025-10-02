package au.com.woolworths.feature.shop.account.viewmodel.delete;

import au.com.woolworths.analytics.supers.more.accountdeletion.AccountDeletionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.account.domain.delete.DeleteAccountInteractorImpl;
import au.com.woolworths.feature.shop.account.model.delete.DeleteAccountResultData;
import au.com.woolworths.feature.shop.account.ui.model.DeletionError;
import au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.account.viewmodel.delete.DeleteAccountViewModel$deleteAccount$1", f = "DeleteAccountViewModel.kt", l = {120}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class DeleteAccountViewModel$deleteAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DeleteAccountViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountViewModel$deleteAccount$1(DeleteAccountViewModel deleteAccountViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = deleteAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountViewModel$deleteAccount$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountViewModel$deleteAccount$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object objB;
        Object value2;
        Object objB2;
        Object value3;
        Object objB3;
        Object value4;
        Object objB4;
        DeleteAccountViewModel deleteAccountViewModel = this.q;
        AnalyticsManager analyticsManager = deleteAccountViewModel.e;
        MutableStateFlow mutableStateFlow = deleteAccountViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        DeletionError.ServerError serverError = DeletionError.ServerError.f6587a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                do {
                    value3 = mutableStateFlow.getValue();
                    objB3 = (DeleteAccountContract.ViewState) value3;
                    if (objB3 instanceof DeleteAccountContract.ViewState.Content) {
                        objB3 = DeleteAccountContract.ViewState.Content.b((DeleteAccountContract.ViewState.Content) objB3, new AccountDeletionState(null, true, null));
                    }
                } while (!mutableStateFlow.d(value3, objB3));
                DeleteAccountInteractorImpl deleteAccountInteractorImpl = deleteAccountViewModel.f;
                this.p = 1;
                obj = deleteAccountInteractorImpl.f6568a.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            DeleteAccountResultData deleteAccountResultData = (DeleteAccountResultData) obj;
            do {
                value4 = mutableStateFlow.getValue();
                objB4 = (DeleteAccountContract.ViewState) value4;
                if (objB4 instanceof DeleteAccountContract.ViewState.Content) {
                    DeleteAccountContract.ViewState.Content content = (DeleteAccountContract.ViewState.Content) objB4;
                    boolean z = deleteAccountResultData.f6572a;
                    objB4 = DeleteAccountContract.ViewState.Content.b(content, new AccountDeletionState(deleteAccountResultData, z, !z ? serverError : null));
                }
            } while (!mutableStateFlow.d(value4, objB4));
            if (deleteAccountResultData.f6572a) {
                deleteAccountViewModel.h.f(DeleteAccountContract.Action.Logout.f6590a);
            }
        } catch (NoConnectivityException unused) {
            analyticsManager.g(AccountDeletionAnalytics.CloseAccount.Action.j);
            do {
                value2 = mutableStateFlow.getValue();
                objB2 = (DeleteAccountContract.ViewState) value2;
                if (objB2 instanceof DeleteAccountContract.ViewState.Content) {
                    objB2 = DeleteAccountContract.ViewState.Content.b((DeleteAccountContract.ViewState.Content) objB2, new AccountDeletionState(null, false, DeletionError.ConnectionError.f6586a));
                }
            } while (!mutableStateFlow.d(value2, objB2));
        } catch (ServerErrorException unused2) {
            analyticsManager.g(AccountDeletionAnalytics.CloseAccount.Action.i);
            do {
                value = mutableStateFlow.getValue();
                objB = (DeleteAccountContract.ViewState) value;
                if (objB instanceof DeleteAccountContract.ViewState.Content) {
                    objB = DeleteAccountContract.ViewState.Content.b((DeleteAccountContract.ViewState.Content) objB, new AccountDeletionState(null, false, serverError));
                }
            } while (!mutableStateFlow.d(value, objB));
        }
        return Unit.f24250a;
    }
}
