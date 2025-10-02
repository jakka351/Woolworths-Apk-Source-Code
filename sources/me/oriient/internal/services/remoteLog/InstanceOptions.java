package me.oriient.internal.services.remoteLog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lme/oriient/internal/services/remoteLog/InstanceOptions;", "", "()V", "allowMeteredNetworks", "", "getAllowMeteredNetworks", "()Ljava/lang/Boolean;", "setAllowMeteredNetworks", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", com.salesforce.marketingcloud.config.a.k, "", "getMaxBatchSize", "()Ljava/lang/Integer;", "setMaxBatchSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "messageSizeLimitBytes", "", "getMessageSizeLimitBytes", "()Ljava/lang/Long;", "setMessageSizeLimitBytes", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "requireCharger", "getRequireCharger", "setRequireCharger", "retries", "getRetries", "setRetries", "sendingSchedule", "Lme/oriient/internal/services/remoteLog/SendingSchedule;", "getSendingSchedule", "()Lme/oriient/internal/services/remoteLog/SendingSchedule;", "setSendingSchedule", "(Lme/oriient/internal/services/remoteLog/SendingSchedule;)V", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstanceOptions {

    @Nullable
    private Boolean allowMeteredNetworks;

    @Nullable
    private Integer maxBatchSize;

    @Nullable
    private Long messageSizeLimitBytes;

    @Nullable
    private Boolean requireCharger;

    @Nullable
    private Integer retries;

    @Nullable
    private SendingSchedule sendingSchedule;

    @Nullable
    public final Boolean getAllowMeteredNetworks() {
        return this.allowMeteredNetworks;
    }

    @Nullable
    public final Integer getMaxBatchSize() {
        return this.maxBatchSize;
    }

    @Nullable
    public final Long getMessageSizeLimitBytes() {
        return this.messageSizeLimitBytes;
    }

    @Nullable
    public final Boolean getRequireCharger() {
        return this.requireCharger;
    }

    @Nullable
    public final Integer getRetries() {
        return this.retries;
    }

    @Nullable
    public final SendingSchedule getSendingSchedule() {
        return this.sendingSchedule;
    }

    public final void setAllowMeteredNetworks(@Nullable Boolean bool) {
        this.allowMeteredNetworks = bool;
    }

    public final void setMaxBatchSize(@Nullable Integer num) {
        this.maxBatchSize = num;
    }

    public final void setMessageSizeLimitBytes(@Nullable Long l) {
        this.messageSizeLimitBytes = l;
    }

    public final void setRequireCharger(@Nullable Boolean bool) {
        this.requireCharger = bool;
    }

    public final void setRetries(@Nullable Integer num) {
        this.retries = num;
    }

    public final void setSendingSchedule(@Nullable SendingSchedule sendingSchedule) {
        this.sendingSchedule = sendingSchedule;
    }

    @NotNull
    public String toString() {
        return "InstanceOptions(messageSizeLimitBytes=" + this.messageSizeLimitBytes + ", retries=" + this.retries + ", maxBatchSize=" + this.maxBatchSize + ", sendingSchedule=" + this.sendingSchedule + ", requireCharger=" + this.requireCharger + ", allowMeteredNetworks=" + this.allowMeteredNetworks + ')';
    }
}
