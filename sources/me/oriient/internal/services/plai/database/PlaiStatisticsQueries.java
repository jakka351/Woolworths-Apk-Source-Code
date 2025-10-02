package me.oriient.internal.services.plai.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&JX\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0010\u001a\u00020\rH&JX\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0010\u001a\u00020\r26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\t0\fH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH&¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiStatisticsQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearStatistics", "", "getExpiredStatistics", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/internal/services/plai/database/DbPlaiStatistics;", "timestamp", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "buildingId", "lastUpdatedTimestampMillis", "getStatistics", "removeBuildingStatistics", "upsertStatistics", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiStatisticsQueries extends Transacter {
    void clearStatistics();

    @NotNull
    Query<DbPlaiStatistics> getExpiredStatistics(long timestamp);

    @NotNull
    <T> Query<T> getExpiredStatistics(long timestamp, @NotNull Function2<? super String, ? super Long, ? extends T> mapper);

    @NotNull
    Query<DbPlaiStatistics> getStatistics(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getStatistics(@NotNull String buildingId, @NotNull Function2<? super String, ? super Long, ? extends T> mapper);

    void removeBuildingStatistics(@NotNull String buildingId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertStatistics(@NotNull String buildingId, long lastUpdatedTimestampMillis);
}
