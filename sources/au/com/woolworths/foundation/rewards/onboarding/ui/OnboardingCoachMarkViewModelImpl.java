package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkViewModelImpl;", "Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkViewModel;", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OnboardingCoachMarkViewModelImpl implements OnboardingCoachMarkViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final OnboardingCoachMarksViewModel f8641a;
    public final String b;
    public final MutableStateFlow c;
    public final StateFlow d;
    public final OnboardingCoachMarkViewModelImpl$special$$inlined$map$1 e;
    public final OnboardingCoachMarkContract.Listener f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModelImpl$1", f = "OnboardingCoachMarkViewModelImpl.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModelImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OnboardingCoachMarkViewModelImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final OnboardingCoachMarkViewModelImpl onboardingCoachMarkViewModelImpl = OnboardingCoachMarkViewModelImpl.this;
                OnboardingCoachMarkViewModelImpl$special$$inlined$map$1 onboardingCoachMarkViewModelImpl$special$$inlined$map$1 = onboardingCoachMarkViewModelImpl.e;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModelImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        ProgressiveCoachMarkContent progressiveCoachMarkContent = (ProgressiveCoachMarkContent) obj2;
                        MutableStateFlow mutableStateFlow = onboardingCoachMarkViewModelImpl.c;
                        do {
                            value = mutableStateFlow.getValue();
                            ((OnboardingCoachMarkContract.ViewState) value).getClass();
                        } while (!mutableStateFlow.d(value, new OnboardingCoachMarkContract.ViewState(progressiveCoachMarkContent)));
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (onboardingCoachMarkViewModelImpl$special$$inlined$map$1.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
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

    public OnboardingCoachMarkViewModelImpl(OnboardingCoachMarksViewModel coachMarks, String str) {
        Intrinsics.h(coachMarks, "coachMarks");
        this.f8641a = coachMarks;
        this.b = str;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new OnboardingCoachMarkContract.ViewState(null));
        this.c = mutableStateFlowA;
        this.d = FlowKt.b(mutableStateFlowA);
        this.e = new OnboardingCoachMarkViewModelImpl$special$$inlined$map$1(coachMarks.e.p, this);
        this.f = new OnboardingCoachMarkContract.Listener(new OnboardingCoachMarkViewModelImpl$listener$1(0, this, OnboardingCoachMarkViewModelImpl.class, "onDismiss", "onDismiss()V", 0), new OnboardingCoachMarkViewModelImpl$listener$2(2, this, OnboardingCoachMarkViewModelImpl.class, "onCtaClick", "onCtaClick(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;)V", 0), new OnboardingCoachMarkViewModelImpl$listener$3(1, this, OnboardingCoachMarkViewModelImpl.class, "onShow", "onShow(Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;)V", 0));
        BuildersKt.c(ViewModelKt.a(coachMarks), null, null, new AnonymousClass1(null), 3);
    }

    @Override // au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModel
    /* renamed from: G, reason: from getter */
    public final StateFlow getD() {
        return this.d;
    }

    @Override // au.com.woolworths.foundation.rewards.onboarding.ui.OnboardingCoachMarkViewModel
    /* renamed from: H, reason: from getter */
    public final OnboardingCoachMarkContract.Listener getF() {
        return this.f;
    }
}
