package me.oriient.internal.services.uploadingManager.database.internal;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.uploadingManager.database.UploadingSqlDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/UploadingSqlDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/uploadingManager/database/UploadingSqlDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/squareup/sqldelight/db/SqlDriver;)V", "dbUploadItemQueries", "Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;", "getDbUploadItemQueries", "()Lme/oriient/internal/services/uploadingManager/database/internal/DbUploadItemQueriesImpl;", "Schema", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UploadingSqlDatabaseImpl extends TransacterImpl implements UploadingSqlDatabase {

    @NotNull
    private final DbUploadItemQueriesImpl dbUploadItemQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/internal/UploadingSqlDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE DbUploadItem (\n    id TEXT NOT NULL,\n    sessionId TEXT NOT NULL,\n    dataType TEXT NOT NULL,\n    isLast INTEGER NOT NULL,\n    endReason TEXT,\n    uploadFilename TEXT,\n    uploadingStatus TEXT,\n    bytesCount INTEGER NOT NULL,\n    stopTimeMillis INTEGER NOT NULL,\n    compression TEXT,\n    metadata BLOB NOT NULL,\n    clientMetadata BLOB,\n    shouldBeUploaded INTEGER NOT NULL,\n    PRIMARY KEY (id)\n)", null);
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public int getVersion() {
            return 2;
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void migrate(@NotNull SqlDriver driver, int oldVersion, int newVersion) {
            Intrinsics.h(driver, "driver");
            if (oldVersion > 1 || newVersion <= 1) {
                return;
            }
            driver.t1(null, "ALTER TABLE DbUploadItem ADD COLUMN shouldBeUploaded INTEGER NOT NULL DEFAULT 1", null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadingSqlDatabaseImpl(@NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(driver, "driver");
        this.dbUploadItemQueries = new DbUploadItemQueriesImpl(this, driver);
    }

    @Override // me.oriient.internal.services.uploadingManager.database.UploadingSqlDatabase
    @NotNull
    public DbUploadItemQueriesImpl getDbUploadItemQueries() {
        return this.dbUploadItemQueries;
    }
}
