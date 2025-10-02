package au.com.woolworths.graphql.subscriptions.sse;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler", f = "ConnectionHandler.kt", l = {302, 309}, m = "closeMainChannel")
/* loaded from: classes4.dex */
final class ConnectionHandler$closeMainChannel$1 extends ContinuationImpl {
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConnectionHandler r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$closeMainChannel$1(ConnectionHandler connectionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(false, this);
    }
}
