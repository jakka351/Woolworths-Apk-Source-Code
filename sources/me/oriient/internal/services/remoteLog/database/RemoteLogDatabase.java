package me.oriient.internal.services.remoteLog.database;

import com.squareup.sqldelight.Transacter;
import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseImplKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "Lcom/squareup/sqldelight/Transacter;", "remoteLogDatabaseQueries", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabaseQueries;", "getRemoteLogDatabaseQueries", "()Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabaseQueries;", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RemoteLogDatabase extends Transacter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase$Companion;", "", "()V", "Schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "getSchema", "()Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "invoke", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SqlDriver.Schema getSchema() {
            return RemoteLogDatabaseImplKt.getSchema(Reflection.f24268a.b(RemoteLogDatabase.class));
        }

        @NotNull
        public final RemoteLogDatabase invoke(@NotNull SqlDriver driver) {
            Intrinsics.h(driver, "driver");
            return RemoteLogDatabaseImplKt.newInstance(Reflection.f24268a.b(RemoteLogDatabase.class), driver);
        }
    }

    @NotNull
    RemoteLogDatabaseQueries getRemoteLogDatabaseQueries();

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ void transaction(boolean z, @NotNull Function1 function1);

    @Override // com.squareup.sqldelight.Transacter
    /* synthetic */ Object transactionWithResult(boolean z, @NotNull Function1 function1);
}
