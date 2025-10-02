package au.com.woolworths.foundation.appcomms.inbox.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.InboxClientImpl", f = "InboxClient.kt", l = {252, 255}, m = "markAsSeen")
/* loaded from: classes4.dex */
final class InboxClientImpl$markAsSeen$1 extends ContinuationImpl {
    public ArrayList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InboxClientImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxClientImpl$markAsSeen$1(InboxClientImpl inboxClientImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = inboxClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, this);
    }
}
