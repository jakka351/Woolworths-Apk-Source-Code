package me.oriient.ipssdk.common.services.database.sdkcommon;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.services.database.IpsCommonDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/ipssdk/common/services/database/IpsCommonDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/squareup/sqldelight/db/SqlDriver;)V", "dBBuildingQueries", "Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl;", "getDBBuildingQueries", "()Lme/oriient/ipssdk/common/services/database/sdkcommon/DBBuildingQueriesImpl;", "dBEntranceQueries", "Lme/oriient/ipssdk/common/services/database/sdkcommon/DBEntranceQueriesImpl;", "getDBEntranceQueries", "()Lme/oriient/ipssdk/common/services/database/sdkcommon/DBEntranceQueriesImpl;", "dBExternalRegionPlacementQueries", "Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionPlacementQueriesImpl;", "getDBExternalRegionPlacementQueries", "()Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionPlacementQueriesImpl;", "dBExternalRegionQueries", "Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionQueriesImpl;", "getDBExternalRegionQueries", "()Lme/oriient/ipssdk/common/services/database/sdkcommon/DBExternalRegionQueriesImpl;", "dBFloorQueries", "Lme/oriient/ipssdk/common/services/database/sdkcommon/DBFloorQueriesImpl;", "getDBFloorQueries", "()Lme/oriient/ipssdk/common/services/database/sdkcommon/DBFloorQueriesImpl;", "Schema", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class IpsCommonDatabaseImpl extends TransacterImpl implements IpsCommonDatabase {

    @NotNull
    private final DBBuildingQueriesImpl dBBuildingQueries;

    @NotNull
    private final DBEntranceQueriesImpl dBEntranceQueries;

    @NotNull
    private final DBExternalRegionPlacementQueriesImpl dBExternalRegionPlacementQueries;

    @NotNull
    private final DBExternalRegionQueriesImpl dBExternalRegionQueries;

    @NotNull
    private final DBFloorQueriesImpl dBFloorQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/common/services/database/sdkcommon/IpsCommonDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE DBBuilding (\n  id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  rotation REAL NOT NULL,\n  latitude REAL NOT NULL,\n  longitude REAL NOT NULL,\n  altitude REAL NOT NULL,\n  geofence_latitude REAL NOT NULL,\n  geofence_longitude REAL NOT NULL,\n  geofence_altitude REAL NOT NULL,\n  geofenceRadius REAL NOT NULL,\n  primaryFloorId TEXT NOT NULL,\n  spaceId TEXT NOT NULL,\n  clientBuildingId TEXT,\n  displayName TEXT NOT NULL,\n  PRIMARY KEY (id)\n)", null);
            driver.t1(null, "CREATE TABLE DBEntrance(\n  id TEXT NOT NULL,\n  description TEXT NOT NULL,\n  isMain INTEGER NOT NULL,\n  buildingId TEXT NOT NULL,\n  floorId TEXT NOT NULL,\n  x REAL NOT NULL,\n  y REAL NOT NULL,\n  PRIMARY KEY (id),\n  FOREIGN KEY (buildingId) REFERENCES DBBuilding(id)\n)", null);
            driver.t1(null, "CREATE TABLE DBFloor(\n  id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  shortName TEXT,\n  floorOrder INTEGER NOT NULL,\n  buildingId TEXT NOT NULL,\n  mapId TEXT NOT NULL,\n  mapName TEXT NOT NULL,\n  mapUsage TEXT NOT NULL,\n  height REAL DEFAULT 0.0,\n  rotation REAL DEFAULT 0.0,\n  PRIMARY KEY (id),\n  FOREIGN KEY (buildingId) REFERENCES DBBuilding(id)\n)", null);
            driver.t1(null, "CREATE TABLE DBExternalRegionPlacement(\n  id TEXT NOT NULL,\n  features TEXT NOT NULL,\n  vertices TEXT NOT NULL,\n  buildingId TEXT NOT NULL,\n  regionId TEXT NOT NULL,\n  shapeType INTEGER NOT NULL,\n  entrancesIds TEXT NOT NULL,\n  PRIMARY KEY (id),\n  FOREIGN KEY (buildingId) REFERENCES DBBuilding(id),\n  FOREIGN KEY (regionId) REFERENCES DBExternalRegion(id)\n)", null);
            driver.t1(null, "CREATE TABLE DBExternalRegion(\n  id TEXT NOT NULL,\n  name TEXT NOT NULL,\n  metadata TEXT,\n  buildingId TEXT NOT NULL,\n  PRIMARY KEY (id),\n  FOREIGN KEY (buildingId) REFERENCES DBBuilding(id)\n)", null);
            driver.t1(null, "CREATE INDEX buidings_id_index ON DBBuilding(id)", null);
            driver.t1(null, "CREATE INDEX buidings_space_index ON DBBuilding(spaceId)", null);
            driver.t1(null, "CREATE INDEX entrances_buildingId_index ON DBEntrance(buildingId)", null);
            driver.t1(null, "CREATE INDEX floors_buildingId_index ON DBFloor(buildingId)", null);
            driver.t1(null, "CREATE INDEX external_region_placement_placement_buildingId_index ON DBExternalRegionPlacement(buildingId)", null);
            driver.t1(null, "CREATE INDEX external_regions_buildingId_index ON DBExternalRegion(buildingId)", null);
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
    public IpsCommonDatabaseImpl(@NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(driver, "driver");
        this.dBBuildingQueries = new DBBuildingQueriesImpl(this, driver);
        this.dBEntranceQueries = new DBEntranceQueriesImpl(this, driver);
        this.dBExternalRegionQueries = new DBExternalRegionQueriesImpl(this, driver);
        this.dBExternalRegionPlacementQueries = new DBExternalRegionPlacementQueriesImpl(this, driver);
        this.dBFloorQueries = new DBFloorQueriesImpl(this, driver);
    }

    @Override // me.oriient.ipssdk.common.services.database.IpsCommonDatabase
    @NotNull
    public DBBuildingQueriesImpl getDBBuildingQueries() {
        return this.dBBuildingQueries;
    }

    @Override // me.oriient.ipssdk.common.services.database.IpsCommonDatabase
    @NotNull
    public DBEntranceQueriesImpl getDBEntranceQueries() {
        return this.dBEntranceQueries;
    }

    @Override // me.oriient.ipssdk.common.services.database.IpsCommonDatabase
    @NotNull
    public DBExternalRegionPlacementQueriesImpl getDBExternalRegionPlacementQueries() {
        return this.dBExternalRegionPlacementQueries;
    }

    @Override // me.oriient.ipssdk.common.services.database.IpsCommonDatabase
    @NotNull
    public DBExternalRegionQueriesImpl getDBExternalRegionQueries() {
        return this.dBExternalRegionQueries;
    }

    @Override // me.oriient.ipssdk.common.services.database.IpsCommonDatabase
    @NotNull
    public DBFloorQueriesImpl getDBFloorQueries() {
        return this.dBFloorQueries;
    }
}
