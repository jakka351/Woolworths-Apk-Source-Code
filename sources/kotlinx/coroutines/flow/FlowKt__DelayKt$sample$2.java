package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef p;
    public ReceiveChannel q;
    public int r;
    public /* synthetic */ Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Flow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(Flow flow, long j, Continuation continuation) {
        super(3, continuation);
        this.u = j;
        this.v = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = this.u;
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.v, j, (Continuation) obj3);
        flowKt__DelayKt$sample$2.s = (CoroutineScope) obj;
        flowKt__DelayKt$sample$2.t = (FlowCollector) obj2;
        return flowKt__DelayKt$sample$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        ReceiveChannel receiveChannelC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.s;
            FlowCollector flowCollector2 = (FlowCollector) this.t;
            ReceiveChannel receiveChannelC2 = ProduceKt.c(coroutineScope, -1, new FlowKt__DelayKt$sample$2$values$1(this.v, null), 1);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            receiveChannel = receiveChannelC2;
            objectRef = objectRef2;
            flowCollector = flowCollector2;
            receiveChannelC = ProduceKt.c(coroutineScope, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.u, null), 1);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            receiveChannelC = this.q;
            objectRef = this.p;
            receiveChannel = (ReceiveChannel) this.t;
            flowCollector = (FlowCollector) this.s;
            ResultKt.b(obj);
        }
        while (objectRef.d != NullSurrogateKt.c) {
            SelectImplementation selectImplementation = new SelectImplementation(getE());
            selectImplementation.j(receiveChannel.n(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannelC, null));
            selectImplementation.j(receiveChannelC.t(), new FlowKt__DelayKt$sample$2$1$2(null, objectRef, flowCollector));
            this.s = flowCollector;
            this.t = receiveChannel;
            this.p = objectRef;
            this.q = receiveChannelC;
            this.r = 1;
            if (selectImplementation.g(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
