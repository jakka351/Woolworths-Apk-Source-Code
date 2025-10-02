package me.oriient.positioningengine.ondevice.calibration.database.servicepositioningengine;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.calibration.database.CalibrationInfoSqlDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibrationInfoSqlDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/positioningengine/ondevice/calibration/database/CalibrationInfoSqlDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/squareup/sqldelight/db/SqlDriver;)V", "calibationInfoSqlDatabaseQueries", "Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibationInfoSqlDatabaseQueriesImpl;", "getCalibationInfoSqlDatabaseQueries", "()Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibationInfoSqlDatabaseQueriesImpl;", "Schema", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CalibrationInfoSqlDatabaseImpl extends TransacterImpl implements CalibrationInfoSqlDatabase {

    @NotNull
    private final CalibationInfoSqlDatabaseQueriesImpl calibationInfoSqlDatabaseQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/positioningengine/ondevice/calibration/database/servicepositioningengine/CalibrationInfoSqlDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE CalibrationRecordTable (\n    timeCreatedInMillis INTEGER NOT NULL,\n    sessionId TEXT NOT NULL,\n    calibrationInfo BLOB NOT NULL,\n    calibrationType INTEGER NOT NULL,\n    PRIMARY KEY (calibrationType)\n)", null);
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
    public CalibrationInfoSqlDatabaseImpl(@NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(driver, "driver");
        this.calibationInfoSqlDatabaseQueries = new CalibationInfoSqlDatabaseQueriesImpl(this, driver);
    }

    @Override // me.oriient.positioningengine.ondevice.calibration.database.CalibrationInfoSqlDatabase
    @NotNull
    public CalibationInfoSqlDatabaseQueriesImpl getCalibationInfoSqlDatabaseQueries() {
        return this.calibationInfoSqlDatabaseQueries;
    }
}
