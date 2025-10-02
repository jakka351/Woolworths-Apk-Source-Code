package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryInteractorImpl;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel$fetchSummaryFeed$1", f = "EverydayExtraSummaryViewModel.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraSummaryViewModel$fetchSummaryFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraSummaryViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraSummaryViewModel$fetchSummaryFeed$1(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraSummaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraSummaryViewModel$fetchSummaryFeed$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraSummaryViewModel$fetchSummaryFeed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object objA;
        Object value2;
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = this.q;
        MutableStateFlow mutableStateFlow = everydayExtraSummaryViewModel.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        try {
        } catch (NoConnectivityException unused) {
            everydayExtraSummaryViewModel.u6(FullPageError.ConnectionError.f8581a);
        } catch (ServerErrorException unused2) {
            everydayExtraSummaryViewModel.u6(FullPageError.ServerError.f8582a);
        }
        if (i == 0) {
            ResultKt.b(obj);
            RewardsServiceMessage rewardsServiceMessage = everydayExtraSummaryViewModel.r;
            if (rewardsServiceMessage == null || !RewardsServiceMessageKt.a(rewardsServiceMessage)) {
                EverydayExtraSummaryContract.ViewState viewState = (EverydayExtraSummaryContract.ViewState) mutableStateFlow.getValue();
                if (viewState instanceof EverydayExtraSummaryContract.ViewState.Content) {
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value2, EverydayExtraSummaryContract.ViewState.Content.c((EverydayExtraSummaryContract.ViewState.Content) viewState, null, true, null, null, null, false, false, false, null, null, 1021)));
                } else {
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, EverydayExtraSummaryContract.ViewState.Loading.f6133a));
                }
                EverydayExtrasSummaryInteractorImpl everydayExtrasSummaryInteractorImpl = everydayExtraSummaryViewModel.f;
                String str = everydayExtraSummaryViewModel.k;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.p = 1;
                objA = everydayExtrasSummaryInteractorImpl.f6218a.a(str, everydayExtrasSummaryInteractorImpl.b.a(), this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        objA = obj;
        EverydayExtrasSummaryFeed everydayExtrasSummaryFeed = (EverydayExtrasSummaryFeed) objA;
        boolean zR6 = EverydayExtraSummaryViewModel.r6(everydayExtraSummaryViewModel, everydayExtrasSummaryFeed);
        EverydayExtraSummaryViewModel.p6(everydayExtraSummaryViewModel, everydayExtrasSummaryFeed, zR6);
        if (zR6) {
            EverydayExtraSummaryViewModel.q6(everydayExtraSummaryViewModel, false);
            return unit;
        }
        return unit;
    }
}
