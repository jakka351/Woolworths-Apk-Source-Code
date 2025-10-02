package me.oriient.internal.services.remoteLog.database.internal;

import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import me.oriient.internal.services.remoteLog.database.RemoteLogDatabase;
import me.oriient.internal.services.remoteLog.database.internal.RemoteLogDatabaseImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "Lkotlin/reflect/KClass;", "Lme/oriient/internal/services/remoteLog/database/RemoteLogDatabase;", "getSchema", "(Lkotlin/reflect/KClass;)Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "newInstance", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteLogDatabaseImplKt {
    @NotNull
    public static final SqlDriver.Schema getSchema(@NotNull KClass<RemoteLogDatabase> kClass) {
        Intrinsics.h(kClass, "<this>");
        return RemoteLogDatabaseImpl.Schema.INSTANCE;
    }

    @NotNull
    public static final RemoteLogDatabase newInstance(@NotNull KClass<RemoteLogDatabase> kClass, @NotNull SqlDriver driver) {
        Intrinsics.h(kClass, "<this>");
        Intrinsics.h(driver, "driver");
        return new RemoteLogDatabaseImpl(driver);
    }
}
