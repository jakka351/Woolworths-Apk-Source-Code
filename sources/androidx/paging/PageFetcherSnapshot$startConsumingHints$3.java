package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {646, 238}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public PageFetcherSnapshotState.Holder p;
    public MutexImpl q;
    public PageFetcherSnapshot r;
    public int s;
    public final /* synthetic */ PageFetcherSnapshot t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$3(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.t = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PageFetcherSnapshot$startConsumingHints$3(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (androidx.paging.PageFetcherSnapshot.a(r1, r4, androidx.paging.LoadType.f, r7) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r8)
            goto L62
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            androidx.paging.PageFetcherSnapshot r1 = r7.r
            kotlinx.coroutines.sync.MutexImpl r3 = r7.q
            androidx.paging.PageFetcherSnapshotState$Holder r4 = r7.p
            kotlin.ResultKt.b(r8)
            goto L3b
        L22:
            kotlin.ResultKt.b(r8)
            androidx.paging.PageFetcherSnapshot r1 = r7.t
            androidx.paging.PageFetcherSnapshotState$Holder r4 = r1.k
            kotlinx.coroutines.sync.MutexImpl r8 = r4.f3563a
            r7.p = r4
            r7.q = r8
            r7.r = r1
            r7.s = r3
            java.lang.Object r3 = r8.a(r7)
            if (r3 != r0) goto L3a
            goto L61
        L3a:
            r3 = r8
        L3b:
            r8 = 0
            androidx.paging.PageFetcherSnapshotState r4 = r4.b     // Catch: java.lang.Throwable -> L65
            kotlinx.coroutines.channels.BufferedChannel r5 = r4.j     // Catch: java.lang.Throwable -> L65
            kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.n(r5)     // Catch: java.lang.Throwable -> L65
            androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 r6 = new androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1     // Catch: java.lang.Throwable -> L65
            r6.<init>(r4, r8)     // Catch: java.lang.Throwable -> L65
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1     // Catch: java.lang.Throwable -> L65
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L65
            r3.c(r8)
            r7.p = r8
            r7.q = r8
            r7.r = r8
            r7.s = r2
            androidx.paging.LoadType r8 = androidx.paging.LoadType.f
            java.lang.Object r8 = androidx.paging.PageFetcherSnapshot.a(r1, r4, r8, r7)
            if (r8 != r0) goto L62
        L61:
            return r0
        L62:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L65:
            r0 = move-exception
            r3.c(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$startConsumingHints$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
