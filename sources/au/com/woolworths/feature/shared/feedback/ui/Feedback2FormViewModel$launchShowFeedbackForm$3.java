package au.com.woolworths.feature.shared.feedback.ui;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormViewModel$launchShowFeedbackForm$3", f = "Feedback2FormViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Feedback2FormViewModel$launchShowFeedbackForm$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Feedback2FormViewModel p;
    public final /* synthetic */ String q;
    public final /* synthetic */ HashMap r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback2FormViewModel$launchShowFeedbackForm$3(Feedback2FormViewModel feedback2FormViewModel, String str, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.p = feedback2FormViewModel;
        this.q = str;
        this.r = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Feedback2FormViewModel$launchShowFeedbackForm$3(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Feedback2FormViewModel$launchShowFeedbackForm$3 feedback2FormViewModel$launchShowFeedbackForm$3 = (Feedback2FormViewModel$launchShowFeedbackForm$3) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        feedback2FormViewModel$launchShowFeedbackForm$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.u6(this.q, this.r);
        return Unit.f24250a;
    }
}
