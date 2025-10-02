package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import androidx.room.Dao;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class InboxMessageDao {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a5 -> B:31:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e9 -> B:32:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object i(au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao r24, java.util.ArrayList r25, java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao.i(au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao, java.util.ArrayList, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public abstract Object a(String str, String str2, Continuation continuation);

    public abstract Object b(InboxMessageEntity inboxMessageEntity, Continuation continuation);

    public abstract Object c(String str, Continuation continuation);

    public abstract Object d(String str, Continuation continuation);

    public abstract Object e(ArrayList arrayList, Continuation continuation);

    public abstract Flow f(String str);

    public abstract Object g(InboxMessageEntity inboxMessageEntity, Continuation continuation);

    public Object h(ArrayList arrayList, String str, Continuation continuation) {
        return i(this, arrayList, str, (ContinuationImpl) continuation);
    }
}
