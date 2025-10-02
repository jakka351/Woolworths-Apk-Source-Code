package au.com.woolworths.foundation.appcomms.inbox.client;

import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.sync.InboxSyncerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/BffDataSource;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BffDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final InboxSyncerImpl f8405a;
    public final InboxMessageDao b;
    public final SyncMetadataDao c;

    public BffDataSource(InboxSyncerImpl inboxSyncerImpl, InboxMessageDao inboxMessageDao, SyncMetadataDao syncMetadataDao) {
        Intrinsics.h(inboxMessageDao, "inboxMessageDao");
        Intrinsics.h(syncMetadataDao, "syncMetadataDao");
        this.f8405a = inboxSyncerImpl;
        this.b = inboxMessageDao;
        this.c = syncMetadataDao;
    }
}
