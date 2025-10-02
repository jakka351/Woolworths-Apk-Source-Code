package me.oriient.ipssdk.common.services.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function14;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&JÐ\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062µ\u0002\u0010\u0007\u001a°\u0002\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00050\bH&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\tH&JØ\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2µ\u0002\u0010\u0007\u001a°\u0002\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00050\bH&J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH&JÞ\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001c2µ\u0002\u0010\u0007\u001a°\u0002\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\u00050\bH&J\b\u0010\u001d\u001a\u00020\u001eH&Jz\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\tH&¨\u0006 "}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBBuildingQueries;", "Lcom/squareup/sqldelight/Transacter;", "getAll", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/ipssdk/common/services/database/DBBuilding;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function14;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "", "rotation", h.a.b, h.a.c, "altitude", "geofence_latitude", "geofence_longitude", "geofence_altitude", "geofenceRadius", "primaryFloorId", "spaceId", "clientBuildingId", "displayName", "getAllForSpace", "getWithIds", "", "removeAll", "", "upsert", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DBBuildingQueries extends Transacter {
    @NotNull
    Query<DBBuilding> getAll();

    @NotNull
    <T> Query<T> getAll(@NotNull Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper);

    @NotNull
    Query<DBBuilding> getAllForSpace(@NotNull String spaceId);

    @NotNull
    <T> Query<T> getAllForSpace(@NotNull String spaceId, @NotNull Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper);

    @NotNull
    Query<DBBuilding> getWithIds(@NotNull Collection<String> id);

    @NotNull
    <T> Query<T> getWithIds(@NotNull Collection<String> id, @NotNull Function14<? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super String, ? super String, ? super String, ? super String, ? extends T> mapper);

    void removeAll();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsert(@NotNull String id, @NotNull String name, double rotation, double latitude, double longitude, double altitude, double geofence_latitude, double geofence_longitude, double geofence_altitude, double geofenceRadius, @NotNull String primaryFloorId, @NotNull String spaceId, @Nullable String clientBuildingId, @NotNull String displayName);
}
