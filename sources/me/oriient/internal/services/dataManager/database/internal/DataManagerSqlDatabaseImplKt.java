package me.oriient.internal.services.dataManager.database.internal;

import com.squareup.sqldelight.db.SqlDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import me.oriient.internal.services.dataManager.database.DataManagerSqlDatabase;
import me.oriient.internal.services.dataManager.database.DbMapGrid;
import me.oriient.internal.services.dataManager.database.internal.DataManagerSqlDatabaseImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0006\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"schema", "Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "Lkotlin/reflect/KClass;", "Lme/oriient/internal/services/dataManager/database/DataManagerSqlDatabase;", "getSchema", "(Lkotlin/reflect/KClass;)Lcom/squareup/sqldelight/db/SqlDriver$Schema;", "newInstance", "driver", "Lcom/squareup/sqldelight/db/SqlDriver;", "DbMapGridAdapter", "Lme/oriient/internal/services/dataManager/database/DbMapGrid$Adapter;", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataManagerSqlDatabaseImplKt {
    @NotNull
    public static final SqlDriver.Schema getSchema(@NotNull KClass<DataManagerSqlDatabase> kClass) {
        Intrinsics.h(kClass, "<this>");
        return DataManagerSqlDatabaseImpl.Schema.INSTANCE;
    }

    @NotNull
    public static final DataManagerSqlDatabase newInstance(@NotNull KClass<DataManagerSqlDatabase> kClass, @NotNull SqlDriver driver, @NotNull DbMapGrid.Adapter DbMapGridAdapter) {
        Intrinsics.h(kClass, "<this>");
        Intrinsics.h(driver, "driver");
        Intrinsics.h(DbMapGridAdapter, "DbMapGridAdapter");
        return new DataManagerSqlDatabaseImpl(driver, DbMapGridAdapter);
    }
}
