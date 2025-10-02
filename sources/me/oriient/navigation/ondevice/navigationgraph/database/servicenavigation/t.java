package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.db.SqlDriver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class t implements SqlDriver.Schema {

    /* renamed from: a, reason: collision with root package name */
    public static final t f26351a = new t();

    @Override // com.squareup.sqldelight.db.SqlDriver.Schema
    public final void create(SqlDriver driver) {
        Intrinsics.h(driver, "driver");
        driver.t1(null, "CREATE TABLE DbNavGraph (\n    buildingId TEXT NOT NULL,\n    floorId TEXT NOT NULL,\n    mapId TEXT NOT NULL,\n    spaceId TEXT NOT NULL,\n    mapVersion INTEGER NOT NULL,\n    filePath TEXT NOT NULL,\n    lastReadTimeStampMillis INTEGER NOT NULL,\n    PRIMARY KEY (buildingId, floorId, spaceId, mapId)\n)", null);
    }

    @Override // com.squareup.sqldelight.db.SqlDriver.Schema
    public final int getVersion() {
        return 1;
    }

    @Override // com.squareup.sqldelight.db.SqlDriver.Schema
    public final void migrate(SqlDriver driver, int i, int i2) {
        Intrinsics.h(driver, "driver");
    }
}
