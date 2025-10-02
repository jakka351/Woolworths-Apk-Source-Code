package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Ref.ObjectRef s;
    public final /* synthetic */ FlowCollector t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(2, continuation);
        this.s = objectRef;
        this.t = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(continuation, this.s, this.t);
        flowKt__DelayKt$debounceInternal$1$3$2.r = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new ChannelResult(((ChannelResult) obj).f24699a), (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            Object obj2 = ((ChannelResult) this.r).f24699a;
            boolean z = obj2 instanceof ChannelResult.Failed;
            objectRef = this.s;
            if (!z) {
                objectRef.d = obj2;
            }
            if (z) {
                Throwable thA = ChannelResult.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = objectRef.d;
                if (obj3 != null) {
                    if (obj3 == NullSurrogateKt.f24716a) {
                        obj3 = null;
                    }
                    this.r = obj2;
                    this.p = objectRef;
                    this.q = 1;
                    if (this.t.emit(obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.d = NullSurrogateKt.c;
            }
            return Unit.f24250a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = this.p;
        ResultKt.b(obj);
        objectRef = objectRef2;
        objectRef.d = NullSurrogateKt.c;
        return Unit.f24250a;
    }
}
