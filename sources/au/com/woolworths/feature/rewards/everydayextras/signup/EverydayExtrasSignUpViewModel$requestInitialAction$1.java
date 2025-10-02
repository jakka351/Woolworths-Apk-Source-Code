package au.com.woolworths.feature.rewards.everydayextras.signup;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpInteractor;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel$requestInitialAction$1", f = "EverydayExtrasSignUpViewModel.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtrasSignUpViewModel$requestInitialAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtrasSignUpViewModel q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpViewModel$requestInitialAction$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ EverydayExtrasSignUpViewModel d;

        public AnonymousClass1(EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel) {
            this.d = everydayExtrasSignUpViewModel;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new AdaptedFunctionReference(2, this.d, EverydayExtrasSignUpViewModel.class, "handleSignUpInteractorEvent", "handleSignUpInteractorEvent(Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpInteractor$Event;)V", 4);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            EverydayExtrasSignUpInteractor.Event event = (EverydayExtrasSignUpInteractor.Event) obj;
            boolean zC = Intrinsics.c(event, EverydayExtrasSignUpInteractor.Event.NavigateToChoosePlan.f5936a);
            EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel = this.d;
            if (zC) {
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$1(everydayExtrasSignUpViewModel, null), 3);
            } else if (event instanceof EverydayExtrasSignUpInteractor.Event.NavigateToSummary) {
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$2(everydayExtrasSignUpViewModel, event, null), 3);
            } else if (event instanceof EverydayExtrasSignUpInteractor.Event.NavigateToOnBoarding) {
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$3(everydayExtrasSignUpViewModel, event, null), 3);
            } else if (Intrinsics.c(event, EverydayExtrasSignUpInteractor.Event.PerformSignUpBackAction.f5940a)) {
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$4(everydayExtrasSignUpViewModel, null), 3);
            } else if (Intrinsics.c(event, EverydayExtrasSignUpInteractor.Event.PerformSignUpCloseAction.f5941a)) {
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$5(everydayExtrasSignUpViewModel, null), 3);
            } else {
                if (!(event instanceof EverydayExtrasSignUpInteractor.Event.NavigateToUrl)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.c(ViewModelKt.a(everydayExtrasSignUpViewModel), null, null, new EverydayExtrasSignUpViewModel$handleSignUpInteractorEvent$6(everydayExtrasSignUpViewModel, event, null), 3);
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return Unit.f24250a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtrasSignUpViewModel$requestInitialAction$1(EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtrasSignUpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtrasSignUpViewModel$requestInitialAction$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtrasSignUpViewModel$requestInitialAction$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            EverydayExtrasSignUpViewModel everydayExtrasSignUpViewModel = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = everydayExtrasSignUpViewModel.e.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(everydayExtrasSignUpViewModel);
            this.p = 1;
            if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(anonymousClass1, this) == coroutineSingletons) {
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
