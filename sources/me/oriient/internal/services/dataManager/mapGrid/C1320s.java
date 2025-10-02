package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.database.MapGridQueries;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1320s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapGridRecord f25224a;
    public final /* synthetic */ C1321t b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320s(MapGridRecord mapGridRecord, C1321t c1321t, String str) {
        super(1);
        this.f25224a = mapGridRecord;
        this.b = c1321t;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapGridQueries queries = (MapGridQueries) obj;
        Intrinsics.h(queries, "queries");
        String str = "/maps/" + this.f25224a.getBuildingId() + '/' + this.f25224a.getFloorId() + '/' + this.f25224a.getMapId() + "/mapGrid";
        this.b.c.writeFile(this.b.c.getOrCreateFile(str), this.f25224a.getData());
        queries.upsertMapGrid(this.f25224a.getBuildingId(), this.f25224a.getFloorId(), this.f25224a.getMapId(), this.c, this.f25224a.getEngineVersion(), this.f25224a.getMapVersion(), str, this.f25224a.getTag(), this.f25224a.getVector(), ((TimeProvider) this.b.e.getD()).getCurrentTimeMillis(), this.f25224a.getMajorVersion(), this.f25224a.getType(), this.f25224a.getCreatedBy());
        return Unit.f24250a;
    }
}
