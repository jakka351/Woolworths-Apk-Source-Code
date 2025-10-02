package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public JobImpl p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ FlowCollector s;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ CoroutineContext q;
        public final /* synthetic */ Object r;
        public final /* synthetic */ ReceiveChannel s;
        public final /* synthetic */ FlowCollector t;
        public final /* synthetic */ JobImpl u;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        final class AnonymousClass1<T> implements FlowCollector {

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C04081 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                public FlowCollector p;
                public int q;
                public final /* synthetic */ ReceiveChannel r;
                public final /* synthetic */ FlowCollector s;
                public final /* synthetic */ Object t;
                public final /* synthetic */ JobImpl u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04081(ReceiveChannel receiveChannel, FlowCollector flowCollector, Object obj, JobImpl jobImpl, Continuation continuation) {
                    super(2, continuation);
                    this.r = receiveChannel;
                    this.s = flowCollector;
                    this.t = obj;
                    this.u = jobImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C04081(this.r, this.s, this.t, this.u, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C04081) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
                
                    if (r1.emit(r6, r5) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
                
                    if (r6 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r1 = r5.q
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L37
                        if (r1 == r4) goto L2f
                        r4 = 3
                        if (r1 == r3) goto L1c
                        if (r1 != r4) goto L14
                        kotlin.ResultKt.b(r6)
                        goto L2c
                    L14:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1c:
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.p
                        kotlin.ResultKt.b(r6)
                        r5.p = r2
                        r5.q = r4
                        java.lang.Object r6 = r1.emit(r6, r5)
                        if (r6 != r0) goto L2c
                        goto L46
                    L2c:
                        kotlin.Unit r6 = kotlin.Unit.f24250a
                        return r6
                    L2f:
                        kotlin.ResultKt.b(r6)
                        kotlinx.coroutines.channels.ChannelResult r6 = (kotlinx.coroutines.channels.ChannelResult) r6
                        java.lang.Object r6 = r6.f24699a
                        goto L47
                    L37:
                        kotlin.ResultKt.b(r6)
                        r5.q = r4
                        kotlinx.coroutines.channels.ReceiveChannel r6 = r5.r
                        kotlinx.coroutines.channels.ChannelCoroutine r6 = (kotlinx.coroutines.channels.ChannelCoroutine) r6
                        java.lang.Object r6 = r6.s(r5)
                        if (r6 != r0) goto L47
                    L46:
                        return r0
                    L47:
                        boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r0 == 0) goto L59
                        java.lang.Throwable r6 = kotlinx.coroutines.channels.ChannelResult.a(r6)
                        if (r6 != 0) goto L58
                        kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        kotlinx.coroutines.JobImpl r0 = r5.u
                        r6.<init>(r0)
                    L58:
                        throw r6
                    L59:
                        kotlinx.coroutines.flow.FlowCollector r6 = r5.s
                        r5.p = r6
                        r5.q = r3
                        throw r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C04081.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r13
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.r = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r11, r13)
                L18:
                    java.lang.Object r13 = r0.p
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.r
                    kotlin.Unit r3 = kotlin.Unit.f24250a
                    r4 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r4) goto L29
                    kotlin.ResultKt.b(r13)
                    return r3
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.ResultKt.b(r13)
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    r9 = 0
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    r8 = r12
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.r = r4
                    r12 = 0
                    r13 = 0
                    java.lang.Object r12 = kotlinx.coroutines.flow.internal.ChannelFlowKt.b(r12, r3, r13, r5, r0)
                    if (r12 != r1) goto L49
                    return r1
                L49:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineContext coroutineContext, Object obj, ReceiveChannel receiveChannel, FlowCollector flowCollector, JobImpl jobImpl, Continuation continuation) {
            super(2, continuation);
            this.q = coroutineContext;
            this.r = obj;
            this.s = receiveChannel;
            this.t = flowCollector;
            this.u = jobImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, this.s, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Unit) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.s = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.s, continuation);
        combineKt$zipImpl$1$1.r = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0017, blocks: (B:6:0x0013, B:25:0x0079, B:29:0x0081), top: B:32:0x0008 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.q
            kotlin.Unit r2 = kotlin.Unit.f24250a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 != r3) goto L1d
            kotlinx.coroutines.JobImpl r1 = r14.p
            java.lang.Object r0 = r14.r
            r3 = r0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.ResultKt.b(r15)     // Catch: java.lang.Throwable -> L17 kotlinx.coroutines.flow.internal.AbortFlowException -> L1a
            goto L6d
        L17:
            r0 = move-exception
            r15 = r0
            goto L82
        L1a:
            r0 = move-exception
            r15 = r0
            goto L79
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.r
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            r5 = 2
            r1.<init>(r5, r4)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.c(r15, r6, r1, r5)
            kotlinx.coroutines.JobImpl r12 = kotlinx.coroutines.JobKt.a()
            r1 = r10
            kotlinx.coroutines.channels.SendChannel r1 = (kotlinx.coroutines.channels.SendChannel) r1
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            r5.<init>()
            r1.j(r5)
            kotlin.coroutines.CoroutineContext r8 = r15.getE()     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            java.lang.Object r9 = kotlinx.coroutines.internal.ThreadContextKt.b(r8)     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            kotlin.coroutines.CoroutineContext r15 = r15.getE()     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            kotlin.coroutines.CoroutineContext r15 = r15.plus(r12)     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r7 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            kotlinx.coroutines.flow.FlowCollector r11 = r14.s     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            r14.r = r10     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            r14.p = r12     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            r14.q = r3     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            java.lang.Object r15 = kotlinx.coroutines.flow.internal.ChannelFlowKt.c(r15, r2, r7, r14)     // Catch: java.lang.Throwable -> L71 kotlinx.coroutines.flow.internal.AbortFlowException -> L75
            if (r15 != r0) goto L6c
            return r0
        L6c:
            r3 = r10
        L6d:
            r3.cancel(r4)
            return r2
        L71:
            r0 = move-exception
            r15 = r0
            r3 = r10
            goto L82
        L75:
            r0 = move-exception
            r15 = r0
            r3 = r10
            r1 = r12
        L79:
            java.lang.Object r0 = r15.d     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L81
            r3.cancel(r4)
            return r2
        L81:
            throw r15     // Catch: java.lang.Throwable -> L17
        L82:
            r3.cancel(r4)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
