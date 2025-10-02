package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {646, 168, 657}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Object>>, Continuation<? super Unit>, Object> {
    public Object p;
    public Object q;
    public MutexImpl r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ PageFetcherSnapshot u;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ PageFetcherSnapshot q;
        public final /* synthetic */ SimpleProducerScope r;

        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/PageEvent;", "emit", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ SimpleProducerScope d;

            public AnonymousClass1(SimpleProducerScope simpleProducerScope) {
                this.d = simpleProducerScope;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(androidx.paging.PageEvent r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) r0
                    int r1 = r0.r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.r = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.p
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.r
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.ResultKt.b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3d
                    goto L3d
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    kotlin.ResultKt.b(r6)
                    androidx.paging.SimpleProducerScope r6 = r4.d     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3d
                    r0.r = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3d
                    java.lang.Object r5 = r6.z(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3d
                    if (r5 != r1) goto L3d
                    return r1
                L3d:
                    kotlin.Unit r5 = kotlin.Unit.f24250a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1.emit(androidx.paging.PageEvent, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageFetcherSnapshot pageFetcherSnapshot, SimpleProducerScope simpleProducerScope, Continuation continuation) {
            super(2, continuation);
            this.q = pageFetcherSnapshot;
            this.r = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flowN = FlowKt.n(this.q.j);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r);
                this.p = 1;
                if (flowN.collect(anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ PageFetcherSnapshot q;
        public final /* synthetic */ BufferedChannel r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation, BufferedChannel bufferedChannel) {
            super(2, continuation);
            this.q = pageFetcherSnapshot;
            this.r = bufferedChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.q, continuation, this.r);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flow = this.q.d;
                final BufferedChannel bufferedChannel = this.r;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        bufferedChannel.k((Unit) obj2);
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

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ BufferedChannel r;
        public final /* synthetic */ PageFetcherSnapshot s;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "emit", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ PageFetcherSnapshot d;
            public final /* synthetic */ CoroutineScope e;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public /* synthetic */ class WhenMappings {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3561a;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f3561a = iArr;
                }
            }

            public AnonymousClass1(PageFetcherSnapshot pageFetcherSnapshot, CoroutineScope coroutineScope) {
                this.d = pageFetcherSnapshot;
                this.e = coroutineScope;
            }

            /* JADX WARN: Code restructure failed: missing block: B:112:0x039d, code lost:
            
                if (r1.a(r13) == r0) goto L154;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x02b8, code lost:
            
                if (r1.a(r13) == r0) goto L154;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0333  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0383  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0387  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x03c6 A[PHI: r7 r8 r9
  0x03c6: PHI (r7v46 kotlinx.coroutines.CoroutineScope) = (r7v23 kotlinx.coroutines.CoroutineScope), (r7v48 kotlinx.coroutines.CoroutineScope) binds: [B:88:0x02e4, B:122:0x03ba] A[DONT_GENERATE, DONT_INLINE]
  0x03c6: PHI (r8v34 androidx.paging.PageFetcherSnapshot) = (r8v15 androidx.paging.PageFetcherSnapshot), (r8v36 androidx.paging.PageFetcherSnapshot) binds: [B:88:0x02e4, B:122:0x03ba] A[DONT_GENERATE, DONT_INLINE]
  0x03c6: PHI (r9v22 androidx.paging.LoadStates) = (r9v10 androidx.paging.LoadStates), (r9v23 androidx.paging.LoadStates) binds: [B:88:0x02e4, B:122:0x03ba] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x03cc  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0401  */
            /* JADX WARN: Removed duplicated region for block: B:140:0x0412  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x0462  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0466  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x048e  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0231  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x023e  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x024c  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0250  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x029d  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x02e6  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x031e  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x032f  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r1v38, types: [int] */
            /* JADX WARN: Type inference failed for: r1v63, types: [int] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(kotlin.Unit r13, kotlin.coroutines.Continuation r14) {
                /*
                    Method dump skipped, instructions count: 1230
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation, BufferedChannel bufferedChannel) {
            super(2, continuation);
            this.r = bufferedChannel;
            this.s = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.s, continuation, this.r);
            anonymousClass4.q = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                Flow flowN = FlowKt.n(this.r);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s, coroutineScope);
                this.p = 1;
                if (flowN.collect(anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.u = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.u, continuation);
        pageFetcherSnapshot$pageEventFlow$1.t = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create((SimpleProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if (r11.a(r10) != r2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
