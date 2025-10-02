package me.oriient.internal.services.dataManager.database.internal;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/dataManager/database/DataManagerSqlDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "DbMapGridAdapter", "Lme/oriient/internal/services/dataManager/database/DbMapGrid$Adapter;", "(Lcom/squareup/sqldelight/db/SqlDriver;Lme/oriient/internal/services/dataManager/database/DbMapGrid$Adapter;)V", "getDbMapGridAdapter$internal_publishRelease", "()Lme/oriient/internal/services/dataManager/database/DbMapGrid$Adapter;", "mapGridQueries", "Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl;", "getMapGridQueries", "()Lme/oriient/internal/services/dataManager/database/internal/MapGridQueriesImpl;", "obstaclesQueries", "Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl;", "getObstaclesQueries", "()Lme/oriient/internal/services/dataManager/database/internal/ObstaclesQueriesImpl;", "Schema", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DataManagerSqlDatabaseImpl extends TransacterImpl implements DataManagerSqlDatabase {

    @NotNull
    private final DbMapGrid.Adapter DbMapGridAdapter;

    @NotNull
    private final MapGridQueriesImpl mapGridQueries;

    @NotNull
    private final ObstaclesQueriesImpl obstaclesQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/dataManager/database/internal/DataManagerSqlDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE DbMapGrid (\n    buildingId TEXT NOT NULL,\n    floorId TEXT NOT NULL,\n    mapId TEXT NOT NULL,\n    spaceId TEXT NOT NULL,\n    engineVersion TEXT NOT NULL,\n    mapVersion INTEGER NOT NULL,\n    filePath TEXT NOT NULL,\n    tag BLOB NOT NULL,\n    vector BLOB NOT NULL,\n    lastReadTimeStampMillis INTEGER NOT NULL,\n    gridType TEXT NOT NULL,\n    majorVersion INTEGER NOT NULL,\n    createdBy TEXT NOT NULL,\n    PRIMARY KEY (buildingId, floorId, mapId, spaceId)\n)", null);
            driver.t1(null, "CREATE TABLE DbObstacles (\n    buildingId TEXT NOT NULL,\n    floorId TEXT NOT NULL,\n    mapId TEXT NOT NULL,\n    spaceId TEXT NOT NULL,\n    mapVersion INTEGER NOT NULL,\n    filePath TEXT NOT NULL,\n    lastReadTimeStampMillis INTEGER NOT NULL,\n    PRIMARY KEY (buildingId, floorId, spaceId, mapId)\n)", null);
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
    public DataManagerSqlDatabaseImpl(@NotNull SqlDriver driver, @NotNull DbMapGrid.Adapter DbMapGridAdapter) {
        super(driver);
        Intrinsics.h(driver, "driver");
        Intrinsics.h(DbMapGridAdapter, "DbMapGridAdapter");
        this.DbMapGridAdapter = DbMapGridAdapter;
        this.mapGridQueries = new MapGridQueriesImpl(this, driver);
        this.obstaclesQueries = new ObstaclesQueriesImpl(this, driver);
    }

    @NotNull
    /* renamed from: getDbMapGridAdapter$internal_publishRelease, reason: from getter */
    public final DbMapGrid.Adapter getDbMapGridAdapter() {
        return this.DbMapGridAdapter;
    }

    @Override // me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase
    @NotNull
    public MapGridQueriesImpl getMapGridQueries() {
        return this.mapGridQueries;
    }

    @Override // me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase
    @NotNull
    public ObstaclesQueriesImpl getObstaclesQueries() {
        return this.obstaclesQueries;
    }
}
