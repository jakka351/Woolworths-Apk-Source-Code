package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {646, 179}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<Object>>, Continuation<? super Unit>, Object> {
    public MutexImpl p;
    public FlowCollector q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ PageFetcherSnapshot t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.t = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.t, continuation);
        pageFetcherSnapshot$pageEventFlow$2.s = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r1.emit(r3, r5) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L62
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlinx.coroutines.flow.FlowCollector r1 = r5.q
            kotlinx.coroutines.sync.MutexImpl r3 = r5.p
            java.lang.Object r4 = r5.s
            androidx.paging.PageFetcherSnapshotState$Holder r4 = (androidx.paging.PageFetcherSnapshotState.Holder) r4
            kotlin.ResultKt.b(r6)
            goto L42
        L24:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.s
            r1 = r6
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.paging.PageFetcherSnapshot r6 = r5.t
            androidx.paging.PageFetcherSnapshotState$Holder r4 = r6.k
            kotlinx.coroutines.sync.MutexImpl r6 = r4.f3563a
            r5.s = r4
            r5.p = r6
            r5.q = r1
            r5.r = r3
            java.lang.Object r3 = r6.a(r5)
            if (r3 != r0) goto L41
            goto L61
        L41:
            r3 = r6
        L42:
            r6 = 0
            androidx.paging.PageFetcherSnapshotState r4 = r4.b     // Catch: java.lang.Throwable -> L65
            androidx.paging.MutableLoadStateCollection r4 = r4.l     // Catch: java.lang.Throwable -> L65
            androidx.paging.LoadStates r4 = r4.d()     // Catch: java.lang.Throwable -> L65
            r3.c(r6)
            androidx.paging.PageEvent$LoadStateUpdate r3 = new androidx.paging.PageEvent$LoadStateUpdate
            r3.<init>(r4, r6)
            r5.s = r6
            r5.p = r6
            r5.q = r6
            r5.r = r2
            java.lang.Object r6 = r1.emit(r3, r5)
            if (r6 != r0) goto L62
        L61:
            return r0
        L62:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L65:
            r0 = move-exception
            r3.c(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
