package me.oriient.internal.services.remoteLog.database;

import androidx.compose.ui.input.pointer.a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0007H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogMessagesTable;", "", "time", "", "message", "", "batchId", "", "(J[BLjava/lang/String;)V", "getBatchId", "()Ljava/lang/String;", "getMessage", "()[B", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemoteLogMessagesTable {

    @NotNull
    private final String batchId;

    @NotNull
    private final byte[] message;
    private final long time;

    public RemoteLogMessagesTable(long j, @NotNull byte[] message, @NotNull String batchId) {
        Intrinsics.h(message, "message");
        Intrinsics.h(batchId, "batchId");
        this.time = j;
        this.message = message;
        this.batchId = batchId;
    }

    public static /* synthetic */ RemoteLogMessagesTable copy$default(RemoteLogMessagesTable remoteLogMessagesTable, long j, byte[] bArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = remoteLogMessagesTable.time;
        }
        if ((i & 2) != 0) {
            bArr = remoteLogMessagesTable.message;
        }
        if ((i & 4) != 0) {
            str = remoteLogMessagesTable.batchId;
        }
        return remoteLogMessagesTable.copy(j, bArr, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final byte[] getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    @NotNull
    public final RemoteLogMessagesTable copy(long time, @NotNull byte[] message, @NotNull String batchId) {
        Intrinsics.h(message, "message");
        Intrinsics.h(batchId, "batchId");
        return new RemoteLogMessagesTable(time, message, batchId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteLogMessagesTable)) {
            return false;
        }
        RemoteLogMessagesTable remoteLogMessagesTable = (RemoteLogMessagesTable) other;
        return this.time == remoteLogMessagesTable.time && Intrinsics.c(this.message, remoteLogMessagesTable.message) && Intrinsics.c(this.batchId, remoteLogMessagesTable.batchId);
    }

    @NotNull
    public final String getBatchId() {
        return this.batchId;
    }

    @NotNull
    public final byte[] getMessage() {
        return this.message;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.batchId.hashCode() + a.d(Long.hashCode(this.time) * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("\n  |RemoteLogMessagesTable [\n  |  time: ");
        sb.append(this.time);
        sb.append("\n  |  message: ");
        String string = Arrays.toString(this.message);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append("\n  |  batchId: ");
        sb.append(this.batchId);
        sb.append("\n  |]\n  ");
        return StringsKt.n0(sb.toString());
    }
}
