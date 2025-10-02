package me.oriient.internal.services.dataManager.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H&Já\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005\"\b\b\u0000\u0010\u0010*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u009e\u0002\u0010\u0012\u001a\u0099\u0002\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b( \u0012\u0004\u0012\u0002H\u00100\u0013H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\"\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J0\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&Jp\u0010%\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H&¨\u0006&"}, d2 = {"Lme/oriient/internal/services/dataManager/database/MapGridQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearMapGrid", "", "getExpiredMapGridFilePaths", "Lcom/squareup/sqldelight/Query;", "", "timestamp", "", "getMapGrid", "Lme/oriient/internal/services/dataManager/database/DbMapGrid;", "buildingId", "floorId", "mapId", "spaceId", "engineVersion", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function13;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "mapVersion", "filePath", "", "tag", "vector", "lastReadTimeStampMillis", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "gridType", "majorVersion", "createdBy", "removeExpiredMapGrids", "removeMapGrid", "removeMapGrids", "updateMapGridReadTimestamp", "upsertMapGrid", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MapGridQueries extends Transacter {
    void clearMapGrid();

    @NotNull
    Query<String> getExpiredMapGridFilePaths(long timestamp);

    @NotNull
    Query<DbMapGrid> getMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion);

    @NotNull
    <T> Query<T> getMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, @NotNull Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super byte[], ? super byte[], ? super Long, ? super MapGridType, ? super Integer, ? super String, ? extends T> mapper);

    void removeExpiredMapGrids(long timestamp);

    void removeMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId);

    void removeMapGrids(@NotNull String buildingId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void updateMapGridReadTimestamp(long lastReadTimeStampMillis, @NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId);

    void upsertMapGrid(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull String spaceId, @NotNull String engineVersion, int mapVersion, @NotNull String filePath, @NotNull byte[] tag, @NotNull byte[] vector, long lastReadTimeStampMillis, int majorVersion, @NotNull MapGridType gridType, @NotNull String createdBy);
}
