package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UnbatchedFlowCombiner<T1, T2> {

    /* renamed from: a, reason: collision with root package name */
    public final SuspendLambda f3591a;
    public final CompletableDeferred b = CompletableDeferredKt.a();
    public final MutexImpl c = MutexKt.a();
    public final CompletableDeferred[] d;
    public final Object[] e;

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(Function4 function4) {
        this.f3591a = (SuspendLambda) function4;
        CompletableDeferred[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.a();
        }
        this.d = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = FlowExtKt.f3536a;
        }
        this.e = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r16.b.await(r3) == r4) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:34:0x00a0, B:39:0x00ab, B:46:0x00bd, B:48:0x00c3, B:51:0x00c8, B:53:0x00cd, B:57:0x00d7, B:55:0x00d2, B:56:0x00d5, B:42:0x00b2), top: B:67:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r17, java.lang.Object r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.UnbatchedFlowCombiner.a(int, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
