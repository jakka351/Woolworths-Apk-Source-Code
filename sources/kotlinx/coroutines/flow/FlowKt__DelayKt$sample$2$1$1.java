package kotlinx.coroutines.flow;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ Ref.ObjectRef q;
    public final /* synthetic */ ReceiveChannel r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef objectRef, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.q = objectRef;
        this.r = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.q, this.r, continuation);
        flowKt__DelayKt$sample$2$1$1.p = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = (FlowKt__DelayKt$sample$2$1$1) create(new ChannelResult(((ChannelResult) obj).f24699a), (Continuation) obj2);
        Unit unit = Unit.f24250a;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Object obj2 = ((ChannelResult) this.p).f24699a;
        boolean z = obj2 instanceof ChannelResult.Failed;
        Ref.ObjectRef objectRef = this.q;
        if (!z) {
            objectRef.d = obj2;
        }
        if (z) {
            Throwable thA = ChannelResult.a(obj2);
            if (thA != null) {
                throw thA;
            }
            this.r.cancel(new ChildCancelledException());
            objectRef.d = NullSurrogateKt.c;
        }
        return Unit.f24250a;
    }
}
