package au.com.woolworths.feature.shared.feedback.ui;

import au.com.woolworths.feature.shared.feedback.medallia.MedalliaFormEvent;
import au.com.woolworths.feature.shared.feedback.medallia.MedalliaInteractor$formFlow$$inlined$filter$1;
import au.com.woolworths.feature.shared.feedback.ui.Feedback2FormContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$handleMedalliaEvents$2", f = "Feedback2FormViewModel.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Feedback2FormViewModel$handleMedalliaEvents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Feedback2FormViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback2FormViewModel$handleMedalliaEvents$2(Feedback2FormViewModel feedback2FormViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = feedback2FormViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Feedback2FormViewModel$handleMedalliaEvents$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Feedback2FormViewModel$handleMedalliaEvents$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Feedback2FormViewModel feedback2FormViewModel = this.q;
            MedalliaInteractor$formFlow$$inlined$filter$1 medalliaInteractor$formFlow$$inlined$filter$1A = feedback2FormViewModel.e.a(this.r);
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$handleMedalliaEvents$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    MedalliaFormEvent medalliaFormEvent = (MedalliaFormEvent) obj2;
                    MutableStateFlow mutableStateFlow = feedback2FormViewModel.g;
                    if (medalliaFormEvent instanceof MedalliaFormEvent.FormDisplayed) {
                        mutableStateFlow.setValue(Feedback2FormContract.ViewState.a((Feedback2FormContract.ViewState) mutableStateFlow.getValue(), Feedback2FormContract.Status.f, 2));
                    } else if ((medalliaFormEvent instanceof MedalliaFormEvent.FormThankYouPrompt) || (medalliaFormEvent instanceof MedalliaFormEvent.FormDismissed)) {
                        mutableStateFlow.setValue(Feedback2FormContract.ViewState.a((Feedback2FormContract.ViewState) mutableStateFlow.getValue(), null, 1));
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (medalliaInteractor$formFlow$$inlined$filter$1A.collect(flowCollector, this) == coroutineSingletons) {
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
