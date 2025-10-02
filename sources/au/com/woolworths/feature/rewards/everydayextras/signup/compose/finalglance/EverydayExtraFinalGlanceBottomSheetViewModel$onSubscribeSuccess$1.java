package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1", f = "EverydayExtraFinalGlanceBottomSheetViewModel.kt", l = {150}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraFinalGlanceBottomSheetViewModel q;
    public final /* synthetic */ EverydayExtrasOnBoarding r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1(EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel, EverydayExtrasOnBoarding everydayExtrasOnBoarding, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraFinalGlanceBottomSheetViewModel;
        this.r = everydayExtrasOnBoarding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraFinalGlanceBottomSheetViewModel$onSubscribeSuccess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        EverydayExtraFinalGlanceBottomSheetViewModel everydayExtraFinalGlanceBottomSheetViewModel = this.q;
        MutableStateFlow mutableStateFlow = everydayExtraFinalGlanceBottomSheetViewModel.g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            EverydayExtraFinalGlanceContract.ViewState.Content contentB = ((EverydayExtraFinalGlanceContract.ViewState) mutableStateFlow.getValue()).b();
            if (contentB != null) {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, EverydayExtraFinalGlanceContract.ViewState.Content.c(contentB, OfferActivationState.f)));
                BufferedChannel bufferedChannel = everydayExtraFinalGlanceBottomSheetViewModel.i;
                EverydayExtraFinalGlanceContract.Actions.ShowOnboarding showOnboarding = new EverydayExtraFinalGlanceContract.Actions.ShowOnboarding(everydayExtraFinalGlanceBottomSheetViewModel.k, this.r);
                this.p = 1;
                if (bufferedChannel.z(showOnboarding, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
