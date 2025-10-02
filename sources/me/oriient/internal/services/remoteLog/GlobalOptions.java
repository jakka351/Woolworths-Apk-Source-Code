package me.oriient.internal.services.remoteLog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lme/oriient/internal/services/remoteLog/GlobalOptions;", "Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "()V", "allowMeteredNetworks", "", "getAllowMeteredNetworks", "()Z", "setAllowMeteredNetworks", "(Z)V", com.salesforce.marketingcloud.config.a.k, "", "getMaxBatchSize", "()I", "setMaxBatchSize", "(I)V", "messageSizeLimitBytes", "", "getMessageSizeLimitBytes", "()J", "setMessageSizeLimitBytes", "(J)V", "requireCharger", "getRequireCharger", "setRequireCharger", "retries", "getRetries", "setRetries", "sendingSchedule", "Lme/oriient/internal/services/remoteLog/SendingSchedule;", "getSendingSchedule", "()Lme/oriient/internal/services/remoteLog/SendingSchedule;", "setSendingSchedule", "(Lme/oriient/internal/services/remoteLog/SendingSchedule;)V", "storeSizeLimit", "getStoreSizeLimit", "setStoreSizeLimit", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlobalOptions implements RemoteLogOptions {
    private boolean allowMeteredNetworks;
    private int storeSizeLimit = 2000;
    private long messageSizeLimitBytes = 5000;
    private int retries = 10;
    private int maxBatchSize = 100;

    @NotNull
    private SendingSchedule sendingSchedule = g.f25537a;
    private boolean requireCharger = true;

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public int getMaxBatchSize() {
        return this.maxBatchSize;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public long getMessageSizeLimitBytes() {
        return this.messageSizeLimitBytes;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public boolean getRequireCharger() {
        return this.requireCharger;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public int getRetries() {
        return this.retries;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    @NotNull
    public SendingSchedule getSendingSchedule() {
        return this.sendingSchedule;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLogOptions
    public int getStoreSizeLimit() {
        return this.storeSizeLimit;
    }

    public void setAllowMeteredNetworks(boolean z) {
        this.allowMeteredNetworks = z;
    }

    public void setMaxBatchSize(int i) {
        this.maxBatchSize = i;
    }

    public void setMessageSizeLimitBytes(long j) {
        this.messageSizeLimitBytes = j;
    }

    public void setRequireCharger(boolean z) {
        this.requireCharger = z;
    }

    public void setRetries(int i) {
        this.retries = i;
    }

    public void setSendingSchedule(@NotNull SendingSchedule sendingSchedule) {
        Intrinsics.h(sendingSchedule, "<set-?>");
        this.sendingSchedule = sendingSchedule;
    }

    public void setStoreSizeLimit(int i) {
        this.storeSizeLimit = i;
    }
}
