package me.oriient.ipssdk.common.services.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J»\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2 \u0001\u0010\u000b\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&JÃ\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052 \u0001\u0010\u000b\u001a\u009b\u0001\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\t0\fH&J\b\u0010\u0017\u001a\u00020\u0003H&J@\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H&¨\u0006\u0019"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacementQueries;", "Lcom/squareup/sqldelight/Transacter;", "deleteForBuilding", "", "buildingId", "", "getAll", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/ipssdk/common/services/database/DBExternalRegionPlacement;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function7;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "features", "vertices", "regionId", "", "shapeType", "entrancesIds", "getForBuilding", "removeAll", "upsert", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DBExternalRegionPlacementQueries extends Transacter {
    void deleteForBuilding(@NotNull String buildingId);

    @NotNull
    Query<DBExternalRegionPlacement> getAll();

    @NotNull
    <T> Query<T> getAll(@NotNull Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends T> mapper);

    @NotNull
    Query<DBExternalRegionPlacement> getForBuilding(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends T> mapper);

    void removeAll();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsert(@NotNull String id, @NotNull String features, @NotNull String vertices, @NotNull String buildingId, @NotNull String regionId, int shapeType, @NotNull String entrancesIds);
}
