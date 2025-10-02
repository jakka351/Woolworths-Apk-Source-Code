package me.oriient.internal.services.remoteLog.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/GetLastMessagesShort;", "", "time", "", "batchId", "", "(JLjava/lang/String;)V", "getBatchId", "()Ljava/lang/String;", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetLastMessagesShort {

    @NotNull
    private final String batchId;
    private final long time;

    public GetLastMessagesShort(long j, @NotNull String batchId) {
        Intrinsics.h(batchId, "batchId");
        this.time = j;
        this.batchId = batchId;
    }

    public static /* synthetic */ GetLastMessagesShort copy$default(GetLastMessagesShort getLastMessagesShort, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getLastMessagesShort.time;
        }
        if ((i & 2) != 0) {
            str = getLastMessagesShort.batchId;
        }
        return getLastMessagesShort.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    @NotNull
    public final GetLastMessagesShort copy(long time, @NotNull String batchId) {
        Intrinsics.h(batchId, "batchId");
        return new GetLastMessagesShort(time, batchId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLastMessagesShort)) {
            return false;
        }
        GetLastMessagesShort getLastMessagesShort = (GetLastMessagesShort) other;
        return this.time == getLastMessagesShort.time && Intrinsics.c(this.batchId, getLastMessagesShort.batchId);
    }

    @NotNull
    public final String getBatchId() {
        return this.batchId;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.batchId.hashCode() + (Long.hashCode(this.time) * 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |GetLastMessagesShort [\n  |  time: " + this.time + "\n  |  batchId: " + this.batchId + "\n  |]\n  ");
    }
}
