package me.oriient.ipssdk.realtime.utils;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.EmptyResponseError;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.OperationCanceled;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.infra.utils.core.ServerError;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.common.utils.models.WorldCoordinate;
import me.oriient.navigation.common.util.NavigationError;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0011H\u0000¢\u0006\u0004\b\u000f\u0010\u0012\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0013H\u0000¢\u0006\u0004\b\u000f\u0010\u0014\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0015H\u0000¢\u0006\u0004\b\u000f\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "copyOf", "(Ljava/util/Collection;)Ljava/util/Collection;", "", "Ljava/util/TimeZone;", "timeZone", "", "toIos8601WithoutTimezone", "(JLjava/util/TimeZone;)Ljava/lang/String;", "dateString", "dateStringToTimestamp", "(Ljava/lang/String;Ljava/util/TimeZone;)Ljava/lang/Long;", "Lme/oriient/internal/infra/utils/core/OriientError;", "Lme/oriient/ipssdk/api/models/IPSError;", "toIpsError", "(Lme/oriient/internal/infra/utils/core/OriientError;)Lme/oriient/ipssdk/api/models/IPSError;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "(Lme/oriient/internal/services/sensorsManager/SensorManagerError;)Lme/oriient/ipssdk/api/models/IPSError;", "Lme/oriient/positioningengine/common/util/PositioningEngineError;", "(Lme/oriient/positioningengine/common/util/PositioningEngineError;)Lme/oriient/ipssdk/api/models/IPSError;", "Lme/oriient/navigation/common/util/NavigationError;", "(Lme/oriient/navigation/common/util/NavigationError;)Lme/oriient/ipssdk/api/models/IPSError;", "Lme/oriient/internal/services/dataManager/common/WorldCoordinate;", "Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "toSdkWorldCoordinate", "(Lme/oriient/internal/services/dataManager/common/WorldCoordinate;)Lme/oriient/ipssdk/common/utils/models/WorldCoordinate;", "me.oriient.sdk-realtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ExtensionsKt {
    @Keep
    @NotNull
    public static final <T> Collection<T> copyOf(@NotNull Collection<? extends T> collection) {
        Intrinsics.h(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        return arrayList;
    }

    @Nullable
    public static final Long dateStringToTimestamp(@NotNull String dateString, @NotNull TimeZone timeZone) throws ParseException {
        Intrinsics.h(dateString, "dateString");
        Intrinsics.h(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        Date date = simpleDateFormat.parse(dateString);
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    @NotNull
    public static final synchronized String toIos8601WithoutTimezone(long j, @NotNull TimeZone timeZone) {
        String str;
        Intrinsics.h(timeZone, "timeZone");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.g(str, "format(...)");
        return str;
    }

    @NotNull
    public static final IPSError toIpsError(@NotNull OriientError oriientError) {
        Intrinsics.h(oriientError, "<this>");
        if (oriientError instanceof AuthError) {
            return new Error(oriientError.getMessage(), 1, 0);
        }
        if (oriientError instanceof EmptyResponseError ? true : oriientError instanceof InternalError ? true : oriientError instanceof OperationCanceled) {
            return new Error(oriientError.getMessage(), 0, 2);
        }
        return oriientError instanceof ParsingError ? true : oriientError instanceof ServerError ? new Error(oriientError.getMessage(), 7, 1) : new Error(oriientError.getMessage(), 0, 2);
    }

    @NotNull
    public static final WorldCoordinate toSdkWorldCoordinate(@NotNull me.oriient.internal.services.dataManager.common.WorldCoordinate worldCoordinate) {
        Intrinsics.h(worldCoordinate, "<this>");
        return new WorldCoordinate(worldCoordinate.getLatitude(), worldCoordinate.getLongitude(), worldCoordinate.getAltitude());
    }

    @NotNull
    public static final IPSError toIpsError(@NotNull SensorManagerError sensorManagerError) {
        Intrinsics.h(sensorManagerError, "<this>");
        if (sensorManagerError instanceof SensorManagerError.InsufficientHardware) {
            return new Error(sensorManagerError.getMessage(), 9, 2);
        }
        if (sensorManagerError instanceof SensorManagerError.EmptySensorFrame ? true : sensorManagerError instanceof SensorManagerError.SensorsStuck ? true : sensorManagerError instanceof SensorManagerError.NaNSensorFrame ? true : sensorManagerError instanceof SensorManagerError.SensorsFailedToRestart) {
            return new Error(sensorManagerError.getMessage(), 14, 2);
        }
        if (sensorManagerError instanceof SensorManagerError.SensorsFailedToStart) {
            return new Error(sensorManagerError.getMessage(), 14, 1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final IPSError toIpsError(@NotNull PositioningEngineError positioningEngineError) {
        Intrinsics.h(positioningEngineError, "<this>");
        if (positioningEngineError instanceof PositioningEngineError.EngineLibrariesUnavailable) {
            return new Error(positioningEngineError.getMessage(), 15, 2);
        }
        if (positioningEngineError instanceof PositioningEngineError.InvalidOperation ? true : positioningEngineError instanceof PositioningEngineError.EngineCoreError ? true : positioningEngineError instanceof PositioningEngineError.EngineCoreStopped ? true : positioningEngineError instanceof PositioningEngineError.NoModel ? true : positioningEngineError.equals(PositioningEngineError.IOError.INSTANCE) ? true : positioningEngineError.equals(PositioningEngineError.AnalyticsWasNotReceived.INSTANCE) ? true : positioningEngineError instanceof PositioningEngineError.DbError ? true : positioningEngineError.equals(PositioningEngineError.OperationCanceled.INSTANCE) ? true : positioningEngineError instanceof PositioningEngineError.General ? true : positioningEngineError instanceof PositioningEngineError.NoEngine) {
            return new Error(positioningEngineError.getMessage(), 5, 2);
        }
        if (positioningEngineError instanceof PositioningEngineError.EnginePreInitializationNotFinished) {
            return new Error(positioningEngineError.getMessage(), 5, 0);
        }
        if (positioningEngineError.equals(PositioningEngineError.ConnectionLost.INSTANCE) ? true : positioningEngineError instanceof PositioningEngineError.SocketError ? true : positioningEngineError instanceof PositioningEngineError.ServerError) {
            return new Error(positioningEngineError.getMessage(), 7, 1);
        }
        if (positioningEngineError instanceof PositioningEngineError.UnexpectedRecovery ? true : positioningEngineError instanceof PositioningEngineError.DecryptionError ? true : positioningEngineError instanceof PositioningEngineError.ParsingError) {
            return new Error(positioningEngineError.getMessage(), 5, 1);
        }
        if (positioningEngineError.equals(PositioningEngineError.AuthError.INSTANCE)) {
            return new Error(positioningEngineError.getMessage(), 1, 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final IPSError toIpsError(@NotNull NavigationError navigationError) {
        Intrinsics.h(navigationError, "<this>");
        if (navigationError.equals(NavigationError.AuthError.INSTANCE)) {
            return new Error(navigationError.getMessage(), 1, 0);
        }
        if (navigationError instanceof NavigationError.InvalidInputError) {
            return new Error(navigationError.getMessage(), 4, 2);
        }
        if (navigationError.equals(NavigationError.OperationCanceled.INSTANCE) ? true : navigationError instanceof NavigationError.DbError ? true : navigationError instanceof NavigationError.GeneralError ? true : navigationError instanceof NavigationError.InternalError ? true : navigationError.equals(NavigationError.IOError.INSTANCE) ? true : navigationError instanceof NavigationError.ParsingError ? true : navigationError instanceof NavigationError.AlgoCoreError) {
            return new Error(navigationError.getMessage(), 0, 2);
        }
        if (navigationError instanceof NavigationError.ServerError) {
            return new Error(navigationError.getMessage(), 7, 1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
