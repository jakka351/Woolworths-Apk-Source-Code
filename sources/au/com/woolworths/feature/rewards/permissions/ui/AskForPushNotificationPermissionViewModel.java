package au.com.woolworths.feature.rewards.permissions.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionInteractor;
import au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionViewModel;", "Landroidx/lifecycle/ViewModel;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AskForPushNotificationPermissionViewModel extends ViewModel {
    public final PushNotificationPermissionInteractor e;
    public final MutableStateFlow f;
    public final StateFlow g;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel$1", f = "AskForPushNotificationPermissionViewModel.kt", l = {28}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AskForPushNotificationPermissionViewModel.this.new AnonymousClass1(continuation);
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
                final AskForPushNotificationPermissionViewModel askForPushNotificationPermissionViewModel = AskForPushNotificationPermissionViewModel.this;
                Flow flow = askForPushNotificationPermissionViewModel.e.c;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.permissions.ui.AskForPushNotificationPermissionViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        askForPushNotificationPermissionViewModel.f.setValue(AskForPushNotificationPermissionContract.ViewState.Ask.f6417a);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
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

    public AskForPushNotificationPermissionViewModel(PushNotificationPermissionInteractor pushNotificationPermissionInteractor) {
        Intrinsics.h(pushNotificationPermissionInteractor, "pushNotificationPermissionInteractor");
        this.e = pushNotificationPermissionInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(AskForPushNotificationPermissionContract.ViewState.Idle.f6418a);
        this.f = mutableStateFlowA;
        this.g = FlowKt.b(mutableStateFlowA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
