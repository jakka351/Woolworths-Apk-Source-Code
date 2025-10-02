package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class PublisherAsFlow$collectSlowPath$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ FlowCollector r;
    public final /* synthetic */ PublisherAsFlow s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherAsFlow$collectSlowPath$2(FlowCollector flowCollector, PublisherAsFlow publisherAsFlow, Continuation continuation) {
        super(2, continuation);
        this.r = flowCollector;
        this.s = publisherAsFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PublisherAsFlow$collectSlowPath$2 publisherAsFlow$collectSlowPath$2 = new PublisherAsFlow$collectSlowPath$2(this.r, this.s, continuation);
        publisherAsFlow$collectSlowPath$2.q = obj;
        return publisherAsFlow$collectSlowPath$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PublisherAsFlow$collectSlowPath$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            PublisherAsFlow publisherAsFlow = this.s;
            ReceiveChannel receiveChannelK = publisherAsFlow.k(new ContextScope(coroutineScope.getE().plus(publisherAsFlow.d)));
            this.p = 1;
            if (kotlinx.coroutines.flow.FlowKt.t(this.r, receiveChannelK, this) == coroutineSingletons) {
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
