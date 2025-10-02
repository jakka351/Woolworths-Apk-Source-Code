package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "PendingRequest", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BatchingHttpInterceptor implements HttpInterceptor {

    /* renamed from: a, reason: collision with root package name */
    public HttpInterceptorChain f13625a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$Companion;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$PendingRequest;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PendingRequest {

        /* renamed from: a, reason: collision with root package name */
        public final CompletableDeferred f13626a;

        public PendingRequest(HttpRequest request) {
            Intrinsics.h(request, "request");
            this.f13626a = CompletableDeferredKt.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.apollographql.apollo.api.http.HttpRequest r8, com.apollographql.apollo.network.http.DefaultHttpInterceptorChain r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1
            if (r0 == 0) goto L13
            r0 = r10
            com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1 r0 = (com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1 r0 = new com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L51
            if (r2 == r3) goto L4c
            r8 = 4
            r9 = 3
            if (r2 == r9) goto L39
            if (r2 != r8) goto L31
            kotlin.ResultKt.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.apollographql.apollo.network.http.BatchingHttpInterceptor$PendingRequest r9 = r0.p
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.CompletableDeferred r9 = r9.f13626a
            r0.p = r5
            r0.s = r8
            java.lang.Object r8 = r9.await(r0)
            if (r8 != r1) goto L4b
            goto La3
        L4b:
            return r8
        L4c:
            kotlin.ResultKt.b(r10)
            throw r5     // Catch: java.lang.Throwable -> L50
        L50:
            throw r5
        L51:
            kotlin.ResultKt.b(r10)
            return r10
        L55:
            kotlin.ResultKt.b(r10)
            java.util.List r10 = r8.c
            java.lang.String r2 = "X-APOLLO-CAN-BE-BATCHED"
            java.lang.String r10 = com.apollographql.apollo.api.http.HttpHeaders.a(r2, r10)
            if (r10 == 0) goto L67
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            goto L68
        L67:
            r10 = r4
        L68:
            if (r10 != 0) goto La5
            com.apollographql.apollo.api.http.HttpRequest$Builder r10 = com.apollographql.apollo.api.http.HttpRequest.a(r8)
            java.util.List r8 = r8.c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L7b:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L94
            java.lang.Object r5 = r8.next()
            r6 = r5
            com.apollographql.apollo.api.http.HttpHeader r6 = (com.apollographql.apollo.api.http.HttpHeader) r6
            java.lang.String r6 = r6.f13528a
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
            if (r6 != 0) goto L7b
            r3.add(r5)
            goto L7b
        L94:
            r10.a(r3)
            com.apollographql.apollo.api.http.HttpRequest r8 = r10.b()
            r0.s = r4
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto La4
        La3:
            return r1
        La4:
            return r8
        La5:
            r7.f13625a = r9
            com.apollographql.apollo.network.http.BatchingHttpInterceptor$PendingRequest r9 = new com.apollographql.apollo.network.http.BatchingHttpInterceptor$PendingRequest
            r9.<init>(r8)
            r0.p = r9
            r0.s = r3
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.BatchingHttpInterceptor.a(com.apollographql.apollo.api.http.HttpRequest, com.apollographql.apollo.network.http.DefaultHttpInterceptorChain, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public final void dispose() {
        throw null;
    }
}
