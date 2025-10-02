package au.com.woolworths.graphql.subscriptions.sse;

import com.apollographql.apollo.api.ApolloRequest;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$dispose$1$job$1", f = "ConnectionHandler.kt", l = {237}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ConnectionHandler$dispose$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public ConnectionHandler p;
    public Iterator q;
    public int r;
    public final /* synthetic */ ConnectionHandler s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$dispose$1$job$1(ConnectionHandler connectionHandler, Continuation continuation) {
        super(2, continuation);
        this.s = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionHandler$dispose$1$job$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionHandler$dispose$1$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map mapUnmodifiableMap;
        Iterator it;
        ConnectionHandler connectionHandler;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            ConnectionHandler connectionHandler2 = this.s;
            ConcurrentHashMap concurrentHashMap = connectionHandler2.h.f9034a;
            if (concurrentHashMap.isEmpty()) {
                mapUnmodifiableMap = EmptyMap.d;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(concurrentHashMap));
                Intrinsics.e(mapUnmodifiableMap);
            }
            it = mapUnmodifiableMap.entrySet().iterator();
            connectionHandler = connectionHandler2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.q;
            connectionHandler = this.p;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            ApolloRequest apolloRequest = (ApolloRequest) ((Map.Entry) it.next()).getValue();
            this.p = connectionHandler;
            this.q = it;
            this.r = 1;
            if (connectionHandler.g(apolloRequest, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
