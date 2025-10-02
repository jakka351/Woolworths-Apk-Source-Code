package au.com.woolworths.foundation.appcomms.inbox.client;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl", f = "InboxClient.kt", l = {273, 274}, m = "deleteAll")
/* loaded from: classes4.dex */
final class InboxClientImpl$deleteAll$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InboxClientImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxClientImpl$deleteAll$1(InboxClientImpl inboxClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = inboxClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
