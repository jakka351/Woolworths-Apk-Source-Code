package me.oriient.internal.services.remoteLog;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "", "allowMeteredNetworks", "", "getAllowMeteredNetworks", "()Z", com.salesforce.marketingcloud.config.a.k, "", "getMaxBatchSize", "()I", "messageSizeLimitBytes", "", "getMessageSizeLimitBytes", "()J", "requireCharger", "getRequireCharger", "retries", "getRetries", "sendingSchedule", "Lme/oriient/internal/services/remoteLog/SendingSchedule;", "getSendingSchedule", "()Lme/oriient/internal/services/remoteLog/SendingSchedule;", "storeSizeLimit", "getStoreSizeLimit", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RemoteLogOptions {
    boolean getAllowMeteredNetworks();

    int getMaxBatchSize();

    long getMessageSizeLimitBytes();

    boolean getRequireCharger();

    int getRetries();

    @NotNull
    SendingSchedule getSendingSchedule();

    int getStoreSizeLimit();
}
