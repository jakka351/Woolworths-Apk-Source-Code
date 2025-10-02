package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", l = {267, 171}, m = "executePendingRequests")
/* loaded from: classes4.dex */
final class BatchingHttpInterceptor$executePendingRequests$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BatchingHttpInterceptor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchingHttpInterceptor$executePendingRequests$1(BatchingHttpInterceptor batchingHttpInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = batchingHttpInterceptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
