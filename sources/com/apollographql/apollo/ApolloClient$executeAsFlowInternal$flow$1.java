package com.apollographql.apollo;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.interceptor.DefaultInterceptorChain;
import com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt;
import com.apollographql.apollo.internal.ApolloClientListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1", f = "ApolloClient.kt", l = {261}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes.dex */
final class ApolloClient$executeAsFlowInternal$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super ApolloResponse<Operation.Data>>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ApolloClient r;
    public final /* synthetic */ ApolloRequest s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2", f = "ApolloClient.kt", l = {262}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.ApolloClient$executeAsFlowInternal$flow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ ApolloClient q;
        public final /* synthetic */ ApolloRequest r;
        public final /* synthetic */ ProducerScope s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApolloClient apolloClient, ApolloRequest apolloRequest, ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.q = apolloClient;
            this.r = apolloRequest;
            this.s = producerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ApolloClient apolloClient = this.q;
                apolloClient.getClass();
                ApolloRequest.Builder builderA = this.r.a();
                ExecutionContext executionContext = apolloClient.d.d(apolloClient.h).d(apolloClient.j).d(builderA.f);
                Intrinsics.h(executionContext, "executionContext");
                builderA.f = executionContext;
                HttpMethod httpMethod = builderA.g;
                if (httpMethod == null) {
                    httpMethod = null;
                }
                builderA.g = httpMethod;
                Boolean bool = builderA.j;
                if (bool == null) {
                    bool = null;
                }
                builderA.j = bool;
                Boolean bool2 = builderA.k;
                if (bool2 == null) {
                    bool2 = null;
                }
                builderA.k = bool2;
                Boolean bool3 = builderA.i;
                if (bool3 == null) {
                    bool3 = null;
                }
                builderA.i = bool3;
                ListBuilder listBuilderV = CollectionsKt.v();
                List list = EmptyList.d;
                listBuilderV.addAll(list);
                List list2 = builderA.h;
                if (list2 != null) {
                    list = list2;
                }
                listBuilderV.addAll(list);
                builderA.h = CollectionsKt.q(listBuilderV);
                Boolean bool4 = builderA.l;
                if (bool4 == null) {
                    bool4 = null;
                }
                builderA.l = bool4;
                Boolean bool5 = builderA.m;
                builderA.m = bool5 != null ? bool5 : null;
                ApolloRequest apolloRequestB = builderA.b();
                ListBuilder listBuilderV2 = CollectionsKt.v();
                listBuilderV2.addAll(apolloClient.g);
                listBuilderV2.add(RetryOnErrorInterceptorKt.a());
                listBuilderV2.add(apolloClient.k);
                Flow flowA = new DefaultInterceptorChain(CollectionsKt.q(listBuilderV2), 0).a(apolloRequestB);
                final ProducerScope producerScope = this.s;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.apollographql.apollo.ApolloClient.executeAsFlowInternal.flow.1.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objZ = producerScope.z((ApolloResponse) obj2, continuation);
                        return objZ == CoroutineSingletons.d ? objZ : Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloClient$executeAsFlowInternal$flow$1(ApolloClient apolloClient, ApolloRequest apolloRequest, Continuation continuation) {
        super(2, continuation);
        this.r = apolloClient;
        this.s = apolloRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApolloClient$executeAsFlowInternal$flow$1 apolloClient$executeAsFlowInternal$flow$1 = new ApolloClient$executeAsFlowInternal$flow$1(this.r, this.s, continuation);
        apolloClient$executeAsFlowInternal$flow$1.q = obj;
        return apolloClient$executeAsFlowInternal$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ApolloClient$executeAsFlowInternal$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ApolloClient apolloClient = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ProducerScope producerScope = (ProducerScope) this.q;
                Iterator it2 = apolloClient.i.iterator();
                while (it2.hasNext()) {
                    ((ApolloClientListener) it2.next()).a();
                }
                CoroutineDispatcher coroutineDispatcher = apolloClient.d.f13491a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(apolloClient, this.s, producerScope, null);
                this.p = 1;
                if (BuildersKt.f(coroutineDispatcher, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            while (it.hasNext()) {
                ((ApolloClientListener) it.next()).b();
            }
            return Unit.f24250a;
        } finally {
            it = apolloClient.i.iterator();
            while (it.hasNext()) {
                ((ApolloClientListener) it.next()).b();
            }
        }
    }
}
