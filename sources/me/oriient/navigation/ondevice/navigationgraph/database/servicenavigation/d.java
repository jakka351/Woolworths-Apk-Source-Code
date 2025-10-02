package me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation;

import com.squareup.sqldelight.Query;
import com.squareup.sqldelight.db.SqlCursor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d extends Query {

    /* renamed from: a, reason: collision with root package name */
    public final String f26335a;
    public final String b;
    public final String c;
    public final /* synthetic */ s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, String buildingId, String floorId, String spaceId, g mapper) {
        super(sVar.c, mapper);
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(mapper, "mapper");
        this.d = sVar;
        this.f26335a = buildingId;
        this.b = floorId;
        this.c = spaceId;
    }

    @Override // com.squareup.sqldelight.Query
    public final SqlCursor execute() {
        return this.d.b.s0(766586045, "SELECT * FROM DbNavGraph WHERE buildingId = ? AND floorId = ? AND spaceId = ? LIMIT 1", 3, new c(this));
    }

    public final String toString() {
        return "NavGraphDatabase.sq:getNavGraph";
    }
}
