package me.oriient.ipssdk.common.services.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J|\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2b\u0010\u000b\u001a^\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0084\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052b\u0010\u000b\u001a^\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\t0\fH&J\b\u0010\u0012\u001a\u00020\u0003H&J*\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBExternalRegionQueries;", "Lcom/squareup/sqldelight/Transacter;", "deleteForBuilding", "", "buildingId", "", "getAll", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/ipssdk/common/services/database/DBExternalRegion;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function4;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "metadata", "getForBuilding", "removeAll", "upsert", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DBExternalRegionQueries extends Transacter {
    void deleteForBuilding(@NotNull String buildingId);

    @NotNull
    Query<DBExternalRegion> getAll();

    @NotNull
    <T> Query<T> getAll(@NotNull Function4<? super String, ? super String, ? super String, ? super String, ? extends T> mapper);

    @NotNull
    Query<DBExternalRegion> getForBuilding(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getForBuilding(@NotNull String buildingId, @NotNull Function4<? super String, ? super String, ? super String, ? super String, ? extends T> mapper);

    void removeAll();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsert(@NotNull String id, @NotNull String name, @Nullable String metadata, @NotNull String buildingId);
}
