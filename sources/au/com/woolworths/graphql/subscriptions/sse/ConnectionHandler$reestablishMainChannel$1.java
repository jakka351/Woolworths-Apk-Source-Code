package au.com.woolworths.graphql.subscriptions.sse;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler", f = "ConnectionHandler.kt", l = {220, BERTags.FLAGS}, m = "reestablishMainChannel")
/* loaded from: classes4.dex */
final class ConnectionHandler$reestablishMainChannel$1 extends ContinuationImpl {
    public Object p;
    public Iterator q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ConnectionHandler s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$reestablishMainChannel$1(ConnectionHandler connectionHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return ConnectionHandler.a(this.s, this);
    }
}
