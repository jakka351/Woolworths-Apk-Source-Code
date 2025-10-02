package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {161}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Object>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Flow r;
    public final /* synthetic */ Flow s;
    public final /* synthetic */ MutableLoadStateCollection t;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u00020\bH\u008a@¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "t1", "t2", "updateFrom", "Landroidx/paging/CombineSource;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {141}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function4<LoadStates, PageEvent<Object>, CombineSource, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public /* synthetic */ Object r;
        public /* synthetic */ CombineSource s;
        public final /* synthetic */ SimpleProducerScope t;
        public final /* synthetic */ MutableLoadStateCollection u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleProducerScope simpleProducerScope, Continuation continuation, MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, continuation);
            this.u = mutableLoadStateCollection;
            this.t = simpleProducerScope;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.t, (Continuation) obj4, this.u);
            anonymousClass1.q = obj;
            anonymousClass1.r = obj2;
            anonymousClass1.s = (CombineSource) obj3;
            return anonymousClass1.invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Object obj2 = this.q;
                Object obj3 = this.r;
                CombineSource combineSource = this.s;
                Object loadStateUpdate = (PageEvent) obj3;
                LoadStates loadStates = (LoadStates) obj2;
                CombineSource combineSource2 = CombineSource.e;
                MutableLoadStateCollection mutableLoadStateCollection = this.u;
                if (combineSource == combineSource2) {
                    loadStateUpdate = new PageEvent.LoadStateUpdate(mutableLoadStateCollection.d(), loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Insert) {
                    PageEvent.Insert insert = (PageEvent.Insert) loadStateUpdate;
                    LoadStates loadStates2 = insert.e;
                    mutableLoadStateCollection.b(loadStates2);
                    LoadType loadType = insert.f3552a;
                    List pages = insert.b;
                    int i2 = insert.c;
                    int i3 = insert.d;
                    Intrinsics.h(loadType, "loadType");
                    Intrinsics.h(pages, "pages");
                    loadStateUpdate = new PageEvent.Insert(loadType, pages, i2, i3, loadStates2, loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Drop) {
                    mutableLoadStateCollection.c(((PageEvent.Drop) loadStateUpdate).f3551a, LoadState.NotLoading.c);
                } else {
                    if (!(loadStateUpdate instanceof PageEvent.LoadStateUpdate)) {
                        if (loadStateUpdate instanceof PageEvent.StaticList) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    LoadStates loadStates3 = ((PageEvent.LoadStateUpdate) loadStateUpdate).f3553a;
                    mutableLoadStateCollection.b(loadStates3);
                    loadStateUpdate = new PageEvent.LoadStateUpdate(loadStates3, loadStates);
                }
                this.p = 1;
                if (this.t.z(loadStateUpdate, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {147}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ SimpleProducerScope q;
        public final /* synthetic */ Flow r;
        public final /* synthetic */ AtomicInteger s;
        public final /* synthetic */ UnbatchedFlowCombiner t;
        public final /* synthetic */ int u;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "androidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ UnbatchedFlowCombiner d;
            public final /* synthetic */ int e;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C00791 extends ContinuationImpl {
                public /* synthetic */ Object p;
                public int q;

                public C00791(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.p = obj;
                    this.q |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i) {
                this.d = unbatchedFlowCombiner;
                this.e = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
            
                if (kotlinx.coroutines.YieldKt.a(r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00791
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = (androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.C00791) r0
                    int r1 = r0.q
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.q = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.p
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                    int r2 = r0.q
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.ResultKt.b(r7)
                    goto L4f
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    kotlin.ResultKt.b(r7)
                    goto L46
                L36:
                    kotlin.ResultKt.b(r7)
                    r0.q = r4
                    androidx.paging.UnbatchedFlowCombiner r7 = r5.d
                    int r2 = r5.e
                    java.lang.Object r6 = r7.a(r2, r6, r0)
                    if (r6 != r1) goto L46
                    goto L4e
                L46:
                    r0.q = r3
                    java.lang.Object r6 = kotlinx.coroutines.YieldKt.a(r0)
                    if (r6 != r1) goto L4f
                L4e:
                    return r1
                L4f:
                    kotlin.Unit r6 = kotlin.Unit.f24250a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow flow, AtomicInteger atomicInteger, SimpleProducerScope simpleProducerScope, UnbatchedFlowCombiner unbatchedFlowCombiner, int i, Continuation continuation) {
            super(2, continuation);
            this.r = flow;
            this.s = atomicInteger;
            this.t = unbatchedFlowCombiner;
            this.u = i;
            this.q = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.r, this.s, this.q, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            SimpleProducerScope simpleProducerScope = this.q;
            AtomicInteger atomicInteger = this.s;
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    Flow flow = this.r;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.t, this.u);
                    this.p = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    simpleProducerScope.y(null);
                }
                return Unit.f24250a;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    simpleProducerScope.y(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(Flow flow, Flow flow2, Continuation continuation, MutableLoadStateCollection mutableLoadStateCollection) {
        super(2, continuation);
        this.r = flow;
        this.s = flow2;
        this.t = mutableLoadStateCollection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1(this.r, this.s, continuation, this.t);
        pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.q = obj;
        return pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1) create((SimpleProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.q;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new AnonymousClass1(simpleProducerScope, null, this.t));
            final JobImpl jobImplA = JobKt.a();
            Flow[] flowArr = {this.r, this.s};
            int i2 = 0;
            int i3 = 0;
            while (i3 < 2) {
                BuildersKt.c(simpleProducerScope, jobImplA, null, new AnonymousClass2(flowArr[i3], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i2, null), 2);
                i3++;
                i2++;
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    jobImplA.cancel((CancellationException) null);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (simpleProducerScope.v(function0, this) == coroutineSingletons) {
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
