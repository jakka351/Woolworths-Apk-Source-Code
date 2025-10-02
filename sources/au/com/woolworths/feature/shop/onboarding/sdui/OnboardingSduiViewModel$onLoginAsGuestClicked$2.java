package au.com.woolworths.feature.shop.onboarding.sdui;

import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiContract;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel$onLoginAsGuestClicked$2", f = "OnboardingSduiViewModel.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OnboardingSduiViewModel$onLoginAsGuestClicked$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OnboardingSduiViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingSduiViewModel$onLoginAsGuestClicked$2(OnboardingSduiViewModel onboardingSduiViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = onboardingSduiViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingSduiViewModel$onLoginAsGuestClicked$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingSduiViewModel$onLoginAsGuestClicked$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OnboardingSduiViewModel onboardingSduiViewModel = this.q;
        BranchDeepLinkInteractorImpl branchDeepLinkInteractorImpl = onboardingSduiViewModel.f;
        MutableStateFlow mutableStateFlow = onboardingSduiViewModel.k;
        OnboardingInteractorImpl onboardingInteractorImpl = onboardingSduiViewModel.g;
        SharedFlowImpl sharedFlowImpl = onboardingSduiViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                mutableStateFlow.setValue(OnboardingSduiContract.ViewState.Loading.f7970a);
                MaybeFlatMapCompletable maybeFlatMapCompletableD = onboardingSduiViewModel.h.d();
                this.p = 1;
                if (RxAwaitKt.a(maybeFlatMapCompletableD, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (branchDeepLinkInteractorImpl.e(branchDeepLinkInteractorImpl.b())) {
                sharedFlowImpl.f(new OnboardingSduiContract.NavigationAction.NavigateToBranchLink(branchDeepLinkInteractorImpl.b()));
            } else {
                sharedFlowImpl.f(new OnboardingSduiContract.NavigationAction.ContinueAsGuest());
            }
        } finally {
            try {
                return Unit.f24250a;
            } finally {
            }
        }
        return Unit.f24250a;
    }
}
