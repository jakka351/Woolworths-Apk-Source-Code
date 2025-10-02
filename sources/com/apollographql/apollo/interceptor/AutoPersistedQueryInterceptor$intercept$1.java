package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1", f = "AutoPersistedQueryInterceptor.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AutoPersistedQueryInterceptor$intercept$1 extends SuspendLambda implements Function2<FlowCollector<? super ApolloResponse<Operation.Data>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ DefaultInterceptorChain r;
    public final /* synthetic */ ApolloRequest s;
    public final /* synthetic */ AutoPersistedQueryInterceptor t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPersistedQueryInterceptor$intercept$1(DefaultInterceptorChain defaultInterceptorChain, ApolloRequest apolloRequest, AutoPersistedQueryInterceptor autoPersistedQueryInterceptor, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = defaultInterceptorChain;
        this.s = apolloRequest;
        this.t = autoPersistedQueryInterceptor;
        this.u = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoPersistedQueryInterceptor$intercept$1 autoPersistedQueryInterceptor$intercept$1 = new AutoPersistedQueryInterceptor$intercept$1(this.r, this.s, this.t, this.u, continuation);
        autoPersistedQueryInterceptor$intercept$1.q = obj;
        return autoPersistedQueryInterceptor$intercept$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoPersistedQueryInterceptor$intercept$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final FlowCollector flowCollector = (FlowCollector) this.q;
            final DefaultInterceptorChain defaultInterceptorChain = this.r;
            final ApolloRequest apolloRequest = this.s;
            Flow flowA = defaultInterceptorChain.a(apolloRequest);
            final AutoPersistedQueryInterceptor autoPersistedQueryInterceptor = this.t;
            final boolean z = this.u;
            FlowCollector flowCollector2 = new FlowCollector() { // from class: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1.1
                /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        com.apollographql.apollo.api.ApolloResponse r7 = (com.apollographql.apollo.api.ApolloResponse) r7
                        java.util.List r0 = r7.d
                        r1 = 0
                        com.apollographql.apollo.api.ApolloRequest r2 = r2
                        kotlinx.coroutines.flow.FlowCollector r3 = r4
                        if (r0 == 0) goto L61
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        boolean r4 = r0 instanceof java.util.Collection
                        if (r4 == 0) goto L1b
                        r4 = r0
                        java.util.Collection r4 = (java.util.Collection) r4
                        boolean r4 = r4.isEmpty()
                        if (r4 == 0) goto L1b
                        goto L61
                    L1b:
                        java.util.Iterator r0 = r0.iterator()
                    L1f:
                        boolean r4 = r0.hasNext()
                        if (r4 == 0) goto L61
                        java.lang.Object r4 = r0.next()
                        com.apollographql.apollo.api.Error r4 = (com.apollographql.apollo.api.Error) r4
                        java.lang.String r4 = r4.f13514a
                        java.lang.String r5 = "PersistedQueryNotFound"
                        boolean r4 = r4.equalsIgnoreCase(r5)
                        if (r4 == 0) goto L1f
                        com.apollographql.apollo.api.ApolloRequest$Builder r7 = r2.a()
                        boolean r0 = r3
                        if (r0 == 0) goto L3f
                        com.apollographql.apollo.api.http.HttpMethod r1 = com.apollographql.apollo.api.http.HttpMethod.e
                    L3f:
                        r7.g = r1
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        r7.k = r0
                        r7.j = r0
                        com.apollographql.apollo.api.ApolloRequest r7 = r7.b()
                        com.apollographql.apollo.interceptor.DefaultInterceptorChain r0 = r5
                        kotlinx.coroutines.flow.Flow r7 = r0.a(r7)
                        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1 r0 = new com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1$1$emit$$inlined$map$1
                        com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor r1 = r1
                        r0.<init>()
                        java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.u(r3, r0, r8)
                        kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        if (r7 != r8) goto Lcc
                        return r7
                    L61:
                        java.util.List r0 = r7.d
                        if (r0 == 0) goto Lae
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        boolean r4 = r0 instanceof java.util.Collection
                        if (r4 == 0) goto L75
                        r4 = r0
                        java.util.Collection r4 = (java.util.Collection) r4
                        boolean r4 = r4.isEmpty()
                        if (r4 == 0) goto L75
                        goto Lae
                    L75:
                        java.util.Iterator r0 = r0.iterator()
                    L79:
                        boolean r4 = r0.hasNext()
                        if (r4 == 0) goto Lae
                        java.lang.Object r4 = r0.next()
                        com.apollographql.apollo.api.Error r4 = (com.apollographql.apollo.api.Error) r4
                        java.lang.String r4 = r4.f13514a
                        java.lang.String r5 = "PersistedQueryNotSupported"
                        boolean r4 = r4.equalsIgnoreCase(r5)
                        if (r4 == 0) goto L79
                        com.apollographql.apollo.api.ApolloResponse$Builder r7 = new com.apollographql.apollo.api.ApolloResponse$Builder
                        com.apollographql.apollo.api.Operation r0 = r2.d
                        java.util.UUID r2 = r2.e
                        r7.<init>(r0, r2)
                        com.apollographql.apollo.exception.AutoPersistedQueriesNotSupported r0 = new com.apollographql.apollo.exception.AutoPersistedQueriesNotSupported
                        java.lang.String r2 = "The server does not support auto persisted queries"
                        r0.<init>(r2, r1)
                        r7.f = r0
                        com.apollographql.apollo.api.ApolloResponse r7 = r7.a()
                        java.lang.Object r7 = r3.emit(r7, r8)
                        kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        if (r7 != r8) goto Lcc
                        return r7
                    Lae:
                        com.apollographql.apollo.api.ApolloResponse$Builder r7 = r7.c()
                        com.apollographql.apollo.AutoPersistedQueryInfo r0 = new com.apollographql.apollo.AutoPersistedQueryInfo
                        r0.<init>()
                        com.apollographql.apollo.api.ExecutionContext r1 = r7.g
                        com.apollographql.apollo.api.ExecutionContext r0 = r1.d(r0)
                        r7.g = r0
                        com.apollographql.apollo.api.ApolloResponse r7 = r7.a()
                        java.lang.Object r7 = r3.emit(r7, r8)
                        kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        if (r7 != r8) goto Lcc
                        return r7
                    Lcc:
                        kotlin.Unit r7 = kotlin.Unit.f24250a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor$intercept$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.p = 1;
            if (flowA.collect(flowCollector2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
