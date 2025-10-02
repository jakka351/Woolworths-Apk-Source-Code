package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes4.dex */
public final class j extends SuspendLambda implements Function2 {
    public Mutex p;
    public RemoteLogImpl q;
    public Map r;
    public int s;
    public final /* synthetic */ RemoteLogImpl t;
    public final /* synthetic */ Map u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RemoteLogImpl remoteLogImpl, Map map, Continuation continuation) {
        super(2, continuation);
        this.t = remoteLogImpl;
        this.u = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.t, this.u, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x027c, code lost:
    
        if (r0.trySendingBatchInternal(r18) != r6) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ea: MOVE (r2 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:46:0x00ea */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x005d, PHI: r7 r12 r13 r14
  0x009b: PHI (r7v5 java.util.Map) = (r7v3 java.util.Map), (r7v7 java.util.Map) binds: [B:34:0x0097, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r12v3 RemoteLogImpl) = (r12v1 RemoteLogImpl), (r12v5 RemoteLogImpl) binds: [B:34:0x0097, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r13v4 kotlinx.coroutines.sync.Mutex) = (r13v2 kotlinx.coroutines.sync.Mutex), (r13v5 kotlinx.coroutines.sync.Mutex) binds: [B:34:0x0097, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r14v3 java.lang.Object) = (r14v2 java.lang.Object), (r14v13 java.lang.Object) binds: [B:34:0x0097, B:26:0x005a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x005d, blocks: (B:25:0x0057, B:36:0x009b, B:38:0x00a1, B:40:0x00bb, B:42:0x00c1, B:43:0x00d5, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:33:0x0087), top: B:99:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:25:0x0057, B:36:0x009b, B:38:0x00a1, B:40:0x00bb, B:42:0x00c1, B:43:0x00d5, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:33:0x0087), top: B:99:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:25:0x0057, B:36:0x009b, B:38:0x00a1, B:40:0x00bb, B:42:0x00c1, B:43:0x00d5, B:47:0x00ed, B:49:0x00f1, B:51:0x00f7, B:33:0x0087), top: B:99:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:65:0x0157, B:67:0x0161, B:68:0x018a, B:70:0x019c, B:72:0x01a2, B:73:0x01b2, B:76:0x01ba, B:77:0x01e1, B:20:0x0048, B:53:0x0105, B:55:0x010d, B:57:0x0113, B:58:0x0131), top: B:101:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161 A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:65:0x0157, B:67:0x0161, B:68:0x018a, B:70:0x019c, B:72:0x01a2, B:73:0x01b2, B:76:0x01ba, B:77:0x01e1, B:20:0x0048, B:53:0x0105, B:55:0x010d, B:57:0x0113, B:58:0x0131), top: B:101:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:65:0x0157, B:67:0x0161, B:68:0x018a, B:70:0x019c, B:72:0x01a2, B:73:0x01b2, B:76:0x01ba, B:77:0x01e1, B:20:0x0048, B:53:0x0105, B:55:0x010d, B:57:0x0113, B:58:0x0131), top: B:101:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0201  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
