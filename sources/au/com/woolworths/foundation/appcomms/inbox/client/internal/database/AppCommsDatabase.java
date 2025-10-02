package au.com.woolworths.foundation.appcomms.inbox.client.internal.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao;
import kotlin.Metadata;

@TypeConverters
@Database
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/AppCommsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AppCommsDatabase extends RoomDatabase {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/AppCommsDatabase$Companion;", "", "", "Name", "Ljava/lang/String;", "", "Version", "I", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public abstract InboxMessageDao t();

    public abstract SyncMetadataDao u();
}
