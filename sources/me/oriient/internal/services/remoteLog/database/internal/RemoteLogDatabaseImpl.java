package me.oriient.internal.services.remoteLog.database.internal;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.remoteLog.database.RemoteLogDatabase;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseImpl;", "Lcom/squareup/sqldelight/TransacterImpl;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "(Lcom/squareup/sqldelight/db/SqlDriver;)V", "remoteLogDatabaseQueries", "Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;", "getRemoteLogDatabaseQueries", "()Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseQueriesImpl;", "Schema", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RemoteLogDatabaseImpl extends TransacterImpl implements RemoteLogDatabase {

    @NotNull
    private final RemoteLogDatabaseQueriesImpl remoteLogDatabaseQueries;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/internal/RemoteLogDatabaseImpl$Schema;", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "()V", "version", "", "getVersion", "()I", "create", "", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "migrate", "oldVersion", "newVersion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Schema implements SqlDriver.Schema {

        @NotNull
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // com.squareup.sqldelight.db.SqlDriver.Schema
        public void create(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            driver.t1(null, "CREATE TABLE RemoteLogBatchConfigTable (\n  id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  time INTEGER NOT NULL,\n  retries INTEGER NOT NULL DEFAULT 0,\n  timeToSend INTEGER NOT NULL DEFAULT 0,\n  requireCharger INTEGER NOT NULL DEFAULT 0,\n  allowMeteredNetworks INTEGER NOT NULL DEFAULT 0,\n  PRIMARY KEY (id)\n)", null);
            driver.t1(null, "CREATE TABLE RemoteLogMessagesTable (\n  time INTEGER NOT NULL,\n  message BLOB NOT NULL,\n  batchId TEXT NOT NULL,\n  PRIMARY KEY (time),\n  FOREIGN KEY (batchId) REFERENCES RemoteLogBatchConfigTable(id)\n)", null);
            driver.t1(null, "CREATE INDEX index_batch_id ON RemoteLogBatchConfigTable (id)", null);
            driver.t1(null, "CREATE INDEX index_time ON RemoteLogMessagesTable (time)", null);
            driver.t1(null, "CREATE INDEX index_messages_by_batch_id ON RemoteLogMessagesTable (batchId)", null);
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
            driver.t1(null, "DROP TABLE RemoteLogMessagesTable", null);
            driver.t1(null, "CREATE TABLE RemoteLogBatchConfigTable (\n  id TEXT NOT NULL,\n  url TEXT NOT NULL,\n  time INTEGER NOT NULL,\n  retries INTEGER NOT NULL DEFAULT 0,\n  timeToSend INTEGER NOT NULL DEFAULT 0,\n  requireCharger INTEGER NOT NULL DEFAULT 0,\n  allowMeteredNetworks INTEGER NOT NULL DEFAULT 0,\n  PRIMARY KEY (id)\n)", null);
            driver.t1(null, "CREATE TABLE RemoteLogMessagesTable (\n  time INTEGER NOT NULL,\n  message BLOB NOT NULL,\n  batchId TEXT NOT NULL,\n  PRIMARY KEY (time),\n  FOREIGN KEY (batchId) REFERENCES RemoteLogBatchConfigTable(id)\n)", null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLogDatabaseImpl(@NotNull SqlDriver driver) {
        super(driver);
        Intrinsics.h(driver, "driver");
        this.remoteLogDatabaseQueries = new RemoteLogDatabaseQueriesImpl(this, driver);
    }

    @Override // me.oriient.internal.services.remoteLog.database.RemoteLogDatabase
    @NotNull
    public RemoteLogDatabaseQueriesImpl getRemoteLogDatabaseQueries() {
        return this.remoteLogDatabaseQueries;
    }
}
