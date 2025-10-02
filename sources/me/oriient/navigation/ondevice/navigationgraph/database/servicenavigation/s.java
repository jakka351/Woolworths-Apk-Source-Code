package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.TransacterImpl;
import com.squareup.sqldelight.android.AndroidSqliteDriver;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class s extends TransacterImpl implements me.oriient.navigation.ondevice.navigationgraph.database.b {

    /* renamed from: a, reason: collision with root package name */
    public final u f26350a;
    public final AndroidSqliteDriver b;
    public final List c;
    public final List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u database, AndroidSqliteDriver driver) {
        super(driver);
        Intrinsics.h(database, "database");
        Intrinsics.h(driver, "driver");
        this.f26350a = database;
        this.b = driver;
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
    }

    public final void a(String buildingId, String floorId, String spaceId, int i, String filePath, long j) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(filePath, "filePath");
        this.b.t1(-1250824866, "INSERT OR REPLACE INTO DbNavGraph(buildingId, floorId, mapId, spaceId, mapVersion, filePath, lastReadTimeStampMillis) VALUES (?, ?, \"\", ?, ?, ?, ?)", new q(buildingId, floorId, spaceId, i, filePath, j));
        notifyQueries(-1250824866, new r(this));
    }

    public final void a(long j, String buildingId, String floorId, String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        this.b.t1(1914390536, "UPDATE DbNavGraph SET lastReadTimeStampMillis = ? WHERE buildingId = ? AND floorId = ? AND spaceId = ?", new o(j, buildingId, floorId, spaceId));
        notifyQueries(1914390536, new p(this));
    }

    public final void a(String buildingId, String floorId, String spaceId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        this.b.t1(-1809864781, "DELETE FROM DbNavGraph WHERE buildingId = ? AND floorId = ? AND spaceId = ?", new m(buildingId, floorId, spaceId));
        notifyQueries(-1809864781, new n(this));
    }

    public final void a(String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        this.b.t1(-1032425780, "DELETE FROM DbNavGraph WHERE buildingId = ?", new i(buildingId));
        notifyQueries(-1032425780, new j(this));
    }

    public final void a(long j) {
        this.b.t1(-345504757, "DELETE FROM DbNavGraph WHERE lastReadTimeStampMillis < ?", new k(j));
        notifyQueries(-345504757, new l(this));
    }

    public final void a() {
        this.b.t1(387395903, "DELETE FROM DbNavGraph", null);
        notifyQueries(387395903, new e(this));
    }
}
