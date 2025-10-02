package kotlinx.coroutines.flow;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__LogicKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowKt {
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1] */
    public static final FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 A(Function2 function2, Flow flow) {
        int i = FlowKt__MergeKt.f24707a;
        final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(function2, flow);
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
    }

    public static final Flow B(Function2 function2) {
        return new SafeFlow(function2);
    }

    public static final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 C(Flow flow, StateFlow stateFlow, Function3 function3) {
        return FlowKt__ZipKt.f(flow, stateFlow, function3);
    }

    public static final Flow D(Flow flow, CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.d) == null) {
            return coroutineContext.equals(EmptyCoroutineContext.d) ? flow : flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.a((FusibleFlow) flow, coroutineContext, 0, null, 6) : new ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final Job E(Flow flow, CoroutineScope coroutineScope) {
        return BuildersKt.c(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3);
    }

    public static final ChannelFlowTransformLatest F(Function2 function2, Flow flow) {
        int i = FlowKt__MergeKt.f24707a;
        return Q(flow, new FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    public static final ChannelLimitedFlowMerge G(Flow... flowArr) {
        int i = FlowKt__MergeKt.f24707a;
        return new ChannelLimitedFlowMerge(ArraysKt.e(flowArr));
    }

    public static final SharedFlow H(SharedFlow sharedFlow, Function2 function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }

    public static final Flow I(BufferedChannel bufferedChannel) {
        return new ChannelAsFlow(bufferedChannel, false);
    }

    public static final FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 J(Flow flow, long j, Function2 function2) {
        if (j > 0) {
            return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(flow, new FlowKt__ErrorsKt$retry$3(j, function2, null));
        }
        throw new IllegalArgumentException(b.k(j, "Expected positive amount of retries, but had ").toString());
    }

    public static final FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 L(Flow flow, long j) {
        return FlowKt__DelayKt.c(flow, j);
    }

    public static final SharedFlow M(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        SharingConfig sharingConfigA = FlowKt__ShareKt.a(flow, i);
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(i, sharingConfigA.b, sharingConfigA.c);
        return new ReadonlySharedFlow(sharedFlowImplA, BuildersKt.b(coroutineScope, sharingConfigA.d, sharingStarted.equals(SharingStarted.Companion.f24711a) ? CoroutineStart.d : CoroutineStart.g, new FlowKt__ShareKt$launchSharing$1(sharingStarted, sharingConfigA.f24710a, sharedFlowImplA, SharedFlowKt.f24708a, null)));
    }

    public static final Object N(Flow flow, ContextScope contextScope, Continuation continuation) {
        SharingConfig sharingConfigA = FlowKt__ShareKt.a(flow, 1);
        CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        BuildersKt.c(contextScope, sharingConfigA.d, null, new FlowKt__ShareKt$launchSharingDeferred$1(sharingConfigA.f24710a, completableDeferredA, null), 2);
        return completableDeferredA.await(continuation);
    }

    public static final StateFlow O(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SharingConfig sharingConfigA = FlowKt__ShareKt.a(flow, 1);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(obj);
        return new ReadonlyStateFlow(mutableStateFlowA, BuildersKt.b(coroutineScope, sharingConfigA.d, sharingStarted.equals(SharingStarted.Companion.f24711a) ? CoroutineStart.d : CoroutineStart.g, new FlowKt__ShareKt$launchSharing$1(sharingStarted, sharingConfigA.f24710a, mutableStateFlowA, obj, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P(kotlinx.coroutines.flow.Flow r4, final java.util.Collection r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = (kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1 r0 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Collection r4 = r0.p
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.ResultKt.b(r6)
            return r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r6)
            kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2 r6 = new kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2
            r6.<init>()
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            r0.p = r2
            r0.r = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.P(kotlinx.coroutines.flow.Flow, java.util.Collection, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ChannelFlowTransformLatest Q(Flow flow, Function3 function3) {
        int i = FlowKt__MergeKt.f24707a;
        return new ChannelFlowTransformLatest(function3, flow, EmptyCoroutineContext.d, -2, BufferOverflow.d);
    }

    public static final SharedFlow a(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final StateFlow b(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static Flow c(Flow flow, int i) {
        BufferOverflow bufferOverflow = BufferOverflow.d;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(a.d(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.e;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.a((FusibleFlow) flow, null, i2, bufferOverflow2, 1) : new ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2);
    }

    public static final Flow d(Function2 function2) {
        return new CallbackFlowBuilder(function2, EmptyCoroutineContext.d, -2, BufferOverflow.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable e(kotlinx.coroutines.flow.Flow r4, kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r5 = move-exception
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.jvm.internal.Ref$ObjectRef r6 = androidx.camera.core.impl.b.x(r6)
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L49
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L49
            r0.p = r6     // Catch: java.lang.Throwable -> L49
            r0.r = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L49
            if (r4 != r1) goto L47
            return r1
        L47:
            r4 = 0
            return r4
        L49:
            r5 = move-exception
            r4 = r6
        L4b:
            java.lang.Object r4 = r4.d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L57
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L79
        L57:
            kotlin.coroutines.CoroutineContext r6 = r0.getE()
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key.d
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r0)
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            if (r6 == 0) goto L7a
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6c
            goto L7a
        L6c:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L7a
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L79
            goto L7a
        L79:
            throw r5
        L7a:
            if (r4 != 0) goto L7d
            return r5
        L7d:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L85
            kotlin.ExceptionsKt.a(r4, r5)
            throw r4
        L85:
            kotlin.ExceptionsKt.a(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.e(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    public static final Flow f(Function2 function2) {
        return new ChannelFlowBuilder(function2, EmptyCoroutineContext.d, -2, BufferOverflow.d);
    }

    public static final Object g(Flow flow, Continuation continuation) {
        Object objCollect = flow.collect(NopCollector.d, continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }

    public static final Object h(Flow flow, Function2 function2, Continuation continuation) {
        Object objG = g(c(F(function2, flow), 0), continuation);
        return objG == CoroutineSingletons.d ? objG : Unit.f24250a;
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 i(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return FlowKt__ZipKt.a(flow, flow2, flow3, function4);
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 j(Flow flow, StateFlow stateFlow, StateFlow stateFlow2, Flow flow2, Function5 function5) {
        return FlowKt__ZipKt.b(flow, stateFlow, stateFlow2, flow2, function5);
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 k(StateFlow stateFlow, Flow flow, StateFlow stateFlow2, StateFlow stateFlow3, Flow flow2, Function6 function6) {
        return FlowKt__ZipKt.c(stateFlow, flow, stateFlow2, stateFlow3, flow2, function6);
    }

    public static final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 l(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt__ZipKt.d(flow, flow2, function3);
    }

    public static final Flow m(Flow flow, Flow flow2, Flow flow3, Function5 function5) {
        return FlowKt__ZipKt.e(flow, flow2, flow3, function5);
    }

    public static final Flow n(BufferedChannel bufferedChannel) {
        return new ChannelAsFlow(bufferedChannel, true);
    }

    public static final Flow o(Flow flow, long j) {
        return FlowKt__DelayKt.a(flow, j);
    }

    public static final Flow p(SharedFlowImpl sharedFlowImpl, long j) {
        return FlowKt__DelayKt.b(sharedFlowImpl, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Flow q(CancellableFlow cancellableFlow, Function2 function2) {
        TypeIntrinsics.d(2, function2);
        Function2 function22 = function2;
        return ((cancellableFlow instanceof DistinctFlowImpl) && ((DistinctFlowImpl) cancellableFlow).e == function22) ? cancellableFlow : new DistinctFlowImpl(function22, cancellableFlow);
    }

    public static final Flow r(Flow flow) {
        if (flow instanceof StateFlow) {
            return flow;
        }
        boolean z = flow instanceof DistinctFlowImpl;
        kotlin.coroutines.a aVar = FlowKt__DistinctKt.b;
        return (z && ((DistinctFlowImpl) flow).e == aVar) ? flow : new DistinctFlowImpl(aVar, flow);
    }

    public static final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 s(Flow flow, int i) {
        if (i >= 0) {
            return new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(flow, i);
        }
        throw new IllegalArgumentException(a.d(i, "Drop count should be non-negative, but had ").toString());
    }

    public static final Object t(FlowCollector flowCollector, ReceiveChannel receiveChannel, SuspendLambda suspendLambda) {
        Object objA = FlowKt__ChannelsKt.a(flowCollector, receiveChannel, true, suspendLambda);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }

    public static final Object u(FlowCollector flowCollector, Flow flow, Continuation continuation) throws Throwable {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).d;
        }
        Object objCollect = flow.collect(flowCollector, continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }

    public static final Flow v() {
        return EmptyFlow.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(kotlinx.coroutines.flow.Flow r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f24716a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r5 = r0.q
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L60
        L2d:
            r6 = move-exception
            goto L55
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.jvm.internal.Ref$ObjectRef r6 = androidx.camera.core.impl.b.x(r6)
            r6.d = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
            r2.<init>()
            r0.p = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.s = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r1 = r6
            goto L60
        L51:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L55:
            java.lang.Object r2 = r6.d
            if (r2 != r5) goto L6d
            kotlin.coroutines.CoroutineContext r5 = r0.getE()
            kotlinx.coroutines.JobKt.e(r5)
        L60:
            java.lang.Object r5 = r1.d
            if (r5 == r3) goto L65
            return r5
        L65:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.w(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(kotlinx.coroutines.flow.Flow r5, kotlin.jvm.functions.Function2 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f24716a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r5 = r0.q
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.p
            kotlin.ResultKt.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L60
        L2d:
            r7 = move-exception
            goto L55
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.jvm.internal.Ref$ObjectRef r7 = androidx.camera.core.impl.b.x(r7)
            r7.d = r3
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r6, r7)
            r0.p = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.s = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            if (r5 != r1) goto L4f
            return r1
        L4f:
            r6 = r7
            goto L60
        L51:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L55:
            java.lang.Object r1 = r7.d
            if (r1 != r5) goto L6d
            kotlin.coroutines.CoroutineContext r5 = r0.getE()
            kotlinx.coroutines.JobKt.e(r5)
        L60:
            java.lang.Object r5 = r6.d
            if (r5 == r3) goto L65
            return r5
        L65:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate"
            r5.<init>(r6)
            throw r5
        L6d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.x(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(kotlinx.coroutines.flow.Flow r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r4 = r0.q
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.p
            kotlin.ResultKt.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5c
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r5 = androidx.camera.core.impl.b.x(r5)
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
            r2.<init>()
            r0.p = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r0.q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r0.s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r1 = r5
            goto L5c
        L4d:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L51:
            java.lang.Object r2 = r5.d
            if (r2 != r4) goto L5f
            kotlin.coroutines.CoroutineContext r4 = r0.getE()
            kotlinx.coroutines.JobKt.e(r4)
        L5c:
            java.lang.Object r4 = r1.d
            return r4
        L5f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.y(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(kotlinx.coroutines.flow.internal.FusibleFlow r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = r0.q
            kotlin.jvm.internal.Ref$ObjectRef r5 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5c
        L2b:
            r6 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r6 = androidx.camera.core.impl.b.x(r6)
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.p = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r0.q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r0.s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r5 = r6
            goto L5c
        L4d:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L51:
            java.lang.Object r1 = r6.d
            if (r1 != r4) goto L5f
            kotlin.coroutines.CoroutineContext r4 = r0.getE()
            kotlinx.coroutines.JobKt.e(r4)
        L5c:
            java.lang.Object r4 = r5.d
            return r4
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt.z(kotlinx.coroutines.flow.internal.FusibleFlow, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
