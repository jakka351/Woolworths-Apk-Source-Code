package me.oriient.internal.services.sensorsManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "backgroundCheckIntervalMillis", "", "getBackgroundCheckIntervalMillis", "()J", "setBackgroundCheckIntervalMillis", "(J)V", "startMonitoring", "", "stopMonitoring", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ForegroundServiceMonitor extends DiProvidable {
    long getBackgroundCheckIntervalMillis();

    void setBackgroundCheckIntervalMillis(long j);

    void startMonitoring();

    void stopMonitoring();
}
