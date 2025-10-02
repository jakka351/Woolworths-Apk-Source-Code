package me.oriient.internal.infra.utils.android;

import android.os.SystemClock;
import androidx.annotation.Keep;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/infra/utils/android/TimeProviderImpl;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "()V", "currentTimeGmt", "", "getCurrentTimeGmt", "()J", "currentTimeMillis", "getCurrentTimeMillis", "elapsedTimeNano", "getElapsedTimeNano", "timeZoneGmt", "Ljava/util/TimeZone;", "getTimeZoneGmt", "()Ljava/util/TimeZone;", "convertSensorTimeToUnix", "sensorTimeNano", "timeIntervalSinceNow", "timestampMillis", "timeIntervalSinceNowInSeconds", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeProviderImpl implements TimeProvider {

    @NotNull
    private final TimeZone timeZoneGmt;

    public TimeProviderImpl() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.g(timeZone, "getTimeZone(...)");
        this.timeZoneGmt = timeZone;
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public long convertSensorTimeToUnix(long sensorTimeNano) {
        return TimeUnit.MILLISECONDS.toNanos(getCurrentTimeMillis()) + (sensorTimeNano - getElapsedTimeNano());
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public long getCurrentTimeGmt() {
        return Calendar.getInstance(getTimeZoneGmt()).getTimeInMillis();
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public long getElapsedTimeNano() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    @NotNull
    public TimeZone getTimeZoneGmt() {
        return this.timeZoneGmt;
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public long timeIntervalSinceNow(long timestampMillis) {
        return getCurrentTimeMillis() - timestampMillis;
    }

    @Override // me.oriient.internal.infra.utils.core.time.TimeProvider
    public double timeIntervalSinceNowInSeconds(long timestampMillis) {
        return (getCurrentTimeMillis() - timestampMillis) / TimeUnit.SECONDS.toMillis(1L);
    }
}
