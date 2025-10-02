package au.com.woolworths.graphql.subscriptions.sse;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler", f = "ConnectionHandler.kt", l = {505, 285}, m = "getConnectionData")
/* loaded from: classes4.dex */
final class ConnectionHandler$getConnectionData$1 extends ContinuationImpl {
    public boolean p;
    public Mutex q;
    public Ref.BooleanRef r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ConnectionHandler t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$getConnectionData$1(ConnectionHandler connectionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(false, this);
    }
}
