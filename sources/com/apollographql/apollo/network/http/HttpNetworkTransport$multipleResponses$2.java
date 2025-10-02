package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "throwable", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$2", f = "HttpNetworkTransport.kt", l = {236}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class HttpNetworkTransport$multipleResponses$2 extends SuspendLambda implements Function3<FlowCollector<? super ApolloResponse<Operation.Data>>, Throwable, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Throwable r;
    public final /* synthetic */ Operation s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpNetworkTransport$multipleResponses$2(Operation operation, Continuation continuation) {
        super(3, continuation);
        this.s = operation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HttpNetworkTransport$multipleResponses$2 httpNetworkTransport$multipleResponses$2 = new HttpNetworkTransport$multipleResponses$2(this.s, (Continuation) obj3);
        httpNetworkTransport$multipleResponses$2.q = (FlowCollector) obj;
        httpNetworkTransport$multipleResponses$2.r = (Throwable) obj2;
        return httpNetworkTransport$multipleResponses$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            Throwable th = this.r;
            if (th instanceof ApolloException) {
                UUID uuidRandomUUID = UUID.randomUUID();
                Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
                ApolloResponse.Builder builder = new ApolloResponse.Builder(this.s, uuidRandomUUID);
                builder.f = (ApolloException) th;
                ApolloResponse apolloResponseA = builder.a();
                this.q = null;
                this.p = 1;
                if (flowCollector.emit(apolloResponseA, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
