package me.oriient.internal.services.remoteLog.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.remoteLog.models.a;
import me.oriient.internal.services.remoteLog.models.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogBatchConfigTable;", "Lme/oriient/internal/services/remoteLog/models/a;", "toData", "(Lme/oriient/internal/services/remoteLog/database/RemoteLogBatchConfigTable;)Lme/oriient/internal/services/remoteLog/models/a;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogMessagesTable;", "Lme/oriient/internal/services/remoteLog/models/d;", "(Lme/oriient/internal/services/remoteLog/database/RemoteLogMessagesTable;)Lme/oriient/internal/services/remoteLog/models/d;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatabaseServiceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a toData(RemoteLogBatchConfigTable remoteLogBatchConfigTable) {
        String value = remoteLogBatchConfigTable.getId();
        Intrinsics.h(value, "value");
        return new a(value, remoteLogBatchConfigTable.getUrl(), remoteLogBatchConfigTable.getTime(), remoteLogBatchConfigTable.getRetries(), remoteLogBatchConfigTable.getTimeToSend(), remoteLogBatchConfigTable.getRequireCharger(), remoteLogBatchConfigTable.getAllowMeteredNetworks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d toData(RemoteLogMessagesTable remoteLogMessagesTable) {
        long time = remoteLogMessagesTable.getTime();
        byte[] message = remoteLogMessagesTable.getMessage();
        String value = remoteLogMessagesTable.getBatchId();
        Intrinsics.h(value, "value");
        return new d(time, message, value);
    }
}
