package me.oriient.internal.services.dataManager.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&JÓ\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062 \u0001\u0010\u0010\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u0002H\u000e0\u0011H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J(\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J8\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bH&¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/services/dataManager/database/ObstaclesQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearObstacles", "", "getExpiredObstaclesFilePaths", "Lcom/squareup/sqldelight/Query;", "", "timestamp", "", "getObstacles", "Lme/oriient/internal/services/dataManager/database/DbObstacles;", "buildingId", "floorId", "spaceId", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "mapId", "", "mapVersion", "filePath", "lastReadTimeStampMillis", "removeBuildingObstacles", "removeExpiredObstacles", "removeObstacles", "updateObstaclesReadTimestamp", "upsertObstacles", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ObstaclesQueries extends Transacter {
    void clearObstacles();

    @NotNull
    Query<String> getExpiredObstaclesFilePaths(long timestamp);

    @NotNull
    Query<DbObstacles> getObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId);

    @NotNull
    <T> Query<T> getObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, @NotNull Function7<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super Long, ? extends T> mapper);

    void removeBuildingObstacles(@NotNull String buildingId);

    void removeExpiredObstacles(long timestamp);

    void removeObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void updateObstaclesReadTimestamp(long lastReadTimeStampMillis, @NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId);

    void upsertObstacles(@NotNull String buildingId, @NotNull String floorId, @NotNull String spaceId, int mapVersion, @NotNull String filePath, long lastReadTimeStampMillis);
}
