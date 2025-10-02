package me.oriient.internal.services.plai.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&JX\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002H\t0\fH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\u000fH&JX\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000f26\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u0002H\t0\fH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiCategoriesStatisticsQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearStatistics", "", "getCategoriesStatistics", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/internal/services/plai/database/DbPlaiCategoriesStatistics;", "buildingId", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "lastUpdatedTimestampMillis", "getExpiredCategoriesStatistics", "timestamp", "removeBuildingCategoriesStatistics", "upsertCategoriesStatistics", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiCategoriesStatisticsQueries extends Transacter {
    void clearStatistics();

    @NotNull
    Query<DbPlaiCategoriesStatistics> getCategoriesStatistics(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getCategoriesStatistics(@NotNull String buildingId, @NotNull Function2<? super String, ? super Long, ? extends T> mapper);

    @NotNull
    Query<DbPlaiCategoriesStatistics> getExpiredCategoriesStatistics(long timestamp);

    @NotNull
    <T> Query<T> getExpiredCategoriesStatistics(long timestamp, @NotNull Function2<? super String, ? super Long, ? extends T> mapper);

    void removeBuildingCategoriesStatistics(@NotNull String buildingId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertCategoriesStatistics(@NotNull String buildingId, long lastUpdatedTimestampMillis);
}
