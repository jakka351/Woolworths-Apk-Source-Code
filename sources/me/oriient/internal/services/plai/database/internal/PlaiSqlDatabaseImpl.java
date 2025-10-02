package me.oriient.internal.services.plai.database.internal;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.plai.database.DbPlaiProducts;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/plai/database/PlaiSqlDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "DbPlaiProductsAdapter", "Lme/oriient/internal/services/plai/database/DbPlaiProducts$Adapter;", "(Lcom/squareup/sqldelight/db/SqlDriver;Lme/oriient/internal/services/plai/database/DbPlaiProducts$Adapter;)V", "getDbPlaiProductsAdapter$internal_publishRelease", "()Lme/oriient/internal/services/plai/database/DbPlaiProducts$Adapter;", "plaiCategoriesQueries", "Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl;", "getPlaiCategoriesQueries", "()Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesQueriesImpl;", "plaiCategoriesStatisticsQueries", "Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl;", "getPlaiCategoriesStatisticsQueries", "()Lme/oriient/internal/services/plai/database/internal/PlaiCategoriesStatisticsQueriesImpl;", "plaiProductsQueries", "Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl;", "getPlaiProductsQueries", "()Lme/oriient/internal/services/plai/database/internal/PlaiProductsQueriesImpl;", "plaiStatisticsQueries", "Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl;", "getPlaiStatisticsQueries", "()Lme/oriient/internal/services/plai/database/internal/PlaiStatisticsQueriesImpl;", "Schema", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlaiSqlDatabaseImpl extends TransacterImpl implements PlaiSqlDatabase {

    @NotNull
    private final DbPlaiProducts.Adapter DbPlaiProductsAdapter;

    @NotNull
    private final PlaiCategoriesQueriesImpl plaiCategoriesQueries;

    @NotNull
    private final PlaiCategoriesStatisticsQueriesImpl plaiCategoriesStatisticsQueries;

    @NotNull
    private final PlaiProductsQueriesImpl plaiProductsQueries;

    @NotNull
    private final PlaiStatisticsQueriesImpl plaiStatisticsQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/plai/database/internal/PlaiSqlDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE DbPlaiCategories (\n    buildingId TEXT NOT NULL,\n    floorId TEXT NOT NULL,\n    categoryName TEXT NOT NULL,\n    categoryId TEXT NOT NULL,\n    bottomLeftX REAL NOT NULL,\n    bottomLeftY REAL NOT NULL,\n    topRightX REAL NOT NULL,\n    topRightY REAL NOT NULL,\n    categoryArea REAL NOT NULL,\n    isAppropriateSize INTEGER NOT NULL,\n    numberOfProductsWithinArea INTEGER NOT NULL,\n    lastUsedScanTimeMillis INTEGER NOT NULL\n)", null);
            driver.t1(null, "CREATE TABLE DbPlaiStatistics (\n    buildingId TEXT NOT NULL,\n    lastUpdatedTimestampMillis INTEGER NOT NULL,\n    PRIMARY KEY (buildingId)\n)", null);
            driver.t1(null, "CREATE TABLE DbPlaiCategoriesStatistics (\n    buildingId TEXT NOT NULL,\n    lastUpdatedTimestampMillis INTEGER NOT NULL,\n    PRIMARY KEY (buildingId)\n)", null);
            driver.t1(null, "CREATE TABLE DbPlaiProducts (\n    buildingId TEXT NOT NULL,\n    floorId TEXT NOT NULL,\n    customerTagId TEXT NOT NULL,\n    x REAL NOT NULL,\n    y REAL NOT NULL,\n    confidence REAL NOT NULL,\n    lastUsedScanTimeMillis INTEGER NOT NULL,\n    regionIds TEXT NOT NULL,\n    regionNames TEXT NOT NULL\n)", null);
            driver.t1(null, "CREATE INDEX indexCategoriesBuildingId ON DbPlaiCategories(buildingId)", null);
            driver.t1(null, "CREATE INDEX indexBuildingIdAndCategoryId ON DbPlaiCategories(buildingId, categoryId)", null);
            driver.t1(null, "CREATE INDEX indexBuildingId ON DbPlaiProducts(buildingId)", null);
            driver.t1(null, "CREATE INDEX indexBuildingIdAndCustomerTagId ON DbPlaiProducts(buildingId, customerTagId)", null);
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public int getVersion() {
            return 1;
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void migrate(@NotNull SqlDriver driver, int oldVersion, int newVersion) {
            Intrinsics.h(driver, "driver");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaiSqlDatabaseImpl(@NotNull SqlDriver driver, @NotNull DbPlaiProducts.Adapter DbPlaiProductsAdapter) {
        super(driver);
        Intrinsics.h(driver, "driver");
        Intrinsics.h(DbPlaiProductsAdapter, "DbPlaiProductsAdapter");
        this.DbPlaiProductsAdapter = DbPlaiProductsAdapter;
        this.plaiCategoriesQueries = new PlaiCategoriesQueriesImpl(this, driver);
        this.plaiCategoriesStatisticsQueries = new PlaiCategoriesStatisticsQueriesImpl(this, driver);
        this.plaiProductsQueries = new PlaiProductsQueriesImpl(this, driver);
        this.plaiStatisticsQueries = new PlaiStatisticsQueriesImpl(this, driver);
    }

    @NotNull
    /* renamed from: getDbPlaiProductsAdapter$internal_publishRelease, reason: from getter */
    public final DbPlaiProducts.Adapter getDbPlaiProductsAdapter() {
        return this.DbPlaiProductsAdapter;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiSqlDatabase
    @NotNull
    public PlaiCategoriesQueriesImpl getPlaiCategoriesQueries() {
        return this.plaiCategoriesQueries;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiSqlDatabase
    @NotNull
    public PlaiCategoriesStatisticsQueriesImpl getPlaiCategoriesStatisticsQueries() {
        return this.plaiCategoriesStatisticsQueries;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiSqlDatabase
    @NotNull
    public PlaiProductsQueriesImpl getPlaiProductsQueries() {
        return this.plaiProductsQueries;
    }

    @Override // me.oriient.internal.services.plai.database.PlaiSqlDatabase
    @NotNull
    public PlaiStatisticsQueriesImpl getPlaiStatisticsQueries() {
        return this.plaiStatisticsQueries;
    }
}
