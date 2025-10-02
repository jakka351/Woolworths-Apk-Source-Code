package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class FlowSubscription$createInitialContinuation$1$1 extends FunctionReferenceImpl implements Function1<Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FlowSubscription.q0((FlowSubscription) this.receiver, (Continuation) obj);
        return Unit.f24250a;
    }
}
