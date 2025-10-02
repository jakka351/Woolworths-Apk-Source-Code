package au.com.woolworths.foundation.shop.olive.voice.ui;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceContract;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt$OliveVoiceScreen$3$1", f = "OliveVoiceScreen.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OliveVoiceScreenKt$OliveVoiceScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ OliveVoiceViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ Function0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OliveVoiceScreenKt$OliveVoiceScreen$3$1(OliveVoiceViewModel oliveVoiceViewModel, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Continuation continuation) {
        super(2, continuation);
        this.q = oliveVoiceViewModel;
        this.r = function0;
        this.s = function02;
        this.t = function1;
        this.u = function03;
        this.v = function04;
        this.w = function05;
        this.x = function06;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OliveVoiceScreenKt$OliveVoiceScreen$3$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OliveVoiceScreenKt$OliveVoiceScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.k;
            final Function0 function0 = this.w;
            final Function0 function02 = this.x;
            final Function0 function03 = this.r;
            final Function0 function04 = this.s;
            final Function1 function1 = this.t;
            final Function0 function05 = this.u;
            final Function0 function06 = this.v;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.OliveVoiceScreenKt$OliveVoiceScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    OliveVoiceContract.Action action = (OliveVoiceContract.Action) obj2;
                    if (action instanceof OliveVoiceContract.Action.OpenAppSettings) {
                        function03.invoke();
                    } else if (action instanceof OliveVoiceContract.Action.OpenDeviceSettings) {
                        function04.invoke();
                    } else if (action instanceof OliveVoiceContract.Action.ShowSearchResults) {
                        function1.invoke(((OliveVoiceContract.Action.ShowSearchResults) action).f8799a);
                    } else if (Intrinsics.c(action, OliveVoiceContract.Action.ShowProductFinder.f8798a)) {
                        function05.invoke();
                    } else if (Intrinsics.c(action, OliveVoiceContract.Action.DisplayFeedbackForm.f8793a)) {
                        function06.invoke();
                    } else if (Intrinsics.c(action, OliveVoiceContract.Action.PerformHapticFailure.f8796a)) {
                        function0.invoke();
                    } else {
                        if (!Intrinsics.c(action, OliveVoiceContract.Action.PerformHapticSuccess.f8797a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function02.invoke();
                    }
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
