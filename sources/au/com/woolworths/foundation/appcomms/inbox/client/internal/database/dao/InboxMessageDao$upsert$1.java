package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao", f = "InboxMessageDao.kt", l = {34, 36, 39}, m = "upsert$suspendImpl")
/* loaded from: classes4.dex */
final class InboxMessageDao$upsert$1 extends ContinuationImpl {
    public InboxMessageDao p;
    public String q;
    public Iterator r;
    public InboxMessageEntity s;
    public /* synthetic */ Object t;
    public final /* synthetic */ InboxMessageDao u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageDao$upsert$1(InboxMessageDao inboxMessageDao, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = inboxMessageDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return InboxMessageDao.i(this.u, null, null, this);
    }
}
