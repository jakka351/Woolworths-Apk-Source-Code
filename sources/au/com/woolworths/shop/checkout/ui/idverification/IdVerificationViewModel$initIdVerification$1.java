package au.com.woolworths.shop.checkout.ui.idverification;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActions;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.idverification.IdVerificationViewModel$initIdVerification$1", f = "IdVerificationViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IdVerificationViewModel$initIdVerification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public Object q;
    public int r;
    public final /* synthetic */ IdVerificationViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationViewModel$initIdVerification$1(IdVerificationViewModel idVerificationViewModel, Continuation continuation) {
        super(2, continuation);
        this.s = idVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IdVerificationViewModel$initIdVerification$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IdVerificationViewModel$initIdVerification$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        IdVerificationViewState idVerificationViewState;
        IdVerificationViewModel idVerificationViewModel = this.s;
        MutableStateFlow mutableStateFlow2 = idVerificationViewModel.g;
        AnalyticsManager analyticsManager = idVerificationViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        FullPageMessage.Error.ServerError serverError = FullPageMessage.Error.ServerError.f8920a;
        FullPageMessage.Error.ConnectionError connectionError = FullPageMessage.Error.ConnectionError.f8919a;
        if (i == 0) {
            ResultKt.b(obj);
            IdVerificationViewState.Content content = ((IdVerificationViewState) mutableStateFlow2.getValue()).f10802a;
            if (content instanceof IdVerificationViewState.Content.Error) {
                FullPageMessage.Error error = ((IdVerificationViewState.Content.Error) content).f10803a;
                if (error.equals(connectionError)) {
                    analyticsManager.c(IdVerificationActions.NetworkErrorTryAgainClick.d);
                } else {
                    if (!error.equals(serverError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    analyticsManager.c(IdVerificationActions.ServerErrorTryAgainClick.d);
                }
            }
            try {
                IdVerificationInteractor idVerificationInteractor = idVerificationViewModel.e;
                this.p = mutableStateFlow2;
                this.q = mutableStateFlow2;
                this.r = 1;
                idVerificationInteractor.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new IdVerificationInteractor$getInitIdVerificationData$2(idVerificationInteractor, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
            } catch (NoConnectivityException unused) {
                analyticsManager.c(IdVerificationActions.NetworkError.d);
                idVerificationViewState = new IdVerificationViewState(new IdVerificationViewState.Content.Error(connectionError));
                mutableStateFlow2.setValue(idVerificationViewState);
                return Unit.f24250a;
            } catch (ServerErrorException unused2) {
                analyticsManager.c(IdVerificationActions.ServerError.d);
                idVerificationViewState = new IdVerificationViewState(new IdVerificationViewState.Content.Error(serverError));
                mutableStateFlow2.setValue(idVerificationViewState);
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (MutableStateFlow) this.q;
            mutableStateFlow = (MutableStateFlow) this.p;
            try {
                ResultKt.b(obj);
            } catch (NoConnectivityException unused3) {
                mutableStateFlow2 = mutableStateFlow;
                analyticsManager.c(IdVerificationActions.NetworkError.d);
                idVerificationViewState = new IdVerificationViewState(new IdVerificationViewState.Content.Error(connectionError));
                mutableStateFlow2.setValue(idVerificationViewState);
                return Unit.f24250a;
            } catch (ServerErrorException unused4) {
                mutableStateFlow2 = mutableStateFlow;
                analyticsManager.c(IdVerificationActions.ServerError.d);
                idVerificationViewState = new IdVerificationViewState(new IdVerificationViewState.Content.Error(serverError));
                mutableStateFlow2.setValue(idVerificationViewState);
                return Unit.f24250a;
            }
        }
        idVerificationViewState = new IdVerificationViewState(new IdVerificationViewState.Content.Loaded((IdVerificationInitData) obj));
        mutableStateFlow2.setValue(idVerificationViewState);
        return Unit.f24250a;
    }
}
