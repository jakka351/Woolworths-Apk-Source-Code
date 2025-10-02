package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.MutableExecutionOptions;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ApolloCall;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/MutableExecutionOptions;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ApolloCall<D extends Operation.Data> implements MutableExecutionOptions<ApolloCall<D>> {
    public final ApolloClient d;
    public final ApolloRequest.Builder e;

    public ApolloCall(ApolloClient apolloClient, Operation operation) {
        Intrinsics.h(apolloClient, "apolloClient");
        ApolloRequest.Builder builder = new ApolloRequest.Builder(operation);
        this.d = apolloClient;
        this.e = builder;
    }

    public final void a(String str, String value) {
        Intrinsics.h(value, "value");
        this.e.a(str, value);
    }

    public final Object b(Continuation continuation) {
        return c(d(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlinx.coroutines.flow.Flow r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.apollographql.apollo.ApolloCall$singleSuccessOrException$1
            if (r0 == 0) goto L13
            r0 = r6
            com.apollographql.apollo.ApolloCall$singleSuccessOrException$1 r0 = (com.apollographql.apollo.ApolloCall$singleSuccessOrException$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.apollographql.apollo.ApolloCall$singleSuccessOrException$1 r0 = new com.apollographql.apollo.ApolloCall$singleSuccessOrException$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.r = r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.P(r5, r6, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.apollographql.apollo.api.ApolloResponse r2 = (com.apollographql.apollo.api.ApolloResponse) r2
            com.apollographql.apollo.exception.ApolloException r2 = r2.e
            if (r2 == 0) goto L67
            r5.add(r1)
            goto L52
        L67:
            r0.add(r1)
            goto L52
        L6b:
            int r6 = r0.size()
            if (r6 == 0) goto L82
            if (r6 != r3) goto L7a
            java.lang.Object r5 = kotlin.collections.CollectionsKt.D(r0)
            com.apollographql.apollo.api.ApolloResponse r5 = (com.apollographql.apollo.api.ApolloResponse) r5
            return r5
        L7a:
            com.apollographql.apollo.exception.DefaultApolloException r5 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r6 = "The operation returned multiple items, use .toFlow() instead of .execute()"
            r5.<init>(r6)
            throw r5
        L82:
            int r6 = r5.size()
            if (r6 == 0) goto Lc6
            if (r6 == r3) goto Lbf
            java.lang.Object r6 = kotlin.collections.CollectionsKt.D(r5)
            com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6
            com.apollographql.apollo.api.ApolloResponse$Builder r0 = r6.c()
            java.util.List r5 = kotlin.collections.CollectionsKt.x(r5, r3)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.apollographql.apollo.exception.ApolloException r6 = r6.e
            kotlin.jvm.internal.Intrinsics.e(r6)
            java.util.Iterator r5 = r5.iterator()
        La3:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r5.next()
            com.apollographql.apollo.api.ApolloResponse r1 = (com.apollographql.apollo.api.ApolloResponse) r1
            com.apollographql.apollo.exception.ApolloException r1 = r1.e
            kotlin.jvm.internal.Intrinsics.e(r1)
            kotlin.ExceptionsKt.a(r6, r1)
            goto La3
        Lb8:
            r0.f = r6
            com.apollographql.apollo.api.ApolloResponse r5 = r0.a()
            return r5
        Lbf:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.D(r5)
            com.apollographql.apollo.api.ApolloResponse r5 = (com.apollographql.apollo.api.ApolloResponse) r5
            return r5
        Lc6:
            com.apollographql.apollo.exception.DefaultApolloException r5 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r6 = "The operation did not emit any item, check your interceptor chain"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.ApolloCall.c(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow d() {
        ApolloRequest apolloRequestB = this.e.b();
        ApolloClient apolloClient = this.d;
        apolloClient.getClass();
        return FlowKt.c(FlowKt.D(FlowKt.f(new ApolloClient$executeAsFlowInternal$flow$1(apolloClient, apolloRequestB, null)), Dispatchers.b), Integer.MAX_VALUE);
    }
}
