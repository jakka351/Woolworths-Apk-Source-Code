package androidx.paging;

import androidx.paging.PageFetcher;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PagingData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcher$flow$1 extends SuspendLambda implements Function2<SimpleProducerScope<PagingData<Object>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PageFetcher r;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ RemoteMediatorAccessor r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
            super(2, continuation);
            this.r = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            if (r1.emit(r7, r6) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r6.p
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                kotlin.ResultKt.b(r7)
                goto L51
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                java.lang.Object r1 = r6.q
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.b(r7)
                goto L38
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.q
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                androidx.paging.RemoteMediatorAccessor r7 = r6.r
                if (r7 == 0) goto L3b
                r6.q = r1
                r6.p = r4
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r0) goto L38
                goto L50
            L38:
                androidx.paging.RemoteMediator$InitializeAction r7 = (androidx.paging.RemoteMediator.InitializeAction) r7
                goto L3c
            L3b:
                r7 = r2
            L3c:
                androidx.paging.RemoteMediator$InitializeAction r5 = androidx.paging.RemoteMediator.InitializeAction.d
                if (r7 != r5) goto L41
                goto L42
            L41:
                r4 = 0
            L42:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                r6.q = r2
                r6.p = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Unit r7 = kotlin.Unit.f24250a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PageFetcher$GenerationInfo;", "Key", "Value", "", "previousGeneration", "triggerRemoteRefresh", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function3<PageFetcher.GenerationInfo<Object, Object>, Boolean, Continuation<? super PageFetcher.GenerationInfo<Object, Object>>, Object> {
        public PagingSource p;
        public int q;
        public /* synthetic */ Object r;
        public /* synthetic */ boolean s;
        public final /* synthetic */ RemoteMediatorAccessor t;
        public final /* synthetic */ PageFetcher u;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ((PageFetcher) this.receiver).c.a(Boolean.TRUE);
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageFetcher pageFetcher, RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
            super(3, continuation);
            this.t = remoteMediatorAccessor;
            this.u = pageFetcher;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            RemoteMediatorAccessor remoteMediatorAccessor = this.t;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.u, remoteMediatorAccessor, (Continuation) obj3);
            anonymousClass2.r = (PageFetcher.GenerationInfo) obj;
            anonymousClass2.s = zBooleanValue;
            return anonymousClass2.invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.PageFetcher$flow$1$4, reason: invalid class name */
    final /* synthetic */ class AnonymousClass4 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ SimpleProducerScope d;

        public AnonymousClass4(SimpleProducerScope simpleProducerScope) {
            this.d = simpleProducerScope;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new FunctionReferenceImpl(2, this.d, SimpleProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objZ = this.d.z((PagingData) obj, continuation);
            return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return b().equals(((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(PageFetcher pageFetcher, Continuation continuation) {
        super(2, continuation);
        this.r = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.r, continuation);
        pageFetcher$flow$1.q = obj;
        return pageFetcher$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcher$flow$1) create((SimpleProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.q;
            PageFetcher pageFetcher = this.r;
            Flow flowA = FlowExtKt.a(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(FlowKt.B(new FlowExtKt$simpleScan$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(null, null), pageFetcher.c.b), new AnonymousClass2(pageFetcher, null, null), null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(pageFetcher, null, null));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(simpleProducerScope);
            this.p = 1;
            if (flowA.collect(anonymousClass4, this) == coroutineSingletons) {
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
