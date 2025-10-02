package me.oriient.internal.services.plai.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function9;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u0081\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\n0\u0005\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2Ö\u0001\u0010\f\u001aÑ\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\n0\rH&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&Jù\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u0005\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2Ö\u0001\u0010\f\u001aÑ\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u0002H\n0\rH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\\\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H&¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiProductsQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearProducts", "", "getCustomerTagProducts", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/internal/services/plai/database/DbPlaiProducts;", "buildingId", "", "customerTagId", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function9;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "floorId", "", "x", "y", "confidence", "", "lastUsedScanTimeMillis", "", "regionIds", "regionNames", "getProducts", "removeBuildingProducts", "upsertProducts", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiProductsQueries extends Transacter {
    void clearProducts();

    @NotNull
    Query<DbPlaiProducts> getCustomerTagProducts(@NotNull String buildingId, @NotNull String customerTagId);

    @NotNull
    <T> Query<T> getCustomerTagProducts(@NotNull String buildingId, @NotNull String customerTagId, @NotNull Function9<? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Long, ? super List<String>, ? super List<String>, ? extends T> mapper);

    @NotNull
    Query<DbPlaiProducts> getProducts(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getProducts(@NotNull String buildingId, @NotNull Function9<? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Long, ? super List<String>, ? super List<String>, ? extends T> mapper);

    void removeBuildingProducts(@NotNull String buildingId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertProducts(@NotNull String buildingId, @NotNull String floorId, @NotNull String customerTagId, double x, double y, double confidence, long lastUsedScanTimeMillis, @NotNull List<String> regionIds, @NotNull List<String> regionNames);
}
