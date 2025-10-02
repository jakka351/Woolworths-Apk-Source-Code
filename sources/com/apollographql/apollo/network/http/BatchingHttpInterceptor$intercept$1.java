package com.apollographql.apollo.network.http;

import com.apollographql.apollo.network.http.BatchingHttpInterceptor;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor", f = "BatchingHttpInterceptor.kt", l = {95, SubsamplingScaleImageView.ORIENTATION_270, 109, 117}, m = "intercept")
/* loaded from: classes4.dex */
final class BatchingHttpInterceptor$intercept$1 extends ContinuationImpl {
    public BatchingHttpInterceptor.PendingRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BatchingHttpInterceptor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchingHttpInterceptor$intercept$1(BatchingHttpInterceptor batchingHttpInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = batchingHttpInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
