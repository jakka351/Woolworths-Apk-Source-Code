package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1", f = "HttpNetworkTransport.kt", l = {71, 107}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class HttpNetworkTransport$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<Operation.Data>>, Continuation<? super Unit>, Object> {
    public long p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ HttpNetworkTransport s;
    public final /* synthetic */ HttpRequest t;
    public final /* synthetic */ ApolloRequest u;
    public final /* synthetic */ CustomScalarAdapters v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$execute$1(HttpNetworkTransport httpNetworkTransport, HttpRequest httpRequest, ApolloRequest apolloRequest, CustomScalarAdapters customScalarAdapters, Continuation continuation) {
        super(2, continuation);
        this.s = httpNetworkTransport;
        this.t = httpRequest;
        this.u = apolloRequest;
        this.v = customScalarAdapters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HttpNetworkTransport$execute$1 httpNetworkTransport$execute$1 = new HttpNetworkTransport$execute$1(this.s, this.t, this.u, this.v, continuation);
        httpNetworkTransport$execute$1.r = obj;
        return httpNetworkTransport$execute$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HttpNetworkTransport$execute$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.u(r15, r2, r18) == r12) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
