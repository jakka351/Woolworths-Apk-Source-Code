package me.oriient.internal.services.remoteLog.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.scheduler.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\b\u0010$\u001a\u00020\u0003H\u0016R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006%"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogBatchConfigTable;", "", "id", "", "url", "time", "", "retries", "", "timeToSend", "requireCharger", "", "allowMeteredNetworks", "(Ljava/lang/String;Ljava/lang/String;JIJZZ)V", "getAllowMeteredNetworks", "()Z", "getId", "()Ljava/lang/String;", "getRequireCharger", "getRetries", "()I", "getTime", "()J", "getTimeToSend", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemoteLogBatchConfigTable {
    private final boolean allowMeteredNetworks;

    @NotNull
    private final String id;
    private final boolean requireCharger;
    private final int retries;
    private final long time;
    private final long timeToSend;

    @NotNull
    private final String url;

    public RemoteLogBatchConfigTable(@NotNull String id, @NotNull String url, long j, int i, long j2, boolean z, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        this.id = id;
        this.url = url;
        this.time = j;
        this.retries = i;
        this.timeToSend = j2;
        this.requireCharger = z;
        this.allowMeteredNetworks = z2;
    }

    public static /* synthetic */ RemoteLogBatchConfigTable copy$default(RemoteLogBatchConfigTable remoteLogBatchConfigTable, String str, String str2, long j, int i, long j2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = remoteLogBatchConfigTable.id;
        }
        if ((i2 & 2) != 0) {
            str2 = remoteLogBatchConfigTable.url;
        }
        if ((i2 & 4) != 0) {
            j = remoteLogBatchConfigTable.time;
        }
        if ((i2 & 8) != 0) {
            i = remoteLogBatchConfigTable.retries;
        }
        if ((i2 & 16) != 0) {
            j2 = remoteLogBatchConfigTable.timeToSend;
        }
        if ((i2 & 32) != 0) {
            z = remoteLogBatchConfigTable.requireCharger;
        }
        if ((i2 & 64) != 0) {
            z2 = remoteLogBatchConfigTable.allowMeteredNetworks;
        }
        int i3 = i;
        long j3 = j;
        return remoteLogBatchConfigTable.copy(str, str2, j3, i3, j2, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRetries() {
        return this.retries;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimeToSend() {
        return this.timeToSend;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getRequireCharger() {
        return this.requireCharger;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    @NotNull
    public final RemoteLogBatchConfigTable copy(@NotNull String id, @NotNull String url, long time, int retries, long timeToSend, boolean requireCharger, boolean allowMeteredNetworks) {
        Intrinsics.h(id, "id");
        Intrinsics.h(url, "url");
        return new RemoteLogBatchConfigTable(id, url, time, retries, timeToSend, requireCharger, allowMeteredNetworks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteLogBatchConfigTable)) {
            return false;
        }
        RemoteLogBatchConfigTable remoteLogBatchConfigTable = (RemoteLogBatchConfigTable) other;
        return Intrinsics.c(this.id, remoteLogBatchConfigTable.id) && Intrinsics.c(this.url, remoteLogBatchConfigTable.url) && this.time == remoteLogBatchConfigTable.time && this.retries == remoteLogBatchConfigTable.retries && this.timeToSend == remoteLogBatchConfigTable.timeToSend && this.requireCharger == remoteLogBatchConfigTable.requireCharger && this.allowMeteredNetworks == remoteLogBatchConfigTable.allowMeteredNetworks;
    }

    public final boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getRequireCharger() {
        return this.requireCharger;
    }

    public final int getRetries() {
        return this.retries;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeToSend() {
        return this.timeToSend;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allowMeteredNetworks) + a.a(this.requireCharger, K.a(this.timeToSend, me.oriient.internal.services.config.a.a(this.retries, K.a(this.time, me.oriient.internal.infra.rest.a.a(this.url, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |RemoteLogBatchConfigTable [\n  |  id: " + this.id + "\n  |  url: " + this.url + "\n  |  time: " + this.time + "\n  |  retries: " + this.retries + "\n  |  timeToSend: " + this.timeToSend + "\n  |  requireCharger: " + this.requireCharger + "\n  |  allowMeteredNetworks: " + this.allowMeteredNetworks + "\n  |]\n  ");
    }
}
