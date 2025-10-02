package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.landing.EverydayExtrasLandingInteractorImpl;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessageKt;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel$fetchLandingFeed$1", f = "EverydayExtraLandingViewModel.kt", l = {74}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EverydayExtraLandingViewModel$fetchLandingFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraLandingViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraLandingViewModel$fetchLandingFeed$1(EverydayExtraLandingViewModel everydayExtraLandingViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraLandingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraLandingViewModel$fetchLandingFeed$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraLandingViewModel$fetchLandingFeed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        EverydayExtraLandingViewModel everydayExtraLandingViewModel = this.q;
        MutableStateFlow mutableStateFlow = everydayExtraLandingViewModel.i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
        } catch (NoConnectivityException unused) {
            EverydayExtraLandingViewModel.p6(everydayExtraLandingViewModel, FullPageError.ConnectionError.f8581a);
        } catch (ServerErrorException unused2) {
            EverydayExtraLandingViewModel.p6(everydayExtraLandingViewModel, FullPageError.ServerError.f8582a);
        }
        if (i == 0) {
            ResultKt.b(obj);
            RewardsServiceMessage rewardsServiceMessage = everydayExtraLandingViewModel.k;
            if (rewardsServiceMessage == null || !RewardsServiceMessageKt.a(rewardsServiceMessage)) {
                EverydayExtraLandingContract.ViewState viewState = (EverydayExtraLandingContract.ViewState) mutableStateFlow.getValue();
                if (viewState instanceof EverydayExtraLandingContract.ViewState.Content) {
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value2, EverydayExtraLandingContract.ViewState.Content.c((EverydayExtraLandingContract.ViewState.Content) viewState, null, null, true, 11)));
                } else {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, EverydayExtraLandingContract.ViewState.Loading.f6095a));
                }
                EverydayExtrasLandingInteractorImpl everydayExtrasLandingInteractorImpl = everydayExtraLandingViewModel.f;
                this.p = 1;
                obj = everydayExtrasLandingInteractorImpl.f6209a.a(everydayExtrasLandingInteractorImpl.b.a(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        EverydayExtrasLandingFeed everydayExtrasLandingFeed = (EverydayExtrasLandingFeed) obj;
        do {
            value3 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value3, new EverydayExtraLandingContract.ViewState.Content(everydayExtrasLandingFeed, everydayExtraLandingViewModel.k, false, false)));
        return Unit.f24250a;
    }
}
