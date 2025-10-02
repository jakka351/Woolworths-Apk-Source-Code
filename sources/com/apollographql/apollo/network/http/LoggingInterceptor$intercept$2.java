package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.LoggingInterceptor", f = "LoggingInterceptor.kt", l = {119, 147}, m = "intercept")
/* loaded from: classes4.dex */
final class LoggingInterceptor$intercept$2 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LoggingInterceptor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor$intercept$2(LoggingInterceptor loggingInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = loggingInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
