package me.oriient.internal.services.plai.database;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.Transacter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function12;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J¬\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0089\u0002\u0010\u000b\u001a\u0084\u0002\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u0002H\t0\fH&J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH&J´\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0089\u0002\u0010\u000b\u001a\u0084\u0002\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u0002H\t0\fH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&Jh\u0010 \u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH&¨\u0006!"}, d2 = {"Lme/oriient/internal/services/plai/database/PlaiCategoriesQueries;", "Lcom/squareup/sqldelight/Transacter;", "clearCategories", "", "getCategories", "Lcom/squareup/sqldelight/Query;", "Lme/oriient/internal/services/plai/database/DbPlaiCategories;", "buildingId", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "mapper", "Lkotlin/Function12;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "floorId", "categoryName", "categoryId", "", "bottomLeftX", "bottomLeftY", "topRightX", "topRightY", "categoryArea", "", "isAppropriateSize", "", "numberOfProductsWithinArea", "", "lastUsedScanTimeMillis", "getCategoryById", "removeBuildingCategories", "upsertCategories", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaiCategoriesQueries extends Transacter {
    void clearCategories();

    @NotNull
    Query<DbPlaiCategories> getCategories(@NotNull String buildingId);

    @NotNull
    <T> Query<T> getCategories(@NotNull String buildingId, @NotNull Function12<? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Boolean, ? super Integer, ? super Long, ? extends T> mapper);

    @NotNull
    Query<DbPlaiCategories> getCategoryById(@NotNull String buildingId, @NotNull String categoryId);

    @NotNull
    <T> Query<T> getCategoryById(@NotNull String buildingId, @NotNull String categoryId, @NotNull Function12<? super String, ? super String, ? super String, ? super String, ? super Double, ? super Double, ? super Double, ? super Double, ? super Double, ? super Boolean, ? super Integer, ? super Long, ? extends T> mapper);

    void removeBuildingCategories(@NotNull String buildingId);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);

    void upsertCategories(@NotNull String buildingId, @NotNull String floorId, @NotNull String categoryName, @NotNull String categoryId, double bottomLeftX, double bottomLeftY, double topRightX, double topRightY, double categoryArea, boolean isAppropriateSize, int numberOfProductsWithinArea, long lastUsedScanTimeMillis);
}
