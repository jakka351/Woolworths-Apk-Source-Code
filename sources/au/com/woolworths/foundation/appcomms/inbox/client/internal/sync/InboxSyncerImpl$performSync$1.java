package au.com.woolworths.foundation.appcomms.inbox.client.internal.sync;

import au.com.woolworths.foundation.appcomms.inbox.datasource.common.LastChatbotMessageRemote;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl", f = "InboxSyncer.kt", l = {110, 115, 120, 129, 139, 143}, m = "performSync")
/* loaded from: classes4.dex */
final class InboxSyncerImpl$performSync$1 extends ContinuationImpl {
    public Object p;
    public LastChatbotMessageRemote q;
    public /* synthetic */ Object r;
    public final /* synthetic */ InboxSyncerImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxSyncerImpl$performSync$1(InboxSyncerImpl inboxSyncerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = inboxSyncerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return InboxSyncerImpl.a(this.s, null, null, null, this);
    }
}
