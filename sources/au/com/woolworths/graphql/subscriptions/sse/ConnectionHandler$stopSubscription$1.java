package au.com.woolworths.graphql.subscriptions.sse;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler", f = "ConnectionHandler.kt", l = {189, 193}, m = "stopSubscription")
/* loaded from: classes4.dex */
final class ConnectionHandler$stopSubscription$1<D extends Operation.Data> extends ContinuationImpl {
    public ApolloRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConnectionHandler r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$stopSubscription$1(ConnectionHandler connectionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.g(null, this);
    }
}
