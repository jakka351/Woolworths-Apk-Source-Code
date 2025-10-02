package au.com.woolworths.feature.rewards.account.closeaccount;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountViewModel$closeAccount$2", f = "CloseAccountViewModel.kt", l = {110}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class CloseAccountViewModel$closeAccount$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CloseAccountViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountViewModel$closeAccount$2(CloseAccountViewModel closeAccountViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = closeAccountViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountViewModel$closeAccount$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountViewModel$closeAccount$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB;
        Object value2;
        Object objB2;
        Object value3;
        Object objB3;
        Object value4;
        Object value5;
        Object objB4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CloseAccountViewModel closeAccountViewModel = this.q;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    CloseAccountInteractor closeAccountInteractor = closeAccountViewModel.e;
                    String str = this.r;
                    this.p = 1;
                    obj = closeAccountInteractor.a(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                DeleteAccountConfirmation deleteAccountConfirmation = (DeleteAccountConfirmation) obj;
                MutableStateFlow mutableStateFlow = closeAccountViewModel.f;
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value4, new CloseAccountContract.ViewState.ConfirmationPage(deleteAccountConfirmation)));
                MutableStateFlow mutableStateFlow2 = closeAccountViewModel.f;
                do {
                    value5 = mutableStateFlow2.getValue();
                    objB4 = (CloseAccountContract.ViewState) value5;
                    if (objB4 instanceof CloseAccountContract.ViewState.ConsentPage) {
                        objB4 = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB4, false, false, 3);
                    }
                } while (!mutableStateFlow2.d(value5, objB4));
            } catch (NoConnectivityException unused) {
                closeAccountViewModel.h.k(new CloseAccountContract.Action.ShowErrorMessage(R.string.close_account_confirm_network_error));
                MutableStateFlow mutableStateFlow3 = closeAccountViewModel.f;
                do {
                    value2 = mutableStateFlow3.getValue();
                    objB2 = (CloseAccountContract.ViewState) value2;
                    if (objB2 instanceof CloseAccountContract.ViewState.ConsentPage) {
                        objB2 = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB2, false, false, 3);
                    }
                } while (!mutableStateFlow3.d(value2, objB2));
            } catch (ServerErrorException unused2) {
                closeAccountViewModel.h.k(new CloseAccountContract.Action.ShowErrorMessage(R.string.close_account_confirm_server_error));
                MutableStateFlow mutableStateFlow4 = closeAccountViewModel.f;
                do {
                    value = mutableStateFlow4.getValue();
                    objB = (CloseAccountContract.ViewState) value;
                    if (objB instanceof CloseAccountContract.ViewState.ConsentPage) {
                        objB = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB, false, false, 3);
                    }
                } while (!mutableStateFlow4.d(value, objB));
            }
            return Unit.f24250a;
        } catch (Throwable th) {
            MutableStateFlow mutableStateFlow5 = closeAccountViewModel.f;
            do {
                value3 = mutableStateFlow5.getValue();
                objB3 = (CloseAccountContract.ViewState) value3;
                if (objB3 instanceof CloseAccountContract.ViewState.ConsentPage) {
                    objB3 = CloseAccountContract.ViewState.ConsentPage.b((CloseAccountContract.ViewState.ConsentPage) objB3, false, false, 3);
                }
            } while (!mutableStateFlow5.d(value3, objB3));
            throw th;
        }
    }
}
