package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {232, 98}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super GenerationalViewportHint>, Integer, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ PageFetcherSnapshot s;
    public final /* synthetic */ LoadType t;
    public MutexImpl u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, continuation);
        this.s = pageFetcherSnapshot;
        this.t = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1((Continuation) obj3, this.s, this.t);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.q = (FlowCollector) obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.r = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.u(r8, r2, r11) == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            androidx.paging.LoadType r0 = r11.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r11.p
            androidx.paging.PageFetcherSnapshot r3 = r11.s
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L15
            kotlin.ResultKt.b(r12)
            goto L9e
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            int r2 = r11.v
            kotlinx.coroutines.sync.MutexImpl r6 = r11.u
            java.lang.Object r7 = r11.r
            androidx.paging.PageFetcherSnapshotState$Holder r7 = (androidx.paging.PageFetcherSnapshotState.Holder) r7
            kotlinx.coroutines.flow.FlowCollector r8 = r11.q
            kotlin.ResultKt.b(r12)
            goto L4d
        L2b:
            kotlin.ResultKt.b(r12)
            kotlinx.coroutines.flow.FlowCollector r8 = r11.q
            java.lang.Object r12 = r11.r
            java.lang.Number r12 = (java.lang.Number) r12
            int r2 = r12.intValue()
            androidx.paging.PageFetcherSnapshotState$Holder r7 = r3.k
            kotlinx.coroutines.sync.MutexImpl r6 = r7.f3563a
            r11.q = r8
            r11.r = r7
            r11.u = r6
            r11.v = r2
            r11.p = r5
            java.lang.Object r12 = r6.a(r11)
            if (r12 != r1) goto L4d
            goto L9d
        L4d:
            r12 = 0
            androidx.paging.PageFetcherSnapshotState r7 = r7.b     // Catch: java.lang.Throwable -> L6a
            androidx.paging.MutableLoadStateCollection r7 = r7.l     // Catch: java.lang.Throwable -> L6a
            androidx.paging.LoadState r9 = r7.a(r0)     // Catch: java.lang.Throwable -> L6a
            androidx.paging.LoadState$NotLoading r10 = androidx.paging.LoadState.NotLoading.b     // Catch: java.lang.Throwable -> L6a
            boolean r9 = kotlin.jvm.internal.Intrinsics.c(r9, r10)     // Catch: java.lang.Throwable -> L6a
            r10 = 0
            if (r9 == 0) goto L6c
            androidx.paging.GenerationalViewportHint[] r0 = new androidx.paging.GenerationalViewportHint[r10]     // Catch: java.lang.Throwable -> L6a
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 r2 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            r6.c(r12)
            goto L8f
        L6a:
            r0 = move-exception
            goto La1
        L6c:
            androidx.paging.LoadState r9 = r7.a(r0)     // Catch: java.lang.Throwable -> L6a
            boolean r9 = r9 instanceof androidx.paging.LoadState.Error     // Catch: java.lang.Throwable -> L6a
            if (r9 != 0) goto L79
            androidx.paging.LoadState$NotLoading r9 = androidx.paging.LoadState.NotLoading.c     // Catch: java.lang.Throwable -> L6a
            r7.c(r0, r9)     // Catch: java.lang.Throwable -> L6a
        L79:
            r6.c(r12)
            androidx.paging.HintHandler r3 = r3.h
            kotlinx.coroutines.flow.SharedFlowImpl r0 = r3.a(r0)
            if (r2 != 0) goto L85
            r5 = r10
        L85:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 r0 = kotlinx.coroutines.flow.FlowKt.s(r0, r5)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1
            r3.<init>()
            r2 = r3
        L8f:
            r11.q = r12
            r11.r = r12
            r11.u = r12
            r11.p = r4
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.u(r8, r2, r11)
            if (r12 != r1) goto L9e
        L9d:
            return r1
        L9e:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        La1:
            r6.c(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
