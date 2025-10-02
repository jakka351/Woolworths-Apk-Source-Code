package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {219, 220}, m = "emitSource$lifecycle_livedata_release")
/* loaded from: classes2.dex */
final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CoroutineLiveData q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData coroutineLiveData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = coroutineLiveData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r1 == r2) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.p = r7
            int r7 = r6.r
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.r = r7
            androidx.lifecycle.CoroutineLiveData r7 = r6.q
            r7.getClass()
            int r1 = r6.r
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r6.r = r1
            r0 = r6
            goto L1e
        L19:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r7, r6)
        L1e:
            java.lang.Object r1 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r0.r
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            kotlin.ResultKt.b(r1)
            goto L5f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.b(r1)
            goto L48
        L3c:
            kotlin.ResultKt.b(r1)
            r0.r = r5
            java.lang.Object r1 = r7.p(r0)
            if (r1 != r2) goto L48
            goto L5e
        L48:
            r0.r = r4
            kotlinx.coroutines.scheduling.DefaultScheduler r1 = kotlinx.coroutines.Dispatchers.f24691a
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.internal.MainDispatcherLoader.f24726a
            kotlinx.coroutines.MainCoroutineDispatcher r1 = r1.T()
            androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2 r3 = new androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2
            r4 = 0
            r3.<init>(r7, r4, r4)
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.f(r1, r3, r0)
            if (r1 != r2) goto L5f
        L5e:
            return r2
        L5f:
            androidx.lifecycle.EmittedSource r1 = (androidx.lifecycle.EmittedSource) r1
            r7.n = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData$emitSource$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
